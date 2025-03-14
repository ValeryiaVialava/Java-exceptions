class FirstException extends Exception {
    public FirstException(String message) {
        super(message);
    }
}

class SecondException extends Exception {
    public SecondException(String message) {
        super(message);
    }
}

class ExceptionChain {
    public void g() throws FirstException {
        throw new FirstException("1szy wyjątek");
    }

    public void f() throws SecondException {
        try {
            g();
        } catch (FirstException e) {
            throw new SecondException("2 wyjątek wywołany przez 1szy.");
        }
    }
}

class TestExceptionChain {
    public static void main(String[] args) {
        ExceptionChain ec = new ExceptionChain();
        try {
            ec.f();
        } catch (SecondException e) {
            System.out.println("Przechwycono SecondException: " + e.getMessage());
        }
    }
}
