package com.michell.cashcard;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

record CashCard(@Id Long id, Double amount, String owner) {
}
