package com.gabo.labs.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        /*
            SET
                -Se comporta como stack. Primero que entra, ultimo que sale.
                -Implementations: HashSet, LinkedHashSet, TreeSet.
                -It is Unordered by default.
                -The only implementation which is ordered is TreeSet.
                -If you want to order objects, you need to implement Comparable.
                -TreeSet must use Comparable implementations
                -You can not save duplicated values
         */

        Set<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);
        numbers.add(7);

        Set<String> words = new HashSet<>();
        words.add("Gabriel");
        words.add("Andres");
        words.add("Valdes");
        words.add("Andres");
        words.add("Duarte");

        //TreeSet ordena los objetos de manera automatica.
        Set<String> orderedWords = new TreeSet<>(words);

        Set<Employee> employeesSet = new HashSet<>();
        employeesSet.add(new Employee("Raul"));
        employeesSet.add(new Employee("Saul"));
        employeesSet.add(new Employee("Vanesa"));
        employeesSet.add(new Employee("Diego"));
        Set<Employee> orderedEmployeesSet = new TreeSet<>(employeesSet);

        System.out.println("Imprimiendo numeros:" + numbers);
        System.out.println("Unordered words: " + words);
        System.out.println("Ordered words: " + orderedWords);

        System.out.println("Unordered Employees: " + employeesSet);
        System.out.println("Ordered Employees: " + orderedEmployeesSet);
    }
}
