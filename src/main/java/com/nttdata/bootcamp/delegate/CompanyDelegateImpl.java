package com.nttdata.bootcamp.delegate;

import com.nttdata.bootcamp.api.CompanyApiDelegate;
import com.nttdata.bootcamp.model.CompanyRequestDto;
import com.nttdata.bootcamp.model.CompanyResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

public class CompanyDelegateImpl implements CompanyApiDelegate {
    @Override
    public Optional<NativeWebRequest> getRequest() {
        return CompanyApiDelegate.super.getRequest();
    }

    @Override
    public ResponseEntity<CompanyResponseDto> createCompany(CompanyRequestDto companyRequestDto) {
        return CompanyApiDelegate.super.createCompany(companyRequestDto);
    }

    @Override
    public ResponseEntity<CompanyResponseDto> findAllCompany() {
        return CompanyApiDelegate.super.findAllCompany();
    }

    @Override
    public ResponseEntity<CompanyResponseDto> findCompanyById(String companyId) {
        return CompanyApiDelegate.super.findCompanyById(companyId);
    }

    @Override
    public ResponseEntity<CompanyResponseDto> updateCompany(CompanyRequestDto companyRequestDto) {
        return CompanyApiDelegate.super.updateCompany(companyRequestDto);
    }
}
