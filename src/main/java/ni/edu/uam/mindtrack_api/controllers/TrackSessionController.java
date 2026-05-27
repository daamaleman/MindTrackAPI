package ni.edu.uam.mindtrack_api.controllers;

import ni.edu.uam.mindtrack_api.models.TrackSession;
import ni.edu.uam.mindtrack_api.services.TrackSessionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sessions")
public class TrackSessionController {

    private final TrackSessionService trackSessionService;

    public TrackSessionController(TrackSessionService trackSessionService) {
        this.trackSessionService = trackSessionService;
    }

    @GetMapping
    public List<TrackSession> getAllSessions() {
        return trackSessionService.getAllSessions();
    }

    @GetMapping("/{id}")
    public TrackSession getSessionById(@PathVariable Long id) {
        return trackSessionService.getSessionById(id);
    }

    @PostMapping
    public TrackSession saveSession(@RequestBody TrackSession session) {
        return trackSessionService.saveSession(session);
    }

    @PutMapping("/{id}")
    public TrackSession updateSession(@PathVariable Long id, @RequestBody TrackSession session) {
        session.setId(id);
        return trackSessionService.saveSession(session);
    }
}
