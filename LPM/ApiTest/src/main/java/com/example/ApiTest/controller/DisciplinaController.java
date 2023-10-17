package com.example.ApiTest.controller;

import com.example.ApiTest.model.Disciplina;
import com.example.ApiTest.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiDisciplina")
public class DisciplinaController
{
    @Autowired
    DisciplinaRepository dcRepo;

    @GetMapping("/buscar")
    public List<Disciplina> buscarTodasDisciplina()
    {
        return dcRepo.findAll();
    }

    @GetMapping ("/buscar/codigo/{codigo}")
    public Optional<Disciplina> buscarPorCodigo(@PathVariable(value = "codigo") int codigo)
    {
        return dcRepo.findById(codigo);
    }

    @GetMapping("/buscar/nome/{nome}")
    public List<Disciplina> buscarPorNome(@PathVariable(value = "nome")String nome){
        return dcRepo.findByNome(nome);
    }

    @GetMapping("/buscar/cargaHoraria/{cargaHoraria}")
    public List<Disciplina> buscarPorCargaHoraria(@PathVariable(value = "cargaHoraria")int cargaHoraria){
        return dcRepo.findByCargaHoraria(cargaHoraria);
    }

    @GetMapping("/buscar/sigla/{sigla}")
    public List<Disciplina> buscarPorSigla(@PathVariable(value = "sigla")String sigla){
        return dcRepo.findBySigla(sigla);
    }

}
