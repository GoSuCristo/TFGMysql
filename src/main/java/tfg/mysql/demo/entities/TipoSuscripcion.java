package tfg.mysql.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TipoSuscripcion implements Serializable {
	@Serial
	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id	@Column
	private int id;
	@Column
	private String nombre;
	@Column
	private float precio;
	@OneToMany(mappedBy = "tiposuscripcion",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Suscripcion> suscripcion = new ArrayList<>();

	@OneToMany(mappedBy = "tiposuscripcion",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Contenido> contenido = new ArrayList<>();

}