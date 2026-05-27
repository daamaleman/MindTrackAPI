package ni.edu.uam.mindtrack_api.services;

import ni.edu.uam.mindtrack_api.models.TrackSession;
import ni.edu.uam.mindtrack_api.repository.TrackSessionRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackSessionService {

    private final TrackSessionRepo trackSessionRepo;

    public TrackSessionService(TrackSessionRepo trackSessionRepo) {
        this.trackSessionRepo = trackSessionRepo;
    }

    public List<TrackSession> getAllSessions() {
        return trackSessionRepo.findAll();
    }

    public TrackSession getSessionById(Long id) {
        return trackSessionRepo.findById(id).orElse(null);
    }

    public TrackSession saveSession(TrackSession session) {
        return trackSessionRepo.save(session);
    }

    public TrackSession deleteSession(Long id) {
        trackSessionRepo.deleteById(id);
        return null;
    }
}
