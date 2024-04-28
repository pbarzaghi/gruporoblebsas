package com.gruporoble.condiciones.service;

import com.gruporoble.condiciones.dto.EmpresaDto;
import com.gruporoble.condiciones.entity.Empresa;

import java.util.List;
import java.util.Optional;

public interface EmpresaService {

    List<EmpresaDto> findAll();

    Optional<Empresa> findById(Long id);

    EmpresaDto save(Empresa empresa);
}
