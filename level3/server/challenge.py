#!/usr/bin/env python3

import signal
import socket
from Crypto.PublicKey import RSA
from Crypto.Util.number import *
from random import randint
import os

FLAG = os.getenv("FLAG3", "CTF{this-is-a-default-flag-the-real-one-is-missing}")
PORT = 2003
TIMEOUT = 300

rsa = RSA.generate(1024)
flag_encrypted = pow(bytes_to_long(FLAG.encode()), rsa.e, rsa.n)
used = [bytes_to_long(FLAG.encode())]

def encrypt(m):
    return pow(m, rsa.e, rsa.n)

def decrypt(c):
    return pow(c, rsa.d, rsa.n)

def handle(conn):
    def send(msg):
        conn.sendall(msg.encode())

    def recv():
        data = conn.recv(4096)
        if not data:
            raise EOFError("Client disconnected")
        return data.decode().strip()

    send("================================================================================\n")
    send("=                      RSA Encryption & Decryption oracle                      =\n")
    send("=                                Find the flag!                                =\n")
    send("================================================================================\n\n")
    send("Encrypted flag: {}\n".format(flag_encrypted))

    for _ in range(5):
        send("\nChoice:\n  [0] Exit\n  [1] Encrypt\n  [2] Decrypt\n\n> ")
        try:
            choice = recv()
        except EOFError:
            break

        if choice == '0':
            send("Goodbye!\n")
            break

        elif choice == '1':
            m = int(input('\nPlaintext > ').strip())
            used.append(m)
            send('\nEncrypted: ' + str(encrypt(m)))

        elif choice == '2':
            c = int(input('\nCiphertext > ').strip())
            if c == flag_encrypted:
                send("Wait. That's illegal.")
            else:
                m = decrypt(c)
                if any([m % no == 0 for no in used]):
                    send("Wait. That's illegal.")
                    break
                else:
                    send('\nDecrypted: ' + str(m))

        else:
            send("Invalid choice. Goodbye!\n")
            break

def main():
    signal.alarm(TIMEOUT)

    s = socket.socket()
    s.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
    s.bind(("0.0.0.0", PORT))
    s.listen(1)

    print(f"[+] Listening on port {PORT}...")
    conn, addr = s.accept()
    print(f"[+] Connection from {addr} opened")

    try:
        handle(conn)
    except Exception as e:
        print(f"[-] Error: {e}")
    finally:
      conn.close()
      print(f"[+] Connection from {addr} closed")

if __name__ == "__main__":
    main()
