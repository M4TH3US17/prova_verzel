package com.example.demo.infrastructure.request.usuarios;

import com.example.demo.application.dto.UsuarioDTO;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL) @Data
public class RegisterUsuarioRequest extends UsuarioDTO {
    private String Senha;
}