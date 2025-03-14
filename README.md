#### **TASK**

W jednym projekcie wykonaj następujące zadania.  
1. Utwórz klasę z metodą main, która zgłasza obiekt klasy `Exception` wewnątrz bloku try. Przekaż  
parametr tekstowy konstruktorowi obiektu typu `Exception`. Przechwyć wyjątek wewnątrz sekcji  
`catch` i wypisz przekazany tekst. Dodaj sekcję `finally` i wyświetl wiadomość, aby pokazać, że  
sekcja została wykonana.  
2. Utwórz własną klasę wyjątków. Napisz dla tej klasy konstruktor przyjmujący parametr typu  
`String` i zapamiętujący ten parametr wewnątrz obiektu. Napisz metodę, która wyświetla  
zapamiętany łańcuch. Utwórz blok `try-catch`, aby wypróbować nowy wyjątek.  
3. Napisz klasę z metodą, która zgłasza wyjątek stworzony w zadaniu nr 2. Spróbuj go  
skompilować bez specyfikacji wyjątku. Dodaj odpowiednią specyfikację wyjątku. Wypróbuj  
swoją klasę i jej wyjątki wewnątrz bloku `try-catch`.  
4. Zdefiniuj odwołanie do obiektu i zainicjalizuj je na `null`. Spróbuj, używając tego odwołania,  
wywołać metodę. Następnie opakuj ten kod w blok `try-catch`, aby przechwycić wyjątek. Jaki to  
typ wyjątku?  
5. Utwórz klasę z metodami `f` i `g`. W `g` zgłoś wyjątek nowego, zdefiniowanego przez Ciebie typu.  
W metodzie `f` wywołaj metodę `g`, przechwyć jej wyjątki i w sekcji `catch` zgłoś inny nowy  
zdefiniowany przez Ciebie wyjątek. Przetestuj kod w `main`.  
6. **NIE ROBIMY** Powtórz powyższe zadanie, lecz tym razem w klauzuli `catch` umieść wyjątek zgłoszony przez metodę `g` wewnątrz wyjątku typu `RutnimeException`. Co zauważyłeś?
7. Stwórz trzy nowe typy wyjątków. Napisz klasę z metodą, która zgłasza wszystkie trzy.  
W metodzie `main` wywołaj tę metodę, ale użyj pojedynczej sekcji `catch`, która przechwyci  
wszystkie trzy typy wyjątków.  
8. Napisz kod generujący i przechwytujący wyjątek typu `ArrayIndexOutOfBoundException`.  
9. Stwórz własny kod wznawiający wykonanie, używając pętli `while`, która jest powtarzana,  
dopóki wyjątek nie przestanie być zgłaszany.  
10. Stwórz trójpoziomową hierarchię wyjątków. Następnie stwórz klasę bazową `A` z metodą, która  
zgłasza wyjątek będący podstawą hierarchii. Odziedzicz `B` z `A` i przeciąż metodę tak, żeby  
zgłaszała wyjątek na drugim poziomie hierarchii. Powtórz, to dziedzicząc `C` z `B`. W `main`  
utwórz obiekt klasy `C` i zrzutuj go do `A`, a następnie wywołaj metodę. Co zauważyłeś?  
11. Pokaż, że konstruktor klasy pochodnej nie może przechwytywać wyjątków zgłaszanych przez  
konstruktor klasy bazowej.  
12. Zmodyfikuj zadanie nr 7 poprzez dodanie sekcji `finally`. Sprawdź, czy sekcja `finally` jest  
wykonywana nawet wtedy, gdy zgłaszany jest wyjątek `NullPointerException`.

---

```
=== Zadanie 1 ===
Przechwycono wyjątek: Wystąpił wyjątek.
Blok finally został wykonany.

=== Zadanie 2 ===
Mój wyjątek: To jest mój wyjątek.

=== Zadanie 3 ===
Mój wyjątek: Wyjątek rzucony z metody.

=== Zadanie 4 ===
Przechwycono NullPointerException: Cannot invoke "String.length()" because "str" is null

=== Zadanie 5 ===
Przechwycono SecondException: 2 wyjątek wywołany przez 1szy.

=== Zadanie 7 ===
Testowanie wartości: -5
Przechwycono wyjątek: wyjątek A -> wartość ujemna
Testowanie wartości: 0
Przechwycono wyjątek: wyjątek B -> wartość zero
Testowanie wartości: 7
Przechwycono wyjątek: wyjątek C -> wartość dodatnia

=== Zadanie 8 ===
Przechwycono ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

=== Zadanie 9 ===
Próba 1: Błąd, próbujemy ponownie...
Próba 2: Błąd, próbujemy ponownie...
Operacja zakończona sukcesem.

=== Zadanie 10 ===
Złapano wyjątek: Wyjątek w klasie C

=== Zadanie 11 ===
Konstruktor klasy Base
Złapano wyjątek w main: Wyjątek w konstruktorze klasy Base

=== Zadanie 12 ===
Testowanie wartości: -5
Przechwycono wyjątek: wyjątek A -> wartość ujemna
Sekcja finally została wykonana.
Testowanie wartości: 0
Przechwycono wyjątek: wyjątek B -> wartość zero
Sekcja finally została wykonana.
Testowanie wartości: 7
Przechwycono wyjątek: wyjątek C -> wartość dodatnia
Sekcja finally została wykonana.
```
