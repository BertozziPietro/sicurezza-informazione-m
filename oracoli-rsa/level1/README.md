# Livello1 1

## 🤖 Comportamento

L'oracolo permette di **cifrare** e **decifrare**.  
**Non permette di decifrare il cifrato della flag**.  

## 🧩 Interazione

E' possibile interagire da terminale.  

```sh
nc localhost 2001       # Terminal Interaction
```

E' anche fornito uno script di soluzione.  

```sh
python3 exploit.py      # Scripted Interaction
```

## 📐 Giustificazione Matematica della Vulnerabilità

Omomorfismo Moltiplicativo: encrypt(a) * encrypt(b) = encrypt (a * b) 

Soluzione: flag = decrypt(encrypt(flag) * encrypt(2)) / 2 