package wiki.primo.generator.mybatis.plus.cae.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
												
/**
 * <p>
 * 系统用户表
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@TableName("`sys_user`")
public class SysUser implements Serializable {

private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
    @TableId(type = IdType.AUTO)
	@TableField(value="`id`")
	private Long id;

	/**
	 * 用户名
	 */
	@TableField(value="`username`")
	private String username;

	/**
	 * 所属部门
	 */
	@TableField(value="`corp`")
	private Long corp;

	/**
	 * 邮箱
	 */
	@TableField(value="`mail`")
	private String mail;

	/**
	 * 手机号
	 */
	@TableField(value="`phone`")
	private String phone;

	/**
	 * 性别
	 */
	@TableField(value="`sex`")
	private Integer sex;

	/**
	 * 密码
	 */
	@TableField(value="`password`")
	private String password;

	/**
	 * 状态
	 */
	@TableField(value="`status`")
	private Integer status;

	/**
	 * 注册时间
	 */
	@TableField(value="`create_time`")
	private Long createTime;

	/**
	 * 创建者
	 */
	@TableField(value="`creator`")
	private String creator;

	/**
	 * 更新时间
	 */
	@TableField(value="`update_time`")
	private Long updateTime;

	/**
	 * 更新者
	 */
	@TableField(value="`updater`")
	private String updater;


	public static final String ID="id";
	public static final String USERNAME="username";
	public static final String CORP="corp";
	public static final String MAIL="mail";
	public static final String PHONE="phone";
	public static final String SEX="sex";
	public static final String PASSWORD="password";
	public static final String STATUS="status";
	public static final String CREATE_TIME="create_time";
	public static final String CREATOR="creator";
	public static final String UPDATE_TIME="update_time";
	public static final String UPDATER="updater";

		
	public Long getId() {
        return id;
	}

	public void setId(Long id) {
        this.id = id;
    }
		
	public String getUsername() {
        return username;
	}

	public void setUsername(String username) {
        this.username = username;
    }
		
	public Long getCorp() {
        return corp;
	}

	public void setCorp(Long corp) {
        this.corp = corp;
    }
		
	public String getMail() {
        return mail;
	}

	public void setMail(String mail) {
        this.mail = mail;
    }
		
	public String getPhone() {
        return phone;
	}

	public void setPhone(String phone) {
        this.phone = phone;
    }
		
	public Integer getSex() {
        return sex;
	}

	public void setSex(Integer sex) {
        this.sex = sex;
    }
		
	public String getPassword() {
        return password;
	}

	public void setPassword(String password) {
        this.password = password;
    }
		
	public Integer getStatus() {
        return status;
	}

	public void setStatus(Integer status) {
        this.status = status;
    }
		
	public Long getCreateTime() {
        return createTime;
	}

	public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
		
	public String getCreator() {
        return creator;
	}

	public void setCreator(String creator) {
        this.creator = creator;
    }
		
	public Long getUpdateTime() {
        return updateTime;
	}

	public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
		
	public String getUpdater() {
        return updater;
	}

	public void setUpdater(String updater) {
        this.updater = updater;
    }

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("SysUser{").append(super.toString());

	sb.append(",id=").append(id);
		sb.append(",username='").append(username).append('\'');
		sb.append(",corp=").append(corp);
		sb.append(",mail='").append(mail).append('\'');
		sb.append(",phone='").append(phone).append('\'');
		sb.append(",sex=").append(sex);
		sb.append(",password='").append(password).append('\'');
		sb.append(",status=").append(status);
		sb.append(",createTime=").append(createTime);
		sb.append(",creator='").append(creator).append('\'');
		sb.append(",updateTime=").append(updateTime);
		sb.append(",updater='").append(updater).append('\'');
	
		sb.append('}');
		return sb.toString();
	}
}
