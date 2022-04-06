package com.br.telefone;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @PostMapping
    public String cadastraAluno(){
        return "Cadastrou";
    }
}
