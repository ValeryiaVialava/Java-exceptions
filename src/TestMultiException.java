class ExceptionA extends Exception {
    public ExceptionA(String message) {
        super(message);
    }
}

class ExceptionB extends Exception {
    public ExceptionB(String message) {
        super(message);
    }
}

class ExceptionC extends Exception {
    public ExceptionC(String message) {
        super(message);
    }
}

class MultiExceptionThrower {
    public void throwExceptions(int value) throws ExceptionA, ExceptionB, ExceptionC {
        if (value < 0) {
            throw new ExceptionA("wyjątek A -> wartość ujemna");
        } else if (value == 0) {
            throw new ExceptionB("wyjątek B -> wartość zero");
        } else {
            throw new ExceptionC("wyjątek C -> wartość dodatnia");
        }
    }
}

class TestMultiException {
    public static void main(String[] args) {
        MultiExceptionThrower met = new MultiExceptionThrower();
        int[] testValues = {-5, 0, 7};

        for (int value : testValues) {
            try {
                System.out.println("Testowanie wartości: " + value);
                met.throwExceptions(value);
            } catch (Exception e) {
                System.out.println("Przechwycono wyjątek: " + e.getMessage());
            }
        }
    }
}
