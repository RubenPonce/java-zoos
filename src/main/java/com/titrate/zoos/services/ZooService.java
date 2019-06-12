package com.titrate.zoos.services;

import com.titrate.zoos.models.Zoo;

import java.util.ArrayList;

public interface ZooService {
    ArrayList<Zoo> findAll();

    void delete(long id);

    ArrayList<Zoo> getCountStudentsInCourses();
}
