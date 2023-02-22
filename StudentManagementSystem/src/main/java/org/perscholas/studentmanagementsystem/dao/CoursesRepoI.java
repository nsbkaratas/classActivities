package org.perscholas.studentmanagementsystem.dao;

import org.perscholas.studentmanagementsystem.models.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepoI extends JpaRepository<Students, Integer> {
}
