package Dao;

import Entity.Users;
import org.springframework.stereotype.Repository;

import java.util.List;

//import Entity.UsersInfo;

@Repository
public interface TestMapper {
    int insert(int pid,List ttt);
}