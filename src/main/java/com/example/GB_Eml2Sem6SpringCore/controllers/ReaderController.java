package com.example.GB_Eml2Sem6SpringCore.controllers;

import com.example.GB_Eml2Sem6SpringCore.models.Reader;
import com.example.GB_Eml2Sem6SpringCore.repositories.ReaderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reader")
public class ReaderController {
    private  final ReaderRepository readerRepo;

    @GetMapping
    public List<Reader> getAll(){
        return readerRepo.findAll();
    }

    @PostMapping
    public Reader createReader(@RequestBody Reader reader){
        return readerRepo.save(reader);
    }
}
