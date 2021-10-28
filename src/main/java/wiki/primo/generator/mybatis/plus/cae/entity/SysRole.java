package wiki.primo.generator.mybatis.plus.cae.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
											
/**
 * <p>
 * 系统角色表
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@TableName("`sys_role`")
public class SysRole implements Serializable {

private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
    @TableId(type = IdType.AUTO)
	@TableField(value="`id`")
	private Long id;

	/**
	 * 所属部门
	 */
	@TableField(value="`corp`")
	private Long corp;

	/**
	 * 角色名称
	 */
	@TableField(value="`name`")
	private String name;

	/**
	 * 状态
	 */
	@TableField(value="`status`")
	private Integer status;

	/**
	 * 权限标识符//
	 */
	@TableField(value="`perm_identifier`")
	private String permIdentifier;

	/**
	 * 角色顺序//
	 */
	@TableField(value="`role_order`")
	private Integer roleOrder;

	/**
	 * 备注
	 */
	@TableField(value="`remarks`")
	private String remarks;

	/**
	 * 创建时间
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
	public static final String CORP="corp";
	public static final String NAME="name";
	public static final String STATUS="status";
	public static final String PERM_IDENTIFIER="perm_identifier";
	public static final String ROLE_ORDER="role_order";
	public static final String REMARKS="remarks";
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
		
	public Long getCorp() {
        return corp;
	}

	public void setCorp(Long corp) {
        this.corp = corp;
    }
		
	public String getName() {
        return name;
	}

	public void setName(String name) {
        this.name = name;
    }
		
	public Integer getStatus() {
        return status;
	}

	public void setStatus(Integer status) {
        this.status = status;
    }
		
	public String getPermIdentifier() {
        return permIdentifier;
	}

	public void setPermIdentifier(String permIdentifier) {
        this.permIdentifier = permIdentifier;
    }
		
	public Integer getRoleOrder() {
        return roleOrder;
	}

	public void setRoleOrder(Integer roleOrder) {
        this.roleOrder = roleOrder;
    }
		
	public String getRemarks() {
        return remarks;
	}

	public void setRemarks(String remarks) {
        this.remarks = remarks;
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
		final StringBuilder sb = new StringBuilder("SysRole{").append(super.toString());

	sb.append(",id=").append(id);
		sb.append(",corp=").append(corp);
		sb.append(",name='").append(name).append('\'');
		sb.append(",status=").append(status);
		sb.append(",permIdentifier='").append(permIdentifier).append('\'');
		sb.append(",roleOrder=").append(roleOrder);
		sb.append(",remarks='").append(remarks).append('\'');
		sb.append(",createTime=").append(createTime);
		sb.append(",creator='").append(creator).append('\'');
		sb.append(",updateTime=").append(updateTime);
		sb.append(",updater='").append(updater).append('\'');
	
		sb.append('}');
		return sb.toString();
	}
}
