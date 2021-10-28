package wiki.primo.generator.mybatis.plus.cae.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
																		
/**
 * <p>
 * 工程项目信息
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@TableName("`project_information`")
public class ProjectInformation implements Serializable {

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
	 * 填报日期
	 */
	@TableField(value="`filling_time`")
	private Long fillingTime;

	/**
	 * 行政区划
	 */
	@TableField(value="`administrative_area`")
	private String administrativeArea;

	/**
	 * 主管部门
	 */
	@TableField(value="`competent_department`")
	private String competentDepartment;

	/**
	 * 项目地址
	 */
	@TableField(value="`project_location`")
	private String projectLocation;

	/**
	 * 建设单位名称
	 */
	@TableField(value="`construction_company`")
	private String constructionCompany;

	/**
	 * 建设单位统一社会信用代码
	 */
	@TableField(value="`construction_company_social_credit_certificate_number`")
	private String constructionCompanySocialCreditCertificateNumber;

	/**
	 * 中标单位名称
	 */
	@TableField(value="`winning_company`")
	private String winningCompany;

	/**
	 * 中标单位统一社会信用代码
	 */
	@TableField(value="`winning_company_social_credit_certificate_number`")
	private String winningCompanySocialCreditCertificateNumber;

	/**
	 * 中标时间
	 */
	@TableField(value="`winning_time`")
	private Long winningTime;

	/**
	 * 中标金额(元)
	 */
	@TableField(value="`winning_money`")
	private Long winningMoney;

	/**
	 * 开工时间
	 */
	@TableField(value="`begin_time`")
	private Long beginTime;

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
	public static final String FILLING_TIME="filling_time";
	public static final String ADMINISTRATIVE_AREA="administrative_area";
	public static final String COMPETENT_DEPARTMENT="competent_department";
	public static final String PROJECT_LOCATION="project_location";
	public static final String CONSTRUCTION_COMPANY="construction_company";
	public static final String CONSTRUCTION_COMPANY_SOCIAL_CREDIT_CERTIFICATE_NUMBER="construction_company_social_credit_certificate_number";
	public static final String WINNING_COMPANY="winning_company";
	public static final String WINNING_COMPANY_SOCIAL_CREDIT_CERTIFICATE_NUMBER="winning_company_social_credit_certificate_number";
	public static final String WINNING_TIME="winning_time";
	public static final String WINNING_MONEY="winning_money";
	public static final String BEGIN_TIME="begin_time";
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
		
	public Long getFillingTime() {
        return fillingTime;
	}

	public void setFillingTime(Long fillingTime) {
        this.fillingTime = fillingTime;
    }
		
	public String getAdministrativeArea() {
        return administrativeArea;
	}

	public void setAdministrativeArea(String administrativeArea) {
        this.administrativeArea = administrativeArea;
    }
		
	public String getCompetentDepartment() {
        return competentDepartment;
	}

	public void setCompetentDepartment(String competentDepartment) {
        this.competentDepartment = competentDepartment;
    }
		
	public String getProjectLocation() {
        return projectLocation;
	}

	public void setProjectLocation(String projectLocation) {
        this.projectLocation = projectLocation;
    }
		
	public String getConstructionCompany() {
        return constructionCompany;
	}

	public void setConstructionCompany(String constructionCompany) {
        this.constructionCompany = constructionCompany;
    }
		
	public String getConstructionCompanySocialCreditCertificateNumber() {
        return constructionCompanySocialCreditCertificateNumber;
	}

	public void setConstructionCompanySocialCreditCertificateNumber(String constructionCompanySocialCreditCertificateNumber) {
        this.constructionCompanySocialCreditCertificateNumber = constructionCompanySocialCreditCertificateNumber;
    }
		
	public String getWinningCompany() {
        return winningCompany;
	}

	public void setWinningCompany(String winningCompany) {
        this.winningCompany = winningCompany;
    }
		
	public String getWinningCompanySocialCreditCertificateNumber() {
        return winningCompanySocialCreditCertificateNumber;
	}

	public void setWinningCompanySocialCreditCertificateNumber(String winningCompanySocialCreditCertificateNumber) {
        this.winningCompanySocialCreditCertificateNumber = winningCompanySocialCreditCertificateNumber;
    }
		
	public Long getWinningTime() {
        return winningTime;
	}

	public void setWinningTime(Long winningTime) {
        this.winningTime = winningTime;
    }
		
	public Long getWinningMoney() {
        return winningMoney;
	}

	public void setWinningMoney(Long winningMoney) {
        this.winningMoney = winningMoney;
    }
		
	public Long getBeginTime() {
        return beginTime;
	}

	public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
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
		final StringBuilder sb = new StringBuilder("ProjectInformation{").append(super.toString());

	sb.append(",id=").append(id);
		sb.append(",projectName='").append(projectName).append('\'');
		sb.append(",fillingTime=").append(fillingTime);
		sb.append(",administrativeArea='").append(administrativeArea).append('\'');
		sb.append(",competentDepartment='").append(competentDepartment).append('\'');
		sb.append(",projectLocation='").append(projectLocation).append('\'');
		sb.append(",constructionCompany='").append(constructionCompany).append('\'');
		sb.append(",constructionCompanySocialCreditCertificateNumber='").append(constructionCompanySocialCreditCertificateNumber).append('\'');
		sb.append(",winningCompany='").append(winningCompany).append('\'');
		sb.append(",winningCompanySocialCreditCertificateNumber='").append(winningCompanySocialCreditCertificateNumber).append('\'');
		sb.append(",winningTime=").append(winningTime);
		sb.append(",winningMoney=").append(winningMoney);
		sb.append(",beginTime=").append(beginTime);
		sb.append(",createTime=").append(createTime);
		sb.append(",creator='").append(creator).append('\'');
		sb.append(",updateTime=").append(updateTime);
		sb.append(",updater='").append(updater).append('\'');
		sb.append(",dataLocation='").append(dataLocation).append('\'');
	
		sb.append('}');
		return sb.toString();
	}
}
