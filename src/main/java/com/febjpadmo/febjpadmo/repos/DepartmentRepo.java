package com.febjpadmo.febjpadmo.repos;

import com.febjpadmo.febjpadmo.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by abhi on 24/02/19.
 */
public interface DepartmentRepo extends JpaRepository<Department,Integer> {
}
