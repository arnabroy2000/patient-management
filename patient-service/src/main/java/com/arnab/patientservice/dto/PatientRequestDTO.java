package com.arnab.patientservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PatientRequestDTO {

    @NotNull
    @Size(max =100, message = "Name cannot exceed 100 characters")
    private String name;
    @NotNull
    @Email(message = "Email should be valid")
    private String email;
    @NotNull
    private String address;
    @NotNull
    private String dateOfBirth;
    @NotNull
    private String registeredDate;
}
