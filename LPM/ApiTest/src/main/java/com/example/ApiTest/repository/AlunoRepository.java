package com.example.ApiTest.repository;
import com.example.ApiTest.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlunoRepository extends JpaRepository <Aluno,Integer>
{
    public List<Aluno> findByNome(String nome);
    public List<Aluno> findByAltura(double altura);

}
