package wiki.primo.generator.mybatis.plus.cae.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
			
/**
 * <p>
 * 用户地区表
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@TableName("`sys_user_position`")
public class SysUserPosition implements Serializable {

private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
    @TableId(type = IdType.AUTO)
	@TableField(value="`id`")
	private Long id;

	/**
	 * 角色Id
	 */
	@TableField(value="`role_id`")
	private Long roleId;

	/**
	 * 地区Id
	 */
	@TableField(value="`position_id`")
	private Long positionId;


	public static final String ID="id";
	public static final String ROLE_ID="role_id";
	public static final String POSITION_ID="position_id";

		
	public Long getId() {
        return id;
	}

	public void setId(Long id) {
        this.id = id;
    }
		
	public Long getRoleId() {
        return roleId;
	}

	public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
		
	public Long getPositionId() {
        return positionId;
	}

	public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("SysUserPosition{").append(super.toString());

	sb.append(",id=").append(id);
		sb.append(",roleId=").append(roleId);
		sb.append(",positionId=").append(positionId);
	
		sb.append('}');
		return sb.toString();
	}
}
