package com.jpajoinfetch.joinfetch.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;;


@Entity
@Table(name="autores")
@Getter
@Setter
public class Autor {
    private Long id;
    private String nombre;
}
