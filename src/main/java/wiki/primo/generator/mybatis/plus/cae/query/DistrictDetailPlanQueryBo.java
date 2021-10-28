package wiki.primo.generator.mybatis.plus.cae.query;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import wiki.primo.generator.mybatis.plus.cae.entity.DistrictDetailPlan;
import java.util.List;

											

/**
 * <p>
 * 区级重点项目进度明细表
 * 查询条件类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
public class DistrictDetailPlanQueryBo{

	private QueryBoExt queryBoExt;

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 计划投资(万元)
	 */
	private Long investmentMoney;

	/**
	 * 征地拆迁
	 */
	private Long landAcquisitionAndDemolitionMoney;

	/**
	 * 土建工程
	 */
	private Long buildingProjectsMoney;

	/**
	 * 设备购置
	 */
	private Long equipmentPurchaseMoney;

	/**
	 * 其他金额
	 */
	private Long otherMoney;

	/**
	 * 分季度形象进度明细
	 */
	private String quarterlyProgressDetails;

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
	public QueryWrapper<DistrictDetailPlan> buildQuery() {
		QueryWrapper<DistrictDetailPlan> query = new QueryWrapper<>();

		if(id!=null){
			query.eq(DistrictDetailPlan.ID,id);
		}
		if(investmentMoney!=null){
			query.eq(DistrictDetailPlan.INVESTMENT_MONEY,investmentMoney);
		}
		if(landAcquisitionAndDemolitionMoney!=null){
			query.eq(DistrictDetailPlan.LAND_ACQUISITION_AND_DEMOLITION_MONEY,landAcquisitionAndDemolitionMoney);
		}
		if(buildingProjectsMoney!=null){
			query.eq(DistrictDetailPlan.BUILDING_PROJECTS_MONEY,buildingProjectsMoney);
		}
		if(equipmentPurchaseMoney!=null){
			query.eq(DistrictDetailPlan.EQUIPMENT_PURCHASE_MONEY,equipmentPurchaseMoney);
		}
		if(otherMoney!=null){
			query.eq(DistrictDetailPlan.OTHER_MONEY,otherMoney);
		}
		if(quarterlyProgressDetails!=null){
			query.eq(DistrictDetailPlan.QUARTERLY_PROGRESS_DETAILS,quarterlyProgressDetails);
		}
		if(createTime!=null){
			query.eq(DistrictDetailPlan.CREATE_TIME,createTime);
		}
		if(creator!=null){
			query.eq(DistrictDetailPlan.CREATOR,creator);
		}
		if(updateTime!=null){
			query.eq(DistrictDetailPlan.UPDATE_TIME,updateTime);
		}
		if(updater!=null){
			query.eq(DistrictDetailPlan.UPDATER,updater);
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
                query.in(DistrictDetailPlan.ID,queryBoExt.getIdList());
            }
                        if(queryBoExt.getInvestmentMoneyList()!=null && queryBoExt.getInvestmentMoneyList().size()>0){
                query.in(DistrictDetailPlan.INVESTMENT_MONEY,queryBoExt.getInvestmentMoneyList());
            }
                        if(queryBoExt.getLandAcquisitionAndDemolitionMoneyList()!=null && queryBoExt.getLandAcquisitionAndDemolitionMoneyList().size()>0){
                query.in(DistrictDetailPlan.LAND_ACQUISITION_AND_DEMOLITION_MONEY,queryBoExt.getLandAcquisitionAndDemolitionMoneyList());
            }
                        if(queryBoExt.getBuildingProjectsMoneyList()!=null && queryBoExt.getBuildingProjectsMoneyList().size()>0){
                query.in(DistrictDetailPlan.BUILDING_PROJECTS_MONEY,queryBoExt.getBuildingProjectsMoneyList());
            }
                        if(queryBoExt.getEquipmentPurchaseMoneyList()!=null && queryBoExt.getEquipmentPurchaseMoneyList().size()>0){
                query.in(DistrictDetailPlan.EQUIPMENT_PURCHASE_MONEY,queryBoExt.getEquipmentPurchaseMoneyList());
            }
                        if(queryBoExt.getOtherMoneyList()!=null && queryBoExt.getOtherMoneyList().size()>0){
                query.in(DistrictDetailPlan.OTHER_MONEY,queryBoExt.getOtherMoneyList());
            }
                        if(queryBoExt.getQuarterlyProgressDetailsList()!=null && queryBoExt.getQuarterlyProgressDetailsList().size()>0){
                query.in(DistrictDetailPlan.QUARTERLY_PROGRESS_DETAILS,queryBoExt.getQuarterlyProgressDetailsList());
            }
                        if(queryBoExt.getCreateTimeList()!=null && queryBoExt.getCreateTimeList().size()>0){
                query.in(DistrictDetailPlan.CREATE_TIME,queryBoExt.getCreateTimeList());
            }
                        if(queryBoExt.getCreatorList()!=null && queryBoExt.getCreatorList().size()>0){
                query.in(DistrictDetailPlan.CREATOR,queryBoExt.getCreatorList());
            }
                        if(queryBoExt.getUpdateTimeList()!=null && queryBoExt.getUpdateTimeList().size()>0){
                query.in(DistrictDetailPlan.UPDATE_TIME,queryBoExt.getUpdateTimeList());
            }
                        if(queryBoExt.getUpdaterList()!=null && queryBoExt.getUpdaterList().size()>0){
                query.in(DistrictDetailPlan.UPDATER,queryBoExt.getUpdaterList());
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
		
	public Long getInvestmentMoney() {
        return investmentMoney;
	}

	public void setInvestmentMoney(Long investmentMoney) {
        this.investmentMoney = investmentMoney;
    }
		
	public Long getLandAcquisitionAndDemolitionMoney() {
        return landAcquisitionAndDemolitionMoney;
	}

	public void setLandAcquisitionAndDemolitionMoney(Long landAcquisitionAndDemolitionMoney) {
        this.landAcquisitionAndDemolitionMoney = landAcquisitionAndDemolitionMoney;
    }
		
	public Long getBuildingProjectsMoney() {
        return buildingProjectsMoney;
	}

	public void setBuildingProjectsMoney(Long buildingProjectsMoney) {
        this.buildingProjectsMoney = buildingProjectsMoney;
    }
		
	public Long getEquipmentPurchaseMoney() {
        return equipmentPurchaseMoney;
	}

	public void setEquipmentPurchaseMoney(Long equipmentPurchaseMoney) {
        this.equipmentPurchaseMoney = equipmentPurchaseMoney;
    }
		
	public Long getOtherMoney() {
        return otherMoney;
	}

	public void setOtherMoney(Long otherMoney) {
        this.otherMoney = otherMoney;
    }
		
	public String getQuarterlyProgressDetails() {
        return quarterlyProgressDetails;
	}

	public void setQuarterlyProgressDetails(String quarterlyProgressDetails) {
        this.quarterlyProgressDetails = quarterlyProgressDetails;
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
         * 计划投资(万元)
         * 集合
         */
        private List<Long> investmentMoneyList;
		        /**
         * 征地拆迁
         * 集合
         */
        private List<Long> landAcquisitionAndDemolitionMoneyList;
		        /**
         * 土建工程
         * 集合
         */
        private List<Long> buildingProjectsMoneyList;
		        /**
         * 设备购置
         * 集合
         */
        private List<Long> equipmentPurchaseMoneyList;
		        /**
         * 其他金额
         * 集合
         */
        private List<Long> otherMoneyList;
		        /**
         * 分季度形象进度明细
         * 集合
         */
        private List<String> quarterlyProgressDetailsList;
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
                public List<Long> getInvestmentMoneyList() {
            return investmentMoneyList;
        }

        public void setInvestmentMoneyList(List<Long> investmentMoneyList) {
            this.investmentMoneyList = investmentMoneyList;
        }
                public List<Long> getLandAcquisitionAndDemolitionMoneyList() {
            return landAcquisitionAndDemolitionMoneyList;
        }

        public void setLandAcquisitionAndDemolitionMoneyList(List<Long> landAcquisitionAndDemolitionMoneyList) {
            this.landAcquisitionAndDemolitionMoneyList = landAcquisitionAndDemolitionMoneyList;
        }
                public List<Long> getBuildingProjectsMoneyList() {
            return buildingProjectsMoneyList;
        }

        public void setBuildingProjectsMoneyList(List<Long> buildingProjectsMoneyList) {
            this.buildingProjectsMoneyList = buildingProjectsMoneyList;
        }
                public List<Long> getEquipmentPurchaseMoneyList() {
            return equipmentPurchaseMoneyList;
        }

        public void setEquipmentPurchaseMoneyList(List<Long> equipmentPurchaseMoneyList) {
            this.equipmentPurchaseMoneyList = equipmentPurchaseMoneyList;
        }
                public List<Long> getOtherMoneyList() {
            return otherMoneyList;
        }

        public void setOtherMoneyList(List<Long> otherMoneyList) {
            this.otherMoneyList = otherMoneyList;
        }
                public List<String> getQuarterlyProgressDetailsList() {
            return quarterlyProgressDetailsList;
        }

        public void setQuarterlyProgressDetailsList(List<String> quarterlyProgressDetailsList) {
            this.quarterlyProgressDetailsList = quarterlyProgressDetailsList;
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
