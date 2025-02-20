# Sicurezza dell'Informazione M

Anno Accademico 2024/2025    Prof.ssa Rebecca Montanari    Autore Pietro Bertozzi

## Introduzione

1. Perchè il Morris Worm ha stravolto la cybersecurity?
   
   E' stato il primo worm su larga scala a diffondersi su Arpanet (predecessore di Internet) e ha dimostrato concretamente la vulnerabilità dei sistemi distribuiti connessi in rete. Ha introdotto il concetto di attacco autonomo; ovvero capace di propagarsi da solo e questo ha aperto la strada allo sviluppo di malware autoreplicanti come i worm moderni e i botnet. In risposta al Worm è stato creato il primo CERT (Computer Emergency Response Team). Ha evidenziato la necessità di introdurre leggi sulla difesa digitale, prima inesistenti.

2. Cosa sono i CERT e i CIRT?
   
   Il primo CERT è nato nel 1988 dopo il Morris Worm, con il compito di coordinare la risposta agli incidenti di sicurezza informatica a livello nazionale e internazionale. Oggi i CERT sono spesso istituzionali (governativi o universitari) e si concentrano su minacce globali. I CIRT sono simili ai CERT, ma di solito operano all'interno di aziende private o organizzazioni specifiche, gestendo la sicurezza interna e rispondendo agli attacchi informatici mirati. I primi sono orientati alla ricerca sulle minaccie mentre i secondi si concentrano sulla risposta immediata, contenendo le minaccie e mitigando i danni.

3. Oggi, si potrebbero ancora fare gli esperimenti condotti da Morris?
   
   No. Il conflitto tra ricerca libera e sicurezza nazionale si manifesta quando le università conducono esperimenti su virus e vulnerabilità su Internet. Da un lato, la ricerca accademica mira a esplorare e migliorare la sicurezza informatica, ma dall'altro, la pubblicazione di certe scoperte potrebbe fornire strumenti agli attaccanti. Questo solleva preoccupazioni su come bilanciare la libertà di ricerca con la protezione della sicurezza nazionale e la responsabilità nell'esporre vulnerabilità.

4. Come è cambiata la superficie di attacco negli ultimi decenni?
   
   Dopo il 1988, con l'espansione delle reti distribuite e l'incremento dell'uso di Internet, la superficie di attacco nella sicurezza informatica è aumentata notevolmente. Mentre prima le minacce erano principalmente concentrate su singoli sistemi o reti, l'interconnessione di dispositivi, server, cloud e applicazioni ha amplificato le potenzialità per gli attaccanti di sfruttare vulnerabilità. Questo ha reso necessario un cambiamento di paradigma nella sicurezza, passando da un approccio centrato sulla protezione di singoli endpoint a uno incentrato su difese distribuite e multilivello. C'è stata complessivamente una balcanizzazione dei perimetri.

5. Il perimetro dell'Italia, in questi termini, fin dove si estende?
   
   Le università italiane saranno coinvolte nel Perimetro di Sicurezza Nazionale Cibernetica (PSN) con il Piano Italia Digitale 2026, integrando la cybersecurity nelle loro infrastrutture e nei sistemi informatici. Saranno chiamate a rispettare le normative sulla protezione dei dati e a collaborare con le autorità per garantire la sicurezza delle reti e dei servizi digitali. Questo implica un rafforzamento delle misure di sicurezza, l'adozione di tecnologie avanzate e una stretta collaborazione con enti pubblici e privati per proteggere le informazioni sensibili e supportare l'innovazione digitale.

6. Cos'è Zerodium?
   
   Zerodium è una società che acquista vulnerabilità zero-day (bug non ancora scoperti o divulgati) da ricercatori e le rivende a governi e agenzie di intelligence. Il loro obiettivo principale è garantire che queste vulnerabilità vengano utilizzate per scopi di sicurezza nazionale, come il monitoraggio delle minacce e la protezione contro attacchi informatici. Tuttavia, le implicazioni etiche sono complesse. L'acquisto e la vendita di vulnerabilità potrebbero consentire ad attori maligni di sfruttare le stesse vulnerabilità prima che vengano corrette, mettendo a rischio la sicurezza di milioni di utenti. Inoltre, la mancanza di trasparenza riguardo l'uso finale di queste vulnerabilità solleva preoccupazioni sui diritti civili e sulla privacy.

7. Quale è il legame tra intelligenza artificciale e sicurezza informatica?
   
   L'AI sta trasformando la sicurezza informatica, migliorando sia gli attacchi che le difese. Da un lato, gli attaccanti possono utilizzare l'AI per automatizzare e rendere più sofisticati attacchi, come il phishing o l'individuazione di vulnerabilità. Dall'altro lato, l'AI potenzia le difese, migliorando il rilevamento di minacce e la risposta automatizzata agli incidenti. Tuttavia, i modelli di AI stessi sono vulnerabili, poiché possono essere manipolati o ingannati da attacchi adversariali, che sfruttano debolezze nei dati di addestramento o nei processi di decisione dell'AI.

