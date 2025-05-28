# Level 3

## 🤖 Comportamento

L'oracolo permette di **cifrare** e **decifrare**.  
**Non permette di decifrare il cifrato della flag**.  
**Non consente di decifrare un cifrato se risulterebbe un multiplo di un messaggio già decifrato in precedenza**.
**Sono disponibili al massimo 4 richieste**.

## 🧩 Interazione

E' possibile interagire da terminale.  

```sh
nc localhost 2003       # Terminal Interaction
```

E' anche fornito uno script di soluzione.  

```sh
python3 exploit.py   # Scripted Interaction
```

## 📐 Giustificazione Matematica della Vulnerabilità

$ e = 65537 $ 

Soluzione: 

$ n = gcd(3^e - encrypt(3), 5^e - encrypt(5)) $
$ flag = decrypt(encrypt(flag) * p^-1) * decrypt(p) $