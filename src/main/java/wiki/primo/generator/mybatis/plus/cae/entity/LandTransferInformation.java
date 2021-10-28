package wiki.primo.generator.mybatis.plus.cae.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
																		
/**
 * <p>
 * 土地转让信息
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@TableName("`land_transfer_information`")
public class LandTransferInformation implements Serializable {

private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
    @TableId(type = IdType.AUTO)
	@TableField(value="`id`")
	private Long id;

	/**
	 * 转让方
	 */
	@TableField(value="`transfer_company_name`")
	private String transferCompanyName;

	/**
	 * 住址
	 */
	@TableField(value="`company_position`")
	private String companyPosition;

	/**
	 * 转让方联系电话
	 */
	@TableField(value="`transfer_phone`")
	private String transferPhone;

	/**
	 * 
	 */
	@TableField(value="`assignee_company_name`")
	private String assigneeCompanyName;

	/**
	 * 受让方联系电话
	 */
	@TableField(value="`assignee_phone`")
	private String assigneePhone;

	/**
	 * 土地位置
	 */
	@TableField(value="`land_position`")
	private String landPosition;

	/**
	 * 土地面积
	 */
	@TableField(value="`land_area`")
	private String landArea;

	/**
	 * 证书号码
	 */
	@TableField(value="`certificate_number`")
	private String certificateNumber;

	/**
	 * 土地用途
	 */
	@TableField(value="`land_purpose`")
	private String landPurpose;

	/**
	 * 转让时间
	 */
	@TableField(value="`deal_time`")
	private Long dealTime;

	/**
	 * 金钱
	 */
	@TableField(value="`deal_money`")
	private Long dealMoney;

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
	public static final String TRANSFER_COMPANY_NAME="transfer_company_name";
	public static final String COMPANY_POSITION="company_position";
	public static final String TRANSFER_PHONE="transfer_phone";
	public static final String ASSIGNEE_COMPANY_NAME="assignee_company_name";
	public static final String ASSIGNEE_PHONE="assignee_phone";
	public static final String LAND_POSITION="land_position";
	public static final String LAND_AREA="land_area";
	public static final String CERTIFICATE_NUMBER="certificate_number";
	public static final String LAND_PURPOSE="land_purpose";
	public static final String DEAL_TIME="deal_time";
	public static final String DEAL_MONEY="deal_money";
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
		
	public String getTransferCompanyName() {
        return transferCompanyName;
	}

	public void setTransferCompanyName(String transferCompanyName) {
        this.transferCompanyName = transferCompanyName;
    }
		
	public String getCompanyPosition() {
        return companyPosition;
	}

	public void setCompanyPosition(String companyPosition) {
        this.companyPosition = companyPosition;
    }
		
	public String getTransferPhone() {
        return transferPhone;
	}

	public void setTransferPhone(String transferPhone) {
        this.transferPhone = transferPhone;
    }
		
	public String getAssigneeCompanyName() {
        return assigneeCompanyName;
	}

	public void setAssigneeCompanyName(String assigneeCompanyName) {
        this.assigneeCompanyName = assigneeCompanyName;
    }
		
	public String getAssigneePhone() {
        return assigneePhone;
	}

	public void setAssigneePhone(String assigneePhone) {
        this.assigneePhone = assigneePhone;
    }
		
	public String getLandPosition() {
        return landPosition;
	}

	public void setLandPosition(String landPosition) {
        this.landPosition = landPosition;
    }
		
	public String getLandArea() {
        return landArea;
	}

	public void setLandArea(String landArea) {
        this.landArea = landArea;
    }
		
	public String getCertificateNumber() {
        return certificateNumber;
	}

	public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }
		
	public String getLandPurpose() {
        return landPurpose;
	}

	public void setLandPurpose(String landPurpose) {
        this.landPurpose = landPurpose;
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
		final StringBuilder sb = new StringBuilder("LandTransferInformation{").append(super.toString());

	sb.append(",id=").append(id);
		sb.append(",transferCompanyName='").append(transferCompanyName).append('\'');
		sb.append(",companyPosition='").append(companyPosition).append('\'');
		sb.append(",transferPhone='").append(transferPhone).append('\'');
		sb.append(",assigneeCompanyName='").append(assigneeCompanyName).append('\'');
		sb.append(",assigneePhone='").append(assigneePhone).append('\'');
		sb.append(",landPosition='").append(landPosition).append('\'');
		sb.append(",landArea='").append(landArea).append('\'');
		sb.append(",certificateNumber='").append(certificateNumber).append('\'');
		sb.append(",landPurpose='").append(landPurpose).append('\'');
		sb.append(",dealTime=").append(dealTime);
		sb.append(",dealMoney=").append(dealMoney);
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
