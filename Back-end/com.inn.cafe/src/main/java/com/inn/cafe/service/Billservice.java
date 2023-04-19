package com.inn.cafe.service;

import com.inn.cafe.model.Bill;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface Billservice {
    ResponseEntity<String> generatReport(Map<String, Object> requestMap);

    ResponseEntity<List<Bill>> getBills();
}