8. "Security is a Process, not a product" cosa significa?
   
   Bruce Schneier intende dirci che la sicurezza informatica non è qualcosa che si può ottenere acquistando un singolo software o dispositivo, ma è un processo continuo che richiede aggiornamenti, monitoraggio e miglioramento costante. E' una caratteristica di come si lavora e non del risultato finale.

9. Cosa indica l'acronimo CIA (Confidentiality, Integrity, Availability)?
   
   Indica riservatezza, integrità e disponibilità. Sono le tre proprietà fondamentali da difendere. La riservatezza garantisce che i dati siano accessibili solo a persone o sistemi autorizzati. Esempi di misure per la riservatezza includono crittografia, autenticazione a più fattori (MFA) e controllo degli accessi. L'integrità assicura che i dati non vengano alterati, modificati o distrutti in modo non autorizzato. Questo viene garantito con meccanismi come checksum, hashing, firme digitali e controlli di accesso. La disponibilità indica che i dati e i sistemi devono essere sempre accessibili agli utenti autorizzati. Per garantire la disponibilità, si usano soluzioni come bilanciamento del carico, backup, protezione DoS e sistemi di failover.

10. Quali sono i diversi livelli di astrazione che devono essere studiati dalla sicurezza informatica?
    
    Sicurezza a livello HW, FW, SW sia in termini id programmi che in termini di sistema operativo. Ma anche Sicurezza dei dati e sicurezza delle reti. In questo corso ci occuperemo principalmente di questi ultimi.

11. Come si concretizza la mancata salvaguardia delle diverse proprietà fondamentali ai diversi livelli di astrazione delle macchine?
    
    | Vulnerabilità         | Assenza di Confidenzialità | Assenza di Integrità             | Assenza di Disponibilità             |
    | --------------------- | -------------------------- | -------------------------------- | ------------------------------------ |
    | **Hardware**          | individuazione, furto      | aggiunta, modifica, eliminazione | arresto, impedimento                 |
    | **Software/Firmware** | individuazione             | modifica, falsificazione         | eliminazione, rallentamento, arresto |
    | **Dati**              | lettura                    | modifica, falsificazione         | perdita, cancellazione               |

12. Quali definizioni sono necessarie come premesse allo studio della sicurezza informatica?
    
    - Vulnerabilità: Una debolezza in un sistema, dettata da un errore umano o intrinseca, che determina una minaccia.
    
    - Minaccia: atto ostile che sfruttando una vulnerabilità, causa un danno. Può essere intenzionale (azione mirante a compromettere una proprietà critica della informaizone) o accidentale (errore umano, guasto hardware). In questo corso ci concentriamo sulle minaccie intenzionali.
    
    - Attacco: Un'azione concreta che sfrutta una vulnerabilità per realizzare una minaccia.
    
    - Contromisura: azione, dispositivo, procedura o tecnica che consente di rimuovere o di ridurre una vulnerabilità.
    
    In sintesi: una vulnerabilità può essere sfruttata da una minaccia tramite un attacco, e una contromisura serve a proteggere il sistema.

13. Quali sono le categorie di attacchi principali in rete?
    
    - IP soofing o shadow server: si usa l'host di qualcun altro, sostituendosi a lui.
    
    - packet sniffing: si leggono password di accesso o dati riservati.
    
    - connection hijacking o data spoofing: si inseriscono o modificano dati durante il loro trasferimento in rete.
    
    - (distributed) denial of service comunemente detto (D)DOS.

14. Quali sono alcuni tipici attacchi alivello applicativo?
    
    - Buffer overflow: permette l’esecuzione di codice arbitrario iniettato tramite un input appropriatamente manipolato.
    
    - Memorizzaizone di informaizoni sensibili nei cookies: leggibili da terzi (in transito o localmente sul client).
    
    - Memorizzaizone delle password in chiaro in un DB: leggibili da terzi (es. l’operatore del backup).
    
    - Invenzione artigianale di un sistema di protezione: rischio di protezione inadeguata (se sbagliano i grandi figuriamoci cosa combinano i non esperti ...).

15. Quali sono i tipici Virus e Worm?
    
    - Virus: particolari malware che provocano danni e si replicano propagati dagli umani (anche inconsapevolmente).
    
    - Worm: particolari malware che provocano danni perchè si autoreplicano automaticamente saturando le risorse.
    
    - Trojan (horse): vettore di malware, contiene funzioanlità aggiuntive complesse.
    
    - Backdoor: punto di accesso non autorizzato.
    
    - Rootkit: strumenti per accesso privilegiato, nascosti ed invisibili.

