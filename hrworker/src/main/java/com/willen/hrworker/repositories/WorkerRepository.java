package com.willen.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.willen.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
