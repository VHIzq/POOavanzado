package com.company.ejercicioencap;

public class Person {
    //propiedades
    private String name;
    private int age;
    private  String id;

    //método
    public  String getName(){
        return  this.name;
    }
    public  int getAge(){
        return  this.age;
    }
    public  String getId(){
        return  this.id;
    }
    public void setName(String name){
        this.name = name;
    }
    public  void  setAge(int age){
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
