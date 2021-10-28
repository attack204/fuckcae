package wiki.primo.generator.mybatis.plus.cae.query;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import wiki.primo.generator.mybatis.plus.cae.entity.ConstructionLandPlanningPermissionInformation;
import java.util.List;

														

/**
 * <p>
 * 建设用地规划许可信息
 * 查询条件类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
public class ConstructionLandPlanningPermissionInformationQueryBo{

	private QueryBoExt queryBoExt;

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 项目类型
	 */
	private String projectType;

	/**
	 * 用地证号
	 */
	private String landCertificateNumber;

	/**
	 * 项目名称
	 */
	private String projectName;

	/**
	 * 建设单位
	 */
	private String constructionCompany;

	/**
	 * 用地位置
	 */
	private String landLocation;

	/**
	 * 用地规模(M2)
	 */
	private String landScale;

	/**
	 * 用地取得方式
	 */
	private String landAcquisitionMode;

	/**
	 * 工程性质
	 */
	private String projectNature;

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
	public QueryWrapper<ConstructionLandPlanningPermissionInformation> buildQuery() {
		QueryWrapper<ConstructionLandPlanningPermissionInformation> query = new QueryWrapper<>();

		if(id!=null){
			query.eq(ConstructionLandPlanningPermissionInformation.ID,id);
		}
		if(projectType!=null){
			query.eq(ConstructionLandPlanningPermissionInformation.PROJECT_TYPE,projectType);
		}
		if(landCertificateNumber!=null){
			query.eq(ConstructionLandPlanningPermissionInformation.LAND_CERTIFICATE_NUMBER,landCertificateNumber);
		}
		if(projectName!=null){
			query.eq(ConstructionLandPlanningPermissionInformation.PROJECT_NAME,projectName);
		}
		if(constructionCompany!=null){
			query.eq(ConstructionLandPlanningPermissionInformation.CONSTRUCTION_COMPANY,constructionCompany);
		}
		if(landLocation!=null){
			query.eq(ConstructionLandPlanningPermissionInformation.LAND_LOCATION,landLocation);
		}
		if(landScale!=null){
			query.eq(ConstructionLandPlanningPermissionInformation.LAND_SCALE,landScale);
		}
		if(landAcquisitionMode!=null){
			query.eq(ConstructionLandPlanningPermissionInformation.LAND_ACQUISITION_MODE,landAcquisitionMode);
		}
		if(projectNature!=null){
			query.eq(ConstructionLandPlanningPermissionInformation.PROJECT_NATURE,projectNature);
		}
		if(createTime!=null){
			query.eq(ConstructionLandPlanningPermissionInformation.CREATE_TIME,createTime);
		}
		if(creator!=null){
			query.eq(ConstructionLandPlanningPermissionInformation.CREATOR,creator);
		}
		if(updateTime!=null){
			query.eq(ConstructionLandPlanningPermissionInformation.UPDATE_TIME,updateTime);
		}
		if(updater!=null){
			query.eq(ConstructionLandPlanningPermissionInformation.UPDATER,updater);
		}
		if(dataLocation!=null){
			query.eq(ConstructionLandPlanningPermissionInformation.DATA_LOCATION,dataLocation);
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
                query.in(ConstructionLandPlanningPermissionInformation.ID,queryBoExt.getIdList());
            }
                        if(queryBoExt.getProjectTypeList()!=null && queryBoExt.getProjectTypeList().size()>0){
                query.in(ConstructionLandPlanningPermissionInformation.PROJECT_TYPE,queryBoExt.getProjectTypeList());
            }
                        if(queryBoExt.getLandCertificateNumberList()!=null && queryBoExt.getLandCertificateNumberList().size()>0){
                query.in(ConstructionLandPlanningPermissionInformation.LAND_CERTIFICATE_NUMBER,queryBoExt.getLandCertificateNumberList());
            }
                        if(queryBoExt.getProjectNameList()!=null && queryBoExt.getProjectNameList().size()>0){
                query.in(ConstructionLandPlanningPermissionInformation.PROJECT_NAME,queryBoExt.getProjectNameList());
            }
                        if(queryBoExt.getConstructionCompanyList()!=null && queryBoExt.getConstructionCompanyList().size()>0){
                query.in(ConstructionLandPlanningPermissionInformation.CONSTRUCTION_COMPANY,queryBoExt.getConstructionCompanyList());
            }
                        if(queryBoExt.getLandLocationList()!=null && queryBoExt.getLandLocationList().size()>0){
                query.in(ConstructionLandPlanningPermissionInformation.LAND_LOCATION,queryBoExt.getLandLocationList());
            }
                        if(queryBoExt.getLandScaleList()!=null && queryBoExt.getLandScaleList().size()>0){
                query.in(ConstructionLandPlanningPermissionInformation.LAND_SCALE,queryBoExt.getLandScaleList());
            }
                        if(queryBoExt.getLandAcquisitionModeList()!=null && queryBoExt.getLandAcquisitionModeList().size()>0){
                query.in(ConstructionLandPlanningPermissionInformation.LAND_ACQUISITION_MODE,queryBoExt.getLandAcquisitionModeList());
            }
                        if(queryBoExt.getProjectNatureList()!=null && queryBoExt.getProjectNatureList().size()>0){
                query.in(ConstructionLandPlanningPermissionInformation.PROJECT_NATURE,queryBoExt.getProjectNatureList());
            }
                        if(queryBoExt.getCreateTimeList()!=null && queryBoExt.getCreateTimeList().size()>0){
                query.in(ConstructionLandPlanningPermissionInformation.CREATE_TIME,queryBoExt.getCreateTimeList());
            }
                        if(queryBoExt.getCreatorList()!=null && queryBoExt.getCreatorList().size()>0){
                query.in(ConstructionLandPlanningPermissionInformation.CREATOR,queryBoExt.getCreatorList());
            }
                        if(queryBoExt.getUpdateTimeList()!=null && queryBoExt.getUpdateTimeList().size()>0){
                query.in(ConstructionLandPlanningPermissionInformation.UPDATE_TIME,queryBoExt.getUpdateTimeList());
            }
                        if(queryBoExt.getUpdaterList()!=null && queryBoExt.getUpdaterList().size()>0){
                query.in(ConstructionLandPlanningPermissionInformation.UPDATER,queryBoExt.getUpdaterList());
            }
                        if(queryBoExt.getDataLocationList()!=null && queryBoExt.getDataLocationList().size()>0){
                query.in(ConstructionLandPlanningPermissionInformation.DATA_LOCATION,queryBoExt.getDataLocationList());
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
		
	public String getProjectType() {
        return projectType;
	}

	public void setProjectType(String projectType) {
        this.projectType = projectType;
    }
		
	public String getLandCertificateNumber() {
        return landCertificateNumber;
	}

	public void setLandCertificateNumber(String landCertificateNumber) {
        this.landCertificateNumber = landCertificateNumber;
    }
		
	public String getProjectName() {
        return projectName;
	}

	public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
		
	public String getConstructionCompany() {
        return constructionCompany;
	}

	public void setConstructionCompany(String constructionCompany) {
        this.constructionCompany = constructionCompany;
    }
		
	public String getLandLocation() {
        return landLocation;
	}

	public void setLandLocation(String landLocation) {
        this.landLocation = landLocation;
    }
		
	public String getLandScale() {
        return landScale;
	}

	public void setLandScale(String landScale) {
        this.landScale = landScale;
    }
		
	public String getLandAcquisitionMode() {
        return landAcquisitionMode;
	}

	public void setLandAcquisitionMode(String landAcquisitionMode) {
        this.landAcquisitionMode = landAcquisitionMode;
    }
		
	public String getProjectNature() {
        return projectNature;
	}

	public void setProjectNature(String projectNature) {
        this.projectNature = projectNature;
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
         * 项目类型
         * 集合
         */
        private List<String> projectTypeList;
		        /**
         * 用地证号
         * 集合
         */
        private List<String> landCertificateNumberList;
		        /**
         * 项目名称
         * 集合
         */
        private List<String> projectNameList;
		        /**
         * 建设单位
         * 集合
         */
        private List<String> constructionCompanyList;
		        /**
         * 用地位置
         * 集合
         */
        private List<String> landLocationList;
		        /**
         * 用地规模(M2)
         * 集合
         */
        private List<String> landScaleList;
		        /**
         * 用地取得方式
         * 集合
         */
        private List<String> landAcquisitionModeList;
		        /**
         * 工程性质
         * 集合
         */
        private List<String> projectNatureList;
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
                public List<String> getProjectTypeList() {
            return projectTypeList;
        }

        public void setProjectTypeList(List<String> projectTypeList) {
            this.projectTypeList = projectTypeList;
        }
                public List<String> getLandCertificateNumberList() {
            return landCertificateNumberList;
        }

        public void setLandCertificateNumberList(List<String> landCertificateNumberList) {
            this.landCertificateNumberList = landCertificateNumberList;
        }
                public List<String> getProjectNameList() {
            return projectNameList;
        }

        public void setProjectNameList(List<String> projectNameList) {
            this.projectNameList = projectNameList;
        }
                public List<String> getConstructionCompanyList() {
            return constructionCompanyList;
        }

        public void setConstructionCompanyList(List<String> constructionCompanyList) {
            this.constructionCompanyList = constructionCompanyList;
        }
                public List<String> getLandLocationList() {
            return landLocationList;
        }

        public void setLandLocationList(List<String> landLocationList) {
            this.landLocationList = landLocationList;
        }
                public List<String> getLandScaleList() {
            return landScaleList;
        }

        public void setLandScaleList(List<String> landScaleList) {
            this.landScaleList = landScaleList;
        }
                public List<String> getLandAcquisitionModeList() {
            return landAcquisitionModeList;
        }

        public void setLandAcquisitionModeList(List<String> landAcquisitionModeList) {
            this.landAcquisitionModeList = landAcquisitionModeList;
        }
                public List<String> getProjectNatureList() {
            return projectNatureList;
        }

        public void setProjectNatureList(List<String> projectNatureList) {
            this.projectNatureList = projectNatureList;
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
