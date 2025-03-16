package Generics.src.main.java.org.example;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args){
        Employee emp1 = new Employee("Nunzio", 100);
        Employee emp2 = new Employee("Vitale", 200);
        Manager man1 = new Manager("Michele", 1500);
        Manager man2 = new Manager("Ubaldo", 4555);

        ArrayList<Employee> listaEmp = new ArrayList<>();
        listaEmp.add(emp1);
        listaEmp.add(emp2);
        listaEmp.add(man1);
        System.out.println(Employee.getTotalSalary(listaEmp));
        System.out.println(Employee.getMin(listaEmp));

        ArrayList<Manager> listaMan = new ArrayList<>();
        listaMan.add(man1);
        listaMan.add(man2);
        System.out.println(Employee.getMin(listaMan));

    }

    //metodo che accetta una collezione di valori numerici e ne restituisce la somma
    //tutte queste classi estendono Number
    public static double sum(Collection<? extends Number> c){
        double result = 0;
        for(Number ele: c){
            result += ele.doubleValue();
        }
        return result;
    }

    //realizziamo un metodo che accetta una collezione di oggetti confrontabili e una coppia di oggetti
    //(di una ipotetica classe Pair<T>) e modifica la coppia in modo che contenga
    //l'oggetto minimo e massimo della collezione
    public static <T extends Comparable<? super T>> void getMinMax(Collection<T> coll, Pair<T> pair){
        T min = null;
        T max = null;

        for (T el: coll){
            if (min == null || el.compareTo(min) < 0)
                min = el;
            else if (max == null || el.compareTo(max) > 0)
                max = el;
        }

        pair.first = min;
        pair.second = max;
    }
}
