package com.nttdata.bootcamp.delegate;

import com.nttdata.bootcamp.api.AccountApiDelegate;
import com.nttdata.bootcamp.model.AccountRequestDto;
import com.nttdata.bootcamp.model.AccountResponseDto;
import org.springframework.http.ResponseEntity;

public class AccountDelegateImpl implements AccountApiDelegate {
    @Override
    public ResponseEntity<AccountResponseDto> createAccountCompany(AccountRequestDto accountRequestDto) {
        return AccountApiDelegate.super.createAccountCompany(accountRequestDto);
    }

    @Override
    public ResponseEntity<AccountResponseDto> createAccountPerson(AccountRequestDto accountRequestDto) {
        return AccountApiDelegate.super.createAccountPerson(accountRequestDto);
    }

    @Override
    public ResponseEntity<AccountResponseDto> depositAccount(AccountRequestDto accountRequestDto) {
        return AccountApiDelegate.super.depositAccount(accountRequestDto);
    }

    @Override
    public ResponseEntity<AccountResponseDto> findAccountByCustomerId(String customerId) {
        return AccountApiDelegate.super.findAccountByCustomerId(customerId);
    }

    @Override
    public ResponseEntity<AccountResponseDto> findAccountById(String accountId) {
        return AccountApiDelegate.super.findAccountById(accountId);
    }

    @Override
    public ResponseEntity<AccountResponseDto> findAllAccount() {
        return AccountApiDelegate.super.findAllAccount();
    }

    @Override
    public ResponseEntity<AccountResponseDto> updateAccount(AccountRequestDto accountRequestDto) {
        return AccountApiDelegate.super.updateAccount(accountRequestDto);
    }

    @Override
    public ResponseEntity<AccountResponseDto> withdrawAccount(AccountRequestDto accountRequestDto) {
        return AccountApiDelegate.super.withdrawAccount(accountRequestDto);
    }
}
