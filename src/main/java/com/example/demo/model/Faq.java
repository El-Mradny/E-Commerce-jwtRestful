package com.example.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Faq {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private long id;
    @Basic
    @Column(name = "USERNAME")
    private String username;
    @Basic
    @Column(name = "QUESTION")
    private String question;
    @Basic
    @Column(name = "ANSWER")
    private String answer;
    @Basic
    @Column(name = "STATUS")
    private String status;
    @Basic
    @Column(name = "PUBLISH")
    private String publish;

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

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faq faq = (Faq) o;
        return id == faq.id && Objects.equals(username, faq.username) && Objects.equals(question, faq.question) && Objects.equals(answer, faq.answer) && Objects.equals(status, faq.status) && Objects.equals(publish, faq.publish);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, question, answer, status, publish);
    }
}
