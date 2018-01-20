/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pb.json.busineslayer;

import com.pb.json.dataaccesslayer.DA_User;
import org.json.simple.JSONArray;

/**
 *
 * @author DS
 */
public class BL_User {
    
    public  JSONArray arrayUsers(){
        DA_User da_user=new DA_User();
        return da_user.arrayUsers();
    }
    
}
