package ni.edu.uam.mindtrack_api.repository;

import ni.edu.uam.mindtrack_api.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
}