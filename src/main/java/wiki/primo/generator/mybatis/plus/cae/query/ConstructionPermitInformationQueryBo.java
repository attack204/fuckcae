package wiki.primo.generator.mybatis.plus.cae.query;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import wiki.primo.generator.mybatis.plus.cae.entity.ConstructionPermitInformation;
import java.util.List;

																		

/**
 * <p>
 * 施工许可证信息
 * 查询条件类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
public class ConstructionPermitInformationQueryBo{

	private QueryBoExt queryBoExt;

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 工程名称
	 */
	private String projectName;

	/**
	 * 建设地址
	 */
	private String projectPosition;

	/**
	 * 建设单位
	 */
	private String buildCompany;

	/**
	 * 联系电话
	 */
	private String contactPhone;

	/**
	 * 批准时间
	 */
	private Long approvalTime;

	/**
	 * 工程概算(万元)
	 */
	private Long expectInvestment;

	/**
	 * 开工日期
	 */
	private Long beginTime;

	/**
	 * 竣工日期
	 */
	private Long endTime;

	/**
	 * 许可证编号
	 */
	private String permitNumber;

	/**
	 * 施工单位
	 */
	private String constructionCompany;

	/**
	 * 设计单位
	 */
	private String designCompany;

	/**
	 * 监理单位
	 */
	private String superviseCompany;

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
	public QueryWrapper<ConstructionPermitInformation> buildQuery() {
		QueryWrapper<ConstructionPermitInformation> query = new QueryWrapper<>();

		if(id!=null){
			query.eq(ConstructionPermitInformation.ID,id);
		}
		if(projectName!=null){
			query.eq(ConstructionPermitInformation.PROJECT_NAME,projectName);
		}
		if(projectPosition!=null){
			query.eq(ConstructionPermitInformation.PROJECT_POSITION,projectPosition);
		}
		if(buildCompany!=null){
			query.eq(ConstructionPermitInformation.BUILD_COMPANY,buildCompany);
		}
		if(contactPhone!=null){
			query.eq(ConstructionPermitInformation.CONTACT_PHONE,contactPhone);
		}
		if(approvalTime!=null){
			query.eq(ConstructionPermitInformation.APPROVAL_TIME,approvalTime);
		}
		if(expectInvestment!=null){
			query.eq(ConstructionPermitInformation.EXPECT_INVESTMENT,expectInvestment);
		}
		if(beginTime!=null){
			query.eq(ConstructionPermitInformation.BEGIN_TIME,beginTime);
		}
		if(endTime!=null){
			query.eq(ConstructionPermitInformation.END_TIME,endTime);
		}
		if(permitNumber!=null){
			query.eq(ConstructionPermitInformation.PERMIT_NUMBER,permitNumber);
		}
		if(constructionCompany!=null){
			query.eq(ConstructionPermitInformation.CONSTRUCTION_COMPANY,constructionCompany);
		}
		if(designCompany!=null){
			query.eq(ConstructionPermitInformation.DESIGN_COMPANY,designCompany);
		}
		if(superviseCompany!=null){
			query.eq(ConstructionPermitInformation.SUPERVISE_COMPANY,superviseCompany);
		}
		if(createTime!=null){
			query.eq(ConstructionPermitInformation.CREATE_TIME,createTime);
		}
		if(creator!=null){
			query.eq(ConstructionPermitInformation.CREATOR,creator);
		}
		if(updateTime!=null){
			query.eq(ConstructionPermitInformation.UPDATE_TIME,updateTime);
		}
		if(updater!=null){
			query.eq(ConstructionPermitInformation.UPDATER,updater);
		}
		if(dataLocation!=null){
			query.eq(ConstructionPermitInformation.DATA_LOCATION,dataLocation);
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
                query.in(ConstructionPermitInformation.ID,queryBoExt.getIdList());
            }
                        if(queryBoExt.getProjectNameList()!=null && queryBoExt.getProjectNameList().size()>0){
                query.in(ConstructionPermitInformation.PROJECT_NAME,queryBoExt.getProjectNameList());
            }
                        if(queryBoExt.getProjectPositionList()!=null && queryBoExt.getProjectPositionList().size()>0){
                query.in(ConstructionPermitInformation.PROJECT_POSITION,queryBoExt.getProjectPositionList());
            }
                        if(queryBoExt.getBuildCompanyList()!=null && queryBoExt.getBuildCompanyList().size()>0){
                query.in(ConstructionPermitInformation.BUILD_COMPANY,queryBoExt.getBuildCompanyList());
            }
                        if(queryBoExt.getContactPhoneList()!=null && queryBoExt.getContactPhoneList().size()>0){
                query.in(ConstructionPermitInformation.CONTACT_PHONE,queryBoExt.getContactPhoneList());
            }
                        if(queryBoExt.getApprovalTimeList()!=null && queryBoExt.getApprovalTimeList().size()>0){
                query.in(ConstructionPermitInformation.APPROVAL_TIME,queryBoExt.getApprovalTimeList());
            }
                        if(queryBoExt.getExpectInvestmentList()!=null && queryBoExt.getExpectInvestmentList().size()>0){
                query.in(ConstructionPermitInformation.EXPECT_INVESTMENT,queryBoExt.getExpectInvestmentList());
            }
                        if(queryBoExt.getBeginTimeList()!=null && queryBoExt.getBeginTimeList().size()>0){
                query.in(ConstructionPermitInformation.BEGIN_TIME,queryBoExt.getBeginTimeList());
            }
                        if(queryBoExt.getEndTimeList()!=null && queryBoExt.getEndTimeList().size()>0){
                query.in(ConstructionPermitInformation.END_TIME,queryBoExt.getEndTimeList());
            }
                        if(queryBoExt.getPermitNumberList()!=null && queryBoExt.getPermitNumberList().size()>0){
                query.in(ConstructionPermitInformation.PERMIT_NUMBER,queryBoExt.getPermitNumberList());
            }
                        if(queryBoExt.getConstructionCompanyList()!=null && queryBoExt.getConstructionCompanyList().size()>0){
                query.in(ConstructionPermitInformation.CONSTRUCTION_COMPANY,queryBoExt.getConstructionCompanyList());
            }
                        if(queryBoExt.getDesignCompanyList()!=null && queryBoExt.getDesignCompanyList().size()>0){
                query.in(ConstructionPermitInformation.DESIGN_COMPANY,queryBoExt.getDesignCompanyList());
            }
                        if(queryBoExt.getSuperviseCompanyList()!=null && queryBoExt.getSuperviseCompanyList().size()>0){
                query.in(ConstructionPermitInformation.SUPERVISE_COMPANY,queryBoExt.getSuperviseCompanyList());
            }
                        if(queryBoExt.getCreateTimeList()!=null && queryBoExt.getCreateTimeList().size()>0){
                query.in(ConstructionPermitInformation.CREATE_TIME,queryBoExt.getCreateTimeList());
            }
                        if(queryBoExt.getCreatorList()!=null && queryBoExt.getCreatorList().size()>0){
                query.in(ConstructionPermitInformation.CREATOR,queryBoExt.getCreatorList());
            }
                        if(queryBoExt.getUpdateTimeList()!=null && queryBoExt.getUpdateTimeList().size()>0){
                query.in(ConstructionPermitInformation.UPDATE_TIME,queryBoExt.getUpdateTimeList());
            }
                        if(queryBoExt.getUpdaterList()!=null && queryBoExt.getUpdaterList().size()>0){
                query.in(ConstructionPermitInformation.UPDATER,queryBoExt.getUpdaterList());
            }
                        if(queryBoExt.getDataLocationList()!=null && queryBoExt.getDataLocationList().size()>0){
                query.in(ConstructionPermitInformation.DATA_LOCATION,queryBoExt.getDataLocationList());
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
		
	public String getProjectPosition() {
        return projectPosition;
	}

	public void setProjectPosition(String projectPosition) {
        this.projectPosition = projectPosition;
    }
		
	public String getBuildCompany() {
        return buildCompany;
	}

	public void setBuildCompany(String buildCompany) {
        this.buildCompany = buildCompany;
    }
		
	public String getContactPhone() {
        return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
		
	public Long getApprovalTime() {
        return approvalTime;
	}

	public void setApprovalTime(Long approvalTime) {
        this.approvalTime = approvalTime;
    }
		
	public Long getExpectInvestment() {
        return expectInvestment;
	}

	public void setExpectInvestment(Long expectInvestment) {
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
		
	public String getPermitNumber() {
        return permitNumber;
	}

	public void setPermitNumber(String permitNumber) {
        this.permitNumber = permitNumber;
    }
		
	public String getConstructionCompany() {
        return constructionCompany;
	}

	public void setConstructionCompany(String constructionCompany) {
        this.constructionCompany = constructionCompany;
    }
		
	public String getDesignCompany() {
        return designCompany;
	}

	public void setDesignCompany(String designCompany) {
        this.designCompany = designCompany;
    }
		
	public String getSuperviseCompany() {
        return superviseCompany;
	}

	public void setSuperviseCompany(String superviseCompany) {
        this.superviseCompany = superviseCompany;
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
         * 工程名称
         * 集合
         */
        private List<String> projectNameList;
		        /**
         * 建设地址
         * 集合
         */
        private List<String> projectPositionList;
		        /**
         * 建设单位
         * 集合
         */
        private List<String> buildCompanyList;
		        /**
         * 联系电话
         * 集合
         */
        private List<String> contactPhoneList;
		        /**
         * 批准时间
         * 集合
         */
        private List<Long> approvalTimeList;
		        /**
         * 工程概算(万元)
         * 集合
         */
        private List<Long> expectInvestmentList;
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
         * 许可证编号
         * 集合
         */
        private List<String> permitNumberList;
		        /**
         * 施工单位
         * 集合
         */
        private List<String> constructionCompanyList;
		        /**
         * 设计单位
         * 集合
         */
        private List<String> designCompanyList;
		        /**
         * 监理单位
         * 集合
         */
        private List<String> superviseCompanyList;
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
                public List<String> getProjectPositionList() {
            return projectPositionList;
        }

        public void setProjectPositionList(List<String> projectPositionList) {
            this.projectPositionList = projectPositionList;
        }
                public List<String> getBuildCompanyList() {
            return buildCompanyList;
        }

        public void setBuildCompanyList(List<String> buildCompanyList) {
            this.buildCompanyList = buildCompanyList;
        }
                public List<String> getContactPhoneList() {
            return contactPhoneList;
        }

        public void setContactPhoneList(List<String> contactPhoneList) {
            this.contactPhoneList = contactPhoneList;
        }
                public List<Long> getApprovalTimeList() {
            return approvalTimeList;
        }

        public void setApprovalTimeList(List<Long> approvalTimeList) {
            this.approvalTimeList = approvalTimeList;
        }
                public List<Long> getExpectInvestmentList() {
            return expectInvestmentList;
        }

        public void setExpectInvestmentList(List<Long> expectInvestmentList) {
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
                public List<String> getPermitNumberList() {
            return permitNumberList;
        }

        public void setPermitNumberList(List<String> permitNumberList) {
            this.permitNumberList = permitNumberList;
        }
                public List<String> getConstructionCompanyList() {
            return constructionCompanyList;
        }

        public void setConstructionCompanyList(List<String> constructionCompanyList) {
            this.constructionCompanyList = constructionCompanyList;
        }
                public List<String> getDesignCompanyList() {
            return designCompanyList;
        }

        public void setDesignCompanyList(List<String> designCompanyList) {
            this.designCompanyList = designCompanyList;
        }
                public List<String> getSuperviseCompanyList() {
            return superviseCompanyList;
        }

        public void setSuperviseCompanyList(List<String> superviseCompanyList) {
            this.superviseCompanyList = superviseCompanyList;
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
