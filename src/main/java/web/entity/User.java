package web.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private int id;
    @Column(name ="name")
    private String name;
    @Column(name ="surname")
    private String Surname;
    @Column(name ="department")
    private String department;
    @Column(name ="salary")
    private int salary;

    public User(int id) {
        this.id = id;
    }

    public User(int id, String name, String surname, String department, int salary) {
        this.id = id;
        this.name = name;
        Surname = surname;
        this.department = department;
        this.salary = salary;
    }

    public User() {

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

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
