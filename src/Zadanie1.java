public class Zadanie1 {
    public static void main(String[] args) {
        try {
            throw new Exception("Wystąpił wyjątek.");
        } catch (Exception e) {
            System.out.println("Przechwycono wyjątek: " + e.getMessage());
        } finally {
            System.out.println("Blok finally został wykonany.");
        }
    }
}
