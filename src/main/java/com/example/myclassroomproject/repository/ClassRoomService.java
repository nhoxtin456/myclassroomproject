/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.myclassroomproject.repository;

import com.example.myclassroomproject.model.ClassRoom;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author MINHKHOA
 */
public interface ClassRoomService extends MongoRepository<ClassRoom, String> {

}
