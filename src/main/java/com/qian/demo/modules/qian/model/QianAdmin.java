package com.qian.demo.modules.qian.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

/**
 * <p>
 * 后台用户表
 * </p>
 *
 * @author macro
 * @since 2020-10-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("qian_admin")
@ApiModel(value="QianAdmin对象", description="后台用户表")
public class QianAdmin implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;


    //不能为空
    @NotEmpty
    private String username;
    @NotEmpty
    private String password;

    @ApiModelProperty(value = "头像")
    private String icon;

    @Email
    @ApiModelProperty(value = "邮箱")
    private String email;

    @NotEmpty
    @ApiModelProperty(value = "昵称")
    private String nickName;

    @ApiModelProperty(value = "备注信息")
    private String note;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "最后登录时间")
    private Date loginTime;

    @ApiModelProperty(value = "帐号启用状态：0->禁用；1->启用")
    private Integer status;


}
