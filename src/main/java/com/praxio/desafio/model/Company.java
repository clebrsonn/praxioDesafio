package com.praxio.desafio.model;

import lombok.Data;
import org.hibernate.validator.constraints.br.CNPJ;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class Company {


    @Min(4)
    @NotBlank
    @NotNull
    private String name;

    @CNPJ
    private String cnpj;
}
