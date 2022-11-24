package com.jpajoinfetch.joinfetch.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;;


@Entity
@Table(name="autores")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Autor {
    @Id
    @Column(name="id_autor")
    private Long id;
    private String nombre;
    private String apellido;
    private String nacionalidad;
    @ManyToMany
    @JoinTable(
    name = "autores_libros", 
    joinColumns = @JoinColumn(name = "id_autor"), 
    inverseJoinColumns = @JoinColumn(name = "id_libro")
    )
    Set<Libro> libros;
}
