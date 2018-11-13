package kr.icehs.iasa.db.dao;

import kr.icehs.iasa.vo.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

// 사용자 정보 데이터를 데이터베이스에 read/write 하는 클래스
@Repository
@Slf4j
public class UserInfoDAO {

    public void login(UserInfo userInfo){
        log.info("[UserInfoDAO] user id : {}", userInfo.getUserId());
        log.info("[UserInfoDAO] user password: {}", userInfo.getPassword());

        // DB에 직접 사용자 정보 write
    }
}
