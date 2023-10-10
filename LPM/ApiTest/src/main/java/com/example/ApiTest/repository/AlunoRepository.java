package com.example.ApiTest.repository;
import com.example.ApiTest.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository <Aluno,Integer> {

}
