package lab07.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import lab07.core.entity.Subject;

public interface SubjectDAO extends JpaRepository<Subject, Long> {

}
