package com.example.demo.repositories;


import com.example.demo.domain.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {

    public static List<Usuario> usuarios = new ArrayList<Usuario>();

    public static List<Usuario> getUsuarios() {
        return usuarios;
    }

    public static Usuario addUsuario(Usuario usuario) {
        usuarios.add(usuario);
        return usuario;
    }

    public static Usuario editUsuario(String nome_velho, String nome_novo) {
        for(Usuario usuario: usuarios){
            if(usuario.getNome().equals(nome_velho)){
                usuario.setNome(nome_novo);
                return usuario;
            }
        }

        return null;
    }
    public static Usuario removeUsuario(Usuario usuario) {
        usuarios.remove(usuario);
        return usuario;
    }

}