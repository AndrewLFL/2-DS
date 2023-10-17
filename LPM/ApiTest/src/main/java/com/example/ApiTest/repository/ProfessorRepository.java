package com.example.ApiTest.repository;

import com.example.ApiTest.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfessorRepository extends JpaRepository <Professor,Integer> {

    public List<Professor> findByNome(String nome);
    public List<Professor> findBySalario(double salario);
}