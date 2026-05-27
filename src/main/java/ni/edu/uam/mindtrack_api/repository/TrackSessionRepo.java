package ni.edu.uam.mindtrack_api.repository;

import ni.edu.uam.mindtrack_api.models.TrackSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackSessionRepo extends JpaRepository<TrackSession, Long> {
}
