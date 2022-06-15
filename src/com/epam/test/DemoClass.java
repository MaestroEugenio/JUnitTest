package com.epam.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class DemoClass {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(JUnitClass.class); //pide como parametro la clase que tiene las pruebas
        for(Failure failure : result.getFailures()){ //se recorren los resultados buscando los errores
            System.out.println(failure.toString());
        }
        System.out.println("Result == " +result.wasSuccessful());
    }
}
