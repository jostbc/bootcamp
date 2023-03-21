package com.nttdata.bootcamp.service;

import com.nttdata.bootcamp.model.CompanyRequestDto;
import com.nttdata.bootcamp.model.CompanyResponseDto;
/**
 * Clase interfaz de servicio para las clientes empresariales
 */
public interface CompanyService {

	CompanyResponseDto getAll();

	CompanyResponseDto getCompanyById(String companyId);

	CompanyResponseDto createCompany(CompanyRequestDto companyRequestDto);

	CompanyResponseDto updateCompany(CompanyRequestDto companyRequestDto);

}
