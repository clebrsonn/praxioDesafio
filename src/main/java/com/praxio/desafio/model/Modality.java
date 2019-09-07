package com.praxio.desafio.model;

public enum Modality {
    Rodoviario("Rodoviário"), Aereo("Aéreo"), Aquaviario("Aquaviário");

    private String type;

    Modality(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
