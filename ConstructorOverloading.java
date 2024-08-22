package com.company;

class mymainEmployee{
    private String name;
    private int id;
    private long salary;
    //default Constructor
    public mymainEmployee(){
        name = "Your-name-here";
        id = 0;
        salary = 10000;//initialize Salary
    }
    //Constructor Overloading
    public mymainEmployee(String myname,long s,int ID){
        name =myname;
        salary = s;
        id = ID;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public long getSalary() {
        return salary;
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        mymainEmployee rishi = new mymainEmployee("CodeWithRishi", 10000, 20);
        System.out.println(rishi.getId());
        System.out.println(rishi.getName());
        System.out.println(rishi.getSalary());

    }

}
