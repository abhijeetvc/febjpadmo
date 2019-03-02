package com.febjpadmo.febjpadmo.repos;

import com.febjpadmo.febjpadmo.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by abhi on 23/02/19.
 */

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
