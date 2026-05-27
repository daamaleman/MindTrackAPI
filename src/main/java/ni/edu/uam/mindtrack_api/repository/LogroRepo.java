package ni.edu.uam.mindtrack_api.repository;

import ni.edu.uam.mindtrack_api.models.Logro;
import ni.edu.uam.mindtrack_api.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogroRepo extends JpaRepository<Logro, Long> {
}
