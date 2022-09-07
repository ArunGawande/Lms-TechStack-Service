package com.bridgelabz.lmstechstackservice.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

/*
 * Purpose : Create and Update TechStack Details
 * */
@Data
public class TechStackDto {
    @NotNull(message = "imagePath can't be null")
    private String imagePath;
    @NotNull(message = "status can't be null")
    private boolean status;
    @NotNull(message = "techName can't be null")
    private String techName;
}