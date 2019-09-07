package com.praxio.desafio.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
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
