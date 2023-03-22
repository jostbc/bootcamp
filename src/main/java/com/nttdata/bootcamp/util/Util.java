package com.nttdata.bootcamp.util;

import com.nttdata.bootcamp.model.Company;
import com.nttdata.bootcamp.model.CompanyResponseDto;
import com.nttdata.bootcamp.model.MessageStatus;
import com.nttdata.bootcamp.model.Person;
import com.nttdata.bootcamp.model.PersonResponseDto;

import java.util.List;

public class Util {

    public static PersonResponseDto personToResponse(List<Person> person){
        PersonResponseDto personResponseDto = new PersonResponseDto();
        MessageStatus msg = new MessageStatus();
        if (person.size()>0){
            msg.setStatusCode("0");
            msg.setMessage("Operación exitosa.");
            personResponseDto.setStatusDto(msg);
            personResponseDto.setPerson(person);
        }
        else{
            msg.setStatusCode("1");
            msg.setMessage("No existen clientes personales.");
            personResponseDto.setStatusDto(msg);
            personResponseDto.setPerson(person);
        }
        return personResponseDto;
    }

    public static CompanyResponseDto companyToResponse(List<Company> company){
        CompanyResponseDto companyResponseDto = new CompanyResponseDto();
        MessageStatus msg = new MessageStatus();
        if (company.size()>0){
            msg.setStatusCode("0");
            msg.setMessage("Operación exitosa.");
            companyResponseDto.setStatusDto(msg);
            companyResponseDto.setCompany(company);
        }
        else{
            msg.setStatusCode("1");
            msg.setMessage("No existen clientes empresariales.");
            companyResponseDto.setStatusDto(msg);
            companyResponseDto.setCompany(company);
        }
        return companyResponseDto;
    }
}
