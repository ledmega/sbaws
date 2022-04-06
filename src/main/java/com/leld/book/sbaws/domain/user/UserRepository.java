package com.leld.book.sbaws.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User2,Long> {
    Optional<User2> findByEmail(String email);
}
