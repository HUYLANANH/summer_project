package com.uit.summer.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String description;

    @NotBlank(message = "Name is required")
    @Column(name = "name", length = 50, nullable = false)
    private String name;
}
