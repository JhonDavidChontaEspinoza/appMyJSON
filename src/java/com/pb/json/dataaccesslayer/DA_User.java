/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pb.json.dataaccesslayer;

import com.pb.json.entitylayer.User;
import org.json.simple.JSONArray;

/**
 *
 * @author DS
 */
public class DA_User {
    public  JSONArray arrayUsers(){
        JSONArray array=new JSONArray();
            array.add(new User(0, "David", "123"));
            array.add(new User(0, "Tairon", "oracle"));
            array.add(new User(0, "Jorge", "123"));
        return array;
    }
}
