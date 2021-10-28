package wiki.primo.generator.mybatis.plus.cae.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
								
/**
 * <p>
 * 系统权限表
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@TableName("`sys_perm`")
public class SysPerm implements Serializable {

private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
    @TableId(type = IdType.AUTO)
	@TableField(value="`id`")
	private Long id;

	/**
	 * 父权限Id
	 */
	@TableField(value="`pid`")
	private Long pid;

	/**
	 * 权限编码
	 */
	@TableField(value="`code`")
	private String code;

	/**
	 * 权限名称
	 */
	@TableField(value="`name`")
	private String name;

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
	public static final String PID="pid";
	public static final String CODE="code";
	public static final String NAME="name";
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
		
	public Long getPid() {
        return pid;
	}

	public void setPid(Long pid) {
        this.pid = pid;
    }
		
	public String getCode() {
        return code;
	}

	public void setCode(String code) {
        this.code = code;
    }
		
	public String getName() {
        return name;
	}

	public void setName(String name) {
        this.name = name;
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
		final StringBuilder sb = new StringBuilder("SysPerm{").append(super.toString());

	sb.append(",id=").append(id);
		sb.append(",pid=").append(pid);
		sb.append(",code='").append(code).append('\'');
		sb.append(",name='").append(name).append('\'');
		sb.append(",createTime=").append(createTime);
		sb.append(",creator='").append(creator).append('\'');
		sb.append(",updateTime=").append(updateTime);
		sb.append(",updater='").append(updater).append('\'');
	
		sb.append('}');
		return sb.toString();
	}
}
