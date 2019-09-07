package com.praxio.desafio.model;

import lombok.Getter;

@Getter
public enum PhoneType {

    TELEFONE("Telefone"),
    WHATSAPP("Whatsapp"),
    CELULAR("Celular");

    private String type;

    PhoneType(String celular) {
        type = celular;
    }


}
