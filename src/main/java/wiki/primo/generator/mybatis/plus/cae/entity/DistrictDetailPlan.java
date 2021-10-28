package wiki.primo.generator.mybatis.plus.cae.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
											
/**
 * <p>
 * 区级重点项目进度明细表
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@TableName("`district_detail_plan`")
public class DistrictDetailPlan implements Serializable {

private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
    @TableId(type = IdType.AUTO)
	@TableField(value="`id`")
	private Long id;

	/**
	 * 计划投资(万元)
	 */
	@TableField(value="`investment_money`")
	private Long investmentMoney;

	/**
	 * 征地拆迁
	 */
	@TableField(value="`land_acquisition_and_demolition_money`")
	private Long landAcquisitionAndDemolitionMoney;

	/**
	 * 土建工程
	 */
	@TableField(value="`building_projects_money`")
	private Long buildingProjectsMoney;

	/**
	 * 设备购置
	 */
	@TableField(value="`equipment_purchase_money`")
	private Long equipmentPurchaseMoney;

	/**
	 * 其他金额
	 */
	@TableField(value="`other_money`")
	private Long otherMoney;

	/**
	 * 分季度形象进度明细
	 */
	@TableField(value="`quarterly_progress_details`")
	private String quarterlyProgressDetails;

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


	public static final String ID="id";
	public static final String INVESTMENT_MONEY="investment_money";
	public static final String LAND_ACQUISITION_AND_DEMOLITION_MONEY="land_acquisition_and_demolition_money";
	public static final String BUILDING_PROJECTS_MONEY="building_projects_money";
	public static final String EQUIPMENT_PURCHASE_MONEY="equipment_purchase_money";
	public static final String OTHER_MONEY="other_money";
	public static final String QUARTERLY_PROGRESS_DETAILS="quarterly_progress_details";
	public static final String CREATE_TIME="create_time";
	public static final String CREATOR="creator";
	public static final String UPDATE_TIME="update_time";
	public static final String UPDATER="updater";

		
	public Long getId() {
        return id;
	}

	public void setId(Long id) {
        this.id = id;
    }
		
	public Long getInvestmentMoney() {
        return investmentMoney;
	}

	public void setInvestmentMoney(Long investmentMoney) {
        this.investmentMoney = investmentMoney;
    }
		
	public Long getLandAcquisitionAndDemolitionMoney() {
        return landAcquisitionAndDemolitionMoney;
	}

	public void setLandAcquisitionAndDemolitionMoney(Long landAcquisitionAndDemolitionMoney) {
        this.landAcquisitionAndDemolitionMoney = landAcquisitionAndDemolitionMoney;
    }
		
	public Long getBuildingProjectsMoney() {
        return buildingProjectsMoney;
	}

	public void setBuildingProjectsMoney(Long buildingProjectsMoney) {
        this.buildingProjectsMoney = buildingProjectsMoney;
    }
		
	public Long getEquipmentPurchaseMoney() {
        return equipmentPurchaseMoney;
	}

	public void setEquipmentPurchaseMoney(Long equipmentPurchaseMoney) {
        this.equipmentPurchaseMoney = equipmentPurchaseMoney;
    }
		
	public Long getOtherMoney() {
        return otherMoney;
	}

	public void setOtherMoney(Long otherMoney) {
        this.otherMoney = otherMoney;
    }
		
	public String getQuarterlyProgressDetails() {
        return quarterlyProgressDetails;
	}

	public void setQuarterlyProgressDetails(String quarterlyProgressDetails) {
        this.quarterlyProgressDetails = quarterlyProgressDetails;
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

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("DistrictDetailPlan{").append(super.toString());

	sb.append(",id=").append(id);
		sb.append(",investmentMoney=").append(investmentMoney);
		sb.append(",landAcquisitionAndDemolitionMoney=").append(landAcquisitionAndDemolitionMoney);
		sb.append(",buildingProjectsMoney=").append(buildingProjectsMoney);
		sb.append(",equipmentPurchaseMoney=").append(equipmentPurchaseMoney);
		sb.append(",otherMoney=").append(otherMoney);
		sb.append(",quarterlyProgressDetails='").append(quarterlyProgressDetails).append('\'');
		sb.append(",createTime=").append(createTime);
		sb.append(",creator='").append(creator).append('\'');
		sb.append(",updateTime=").append(updateTime);
		sb.append(",updater='").append(updater).append('\'');
	
		sb.append('}');
		return sb.toString();
	}
}
