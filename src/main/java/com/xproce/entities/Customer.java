package com.xproce.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Customer {

@Id
    private int id;
    private String email;
    private String pwd;
    private String role;
}
