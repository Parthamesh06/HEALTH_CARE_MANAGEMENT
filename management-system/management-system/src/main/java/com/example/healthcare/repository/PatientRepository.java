package com.example.healthcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.healthcare.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
