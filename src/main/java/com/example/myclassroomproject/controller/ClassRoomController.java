/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.myclassroomproject.controller;

import com.example.myclassroomproject.model.ClassRoom;
import com.example.myclassroomproject.repository.ClassRoomService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author MINHKHOA
 */
@RestController
public class ClassRoomController {

    @Autowired
    private ClassRoomService service;

    //GET list items
    @GetMapping("/classroomrestful")
    Iterable<ClassRoom> readAll() {
        return service.findAll();
    }

    // GET single item
    @GetMapping("/classroomrestful/{id}")
    ClassRoom read(@PathVariable String id) {
        return service.findById(id)
                .orElseThrow(() -> new RuntimeException("Not found"));
    }

    // POST create item
    @PostMapping("/classroomrestful")
    ClassRoom create(@RequestBody ClassRoom newClassRoom) {
        return service.save(newClassRoom);
    }

    // PUT edit item
    @PutMapping("/classroomrestful/{id}")
    ClassRoom update(@RequestBody ClassRoom edittedClassRoom, @PathVariable String id) {
        return service.findById(id)
                .map(classroom -> {
                    classroom.setName(edittedClassRoom.getName());
                    classroom.setTeacher(edittedClassRoom.getTeacher());
                    classroom.setAmount(edittedClassRoom.getAmount());
                    return service.save(classroom);
                })
                .orElseGet(() -> {
                    edittedClassRoom.setId(id);
                    return service.save(edittedClassRoom);
                });
    }

    // DELETE remove item
    @DeleteMapping("/classroomrestful/{id}")
    void delete(@PathVariable String id) {
        service.deleteById(id);
    }
}
