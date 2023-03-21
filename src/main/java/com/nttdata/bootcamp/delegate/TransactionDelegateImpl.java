package com.nttdata.bootcamp.delegate;

import com.nttdata.bootcamp.api.TransactionApiDelegate;
import com.nttdata.bootcamp.model.TransactionRequestDto;
import com.nttdata.bootcamp.model.TransactionResponseDto;
import org.springframework.http.ResponseEntity;

public class TransactionDelegateImpl implements TransactionApiDelegate {
    @Override
    public ResponseEntity<TransactionResponseDto> createTransaction(TransactionRequestDto transactionRequestDto) {
        return TransactionApiDelegate.super.createTransaction(transactionRequestDto);
    }

    @Override
    public ResponseEntity<TransactionResponseDto> findAllTransaction() {
        return TransactionApiDelegate.super.findAllTransaction();
    }

    @Override
    public ResponseEntity<TransactionResponseDto> findTransactionByCustomerId(String customerId) {
        return TransactionApiDelegate.super.findTransactionByCustomerId(customerId);
    }

    @Override
    public ResponseEntity<TransactionResponseDto> findTransactionById(String transactionId) {
        return TransactionApiDelegate.super.findTransactionById(transactionId);
    }

    @Override
    public ResponseEntity<TransactionResponseDto> findTransactionByProductId(String productId) {
        return TransactionApiDelegate.super.findTransactionByProductId(productId);
    }

    @Override
    public ResponseEntity<TransactionResponseDto> updateTransaction(TransactionRequestDto transactionRequestDto) {
        return TransactionApiDelegate.super.updateTransaction(transactionRequestDto);
    }
}
