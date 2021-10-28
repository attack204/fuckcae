package wiki.primo.generator.mybatis.plus.cae.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
		
/**
 * <p>
 * 地区表(记录用户所在地区，比如经区、高区)
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@TableName("`sys_position`")
public class SysPosition implements Serializable {

private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
    @TableId(type = IdType.AUTO)
	@TableField(value="`id`")
	private Long id;

	/**
	 * 地区名称
	 */
	@TableField(value="`position_name`")
	private String positionName;


	public static final String ID="id";
	public static final String POSITION_NAME="position_name";

		
	public Long getId() {
        return id;
	}

	public void setId(Long id) {
        this.id = id;
    }
		
	public String getPositionName() {
        return positionName;
	}

	public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("SysPosition{").append(super.toString());

	sb.append(",id=").append(id);
		sb.append(",positionName='").append(positionName).append('\'');
	
		sb.append('}');
		return sb.toString();
	}
}
