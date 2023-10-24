package com.example.ApiTest.repository;

import com.example.ApiTest.model.Aluno;
import com.example.ApiTest.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DisciplinaRepository extends JpaRepository<Disciplina,Integer>
{
    public List<Disciplina> findByNome(String nome);
    public List<Disciplina> findByCargaHoraria(int cargaHoraria);
    public List<Disciplina> findBySigla(String sigla);

    @Query("select d from Disciplina d where d.nome like ?1 and d.codigo < ?2")
    public List<Disciplina> findByNomeCodigoMenorQue(String nome , int codigo);

    @Query("select d from Disciplina d where d.sigla like ?1 and d.codigo > ?2")
    public List<Disciplina> findBySiglaCodigoMaiorQue(String sigla , int codigo);

    @Query("select d from Disciplina d where d.sigla like ?1 and d.nome like ?2")
    public List<Disciplina> findBySiglaNome(String sigla , String nome);

}
