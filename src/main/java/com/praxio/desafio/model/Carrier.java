package com.praxio.desafio.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Table(name = "carriers")
public class Carrier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Email
    private String email;

    @NotNull
    @NotBlank
    private String name;

    @NotNull
    @NotBlank
    private Company company;

    @NotNull
    @NotBlank
    @Min(1)
    private List<Telephone> telephone;

    @NotNull
    @NotBlank
    private Modality modality;

    @NotNull
    @NotBlank
    private Address address;

    @Lob
    private String logo;



}
