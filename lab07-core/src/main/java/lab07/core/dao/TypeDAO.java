package lab07.core.dao;

import lab07.core.entity.Student;
import lab07.core.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TypeDAO extends JpaRepository<Type, Long> {
}
