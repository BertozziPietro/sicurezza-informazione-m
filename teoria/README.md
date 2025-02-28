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

## Trasformaizoni per la sicurezza

1. Qual è la differenza tra crittografia e crittoanalisi?
   
   La crittografia si occupa di progettare algoritmi sicuri per proteggere informazioni, mentre la crittoanalisi studia metodi per attaccare questi sistemi e violare la sicurezza.

2. Cosa si intende per modello a canale insicuro?
   
   Il modello a canale insicuro assume che il canale di comunicazione tra sorgente e destinatario possa essere compromesso da un attaccante. Questo significa che un intruso può intercettare, modificare o bloccare i messaggi trasmessi. Tuttavia, si presume che sorgente e destinatario siano sicuri. Per proteggere i dati in questo scenario, si utilizzano tecniche come la crittografia, la firma digitale e le funzioni hash crittografiche per garantire autenticità, integrità e riservatezza delle comunicazioni.

3. Qual è la differenza tra autenticazione e autenticità?
   
   L’autenticazione riguarda la verifica dell’identità di un’entità (es. utente, sistema, servizio), assicurandosi che sia chi dice di essere. Questo può essere ottenuto tramite password, certificati digitali o sistemi biometrici.
   L’autenticità, invece, si riferisce alla verifica dell’origine di un dato, garantendo che provenga realmente dalla fonte dichiarata e che non sia stato alterato. L’autenticità può essere garantita tramite firme digitali o funzioni hash crittografiche.

4. Perché l’analisi del rischio è importante per la sicurezza informatica?
   
   L’analisi del rischio permette di identificare le vulnerabilità di un sistema e di valutare l’impatto di potenziali attacchi. Senza questa analisi, un’azienda potrebbe investire risorse in protezioni inutili o trascurare minacce critiche. Le fasi principali includono la mappatura degli asset, la valutazione dei rischi e la definizione di contromisure adeguate. Inoltre, con le nuove normative, anche le piccole aziende devono adottare strategie di gestione del rischio per proteggere dati sensibili e infrastrutture.

5. Perché è necessaria la ridondanza nella codifica o nel tempo per garantire la sicurezza?
   
   La ridondanza è fondamentale perché molte trasformazioni per la sicurezza richiedono informazioni aggiuntive per funzionare correttamente. Ad esempio, nella codifica, un messaggio può includere dati extra per rilevare modifiche o errori, come negli hash crittografici o nei codici di autenticazione. Nel tempo, alcune operazioni richiedono calcoli più complessi per garantire un livello di sicurezza maggiore, come nella crittografia a chiave pubblica. Senza ridondanza, sarebbe difficile verificare l’integrità, autenticare i dati o proteggere le informazioni da attacchi.

6. Qual è il ruolo delle funzioni hash crittografiche nella sicurezza?
   
   Le funzioni hash crittografiche trasformano un messaggio in un’impronta digitale univoca e a lunghezza fissa, utile per garantire integrità e autenticità. Una buona funzione hash deve essere resistente alle collisioni (difficile trovare due input con lo stesso hash) e irreversibile (impossibile risalire all’input originale dall’hash). Sono impiegate in molte applicazioni, come la verifica dell’integrità dei file, l’archiviazione sicura delle password e la firma digitale.

7. In cosa si differenzia una firma digitale da un semplice hash del messaggio?
   
   Un semplice hash garantisce solo l’integrità, permettendo di verificare che un messaggio non sia stato modificato, ma non identifica chi lo ha generato. La firma digitale, invece, aggiunge autenticità e non ripudiabilità, in quanto utilizza la crittografia asimmetrica: il mittente firma il messaggio con la propria chiave privata e il destinatario può verificarne l’origine con la chiave pubblica. Questo assicura che il messaggio provenga effettivamente dal mittente e non possa essere negato in seguito.

