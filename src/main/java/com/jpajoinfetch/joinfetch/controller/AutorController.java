package com.jpajoinfetch.joinfetch.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpajoinfetch.joinfetch.model.Autor;
import com.jpajoinfetch.joinfetch.repository.AutorJpaRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class AutorController {
    private final AutorJpaRepository repository;
    @GetMapping("/all")
    public ResponseEntity<List<Autor>> findAll(){
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }
}
