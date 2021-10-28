package wiki.primo.generator.mybatis.plus.cae.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
																		
/**
 * <p>
 * 土地回收信息
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@TableName("`land_recovery_information`")
public class LandRecoveryInformation implements Serializable {

private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
    @TableId(type = IdType.AUTO)
	@TableField(value="`id`")
	private Long id;

	/**
	 * 批准机关
	 */
	@TableField(value="`approval_company`")
	private String approvalCompany;

	/**
	 * 批准文号
	 */
	@TableField(value="`approval_certificate_number`")
	private String approvalCertificateNumber;

	/**
	 * 批准时间
	 */
	@TableField(value="`approval_time`")
	private Long approvalTime;

	/**
	 * 收回土地范围
	 */
	@TableField(value="`reclaimed_land_position`")
	private Long reclaimedLandPosition;

	/**
	 * 原土地使用者
	 */
	@TableField(value="`original_land_user`")
	private String originalLandUser;

	/**
	 * 原用途
	 */
	@TableField(value="`original_purpose`")
	private String originalPurpose;

	/**
	 * 使用权类型
	 */
	@TableField(value="`use_right_type`")
	private String useRightType;

	/**
	 * 土地证号
	 */
	@TableField(value="`land_certificate_number`")
	private String landCertificateNumber;

	/**
	 * 原土地面积
	 */
	@TableField(value="`original_land_area`")
	private Long originalLandArea;

	/**
	 * 收回土地面积
	 */
	@TableField(value="`recovered_land_area`")
	private Long recoveredLandArea;

	/**
	 * 补偿总价格
	 */
	@TableField(value="`total_compensation_price`")
	private Long totalCompensationPrice;

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
	public static final String APPROVAL_COMPANY="approval_company";
	public static final String APPROVAL_CERTIFICATE_NUMBER="approval_certificate_number";
	public static final String APPROVAL_TIME="approval_time";
	public static final String RECLAIMED_LAND_POSITION="reclaimed_land_position";
	public static final String ORIGINAL_LAND_USER="original_land_user";
	public static final String ORIGINAL_PURPOSE="original_purpose";
	public static final String USE_RIGHT_TYPE="use_right_type";
	public static final String LAND_CERTIFICATE_NUMBER="land_certificate_number";
	public static final String ORIGINAL_LAND_AREA="original_land_area";
	public static final String RECOVERED_LAND_AREA="recovered_land_area";
	public static final String TOTAL_COMPENSATION_PRICE="total_compensation_price";
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
		
	public String getApprovalCompany() {
        return approvalCompany;
	}

	public void setApprovalCompany(String approvalCompany) {
        this.approvalCompany = approvalCompany;
    }
		
	public String getApprovalCertificateNumber() {
        return approvalCertificateNumber;
	}

	public void setApprovalCertificateNumber(String approvalCertificateNumber) {
        this.approvalCertificateNumber = approvalCertificateNumber;
    }
		
	public Long getApprovalTime() {
        return approvalTime;
	}

	public void setApprovalTime(Long approvalTime) {
        this.approvalTime = approvalTime;
    }
		
	public Long getReclaimedLandPosition() {
        return reclaimedLandPosition;
	}

	public void setReclaimedLandPosition(Long reclaimedLandPosition) {
        this.reclaimedLandPosition = reclaimedLandPosition;
    }
		
	public String getOriginalLandUser() {
        return originalLandUser;
	}

	public void setOriginalLandUser(String originalLandUser) {
        this.originalLandUser = originalLandUser;
    }
		
	public String getOriginalPurpose() {
        return originalPurpose;
	}

	public void setOriginalPurpose(String originalPurpose) {
        this.originalPurpose = originalPurpose;
    }
		
	public String getUseRightType() {
        return useRightType;
	}

	public void setUseRightType(String useRightType) {
        this.useRightType = useRightType;
    }
		
	public String getLandCertificateNumber() {
        return landCertificateNumber;
	}

	public void setLandCertificateNumber(String landCertificateNumber) {
        this.landCertificateNumber = landCertificateNumber;
    }
		
	public Long getOriginalLandArea() {
        return originalLandArea;
	}

	public void setOriginalLandArea(Long originalLandArea) {
        this.originalLandArea = originalLandArea;
    }
		
	public Long getRecoveredLandArea() {
        return recoveredLandArea;
	}

	public void setRecoveredLandArea(Long recoveredLandArea) {
        this.recoveredLandArea = recoveredLandArea;
    }
		
	public Long getTotalCompensationPrice() {
        return totalCompensationPrice;
	}

	public void setTotalCompensationPrice(Long totalCompensationPrice) {
        this.totalCompensationPrice = totalCompensationPrice;
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
		final StringBuilder sb = new StringBuilder("LandRecoveryInformation{").append(super.toString());

	sb.append(",id=").append(id);
		sb.append(",approvalCompany='").append(approvalCompany).append('\'');
		sb.append(",approvalCertificateNumber='").append(approvalCertificateNumber).append('\'');
		sb.append(",approvalTime=").append(approvalTime);
		sb.append(",reclaimedLandPosition=").append(reclaimedLandPosition);
		sb.append(",originalLandUser='").append(originalLandUser).append('\'');
		sb.append(",originalPurpose='").append(originalPurpose).append('\'');
		sb.append(",useRightType='").append(useRightType).append('\'');
		sb.append(",landCertificateNumber='").append(landCertificateNumber).append('\'');
		sb.append(",originalLandArea=").append(originalLandArea);
		sb.append(",recoveredLandArea=").append(recoveredLandArea);
		sb.append(",totalCompensationPrice=").append(totalCompensationPrice);
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
