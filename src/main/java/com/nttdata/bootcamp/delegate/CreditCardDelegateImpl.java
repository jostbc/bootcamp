package com.nttdata.bootcamp.delegate;

import com.nttdata.bootcamp.api.CreditCardApiDelegate;
import com.nttdata.bootcamp.model.CreditCardConsumeRequestDto;
import com.nttdata.bootcamp.model.CreditCardConsumeResponseDto;
import com.nttdata.bootcamp.model.CreditCardPayRequestDto;
import com.nttdata.bootcamp.model.CreditCardPayResponseDto;
import com.nttdata.bootcamp.model.CreditCardRequestDto;
import com.nttdata.bootcamp.model.CreditCardResponseDto;
import com.nttdata.bootcamp.service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CreditCardDelegateImpl implements CreditCardApiDelegate {

    @Autowired
    CreditCardService creditCardService;

    @Override
    public ResponseEntity<CreditCardResponseDto> createCreditCardCompany(CreditCardRequestDto creditCardRequestDto) {
        return ResponseEntity.ok(creditCardService.createCreditCard(creditCardRequestDto).blockingGet());
    }

    @Override
    public ResponseEntity<CreditCardResponseDto> createCreditCardPerson(CreditCardRequestDto creditCardRequestDto) {
        return ResponseEntity.ok(creditCardService.createCreditCard(creditCardRequestDto).blockingGet());
    }

    @Override
    public ResponseEntity<CreditCardResponseDto> findAllCreditCard() {
        return ResponseEntity.ok(creditCardService.getAll().blockingFirst());
    }

    @Override
    public ResponseEntity<CreditCardResponseDto> findCreditCardByCustomerId(String customerId) {
        return CreditCardApiDelegate.super.findCreditCardByCustomerId(customerId);
    }

    @Override
    public ResponseEntity<CreditCardResponseDto> findCreditCardById(String creditCardId) {
        return ResponseEntity.ok(creditCardService.getCreditCardById(creditCardId).blockingGet());
    }

    @Override
    public ResponseEntity<CreditCardResponseDto> updateCreditCard(CreditCardRequestDto creditCardRequestDto) {
        return ResponseEntity.ok(creditCardService.updateCreditCard(creditCardRequestDto).blockingGet());
    }

    @Override
    public ResponseEntity<CreditCardConsumeResponseDto> consumeCreditCard(CreditCardConsumeRequestDto creditCardConsumeRequestDto) {
        return ResponseEntity.ok(creditCardService.consumeCreditCard(creditCardConsumeRequestDto).blockingGet());
    }

    @Override
    public ResponseEntity<CreditCardPayResponseDto> payCreditCard(CreditCardPayRequestDto creditCardPayRequestDto) {
        return ResponseEntity.ok(creditCardService.payCreditCard(creditCardPayRequestDto).blockingGet());
    }
}
