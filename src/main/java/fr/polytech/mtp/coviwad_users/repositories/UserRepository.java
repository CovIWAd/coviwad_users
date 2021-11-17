package fr.polytech.mtp.coviwad_users.repositories;
import fr.polytech.mtp.coviwad_users.models.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, String>{
}
