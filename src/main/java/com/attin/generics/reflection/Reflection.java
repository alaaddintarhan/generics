package com.attin.generics.reflection;

import java.util.Arrays;

public class Reflection {

    public static void main(String[] args) {

//        Class<Person> person = Person.class;

        Class<Person> personClass = null;
        try {
            personClass = (Class<Person>) Class.forName("com.attin.generics.reflection.Person");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(personClass.getPackage());

        System.out.println("Methods : ");
        Arrays.stream(personClass.getMethods()).peek(x -> System.out.println("...Class Methods..."))
                .forEach(m -> System.out.printf(" %s  , Return Type : %s", m.getName(), m.getReturnType()));


        //This includes public, protected, default (package) access, and private fields, but excludes inherited fields.
        System.out.println("\nDeclared Fields:  ");
        Arrays.stream(personClass.getDeclaredFields())
                .forEach(f -> {
                    //f.setAccessible(false);
                    System.out.printf("\nName: %s", f.getName());
                });


        System.out.println("\nClass Fields: it can be acces the public parameters ");
        Arrays.stream(personClass.getFields()).forEach(System.out::println);

        System.out.printf("\nSuperClass : %s", personClass.getSuperclass());

        System.out.printf("\nInterfaces : ");
        Arrays.stream(personClass.getInterfaces()).forEach(System.out::println);


        System.out.printf("\nAnnotation : ");
        Arrays.stream(personClass.getMethods())
                .filter(method -> method.isAnnotationPresent(MyAnnotation.class))
                .forEach(System.out::println);
    }
}
