package com.example.ApiTest.controller;
import com.example.ApiTest.model.Aluno;
import com.example.ApiTest.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/apiAluno")
public class AlunoController {

    @Autowired
    AlunoRepository alRepo;

    @GetMapping ("/todos")
    public List<Aluno> buscarTodosAlunos()
    {
        return alRepo.findAll();
    }
}
