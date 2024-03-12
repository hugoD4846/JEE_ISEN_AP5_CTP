package lab07.core.service;

import lab07.core.dao.SubjectDAO;
import lab07.core.entity.Subject;

public class SubjectService {

  private final SubjectDAO subjectDAO;

  public SubjectService(SubjectDAO subjectDAO) {
    this.subjectDAO = subjectDAO;
  }

  public Subject findById(long subjectId) {
    return subjectDAO.findById(subjectId).orElse(null);
  }

  public void deleteAll() {
    subjectDAO.deleteAll();
  }

  public void save(Subject subject) {
    subjectDAO.save(subject);
  }
}
