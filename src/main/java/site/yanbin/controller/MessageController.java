package site.yanbin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import site.yanbin.entity.Message;
import site.yanbin.service.MessageService;

@RestController
@CrossOrigin(origins = "http://localhost:8081") // 指定允许的前端URL
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping("/add")
    public void add(@RequestBody Message message){
        messageService.add(message);
    }

    @GetMapping("/")
    public String display(){
        return messageService.display();
    }

}
