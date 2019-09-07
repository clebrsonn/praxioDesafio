package com.praxio.desafio.model;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Embeddable
public class Address {

    @NotNull
    @NotBlank
    private String street;
    @NotNull
    @NotBlank
    private String number;
    @NotNull
    @NotBlank
    private String district;
    @NotNull
    @NotBlank
    private String city;
    @NotNull
    @NotBlank
    private UF uf;

    private String cep;
}
