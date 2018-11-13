package kr.icehs.iasa.service;

import kr.icehs.iasa.db.dao.UserInfoDAO;
import kr.icehs.iasa.vo.EnrolmentInfo;
import kr.icehs.iasa.vo.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
@Slf4j
public class MainClientServiceImpl implements MainClientService {

    @Autowired
    private UserInfoDAO userInfoDAO;

    @Override
    public void login(HttpServletRequest request, UserInfo userInfo) {
        log.info("[DefaultMainClientServiceImpl] user id : {}", userInfo.getUserId());
        log.info("[DefaultMainClientServiceImpl] user password: {}", userInfo.getPassword());

        // 로그인 정보 저장
        userInfoDAO.login(userInfo);
    }

    @Override
    public void enrolment(HttpServletRequest request, EnrolmentInfo enrolmentInfo) {

    }

    @Override
    public void processTimeTable(HttpServletRequest request) {

        // 1. 수강신청 한 데이터를 데이터베이스로 부터 읽어옴
        // 2. 읽어 온 데이터를 Grouping 모듈로 보내 줄 데이터 가공
        // 3. 가공한 데이터를 Grouping 모듈로 보내서 처리 결과 받음
        // 4. 처리 된 결과를 데이터베이스에 저장
        // 5. 처리 된 결과를 SA 모듈로 보내서 처리 결과 받음
        // 6. SA 처리 결과를 데이터베이스에 저장
    }

    @Override
    public void getStudentTimeTable(HttpServletRequest request) {
        // 1. 학생 ID를 통해(group id) 그 학생의 시간표를 데이터베이스로 부터 읽어옴
        // 2. Web에서 시간표를 구성하기 쉽게 데이터를 구성해서 return
    }

    @Override
    public void getTeacherTimeTable(HttpServletRequest request) {
        // 1. 선생님 ID를 통해 선생님 시간표를 읽어옴 or 전체 시간표를 읽어옴
        // 2. 엑셀 형태 파일로 구성 후 return
    }
}

