package wiki.primo.generator.mybatis.plus.cae.query;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import wiki.primo.generator.mybatis.plus.cae.entity.DistrictProjectSchedule;
import java.util.List;

															

/**
 * <p>
 * 区级重点项目计划表
 * 查询条件类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
public class DistrictProjectScheduleQueryBo{

	private QueryBoExt queryBoExt;

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 项目名称
	 */
	private String projectName;

	/**
	 * 建设内容
	 */
	private String projectContent;

	/**
	 * 投资主体
	 */
	private String investmentSubject;

	/**
	 * 建设地点
	 */
	private String projectPosition;

	/**
	 * 责任单位
	 */
	private String responsibleCompany;

	/**
	 * 投资金额
	 */
	private Long investmentAmount;

	/**
	 * 开始时间
	 */
	private Long beginTime;

	/**
	 * 结束时间
	 */
	private Long endTime;

	/**
	 * 状态。0表示正在进行的计划，1表示已经完成
	 */
	private Integer status;

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
	public QueryWrapper<DistrictProjectSchedule> buildQuery() {
		QueryWrapper<DistrictProjectSchedule> query = new QueryWrapper<>();

		if(id!=null){
			query.eq(DistrictProjectSchedule.ID,id);
		}
		if(projectName!=null){
			query.eq(DistrictProjectSchedule.PROJECT_NAME,projectName);
		}
		if(projectContent!=null){
			query.eq(DistrictProjectSchedule.PROJECT_CONTENT,projectContent);
		}
		if(investmentSubject!=null){
			query.eq(DistrictProjectSchedule.INVESTMENT_SUBJECT,investmentSubject);
		}
		if(projectPosition!=null){
			query.eq(DistrictProjectSchedule.PROJECT_POSITION,projectPosition);
		}
		if(responsibleCompany!=null){
			query.eq(DistrictProjectSchedule.RESPONSIBLE_COMPANY,responsibleCompany);
		}
		if(investmentAmount!=null){
			query.eq(DistrictProjectSchedule.INVESTMENT_AMOUNT,investmentAmount);
		}
		if(beginTime!=null){
			query.eq(DistrictProjectSchedule.BEGIN_TIME,beginTime);
		}
		if(endTime!=null){
			query.eq(DistrictProjectSchedule.END_TIME,endTime);
		}
		if(status!=null){
			query.eq(DistrictProjectSchedule.STATUS,status);
		}
		if(createTime!=null){
			query.eq(DistrictProjectSchedule.CREATE_TIME,createTime);
		}
		if(creator!=null){
			query.eq(DistrictProjectSchedule.CREATOR,creator);
		}
		if(updateTime!=null){
			query.eq(DistrictProjectSchedule.UPDATE_TIME,updateTime);
		}
		if(updater!=null){
			query.eq(DistrictProjectSchedule.UPDATER,updater);
		}
		if(dataLocation!=null){
			query.eq(DistrictProjectSchedule.DATA_LOCATION,dataLocation);
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
                query.in(DistrictProjectSchedule.ID,queryBoExt.getIdList());
            }
                        if(queryBoExt.getProjectNameList()!=null && queryBoExt.getProjectNameList().size()>0){
                query.in(DistrictProjectSchedule.PROJECT_NAME,queryBoExt.getProjectNameList());
            }
                        if(queryBoExt.getProjectContentList()!=null && queryBoExt.getProjectContentList().size()>0){
                query.in(DistrictProjectSchedule.PROJECT_CONTENT,queryBoExt.getProjectContentList());
            }
                        if(queryBoExt.getInvestmentSubjectList()!=null && queryBoExt.getInvestmentSubjectList().size()>0){
                query.in(DistrictProjectSchedule.INVESTMENT_SUBJECT,queryBoExt.getInvestmentSubjectList());
            }
                        if(queryBoExt.getProjectPositionList()!=null && queryBoExt.getProjectPositionList().size()>0){
                query.in(DistrictProjectSchedule.PROJECT_POSITION,queryBoExt.getProjectPositionList());
            }
                        if(queryBoExt.getResponsibleCompanyList()!=null && queryBoExt.getResponsibleCompanyList().size()>0){
                query.in(DistrictProjectSchedule.RESPONSIBLE_COMPANY,queryBoExt.getResponsibleCompanyList());
            }
                        if(queryBoExt.getInvestmentAmountList()!=null && queryBoExt.getInvestmentAmountList().size()>0){
                query.in(DistrictProjectSchedule.INVESTMENT_AMOUNT,queryBoExt.getInvestmentAmountList());
            }
                        if(queryBoExt.getBeginTimeList()!=null && queryBoExt.getBeginTimeList().size()>0){
                query.in(DistrictProjectSchedule.BEGIN_TIME,queryBoExt.getBeginTimeList());
            }
                        if(queryBoExt.getEndTimeList()!=null && queryBoExt.getEndTimeList().size()>0){
                query.in(DistrictProjectSchedule.END_TIME,queryBoExt.getEndTimeList());
            }
                        if(queryBoExt.getStatusList()!=null && queryBoExt.getStatusList().size()>0){
                query.in(DistrictProjectSchedule.STATUS,queryBoExt.getStatusList());
            }
                        if(queryBoExt.getCreateTimeList()!=null && queryBoExt.getCreateTimeList().size()>0){
                query.in(DistrictProjectSchedule.CREATE_TIME,queryBoExt.getCreateTimeList());
            }
                        if(queryBoExt.getCreatorList()!=null && queryBoExt.getCreatorList().size()>0){
                query.in(DistrictProjectSchedule.CREATOR,queryBoExt.getCreatorList());
            }
                        if(queryBoExt.getUpdateTimeList()!=null && queryBoExt.getUpdateTimeList().size()>0){
                query.in(DistrictProjectSchedule.UPDATE_TIME,queryBoExt.getUpdateTimeList());
            }
                        if(queryBoExt.getUpdaterList()!=null && queryBoExt.getUpdaterList().size()>0){
                query.in(DistrictProjectSchedule.UPDATER,queryBoExt.getUpdaterList());
            }
                        if(queryBoExt.getDataLocationList()!=null && queryBoExt.getDataLocationList().size()>0){
                query.in(DistrictProjectSchedule.DATA_LOCATION,queryBoExt.getDataLocationList());
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
		
	public String getProjectName() {
        return projectName;
	}

	public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
		
	public String getProjectContent() {
        return projectContent;
	}

	public void setProjectContent(String projectContent) {
        this.projectContent = projectContent;
    }
		
	public String getInvestmentSubject() {
        return investmentSubject;
	}

	public void setInvestmentSubject(String investmentSubject) {
        this.investmentSubject = investmentSubject;
    }
		
	public String getProjectPosition() {
        return projectPosition;
	}

	public void setProjectPosition(String projectPosition) {
        this.projectPosition = projectPosition;
    }
		
	public String getResponsibleCompany() {
        return responsibleCompany;
	}

	public void setResponsibleCompany(String responsibleCompany) {
        this.responsibleCompany = responsibleCompany;
    }
		
	public Long getInvestmentAmount() {
        return investmentAmount;
	}

	public void setInvestmentAmount(Long investmentAmount) {
        this.investmentAmount = investmentAmount;
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
		
	public Integer getStatus() {
        return status;
	}

	public void setStatus(Integer status) {
        this.status = status;
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
         * 项目名称
         * 集合
         */
        private List<String> projectNameList;
		        /**
         * 建设内容
         * 集合
         */
        private List<String> projectContentList;
		        /**
         * 投资主体
         * 集合
         */
        private List<String> investmentSubjectList;
		        /**
         * 建设地点
         * 集合
         */
        private List<String> projectPositionList;
		        /**
         * 责任单位
         * 集合
         */
        private List<String> responsibleCompanyList;
		        /**
         * 投资金额
         * 集合
         */
        private List<Long> investmentAmountList;
		        /**
         * 开始时间
         * 集合
         */
        private List<Long> beginTimeList;
		        /**
         * 结束时间
         * 集合
         */
        private List<Long> endTimeList;
		        /**
         * 状态。0表示正在进行的计划，1表示已经完成
         * 集合
         */
        private List<Integer> statusList;
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
                public List<String> getProjectNameList() {
            return projectNameList;
        }

        public void setProjectNameList(List<String> projectNameList) {
            this.projectNameList = projectNameList;
        }
                public List<String> getProjectContentList() {
            return projectContentList;
        }

        public void setProjectContentList(List<String> projectContentList) {
            this.projectContentList = projectContentList;
        }
                public List<String> getInvestmentSubjectList() {
            return investmentSubjectList;
        }

        public void setInvestmentSubjectList(List<String> investmentSubjectList) {
            this.investmentSubjectList = investmentSubjectList;
        }
                public List<String> getProjectPositionList() {
            return projectPositionList;
        }

        public void setProjectPositionList(List<String> projectPositionList) {
            this.projectPositionList = projectPositionList;
        }
                public List<String> getResponsibleCompanyList() {
            return responsibleCompanyList;
        }

        public void setResponsibleCompanyList(List<String> responsibleCompanyList) {
            this.responsibleCompanyList = responsibleCompanyList;
        }
                public List<Long> getInvestmentAmountList() {
            return investmentAmountList;
        }

        public void setInvestmentAmountList(List<Long> investmentAmountList) {
            this.investmentAmountList = investmentAmountList;
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
                public List<Integer> getStatusList() {
            return statusList;
        }

        public void setStatusList(List<Integer> statusList) {
            this.statusList = statusList;
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
