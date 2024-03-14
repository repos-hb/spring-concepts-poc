package com.hb.orderservice.validation;

import org.springframework.stereotype.Component;

import javax.validation.constraints.*;
import java.util.Date;

@Component
public class User {

    @NotNull(message = "id should not be null")
    private int id;

    @NotEmpty(message = "name should not be empty")
    private String name;

    @NotBlank(message = "email should not be null or empty")
    @Email
    private String email;

    @Pattern(regexp = "[0-9]")
    private String phone;

    @Min(value = 0)
    @Max(value = 99999999)
    @PositiveOrZero
    private double orderValue;

    @Past(message = "this should be past date")
    private Date dob;

    @Future(message = "this should be future date")
    private Date joining;

    @AssertTrue
    @AssertFalse
    private boolean isActive;
}
