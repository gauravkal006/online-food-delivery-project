package com.gaurav.foodiesapi.service;

import com.gaurav.foodiesapi.io.UserRequest;
import com.gaurav.foodiesapi.io.UserResponse;

public interface UserService {

    UserResponse registerUser(UserRequest request);

    String findByUserId();
}
