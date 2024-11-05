package site.yanbin.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.yanbin.entity.Message;

import site.yanbin.mapper.MessageMapper;
import site.yanbin.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageMapper messageMapper;
    @Override
    public void add(Message message) {
        messageMapper.add(message);
    }

    @Override
    public String display() {
        return messageMapper.display();
    }
}
