package com.bridgelabz.lmstechstackservice.controller;

import com.bridgelabz.lmstechstackservice.dto.TechStackDto;
import com.bridgelabz.lmstechstackservice.model.TechStackModel;
import com.bridgelabz.lmstechstackservice.service.ITechStackService;
import com.bridgelabz.lmstechstackservice.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/techStack")
public class TechStackController {
    @Autowired
    ITechStackService techStackService;

    /*
     * Purpose : Create TechStack Details
     * @Param :  token and techStackDto
     * */
    @PostMapping("/addTechStack")
    public ResponseEntity<Response> addTechStack(@RequestHeader String token, @RequestBody TechStackDto techStackDto) {
        Response response = techStackService.addTechStack(token, techStackDto);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    /*
     * Purpose : Retrieve All TechStack Details
     * @Param :  token
     * */
    @GetMapping("/getAllTechStacks")
    public ResponseEntity<List<?>> getAllTecStacks(@RequestHeader String token) {
        List<TechStackModel> response =techStackService.getAllTechStacks(token);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    /*
     * Purpose : Update Existing TechStack Details
     * @Param :  id,techStackDto and token
     * */
    @PutMapping("/updateTechStack/{id}")
    public ResponseEntity<Response> updateTechStack(@RequestHeader String token, @PathVariable Long id, @RequestBody TechStackDto techStackDto) {
        Response response = techStackService.updateTechStack(token, id, techStackDto);
        return new ResponseEntity<>(response, HttpStatus.OK);

    }

    /*
     * Purpose : Delete Existing TechStack Details
     * @Param :  id and token
     * */
    @DeleteMapping("/deleteTechStack/{id}")
    public ResponseEntity<Response> deleteTechStack(@RequestHeader String token, @PathVariable Long id) {
        Response response = techStackService.deleteTechStack(token, id);
        return new ResponseEntity<>(response, HttpStatus.OK);

    }
}