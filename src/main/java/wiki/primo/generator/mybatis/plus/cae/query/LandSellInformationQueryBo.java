package wiki.primo.generator.mybatis.plus.cae.query;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import wiki.primo.generator.mybatis.plus.cae.entity.LandSellInformation;
import java.util.List;

																		

/**
 * <p>
 * 土地出让信息
 * 查询条件类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
public class LandSellInformationQueryBo{

	private QueryBoExt queryBoExt;

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 单位名称
	 */
	private String companyName;

	/**
	 * 成交时间
	 */
	private Long dealTime;

	/**
	 * 金钱
	 */
	private Long dealMoney;

	/**
	 * 证书号码
	 */
	private String certificateNumber;

	/**
	 * 土地地区 //此处应特殊处理
	 */
	private String landPosition;

	/**
	 * 土地面积
	 */
	private Long landArea;

	/**
	 * 土地用途
	 */
	private String landPurpose;

	/**
	 * 土地等级
	 */
	private String landLevel;

	/**
	 * 权属性质
	 */
	private String landNature;

	/**
	 * 批准时间
	 */
	private Long approvalTime;

	/**
	 * 终止时间
	 */
	private Long terminationTime;

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
	public QueryWrapper<LandSellInformation> buildQuery() {
		QueryWrapper<LandSellInformation> query = new QueryWrapper<>();

		if(id!=null){
			query.eq(LandSellInformation.ID,id);
		}
		if(companyName!=null){
			query.eq(LandSellInformation.COMPANY_NAME,companyName);
		}
		if(dealTime!=null){
			query.eq(LandSellInformation.DEAL_TIME,dealTime);
		}
		if(dealMoney!=null){
			query.eq(LandSellInformation.DEAL_MONEY,dealMoney);
		}
		if(certificateNumber!=null){
			query.eq(LandSellInformation.CERTIFICATE_NUMBER,certificateNumber);
		}
		if(landPosition!=null){
			query.eq(LandSellInformation.LAND_POSITION,landPosition);
		}
		if(landArea!=null){
			query.eq(LandSellInformation.LAND_AREA,landArea);
		}
		if(landPurpose!=null){
			query.eq(LandSellInformation.LAND_PURPOSE,landPurpose);
		}
		if(landLevel!=null){
			query.eq(LandSellInformation.LAND_LEVEL,landLevel);
		}
		if(landNature!=null){
			query.eq(LandSellInformation.LAND_NATURE,landNature);
		}
		if(approvalTime!=null){
			query.eq(LandSellInformation.APPROVAL_TIME,approvalTime);
		}
		if(terminationTime!=null){
			query.eq(LandSellInformation.TERMINATION_TIME,terminationTime);
		}
		if(remarks!=null){
			query.eq(LandSellInformation.REMARKS,remarks);
		}
		if(createTime!=null){
			query.eq(LandSellInformation.CREATE_TIME,createTime);
		}
		if(creator!=null){
			query.eq(LandSellInformation.CREATOR,creator);
		}
		if(updateTime!=null){
			query.eq(LandSellInformation.UPDATE_TIME,updateTime);
		}
		if(updater!=null){
			query.eq(LandSellInformation.UPDATER,updater);
		}
		if(dataLocation!=null){
			query.eq(LandSellInformation.DATA_LOCATION,dataLocation);
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
                query.in(LandSellInformation.ID,queryBoExt.getIdList());
            }
                        if(queryBoExt.getCompanyNameList()!=null && queryBoExt.getCompanyNameList().size()>0){
                query.in(LandSellInformation.COMPANY_NAME,queryBoExt.getCompanyNameList());
            }
                        if(queryBoExt.getDealTimeList()!=null && queryBoExt.getDealTimeList().size()>0){
                query.in(LandSellInformation.DEAL_TIME,queryBoExt.getDealTimeList());
            }
                        if(queryBoExt.getDealMoneyList()!=null && queryBoExt.getDealMoneyList().size()>0){
                query.in(LandSellInformation.DEAL_MONEY,queryBoExt.getDealMoneyList());
            }
                        if(queryBoExt.getCertificateNumberList()!=null && queryBoExt.getCertificateNumberList().size()>0){
                query.in(LandSellInformation.CERTIFICATE_NUMBER,queryBoExt.getCertificateNumberList());
            }
                        if(queryBoExt.getLandPositionList()!=null && queryBoExt.getLandPositionList().size()>0){
                query.in(LandSellInformation.LAND_POSITION,queryBoExt.getLandPositionList());
            }
                        if(queryBoExt.getLandAreaList()!=null && queryBoExt.getLandAreaList().size()>0){
                query.in(LandSellInformation.LAND_AREA,queryBoExt.getLandAreaList());
            }
                        if(queryBoExt.getLandPurposeList()!=null && queryBoExt.getLandPurposeList().size()>0){
                query.in(LandSellInformation.LAND_PURPOSE,queryBoExt.getLandPurposeList());
            }
                        if(queryBoExt.getLandLevelList()!=null && queryBoExt.getLandLevelList().size()>0){
                query.in(LandSellInformation.LAND_LEVEL,queryBoExt.getLandLevelList());
            }
                        if(queryBoExt.getLandNatureList()!=null && queryBoExt.getLandNatureList().size()>0){
                query.in(LandSellInformation.LAND_NATURE,queryBoExt.getLandNatureList());
            }
                        if(queryBoExt.getApprovalTimeList()!=null && queryBoExt.getApprovalTimeList().size()>0){
                query.in(LandSellInformation.APPROVAL_TIME,queryBoExt.getApprovalTimeList());
            }
                        if(queryBoExt.getTerminationTimeList()!=null && queryBoExt.getTerminationTimeList().size()>0){
                query.in(LandSellInformation.TERMINATION_TIME,queryBoExt.getTerminationTimeList());
            }
                        if(queryBoExt.getRemarksList()!=null && queryBoExt.getRemarksList().size()>0){
                query.in(LandSellInformation.REMARKS,queryBoExt.getRemarksList());
            }
                        if(queryBoExt.getCreateTimeList()!=null && queryBoExt.getCreateTimeList().size()>0){
                query.in(LandSellInformation.CREATE_TIME,queryBoExt.getCreateTimeList());
            }
                        if(queryBoExt.getCreatorList()!=null && queryBoExt.getCreatorList().size()>0){
                query.in(LandSellInformation.CREATOR,queryBoExt.getCreatorList());
            }
                        if(queryBoExt.getUpdateTimeList()!=null && queryBoExt.getUpdateTimeList().size()>0){
                query.in(LandSellInformation.UPDATE_TIME,queryBoExt.getUpdateTimeList());
            }
                        if(queryBoExt.getUpdaterList()!=null && queryBoExt.getUpdaterList().size()>0){
                query.in(LandSellInformation.UPDATER,queryBoExt.getUpdaterList());
            }
                        if(queryBoExt.getDataLocationList()!=null && queryBoExt.getDataLocationList().size()>0){
                query.in(LandSellInformation.DATA_LOCATION,queryBoExt.getDataLocationList());
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
		
	public String getLandPosition() {
        return landPosition;
	}

	public void setLandPosition(String landPosition) {
        this.landPosition = landPosition;
    }
		
	public Long getLandArea() {
        return landArea;
	}

	public void setLandArea(Long landArea) {
        this.landArea = landArea;
    }
		
	public String getLandPurpose() {
        return landPurpose;
	}

	public void setLandPurpose(String landPurpose) {
        this.landPurpose = landPurpose;
    }
		
	public String getLandLevel() {
        return landLevel;
	}

	public void setLandLevel(String landLevel) {
        this.landLevel = landLevel;
    }
		
	public String getLandNature() {
        return landNature;
	}

	public void setLandNature(String landNature) {
        this.landNature = landNature;
    }
		
	public Long getApprovalTime() {
        return approvalTime;
	}

	public void setApprovalTime(Long approvalTime) {
        this.approvalTime = approvalTime;
    }
		
	public Long getTerminationTime() {
        return terminationTime;
	}

	public void setTerminationTime(Long terminationTime) {
        this.terminationTime = terminationTime;
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
         * 单位名称
         * 集合
         */
        private List<String> companyNameList;
		        /**
         * 成交时间
         * 集合
         */
        private List<Long> dealTimeList;
		        /**
         * 金钱
         * 集合
         */
        private List<Long> dealMoneyList;
		        /**
         * 证书号码
         * 集合
         */
        private List<String> certificateNumberList;
		        /**
         * 土地地区 //此处应特殊处理
         * 集合
         */
        private List<String> landPositionList;
		        /**
         * 土地面积
         * 集合
         */
        private List<Long> landAreaList;
		        /**
         * 土地用途
         * 集合
         */
        private List<String> landPurposeList;
		        /**
         * 土地等级
         * 集合
         */
        private List<String> landLevelList;
		        /**
         * 权属性质
         * 集合
         */
        private List<String> landNatureList;
		        /**
         * 批准时间
         * 集合
         */
        private List<Long> approvalTimeList;
		        /**
         * 终止时间
         * 集合
         */
        private List<Long> terminationTimeList;
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
                public List<String> getLandPositionList() {
            return landPositionList;
        }

        public void setLandPositionList(List<String> landPositionList) {
            this.landPositionList = landPositionList;
        }
                public List<Long> getLandAreaList() {
            return landAreaList;
        }

        public void setLandAreaList(List<Long> landAreaList) {
            this.landAreaList = landAreaList;
        }
                public List<String> getLandPurposeList() {
            return landPurposeList;
        }

        public void setLandPurposeList(List<String> landPurposeList) {
            this.landPurposeList = landPurposeList;
        }
                public List<String> getLandLevelList() {
            return landLevelList;
        }

        public void setLandLevelList(List<String> landLevelList) {
            this.landLevelList = landLevelList;
        }
                public List<String> getLandNatureList() {
            return landNatureList;
        }

        public void setLandNatureList(List<String> landNatureList) {
            this.landNatureList = landNatureList;
        }
                public List<Long> getApprovalTimeList() {
            return approvalTimeList;
        }

        public void setApprovalTimeList(List<Long> approvalTimeList) {
            this.approvalTimeList = approvalTimeList;
        }
                public List<Long> getTerminationTimeList() {
            return terminationTimeList;
        }

        public void setTerminationTimeList(List<Long> terminationTimeList) {
            this.terminationTimeList = terminationTimeList;
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
