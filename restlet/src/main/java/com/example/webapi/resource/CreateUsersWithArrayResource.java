package com.example.webapi.resource;

import com.example.webapi.representation.User;
import org.restlet.resource.Post;

public interface CreateUsersWithArrayResource {

    @Post
    void add(User bean) throws Exception;

}

