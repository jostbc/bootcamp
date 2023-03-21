package com.nttdata.bootcamp.delegate;

import com.nttdata.bootcamp.api.CreditCardApiDelegate;
import com.nttdata.bootcamp.model.CreditCardRequestDto;
import com.nttdata.bootcamp.model.CreditCardResponseDto;
import org.springframework.http.ResponseEntity;

public class CreditCardDelegateImpl implements CreditCardApiDelegate {
    @Override
    public ResponseEntity<CreditCardResponseDto> consumeCreditCard(CreditCardRequestDto creditCardRequestDto) {
        return CreditCardApiDelegate.super.consumeCreditCard(creditCardRequestDto);
    }

    @Override
    public ResponseEntity<CreditCardResponseDto> createCreditCardCompany(CreditCardRequestDto creditCardRequestDto) {
        return CreditCardApiDelegate.super.createCreditCardCompany(creditCardRequestDto);
    }

    @Override
    public ResponseEntity<CreditCardResponseDto> createCreditCardPerson(CreditCardRequestDto creditCardRequestDto) {
        return CreditCardApiDelegate.super.createCreditCardPerson(creditCardRequestDto);
    }

    @Override
    public ResponseEntity<CreditCardResponseDto> findAllCreditCard() {
        return CreditCardApiDelegate.super.findAllCreditCard();
    }

    @Override
    public ResponseEntity<CreditCardResponseDto> findCreditCardByCustomerId(String customerId) {
        return CreditCardApiDelegate.super.findCreditCardByCustomerId(customerId);
    }

    @Override
    public ResponseEntity<CreditCardResponseDto> findCreditCardById(String creditCardId) {
        return CreditCardApiDelegate.super.findCreditCardById(creditCardId);
    }

    @Override
    public ResponseEntity<CreditCardResponseDto> payCreditCard(CreditCardRequestDto creditCardRequestDto) {
        return CreditCardApiDelegate.super.payCreditCard(creditCardRequestDto);
    }

    @Override
    public ResponseEntity<CreditCardResponseDto> updateCreditCard(CreditCardRequestDto creditCardRequestDto) {
        return CreditCardApiDelegate.super.updateCreditCard(creditCardRequestDto);
    }
}
