package com.qz.guns.modular.system.model;

import lombok.Data;


import java.io.Serializable;

/**
 * @author qinzhi
 * @date 2018/10/1 15:46
 */
@Data

public class Role implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Integer id;
    /**
     * 序号
     */
    private Integer num;
    /**
     * 父角色id
     */
    private Integer pid;
    /**
     * 角色名称
     */
    private String name;
    /**
     * 部门名称
     */
    private Integer deptid;
    /**
     * 提示
     */
    private String tips;
    /**
     * 保留字段(暂时没用）
     */
    private Integer version;
}
