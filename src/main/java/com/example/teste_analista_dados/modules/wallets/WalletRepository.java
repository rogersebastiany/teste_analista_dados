package com.example.teste_analista_dados.modules.wallets;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<WalletEntity, UUID> {

}
