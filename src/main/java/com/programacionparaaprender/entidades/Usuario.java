package com.programacionparaaprender.entidades;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	@Column(name="id")
	private String usuarioId;
	
	@Column(name="nombre", length=20)
	private String nombre;
	
	@Column(name="email")
	private String email;
	
	@Column(name="informacion")
	private String informacion;
}
