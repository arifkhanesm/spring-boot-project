package com.mysql.springbootmysql.resource;

import com.mysql.springbootmysql.num.num;
import com.mysql.springbootmysql.repository.numRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1")
public class numController {
    @Autowired
    numRepository numRepository1;
    @GetMapping(value = "/all")
    public List<num> getAll(){
        return numRepository1.findAll();
    }
    @PostMapping(value="/load")
    public List<num> persist(@RequestBody final num number ){
        numRepository1.save(number);
        return numRepository1.findAll();
    }
    @PutMapping(value = "/update")
    public  void updateNum(
           //@PathVariable("num") int num,
            @RequestParam(required = true) int id,
            @RequestParam(required = false) Integer number
    ){
   numRepository1.updateNum(id,number);
    }


}
