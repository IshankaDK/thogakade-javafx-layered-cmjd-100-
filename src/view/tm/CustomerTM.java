package view.tm;

import javafx.scene.control.Button;

public class CustomerTM {
    private int id;
    private String name;
    private String address;
    private double salary;
    private Button btnDelete;

    public CustomerTM() {
    }

    public CustomerTM(int id, String name, String address, double salary, Button btnDelete) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.btnDelete = btnDelete;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Button getBtnDelete() {
        return btnDelete;
    }

    public void setBtnDelete(Button btnDelete) {
        this.btnDelete = btnDelete;
    }

}
