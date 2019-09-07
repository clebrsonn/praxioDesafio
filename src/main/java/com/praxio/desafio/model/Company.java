package com.praxio.desafio.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CNPJ;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@EqualsAndHashCode(callSuper=false)
@Getter
@Setter
@Entity
@Table(name="companies")
public class Company extends AbstractEntity{


    @Min(4)
    @NotBlank
    @NotNull
    private String name;

    @CNPJ
    private String cnpj;
}
