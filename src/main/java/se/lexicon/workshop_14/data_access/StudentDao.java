package se.lexicon.workshop_14.data_access;

import org.springframework.stereotype.Repository;
import se.lexicon.workshop_14.data_access.model.Student;

import java.util.List;

@Repository
public interface StudentDao {

    public Student save(Student student);

    public Student findById(int id);

    List<Student> findAll();

    public void deleteById(int id);
}
