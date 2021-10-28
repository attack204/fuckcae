package wiki.primo.generator.mybatis.plus.cae.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
			
/**
 * <p>
 * 项目详细计划映射表
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@TableName("`project_detail_plan`")
public class ProjectDetailPlan implements Serializable {

private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
    @TableId(type = IdType.AUTO)
	@TableField(value="`id`")
	private Long id;

	/**
	 * 项目Id
	 */
	@TableField(value="`project_id`")
	private Long projectId;

	/**
	 * 详细计划Id
	 */
	@TableField(value="`project_detail_id`")
	private Long projectDetailId;


	public static final String ID="id";
	public static final String PROJECT_ID="project_id";
	public static final String PROJECT_DETAIL_ID="project_detail_id";

		
	public Long getId() {
        return id;
	}

	public void setId(Long id) {
        this.id = id;
    }
		
	public Long getProjectId() {
        return projectId;
	}

	public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }
		
	public Long getProjectDetailId() {
        return projectDetailId;
	}

	public void setProjectDetailId(Long projectDetailId) {
        this.projectDetailId = projectDetailId;
    }

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("ProjectDetailPlan{").append(super.toString());

	sb.append(",id=").append(id);
		sb.append(",projectId=").append(projectId);
		sb.append(",projectDetailId=").append(projectDetailId);
	
		sb.append('}');
		return sb.toString();
	}
}
