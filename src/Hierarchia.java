class AException extends Exception {
    public AException(String message) {
        super(message);
    }
}

class BException extends AException {
    public BException(String message) {
        super(message);
    }
}

class CException extends BException {
    public CException(String message) {
        super(message);
    }
}

class A {
    public void throwException() throws AException {
        throw new AException("Wyjątek w klasie A");
    }
}

class B extends A {
    @Override
    public void throwException() throws AException {
        throw new BException("Wyjątek w klasie B");
    }
}

class C extends B {
    @Override
    public void throwException() throws AException {
        throw new CException("Wyjątek w klasie C");
    }
}

class Hierarchia {
    public static void main(String[] args) {
        try {
            A a = new C();
            a.throwException();
        } catch (AException e) {
            System.out.println("Złapano wyjątek: " + e.getMessage());
        }
    }
}
