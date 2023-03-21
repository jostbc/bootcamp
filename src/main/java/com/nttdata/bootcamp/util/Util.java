package com.nttdata.bootcamp.util;

import com.nttdata.bootcamp.model.*;

import java.util.ArrayList;
import java.util.List;

public class Util {

    public static List<Person> getPerson() {
        List<Person> listPerson = new ArrayList<>();
        Person person1=new Person();
        person1.setId("1");
        person1.setName("Juan");
        person1.setLastName("Alvarez");
        person1.setDni("78545963");
        person1.setEmail("juaal@correo.com");
        person1.setTelephone("958632154");
        Person person2=new Person();
        person2.setId("2");
        person2.setName("Jose");
        person2.setLastName("Alvarez");
        person2.setDni("78545963");
        person2.setEmail("juaal@correo.com");
        person2.setTelephone("958632154");
        Person person3=new Person();
        person3.setId("3");
        person3.setName("Alberto");
        person3.setLastName("Alvarez");
        person3.setDni("78545963");
        person3.setEmail("juaal@correo.com");
        person3.setTelephone("958632154");
        Person person4=new Person();
        person4.setId("4");
        person4.setName("Antonio");
        person4.setLastName("Alvarez");
        person4.setDni("78545963");
        person4.setEmail("juaal@correo.com");
        person4.setTelephone("958632154");
        listPerson.add(person1);
        listPerson.add(person2);
        listPerson.add(person3);
        listPerson.add(person4);
        return listPerson;
    }

    public static MessageStatus getMessageStatus() {
        MessageStatus messageStatus=new MessageStatus();
        messageStatus.setMessage("Operacion exitosa");
        messageStatus.setStatusCode("0");
        return messageStatus;
    }

    public static PersonResponseDto getPersonResponseDto() {
        PersonResponseDto personResponseDto=new PersonResponseDto();
        personResponseDto.setStatusDto(getMessageStatus());
        personResponseDto.setPerson(getPerson());
        return personResponseDto;
    }
    public static PersonResponseDto getPersonResponseDto(String id) {
        Integer idInt = Integer.parseInt(id);
        Person person = getPerson().get(idInt-1);
        List<Person> personList = new ArrayList<>();
        personList.add(person);
        PersonResponseDto personResponseDto=new PersonResponseDto();
        personResponseDto.setStatusDto(getMessageStatus());
        personResponseDto.setPerson(personList);
        return personResponseDto;
    }
    public static PersonResponseDto createPersonResponseDto(PersonRequestDto personRequestDto) {
        Person person = new Person();
        person.setId(personRequestDto.getId());
        person.setName(personRequestDto.getName());
        person.setLastName(personRequestDto.getLastName());
        person.setDni(personRequestDto.getDni());
        person.setEmail(personRequestDto.getEmail());
        person.setTelephone(personRequestDto.getTelephone());
        List<Person> personList = new ArrayList<>();
        personList.add(person);
        PersonResponseDto personResponseDto=new PersonResponseDto();
        personResponseDto.setStatusDto(getMessageStatus());
        personResponseDto.setPerson(personList);
        return personResponseDto;
    }

    public static List<Company> getCompany() {
        List<Company> listCompany = new ArrayList<>();
        List<AuthorizedDto> listHolders= new ArrayList<>();
        List<AuthorizedDto> listSignatories= new ArrayList<>();
        AuthorizedDto authorizedDto=new AuthorizedDto();
        authorizedDto.setName("Juan");
        authorizedDto.setLastName("Alvarez");
        authorizedDto.setDni("78524556");
        authorizedDto.setEmail("juaal@correo.com");
        authorizedDto.setTelephone("958632154");
        listHolders.add(authorizedDto);
        Company company1=new Company();
        company1.setId("1");
        company1.setBusinessName("Olar");
        company1.setRuc("10254589650");
        company1.setEmail("juaal@correo.com");
        company1.setTelephone("958632154");
        company1.setHolders(listHolders);
        company1.setSignatories(listSignatories);
        Company company2=new Company();
        company2.setId("2");
        company2.setBusinessName("Olar");
        company2.setRuc("10856493250");
        company2.setEmail("juaal@correo.com");
        company2.setTelephone("958632154");
        company2.setHolders(listHolders);
        company2.setSignatories(listSignatories);
        Company company3=new Company();
        company3.setId("3");
        company3.setBusinessName("ASDzxc");
        company3.setRuc("10856493278");
        company3.setEmail("juaal@correo.com");
        company3.setTelephone("958632154");
        company3.setHolders(listHolders);
        company3.setSignatories(listSignatories);
        Company company4=new Company();
        company4.setId("4");
        company4.setBusinessName("Losed");
        company4.setRuc("10856494150");
        company4.setEmail("juaal@correo.com");
        company4.setTelephone("958632154");
        company4.setHolders(listHolders);
        company4.setSignatories(listSignatories);
        listCompany.add(company1);
        listCompany.add(company2);
        listCompany.add(company3);
        listCompany.add(company4);
        return listCompany;
    }

    public static CompanyResponseDto getCompanyResponseDto() {
        CompanyResponseDto companyResponseDto=new CompanyResponseDto();
        companyResponseDto.setStatusDto(getMessageStatus());
        companyResponseDto.setCompany(getCompany());
        return companyResponseDto;
    }
    public static CompanyResponseDto getCompanyResponseDto(String id) {
        Integer idInt = Integer.parseInt(id);
        Company company = getCompany().get(idInt-1);
        List<Company> companyList = new ArrayList<>();
        companyList.add(company);
        CompanyResponseDto companyResponseDto=new CompanyResponseDto();
        companyResponseDto.setStatusDto(getMessageStatus());
        companyResponseDto.setCompany(companyList);
        return companyResponseDto;
    }
    public static CompanyResponseDto createCompanyResponseDto(CompanyRequestDto companyRequestDto) {
        List<Company> listCompany = new ArrayList<>();
        List<AuthorizedDto> listHolders= new ArrayList<>();
        List<AuthorizedDto> listSignatories= new ArrayList<>();
        AuthorizedDto authorizedDto=new AuthorizedDto();
        authorizedDto.setName(companyRequestDto.getHolders().get(0).getName());
        authorizedDto.setLastName(companyRequestDto.getHolders().get(0).getLastName());
        authorizedDto.setDni(companyRequestDto.getHolders().get(0).getDni());
        authorizedDto.setEmail(companyRequestDto.getHolders().get(0).getEmail());
        authorizedDto.setTelephone(companyRequestDto.getHolders().get(0).getTelephone());
        listHolders.add(authorizedDto);
        Company company1=new Company();
        company1.setId(companyRequestDto.getId());
        company1.setBusinessName(companyRequestDto.getBusinessName());
        company1.setRuc(companyRequestDto.getRuc());
        company1.setEmail(companyRequestDto.getEmail());
        company1.setTelephone(companyRequestDto.getTelephone());
        company1.setHolders(listHolders);
        company1.setSignatories(listSignatories);
        CompanyResponseDto companyResponseDto=new CompanyResponseDto();
        companyResponseDto.setStatusDto(getMessageStatus());
        companyResponseDto.setCompany(listCompany);
        return companyResponseDto;
    }



}
