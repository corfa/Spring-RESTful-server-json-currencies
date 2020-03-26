package com.example.restservis;

public class Valutes {
    private final String name;

    private final Double value;

    private final String CharCode;
    public Valutes(String name,Double value,String CharCode){
        this.name=name;
        this.value=value;
        this.CharCode=CharCode;
    }

    public String getName(){
        return name;
    }
    public Double getValue()
    {
        return value;
    }
    public String getCharCode(){
        return CharCode;
    }
}
