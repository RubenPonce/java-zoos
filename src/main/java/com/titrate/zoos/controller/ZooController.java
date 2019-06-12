package com.titrate.zoos.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZooController {
@GetMapping("/zoo/zoos")
    public ResponseEntity<?> getZoosWithPhoneAndAnimals(){
    return new ResponseEntity<>(HttpStatus.OK);
}
}
