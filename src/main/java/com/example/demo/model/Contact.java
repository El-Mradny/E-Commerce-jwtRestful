package com.example.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Contact {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private long id;
    @Basic
    @Column(name = "USERNAME")
    private String username;
    @Basic
    @Column(name = "PROBLEM")
    private String problem;
    @Basic
    @Column(name = "ANSWER")
    private String answer;
    @Basic
    @Column(name = "PHONENUMBER")
    private String phonenumber;
    @Basic
    @Column(name = "EMAIL")
    private String email;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return id == contact.id && Objects.equals(username, contact.username) && Objects.equals(problem, contact.problem) && Objects.equals(answer, contact.answer) && Objects.equals(phonenumber, contact.phonenumber) && Objects.equals(email, contact.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, problem, answer, phonenumber, email);
    }
}
