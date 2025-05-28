# Livello 2

## 🤖 Comportamento

L'oracolo permette di **cifrare** e **decifrare**.  
**Non permette di decifrare il cifrato della flag**.  
**Non consente di decifrare un cifrato se risulterebbe un multiplo di un messaggio già decifrato in precedenza**.

## 🧩 Interazione

E' possibile interagire da terminale.  

```sh
nc localhost 2002       # Terminal Interaction
```

E' anche fornito uno script di soluzione.  

```sh
python3 exploit.py      # Scripted Interaction
```

## 📐 Giustificazione Matematica della Vulnerabilità

encrypt(a)^2 = encrypt(a^2) = a^{2e}   
encrypt(a)^2 - encrypt(a^2) = k * n   

Soluzione: flag = decrypt(encrypt(flag) * p^-1) * decrypt(p) 