package wiki.primo.generator.mybatis.plus.cae.query;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import wiki.primo.generator.mybatis.plus.cae.entity.ProjectInformation;
import java.util.List;

																		

/**
 * <p>
 * 工程项目信息
 * 查询条件类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
public class ProjectInformationQueryBo{

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
	 * 填报日期
	 */
	private Long fillingTime;

	/**
	 * 行政区划
	 */
	private String administrativeArea;

	/**
	 * 主管部门
	 */
	private String competentDepartment;

	/**
	 * 项目地址
	 */
	private String projectLocation;

	/**
	 * 建设单位名称
	 */
	private String constructionCompany;

	/**
	 * 建设单位统一社会信用代码
	 */
	private String constructionCompanySocialCreditCertificateNumber;

	/**
	 * 中标单位名称
	 */
	private String winningCompany;

	/**
	 * 中标单位统一社会信用代码
	 */
	private String winningCompanySocialCreditCertificateNumber;

	/**
	 * 中标时间
	 */
	private Long winningTime;

	/**
	 * 中标金额(元)
	 */
	private Long winningMoney;

	/**
	 * 开工时间
	 */
	private Long beginTime;

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
	public QueryWrapper<ProjectInformation> buildQuery() {
		QueryWrapper<ProjectInformation> query = new QueryWrapper<>();

		if(id!=null){
			query.eq(ProjectInformation.ID,id);
		}
		if(projectName!=null){
			query.eq(ProjectInformation.PROJECT_NAME,projectName);
		}
		if(fillingTime!=null){
			query.eq(ProjectInformation.FILLING_TIME,fillingTime);
		}
		if(administrativeArea!=null){
			query.eq(ProjectInformation.ADMINISTRATIVE_AREA,administrativeArea);
		}
		if(competentDepartment!=null){
			query.eq(ProjectInformation.COMPETENT_DEPARTMENT,competentDepartment);
		}
		if(projectLocation!=null){
			query.eq(ProjectInformation.PROJECT_LOCATION,projectLocation);
		}
		if(constructionCompany!=null){
			query.eq(ProjectInformation.CONSTRUCTION_COMPANY,constructionCompany);
		}
		if(constructionCompanySocialCreditCertificateNumber!=null){
			query.eq(ProjectInformation.CONSTRUCTION_COMPANY_SOCIAL_CREDIT_CERTIFICATE_NUMBER,constructionCompanySocialCreditCertificateNumber);
		}
		if(winningCompany!=null){
			query.eq(ProjectInformation.WINNING_COMPANY,winningCompany);
		}
		if(winningCompanySocialCreditCertificateNumber!=null){
			query.eq(ProjectInformation.WINNING_COMPANY_SOCIAL_CREDIT_CERTIFICATE_NUMBER,winningCompanySocialCreditCertificateNumber);
		}
		if(winningTime!=null){
			query.eq(ProjectInformation.WINNING_TIME,winningTime);
		}
		if(winningMoney!=null){
			query.eq(ProjectInformation.WINNING_MONEY,winningMoney);
		}
		if(beginTime!=null){
			query.eq(ProjectInformation.BEGIN_TIME,beginTime);
		}
		if(createTime!=null){
			query.eq(ProjectInformation.CREATE_TIME,createTime);
		}
		if(creator!=null){
			query.eq(ProjectInformation.CREATOR,creator);
		}
		if(updateTime!=null){
			query.eq(ProjectInformation.UPDATE_TIME,updateTime);
		}
		if(updater!=null){
			query.eq(ProjectInformation.UPDATER,updater);
		}
		if(dataLocation!=null){
			query.eq(ProjectInformation.DATA_LOCATION,dataLocation);
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
                query.in(ProjectInformation.ID,queryBoExt.getIdList());
            }
                        if(queryBoExt.getProjectNameList()!=null && queryBoExt.getProjectNameList().size()>0){
                query.in(ProjectInformation.PROJECT_NAME,queryBoExt.getProjectNameList());
            }
                        if(queryBoExt.getFillingTimeList()!=null && queryBoExt.getFillingTimeList().size()>0){
                query.in(ProjectInformation.FILLING_TIME,queryBoExt.getFillingTimeList());
            }
                        if(queryBoExt.getAdministrativeAreaList()!=null && queryBoExt.getAdministrativeAreaList().size()>0){
                query.in(ProjectInformation.ADMINISTRATIVE_AREA,queryBoExt.getAdministrativeAreaList());
            }
                        if(queryBoExt.getCompetentDepartmentList()!=null && queryBoExt.getCompetentDepartmentList().size()>0){
                query.in(ProjectInformation.COMPETENT_DEPARTMENT,queryBoExt.getCompetentDepartmentList());
            }
                        if(queryBoExt.getProjectLocationList()!=null && queryBoExt.getProjectLocationList().size()>0){
                query.in(ProjectInformation.PROJECT_LOCATION,queryBoExt.getProjectLocationList());
            }
                        if(queryBoExt.getConstructionCompanyList()!=null && queryBoExt.getConstructionCompanyList().size()>0){
                query.in(ProjectInformation.CONSTRUCTION_COMPANY,queryBoExt.getConstructionCompanyList());
            }
                        if(queryBoExt.getConstructionCompanySocialCreditCertificateNumberList()!=null && queryBoExt.getConstructionCompanySocialCreditCertificateNumberList().size()>0){
                query.in(ProjectInformation.CONSTRUCTION_COMPANY_SOCIAL_CREDIT_CERTIFICATE_NUMBER,queryBoExt.getConstructionCompanySocialCreditCertificateNumberList());
            }
                        if(queryBoExt.getWinningCompanyList()!=null && queryBoExt.getWinningCompanyList().size()>0){
                query.in(ProjectInformation.WINNING_COMPANY,queryBoExt.getWinningCompanyList());
            }
                        if(queryBoExt.getWinningCompanySocialCreditCertificateNumberList()!=null && queryBoExt.getWinningCompanySocialCreditCertificateNumberList().size()>0){
                query.in(ProjectInformation.WINNING_COMPANY_SOCIAL_CREDIT_CERTIFICATE_NUMBER,queryBoExt.getWinningCompanySocialCreditCertificateNumberList());
            }
                        if(queryBoExt.getWinningTimeList()!=null && queryBoExt.getWinningTimeList().size()>0){
                query.in(ProjectInformation.WINNING_TIME,queryBoExt.getWinningTimeList());
            }
                        if(queryBoExt.getWinningMoneyList()!=null && queryBoExt.getWinningMoneyList().size()>0){
                query.in(ProjectInformation.WINNING_MONEY,queryBoExt.getWinningMoneyList());
            }
                        if(queryBoExt.getBeginTimeList()!=null && queryBoExt.getBeginTimeList().size()>0){
                query.in(ProjectInformation.BEGIN_TIME,queryBoExt.getBeginTimeList());
            }
                        if(queryBoExt.getCreateTimeList()!=null && queryBoExt.getCreateTimeList().size()>0){
                query.in(ProjectInformation.CREATE_TIME,queryBoExt.getCreateTimeList());
            }
                        if(queryBoExt.getCreatorList()!=null && queryBoExt.getCreatorList().size()>0){
                query.in(ProjectInformation.CREATOR,queryBoExt.getCreatorList());
            }
                        if(queryBoExt.getUpdateTimeList()!=null && queryBoExt.getUpdateTimeList().size()>0){
                query.in(ProjectInformation.UPDATE_TIME,queryBoExt.getUpdateTimeList());
            }
                        if(queryBoExt.getUpdaterList()!=null && queryBoExt.getUpdaterList().size()>0){
                query.in(ProjectInformation.UPDATER,queryBoExt.getUpdaterList());
            }
                        if(queryBoExt.getDataLocationList()!=null && queryBoExt.getDataLocationList().size()>0){
                query.in(ProjectInformation.DATA_LOCATION,queryBoExt.getDataLocationList());
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
		
	public Long getFillingTime() {
        return fillingTime;
	}

	public void setFillingTime(Long fillingTime) {
        this.fillingTime = fillingTime;
    }
		
	public String getAdministrativeArea() {
        return administrativeArea;
	}

	public void setAdministrativeArea(String administrativeArea) {
        this.administrativeArea = administrativeArea;
    }
		
	public String getCompetentDepartment() {
        return competentDepartment;
	}

	public void setCompetentDepartment(String competentDepartment) {
        this.competentDepartment = competentDepartment;
    }
		
	public String getProjectLocation() {
        return projectLocation;
	}

	public void setProjectLocation(String projectLocation) {
        this.projectLocation = projectLocation;
    }
		
	public String getConstructionCompany() {
        return constructionCompany;
	}

	public void setConstructionCompany(String constructionCompany) {
        this.constructionCompany = constructionCompany;
    }
		
	public String getConstructionCompanySocialCreditCertificateNumber() {
        return constructionCompanySocialCreditCertificateNumber;
	}

	public void setConstructionCompanySocialCreditCertificateNumber(String constructionCompanySocialCreditCertificateNumber) {
        this.constructionCompanySocialCreditCertificateNumber = constructionCompanySocialCreditCertificateNumber;
    }
		
	public String getWinningCompany() {
        return winningCompany;
	}

	public void setWinningCompany(String winningCompany) {
        this.winningCompany = winningCompany;
    }
		
	public String getWinningCompanySocialCreditCertificateNumber() {
        return winningCompanySocialCreditCertificateNumber;
	}

	public void setWinningCompanySocialCreditCertificateNumber(String winningCompanySocialCreditCertificateNumber) {
        this.winningCompanySocialCreditCertificateNumber = winningCompanySocialCreditCertificateNumber;
    }
		
	public Long getWinningTime() {
        return winningTime;
	}

	public void setWinningTime(Long winningTime) {
        this.winningTime = winningTime;
    }
		
	public Long getWinningMoney() {
        return winningMoney;
	}

	public void setWinningMoney(Long winningMoney) {
        this.winningMoney = winningMoney;
    }
		
	public Long getBeginTime() {
        return beginTime;
	}

	public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
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
         * 填报日期
         * 集合
         */
        private List<Long> fillingTimeList;
		        /**
         * 行政区划
         * 集合
         */
        private List<String> administrativeAreaList;
		        /**
         * 主管部门
         * 集合
         */
        private List<String> competentDepartmentList;
		        /**
         * 项目地址
         * 集合
         */
        private List<String> projectLocationList;
		        /**
         * 建设单位名称
         * 集合
         */
        private List<String> constructionCompanyList;
		        /**
         * 建设单位统一社会信用代码
         * 集合
         */
        private List<String> constructionCompanySocialCreditCertificateNumberList;
		        /**
         * 中标单位名称
         * 集合
         */
        private List<String> winningCompanyList;
		        /**
         * 中标单位统一社会信用代码
         * 集合
         */
        private List<String> winningCompanySocialCreditCertificateNumberList;
		        /**
         * 中标时间
         * 集合
         */
        private List<Long> winningTimeList;
		        /**
         * 中标金额(元)
         * 集合
         */
        private List<Long> winningMoneyList;
		        /**
         * 开工时间
         * 集合
         */
        private List<Long> beginTimeList;
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
                public List<Long> getFillingTimeList() {
            return fillingTimeList;
        }

        public void setFillingTimeList(List<Long> fillingTimeList) {
            this.fillingTimeList = fillingTimeList;
        }
                public List<String> getAdministrativeAreaList() {
            return administrativeAreaList;
        }

        public void setAdministrativeAreaList(List<String> administrativeAreaList) {
            this.administrativeAreaList = administrativeAreaList;
        }
                public List<String> getCompetentDepartmentList() {
            return competentDepartmentList;
        }

        public void setCompetentDepartmentList(List<String> competentDepartmentList) {
            this.competentDepartmentList = competentDepartmentList;
        }
                public List<String> getProjectLocationList() {
            return projectLocationList;
        }

        public void setProjectLocationList(List<String> projectLocationList) {
            this.projectLocationList = projectLocationList;
        }
                public List<String> getConstructionCompanyList() {
            return constructionCompanyList;
        }

        public void setConstructionCompanyList(List<String> constructionCompanyList) {
            this.constructionCompanyList = constructionCompanyList;
        }
                public List<String> getConstructionCompanySocialCreditCertificateNumberList() {
            return constructionCompanySocialCreditCertificateNumberList;
        }

        public void setConstructionCompanySocialCreditCertificateNumberList(List<String> constructionCompanySocialCreditCertificateNumberList) {
            this.constructionCompanySocialCreditCertificateNumberList = constructionCompanySocialCreditCertificateNumberList;
        }
                public List<String> getWinningCompanyList() {
            return winningCompanyList;
        }

        public void setWinningCompanyList(List<String> winningCompanyList) {
            this.winningCompanyList = winningCompanyList;
        }
                public List<String> getWinningCompanySocialCreditCertificateNumberList() {
            return winningCompanySocialCreditCertificateNumberList;
        }

        public void setWinningCompanySocialCreditCertificateNumberList(List<String> winningCompanySocialCreditCertificateNumberList) {
            this.winningCompanySocialCreditCertificateNumberList = winningCompanySocialCreditCertificateNumberList;
        }
                public List<Long> getWinningTimeList() {
            return winningTimeList;
        }

        public void setWinningTimeList(List<Long> winningTimeList) {
            this.winningTimeList = winningTimeList;
        }
                public List<Long> getWinningMoneyList() {
            return winningMoneyList;
        }

        public void setWinningMoneyList(List<Long> winningMoneyList) {
            this.winningMoneyList = winningMoneyList;
        }
                public List<Long> getBeginTimeList() {
            return beginTimeList;
        }

        public void setBeginTimeList(List<Long> beginTimeList) {
            this.beginTimeList = beginTimeList;
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
