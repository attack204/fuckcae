package wiki.primo.generator.mybatis.plus.cae.query;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import wiki.primo.generator.mybatis.plus.cae.entity.ConstructionProjectTaxManagementAccount;
import java.util.List;

								

/**
 * <p>
 * 建设项目税收管理台账
 * 查询条件类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
public class ConstructionProjectTaxManagementAccountQueryBo{

	private QueryBoExt queryBoExt;

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 文件地址
	 */
	private String filePath;

	/**
	 * 导入时间
	 */
	private Long importTime;

	/**
	 * 注册时间
	 */
	private Long createTime;

	/**
	 * 创建者
	 */
	private String creator;

	/**
	 * 更新时间
	 */
	private Long updateTime;

	/**
	 * 更新者
	 */
	private String updater;

	/**
	 * 数据所在区域
	 */
	private String dataLocation;


	/**
	 * 构建查询
	 * @return
	 */
	public QueryWrapper<ConstructionProjectTaxManagementAccount> buildQuery() {
		QueryWrapper<ConstructionProjectTaxManagementAccount> query = new QueryWrapper<>();

		if(id!=null){
			query.eq(ConstructionProjectTaxManagementAccount.ID,id);
		}
		if(filePath!=null){
			query.eq(ConstructionProjectTaxManagementAccount.FILE_PATH,filePath);
		}
		if(importTime!=null){
			query.eq(ConstructionProjectTaxManagementAccount.IMPORT_TIME,importTime);
		}
		if(createTime!=null){
			query.eq(ConstructionProjectTaxManagementAccount.CREATE_TIME,createTime);
		}
		if(creator!=null){
			query.eq(ConstructionProjectTaxManagementAccount.CREATOR,creator);
		}
		if(updateTime!=null){
			query.eq(ConstructionProjectTaxManagementAccount.UPDATE_TIME,updateTime);
		}
		if(updater!=null){
			query.eq(ConstructionProjectTaxManagementAccount.UPDATER,updater);
		}
		if(dataLocation!=null){
			query.eq(ConstructionProjectTaxManagementAccount.DATA_LOCATION,dataLocation);
		}
	
		if(queryBoExt!=null){
			//设置排序
			if(queryBoExt.getOrderColumn()!=null && queryBoExt.getOrderColumn().trim().length()>0 ){
				if(queryBoExt.isAsc()){
					query.orderByAsc(queryBoExt.getOrderColumn());
				}else{
					query.orderByDesc(queryBoExt.getOrderColumn());
				}
			}
			//批量的查询条件进行查询
                        if(queryBoExt.getIdList()!=null && queryBoExt.getIdList().size()>0){
                query.in(ConstructionProjectTaxManagementAccount.ID,queryBoExt.getIdList());
            }
                        if(queryBoExt.getFilePathList()!=null && queryBoExt.getFilePathList().size()>0){
                query.in(ConstructionProjectTaxManagementAccount.FILE_PATH,queryBoExt.getFilePathList());
            }
                        if(queryBoExt.getImportTimeList()!=null && queryBoExt.getImportTimeList().size()>0){
                query.in(ConstructionProjectTaxManagementAccount.IMPORT_TIME,queryBoExt.getImportTimeList());
            }
                        if(queryBoExt.getCreateTimeList()!=null && queryBoExt.getCreateTimeList().size()>0){
                query.in(ConstructionProjectTaxManagementAccount.CREATE_TIME,queryBoExt.getCreateTimeList());
            }
                        if(queryBoExt.getCreatorList()!=null && queryBoExt.getCreatorList().size()>0){
                query.in(ConstructionProjectTaxManagementAccount.CREATOR,queryBoExt.getCreatorList());
            }
                        if(queryBoExt.getUpdateTimeList()!=null && queryBoExt.getUpdateTimeList().size()>0){
                query.in(ConstructionProjectTaxManagementAccount.UPDATE_TIME,queryBoExt.getUpdateTimeList());
            }
                        if(queryBoExt.getUpdaterList()!=null && queryBoExt.getUpdaterList().size()>0){
                query.in(ConstructionProjectTaxManagementAccount.UPDATER,queryBoExt.getUpdaterList());
            }
                        if(queryBoExt.getDataLocationList()!=null && queryBoExt.getDataLocationList().size()>0){
                query.in(ConstructionProjectTaxManagementAccount.DATA_LOCATION,queryBoExt.getDataLocationList());
            }
            		}
		return query;
	}

		
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


	public QueryBoExt getQueryBoExt() {
		return queryBoExt;
	}

	public void setQueryBoExt(QueryBoExt queryBoExt) {
		this.queryBoExt = queryBoExt;
	}

    /**
    * 用于排序，和批量的查询
    */
    public static class QueryBoExt {
		/**
		 * 一般情况下只需要单个列的排序
		 */
		private String orderColumn;

		/**
		 * 默认正序
		 */
		private boolean asc = true;

		        /**
         * 主键
         * 集合
         */
        private List<Long> idList;
		        /**
         * 文件地址
         * 集合
         */
        private List<String> filePathList;
		        /**
         * 导入时间
         * 集合
         */
        private List<Long> importTimeList;
		        /**
         * 注册时间
         * 集合
         */
        private List<Long> createTimeList;
		        /**
         * 创建者
         * 集合
         */
        private List<String> creatorList;
		        /**
         * 更新时间
         * 集合
         */
        private List<Long> updateTimeList;
		        /**
         * 更新者
         * 集合
         */
        private List<String> updaterList;
		        /**
         * 数据所在区域
         * 集合
         */
        private List<String> dataLocationList;
		

                public List<Long> getIdList() {
            return idList;
        }

        public void setIdList(List<Long> idList) {
            this.idList = idList;
        }
                public List<String> getFilePathList() {
            return filePathList;
        }

        public void setFilePathList(List<String> filePathList) {
            this.filePathList = filePathList;
        }
                public List<Long> getImportTimeList() {
            return importTimeList;
        }

        public void setImportTimeList(List<Long> importTimeList) {
            this.importTimeList = importTimeList;
        }
                public List<Long> getCreateTimeList() {
            return createTimeList;
        }

        public void setCreateTimeList(List<Long> createTimeList) {
            this.createTimeList = createTimeList;
        }
                public List<String> getCreatorList() {
            return creatorList;
        }

        public void setCreatorList(List<String> creatorList) {
            this.creatorList = creatorList;
        }
                public List<Long> getUpdateTimeList() {
            return updateTimeList;
        }

        public void setUpdateTimeList(List<Long> updateTimeList) {
            this.updateTimeList = updateTimeList;
        }
                public List<String> getUpdaterList() {
            return updaterList;
        }

        public void setUpdaterList(List<String> updaterList) {
            this.updaterList = updaterList;
        }
                public List<String> getDataLocationList() {
            return dataLocationList;
        }

        public void setDataLocationList(List<String> dataLocationList) {
            this.dataLocationList = dataLocationList;
        }
        
        public String getOrderColumn() {
			return orderColumn;
		}

		public void setOrderColumn(String orderColumn) {
			this.orderColumn = orderColumn;
		}

		public boolean isAsc() {
			return asc;
		}

		public void setAsc(boolean asc) {
			this.asc = asc;
		}
	}


}
