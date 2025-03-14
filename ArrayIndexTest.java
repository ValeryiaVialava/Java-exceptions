class ArrayIndexTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        try {
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Przechwycono ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}