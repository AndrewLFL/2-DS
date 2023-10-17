package com.example.ApiTest.repository;

import com.example.ApiTest.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DisciplinaRepository extends JpaRepository<Disciplina,Integer>
{
    public List<Disciplina> findByNome(String nome);
    public List<Disciplina> findByCargaHoraria(int cargaHoraria);
    public List<Disciplina> findBySigla(String sigla);

}
