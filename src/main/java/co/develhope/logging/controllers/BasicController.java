package co.develhope.logging.controllers;

import co.develhope.logging.services.BasicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BasicController{

    @Autowired
    BasicService basicService;

    @GetMapping("/")
    public String welcome(){
        String message="Welcome Message";
        basicService.logger.info(message);
        return message;
    }

    @GetMapping("/exp")
    public String twoValues(){
        basicService.logger.info(String.valueOf(basicService.n1));
        int n1= basicService.powerExponent(basicService.n1);
        basicService.logger.info(String.valueOf(n1));
        basicService.logger.info(String.valueOf(basicService.n2));
        int n2= basicService.powerExponent(basicService.n2);
        basicService.logger.info(String.valueOf(n2));
        return new String(
                "result of 2 power of 2="+n1
                +" result of 8 power of 8="+n2);
    }
    @GetMapping("/get-errors")
    public void getErrors(){
        Error error = new Error("Throw error");
        basicService.logger.error("Logging error", error);
    }





}