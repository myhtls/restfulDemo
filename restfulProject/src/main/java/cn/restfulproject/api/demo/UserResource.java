/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.restfulproject.api.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * http://localhost:8080/restfulProject/demo/user/userInfo
 * @author myhtls
 */
@Path(value = "/user")
public class UserResource {
    
    @GET
    @Path(value = "/userInfo")
    @Produces("text/plain")
    public String getUserInfo(){
        return "username";
    }
    
}
