package com.atguigu.gmall.bean;

import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author Witch
 */
@Data
public class OmsCompanyAddress implements Serializable {

    @Id
    private String id;
    private String addressName;
    private int sendStatus;
    private int receiveStatus;
    private String name;
    private String phone;
    private String province;
    private String city;
    private String region;
    private String detailAddress;
}
