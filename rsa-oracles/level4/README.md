# Livello 4

## 🤖 Comportamento

L'oracolo permette di **cifrare** e **decifrare**.  
**Non permette di decifrare il cifrato della flag**.  
**Non consente di decifrare un cifrato se risulterebbe un multiplo di un messaggio già decifrato in precedenza**.  
**Sono disponibili al massimo 3 richieste**.

## 🧩 Interazione

E' possibile interagire da terminale.  

```sh
nc localhost 2004       # Terminal Interaction
```

E' anche fornito uno script di soluzione.  

```sh
python3 exploit.py      # Scripted Interaction
```

## 📐 Giustificazione Matematica della Vulnerabilità
 
encrypt(-1) = n -1 
n = encrypt(-1) + 1 

Soluzione: flag = decrypt(flag * 2) * pow(decrypt(2), -1, n)  