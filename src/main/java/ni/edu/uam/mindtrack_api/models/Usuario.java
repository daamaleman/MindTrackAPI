package ni.edu.uam.mindtrack_api.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "usuario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "correo", nullable = false, unique = true, length = 150)
    private String correo;

    @Column(name = "foto_perfil", columnDefinition = "TEXT")
    private String fotoPerfil; // Para guardar la URL o Base64 de la imagen de perfil

    @Column(name = "biografia", length = 255)
    private String biografia; // Útil para la edición avanzada de perfil
}