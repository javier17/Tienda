package com.tienda.models.service;

import com.tienda.models.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}
