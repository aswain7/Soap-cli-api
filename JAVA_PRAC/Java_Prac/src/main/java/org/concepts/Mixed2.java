package org.concepts;

class TestDataException extends RuntimeException {
    TestDataException(String message) {
        super(message);
    }
}

public class Mixed2 {
    public static void main(String[] args) {
        String username = null;

        if (username == null) {
            throw new TestDataException("Username missing ok");
        }
    }
}
