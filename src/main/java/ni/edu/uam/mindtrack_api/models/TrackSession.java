package ni.edu.uam.mindtrack_api.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "track_session")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TrackSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_session")
    private Long id;

    @Column(name = "id_usuario", nullable = false)
    private Long idUsuario;

    @Column(name = "estado_animo", nullable = false, length = 100)
    private String estadoAnimo;

    @Column(name = "notas", nullable = false)
    private String notas;
}
