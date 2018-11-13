package kr.icehs.iasa.service;

import kr.icehs.iasa.vo.EnrolmentInfo;
import kr.icehs.iasa.vo.UserInfo;

import javax.servlet.http.HttpServletRequest;

public interface MainClientService {

    void login(HttpServletRequest request, UserInfo userInfo);

    void enrolment(HttpServletRequest request, EnrolmentInfo enrolmentInfo);

    void processTimeTable(HttpServletRequest request);

    void getStudentTimeTable(HttpServletRequest request);

    void getTeacherTimeTable(HttpServletRequest request);
}

