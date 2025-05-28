package com.aula.front.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;


@Component
public interface UserRepository extends JpaRepository<usuariomodel, UUID> {

}
