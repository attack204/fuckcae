package wiki.primo.generator.mybatis.plus.cae.query;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import wiki.primo.generator.mybatis.plus.cae.entity.DetailPlan;
import java.util.List;

											

/**
 * <p>
 * 项目进度明细表
 * 查询条件类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
public class DetailPlanQueryBo{

	private QueryBoExt queryBoExt;

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 单位名称(土地权利人)
	 */
	private String companyName;

	/**
	 * 成交时间
	 */
	private Long dealTime;

	/**
	 * 成交金额
	 */
	private Long dealMoney;

	/**
	 * 证书号码
	 */
	private String certificateNumber;

	/**
	 * 土地位置
	 */
	private String landLocation;

	/**
	 * 土地面积(单位:平方米)
	 */
	private String landArea;

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
	 * 构建查询
	 * @return
	 */
	public QueryWrapper<DetailPlan> buildQuery() {
		QueryWrapper<DetailPlan> query = new QueryWrapper<>();

		if(id!=null){
			query.eq(DetailPlan.ID,id);
		}
		if(companyName!=null){
			query.eq(DetailPlan.COMPANY_NAME,companyName);
		}
		if(dealTime!=null){
			query.eq(DetailPlan.DEAL_TIME,dealTime);
		}
		if(dealMoney!=null){
			query.eq(DetailPlan.DEAL_MONEY,dealMoney);
		}
		if(certificateNumber!=null){
			query.eq(DetailPlan.CERTIFICATE_NUMBER,certificateNumber);
		}
		if(landLocation!=null){
			query.eq(DetailPlan.LAND_LOCATION,landLocation);
		}
		if(landArea!=null){
			query.eq(DetailPlan.LAND_AREA,landArea);
		}
		if(createTime!=null){
			query.eq(DetailPlan.CREATE_TIME,createTime);
		}
		if(creator!=null){
			query.eq(DetailPlan.CREATOR,creator);
		}
		if(updateTime!=null){
			query.eq(DetailPlan.UPDATE_TIME,updateTime);
		}
		if(updater!=null){
			query.eq(DetailPlan.UPDATER,updater);
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
                query.in(DetailPlan.ID,queryBoExt.getIdList());
            }
                        if(queryBoExt.getCompanyNameList()!=null && queryBoExt.getCompanyNameList().size()>0){
                query.in(DetailPlan.COMPANY_NAME,queryBoExt.getCompanyNameList());
            }
                        if(queryBoExt.getDealTimeList()!=null && queryBoExt.getDealTimeList().size()>0){
                query.in(DetailPlan.DEAL_TIME,queryBoExt.getDealTimeList());
            }
                        if(queryBoExt.getDealMoneyList()!=null && queryBoExt.getDealMoneyList().size()>0){
                query.in(DetailPlan.DEAL_MONEY,queryBoExt.getDealMoneyList());
            }
                        if(queryBoExt.getCertificateNumberList()!=null && queryBoExt.getCertificateNumberList().size()>0){
                query.in(DetailPlan.CERTIFICATE_NUMBER,queryBoExt.getCertificateNumberList());
            }
                        if(queryBoExt.getLandLocationList()!=null && queryBoExt.getLandLocationList().size()>0){
                query.in(DetailPlan.LAND_LOCATION,queryBoExt.getLandLocationList());
            }
                        if(queryBoExt.getLandAreaList()!=null && queryBoExt.getLandAreaList().size()>0){
                query.in(DetailPlan.LAND_AREA,queryBoExt.getLandAreaList());
            }
                        if(queryBoExt.getCreateTimeList()!=null && queryBoExt.getCreateTimeList().size()>0){
                query.in(DetailPlan.CREATE_TIME,queryBoExt.getCreateTimeList());
            }
                        if(queryBoExt.getCreatorList()!=null && queryBoExt.getCreatorList().size()>0){
                query.in(DetailPlan.CREATOR,queryBoExt.getCreatorList());
            }
                        if(queryBoExt.getUpdateTimeList()!=null && queryBoExt.getUpdateTimeList().size()>0){
                query.in(DetailPlan.UPDATE_TIME,queryBoExt.getUpdateTimeList());
            }
                        if(queryBoExt.getUpdaterList()!=null && queryBoExt.getUpdaterList().size()>0){
                query.in(DetailPlan.UPDATER,queryBoExt.getUpdaterList());
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
         * 单位名称(土地权利人)
         * 集合
         */
        private List<String> companyNameList;
		        /**
         * 成交时间
         * 集合
         */
        private List<Long> dealTimeList;
		        /**
         * 成交金额
         * 集合
         */
        private List<Long> dealMoneyList;
		        /**
         * 证书号码
         * 集合
         */
        private List<String> certificateNumberList;
		        /**
         * 土地位置
         * 集合
         */
        private List<String> landLocationList;
		        /**
         * 土地面积(单位:平方米)
         * 集合
         */
        private List<String> landAreaList;
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
		

                public List<Long> getIdList() {
            return idList;
        }

        public void setIdList(List<Long> idList) {
            this.idList = idList;
        }
                public List<String> getCompanyNameList() {
            return companyNameList;
        }

        public void setCompanyNameList(List<String> companyNameList) {
            this.companyNameList = companyNameList;
        }
                public List<Long> getDealTimeList() {
            return dealTimeList;
        }

        public void setDealTimeList(List<Long> dealTimeList) {
            this.dealTimeList = dealTimeList;
        }
                public List<Long> getDealMoneyList() {
            return dealMoneyList;
        }

        public void setDealMoneyList(List<Long> dealMoneyList) {
            this.dealMoneyList = dealMoneyList;
        }
                public List<String> getCertificateNumberList() {
            return certificateNumberList;
        }

        public void setCertificateNumberList(List<String> certificateNumberList) {
            this.certificateNumberList = certificateNumberList;
        }
                public List<String> getLandLocationList() {
            return landLocationList;
        }

        public void setLandLocationList(List<String> landLocationList) {
            this.landLocationList = landLocationList;
        }
                public List<String> getLandAreaList() {
            return landAreaList;
        }

        public void setLandAreaList(List<String> landAreaList) {
            this.landAreaList = landAreaList;
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
