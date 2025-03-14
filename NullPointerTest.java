// NullPointerException występuje, gdy próbujemy odwołać się do metody/pola obiektu, który ma wartość null
class NullPointerTest {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Przechwycono NullPointerException: " + e.getMessage());
        }
    }
}
