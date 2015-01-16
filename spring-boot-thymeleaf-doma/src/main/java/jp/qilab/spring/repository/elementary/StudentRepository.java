package jp.qilab.spring.repository.elementary;

import jp.qilab.spring.domain.elementary.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
