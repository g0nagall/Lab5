package com.company;


public class Employee {
    protected int id;
    protected static int nextId;
    protected String name;
    protected double salary = 1000;
    protected Manager manager;

    public Employee(String name) {
        this.nextId++;
        this.id = this.nextId;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
    public final void raiseSalary(double p){
        this.salary = this.salary*(100+p)/100;
    }
    public String toString(){
        return "Employee " + this.name + "( id - " + this.id + " )" + " have sal = " + this.salary;
    }

    public void getManagerName(){
        if(manager == null) {
            System.out.println("No Manager (");
        }else {
            System.out.println(this.getManager().getName());
        }
    }

    public Employee getTopManager(Manager manager){
        if(manager == null) {
            return this;
        }else {
            return manager.getTopManager(manager.getManager());
        }
    }
}
