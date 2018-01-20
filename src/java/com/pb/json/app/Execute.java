/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pb.json.app;

import com.pb.json.busineslayer.BL_User;
import java.io.StringWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author DS
 */
public class Execute {
    public static void main(String[] args) {
        BL_User bL_User=new BL_User();
        JSONArray array=new JSONArray();
        array=bL_User.arrayUsers();
              
        StringWriter out=new StringWriter();
        try {
            array.writeJSONString(out);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println(out);
        System.out.println("Barrita Separadora-----------");
        
        JSONObject jsonUser=new JSONObject();
        jsonUser.put("users", out);
  
        JSONParser user_parser=new JSONParser();
        try {
            JSONObject objUsers=(JSONObject)user_parser.parse(jsonUser.toJSONString());
            JSONArray arrayUsers=(JSONArray)objUsers.get("users");
          
            for (int i = 0; i < arrayUsers.size(); i++) {
                JSONObject user=(JSONObject)arrayUsers.get(i);
                String id=user.get("id").toString();
                String username=user.get("username").toString();
                String password=user.get("password").toString();
               
                System.out.println(id+"\t"+username+"\t"+password);
            }
             
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

}
    
