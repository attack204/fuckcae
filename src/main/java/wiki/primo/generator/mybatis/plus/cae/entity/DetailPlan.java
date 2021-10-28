package wiki.primo.generator.mybatis.plus.cae.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
											
/**
 * <p>
 * 项目进度明细表
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@TableName("`detail_plan`")
public class DetailPlan implements Serializable {

private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
    @TableId(type = IdType.AUTO)
	@TableField(value="`id`")
	private Long id;

	/**
	 * 单位名称(土地权利人)
	 */
	@TableField(value="`company_name`")
	private String companyName;

	/**
	 * 成交时间
	 */
	@TableField(value="`deal_time`")
	private Long dealTime;

	/**
	 * 成交金额
	 */
	@TableField(value="`deal_money`")
	private Long dealMoney;

	/**
	 * 证书号码
	 */
	@TableField(value="`certificate_number`")
	private String certificateNumber;

	/**
	 * 土地位置
	 */
	@TableField(value="`land_location`")
	private String landLocation;

	/**
	 * 土地面积(单位:平方米)
	 */
	@TableField(value="`land_area`")
	private String landArea;

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
	public static final String COMPANY_NAME="company_name";
	public static final String DEAL_TIME="deal_time";
	public static final String DEAL_MONEY="deal_money";
	public static final String CERTIFICATE_NUMBER="certificate_number";
	public static final String LAND_LOCATION="land_location";
	public static final String LAND_AREA="land_area";
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
		
	public String getLandLocation() {
        return landLocation;
	}

	public void setLandLocation(String landLocation) {
        this.landLocation = landLocation;
    }
		
	public String getLandArea() {
        return landArea;
	}

	public void setLandArea(String landArea) {
        this.landArea = landArea;
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
		final StringBuilder sb = new StringBuilder("DetailPlan{").append(super.toString());

	sb.append(",id=").append(id);
		sb.append(",companyName='").append(companyName).append('\'');
		sb.append(",dealTime=").append(dealTime);
		sb.append(",dealMoney=").append(dealMoney);
		sb.append(",certificateNumber='").append(certificateNumber).append('\'');
		sb.append(",landLocation='").append(landLocation).append('\'');
		sb.append(",landArea='").append(landArea).append('\'');
		sb.append(",createTime=").append(createTime);
		sb.append(",creator='").append(creator).append('\'');
		sb.append(",updateTime=").append(updateTime);
		sb.append(",updater='").append(updater).append('\'');
	
		sb.append('}');
		return sb.toString();
	}
}
