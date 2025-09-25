package com.meuprojeto.adocao.controller;

import com.meuprojeto.adocao.model.Animal;
import com.meuprojeto.adocao.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AdocaoController {

    @Autowired
    private AnimalRepository animalRepository;

    @GetMapping("/")
    public String listarAnimais(Model model) {
        List<Animal> animais = animalRepository.findAll();
        model.addAttribute("animais", animais);
        return "index";
    }
}