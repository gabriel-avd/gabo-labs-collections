package com.gabo.labs.collections.set;

public class Employee implements Comparable<Employee>{
    private String name;
    private int edad;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Empleado: " + name + " Edad: " + edad;
    }

    @Override
    public int compareTo(Employee obj) {
        //System.out.println(this.getYear() + " - " + obj.getYear() + " = " + (this.getYear() - obj.getYear()));
        return this.getName().compareTo(obj.getName()) ;
    }
}

