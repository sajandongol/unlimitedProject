package com.task.task.Controller;


import com.task.task.Entity.Queries;
import com.task.task.Entity.User;
import com.task.task.Service.ExpertUserService;
import com.task.task.Service.impl.ServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;

@RestController
@RequestMapping( value = "/api/user")
public class ExpertUserController {

    private ExpertUserService expertUserService;

    public ExpertUserController(ServiceImpl expertUserService) {
        this.expertUserService = expertUserService;
    }
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<User> insert(@RequestBody User user){
        User user1 = expertUserService.insert(user);
        return new ResponseEntity<>(user1, HttpStatus.OK);
    }

    @GetMapping(value = "/getalluser")
    public ResponseEntity<List<User>>getAll(){
        return new ResponseEntity<List<User>>(expertUserService.getAllUser(), HttpStatus.OK );
}

    @PostMapping("/add")
    public ResponseEntity<?> addQuery(@RequestParam String queries, @RequestParam Long userId){
        expertUserService.addQuery(queries,userId);
        return new ResponseEntity<Queries>(expertUserService.addQuery(queries,userId),HttpStatus.OK);
    }


}