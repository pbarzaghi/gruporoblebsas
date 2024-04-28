package com.gruporoble.condiciones.service;

import com.gruporoble.condiciones.dto.EmpresaDto;
import com.gruporoble.condiciones.dummy.Dummy;
import com.gruporoble.condiciones.entity.Empresa;
import com.gruporoble.condiciones.repository.EmpresaRepository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EmpresaServiceImpl implements EmpresaService{

   private EmpresaRepository empresaRepository;

    @Override
    public List<EmpresaDto> findAll() {

       // return empresaRepository.findAll();
        return Dummy.findAllEmpresa();
    }

    @Override
    public Optional<Empresa> findById(Long id) {

        return empresaRepository.findById(id);
    }

    @Override
    public EmpresaDto save(Empresa empresa) {

        empresaRepository.save(empresa);
        return new EmpresaDto();
    }
}
