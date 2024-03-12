package lab07.core.service;

import jakarta.transaction.Transactional;
import lab07.core.dao.TypeDAO;
import lab07.core.entity.Type;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TypeService {

    //TODO make it compile by creating the necessary classes (beans) and methods

    private final TypeDAO typeDAO;
    public TypeService(TypeDAO typeDAO) {
        this.typeDAO = typeDAO;
    }

    public List<Type> findAll() {
        return typeDAO.findAll();
    }

    public void deleteAll() {
        typeDAO.deleteAll();
    }

    public void save(Type type) {
        typeDAO.save(type);
    }

    public Type findById(long id) {
        return typeDAO.findById(id).orElse(null);
    }
}
