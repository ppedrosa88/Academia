package Entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "alumno")
public class Alumno implements Serializable {
    @Id
    @Column(name = "alumno_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String course;
    @Column(name = "subjects_quantity")
    private int subjectsQuantity;
    private int age;

    public Alumno() {
    }

    public Alumno(String name, String surname, String course, int subjectsQuantity, int age) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.subjectsQuantity = subjectsQuantity;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getSubjectsQuantity() {
        return subjectsQuantity;
    }

    public void setSubjectsQuantity(int subjectsQuantity) {
        this.subjectsQuantity = subjectsQuantity;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return id + ": " + name + " " + surname + ", " + age +
        "\nCursando " + course + " con " + subjectsQuantity + " asignaturas.";
    }
}
