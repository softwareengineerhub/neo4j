package com.example.appspringdata.repository;

import com.example.appspringdata.entity.Person;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

public interface PersonRepository extends Neo4jRepository<Person, String> {
}