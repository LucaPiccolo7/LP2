package Generics.src.main.java.org.example;

import java.util.List;

public class Employee implements Comparable<Employee>{
    public String name;
    public int salary;

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){return name;}
    public int getSalary(){return salary;}

    public void setName(String name){this.name = name;}
    public void setSalary(int salary){this.salary = salary;}

    public static <T extends Employee> int getTotalSalary(List<T> l){
        int total = 0;
        for (T element: l){
            total += element.salary;
        }
        return total;
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(salary, other.salary);
    }

    //metodo statico che accetta una lista di oggetti (Employee) dotati di ordinamento naturale
    //e restituisce il minimo della lista
    public static <T extends Comparable<? super T>> T getMin(List<T> l){
        T min = l.getFirst();
        for(T emp: l){
            if (emp.compareTo(min) < 0) min = emp;
        }
        return min;
    }
}
