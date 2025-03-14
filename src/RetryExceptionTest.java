class RetryExceptionTest {
    public static void main(String[] args) {
        int index = 0;
        while (true) {
            try {
                index++;
                if (index < 3) {
                    throw new Exception("Błąd, próbujemy ponownie...");
                }
                System.out.println("Operacja zakończona sukcesem.");
                break;
            } catch (Exception e) {
                System.out.println("Próba " + index + ": " + e.getMessage());
            }
        }
    }
}
