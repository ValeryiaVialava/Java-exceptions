class TestMultiExceptionWithFinal {
    public static void main(String[] args) {
        MultiExceptionThrower met = new MultiExceptionThrower();
        int[] testValues = {-5, 0, 7};

        for (int value : testValues) {
            try {
                System.out.println("Testowanie wartości: " + value);
                met.throwExceptions(value);
            } catch (Exception e) {
                System.out.println("Przechwycono wyjątek: " + e.getMessage());
            } finally {
            System.out.println("Sekcja finally została wykonana.");
            }
        }
    }
}
