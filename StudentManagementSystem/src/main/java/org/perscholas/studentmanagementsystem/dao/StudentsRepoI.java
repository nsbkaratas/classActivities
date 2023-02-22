package org.perscholas.studentmanagementsystem.dao;

import org.perscholas.studentmanagementsystem.models.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentsRepoI extends JpaRepository<Students, Integer> {

    Optional<Students> findByName(String name);
}
