package com.maven.testing;


public class JavaHelloWorldTest {

    public void testGetHelloWorld() {


        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();

        assert("Hello World".equals(javaHelloWorld.getHello()));
    }
}