8. Come si possono definire le funzioni encrypt, decrypt, hash, sign e verify?
   
   - Encrypt (Cifratura): Trasforma un messaggio in un formato illeggibile per chi non possiede la chiave corretta. Usato per garantire riservatezza.
   
   - Decrypt (Decifratura): Operazione inversa di encrypt, riporta il messaggio cifrato al suo stato originale.
   
   - Hash(Impronta): Funzione unidirezionale che produce un'impronta digitale di un dato. Serve per integrità e firma digitale.
   
   - Sign (Firma): Usa una chiave privata per generare una firma digitale che autentica un messaggio.
   
   - Verify (Verifica): Controlla una firma digitale con la chiave pubblica per accertarne la validità.

9. Cosa sono le funzioni unidirezionali e pseudo-unidirezionali?
   
   - Unidirezionali: Funzioni matematiche facili da calcolare in una direzione, ma difficili da invertire senza informazioni segrete. Sono quindi difficilmente invertibili ma facili da calcolare Sono usate nella crittografia per garantire sicurezza (es. funzioni hash, crittografia asimmetrica).
   
   - Pseudo-unidirezionali: Funzioni che sembrano unidirezionali ma possono essere invertite in determinate condizioni, ad esempio con l'uso di un attacco crittografico o un'operazione aggiuntiva. Appare quindi come unidirezionale per chiunque non sia in possesso di una particolare informazione sulla sua costruzione.

10. Cosa si intende con hash resistente alle collisioni?
    
    Un hash è resistente alle collisioni se è difficile trovare due input diversi che producono lo stesso output. Tipologie:
    
    - Preimage resistance: Dato un hash H, non si deve poter trovare il messaggio originale M.
    
    - Second preimage resistance: Dato M1 e il suo hash H1, non si deve poter trovare M2 con lo stesso H1.
    
    - Collision resistance: Non si devono poter trovare due messaggi M1 e M2 che generano lo stesso hash H.

11. In che senso l'identificazione avviene in real-time?
    
    L'identificazione è valida solo nell'istante in cui viene effettuata. Il verificatore e il verificato devono essere online e il processo deve essere veloce per evitare disservizi (flasi negativi) e chiaramente evitare violazioni della sicurezza (falsi positivi).

12. Quali sono le fasi dell'identificazione?
    
    - Registrazione: l'utente si registra presso il sistema fornendo informazioni che saranno utilizzate per l'identificazione futura. Normalmente viene memorizzato un hash di questa informazione.
    
    - Dichiarazione: l'utente si presenta al sistema e dichiara la propria identità. Questa non è una prova sufficiente.
    
    - Interrogazione: il sistema invia una sfida all'utente per verificarne l'identità; deve essere sicuro rpima di concedere l'autenticazione e le conseguenti autorizzazioni.
    
    - Dimostrazione: l'utente fornisce la prova della propria identità. Ci possono essere diverse implementazioni: password, token, opt, dati biometrici. C'è un forte legame tra el informazioni della registrazione e quelle della dimostrazione.

13. Con quali informazioni ci si identifica?
    
    Tre categorie principali:
    
    - Conoscenza: Qualcosa che solo l'utente conosce (password, PIN).
    
    - Possesso: Qualcosa che l'utente possiede (smart card, token).
    
    - Conformità: Caratteristiche uniche dell'utente che può essere comportamentale o biologica (impronta digitale, riconoscimento facciale).

14. Come si può garantire un'informazione segreta?
    
    - Macchina segreta: Hardware specializzato (non scalabile e poco certificabile).
    
    - Algoritmo segreto: Algoritmo non noto (difficile da mantenere sicuro nel tempo).
    
    - Parametro segreto: Algoritmo noto con chiave segreta (soluzione migliore per sicurezza e affidabilità).

15. Qual è la differenza tra cifrari simmetrici e asimmetrici?
    
    - Simmetrici: Usano la stessa chiave per cifrare e decifrare (es. AES). Veloci ed efficienti, sono ideali per garantire riservatezza nelle comunicazioni.
    
    - Asimmetrici: Usano una coppia di chiavi pubblica/privata (es. RSA, Diffie-Hellman). Più lenti rispetto ai cifrari simmetrici, sono particolarmente utili per autenticazione e scambio sicuro di chiavi.

