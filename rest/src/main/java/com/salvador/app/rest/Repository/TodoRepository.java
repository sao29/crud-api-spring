package com.salvador.app.rest.Repository;

import com.salvador.app.rest.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Task, Long> {
}
