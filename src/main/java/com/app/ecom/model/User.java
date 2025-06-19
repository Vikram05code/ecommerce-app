package com.app.ecom.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name="user_table")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;


}
