package com.anshkataria.taco_cloud.tacos;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Ingredients {
    public static enum Type {
        WRAP,PROTEIN,VEGGIES,CHEESE,SAUCE;
    }
    public final String id;
    public final Type type;
    public final String name;
}
