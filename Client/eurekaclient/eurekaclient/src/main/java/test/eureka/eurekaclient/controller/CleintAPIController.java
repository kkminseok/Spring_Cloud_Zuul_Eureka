package test.eureka.eurekaclient.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CleintAPIController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    ResponseEntity<Map<String,String>> sample(){
        ResponseEntity<Map<String,String>> response = null;

        Map<String,String> resMap = new HashMap<String,String>();
        resMap.put("type","First eureka Client!");
        resMap.put("message","Sptirng Cloud 입니다.");

        response = new ResponseEntity<Map<String,String>>(resMap, HttpStatus.OK);

        return response;


    }

}
