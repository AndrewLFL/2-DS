package com.example.ApiTest.controller;

import com.example.ApiTest.model.Aluno;
import com.example.ApiTest.model.Professor;
import com.example.ApiTest.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/apiProfessor")
public class ProfessorController {

    @Autowired
    ProfessorRepository prRepo;

    @GetMapping ("/buscar")
    public List<Professor> buscarTodosProfessores()
    {
        return prRepo.findAll();
    }

    @GetMapping ("/buscar/id/{id}")
    public Optional<Professor> buscarPorId(@PathVariable(value = "id") int id)
    {
        return prRepo.findById(id);
    }

    @GetMapping("/buscar/nome/{nome}")
    public List<Professor> buscarPorNome(@PathVariable(value = "nome")String nome){
        return prRepo.findByNome(nome);
    }

    @GetMapping("/buscar/salario/{salario}")
    public List<Professor> buscarPorSalario(@PathVariable(value = "salario")double salario)
    {
        return prRepo.findBySalario(salario);
    }

    @PostMapping("/inserir")
    public void inserirProfessor(@RequestBody Professor p)
    {
        prRepo.save(p);
    }

    @DeleteMapping("/delete")
    public void deleteProfessor(@RequestBody Professor p)
    {
        prRepo.delete(p);
    }

    @DeleteMapping("/delete/id/{id}")
    public void deletePorId(@PathVariable("id") int id)
    {
        prRepo.deleteById(id);
    }

    @PutMapping("/atualizar")
    public void atualizarProfessor(@RequestBody Professor p)
    {
        prRepo.save(p);
    }
}