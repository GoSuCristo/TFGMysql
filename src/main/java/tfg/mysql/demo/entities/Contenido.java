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
public class Contenido implements Serializable {
	@Serial
	private static final long serialVersionUID = 1L;


	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id	@Column
	private int id;
	@Column
	private String contenido;
	@Column
	private String titulo;
	@Column
	private String categoria;
	@Column
	private String descripcion;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_TIPOSUSCRIPCION")
	@JsonIgnore
	private TipoSuscripcion tiposuscripcion;
	@OneToMany(mappedBy = "contenido",fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Playlist> playlist = new ArrayList<>();
}