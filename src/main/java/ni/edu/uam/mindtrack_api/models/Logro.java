package ni.edu.uam.mindtrack_api.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "logro")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Logro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_logro")
    private Long id;

    @Column(name = "id_usuario", nullable = false)
    private Long idUsuario;

    @Column(name = "titulo", nullable = false, length = 100)
    private String titulo;

    @Column(name = "desbloqueado", nullable = false)
    private Boolean desbloqueado;
}
