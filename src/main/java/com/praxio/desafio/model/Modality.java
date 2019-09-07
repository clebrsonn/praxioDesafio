package com.praxio.desafio.model;

import lombok.Getter;

@Getter
public enum Modality {
    Rodoviario("Rodoviário"), Aereo("Aéreo"), Aquaviario("Aquaviário");

    private String type;

    Modality(String type) {
        this.type = type;
    }

}
