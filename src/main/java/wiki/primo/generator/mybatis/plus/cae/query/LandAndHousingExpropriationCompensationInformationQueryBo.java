package wiki.primo.generator.mybatis.plus.cae.query;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import wiki.primo.generator.mybatis.plus.cae.entity.LandAndHousingExpropriationCompensationInformation;
import java.util.List;

																

/**
 * <p>
 * 土地及房屋征收补偿信息
 * 查询条件类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
public class LandAndHousingExpropriationCompensationInformationQueryBo{

	private QueryBoExt queryBoExt;

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 补偿单位(个人)
	 */
	private String compensateCompany;

	/**
	 * 收回土地坐落
	 */
	private String reclaimedLandLocation;

	/**
	 * 收回土地面积(平方米)
	 */
	private Long reclaimedLandArea;

	/**
	 * 土地证号
	 */
	private String landCertificateNumber;

	/**
	 * 土地用途
	 */
	private String landPurpose;

	/**
	 * 建筑物及附属建筑物面积
	 */
	private Long buildingsAndAncillaryBuildingsArea;

	/**
	 * 评估土地价值
	 */
	private Long evaluateLandValue;

	/**
	 * 评估地上建筑物及附属物价值
	 */
	private Long evaluateAbovegroundBuildingsAndAppurtenancesValue;

	/**
	 * 补偿土地价值
	 */
	private Long compensateLandValue;

	/**
	 * 补偿地上建筑物及附属物价值
	 */
	private Long compensateAbovegroundBuildingsAndAppurtenancesValue;

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
	public QueryWrapper<LandAndHousingExpropriationCompensationInformation> buildQuery() {
		QueryWrapper<LandAndHousingExpropriationCompensationInformation> query = new QueryWrapper<>();

		if(id!=null){
			query.eq(LandAndHousingExpropriationCompensationInformation.ID,id);
		}
		if(compensateCompany!=null){
			query.eq(LandAndHousingExpropriationCompensationInformation.COMPENSATE_COMPANY,compensateCompany);
		}
		if(reclaimedLandLocation!=null){
			query.eq(LandAndHousingExpropriationCompensationInformation.RECLAIMED_LAND_LOCATION,reclaimedLandLocation);
		}
		if(reclaimedLandArea!=null){
			query.eq(LandAndHousingExpropriationCompensationInformation.RECLAIMED_LAND_AREA,reclaimedLandArea);
		}
		if(landCertificateNumber!=null){
			query.eq(LandAndHousingExpropriationCompensationInformation.LAND_CERTIFICATE_NUMBER,landCertificateNumber);
		}
		if(landPurpose!=null){
			query.eq(LandAndHousingExpropriationCompensationInformation.LAND_PURPOSE,landPurpose);
		}
		if(buildingsAndAncillaryBuildingsArea!=null){
			query.eq(LandAndHousingExpropriationCompensationInformation.BUILDINGS_AND_ANCILLARY_BUILDINGS_AREA,buildingsAndAncillaryBuildingsArea);
		}
		if(evaluateLandValue!=null){
			query.eq(LandAndHousingExpropriationCompensationInformation.EVALUATE_LAND_VALUE,evaluateLandValue);
		}
		if(evaluateAbovegroundBuildingsAndAppurtenancesValue!=null){
			query.eq(LandAndHousingExpropriationCompensationInformation.EVALUATE_ABOVEGROUND_BUILDINGS_AND_APPURTENANCES_VALUE,evaluateAbovegroundBuildingsAndAppurtenancesValue);
		}
		if(compensateLandValue!=null){
			query.eq(LandAndHousingExpropriationCompensationInformation.COMPENSATE_LAND_VALUE,compensateLandValue);
		}
		if(compensateAbovegroundBuildingsAndAppurtenancesValue!=null){
			query.eq(LandAndHousingExpropriationCompensationInformation.COMPENSATE_ABOVEGROUND_BUILDINGS_AND_APPURTENANCES_VALUE,compensateAbovegroundBuildingsAndAppurtenancesValue);
		}
		if(createTime!=null){
			query.eq(LandAndHousingExpropriationCompensationInformation.CREATE_TIME,createTime);
		}
		if(creator!=null){
			query.eq(LandAndHousingExpropriationCompensationInformation.CREATOR,creator);
		}
		if(updateTime!=null){
			query.eq(LandAndHousingExpropriationCompensationInformation.UPDATE_TIME,updateTime);
		}
		if(updater!=null){
			query.eq(LandAndHousingExpropriationCompensationInformation.UPDATER,updater);
		}
		if(dataLocation!=null){
			query.eq(LandAndHousingExpropriationCompensationInformation.DATA_LOCATION,dataLocation);
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
                query.in(LandAndHousingExpropriationCompensationInformation.ID,queryBoExt.getIdList());
            }
                        if(queryBoExt.getCompensateCompanyList()!=null && queryBoExt.getCompensateCompanyList().size()>0){
                query.in(LandAndHousingExpropriationCompensationInformation.COMPENSATE_COMPANY,queryBoExt.getCompensateCompanyList());
            }
                        if(queryBoExt.getReclaimedLandLocationList()!=null && queryBoExt.getReclaimedLandLocationList().size()>0){
                query.in(LandAndHousingExpropriationCompensationInformation.RECLAIMED_LAND_LOCATION,queryBoExt.getReclaimedLandLocationList());
            }
                        if(queryBoExt.getReclaimedLandAreaList()!=null && queryBoExt.getReclaimedLandAreaList().size()>0){
                query.in(LandAndHousingExpropriationCompensationInformation.RECLAIMED_LAND_AREA,queryBoExt.getReclaimedLandAreaList());
            }
                        if(queryBoExt.getLandCertificateNumberList()!=null && queryBoExt.getLandCertificateNumberList().size()>0){
                query.in(LandAndHousingExpropriationCompensationInformation.LAND_CERTIFICATE_NUMBER,queryBoExt.getLandCertificateNumberList());
            }
                        if(queryBoExt.getLandPurposeList()!=null && queryBoExt.getLandPurposeList().size()>0){
                query.in(LandAndHousingExpropriationCompensationInformation.LAND_PURPOSE,queryBoExt.getLandPurposeList());
            }
                        if(queryBoExt.getBuildingsAndAncillaryBuildingsAreaList()!=null && queryBoExt.getBuildingsAndAncillaryBuildingsAreaList().size()>0){
                query.in(LandAndHousingExpropriationCompensationInformation.BUILDINGS_AND_ANCILLARY_BUILDINGS_AREA,queryBoExt.getBuildingsAndAncillaryBuildingsAreaList());
            }
                        if(queryBoExt.getEvaluateLandValueList()!=null && queryBoExt.getEvaluateLandValueList().size()>0){
                query.in(LandAndHousingExpropriationCompensationInformation.EVALUATE_LAND_VALUE,queryBoExt.getEvaluateLandValueList());
            }
                        if(queryBoExt.getEvaluateAbovegroundBuildingsAndAppurtenancesValueList()!=null && queryBoExt.getEvaluateAbovegroundBuildingsAndAppurtenancesValueList().size()>0){
                query.in(LandAndHousingExpropriationCompensationInformation.EVALUATE_ABOVEGROUND_BUILDINGS_AND_APPURTENANCES_VALUE,queryBoExt.getEvaluateAbovegroundBuildingsAndAppurtenancesValueList());
            }
                        if(queryBoExt.getCompensateLandValueList()!=null && queryBoExt.getCompensateLandValueList().size()>0){
                query.in(LandAndHousingExpropriationCompensationInformation.COMPENSATE_LAND_VALUE,queryBoExt.getCompensateLandValueList());
            }
                        if(queryBoExt.getCompensateAbovegroundBuildingsAndAppurtenancesValueList()!=null && queryBoExt.getCompensateAbovegroundBuildingsAndAppurtenancesValueList().size()>0){
                query.in(LandAndHousingExpropriationCompensationInformation.COMPENSATE_ABOVEGROUND_BUILDINGS_AND_APPURTENANCES_VALUE,queryBoExt.getCompensateAbovegroundBuildingsAndAppurtenancesValueList());
            }
                        if(queryBoExt.getCreateTimeList()!=null && queryBoExt.getCreateTimeList().size()>0){
                query.in(LandAndHousingExpropriationCompensationInformation.CREATE_TIME,queryBoExt.getCreateTimeList());
            }
                        if(queryBoExt.getCreatorList()!=null && queryBoExt.getCreatorList().size()>0){
                query.in(LandAndHousingExpropriationCompensationInformation.CREATOR,queryBoExt.getCreatorList());
            }
                        if(queryBoExt.getUpdateTimeList()!=null && queryBoExt.getUpdateTimeList().size()>0){
                query.in(LandAndHousingExpropriationCompensationInformation.UPDATE_TIME,queryBoExt.getUpdateTimeList());
            }
                        if(queryBoExt.getUpdaterList()!=null && queryBoExt.getUpdaterList().size()>0){
                query.in(LandAndHousingExpropriationCompensationInformation.UPDATER,queryBoExt.getUpdaterList());
            }
                        if(queryBoExt.getDataLocationList()!=null && queryBoExt.getDataLocationList().size()>0){
                query.in(LandAndHousingExpropriationCompensationInformation.DATA_LOCATION,queryBoExt.getDataLocationList());
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
		
	public String getCompensateCompany() {
        return compensateCompany;
	}

	public void setCompensateCompany(String compensateCompany) {
        this.compensateCompany = compensateCompany;
    }
		
	public String getReclaimedLandLocation() {
        return reclaimedLandLocation;
	}

	public void setReclaimedLandLocation(String reclaimedLandLocation) {
        this.reclaimedLandLocation = reclaimedLandLocation;
    }
		
	public Long getReclaimedLandArea() {
        return reclaimedLandArea;
	}

	public void setReclaimedLandArea(Long reclaimedLandArea) {
        this.reclaimedLandArea = reclaimedLandArea;
    }
		
	public String getLandCertificateNumber() {
        return landCertificateNumber;
	}

	public void setLandCertificateNumber(String landCertificateNumber) {
        this.landCertificateNumber = landCertificateNumber;
    }
		
	public String getLandPurpose() {
        return landPurpose;
	}

	public void setLandPurpose(String landPurpose) {
        this.landPurpose = landPurpose;
    }
		
	public Long getBuildingsAndAncillaryBuildingsArea() {
        return buildingsAndAncillaryBuildingsArea;
	}

	public void setBuildingsAndAncillaryBuildingsArea(Long buildingsAndAncillaryBuildingsArea) {
        this.buildingsAndAncillaryBuildingsArea = buildingsAndAncillaryBuildingsArea;
    }
		
	public Long getEvaluateLandValue() {
        return evaluateLandValue;
	}

	public void setEvaluateLandValue(Long evaluateLandValue) {
        this.evaluateLandValue = evaluateLandValue;
    }
		
	public Long getEvaluateAbovegroundBuildingsAndAppurtenancesValue() {
        return evaluateAbovegroundBuildingsAndAppurtenancesValue;
	}

	public void setEvaluateAbovegroundBuildingsAndAppurtenancesValue(Long evaluateAbovegroundBuildingsAndAppurtenancesValue) {
        this.evaluateAbovegroundBuildingsAndAppurtenancesValue = evaluateAbovegroundBuildingsAndAppurtenancesValue;
    }
		
	public Long getCompensateLandValue() {
        return compensateLandValue;
	}

	public void setCompensateLandValue(Long compensateLandValue) {
        this.compensateLandValue = compensateLandValue;
    }
		
	public Long getCompensateAbovegroundBuildingsAndAppurtenancesValue() {
        return compensateAbovegroundBuildingsAndAppurtenancesValue;
	}

	public void setCompensateAbovegroundBuildingsAndAppurtenancesValue(Long compensateAbovegroundBuildingsAndAppurtenancesValue) {
        this.compensateAbovegroundBuildingsAndAppurtenancesValue = compensateAbovegroundBuildingsAndAppurtenancesValue;
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
         * 补偿单位(个人)
         * 集合
         */
        private List<String> compensateCompanyList;
		        /**
         * 收回土地坐落
         * 集合
         */
        private List<String> reclaimedLandLocationList;
		        /**
         * 收回土地面积(平方米)
         * 集合
         */
        private List<Long> reclaimedLandAreaList;
		        /**
         * 土地证号
         * 集合
         */
        private List<String> landCertificateNumberList;
		        /**
         * 土地用途
         * 集合
         */
        private List<String> landPurposeList;
		        /**
         * 建筑物及附属建筑物面积
         * 集合
         */
        private List<Long> buildingsAndAncillaryBuildingsAreaList;
		        /**
         * 评估土地价值
         * 集合
         */
        private List<Long> evaluateLandValueList;
		        /**
         * 评估地上建筑物及附属物价值
         * 集合
         */
        private List<Long> evaluateAbovegroundBuildingsAndAppurtenancesValueList;
		        /**
         * 补偿土地价值
         * 集合
         */
        private List<Long> compensateLandValueList;
		        /**
         * 补偿地上建筑物及附属物价值
         * 集合
         */
        private List<Long> compensateAbovegroundBuildingsAndAppurtenancesValueList;
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
                public List<String> getCompensateCompanyList() {
            return compensateCompanyList;
        }

        public void setCompensateCompanyList(List<String> compensateCompanyList) {
            this.compensateCompanyList = compensateCompanyList;
        }
                public List<String> getReclaimedLandLocationList() {
            return reclaimedLandLocationList;
        }

        public void setReclaimedLandLocationList(List<String> reclaimedLandLocationList) {
            this.reclaimedLandLocationList = reclaimedLandLocationList;
        }
                public List<Long> getReclaimedLandAreaList() {
            return reclaimedLandAreaList;
        }

        public void setReclaimedLandAreaList(List<Long> reclaimedLandAreaList) {
            this.reclaimedLandAreaList = reclaimedLandAreaList;
        }
                public List<String> getLandCertificateNumberList() {
            return landCertificateNumberList;
        }

        public void setLandCertificateNumberList(List<String> landCertificateNumberList) {
            this.landCertificateNumberList = landCertificateNumberList;
        }
                public List<String> getLandPurposeList() {
            return landPurposeList;
        }

        public void setLandPurposeList(List<String> landPurposeList) {
            this.landPurposeList = landPurposeList;
        }
                public List<Long> getBuildingsAndAncillaryBuildingsAreaList() {
            return buildingsAndAncillaryBuildingsAreaList;
        }

        public void setBuildingsAndAncillaryBuildingsAreaList(List<Long> buildingsAndAncillaryBuildingsAreaList) {
            this.buildingsAndAncillaryBuildingsAreaList = buildingsAndAncillaryBuildingsAreaList;
        }
                public List<Long> getEvaluateLandValueList() {
            return evaluateLandValueList;
        }

        public void setEvaluateLandValueList(List<Long> evaluateLandValueList) {
            this.evaluateLandValueList = evaluateLandValueList;
        }
                public List<Long> getEvaluateAbovegroundBuildingsAndAppurtenancesValueList() {
            return evaluateAbovegroundBuildingsAndAppurtenancesValueList;
        }

        public void setEvaluateAbovegroundBuildingsAndAppurtenancesValueList(List<Long> evaluateAbovegroundBuildingsAndAppurtenancesValueList) {
            this.evaluateAbovegroundBuildingsAndAppurtenancesValueList = evaluateAbovegroundBuildingsAndAppurtenancesValueList;
        }
                public List<Long> getCompensateLandValueList() {
            return compensateLandValueList;
        }

        public void setCompensateLandValueList(List<Long> compensateLandValueList) {
            this.compensateLandValueList = compensateLandValueList;
        }
                public List<Long> getCompensateAbovegroundBuildingsAndAppurtenancesValueList() {
            return compensateAbovegroundBuildingsAndAppurtenancesValueList;
        }

        public void setCompensateAbovegroundBuildingsAndAppurtenancesValueList(List<Long> compensateAbovegroundBuildingsAndAppurtenancesValueList) {
            this.compensateAbovegroundBuildingsAndAppurtenancesValueList = compensateAbovegroundBuildingsAndAppurtenancesValueList;
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
