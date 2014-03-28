### Thread and Locks

#### Day 1 Mutual Exclusion and Memory Models

Source code is available in [day1](./day1) subfolder.

This is the first step in concurrency. We learned how to create basic thread and avoid common mistake : race conditions, deadlock and memomry visibility.


#### Day 1 : Self study

##### Find

William Pugh's Java Merory Model Website : http://www.cs.umd.edu/~pugh/java/memoryModel/

Acquaint yourself with the JSR 133 (Java Memory Model FAQ) : http://www.cs.umd.edu/~pugh/java/memoryModel/jsr-133-faq.html

What guarantees does the Java Memory Model make regarding initialization safety? Is it always necessary to use locks to safely publish objects between threads?

In french : Quels sont les garanties que le Modèle de Mémoire Java fait en ce qui concerne la sécurité à l'initialisation? Est-il toujours nécessaire d'utiliser des verrous pour publier en toute sécurité des objets entre les threads?

* Find in http://www.cs.umd.edu/~pugh/java/memoryModel/jsr-133-faq.html : A new guarantee of initialization safety should be provided. If an object is properly constructed (which means that references to it do not escape during construction), then all threads which see a reference to that object will also see the values for its final fields that were set in the constructor, without the need for synchronization.

Une nouvelle garantite de sécuritié à l'initiation devrait être fournie. Si un objet est correctement construit (ce qui signifie que ses références ne sont pas échappés durant sa construction), alors tous les threads qui voient une référence à cet objet verront aussi les valeurs pour ses champs finaux qui ont été définies dans le constructeur, sans avoir besoin de synchronisation.


What is the *double-checked locking* anti-pattern? Why is it an anti-pattern? (Qu'est ce que l'anti-pattern *verrouillage à double test*? Pourquoi est-ce un antipattern?)

* Check Wikipedia : http://fr.wikipedia.org/wiki/Double-checked_locking and chapter Mysterious Memory


##### Do :

