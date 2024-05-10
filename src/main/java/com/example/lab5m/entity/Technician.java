package com.example.lab5m.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "technician")
public class Technician {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TechnicianID", nullable = false)
    private Integer id;

    @Size(min=3,max = 100)
    @NotNull
    @Column(name = "FirstName", nullable = false, length = 100)
    private String firstName;

    @Size(min=3,max = 100)
    @NotNull
    @Column(name = "LastName", nullable = false, length = 100)
    private String lastName;

    @Size(max = 8)
    @NotNull
    @Column(name = "Dni", nullable = false, length = 8)
    private String dni;

    @Size(max = 9)
    @NotNull
    @Column(name = "Phone", nullable = false, length = 9)
    private String phone;

    @NotNull
    @Digits(integer = 3, fraction = 0)
    @Positive
    @Column(name = "Age", nullable = false)
    private Integer age;

}