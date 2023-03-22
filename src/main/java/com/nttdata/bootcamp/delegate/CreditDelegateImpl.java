package com.nttdata.bootcamp.delegate;

import com.nttdata.bootcamp.api.CreditApiDelegate;
import com.nttdata.bootcamp.model.CreditPayRequestDto;
import com.nttdata.bootcamp.model.CreditPayResponseDto;
import com.nttdata.bootcamp.model.CreditRequestDto;
import com.nttdata.bootcamp.model.CreditResponseDto;
import com.nttdata.bootcamp.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CreditDelegateImpl implements CreditApiDelegate {

    @Autowired
    CreditService creditService;

    @Override
    public ResponseEntity<CreditResponseDto> createCreditCompany(CreditRequestDto creditRequestDto) {
        return ResponseEntity.ok(creditService.createCredit(creditRequestDto).blockingGet());
    }

    @Override
    public ResponseEntity<CreditResponseDto> createCreditPerson(CreditRequestDto creditRequestDto) {
        return ResponseEntity.ok(creditService.createCredit(creditRequestDto).blockingGet());
    }

    @Override
    public ResponseEntity<CreditResponseDto> findAllCredit() {
        return ResponseEntity.ok(creditService.getAll().blockingFirst());
    }

    @Override
    public ResponseEntity<CreditResponseDto> findCreditById(String creditId) {
        return ResponseEntity.ok(creditService.getCreditById(creditId).blockingGet());
    }


    @Override
    public ResponseEntity<CreditResponseDto> updateCredit(CreditRequestDto creditRequestDto) {
        return ResponseEntity.ok(creditService.updateCredit(creditRequestDto).blockingGet());
    }

    @Override
    public ResponseEntity<CreditPayResponseDto> payCredit(CreditPayRequestDto creditPayRequestDto) {
        return ResponseEntity.ok(creditService.payCredit(creditPayRequestDto).blockingGet());
    }
}
