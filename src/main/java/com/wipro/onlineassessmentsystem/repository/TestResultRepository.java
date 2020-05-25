package com.wipro.onlineassessmentsystem.repository;

import com.wipro.onlineassessmentsystem.model.TestResult;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestResultRepository extends CrudRepository<TestResult, String> {
}
