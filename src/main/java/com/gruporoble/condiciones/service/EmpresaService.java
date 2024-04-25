package com.gruporoble.condiciones.service;

import com.gruporoble.condiciones.entity.Empresa;

import java.util.List;
import java.util.Optional;

public interface EmpresaService {

    List<Empresa> findAll();

    Optional<Empresa> findById(Long id);

    Empresa save(Empresa empresa);
}
