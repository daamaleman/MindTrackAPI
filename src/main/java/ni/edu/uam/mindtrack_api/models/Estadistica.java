package ni.edu.uam.mindtrack_api.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "estadistica")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Estadistica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estadistica")
    private Long id;

    @Column(name = "id_usuario", nullable = false)
    private Long idUsuario;

    @Column(name = "sesiones_completadas", nullable = false)
    private Integer sesionesCompletadas;

    @Column(name = "racha_actual", nullable = false)
    private Integer rachaActual;
}
