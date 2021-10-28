package wiki.primo.generator.mybatis.plus.cae.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
			
/**
 * <p>
 * 用户角色表
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@TableName("`sys_user_role`")
public class SysUserRole implements Serializable {

private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
    @TableId(type = IdType.AUTO)
	@TableField(value="`id`")
	private Long id;

	/**
	 * 用户Id
	 */
	@TableField(value="`user_id`")
	private Long userId;

	/**
	 * 角色Id
	 */
	@TableField(value="`role_id`")
	private Long roleId;


	public static final String ID="id";
	public static final String USER_ID="user_id";
	public static final String ROLE_ID="role_id";

		
	public Long getId() {
        return id;
	}

	public void setId(Long id) {
        this.id = id;
    }
		
	public Long getUserId() {
        return userId;
	}

	public void setUserId(Long userId) {
        this.userId = userId;
    }
		
	public Long getRoleId() {
        return roleId;
	}

	public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("SysUserRole{").append(super.toString());

	sb.append(",id=").append(id);
		sb.append(",userId=").append(userId);
		sb.append(",roleId=").append(roleId);
	
		sb.append('}');
		return sb.toString();
	}
}
