package com.example.ApiTest.repository;

import com.example.ApiTest.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProfessorRepository extends JpaRepository <Professor,Integer> {

    public List<Professor> findByNome(String nome);
    public List<Professor> findBySalario(double salario);

    @Query("select p from Professor p where p.nome like ?1 and p.salario > ?2")
    public List<Professor> findByNomeSalarioMaiorQue(String nome , double salario);

    @Query("select p from Professor p where p.nome like ?1 and p.id < ?2")
    public List<Professor> findByNomeIdMenorQue(String nome , int id);
}
