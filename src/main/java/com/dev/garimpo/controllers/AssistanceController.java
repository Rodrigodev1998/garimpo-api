package com.dev.garimpo.controllers;

import com.dev.garimpo.domain.assistance.Assistance;
import com.dev.garimpo.domain.assistance.AssistanceRequestDTO;
import com.dev.garimpo.service.AssistanceService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("assistance")
public class AssistanceController {
    @Autowired
    AssistanceService assistanceService;
    @PostMapping
    public ResponseEntity<Assistance> postAssistance(@RequestBody @Valid AssistanceRequestDTO body){
        Assistance newAssistance = this.assistanceService.insert(body);
        return ResponseEntity.ok().body(newAssistance);
    }

    @GetMapping
    public ResponseEntity<List<Assistance>> getAllAssistance(){
        List<Assistance> assistanceList = this.assistanceService.getAllAssistance();
        return ResponseEntity.ok().body(assistanceList);
    }


}
