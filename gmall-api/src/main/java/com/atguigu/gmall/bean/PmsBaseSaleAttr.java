package com.atguigu.gmall.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @param
 * @author Witch
 * @return
 */
@Data
public class PmsBaseSaleAttr implements Serializable {

    @Id
    @Column
    String id;

    @Column
    String name;
}