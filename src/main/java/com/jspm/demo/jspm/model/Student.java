package com.jspm.demo.jspm.model;
// Model (Student.java)
import jakarta.persistence.*;


@Entity // Important: Marks this as a JPA entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private String major;

    // Getters and Setters (Essential!)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    // No-args constructor (Required by JPA)
    public Student() {}

    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }
}
