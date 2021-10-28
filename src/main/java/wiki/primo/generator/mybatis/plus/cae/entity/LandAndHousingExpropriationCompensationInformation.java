package wiki.primo.generator.mybatis.plus.cae.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
																
/**
 * <p>
 * 土地及房屋征收补偿信息
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@TableName("`land_and_housing_expropriation_compensation_information`")
public class LandAndHousingExpropriationCompensationInformation implements Serializable {

private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
    @TableId(type = IdType.AUTO)
	@TableField(value="`id`")
	private Long id;

	/**
	 * 补偿单位(个人)
	 */
	@TableField(value="`compensate_company`")
	private String compensateCompany;

	/**
	 * 收回土地坐落
	 */
	@TableField(value="`reclaimed_land_location`")
	private String reclaimedLandLocation;

	/**
	 * 收回土地面积(平方米)
	 */
	@TableField(value="`reclaimed_land_area`")
	private Long reclaimedLandArea;

	/**
	 * 土地证号
	 */
	@TableField(value="`land_certificate_number`")
	private String landCertificateNumber;

	/**
	 * 土地用途
	 */
	@TableField(value="`land_purpose`")
	private String landPurpose;

	/**
	 * 建筑物及附属建筑物面积
	 */
	@TableField(value="`buildings_and_ancillary_buildings_area`")
	private Long buildingsAndAncillaryBuildingsArea;

	/**
	 * 评估土地价值
	 */
	@TableField(value="`evaluate_land_value`")
	private Long evaluateLandValue;

	/**
	 * 评估地上建筑物及附属物价值
	 */
	@TableField(value="`evaluate_aboveground_buildings_and_appurtenances_value`")
	private Long evaluateAbovegroundBuildingsAndAppurtenancesValue;

	/**
	 * 补偿土地价值
	 */
	@TableField(value="`compensate_land_value`")
	private Long compensateLandValue;

	/**
	 * 补偿地上建筑物及附属物价值
	 */
	@TableField(value="`compensate_aboveground_buildings_and_appurtenances_value`")
	private Long compensateAbovegroundBuildingsAndAppurtenancesValue;

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
	public static final String COMPENSATE_COMPANY="compensate_company";
	public static final String RECLAIMED_LAND_LOCATION="reclaimed_land_location";
	public static final String RECLAIMED_LAND_AREA="reclaimed_land_area";
	public static final String LAND_CERTIFICATE_NUMBER="land_certificate_number";
	public static final String LAND_PURPOSE="land_purpose";
	public static final String BUILDINGS_AND_ANCILLARY_BUILDINGS_AREA="buildings_and_ancillary_buildings_area";
	public static final String EVALUATE_LAND_VALUE="evaluate_land_value";
	public static final String EVALUATE_ABOVEGROUND_BUILDINGS_AND_APPURTENANCES_VALUE="evaluate_aboveground_buildings_and_appurtenances_value";
	public static final String COMPENSATE_LAND_VALUE="compensate_land_value";
	public static final String COMPENSATE_ABOVEGROUND_BUILDINGS_AND_APPURTENANCES_VALUE="compensate_aboveground_buildings_and_appurtenances_value";
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
		
	public String getCompensateCompany() {
        return compensateCompany;
	}

	public void setCompensateCompany(String compensateCompany) {
        this.compensateCompany = compensateCompany;
    }
		
	public String getReclaimedLandLocation() {
        return reclaimedLandLocation;
	}

	public void setReclaimedLandLocation(String reclaimedLandLocation) {
        this.reclaimedLandLocation = reclaimedLandLocation;
    }
		
	public Long getReclaimedLandArea() {
        return reclaimedLandArea;
	}

	public void setReclaimedLandArea(Long reclaimedLandArea) {
        this.reclaimedLandArea = reclaimedLandArea;
    }
		
	public String getLandCertificateNumber() {
        return landCertificateNumber;
	}

	public void setLandCertificateNumber(String landCertificateNumber) {
        this.landCertificateNumber = landCertificateNumber;
    }
		
	public String getLandPurpose() {
        return landPurpose;
	}

	public void setLandPurpose(String landPurpose) {
        this.landPurpose = landPurpose;
    }
		
	public Long getBuildingsAndAncillaryBuildingsArea() {
        return buildingsAndAncillaryBuildingsArea;
	}

	public void setBuildingsAndAncillaryBuildingsArea(Long buildingsAndAncillaryBuildingsArea) {
        this.buildingsAndAncillaryBuildingsArea = buildingsAndAncillaryBuildingsArea;
    }
		
	public Long getEvaluateLandValue() {
        return evaluateLandValue;
	}

	public void setEvaluateLandValue(Long evaluateLandValue) {
        this.evaluateLandValue = evaluateLandValue;
    }
		
	public Long getEvaluateAbovegroundBuildingsAndAppurtenancesValue() {
        return evaluateAbovegroundBuildingsAndAppurtenancesValue;
	}

	public void setEvaluateAbovegroundBuildingsAndAppurtenancesValue(Long evaluateAbovegroundBuildingsAndAppurtenancesValue) {
        this.evaluateAbovegroundBuildingsAndAppurtenancesValue = evaluateAbovegroundBuildingsAndAppurtenancesValue;
    }
		
	public Long getCompensateLandValue() {
        return compensateLandValue;
	}

	public void setCompensateLandValue(Long compensateLandValue) {
        this.compensateLandValue = compensateLandValue;
    }
		
	public Long getCompensateAbovegroundBuildingsAndAppurtenancesValue() {
        return compensateAbovegroundBuildingsAndAppurtenancesValue;
	}

	public void setCompensateAbovegroundBuildingsAndAppurtenancesValue(Long compensateAbovegroundBuildingsAndAppurtenancesValue) {
        this.compensateAbovegroundBuildingsAndAppurtenancesValue = compensateAbovegroundBuildingsAndAppurtenancesValue;
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
		final StringBuilder sb = new StringBuilder("LandAndHousingExpropriationCompensationInformation{").append(super.toString());

	sb.append(",id=").append(id);
		sb.append(",compensateCompany='").append(compensateCompany).append('\'');
		sb.append(",reclaimedLandLocation='").append(reclaimedLandLocation).append('\'');
		sb.append(",reclaimedLandArea=").append(reclaimedLandArea);
		sb.append(",landCertificateNumber='").append(landCertificateNumber).append('\'');
		sb.append(",landPurpose='").append(landPurpose).append('\'');
		sb.append(",buildingsAndAncillaryBuildingsArea=").append(buildingsAndAncillaryBuildingsArea);
		sb.append(",evaluateLandValue=").append(evaluateLandValue);
		sb.append(",evaluateAbovegroundBuildingsAndAppurtenancesValue=").append(evaluateAbovegroundBuildingsAndAppurtenancesValue);
		sb.append(",compensateLandValue=").append(compensateLandValue);
		sb.append(",compensateAbovegroundBuildingsAndAppurtenancesValue=").append(compensateAbovegroundBuildingsAndAppurtenancesValue);
		sb.append(",createTime=").append(createTime);
		sb.append(",creator='").append(creator).append('\'');
		sb.append(",updateTime=").append(updateTime);
		sb.append(",updater='").append(updater).append('\'');
		sb.append(",dataLocation='").append(dataLocation).append('\'');
	
		sb.append('}');
		return sb.toString();
	}
}
