package wiki.primo.generator.mybatis.plus.cae.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
														
/**
 * <p>
 * 建设用地规划许可信息
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@TableName("`construction_land_planning_permission_information`")
public class ConstructionLandPlanningPermissionInformation implements Serializable {

private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
    @TableId(type = IdType.AUTO)
	@TableField(value="`id`")
	private Long id;

	/**
	 * 项目类型
	 */
	@TableField(value="`project_type`")
	private String projectType;

	/**
	 * 用地证号
	 */
	@TableField(value="`land_certificate_number`")
	private String landCertificateNumber;

	/**
	 * 项目名称
	 */
	@TableField(value="`project_name`")
	private String projectName;

	/**
	 * 建设单位
	 */
	@TableField(value="`construction_company`")
	private String constructionCompany;

	/**
	 * 用地位置
	 */
	@TableField(value="`land_location`")
	private String landLocation;

	/**
	 * 用地规模(M2)
	 */
	@TableField(value="`land_scale`")
	private String landScale;

	/**
	 * 用地取得方式
	 */
	@TableField(value="`land_acquisition_mode`")
	private String landAcquisitionMode;

	/**
	 * 工程性质
	 */
	@TableField(value="`project_nature`")
	private String projectNature;

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
	public static final String PROJECT_TYPE="project_type";
	public static final String LAND_CERTIFICATE_NUMBER="land_certificate_number";
	public static final String PROJECT_NAME="project_name";
	public static final String CONSTRUCTION_COMPANY="construction_company";
	public static final String LAND_LOCATION="land_location";
	public static final String LAND_SCALE="land_scale";
	public static final String LAND_ACQUISITION_MODE="land_acquisition_mode";
	public static final String PROJECT_NATURE="project_nature";
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
		
	public String getProjectType() {
        return projectType;
	}

	public void setProjectType(String projectType) {
        this.projectType = projectType;
    }
		
	public String getLandCertificateNumber() {
        return landCertificateNumber;
	}

	public void setLandCertificateNumber(String landCertificateNumber) {
        this.landCertificateNumber = landCertificateNumber;
    }
		
	public String getProjectName() {
        return projectName;
	}

	public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
		
	public String getConstructionCompany() {
        return constructionCompany;
	}

	public void setConstructionCompany(String constructionCompany) {
        this.constructionCompany = constructionCompany;
    }
		
	public String getLandLocation() {
        return landLocation;
	}

	public void setLandLocation(String landLocation) {
        this.landLocation = landLocation;
    }
		
	public String getLandScale() {
        return landScale;
	}

	public void setLandScale(String landScale) {
        this.landScale = landScale;
    }
		
	public String getLandAcquisitionMode() {
        return landAcquisitionMode;
	}

	public void setLandAcquisitionMode(String landAcquisitionMode) {
        this.landAcquisitionMode = landAcquisitionMode;
    }
		
	public String getProjectNature() {
        return projectNature;
	}

	public void setProjectNature(String projectNature) {
        this.projectNature = projectNature;
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
		final StringBuilder sb = new StringBuilder("ConstructionLandPlanningPermissionInformation{").append(super.toString());

	sb.append(",id=").append(id);
		sb.append(",projectType='").append(projectType).append('\'');
		sb.append(",landCertificateNumber='").append(landCertificateNumber).append('\'');
		sb.append(",projectName='").append(projectName).append('\'');
		sb.append(",constructionCompany='").append(constructionCompany).append('\'');
		sb.append(",landLocation='").append(landLocation).append('\'');
		sb.append(",landScale='").append(landScale).append('\'');
		sb.append(",landAcquisitionMode='").append(landAcquisitionMode).append('\'');
		sb.append(",projectNature='").append(projectNature).append('\'');
		sb.append(",createTime=").append(createTime);
		sb.append(",creator='").append(creator).append('\'');
		sb.append(",updateTime=").append(updateTime);
		sb.append(",updater='").append(updater).append('\'');
		sb.append(",dataLocation='").append(dataLocation).append('\'');
	
		sb.append('}');
		return sb.toString();
	}
}
