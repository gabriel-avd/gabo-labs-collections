package com.gabo.labs.collections.hashcode;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Panshito");
        Employee employee2 = new Employee("Panshito");
        Employee employee3 = new Employee("Juanito");

        String string1 = new String("HELLO");
        String string2 = new String("HELLO");

        String constant1 = "HELLO";
        String constant2 = "HELLO";

        HashSet<Employee> employeeHashSet = new HashSet<>();

        employeeHashSet.add(employee1);
        employeeHashSet.add(employee2);

       // System.out.println(employeeHashSet.contains(employee1));


        if(employee1.equals(employee2))
            System.out.println("employee1 equals employee2");

        if(employee1 == employee2)
            System.out.println("employee1 == employee2");

        if(string1.equals(string2))
            System.out.println("string1 equals string2");

        if(string1 == string2)
            System.out.println("string1 == string2");

        if(constant1.equals(constant2))
            System.out.println("constant1 equals constant2");

        if(constant1 == constant2)
            System.out.println("constant1 == constant2");

        /*
            EQUALS
                -Se utiliza principalmente para comparar contenidos de objetos
                -Se necesita sobreescribir para comparar contenido de objeto, si no, adress comparison

            ==
                -Address comparison

            HASHCODE
                -Metodo de la clase Object.
                -Crea un identificador unico por objeto
                -Se utiliza principalmente en collections de tipo HASH o MAP.


         */



    }
}
