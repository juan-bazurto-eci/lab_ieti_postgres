package eci.ieti.postgres.repository;

import eci.ieti.postgres.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}


