
package entity2;


public class Staff {
   private int id;
   private String name;
   private String designation;
   private String contact;

    public Staff() {
    }

    public Staff(int id, String name, String designation, String contact) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.contact = contact;
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

    @Override
    public String toString() {
        return "Staff{" + "id=" + id + ", name=" + name + ", designation=" + designation + ", contact=" + contact + '}';
    }
   
   
}
