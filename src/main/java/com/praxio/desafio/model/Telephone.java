package com.praxio.desafio.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="telephones")
public class Telephone extends AbstractEntity{

    private String phone;

    @Enumerated(EnumType.STRING)
    private PhoneType phoneType;

}
