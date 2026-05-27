package ni.edu.uam.mindtrack_api.services;

import ni.edu.uam.mindtrack_api.models.Usuario;
import ni.edu.uam.mindtrack_api.repository.UsuarioRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepo usuarioRepo;

    public UsuarioService(UsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    public List<Usuario> getAllUsuarios() {
        return usuarioRepo.findAll();
    }

    public Usuario getUsuarioById(Long id) {
        return usuarioRepo.findById(id).orElse(null);
    }

    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRepo.save(usuario);
    }

    public Usuario deleteUsuario(Long id) {
        usuarioRepo.deleteById(id);
        return null;
    }
}