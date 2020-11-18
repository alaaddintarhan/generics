package com.attin.generics.reflection;

public class Person extends Employee implements Comparable<Person> {

    private String name;
    //we can get public Fields using getFields() by reflection
    public String publicParameter;

    public String getPublicParameter() {
        return publicParameter;
    }

    public void setPublicParameter(String publicParameter) {
        this.publicParameter = publicParameter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @MyAnnotation(name = "myAnnotation")
    public String returnName() {
        return this.name+" is the name...";
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
