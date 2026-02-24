
package entity;


public class Teacher {
    private int id;
    private String name;
    private String cell;
    private String gmail;

    public Teacher() {
    }

    public Teacher(int id, String name, String cell, String gmail) {
        this.id = id;
        this.name = name;
        this.cell = cell;
        this.gmail = gmail;
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

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    @Override
    public String toString() {
        return "Teacher{" + "id=" + id + ", name=" + name + ", cell=" + cell + ", gmail=" + gmail + '}';
    }
    
    
}
