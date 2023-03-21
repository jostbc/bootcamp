package com.nttdata.bootcamp.delegate;

import com.nttdata.bootcamp.api.PersonApiDelegate;
import com.nttdata.bootcamp.model.PersonRequestDto;
import com.nttdata.bootcamp.model.PersonResponseDto;
import com.nttdata.bootcamp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;

@Service
public class PersonDelegateImpl implements PersonApiDelegate {

    @Autowired
    private PersonService personService;

    @Override
    public ResponseEntity<PersonResponseDto> createPerson(PersonRequestDto personRequestDto) {
        return ResponseEntity.ok(personService.createPerson(personRequestDto));
    }

    @Override
    public ResponseEntity<PersonResponseDto> findAllPerson() {
        return ResponseEntity.ok(personService.getAll());
    }

    @Override
    public ResponseEntity<PersonResponseDto> findPersonById(String personId) {
        return ResponseEntity.ok(personService.getPersonById(personId));
    }

    @Override
    public ResponseEntity<PersonResponseDto> updatePerson(PersonRequestDto personRequestDto) {
        return ResponseEntity.ok(personService.updatePerson(personRequestDto));
    }
}
