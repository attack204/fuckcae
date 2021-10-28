package wiki.primo.generator.mybatis.plus.cae.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
								
/**
 * <p>
 * 建设项目税收管理台账
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
@TableName("`construction_project_tax_management_account`")
public class ConstructionProjectTaxManagementAccount implements Serializable {

private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
    @TableId(type = IdType.AUTO)
	@TableField(value="`id`")
	private Long id;

	/**
	 * 文件地址
	 */
	@TableField(value="`file_path`")
	private String filePath;

	/**
	 * 导入时间
	 */
	@TableField(value="`import_time`")
	private Long importTime;

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
	public static final String FILE_PATH="file_path";
	public static final String IMPORT_TIME="import_time";
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
		
	public String getFilePath() {
        return filePath;
	}

	public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
		
	public Long getImportTime() {
        return importTime;
	}

	public void setImportTime(Long importTime) {
        this.importTime = importTime;
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
		final StringBuilder sb = new StringBuilder("ConstructionProjectTaxManagementAccount{").append(super.toString());

	sb.append(",id=").append(id);
		sb.append(",filePath='").append(filePath).append('\'');
		sb.append(",importTime=").append(importTime);
		sb.append(",createTime=").append(createTime);
		sb.append(",creator='").append(creator).append('\'');
		sb.append(",updateTime=").append(updateTime);
		sb.append(",updater='").append(updater).append('\'');
		sb.append(",dataLocation='").append(dataLocation).append('\'');
	
		sb.append('}');
		return sb.toString();
	}
}
