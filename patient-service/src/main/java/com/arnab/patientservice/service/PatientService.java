package com.arnab.patientservice.service;

import com.arnab.patientservice.dto.PatientResponseDto;
import com.arnab.patientservice.mapper.PatientMapper;
import com.arnab.patientservice.model.Patient;
import com.arnab.patientservice.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    private PatientRepository patientRepository;
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<PatientResponseDto> getAllPatients() {
        List<Patient> patients = patientRepository.findAll();
        return patients.stream()
                .map(PatientMapper::toPatientResponseDto).toList();
    }
}
