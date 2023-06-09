package tfg.mysql.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity @Table @Setter @Getter @AllArgsConstructor @NoArgsConstructor
public class Socio implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id @Column @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nombre;
    @Column
    private String email;
    @Column
    private String das;
    @Column
    private String password;
    @Column(columnDefinition = "boolean default false")
    private boolean activado;
    @OneToOne @JoinColumn(name = "ID_ROL")
    private Rol rol;
    @OneToMany(mappedBy = "socio", cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    private List<Progreso> progreso = new ArrayList<>();
    @OneToMany(mappedBy = "socio", cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    private List<Suscripcion> suscripcion = new ArrayList<>();
}
