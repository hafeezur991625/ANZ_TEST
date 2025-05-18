package com.bank.validator.model;

import java.math.BigDecimal;

public record ValidationResult(
        String transactionId,
        String customerId,
        String status,            // "APPROVED" | "REJECTED"
        String reason,            // "Approved" | "Limit exceeded"
        BigDecimal remainingLimit) {
}
