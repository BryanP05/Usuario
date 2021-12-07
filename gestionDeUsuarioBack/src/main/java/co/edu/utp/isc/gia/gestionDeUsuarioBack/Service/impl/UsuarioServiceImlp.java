package co.edu.utp.isc.gia.gestionDeUsuarioBack.Service.impl;

import co.edu.utp.isc.gia.gestionDeUsuarioBack.Entities.UsuarioEntity;
import co.edu.utp.isc.gia.gestionDeUsuarioBack.Repository.UsuarioRepositorio;
import co.edu.utp.isc.gia.gestionDeUsuarioBack.Service.UsuarioService;
import co.edu.utp.isc.gia.gestionDeUsuarioBack.dto.UsuarioDTO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor

public class UsuarioServiceImlp implements UsuarioService {

    private UsuarioRepositorio usuarioRepositorio;

    private ModelMapper modelMapper;

    @Override
    public UsuarioDTO guardarUsuario(UsuarioDTO usuarioDTO) {
        UsuarioEntity usuarioEntityper= new UsuarioEntity();

        UsuarioEntity usuarioEntity1 = usuarioRepositorio.save(modelMapper.map(usuarioDTO, UsuarioEntity.class));
        UsuarioDTO usuarioDTO1=modelMapper.map(usuarioEntityper,UsuarioDTO.class);


        return usuarioDTO1;
    }


}
