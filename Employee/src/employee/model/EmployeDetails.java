
package employee.model;


public class EmployeDetails {
    private int id;
    private String name;
    private String contact;
    private double salary;

    public EmployeDetails() {
    }

    public EmployeDetails(int id, String name, String contact, double salary) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.salary = salary;
    }

    public EmployeDetails(String name, String contact, double salary) {
        this.name = name;
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
        return "EmployeDetails{" + "id=" + id + ", name=" + name + ", contact=" + contact + ", salary=" + salary + '}';
    }
    
    
}
