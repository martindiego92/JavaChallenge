package com.AkemyChallenge.University.Models;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(name = "name")
    private String Name;

    @Column(name = "schedule")
    @Value("#{null}")
    private Date Schedule;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_professor")
    private Professor professor;

    @Column(name = "max_students")
    @Value("#{null}")
    private int maxStudents;

    private int Max;

    public Course() {

    }

    public Course(String name, Date schedule, Professor professor, int max) {
        Name = name;
        Schedule = schedule;
        this.professor = professor;
        Max = max;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getSchedule() {
        return Schedule;
    }

    public void setSchedule(Date schedule) {
        Schedule = schedule;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public int getMax() {
        return Max;
    }

    public void setMax(int max) {
        Max = max;
    }
}
