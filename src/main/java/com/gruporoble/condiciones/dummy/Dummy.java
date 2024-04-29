package com.gruporoble.condiciones.dummy;

import com.gruporoble.condiciones.dto.EmpresaDto;
import com.gruporoble.condiciones.dto.SocioDto;

import java.util.ArrayList;
import java.util.List;

public  class Dummy {

    public static List<SocioDto> findAllSocio(){
        List<SocioDto> socios= new ArrayList<>();
        SocioDto socioAzul=SocioDto.builder()
                        .id(Long.getLong("1"))
                        .nombreFantasia("Desde la raiz")
                        .email("desdelaraiz@yahoo.com.ar")
                        .telContacto("02281-663489")
                        .localidad("Azul")
                        .cuit("30-71054079-5")
                        .build();
        SocioDto socioJunin=SocioDto.builder()
                .id(Long.getLong("2"))
                .nombreFantasia("Los dos hermanos")
                .email("losdoshermanosjunin@hotmail.com")
                .telContacto("2364-676635")
                .localidad("Junin")
                .cuit("30-71518298-6")
                .build();

        SocioDto socioBalcarce=SocioDto.builder()
                .id(Long.getLong("3"))
                .nombreFantasia("La muebleria")
                .email("lamuebleriabalcarce@outlook.com.ar")
                .telContacto("2266-481963")
                .localidad("Balcarce")
                .cuit("30-71128044-4")
                .build();
        SocioDto socioSaladillo=SocioDto.builder()
                .id(Long.getLong("4"))
                .nombreFantasia("J.L.J Muebles")
                .email("jorgelilli@hotmail.com")
                .telContacto("2345-416933")
                .localidad("Saladillo")
                .cuit("30-71541894-7")
                .build();
        SocioDto socioMarDelPlata=SocioDto.builder()
                .id(Long.getLong("5"))
                .nombreFantasia("Bazar Tiribelli")
                .email("agustintiribelli@gmail.com")
                .telContacto("2235-137764")
                .localidad("Mar del plata")
                .cuit("20-30196142-2")
                .build();
        SocioDto socioTandil=SocioDto.builder()
                .id(Long.getLong("6"))
                .nombreFantasia("Wenceslao Muebles")
                .email("muebles@wenceslaotandil.com.ar")
                .telContacto("2494-563222")
                .localidad("Tandil")
                .cuit("20-27827372-6")
                .build();
        SocioDto socio25deMayo=SocioDto.builder()
                .id(Long.getLong("7"))
                .nombreFantasia("Muebles Pérez Benitez")
                .email("mueblesperezbenitez@hotmail.com")
                .telContacto("2345-512010")
                .localidad("25 de Mayo")
                .cuit("20-27194655-5")
                .build();

        SocioDto socioMercedes=SocioDto.builder()
                .id(Long.getLong("8"))
                .nombreFantasia("El molino muebles")
                .email("info@molinomuebles.com")
                .telContacto("2324-511583")
                .localidad("Mercedes")
                .cuit("20-21971545-6")
                .build();

        SocioDto socioChacabuco=SocioDto.builder()
                .id(Long.getLong("9"))
                .nombreFantasia("Decorcasa")
                .email("Carlos@decorcasa.com.ar")
                .telContacto("2352-560220")
                .localidad("Chacabuco")
                .cuit("27-18159303-8")
                .build();


        SocioDto socioLasFlores=SocioDto.builder()
                .id(Long.getLong("10"))
                .nombreFantasia("Candina Hnos.")
                .email("candinahermanos@hotmail.com")
                .telContacto("2244-426835")
                .localidad("Las Flores")
                .cuit("30-71415828-3")
                .build();
        SocioDto socioDolores=SocioDto.builder()
                .id(Long.getLong("11"))
                .nombreFantasia("Muebles Martinez")
                .email(" mueblesmartinezcastelli@gmail.com")
                .telContacto("2241-673023")
                .localidad("Dolores/Castelli")
                .cuit("20-23088420-0")
                .build();
        socios.add(socioAzul);
        socios.add(socioTandil);
        socios.add(socioBalcarce);
        socios.add(socioJunin);
        socios.add(socioMarDelPlata);
        socios.add(socio25deMayo);
        socios.add(socioSaladillo);
        socios.add(socioMercedes);
        socios.add(socioChacabuco);
        socios.add(socioLasFlores);
        socios.add(socioDolores);
        return  socios;
    }

    public static List<EmpresaDto> findAllEmpresa(){
        List<EmpresaDto> empresas= new ArrayList<>();
        EmpresaDto empresaDto1=EmpresaDto.builder()
                .id(Long.getLong("1"))
                .nombre("Color Living SA")
                .cuit("30-59303662-2")
                .tel("03573-4240000")
                .build();
        EmpresaDto empresaDto2=EmpresaDto.builder()
                .id(Long.getLong("2"))
                .nombre("Mobilia Muebles Macizos S.A")
                .cuit("30-70783960-7")
                .tel("3573-402678")
                .build();
        EmpresaDto empresaDto3=EmpresaDto.builder()
                .id(Long.getLong("3"))
                .nombre("Tables Srl")
                .cuit("30-70888860-1")
                .tel("03464-427109")
                .build();
        EmpresaDto empresaDto4=EmpresaDto.builder()
                .id(Long.getLong("4"))
                .nombre("Dielfe Srl")
                .cuit("30-63990755-0")
                .tel("0341-3178600")
                .build();
        EmpresaDto empresaDto5=EmpresaDto.builder()
                .id(Long.getLong("5"))
                .nombre("Ingenieria Plastica Rosario S.A")
                .cuit("30-54897809-9")
                .tel("0341-5184400")
                .build();
        EmpresaDto empresaDto6=EmpresaDto.builder()
                .id(Long.getLong("6"))
                .nombre("Descansar S.A")
                .cuit("30-70798886-6")
                .tel("03476-47023")
                .build();
        EmpresaDto empresaDto7=EmpresaDto.builder()
                .id(Long.getLong("7"))
                .nombre("La Esperanza Design Srl")
                .cuit("30-71473579-5")
                .tel("03471-422861")
                .build();
        EmpresaDto empresaDto8=EmpresaDto.builder()
                .id(Long.getLong("8"))
                .nombre("Laury D.ME.D")
                .cuit("30-70877997-7")
                .tel("0341-3179000")
                .build();
        EmpresaDto empresaDto9=EmpresaDto.builder()
                .id(Long.getLong("9"))
                .nombre("Jorge Ricchezze S.A")
                .cuit("30-70943259-8")
                .tel("03471-426000")
                .build();


        empresas.add(empresaDto1);
        empresas.add(empresaDto2);
        empresas.add(empresaDto3);
        empresas.add(empresaDto4);
        empresas.add(empresaDto5);
        empresas.add(empresaDto6);
        empresas.add(empresaDto7);
        empresas.add(empresaDto8);
        return empresas;
    }

}
