package kr.icehs.iasa.db.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class EnrolmentEntity {
    @Id
    private long enrolmentId;

    @Column
    private long userInfoId;

    @Column
    private String classCode;

}
