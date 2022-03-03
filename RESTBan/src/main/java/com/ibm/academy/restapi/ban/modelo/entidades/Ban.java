package com.ibm.academy.restapi.ban.modelo.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ban")
public class Ban implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "ip", nullable = false, length = 50)
	private String ip;
	
	@NotNull(message = "No puede ser nulo")
	@NotEmpty(message = "No puede ser vacio")
	@Column(name = "usuario_creacion", nullable = false)
	private String usuarioCreacion;
	
	@Column(name = "fecha_creacion", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;
	
	@Column(name = "fecha_modificacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaModificacion;
	
	
	public Ban(Long id, String ip, String usuarioCreacion)
	{
		this.id = id;
		this.ip = ip;
		this.usuarioCreacion = usuarioCreacion;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ban [id=");
		builder.append(id);
		builder.append(", ip=");
		builder.append(ip);
		builder.append(", usuarioCreacion=");
		builder.append(usuarioCreacion);
		builder.append(", fechaCreacion=");
		builder.append(fechaCreacion);
		builder.append(", fechaModificacion=");
		builder.append(fechaModificacion);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public int hashCode() {
		return Objects.hash(fechaCreacion, fechaModificacion, id, ip, usuarioCreacion);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Ban))
			return false;
		Ban other = (Ban) obj;
		return Objects.equals(fechaCreacion, other.fechaCreacion)
				&& Objects.equals(fechaModificacion, other.fechaModificacion) && Objects.equals(id, other.id)
				&& Objects.equals(ip, other.ip)
				&& Objects.equals(usuarioCreacion, other.usuarioCreacion);
	}
	
	
}
