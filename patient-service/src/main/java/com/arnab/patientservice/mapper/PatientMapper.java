package com.arnab.patientservice.mapper;

import com.arnab.patientservice.dto.PatientRequestDTO;
import com.arnab.patientservice.dto.PatientResponseDto;
import com.arnab.patientservice.model.Patient;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PatientMapper {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static PatientResponseDto toPatientResponseDto(Patient patient) {
        PatientResponseDto patientResponseDto = new PatientResponseDto();
        patientResponseDto.setId(patient.getId().toString());
        patientResponseDto.setName(patient.getName());
        patientResponseDto.setEmail(patient.getEmail());
        patientResponseDto.setAddress(patient.getAddress());
        patientResponseDto.setDateOfBirth(patient.getDateOfBirth().toString());
        return patientResponseDto;
    }
    public static Patient toModel(PatientRequestDTO patientRequestDTO) {
        Patient patient = new Patient();
        patient.setName(patientRequestDTO.getName());
        patient.setEmail(patientRequestDTO.getEmail());
        patient.setAddress(patientRequestDTO.getAddress());
        patient.setDateOfBirth(LocalDate.parse(patientRequestDTO.getDateOfBirth(), DATE_FORMATTER));
        patient.setRegisteredDate(LocalDate.parse(patientRequestDTO.getRegisteredDate(), DATE_FORMATTER));
        return patient;
    }
}