16. Quali possono essere gli attacchi al segreto?
    
    - Indovinare: Attacco a forza bruta o con dizionario.
    
    - Intercettare: Sniffing di dati in transito.
    
    - Deducere: Analisi statistica e crittografica.

17. Come funziona l'attacco a forza bruta?
    
    Si provano tutte le combinazioni possibili della chiave fino a trovare quella corretta. La sicurezza aumenta con la lunghezza della chiave (oggi >128 bit è sicuro). Per questo motivo le password troppo corte non sono considerate sicure. Gli attacchi a forza bruta sono spesso affiancati da un dizionario, e sono quindi capaci trovare le chiavi che sono sono state generate casualmente. Per questo le password che hanno un significato per chi le genera sono generalmente considerate non sicure.

18. Come si possono classificare gli attacchi di deduzione e qual è la misura preventiva generale?
    
    - Attacco con solo testo cifrato: l'attaccante conosce il linguaggio del messagio.
    
    - Attacco con testo in chiaro noto: l'attaccante conosce il cifrato corrispondente.
    
    - Attacco con testo in chiaro scelto: l'attaccante conosce il cifrato corrispondente.
    
    - Attacco con testo cifrato scelto: l'attaccante conosce il messaggio corrispondente.
    
    La contromisura per eccellenza è assicurarsi che l'uscita di un algoritmo crittografico appaia come una variabile aleatoria che assume con eguale probabilità tutti i suoi possibili valori.

19. Perchè la procedura di recovery è fondamentale e quali possono essere i problemi per la sicurezza?
    
    E' fondamentale perchè gli utenti possono dimenticare le credenziali di accesso e, senza un metodo di recupero, potrebbero perdere l'accesso ai loro account in modo permanente. Tuttavia si introducono vulnerabilità di sicurezza: attacchi di ingegneria sociale, email compromesse, domande di sicurezza deboli, repupero via SMS non sicuro ed altro. Per mitigare questi rischi si possono adottare misure di sicurezza vanzate come l'autenticaizone a due fattori (MFA), notifiche di recupero e limite sui tentativi di reset, oppure dei cooldown time.

20. Cosa si intende con complessità di un algoritmo?
    
    La complessità di un algoritmo può essere misurata secondo diversi indicatori: memoria occupata, memoria necessaria per l'esecuzione e tempo di esecuzione. Il tempo di esecuzione è generalemnte considerato il più importante, specialmente per crittografi e crittoanalisti.

21. Come si utilizza la notazione O-grande?
    
    La notazione O-grande serve a descrivere il comportamente asintotico di un algoritmo; si considera solo il temrine che cresce più velocemente (ignorando i temrini di ordine inferiore) e si assume il caso peggiore in input per garantire un limite superiore. Quando la funzione non è esprimibile analiticamente si fa riferimento ad una funzione, esprimibile analiticamente che la approssima.

22. Cosa si intende con funzione facile e con funzione difficile?
    
    Le funzioni facili, sono risolvibili da un algoritmo polinomiale su una macchina Turing deterministica. In caso contrario, la funzione è difficile. Da notare che, seppure estramamente improbabile, è possibile che una funzione difficile diventi facile, si trova un nuovo e migliore algoritmo per risolverla. 

23. Come ci si comporta sapendo che il tempo di esecuzione dipende dall'architettura?
    
    Si possono utilizzare come unità di misura gli anniMIPS (anni impiegati da una macchina che esegue un milione di istruzion al secondo). Chiaramente con l'evolvere della tecnologia uno stesso algoritmo ha diverso tempo di esecuzione in MIPS (Legge di Moore e parallelismo). Per esempio, oggi con n = 128 bit di un segreto, questo è indovinabile in $10^{34} anniMIPS$, mentre nel 2000 con n = 88 bit di un segreto, questo era indovinabile in $10^{12} anniMIPS$. In alternativa si può abbandonare il concetto di tempo e valutare il numero di operazioni elementari in funzione di n, ottenendo una misura indipendente dall’hardware. In quel caso è chiaro che un attacco brtute force ha sempre tempo di esecuzione $2^n$.

