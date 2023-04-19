package com.inn.cafe.rest;

import com.inn.cafe.wrapper.ProductWrapper;
import jakarta.websocket.server.PathParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping(path = "/product")
public interface ProductRest {

    @PostMapping(path = "/add")
    public ResponseEntity<String> addNewProduct(@RequestBody(required = true) Map<String,String> requestmap);

    @GetMapping(path="/get")
    public ResponseEntity<List<ProductWrapper>> gatAllProduct();

    @PostMapping(path = "/update")

    public ResponseEntity<String> updateProduct(@RequestBody Map<String,String> requestMap);

    @PostMapping(path="/delete/{id}")

    public ResponseEntity<String> deleteProduct(@PathVariable Integer id);

    @PostMapping(path = "/updateStatus")

    public ResponseEntity<String >updateStatus(@RequestBody Map<String , String> requestMap);

    @GetMapping(path = "/getProductByCategory/{id}")

    ResponseEntity<List<ProductWrapper>> getProductByCategory(@PathVariable Integer id);
  @GetMapping(path = "/getById/{id}")

    ResponseEntity<ProductWrapper> getProductById(@PathVariable Integer id);



}
