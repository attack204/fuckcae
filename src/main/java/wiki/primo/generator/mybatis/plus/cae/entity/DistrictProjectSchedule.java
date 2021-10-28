package wiki.primo.generator.mybatis.plus.cae.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
															
/**
 * <p>
 * 区级重点项目计划表
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@TableName("`district_project_schedule`")
public class DistrictProjectSchedule implements Serializable {

private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
    @TableId(type = IdType.AUTO)
	@TableField(value="`id`")
	private Long id;

	/**
	 * 项目名称
	 */
	@TableField(value="`project_name`")
	private String projectName;

	/**
	 * 建设内容
	 */
	@TableField(value="`project_content`")
	private String projectContent;

	/**
	 * 投资主体
	 */
	@TableField(value="`investment_subject`")
	private String investmentSubject;

	/**
	 * 建设地点
	 */
	@TableField(value="`project_position`")
	private String projectPosition;

	/**
	 * 责任单位
	 */
	@TableField(value="`responsible_company`")
	private String responsibleCompany;

	/**
	 * 投资金额
	 */
	@TableField(value="`investment_amount`")
	private Long investmentAmount;

	/**
	 * 开始时间
	 */
	@TableField(value="`begin_time`")
	private Long beginTime;

	/**
	 * 结束时间
	 */
	@TableField(value="`end_time`")
	private Long endTime;

	/**
	 * 状态。0表示正在进行的计划，1表示已经完成
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

	/**
	 * 数据所在区域
	 */
	@TableField(value="`data_location`")
	private String dataLocation;


	public static final String ID="id";
	public static final String PROJECT_NAME="project_name";
	public static final String PROJECT_CONTENT="project_content";
	public static final String INVESTMENT_SUBJECT="investment_subject";
	public static final String PROJECT_POSITION="project_position";
	public static final String RESPONSIBLE_COMPANY="responsible_company";
	public static final String INVESTMENT_AMOUNT="investment_amount";
	public static final String BEGIN_TIME="begin_time";
	public static final String END_TIME="end_time";
	public static final String STATUS="status";
	public static final String CREATE_TIME="create_time";
	public static final String CREATOR="creator";
	public static final String UPDATE_TIME="update_time";
	public static final String UPDATER="updater";
	public static final String DATA_LOCATION="data_location";

		
	public Long getId() {
        return id;
	}

	public void setId(Long id) {
        this.id = id;
    }
		
	public String getProjectName() {
        return projectName;
	}

	public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
		
	public String getProjectContent() {
        return projectContent;
	}

	public void setProjectContent(String projectContent) {
        this.projectContent = projectContent;
    }
		
	public String getInvestmentSubject() {
        return investmentSubject;
	}

	public void setInvestmentSubject(String investmentSubject) {
        this.investmentSubject = investmentSubject;
    }
		
	public String getProjectPosition() {
        return projectPosition;
	}

	public void setProjectPosition(String projectPosition) {
        this.projectPosition = projectPosition;
    }
		
	public String getResponsibleCompany() {
        return responsibleCompany;
	}

	public void setResponsibleCompany(String responsibleCompany) {
        this.responsibleCompany = responsibleCompany;
    }
		
	public Long getInvestmentAmount() {
        return investmentAmount;
	}

	public void setInvestmentAmount(Long investmentAmount) {
        this.investmentAmount = investmentAmount;
    }
		
	public Long getBeginTime() {
        return beginTime;
	}

	public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }
		
	public Long getEndTime() {
        return endTime;
	}

	public void setEndTime(Long endTime) {
        this.endTime = endTime;
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
		
	public String getDataLocation() {
        return dataLocation;
	}

	public void setDataLocation(String dataLocation) {
        this.dataLocation = dataLocation;
    }

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("DistrictProjectSchedule{").append(super.toString());

	sb.append(",id=").append(id);
		sb.append(",projectName='").append(projectName).append('\'');
		sb.append(",projectContent='").append(projectContent).append('\'');
		sb.append(",investmentSubject='").append(investmentSubject).append('\'');
		sb.append(",projectPosition='").append(projectPosition).append('\'');
		sb.append(",responsibleCompany='").append(responsibleCompany).append('\'');
		sb.append(",investmentAmount=").append(investmentAmount);
		sb.append(",beginTime=").append(beginTime);
		sb.append(",endTime=").append(endTime);
		sb.append(",status=").append(status);
		sb.append(",createTime=").append(createTime);
		sb.append(",creator='").append(creator).append('\'');
		sb.append(",updateTime=").append(updateTime);
		sb.append(",updater='").append(updater).append('\'');
		sb.append(",dataLocation='").append(dataLocation).append('\'');
	
		sb.append('}');
		return sb.toString();
	}
}
