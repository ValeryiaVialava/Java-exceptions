public class Main {
    public static void main(String[] args) {
        // Wywołanie każdego zadania w odpowiedniej kolejności
        System.out.println("=== Zadanie 1 ===");
        Zadanie1.main(args);

        System.out.println("\n=== Zadanie 2 ===");
        TestMyException.main(args);

        System.out.println("\n=== Zadanie 3 ===");
        TestExceptionThrower.main(args);

        System.out.println("\n=== Zadanie 4 ===");
        NullPointerTest.main(args);

        System.out.println("\n=== Zadanie 5 ===");
        TestExceptionChain.main(args);

        System.out.println("\n=== Zadanie 7 ===");
        TestMultiException.main(args);

        System.out.println("\n=== Zadanie 8 ===");
        ArrayIndexTest.main(args);

        System.out.println("\n=== Zadanie 9 ===");
        RetryExceptionTest.main(args);

        System.out.println("\n=== Zadanie 10 ===");
        Hierarchia.main(args);

        System.out.println("\n=== Zadanie 11 ===");
        Zadanie11.main(args);

        System.out.println("\n=== Zadanie 12 ===");
        TestMultiExceptionWithFinal.main(args);
    }
}
