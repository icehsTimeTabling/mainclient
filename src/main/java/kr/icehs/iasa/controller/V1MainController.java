package kr.icehs.iasa.controller;

import kr.icehs.iasa.service.MainClientService;
import kr.icehs.iasa.vo.EnrolmentInfo;
import kr.icehs.iasa.vo.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@RestController
public class V1MainController {

    @Autowired
    private MainClientService mainClientService;

    @RequestMapping(value = "/timestamp", method = RequestMethod.GET)
    public String getTimeStamp() {
        return String.format("Timestamp : %d", System.currentTimeMillis());
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public void login(HttpServletRequest request, HttpServletResponse response, @RequestBody UserInfo userInfo) {

        log.info("[User ID] : {}", userInfo.getUserId());
        log.info("[User Password] : {}", userInfo.getPassword());
        // 로그인 validation 처리 필요

        mainClientService.login(request, userInfo);
    }

    @RequestMapping(value = "/enrolment", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public void enrolment(HttpServletRequest request, HttpServletResponse response, @RequestBody EnrolmentInfo enrolmentInfo) {

        // 수강신청 validation 처리

        mainClientService.enrolment(request, enrolmentInfo);
    }

    @RequestMapping(value = "/process/timetable", method = RequestMethod.GET)
    @ResponseBody
    public void processTimeTable(HttpServletRequest request, HttpServletResponse response) {
        // 관리자 인증 및 validation 처리

        mainClientService.processTimeTable(request);
    }

    @RequestMapping(value = "/student/timetable", method = RequestMethod.GET)
    @ResponseBody
    public void getStudentTimeTable(HttpServletRequest request, HttpServletResponse response) {
        // 인증 및 validation 처리
        // 학생 group 코드 가져오기

        mainClientService.getStudentTimeTable(request);
    }

    @RequestMapping(value = "/teacher/timetable", method = RequestMethod.GET)
    @ResponseBody
    public void getTeacherTimeTable(HttpServletRequest request, HttpServletResponse response) {
        // 인증 및 validation 처리

        mainClientService.getTeacherTimeTable(request);
    }

}
