package com.nttdata.bootcamp.service.impl;

import com.nttdata.bootcamp.model.PersonRequestDto;
import com.nttdata.bootcamp.model.PersonResponseDto;
import com.nttdata.bootcamp.service.PersonService;
import com.nttdata.bootcamp.util.Util;
import org.springframework.stereotype.Service;

/**
 * Clase de implementación para la interfaz CompanyService
 */
@Service
public class PersonServiceImpl implements PersonService {

    /**
     * Método que devuelve todos los clientes de tipo personal dentro el repositorio.
     * @return Flowable<PersonResponseDto>
     */
    @Override
    public PersonResponseDto getAll() {
        return Util.getPersonResponseDto();
    }

    /**
     * Devuelve todos los clientes de tipo personal dentro el repositorio segun el id del cliente.
     * @return Maybe<PersonResponseDto>
     */
    @Override
    public PersonResponseDto getPersonById(String personId) {
        return Util.getPersonResponseDto(personId);
    }

    /**
     * Crea un cliente de tipo personal dentro del repositorio con los datos enviados en el body.
     * @param personRequestDto
     * @return Maybe<PersonResponseDto>
     */
    @Override
    public PersonResponseDto createPerson(PersonRequestDto personRequestDto) {
        return Util.createPersonResponseDto(personRequestDto);
    }

    /**
     * Actualiza un cliente de tipo empresarial dentro del repositorio segun los datos enviados en el body.
     * @param personRequestDto
     * @return Maybe<PersonResponseDto>
     */
    @Override
    public PersonResponseDto updatePerson(PersonRequestDto personRequestDto) {
        return Util.createPersonResponseDto(personRequestDto);
    }

}
