package com.example.teste_analista_dados.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.teste_analista_dados.exceptions.UserFoundException;
import com.example.teste_analista_dados.modules.users.UserEntity;
import com.example.teste_analista_dados.modules.users.UserRepository;

@Service
public class CreateUserUseCase {

    @Autowired
    private UserRepository userRepository;

    public UserEntity execute(UserEntity userEntity) {
        this.userRepository
                .findByNameOrEmail(userEntity.getName(), userEntity.getEmail())
                .ifPresent((user) -> {
                    throw new UserFoundException();
                });

        return this.userRepository.save(userEntity);
    }

}
