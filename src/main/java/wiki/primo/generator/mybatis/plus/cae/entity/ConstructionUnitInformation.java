package wiki.primo.generator.mybatis.plus.cae.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
																
/**
 * <p>
 * 施工单位信息
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@TableName("`construction_unit_information`")
public class ConstructionUnitInformation implements Serializable {

private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
    @TableId(type = IdType.AUTO)
	@TableField(value="`id`")
	private Long id;

	/**
	 * 施工单位名称
	 */
	@TableField(value="`construction_company`")
	private String constructionCompany;

	/**
	 * 联系电话
	 */
	@TableField(value="`contact_phone`")
	private String contactPhone;

	/**
	 * 建设单位
	 */
	@TableField(value="`building_company`")
	private String buildingCompany;

	/**
	 * 项目地址
	 */
	@TableField(value="`project_location`")
	private String projectLocation;

	/**
	 * 建筑施工项目名称
	 */
	@TableField(value="`project_name`")
	private String projectName;

	/**
	 * 建筑面积
	 */
	@TableField(value="`construction_area`")
	private String constructionArea;

	/**
	 * 工程概算
	 */
	@TableField(value="`expect_investment`")
	private String expectInvestment;

	/**
	 * 开工日期
	 */
	@TableField(value="`begin_time`")
	private Long beginTime;

	/**
	 * 竣工日期
	 */
	@TableField(value="`end_time`")
	private Long endTime;

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
	public static final String CONSTRUCTION_COMPANY="construction_company";
	public static final String CONTACT_PHONE="contact_phone";
	public static final String BUILDING_COMPANY="building_company";
	public static final String PROJECT_LOCATION="project_location";
	public static final String PROJECT_NAME="project_name";
	public static final String CONSTRUCTION_AREA="construction_area";
	public static final String EXPECT_INVESTMENT="expect_investment";
	public static final String BEGIN_TIME="begin_time";
	public static final String END_TIME="end_time";
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
		
	public String getConstructionCompany() {
        return constructionCompany;
	}

	public void setConstructionCompany(String constructionCompany) {
        this.constructionCompany = constructionCompany;
    }
		
	public String getContactPhone() {
        return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
		
	public String getBuildingCompany() {
        return buildingCompany;
	}

	public void setBuildingCompany(String buildingCompany) {
        this.buildingCompany = buildingCompany;
    }
		
	public String getProjectLocation() {
        return projectLocation;
	}

	public void setProjectLocation(String projectLocation) {
        this.projectLocation = projectLocation;
    }
		
	public String getProjectName() {
        return projectName;
	}

	public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
		
	public String getConstructionArea() {
        return constructionArea;
	}

	public void setConstructionArea(String constructionArea) {
        this.constructionArea = constructionArea;
    }
		
	public String getExpectInvestment() {
        return expectInvestment;
	}

	public void setExpectInvestment(String expectInvestment) {
        this.expectInvestment = expectInvestment;
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
		final StringBuilder sb = new StringBuilder("ConstructionUnitInformation{").append(super.toString());

	sb.append(",id=").append(id);
		sb.append(",constructionCompany='").append(constructionCompany).append('\'');
		sb.append(",contactPhone='").append(contactPhone).append('\'');
		sb.append(",buildingCompany='").append(buildingCompany).append('\'');
		sb.append(",projectLocation='").append(projectLocation).append('\'');
		sb.append(",projectName='").append(projectName).append('\'');
		sb.append(",constructionArea='").append(constructionArea).append('\'');
		sb.append(",expectInvestment='").append(expectInvestment).append('\'');
		sb.append(",beginTime=").append(beginTime);
		sb.append(",endTime=").append(endTime);
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
