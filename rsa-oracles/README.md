# RSA Oracles — CTF Challenge Suite

Questo piccolo progetto contiene 5 livelli di difficoltà progressiva.  
Ogni livello propone un oracolo RSA, pensato come server di una sfida CTF (Capture The Flag).  
Ogni livello è focalizzato su una diversa vulnerabilità o proprietà dell'algoritmo RSA.  

## 🚀 Come Provare le Challenge

```sh
docker-compose build    # build all containers
docker-compose up       # starts all servers
docker-compose down     # stops and removes all containers

nc localhost 2001       # PORT = 2000 + level
```

## 🔐 Elenco delle Challenge

[Level 1](./level1/) - [Level 2](./level2/) - [Level 3](./level3/) - [Level 4](./level4/) - [Level 5](./level5/)