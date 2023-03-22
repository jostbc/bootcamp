package com.nttdata.bootcamp.delegate;

import com.nttdata.bootcamp.api.CompanyApiDelegate;
import com.nttdata.bootcamp.model.CompanyRequestDto;
import com.nttdata.bootcamp.model.CompanyResponseDto;
import com.nttdata.bootcamp.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CompanyDelegateImpl implements CompanyApiDelegate {

    @Autowired
    private CompanyService companyService;

    @Override
    public ResponseEntity<CompanyResponseDto> createCompany(CompanyRequestDto companyRequestDto) {
        return ResponseEntity.ok(companyService.createCompany(companyRequestDto).blockingGet());
    }

    @Override
    public ResponseEntity<CompanyResponseDto> findAllCompany() {
        return ResponseEntity.ok(companyService.getAll().blockingFirst());
    }

    @Override
    public ResponseEntity<CompanyResponseDto> findCompanyById(String companyId) {
        return ResponseEntity.ok(companyService.getCompanyById(companyId).blockingGet());
    }

    @Override
    public ResponseEntity<CompanyResponseDto> updateCompany(CompanyRequestDto companyRequestDto) {
        return ResponseEntity.ok(companyService.updateCompany(companyRequestDto).blockingGet());
    }
}
