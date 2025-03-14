
class Base {
    public Base() throws Exception {
        System.out.println("Konstruktor klasy Base");
        // symulacja błędu
        throw new Exception("Wyjątek w konstruktorze klasy Base");
    }
}

class Derived extends Base {
    public Derived() throws Exception {
        super();
        // tutaj nie możemy przechwycić wyjątku z konstruktora klasy bazowej Base
        System.out.println("Konstruktor klasy Derived");
    }
}

public class Zadanie11 {
    public static void main(String[] args) {
        try {
            Derived derived = new Derived(); // próba stworzyć obiekt klasy Derived, który wywoła konstruktor klasy Base
        } catch (Exception e) {
            System.out.println("Złapano wyjątek w main: " + e.getMessage());
        }
    }
}