package wiki.primo.generator.mybatis.plus.cae.query;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import wiki.primo.generator.mybatis.plus.cae.entity.ProjectInitiationInformation;
import java.util.List;

															

/**
 * <p>
 * 项目立项信息
 * 查询条件类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
public class ProjectInitiationInformationQueryBo{

	private QueryBoExt queryBoExt;

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 建设单位
	 */
	private String buildCompany;

	/**
	 * 项目名称
	 */
	private String projectName;

	/**
	 * 项目备案号
	 */
	private String recordNumber;

	/**
	 * 项目规模
	 */
	private String projectScale;

	/**
	 * 投资概算
	 */
	private Long expectInvestment;

	/**
	 * 资金来源
	 */
	private String fundingSource;

	/**
	 * 建设年限
	 */
	private Long buildingYear;

	/**
	 * 建设地址
	 */
	private String projectPosition;

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
	public QueryWrapper<ProjectInitiationInformation> buildQuery() {
		QueryWrapper<ProjectInitiationInformation> query = new QueryWrapper<>();

		if(id!=null){
			query.eq(ProjectInitiationInformation.ID,id);
		}
		if(buildCompany!=null){
			query.eq(ProjectInitiationInformation.BUILD_COMPANY,buildCompany);
		}
		if(projectName!=null){
			query.eq(ProjectInitiationInformation.PROJECT_NAME,projectName);
		}
		if(recordNumber!=null){
			query.eq(ProjectInitiationInformation.RECORD_NUMBER,recordNumber);
		}
		if(projectScale!=null){
			query.eq(ProjectInitiationInformation.PROJECT_SCALE,projectScale);
		}
		if(expectInvestment!=null){
			query.eq(ProjectInitiationInformation.EXPECT_INVESTMENT,expectInvestment);
		}
		if(fundingSource!=null){
			query.eq(ProjectInitiationInformation.FUNDING_SOURCE,fundingSource);
		}
		if(buildingYear!=null){
			query.eq(ProjectInitiationInformation.BUILDING_YEAR,buildingYear);
		}
		if(projectPosition!=null){
			query.eq(ProjectInitiationInformation.PROJECT_POSITION,projectPosition);
		}
		if(remarks!=null){
			query.eq(ProjectInitiationInformation.REMARKS,remarks);
		}
		if(createTime!=null){
			query.eq(ProjectInitiationInformation.CREATE_TIME,createTime);
		}
		if(creator!=null){
			query.eq(ProjectInitiationInformation.CREATOR,creator);
		}
		if(updateTime!=null){
			query.eq(ProjectInitiationInformation.UPDATE_TIME,updateTime);
		}
		if(updater!=null){
			query.eq(ProjectInitiationInformation.UPDATER,updater);
		}
		if(dataLocation!=null){
			query.eq(ProjectInitiationInformation.DATA_LOCATION,dataLocation);
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
                query.in(ProjectInitiationInformation.ID,queryBoExt.getIdList());
            }
                        if(queryBoExt.getBuildCompanyList()!=null && queryBoExt.getBuildCompanyList().size()>0){
                query.in(ProjectInitiationInformation.BUILD_COMPANY,queryBoExt.getBuildCompanyList());
            }
                        if(queryBoExt.getProjectNameList()!=null && queryBoExt.getProjectNameList().size()>0){
                query.in(ProjectInitiationInformation.PROJECT_NAME,queryBoExt.getProjectNameList());
            }
                        if(queryBoExt.getRecordNumberList()!=null && queryBoExt.getRecordNumberList().size()>0){
                query.in(ProjectInitiationInformation.RECORD_NUMBER,queryBoExt.getRecordNumberList());
            }
                        if(queryBoExt.getProjectScaleList()!=null && queryBoExt.getProjectScaleList().size()>0){
                query.in(ProjectInitiationInformation.PROJECT_SCALE,queryBoExt.getProjectScaleList());
            }
                        if(queryBoExt.getExpectInvestmentList()!=null && queryBoExt.getExpectInvestmentList().size()>0){
                query.in(ProjectInitiationInformation.EXPECT_INVESTMENT,queryBoExt.getExpectInvestmentList());
            }
                        if(queryBoExt.getFundingSourceList()!=null && queryBoExt.getFundingSourceList().size()>0){
                query.in(ProjectInitiationInformation.FUNDING_SOURCE,queryBoExt.getFundingSourceList());
            }
                        if(queryBoExt.getBuildingYearList()!=null && queryBoExt.getBuildingYearList().size()>0){
                query.in(ProjectInitiationInformation.BUILDING_YEAR,queryBoExt.getBuildingYearList());
            }
                        if(queryBoExt.getProjectPositionList()!=null && queryBoExt.getProjectPositionList().size()>0){
                query.in(ProjectInitiationInformation.PROJECT_POSITION,queryBoExt.getProjectPositionList());
            }
                        if(queryBoExt.getRemarksList()!=null && queryBoExt.getRemarksList().size()>0){
                query.in(ProjectInitiationInformation.REMARKS,queryBoExt.getRemarksList());
            }
                        if(queryBoExt.getCreateTimeList()!=null && queryBoExt.getCreateTimeList().size()>0){
                query.in(ProjectInitiationInformation.CREATE_TIME,queryBoExt.getCreateTimeList());
            }
                        if(queryBoExt.getCreatorList()!=null && queryBoExt.getCreatorList().size()>0){
                query.in(ProjectInitiationInformation.CREATOR,queryBoExt.getCreatorList());
            }
                        if(queryBoExt.getUpdateTimeList()!=null && queryBoExt.getUpdateTimeList().size()>0){
                query.in(ProjectInitiationInformation.UPDATE_TIME,queryBoExt.getUpdateTimeList());
            }
                        if(queryBoExt.getUpdaterList()!=null && queryBoExt.getUpdaterList().size()>0){
                query.in(ProjectInitiationInformation.UPDATER,queryBoExt.getUpdaterList());
            }
                        if(queryBoExt.getDataLocationList()!=null && queryBoExt.getDataLocationList().size()>0){
                query.in(ProjectInitiationInformation.DATA_LOCATION,queryBoExt.getDataLocationList());
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
		
	public String getBuildCompany() {
        return buildCompany;
	}

	public void setBuildCompany(String buildCompany) {
        this.buildCompany = buildCompany;
    }
		
	public String getProjectName() {
        return projectName;
	}

	public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
		
	public String getRecordNumber() {
        return recordNumber;
	}

	public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }
		
	public String getProjectScale() {
        return projectScale;
	}

	public void setProjectScale(String projectScale) {
        this.projectScale = projectScale;
    }
		
	public Long getExpectInvestment() {
        return expectInvestment;
	}

	public void setExpectInvestment(Long expectInvestment) {
        this.expectInvestment = expectInvestment;
    }
		
	public String getFundingSource() {
        return fundingSource;
	}

	public void setFundingSource(String fundingSource) {
        this.fundingSource = fundingSource;
    }
		
	public Long getBuildingYear() {
        return buildingYear;
	}

	public void setBuildingYear(Long buildingYear) {
        this.buildingYear = buildingYear;
    }
		
	public String getProjectPosition() {
        return projectPosition;
	}

	public void setProjectPosition(String projectPosition) {
        this.projectPosition = projectPosition;
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
         * 建设单位
         * 集合
         */
        private List<String> buildCompanyList;
		        /**
         * 项目名称
         * 集合
         */
        private List<String> projectNameList;
		        /**
         * 项目备案号
         * 集合
         */
        private List<String> recordNumberList;
		        /**
         * 项目规模
         * 集合
         */
        private List<String> projectScaleList;
		        /**
         * 投资概算
         * 集合
         */
        private List<Long> expectInvestmentList;
		        /**
         * 资金来源
         * 集合
         */
        private List<String> fundingSourceList;
		        /**
         * 建设年限
         * 集合
         */
        private List<Long> buildingYearList;
		        /**
         * 建设地址
         * 集合
         */
        private List<String> projectPositionList;
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
                public List<String> getBuildCompanyList() {
            return buildCompanyList;
        }

        public void setBuildCompanyList(List<String> buildCompanyList) {
            this.buildCompanyList = buildCompanyList;
        }
                public List<String> getProjectNameList() {
            return projectNameList;
        }

        public void setProjectNameList(List<String> projectNameList) {
            this.projectNameList = projectNameList;
        }
                public List<String> getRecordNumberList() {
            return recordNumberList;
        }

        public void setRecordNumberList(List<String> recordNumberList) {
            this.recordNumberList = recordNumberList;
        }
                public List<String> getProjectScaleList() {
            return projectScaleList;
        }

        public void setProjectScaleList(List<String> projectScaleList) {
            this.projectScaleList = projectScaleList;
        }
                public List<Long> getExpectInvestmentList() {
            return expectInvestmentList;
        }

        public void setExpectInvestmentList(List<Long> expectInvestmentList) {
            this.expectInvestmentList = expectInvestmentList;
        }
                public List<String> getFundingSourceList() {
            return fundingSourceList;
        }

        public void setFundingSourceList(List<String> fundingSourceList) {
            this.fundingSourceList = fundingSourceList;
        }
                public List<Long> getBuildingYearList() {
            return buildingYearList;
        }

        public void setBuildingYearList(List<Long> buildingYearList) {
            this.buildingYearList = buildingYearList;
        }
                public List<String> getProjectPositionList() {
            return projectPositionList;
        }

        public void setProjectPositionList(List<String> projectPositionList) {
            this.projectPositionList = projectPositionList;
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
