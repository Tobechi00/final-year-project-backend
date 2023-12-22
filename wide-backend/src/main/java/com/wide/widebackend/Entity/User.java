package com.wide.widebackend.Entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

import java.util.List;

@Entity(name = "user_information")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Nonnull
    private String email;
    @Column
    @Nonnull
    private String password;
    @Column
    @Nonnull
    private String firstname;
    @Column
    @Nonnull
    private String lastname;

    @OneToMany(mappedBy = "userRef", cascade = CascadeType.ALL)
    private List<File> files;

    public User(){}
    public User(@Nonnull String email,@Nonnull String password,@Nonnull String firstname,@Nonnull String lastname) {
        this.email = email;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
