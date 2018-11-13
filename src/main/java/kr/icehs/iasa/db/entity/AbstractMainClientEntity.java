package kr.icehs.iasa.db.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Data
public class AbstractMainClientEntity {

    @Column(name = "create_time")
    private Date created;

    @Column(name = "modified_time")
    private LocalDateTime modified;
}
