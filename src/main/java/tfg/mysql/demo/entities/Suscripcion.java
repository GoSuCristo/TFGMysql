package tfg.mysql.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
@Entity
@Table
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Suscripcion implements Serializable {
	@Serial
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private LocalDate f_inicio;
	@Column
	private LocalDate f_fin;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "ID_SOCIO")
	private Socio socio;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "ID_TIPOSUSCRIPCION")
	private TipoSuscripcion tiposuscripcion;
}