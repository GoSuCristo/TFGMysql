package tfg.mysql.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
@Entity
@Table
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Progreso implements Serializable {
	@Serial
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private int n_cap_visto;
	@OneToOne
	@JsonIgnore
	@JoinColumn(name = "ID_SOCIO")
	private Socio socio;
	@OneToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name = "ID_PLAYLIST")
	private Playlist playlist;
}