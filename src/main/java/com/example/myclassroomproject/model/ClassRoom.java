/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.myclassroomproject.model;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author MINHKHOA
 */
@Document(collection = "tblclassroom")
public class ClassRoom implements Serializable {

    @Id
    //@Field("id")
    private String id;
    @Field("name")
    private String name;
    @Field("teacher")
    private String teacher;
    @Field("amount")
    private int amount;

    public String getId() {
        return id;
    }

    public void setId(String _id) {
        this.id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        this.name = _name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String _teacher) {
        this.teacher = _teacher;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int _amount) {
        this.amount = _amount;
    }

    public ClassRoom() {
    }

    public ClassRoom(String _id) {
        this.id = _id;
    }

    public ClassRoom(String _name, String _teacher, int _amount) {
        this.name = _name;
        this.teacher = _teacher;
        this.amount = _amount;
    }

    public ClassRoom(String _id, String _name, String _teacher, int _amount) {
        this.id = _id;
        this.name = _name;
        this.teacher = _teacher;
        this.amount = _amount;
    }
}
