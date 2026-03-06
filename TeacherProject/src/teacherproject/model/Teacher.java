/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teacherproject.model;

/**
 *
 * @author hp
 */
public class Teacher {
    private int id;
    private String name;
    private String designation;
    private String contact;
    private double salary;

    public Teacher() {
    }

    public Teacher(int id, String name, String designation, String contact, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.contact = contact;
        this.salary = salary;
    }

    public Teacher(String name, String designation, String contact, double salary) {
        this.name = name;
        this.designation = designation;
        this.contact = contact;
        this.salary = salary;
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" + "id=" + id + ", name=" + name + ", designation=" + designation + ", contact=" + contact + ", salary=" + salary + '}';
    }
    
    
    
}
