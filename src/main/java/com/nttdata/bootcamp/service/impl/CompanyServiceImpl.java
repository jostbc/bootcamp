package com.nttdata.bootcamp.service.impl;

import com.nttdata.bootcamp.model.CompanyRequestDto;
import com.nttdata.bootcamp.model.CompanyResponseDto;
import com.nttdata.bootcamp.service.CompanyService;
import com.nttdata.bootcamp.util.Util;
import org.springframework.stereotype.Service;

/**
 * Clase de implementación para la interfaz CompanyService
 */
@Service
public class CompanyServiceImpl implements CompanyService {

	/*@Autowired
    private CompanyRepository companyRepository;*/

	/**
	 * Método que devuelve todos los clientes de tipo empresarial dentro el repositorio.
	 * @return Flowable<CompanyResponseDto>
	 */
	@Override
	public CompanyResponseDto getAll() {
		return Util.getCompanyResponseDto();
	}

	/**
	 * Devuelve todos los clientes de tipo empresarial dentro el repositorio segun el id del cliente.
	 * @return Maybe<CompanyResponseDto>
	 */
	@Override
	public CompanyResponseDto getCompanyById(String companyId) {
		return Util.getCompanyResponseDto(companyId);
	}

	/**
	 * Crea un cliente de tipo empresarial dentro del repositorio con los datos enviados en el body.
	 * @param companyRequestDto
	 * @return Maybe<CompanyResponseDto>
	 */
	@Override
	public CompanyResponseDto createCompany(CompanyRequestDto companyRequestDto) {
		return Util.createCompanyResponseDto(companyRequestDto);
	}

	/**
	 * Actualiza un cliente de tipo empresarial dentro del repositorio segun los datos enviados en el body.
	 * @param companyRequestDto
	 * @return Maybe<CompanyResponseDto>
	 */
	@Override
	public CompanyResponseDto updateCompany(CompanyRequestDto companyRequestDto) {
		return Util.createCompanyResponseDto(companyRequestDto);
	}

}
