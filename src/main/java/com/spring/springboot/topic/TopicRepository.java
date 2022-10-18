package com.spring.springboot.topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface TopicRepository extends CrudRepository<Topic, Integer>{

}