24. E' quindi sempre una buona idea, in crittofrafia, aumentare il numero di bit dei segreti oltre il necessario?
    
    No. Sacrificare l'efficienza in questo modo è un errore. Inoltre l'approccio conservativo obbliga ad una scelta consapevole, sempre aumentare il numero di bit compete ad una progettazione superficiale.

## Sicurezza dei Dati

1. Come funziona il protocollo sicuro su macchina sicura con 3 livelli di sicurezza?
   
   Prima di tutto si deve inserire un passphrase, tendenzialmente abbastanza lunga, di vui viene immediatamente fatta l'impronta. In un sistema PBE (Password Based Encryption) questa impronta è utilizzata per cifrare e decifrare la masterkey. La masterkey è unica nel sistema è viene memorizzata in forma cifrata, e decifrata sono al momento del bisogno. L'informazione iniziale che viene cifrata per ottenere la masterkey è di natura casuale grazie ad un PRNG (il cui seme è generato da un vero RNG). Lo PRNG genera anche altri valori all'occorrenza, da cui poi poter ricavare le chiavi utilizzate per cifrare i messaggi. Idealmente si usa una chiave diversa per ogni file e queste chiavi vengono cifrate tutte dalla masterkey. sia le singole chiavi che i messaggi sono salvati in forma cifrata e decifrati sono all'occorrenza. Il terzo livello di sicurezza migliora la resistenza agli attacchi brute force e l'efficienza, evitando di abusare di algoritmi com PBKDF2 o Argon2, tendenzialmente lenti. Infine, migliora la gestione della passphrease, che si può quindi cabiare senza dover ricifrare ogni chiave, ricifrando solo la masterkey.

2. Cosa sono i RNG e in cosa differiscono dai PRNG?
   
   I Random Number Generator sono generatori di numeri casuali completamente imprevediabili ed irriproducibili, non sono periodici (nel limite del possibile) perchè la fonte del rumore è fisica: decadimenti radiottivi, rumore termico, turbolenza di fluidi (si possono usare anche segnali da apparati elettronici o programmi di estrazione di rumore dal funionamento del computer). Gli PseudoRNG al contrario sono algoritmo deterministici e per questo hanno un periodo finito e sono prevedibili e riproducibili. Sono anche più efficienti.

3. Cosa significa casuale e cosa significa imprevedibile?
   
   Un generatore è casuale se i numeri generati seguono una distribuzione uniforme, senza pattern evidenti, mentre è imprevedibile se, anche conoscendo tutti i numeri precedenti, il prossimo numero non può essere determinato cocn certezza. I PRNG sono sempre casuali ma normalmente prevedibili.

4. Quali sono i test statistici per accertare la casualità di un generatore?
   
   - Monobit Test: n_0 circa uguale ad n_1.
   
   - Pocker Test: una sequenza di bit di lunghezza data è uniforme.
   
   - Run Test: lunghezza delle sequenze consecutive in linea con la distribuzione uniforme.
   
   - Long Run Test: non ci sono sequenze troppo lunghe dello stesso valore.
   
   - Autocorrelazione: non ci sono differenze dopo lo shift.
   
   - Test TDF: i numeri trasformati non seguono una distribuzione nota.
   
   - Test di Compressione: la sequenza non si può comprimere troppo.

5. Cosa rende un PRNG crittograficamente sicuro?
   
   Oltre chiaramente ad essere casuale, deve essere anche imprevedibile e deve essere impossibile dedurre il seme. Per accertare l'imprevedibilità dell'uscita si utilizza il next-bit text; dati L bit della stringa d'uscita non deve esistere un algoritmo polinomiale in grado di predire il bit L+1-esimo con probabilità > 0,5. La funzione che genera i bit dipendono quindi da una funzione unidirezionale ovvero difficile da invertire. IN sostanza l'imprevedibilità richiesta ad un PRNG non è da intendersi in termini assoluti; si richiede che sia impossibile per un attaccante dedurre il prossimo bit in tempi ragionevoli. Infine deve essere impossibile dedurre il seme, anche conoscendo molti elementi (OW function).



da sistemare guardare capire slide 12 circa cap1 e la fine del cap 2 su hash e firma digitale e ripudiabilità.
