package com.arnab.patientservice.mapper;

import com.arnab.patientservice.dto.PatientResponseDto;
import com.arnab.patientservice.model.Patient;

public class PatientMapper {
    public static PatientResponseDto toPatientResponseDto(Patient patient) {
        PatientResponseDto patientResponseDto = new PatientResponseDto();
        patientResponseDto.setId(patient.getId().toString());
        patientResponseDto.setName(patient.getName());
        patientResponseDto.setEmail(patient.getEmail());
        patientResponseDto.setAddress(patient.getAddress());
        patientResponseDto.setDateOfBirth(patient.getBirthDate().toString());
        return patientResponseDto;
    }
}
