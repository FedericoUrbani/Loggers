package co.develhope.logging.services;

import co.develhope.logging.controllers.BasicController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BasicService {
    @Value("${com.example.logging00.custom.variable.n1}")
    public int n1;
    @Value("${com.example.logging00.custom.variable.n2}")
    public int n2;
    public Logger logger= LoggerFactory.getLogger(BasicController.class);

    public int powerExponent (int a){
        int result=a;
        for (int i=0;i<a;i++) {
            result = result * a;
        }
        return result;
    }
}