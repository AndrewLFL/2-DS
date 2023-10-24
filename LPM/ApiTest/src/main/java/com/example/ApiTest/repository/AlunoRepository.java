package com.example.ApiTest.repository;
import com.example.ApiTest.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlunoRepository extends JpaRepository <Aluno,Integer>
{
    public List<Aluno> findByNome(String nome);
    public List<Aluno> findByAltura(double altura);

    @Query("select a from Aluno a where a.nome like %?1%")
    public List<Aluno> findByParteNome(String parteNome);

    @Query("select a from Aluno a where a.ra > ?1")
    public List<Aluno> findByRaMaiorQue(int ra);

    @Query("select a from Aluno a where a.altura < ?1")
    public List<Aluno> findByAlturaMenorQue(double altura);

    @Query("select a from Aluno a where a.nome like ?1 and a.ra = ?2")
    public  List<Aluno> findByNomeRa(String nome , int ra);

    @Query("select a from Aluno a where a.nome like %?1% and a.altura < ?2")
    public List<Aluno> findByParteNomeAlturaMenorQue(String parteNome , double altura);
}
