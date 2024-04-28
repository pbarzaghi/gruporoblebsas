package com.gruporoble.condiciones.service;



import com.gruporoble.condiciones.dto.SocioDto;
import com.gruporoble.condiciones.entity.Socio;

import java.util.List;
import java.util.Optional;

public interface SocioService {

    List<SocioDto> findAll();

    Optional<Socio> findById(Long id);

    SocioDto save(SocioDto socio);
}
