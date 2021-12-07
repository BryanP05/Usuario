package co.edu.utp.isc.gia.gestionDeUsuarioBack.Controller;

import co.edu.utp.isc.gia.gestionDeUsuarioBack.Service.UsuarioService;
import co.edu.utp.isc.gia.gestionDeUsuarioBack.Service.impl.UsuarioServiceImlp;
import co.edu.utp.isc.gia.gestionDeUsuarioBack.dto.UsuarioDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuario")

public class UsuarioController {
    private UsuarioService usuarioService;

    @PostMapping()
    public UsuarioDTO guardarUsuario(UsuarioDTO usuarioDTO){

        return usuarioService.guardarUsuario(usuarioDTO);
    }
}
