package com.example.teste_analista_dados.modules.wallets;

import java.util.UUID;

import com.example.teste_analista_dados.modules.users.UserEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity(name = "wallets")
@Data
public class WalletEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne()
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private UserEntity userEntity;

    @Column(name = "user_id", nullable = false)
    private UUID user_id;
}
