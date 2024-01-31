package com.dev.garimpo.service;

import com.dev.garimpo.domain.assistance.Assistance;
import com.dev.garimpo.domain.assistance.AssistanceRequestDTO;
import com.dev.garimpo.domain.category.Category;
import com.dev.garimpo.domain.handler.APIException;
import com.dev.garimpo.repositories.AssistanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssistanceService {

    @Autowired
     AssistanceRepository repository;


    public Assistance insert (AssistanceRequestDTO data){
        Assistance newAssistance = new Assistance(data);
        this.repository.save(newAssistance);
        return newAssistance;
    }

    public List<Assistance> getAllAssistance() {
        return this.repository.findAll();
    }
}
