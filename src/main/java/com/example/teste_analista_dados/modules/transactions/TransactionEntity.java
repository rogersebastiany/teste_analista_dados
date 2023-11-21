package com.example.teste_analista_dados.modules.transactions;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import com.example.teste_analista_dados.modules.wallets.WalletEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity(name = "transactions")
@Data
public class TransactionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @OneToOne
    @JoinColumn(name = "wallet_id", insertable = false, updatable = false)
    private WalletEntity walletEntity;

    @Column(name = "wallet_id", nullable = false)
    private UUID wallet_id;

    private String type;

    private BigDecimal amount;

    @CreationTimestamp
    private LocalDateTime createdAt;

    private String status;

    private String src;
}
