package com.example.test1.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
@Id
@GeneratedValue
@Column
    private Long id;
@Column
    private String firstName;
@Column
    private String lastName;
@Column
    private Integer age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Column
    @Enumerated(EnumType.STRING)
    private Sex sex;

    public User(String firsfName, String lastName, Integer age, Sex sex) {
        this.firstName = firsfName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }
    public void updateUser(User user){
        this.firstName = user.firstName;
        this.lastName = user.lastName;
        this.age = user.age;
        this.sex = user.sex;
    }

    public void updateUser(String firsfName, String lastName, Integer age, Sex sex){
        this.firstName = firsfName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }
    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }
}
