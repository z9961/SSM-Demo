package Service;

import Dao.*;
import Entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserBizImp implements IUserBiz {

    @Autowired
    private UsersMapper usersMapper;
    @Autowired
    private TestMapper testMapper;

    @Override
    public Users findUserByPhone(String phone) {
        return usersMapper.findByPhone(phone);
    }

    @Override
    public int insert(List ttt) {
        return  testMapper.insert(999,ttt);
    }

//    @Override
//    public List<UsersAddress> findAllAddress(String Phone) {
//        return usersMapper.fin(record);
//    }
}