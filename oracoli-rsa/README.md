# Oracoli RSA — CTF Challenge Suite

Questo piccolo progetto contiene 5 livelli di difficoltà progressiva.  
Ogni livello propone un oracolo RSA, pensato come server di una sfida CTF (Capture The Flag).  
Ogni livello è focalizzato su una diversa vulnerabilità o proprietà dell'algoritmo RSA.  

## 🚀 Come Provare le Challenge

```sh
docker-compose build --no-cache             # build all containers
docker-compose up                           # starts all servers

nc localhost 2001                           # PORT = 2000 + level

docker-compose down -v --remove-orphans     # stops and removes all containers
docker system prune -a --volumes            # final cleaning
```

## 🔐 Elenco delle Challenge

[Livello 1](./level1/) - [Livello 2](./level2/) - [Livello 3](./level3/) - [Livello 4](./level4/) - [Livello 5](./level5/)