package com.jpajoinfetch.joinfetch.model;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;;

@Entity
@Table(name="libros")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Libro {
    @Id
    @Column(name="id_libro")
    private Long id;
    private String titulo;
    private LocalDate fechaPublicacion;
    
}
