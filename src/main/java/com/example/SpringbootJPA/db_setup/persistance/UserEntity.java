package com.example.SpringbootJPA.db_setup.persistance;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users", schema = "USER_APP")
public class UserEntity {

    @Id
    private Integer userID;
    private String name;
    private String email;

    @Override
    public String toString() {
        return "UserEntity{" +
                "userID=" + userID +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
