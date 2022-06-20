## Verbessern Sie das Exception-Handling

Im package `better_try_catch` finden Sie die Klasse `BetterTryCatchMain`, in der
verschiedene Methoden der Klasse `MyFunctions` aufgerufen werden.

Erklären Sie, warum das dort implementierte  Exception-Handling nicht gut ist und
verbessern Sie es.


## Checked vs. unckecked Exceptions

Erklären Sie den Unterschied zwischen checked und unchecked Exceptions.

Im Folgenden werden verschiedene Exceptions beschrieben. Erklären Sie, ob diese
jeweils "checked" oder "unchecked" sein sollten.

*   `IntNotBetweenException` soll geworfen werden, wenn ein Integer-Parameter nicht
    im definierten Wertebereich liegt.
*   `NoPicturesFoundException` soll geworfen werden, wenn in einem übergebenen
    Verzeichnis keine Bilddateien gefunden werden konnten.
*   `NotAPrimeNumberException` soll geworfen werden, wenn eine vom User eingegebene
    Zahl keine Primzahl ist.


## Freigeben von Ressourcen

Im Package `finally_resources` finden Sie die Klasse `MyResource`.

Rufen Sie die Methode `MyResource#doSomething` auf, im Anschluss müssen Sie **immer**
die Methode `MyResource#close` aufrufen.

1.  Zeigen Sie den Aufruf mit `try-catch-finally`.
2.  Verändern Sie die Vorgaben so, dass Sie den Aufruf mit der "try-with-resources"-Technik
    ausführen können.


## Where to catch?

Erklären Sie, wann und wo eine Exception gefangen und bearbeitet werden sollte.

Im Package `where_to_catch` finden Sie die Klasse `JustThrow`. Alle Methoden in der Klasse
 werfen aufkommende Exceptions bis zur `main` hoch.

Verändern Sie die Vorgaben so, dass die Exceptions an den passenden Stellen gefangen und
sinnvoll bearbeitet werden. Begründen Sie Ihre Entscheidungen.
