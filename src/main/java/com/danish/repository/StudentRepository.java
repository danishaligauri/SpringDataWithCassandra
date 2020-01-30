package com.danish.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.danish.entity.Student;

@Repository
public interface StudentRepository extends CassandraRepository<Student, Long> {

}
