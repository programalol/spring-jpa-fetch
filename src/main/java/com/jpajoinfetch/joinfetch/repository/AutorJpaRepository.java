package com.jpajoinfetch.joinfetch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpajoinfetch.joinfetch.model.Autor;

public interface AutorJpaRepository extends JpaRepository<Autor, Long> {
    
}
