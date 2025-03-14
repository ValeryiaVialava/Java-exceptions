class ExceptionThrower {
    public void throwMyException() throws MyException {
        throw new MyException("Wyjątek rzucony z metody.");
    }
}

class TestExceptionThrower {
    public static void main(String[] args) {
        ExceptionThrower et = new ExceptionThrower();
        try {
            et.throwMyException();
        } catch (MyException e) {
            e.showMessage();
        }
    }
}
