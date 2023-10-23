package com.example.ApiTest.controller;

import com.example.ApiTest.model.Aluno;
import com.example.ApiTest.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/apiAluno")
public class AlunoController {

    @Autowired
    AlunoRepository alRepo;

    @GetMapping ("/buscar")
    public List<Aluno> buscarTodosAlunos()
    {
        return alRepo.findAll();
    }

    @GetMapping ("/buscar/ra/{ra}")
    public Optional<Aluno> buscarPorRa(@PathVariable(value = "ra") int ra)
    {
        return alRepo.findById(ra);
    }

    @GetMapping("/buscar/nome/{nome}")
    public List<Aluno> buscarPorNome(@PathVariable(value = "nome")String nome)
    {
        return alRepo.findByNome(nome);
    }

    @GetMapping("/buscar/altura/{altura}")
    public List<Aluno> buscarPorAltura(@PathVariable(value = "altura")double altura)
    {
        return alRepo.findByAltura(altura);
    }

    @PostMapping("/inserir")
    public void inserirAluno(@RequestBody Aluno a)
    {
        alRepo.save(a);
    }

    @DeleteMapping("/delete")
    public void deleteAluno(@RequestBody Aluno a)
    {
        alRepo.delete(a);
    }

    @DeleteMapping("/delete/ra/{ra}")
    public void deletePorId(@PathVariable("ra") int ra)
    {
        alRepo.deleteById(ra);
    }

    @PutMapping("/atualizar")
    public void atualizarAluno(@RequestBody Aluno al)
    {
        alRepo.save(al);
    }
}
