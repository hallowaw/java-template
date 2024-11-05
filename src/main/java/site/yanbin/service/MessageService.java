package site.yanbin.service;

import org.springframework.stereotype.Service;
import site.yanbin.entity.Message;

@Service
public interface MessageService {
    void add(Message message);

    String display();
}
