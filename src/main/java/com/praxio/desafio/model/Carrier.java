package com.praxio.desafio.model;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.*;
import java.util.List;

@Data
@Entity
@Table(name = "carriers")
public class Carrier extends AbstractEntity{


    @Email
    @NotNull
    @NotBlank
    private String email;

    @NotNull
    @NotBlank
    private String name;

    @NotNull
    //@NotBlank
    @OneToOne(cascade = CascadeType.ALL)
    private Company company;

    @NotNull
    //@NotBlank
    @Size(min = 1)
    @OneToMany
    private List<Telephone> telephone;

    @NotNull
    //@NotBlank
    @Enumerated(EnumType.STRING)
    private Modality modality;

    @NotNull
    //@NotBlank
    @Embedded
    private Address address;

    @Lob
    private String logo;

}
