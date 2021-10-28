package wiki.primo.generator.mybatis.plus.cae.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
															
/**
 * <p>
 * 项目立项信息
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@TableName("`project_initiation_information`")
public class ProjectInitiationInformation implements Serializable {

private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
    @TableId(type = IdType.AUTO)
	@TableField(value="`id`")
	private Long id;

	/**
	 * 建设单位
	 */
	@TableField(value="`build_company`")
	private String buildCompany;

	/**
	 * 项目名称
	 */
	@TableField(value="`project_name`")
	private String projectName;

	/**
	 * 项目备案号
	 */
	@TableField(value="`record_number`")
	private String recordNumber;

	/**
	 * 项目规模
	 */
	@TableField(value="`project_scale`")
	private String projectScale;

	/**
	 * 投资概算
	 */
	@TableField(value="`expect_investment`")
	private Long expectInvestment;

	/**
	 * 资金来源
	 */
	@TableField(value="`funding_source`")
	private String fundingSource;

	/**
	 * 建设年限
	 */
	@TableField(value="`building_year`")
	private Long buildingYear;

	/**
	 * 建设地址
	 */
	@TableField(value="`project_position`")
	private String projectPosition;

	/**
	 * 备注
	 */
	@TableField(value="`remarks`")
	private String remarks;

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
	public static final String BUILD_COMPANY="build_company";
	public static final String PROJECT_NAME="project_name";
	public static final String RECORD_NUMBER="record_number";
	public static final String PROJECT_SCALE="project_scale";
	public static final String EXPECT_INVESTMENT="expect_investment";
	public static final String FUNDING_SOURCE="funding_source";
	public static final String BUILDING_YEAR="building_year";
	public static final String PROJECT_POSITION="project_position";
	public static final String REMARKS="remarks";
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
		
	public String getBuildCompany() {
        return buildCompany;
	}

	public void setBuildCompany(String buildCompany) {
        this.buildCompany = buildCompany;
    }
		
	public String getProjectName() {
        return projectName;
	}

	public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
		
	public String getRecordNumber() {
        return recordNumber;
	}

	public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }
		
	public String getProjectScale() {
        return projectScale;
	}

	public void setProjectScale(String projectScale) {
        this.projectScale = projectScale;
    }
		
	public Long getExpectInvestment() {
        return expectInvestment;
	}

	public void setExpectInvestment(Long expectInvestment) {
        this.expectInvestment = expectInvestment;
    }
		
	public String getFundingSource() {
        return fundingSource;
	}

	public void setFundingSource(String fundingSource) {
        this.fundingSource = fundingSource;
    }
		
	public Long getBuildingYear() {
        return buildingYear;
	}

	public void setBuildingYear(Long buildingYear) {
        this.buildingYear = buildingYear;
    }
		
	public String getProjectPosition() {
        return projectPosition;
	}

	public void setProjectPosition(String projectPosition) {
        this.projectPosition = projectPosition;
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
		
	public String getDataLocation() {
        return dataLocation;
	}

	public void setDataLocation(String dataLocation) {
        this.dataLocation = dataLocation;
    }

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("ProjectInitiationInformation{").append(super.toString());

	sb.append(",id=").append(id);
		sb.append(",buildCompany='").append(buildCompany).append('\'');
		sb.append(",projectName='").append(projectName).append('\'');
		sb.append(",recordNumber='").append(recordNumber).append('\'');
		sb.append(",projectScale='").append(projectScale).append('\'');
		sb.append(",expectInvestment=").append(expectInvestment);
		sb.append(",fundingSource='").append(fundingSource).append('\'');
		sb.append(",buildingYear=").append(buildingYear);
		sb.append(",projectPosition='").append(projectPosition).append('\'');
		sb.append(",remarks='").append(remarks).append('\'');
		sb.append(",createTime=").append(createTime);
		sb.append(",creator='").append(creator).append('\'');
		sb.append(",updateTime=").append(updateTime);
		sb.append(",updater='").append(updater).append('\'');
		sb.append(",dataLocation='").append(dataLocation).append('\'');
	
		sb.append('}');
		return sb.toString();
	}
}
