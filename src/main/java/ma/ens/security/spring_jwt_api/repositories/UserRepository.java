package ma.ens.security.spring_jwt_api.repositories;

import ma.ens.security.spring_jwt_api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}