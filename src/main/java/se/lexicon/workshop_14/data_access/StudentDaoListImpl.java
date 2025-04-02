package se.lexicon.workshop_14.data_access;

import org.springframework.stereotype.Repository;
import se.lexicon.workshop_14.data_access.model.Student;

import java.util.List;
import java.util.Objects;

@Repository
public class StudentDaoListImpl implements StudentDao {

    public static List<Student> students;

    public StudentDaoListImpl() {
    }

    @Override
    public Student save(Student student) {
        Objects.requireNonNull(student);
        students.add(student);
        return student;
    }

    @Override
    public Student findById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        throw new IllegalArgumentException("Student with id " + id + " not found");
    }

    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                return;
            }
        }
        throw new IllegalArgumentException("Student with id " + id + " not found");
    }
}
