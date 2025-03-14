class MyException extends Exception {
    private String message;

    public MyException(String message) {
        super(message);
        this.message = message;
    }

    public void showMessage() {
        System.out.println("Mój wyjątek: " + message);
    }
}

class TestMyException {
    public static void main(String[] args) {
        try {
            throw new MyException("To jest mój wyjątek.");
        } catch (MyException e) {
            e.showMessage();
        }
    }
}