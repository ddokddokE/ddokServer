package com.example.demo.controller;

import com.example.demo.domain.BarCodeData;
import com.example.demo.service.DrugService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")  // 여기서 CORS 설정을 추가
public class DrugController {
    private final DrugService drugService;

    @GetMapping("/drug")
    public List<BarCodeData> getItemNameList(){
        return drugService.getItemNameList();
    }

//    @GetMapping("/medi")
//    public List<BarCodeData> getFirstItemByName(){
//        return (List<BarCodeData>) Collections.singletonList(mediRepository.getFirstItemByName());
}
