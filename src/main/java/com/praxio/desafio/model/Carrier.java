package com.praxio.desafio.model;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
@Table(name = "carriers")
public class Carrier extends AbstractEntity{


    @Email
    private String email;

    @NotNull
    @NotBlank
    private String name;

    @NotNull
    @NotBlank
    @OneToOne
    private Company company;

    @NotNull
    @NotBlank
    @Min(1)
    @OneToMany
    private List<Telephone> telephone;

    @NotNull
    @NotBlank
    @Enumerated(EnumType.STRING)
    private Modality modality;

    @NotNull
    @NotBlank
    @Embedded
    private Address address;

    @Lob
    private String logo;

}
