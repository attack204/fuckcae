package wiki.primo.generator.mybatis.plus.cae.query;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import wiki.primo.generator.mybatis.plus.cae.entity.ConstructionUnitInformation;
import java.util.List;

																

/**
 * <p>
 * 施工单位信息
 * 查询条件类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
public class ConstructionUnitInformationQueryBo{

	private QueryBoExt queryBoExt;

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 施工单位名称
	 */
	private String constructionCompany;

	/**
	 * 联系电话
	 */
	private String contactPhone;

	/**
	 * 建设单位
	 */
	private String buildingCompany;

	/**
	 * 项目地址
	 */
	private String projectLocation;

	/**
	 * 建筑施工项目名称
	 */
	private String projectName;

	/**
	 * 建筑面积
	 */
	private String constructionArea;

	/**
	 * 工程概算
	 */
	private String expectInvestment;

	/**
	 * 开工日期
	 */
	private Long beginTime;

	/**
	 * 竣工日期
	 */
	private Long endTime;

	/**
	 * 备注
	 */
	private String remarks;

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
	public QueryWrapper<ConstructionUnitInformation> buildQuery() {
		QueryWrapper<ConstructionUnitInformation> query = new QueryWrapper<>();

		if(id!=null){
			query.eq(ConstructionUnitInformation.ID,id);
		}
		if(constructionCompany!=null){
			query.eq(ConstructionUnitInformation.CONSTRUCTION_COMPANY,constructionCompany);
		}
		if(contactPhone!=null){
			query.eq(ConstructionUnitInformation.CONTACT_PHONE,contactPhone);
		}
		if(buildingCompany!=null){
			query.eq(ConstructionUnitInformation.BUILDING_COMPANY,buildingCompany);
		}
		if(projectLocation!=null){
			query.eq(ConstructionUnitInformation.PROJECT_LOCATION,projectLocation);
		}
		if(projectName!=null){
			query.eq(ConstructionUnitInformation.PROJECT_NAME,projectName);
		}
		if(constructionArea!=null){
			query.eq(ConstructionUnitInformation.CONSTRUCTION_AREA,constructionArea);
		}
		if(expectInvestment!=null){
			query.eq(ConstructionUnitInformation.EXPECT_INVESTMENT,expectInvestment);
		}
		if(beginTime!=null){
			query.eq(ConstructionUnitInformation.BEGIN_TIME,beginTime);
		}
		if(endTime!=null){
			query.eq(ConstructionUnitInformation.END_TIME,endTime);
		}
		if(remarks!=null){
			query.eq(ConstructionUnitInformation.REMARKS,remarks);
		}
		if(createTime!=null){
			query.eq(ConstructionUnitInformation.CREATE_TIME,createTime);
		}
		if(creator!=null){
			query.eq(ConstructionUnitInformation.CREATOR,creator);
		}
		if(updateTime!=null){
			query.eq(ConstructionUnitInformation.UPDATE_TIME,updateTime);
		}
		if(updater!=null){
			query.eq(ConstructionUnitInformation.UPDATER,updater);
		}
		if(dataLocation!=null){
			query.eq(ConstructionUnitInformation.DATA_LOCATION,dataLocation);
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
                query.in(ConstructionUnitInformation.ID,queryBoExt.getIdList());
            }
                        if(queryBoExt.getConstructionCompanyList()!=null && queryBoExt.getConstructionCompanyList().size()>0){
                query.in(ConstructionUnitInformation.CONSTRUCTION_COMPANY,queryBoExt.getConstructionCompanyList());
            }
                        if(queryBoExt.getContactPhoneList()!=null && queryBoExt.getContactPhoneList().size()>0){
                query.in(ConstructionUnitInformation.CONTACT_PHONE,queryBoExt.getContactPhoneList());
            }
                        if(queryBoExt.getBuildingCompanyList()!=null && queryBoExt.getBuildingCompanyList().size()>0){
                query.in(ConstructionUnitInformation.BUILDING_COMPANY,queryBoExt.getBuildingCompanyList());
            }
                        if(queryBoExt.getProjectLocationList()!=null && queryBoExt.getProjectLocationList().size()>0){
                query.in(ConstructionUnitInformation.PROJECT_LOCATION,queryBoExt.getProjectLocationList());
            }
                        if(queryBoExt.getProjectNameList()!=null && queryBoExt.getProjectNameList().size()>0){
                query.in(ConstructionUnitInformation.PROJECT_NAME,queryBoExt.getProjectNameList());
            }
                        if(queryBoExt.getConstructionAreaList()!=null && queryBoExt.getConstructionAreaList().size()>0){
                query.in(ConstructionUnitInformation.CONSTRUCTION_AREA,queryBoExt.getConstructionAreaList());
            }
                        if(queryBoExt.getExpectInvestmentList()!=null && queryBoExt.getExpectInvestmentList().size()>0){
                query.in(ConstructionUnitInformation.EXPECT_INVESTMENT,queryBoExt.getExpectInvestmentList());
            }
                        if(queryBoExt.getBeginTimeList()!=null && queryBoExt.getBeginTimeList().size()>0){
                query.in(ConstructionUnitInformation.BEGIN_TIME,queryBoExt.getBeginTimeList());
            }
                        if(queryBoExt.getEndTimeList()!=null && queryBoExt.getEndTimeList().size()>0){
                query.in(ConstructionUnitInformation.END_TIME,queryBoExt.getEndTimeList());
            }
                        if(queryBoExt.getRemarksList()!=null && queryBoExt.getRemarksList().size()>0){
                query.in(ConstructionUnitInformation.REMARKS,queryBoExt.getRemarksList());
            }
                        if(queryBoExt.getCreateTimeList()!=null && queryBoExt.getCreateTimeList().size()>0){
                query.in(ConstructionUnitInformation.CREATE_TIME,queryBoExt.getCreateTimeList());
            }
                        if(queryBoExt.getCreatorList()!=null && queryBoExt.getCreatorList().size()>0){
                query.in(ConstructionUnitInformation.CREATOR,queryBoExt.getCreatorList());
            }
                        if(queryBoExt.getUpdateTimeList()!=null && queryBoExt.getUpdateTimeList().size()>0){
                query.in(ConstructionUnitInformation.UPDATE_TIME,queryBoExt.getUpdateTimeList());
            }
                        if(queryBoExt.getUpdaterList()!=null && queryBoExt.getUpdaterList().size()>0){
                query.in(ConstructionUnitInformation.UPDATER,queryBoExt.getUpdaterList());
            }
                        if(queryBoExt.getDataLocationList()!=null && queryBoExt.getDataLocationList().size()>0){
                query.in(ConstructionUnitInformation.DATA_LOCATION,queryBoExt.getDataLocationList());
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
		
	public String getConstructionCompany() {
        return constructionCompany;
	}

	public void setConstructionCompany(String constructionCompany) {
        this.constructionCompany = constructionCompany;
    }
		
	public String getContactPhone() {
        return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
		
	public String getBuildingCompany() {
        return buildingCompany;
	}

	public void setBuildingCompany(String buildingCompany) {
        this.buildingCompany = buildingCompany;
    }
		
	public String getProjectLocation() {
        return projectLocation;
	}

	public void setProjectLocation(String projectLocation) {
        this.projectLocation = projectLocation;
    }
		
	public String getProjectName() {
        return projectName;
	}

	public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
		
	public String getConstructionArea() {
        return constructionArea;
	}

	public void setConstructionArea(String constructionArea) {
        this.constructionArea = constructionArea;
    }
		
	public String getExpectInvestment() {
        return expectInvestment;
	}

	public void setExpectInvestment(String expectInvestment) {
        this.expectInvestment = expectInvestment;
    }
		
	public Long getBeginTime() {
        return beginTime;
	}

	public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }
		
	public Long getEndTime() {
        return endTime;
	}

	public void setEndTime(Long endTime) {
        this.endTime = endTime;
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
         * 施工单位名称
         * 集合
         */
        private List<String> constructionCompanyList;
		        /**
         * 联系电话
         * 集合
         */
        private List<String> contactPhoneList;
		        /**
         * 建设单位
         * 集合
         */
        private List<String> buildingCompanyList;
		        /**
         * 项目地址
         * 集合
         */
        private List<String> projectLocationList;
		        /**
         * 建筑施工项目名称
         * 集合
         */
        private List<String> projectNameList;
		        /**
         * 建筑面积
         * 集合
         */
        private List<String> constructionAreaList;
		        /**
         * 工程概算
         * 集合
         */
        private List<String> expectInvestmentList;
		        /**
         * 开工日期
         * 集合
         */
        private List<Long> beginTimeList;
		        /**
         * 竣工日期
         * 集合
         */
        private List<Long> endTimeList;
		        /**
         * 备注
         * 集合
         */
        private List<String> remarksList;
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
                public List<String> getConstructionCompanyList() {
            return constructionCompanyList;
        }

        public void setConstructionCompanyList(List<String> constructionCompanyList) {
            this.constructionCompanyList = constructionCompanyList;
        }
                public List<String> getContactPhoneList() {
            return contactPhoneList;
        }

        public void setContactPhoneList(List<String> contactPhoneList) {
            this.contactPhoneList = contactPhoneList;
        }
                public List<String> getBuildingCompanyList() {
            return buildingCompanyList;
        }

        public void setBuildingCompanyList(List<String> buildingCompanyList) {
            this.buildingCompanyList = buildingCompanyList;
        }
                public List<String> getProjectLocationList() {
            return projectLocationList;
        }

        public void setProjectLocationList(List<String> projectLocationList) {
            this.projectLocationList = projectLocationList;
        }
                public List<String> getProjectNameList() {
            return projectNameList;
        }

        public void setProjectNameList(List<String> projectNameList) {
            this.projectNameList = projectNameList;
        }
                public List<String> getConstructionAreaList() {
            return constructionAreaList;
        }

        public void setConstructionAreaList(List<String> constructionAreaList) {
            this.constructionAreaList = constructionAreaList;
        }
                public List<String> getExpectInvestmentList() {
            return expectInvestmentList;
        }

        public void setExpectInvestmentList(List<String> expectInvestmentList) {
            this.expectInvestmentList = expectInvestmentList;
        }
                public List<Long> getBeginTimeList() {
            return beginTimeList;
        }

        public void setBeginTimeList(List<Long> beginTimeList) {
            this.beginTimeList = beginTimeList;
        }
                public List<Long> getEndTimeList() {
            return endTimeList;
        }

        public void setEndTimeList(List<Long> endTimeList) {
            this.endTimeList = endTimeList;
        }
                public List<String> getRemarksList() {
            return remarksList;
        }

        public void setRemarksList(List<String> remarksList) {
            this.remarksList = remarksList;
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
