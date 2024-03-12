package lab07.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import lab07.core.entity.Grade;

public interface GradeDAO extends JpaRepository<Grade, Long> {

}
