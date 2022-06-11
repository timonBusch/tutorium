# Lambda und Methoden Referenzen

In der Klasse `PflanzenSort` finden vier Methoden, in denen eine Liste von Pflanzen sortiert werden
soll. Die Listen sollen mit mithilfe der `List#sort` Methode sortiert werden. Nutzen Sie Lambda-Ausdrücke
und Methoden Referenzen um da benötigte `Comparable` Objekt zur verfügung zu stellen.

1. Nutzen Sie Lambda-Ausdrücke die Listen zu sortieren
2. Implementieren Sie die Methode `static int compareByZustand(Pflanze a, Pflanze b)`.<br>
   Die Rückgabewerte sollen analog zu [`Comparator#compare`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Comparator.html#compare(T,T))
   wobei `GESUND` > `WELK` sein soll

Überprüfen Sie in einer Main Klasse, ob die Listen richtig sortiert worden sind.

