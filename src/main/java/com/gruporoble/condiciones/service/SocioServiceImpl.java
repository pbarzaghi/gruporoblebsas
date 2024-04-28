package com.gruporoble.condiciones.service;

import com.gruporoble.condiciones.dto.SocioDto;
import com.gruporoble.condiciones.dummy.Dummy;
import com.gruporoble.condiciones.entity.Socio;
import com.gruporoble.condiciones.repository.SocioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SocioServiceImpl implements  SocioService{

    private SocioRepository socioRepository;



    @Override
    public List<SocioDto> findAll() {
     //   return socioRepository.findAll();
        return Dummy.findAllSocio();
    }

    @Override
    public Optional<Socio> findById(Long id) {
        return socioRepository.findById(id);
    }

    @Override
    public SocioDto save(SocioDto socio) {
        Socio socio1=new Socio();
      socioRepository.save(socio1);
      return socio;
    }
}
