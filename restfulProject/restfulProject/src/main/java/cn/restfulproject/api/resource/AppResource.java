/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.restfulproject.api.resource;

import cn.restfulproject.api.demo.UserResource;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author myhtls
 */
@ApplicationPath(value = "/restfulDemo")
public class AppResource extends Application{
    
    @Override
    public Set<Class<?>> getClasses(){
        final Set<Class<?>> classes = new HashSet<>();
        
        classes.add(UserResource.class);
        return classes;
    }
    
}
