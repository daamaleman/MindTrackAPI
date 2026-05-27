package ni.edu.uam.mindtrack_api.repository;

import ni.edu.uam.mindtrack_api.models.Estadistica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadisticaRepo extends JpaRepository<Estadistica, Long> {
}
