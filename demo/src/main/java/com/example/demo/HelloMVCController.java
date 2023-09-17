package com.example.demo;

import com.example.demo.domain.Usuario;
import com.example.demo.repositories.UsuarioRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HelloMVCController {

    @GetMapping("/usuario")
    public String greetingForm(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "usuario";
    }

    @GetMapping("/usuarios")
    public String listarUsuarios(Model model) {
        List<Usuario> usuarios = UsuarioRepository.getUsuarios();
        model.addAttribute("usuarios", usuarios);
        return "usuarios";
    }

    @PostMapping("/usuario")
    public String greetingSubmit(@ModelAttribute Usuario usuario, Model model) {
        model.addAttribute("usuario", usuario);
        UsuarioRepository.addUsuario(usuario);
        return this.listarUsuarios(model);
//        return "usuarios";
    }

    @DeleteMapping("/deletar/{nome}")
    public String editarUsuario(@PathVariable String nome, Model model) {
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        model.addAttribute("usuario", usuario);
        UsuarioRepository.removeUsuario(usuario);
        return this.listarUsuarios(model);
//        return "editar-usuario"; // Nome da página de edição
    }



}
