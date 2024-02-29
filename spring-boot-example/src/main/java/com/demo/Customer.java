// src/main/java/com.demo/Customer.java
package com.demo;

import java.util.Objects;

public class Customer {
  private Integer id;
  private Integer age;
  private String name;
  private String email;

  public Customer(Integer id, Integer age, String name, String email) {
    this.id = id;
    this.age = age;
    this.name = name;
    this.email = email;
  }

  public Customer() {}

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public int hashCode() {
    // final int prime = 31;
    // int result = 1;
    // result = prime * result + ((id == null) ? 0 : id.hashCode());
    // result = prime * result + ((age == null) ? 0 : age.hashCode());
    // result = prime * result + ((name == null) ? 0 : name.hashCode());
    // result = prime * result + ((email == null) ? 0 : email.hashCode());
    // return result;
    return Objects.hash(id, age, name, email);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Customer other = (Customer) obj;
    return Objects.equals(id, other.id) && Objects.equals(age, other.age) && Objects.equals(name, other.name)
        && Objects.equals(email, other.email);
  }

  @Override
  public String toString() {
    return "Customer [id=" + id + ", age=" + age + ", name=" + name + ", email=" + email + "]";
  }
}
