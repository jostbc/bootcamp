package com.nttdata.bootcamp.service;

import com.nttdata.bootcamp.model.PersonRequestDto;
import com.nttdata.bootcamp.model.PersonResponseDto;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;

/**
 * Clase interfaz de servicio para las clientes personales
 */
public interface PersonService {

    PersonResponseDto getAll();

    PersonResponseDto getPersonById(String personId);

    PersonResponseDto createPerson(PersonRequestDto personRequestDto);

    PersonResponseDto updatePerson(PersonRequestDto personRequestDto);

}