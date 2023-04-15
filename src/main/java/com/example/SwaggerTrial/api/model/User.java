package com.example.SwaggerTrial.api.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class User {

    private Integer id;
    private String name;
}
