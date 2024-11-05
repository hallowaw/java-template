package site.yanbin.mapper;

import org.apache.ibatis.annotations.Mapper;
import site.yanbin.entity.Message;

@Mapper
public interface MessageMapper {


    void add(Message message);

    String display();
}
