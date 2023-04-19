package com.inn.cafe.rest;

import com.inn.cafe.model.Bill;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@RequestMapping(path = "/bill")
public interface BillRest {

    @PostMapping(path = "/generatReport")
    ResponseEntity<String> generatReport(@RequestBody Map<String, Object> requestMap);

    @GetMapping(path = "/getBills")
    ResponseEntity<List<Bill>> getBills();

}