16. Quale può essere un esempio di vulnerabilità intrinseca delle reti quale minaccia le corrisponde?
    
    Il SYN flooding è un tipo di attacco di tipo DoS (Denial of Service) che sfrutta il processo di handshake del protocollo TCP. In un attacco SYN flooding, l'attaccante invia una grande quantità di pacchetti SYN (che iniziano una connessione TCP) a un server di destinazione, ma non completa mai l'handshake inviando il pacchetto ACK finale. Questo causa il riempimento della tabella di connessioni parziali del server, esaurendo le risorse e impedendo la connessione di utenti legittimi. L'attacco è difficile da rilevare, perché il traffico sembra legittimo, ma l'obiettivo è esaurire le risorse del server o del sistema target.

17. Cosa è il modello di minaccia?
    
    Il modello di minaccia (Threat Model) è un processo utilizzato in cybersecurity per identificare, analizzare e mitigare potenziali minacce a un sistema, applicazione o rete con l'obiettivo di comprendere le vulnerabilità e sviluppare contromisure per ridurre i rischi prima che possano essere sfruttati dagli attaccanti. Scegliere ed implementare correttamente le contromisure più adatte (in senso ampio) caratterizza un buon ingegnere del settore.

18. Come si classificano le contromisure?
    
    Si dividono in contromisure di prevenzione, rilevazione, reazione e deviazione. SI deve sempre tener presente che ogni contromisura ha un costo e degli effetti negativi.

19. Quali sono gli strumenti che permettono l'effettiva messa in pratica delle misure di sicurezza?
    
    Gli strumenti sono tecnologici, strumenti di policy; in termini di regole principi e procedure, ma sono essenziali anche gli strumenti di educazione.

20. Su cosa si concentra questo corso? E cosa invece non è approfondito?
    
    Il focus del corso riguarda i modelli, le tecnologie e le infrastrutture per garantire la sicurezza dei dati (memorizzazione sicura, trasmissione sicura su rete e accesso autenticato e autorizzato). Non verrà approfonditi né le strategie di penetration testing, né i sistemi operativi sicuri, né la progettazione di programmi sicuri. Si sorvolerà anche su rilevamento di malware e hardware sicuro e di analisi del rischio.

21. Le proprietà CIA sono esaustive?
    
    No, ci sono anche altre priorità che possono essere anche fondamentali a sconda del contesto.  Eccone un breve elenco:
    
    - L'autenticaizone della controparte: la verifica dell' identità dell'utente nell’accesso ad un sistema e del peer durante la comunicazione attraverso reti pubbliche.
    
    - Non Ripudio: l'impossibilità di disconoscere la paternità di messaggio, e dualmente, l'impossibilità di attribuire erroneamente la paternità dello stesso.
    
    - Controllo degli accessi: sistemi di protezione che permettono la granilarità dei permessi.
    
    - Tracciabilità: la possibilità di consultare documenti chiari dai quali si può capire la storia del sistema enfatizzando gli eventi rilevanti dal punto di vista della sicurezza dello stesso.

22. Quali sono i concetti chiave dello studio dell'analisi del rischio?
    
    - Analisi del contesto
    
    - Analisi del sistema informatico
    
    - Classificazione degli utenti
    
    - Definizione dei diritti di accesso
    
    - Catalogazione degli eventi indesiderati
    
    - Valutaizone del rischio ($rischio = probabilità * danno$)
    
    - Individuazione delle contromisure
    
    - Integraizone delle contromisure

23. Come si realizza un calcolatore sicuro?
    
    L'accesso ad ogni risorsa HW e SW di un sistema informatico e la sua modalità d'uso devono essere regolamentati; le autorizzazioni concesse ad un utente non devono poter essere usate da altri (mandatory vs. discretional access control).
    
    Sono possibili 3 approcci:
    
    - progetto integrato HW e SW basato su trusted computer platform (Fritz+Nexus)
    
    - Funzioni e regole di sicurezza su estensioni del SO (Unix, se Linux)
    
    - Coprocessore per la sicurezza

24. Cosa distingue i meccanismi di sicurezza dai servizi di sicurezza?
    
    - Meccanismo di sicurezza: meccanismo progettato per rilevare, prevenire un attacco, risanare il sistema a seguito di un attacco.
    
    - Servizio di sicurezza: servizio che migliora la sicurezza dell'elaboraizone dei dati e del trasferimento delle informazioni. Un servizio di sicurezza utilizza uno o più meccanismi.

25. Come le diverse proprietà possono essere invalidate?
    
    Osservando gli attacchi dal punto di vista dei canali, si possono distinguere:
    
    - attacchi alla disponibilità si realizza con una interruzione
    
    - attacchi alla confidenzialità si realizza con una intercettazione.
    
    - attacchi alla integrità si realizza con una modifica.
    
    - attacchi alla autenticità si reliazza con una fabbricazione.
    
    Da notare che tutti gli attacchi citati sono considerati attacchi attivi, a condizione dell'intercettaizone. 
    Il controllo del canale è sempre una idea vincente per chi si occupa di sicurezza.
    Per difendersi dagli attacchi passivi è efficace usare una rappresentazione incomprensibile dell'informaizone, mentre per difendersi dagli attacchi attivi si utilizzano attestati di integrità e di origine.
