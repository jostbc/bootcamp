package com.nttdata.bootcamp.delegate;

import com.nttdata.bootcamp.api.CreditApiDelegate;
import com.nttdata.bootcamp.model.CreditRequestDto;
import com.nttdata.bootcamp.model.CreditResponseDto;
import org.springframework.http.ResponseEntity;

public class CreditDelegateImpl implements CreditApiDelegate {

    @Override
    public ResponseEntity<CreditResponseDto> createCreditCompany(CreditRequestDto creditRequestDto) {
        return CreditApiDelegate.super.createCreditCompany(creditRequestDto);
    }

    @Override
    public ResponseEntity<CreditResponseDto> createCreditPerson(CreditRequestDto creditRequestDto) {
        return CreditApiDelegate.super.createCreditPerson(creditRequestDto);
    }

    @Override
    public ResponseEntity<CreditResponseDto> findAllCredit() {
        return CreditApiDelegate.super.findAllCredit();
    }

    @Override
    public ResponseEntity<CreditResponseDto> findCreditById(String creditId) {
        return CreditApiDelegate.super.findCreditById(creditId);
    }

    @Override
    public ResponseEntity<CreditResponseDto> payCredit(CreditRequestDto creditRequestDto) {
        return CreditApiDelegate.super.payCredit(creditRequestDto);
    }

    @Override
    public ResponseEntity<CreditResponseDto> updateCredit(CreditRequestDto creditRequestDto) {
        return CreditApiDelegate.super.updateCredit(creditRequestDto);
    }
}
