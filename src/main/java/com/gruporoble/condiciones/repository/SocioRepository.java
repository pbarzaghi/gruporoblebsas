package com.gruporoble.condiciones.repository;

import com.gruporoble.condiciones.entity.Socio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  SocioRepository
        extends JpaRepository<Socio,Long> {

}

