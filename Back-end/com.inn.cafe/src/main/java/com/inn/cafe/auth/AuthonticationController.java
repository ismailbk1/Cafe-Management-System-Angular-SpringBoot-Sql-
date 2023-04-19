package com.inn.cafe.auth;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthonticationController {
private  final AuthenticationService service;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(

            @RequestBody RegisterRequest request){
        log.info("in the register fonction ");

        return ResponseEntity.ok(service.register(request));

    }
    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse>  authenticat(
            @RequestBody AuthenticationRequest request
    )
    {log.info("in the auth function");
        return ResponseEntity.ok(service.authenticate(request));
    }
}
