package com.titrate.zoos.repos;

import com.titrate.zoos.models.Zoo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ZooRepository extends CrudRepository<Zoo, Long> {
    /*
SELECT *
FROM zooanimals

     */
    @Query(value="SELECT zooid FROM zooanimals", nativeQuery = true)
    ArrayList<Integer> getCountStudentsInCourses();
}
