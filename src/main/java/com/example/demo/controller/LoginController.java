package com.example.demo.controller;

import com.example.demo.dto.LoginDTO;
import com.example.demo.dto.LoginResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

/**
 * Description: $DESCRIPTION
 * Project: demo
 * Created by :monirul.islam822
 * Created on : 23-Jun-2022 , 3:27 PM
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */


@RestController
@RequestMapping("/login/token")
public class LoginController {

    @PostMapping(value = "/generate-token")
    public ResponseEntity<?> register(@RequestBody LoginDTO loginDTO){

        String url="https://api.ipemis.dpe.gov.bd/api/authenticate";

        RestTemplate restTemplate=new RestTemplate();

        ResponseEntity<LoginResponseDTO> loginResponseDTO=restTemplate.postForEntity(url,loginDTO,LoginResponseDTO.class);

        return ResponseEntity.ok().body(loginResponseDTO.getBody());
    }
}
