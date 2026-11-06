package com.gaurav.foodiesapi.service;

import com.gaurav.foodiesapi.io.CartRequest;
import com.gaurav.foodiesapi.io.CartResponse;

public interface CartService {

    CartResponse addToCart(CartRequest request);

    CartResponse getCart();

    void clearCart();

    CartResponse removeFromCart(CartRequest cartRequest);
}
