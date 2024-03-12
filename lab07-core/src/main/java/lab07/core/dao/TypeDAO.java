package lab07.core.dao;

import lab07.core.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeDAO extends JpaRepository<Type, Long> {
}
