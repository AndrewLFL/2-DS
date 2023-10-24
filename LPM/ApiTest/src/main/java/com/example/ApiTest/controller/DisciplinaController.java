package com.example.ApiTest.controller;

import com.example.ApiTest.model.Disciplina;
import com.example.ApiTest.model.Professor;
import com.example.ApiTest.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/inserir")
    public void inserirDisciplina(@RequestBody Disciplina d)
    {
        dcRepo.save(d);
    }

    @DeleteMapping("/delete")
    public void deleteDisciplina(@RequestBody Disciplina d)
    {
        dcRepo.delete(d);
    }

    @DeleteMapping("/delete/codigo/{codigo}")
    public void deletePorCodigo(@PathVariable("codigo") int codigo)
    {
        dcRepo.deleteById(codigo);
    }

    @PutMapping("/atualizar")
    public void atualizarDisciplina(@RequestBody Disciplina d)
    {
        dcRepo.save(d);
    }

    @GetMapping("/buscar/sigla/{sigla}/nome/{nome}")
    public List<Disciplina> buscarSiglaNome( @PathVariable(value = "sigla") String sigla ,@PathVariable(value = "nome")  String nome)
    {
        return dcRepo.findBySiglaNome(sigla, nome);
    }

    @GetMapping("/buscar/sigla/{sigla}/codigoMaiorQue/{codigo}")
    public List<Disciplina> buscarSiglaCodigoMaiorQue( @PathVariable(value = "sigla") String sigla  , @PathVariable("codigo") int codigo)
    {
        return dcRepo.findBySiglaCodigoMaiorQue(sigla, codigo);
    }

    @GetMapping("/buscar/nome/{nome}/codigoMenorQue/{codigo}")
    public List<Disciplina> buscarNomeCodigoMenorQue(@PathVariable(value = "nome") String nome , @PathVariable("codigo") int codigo)
    {
        return dcRepo.findByNomeCodigoMenorQue(nome, codigo);
    }
}
