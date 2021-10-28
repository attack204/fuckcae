package wiki.primo.generator.mybatis.plus.cae.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
																		
/**
 * <p>
 * 土地出让信息
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@TableName("`land_sell_information`")
public class LandSellInformation implements Serializable {

private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
    @TableId(type = IdType.AUTO)
	@TableField(value="`id`")
	private Long id;

	/**
	 * 单位名称
	 */
	@TableField(value="`company_name`")
	private String companyName;

	/**
	 * 成交时间
	 */
	@TableField(value="`deal_time`")
	private Long dealTime;

	/**
	 * 金钱
	 */
	@TableField(value="`deal_money`")
	private Long dealMoney;

	/**
	 * 证书号码
	 */
	@TableField(value="`certificate_number`")
	private String certificateNumber;

	/**
	 * 土地地区 //此处应特殊处理
	 */
	@TableField(value="`land_position`")
	private String landPosition;

	/**
	 * 土地面积
	 */
	@TableField(value="`land_area`")
	private Long landArea;

	/**
	 * 土地用途
	 */
	@TableField(value="`land_purpose`")
	private String landPurpose;

	/**
	 * 土地等级
	 */
	@TableField(value="`land_level`")
	private String landLevel;

	/**
	 * 权属性质
	 */
	@TableField(value="`land_nature`")
	private String landNature;

	/**
	 * 批准时间
	 */
	@TableField(value="`approval_time`")
	private Long approvalTime;

	/**
	 * 终止时间
	 */
	@TableField(value="`termination_time`")
	private Long terminationTime;

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
	public static final String COMPANY_NAME="company_name";
	public static final String DEAL_TIME="deal_time";
	public static final String DEAL_MONEY="deal_money";
	public static final String CERTIFICATE_NUMBER="certificate_number";
	public static final String LAND_POSITION="land_position";
	public static final String LAND_AREA="land_area";
	public static final String LAND_PURPOSE="land_purpose";
	public static final String LAND_LEVEL="land_level";
	public static final String LAND_NATURE="land_nature";
	public static final String APPROVAL_TIME="approval_time";
	public static final String TERMINATION_TIME="termination_time";
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
		
	public String getCompanyName() {
        return companyName;
	}

	public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
		
	public Long getDealTime() {
        return dealTime;
	}

	public void setDealTime(Long dealTime) {
        this.dealTime = dealTime;
    }
		
	public Long getDealMoney() {
        return dealMoney;
	}

	public void setDealMoney(Long dealMoney) {
        this.dealMoney = dealMoney;
    }
		
	public String getCertificateNumber() {
        return certificateNumber;
	}

	public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }
		
	public String getLandPosition() {
        return landPosition;
	}

	public void setLandPosition(String landPosition) {
        this.landPosition = landPosition;
    }
		
	public Long getLandArea() {
        return landArea;
	}

	public void setLandArea(Long landArea) {
        this.landArea = landArea;
    }
		
	public String getLandPurpose() {
        return landPurpose;
	}

	public void setLandPurpose(String landPurpose) {
        this.landPurpose = landPurpose;
    }
		
	public String getLandLevel() {
        return landLevel;
	}

	public void setLandLevel(String landLevel) {
        this.landLevel = landLevel;
    }
		
	public String getLandNature() {
        return landNature;
	}

	public void setLandNature(String landNature) {
        this.landNature = landNature;
    }
		
	public Long getApprovalTime() {
        return approvalTime;
	}

	public void setApprovalTime(Long approvalTime) {
        this.approvalTime = approvalTime;
    }
		
	public Long getTerminationTime() {
        return terminationTime;
	}

	public void setTerminationTime(Long terminationTime) {
        this.terminationTime = terminationTime;
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
		final StringBuilder sb = new StringBuilder("LandSellInformation{").append(super.toString());

	sb.append(",id=").append(id);
		sb.append(",companyName='").append(companyName).append('\'');
		sb.append(",dealTime=").append(dealTime);
		sb.append(",dealMoney=").append(dealMoney);
		sb.append(",certificateNumber='").append(certificateNumber).append('\'');
		sb.append(",landPosition='").append(landPosition).append('\'');
		sb.append(",landArea=").append(landArea);
		sb.append(",landPurpose='").append(landPurpose).append('\'');
		sb.append(",landLevel='").append(landLevel).append('\'');
		sb.append(",landNature='").append(landNature).append('\'');
		sb.append(",approvalTime=").append(approvalTime);
		sb.append(",terminationTime=").append(terminationTime);
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
