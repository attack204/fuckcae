package wiki.primo.generator.mybatis.plus.cae.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
																		
/**
 * <p>
 * 施工许可证信息
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@TableName("`construction_permit_information`")
public class ConstructionPermitInformation implements Serializable {

private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
    @TableId(type = IdType.AUTO)
	@TableField(value="`id`")
	private Long id;

	/**
	 * 工程名称
	 */
	@TableField(value="`project_name`")
	private String projectName;

	/**
	 * 建设地址
	 */
	@TableField(value="`project_position`")
	private String projectPosition;

	/**
	 * 建设单位
	 */
	@TableField(value="`build_company`")
	private String buildCompany;

	/**
	 * 联系电话
	 */
	@TableField(value="`contact_phone`")
	private String contactPhone;

	/**
	 * 批准时间
	 */
	@TableField(value="`approval_time`")
	private Long approvalTime;

	/**
	 * 工程概算(万元)
	 */
	@TableField(value="`expect_investment`")
	private Long expectInvestment;

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
	 * 许可证编号
	 */
	@TableField(value="`permit_number`")
	private String permitNumber;

	/**
	 * 施工单位
	 */
	@TableField(value="`construction_company`")
	private String constructionCompany;

	/**
	 * 设计单位
	 */
	@TableField(value="`design_company`")
	private String designCompany;

	/**
	 * 监理单位
	 */
	@TableField(value="`supervise_company`")
	private String superviseCompany;

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
	public static final String PROJECT_POSITION="project_position";
	public static final String BUILD_COMPANY="build_company";
	public static final String CONTACT_PHONE="contact_phone";
	public static final String APPROVAL_TIME="approval_time";
	public static final String EXPECT_INVESTMENT="expect_investment";
	public static final String BEGIN_TIME="begin_time";
	public static final String END_TIME="end_time";
	public static final String PERMIT_NUMBER="permit_number";
	public static final String CONSTRUCTION_COMPANY="construction_company";
	public static final String DESIGN_COMPANY="design_company";
	public static final String SUPERVISE_COMPANY="supervise_company";
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
		
	public String getProjectPosition() {
        return projectPosition;
	}

	public void setProjectPosition(String projectPosition) {
        this.projectPosition = projectPosition;
    }
		
	public String getBuildCompany() {
        return buildCompany;
	}

	public void setBuildCompany(String buildCompany) {
        this.buildCompany = buildCompany;
    }
		
	public String getContactPhone() {
        return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
		
	public Long getApprovalTime() {
        return approvalTime;
	}

	public void setApprovalTime(Long approvalTime) {
        this.approvalTime = approvalTime;
    }
		
	public Long getExpectInvestment() {
        return expectInvestment;
	}

	public void setExpectInvestment(Long expectInvestment) {
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
		
	public String getPermitNumber() {
        return permitNumber;
	}

	public void setPermitNumber(String permitNumber) {
        this.permitNumber = permitNumber;
    }
		
	public String getConstructionCompany() {
        return constructionCompany;
	}

	public void setConstructionCompany(String constructionCompany) {
        this.constructionCompany = constructionCompany;
    }
		
	public String getDesignCompany() {
        return designCompany;
	}

	public void setDesignCompany(String designCompany) {
        this.designCompany = designCompany;
    }
		
	public String getSuperviseCompany() {
        return superviseCompany;
	}

	public void setSuperviseCompany(String superviseCompany) {
        this.superviseCompany = superviseCompany;
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
		final StringBuilder sb = new StringBuilder("ConstructionPermitInformation{").append(super.toString());

	sb.append(",id=").append(id);
		sb.append(",projectName='").append(projectName).append('\'');
		sb.append(",projectPosition='").append(projectPosition).append('\'');
		sb.append(",buildCompany='").append(buildCompany).append('\'');
		sb.append(",contactPhone='").append(contactPhone).append('\'');
		sb.append(",approvalTime=").append(approvalTime);
		sb.append(",expectInvestment=").append(expectInvestment);
		sb.append(",beginTime=").append(beginTime);
		sb.append(",endTime=").append(endTime);
		sb.append(",permitNumber='").append(permitNumber).append('\'');
		sb.append(",constructionCompany='").append(constructionCompany).append('\'');
		sb.append(",designCompany='").append(designCompany).append('\'');
		sb.append(",superviseCompany='").append(superviseCompany).append('\'');
		sb.append(",createTime=").append(createTime);
		sb.append(",creator='").append(creator).append('\'');
		sb.append(",updateTime=").append(updateTime);
		sb.append(",updater='").append(updater).append('\'');
		sb.append(",dataLocation='").append(dataLocation).append('\'');
	
		sb.append('}');
		return sb.toString();
	}
}
