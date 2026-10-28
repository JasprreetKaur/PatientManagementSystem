package com.pm.patientservice.dto;

import com.pm.patientservice.validators.CreatePatientValidationGroup;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PatientRequestDTO {
    @NotBlank(message = "name is required")
    @Size(min = 1, max = 100, message = "name cannot be longer than 100 chars.")
    private String name;

    @NotBlank(message = "email is required")
    @Email(message = "email should be valid")
    private String email;

    @NotBlank(message = "address is required")
    private String address;

    @NotBlank(message = "dob is required")
    private String dateOfBirth;

    @NotBlank(groups = CreatePatientValidationGroup.class, message = "registered date is required")
    private String registeredDate;

}
