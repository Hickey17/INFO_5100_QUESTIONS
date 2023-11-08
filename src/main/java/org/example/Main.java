package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.protectedMethod();
        testClass.privateMethod();

    }
}

class TestClass{
    private void privateMethod(){
        System.out.println("private method run successfully!");
    }

    protected void protectedMethod(){
        System.out.println("protected method run successully!");
    }
}