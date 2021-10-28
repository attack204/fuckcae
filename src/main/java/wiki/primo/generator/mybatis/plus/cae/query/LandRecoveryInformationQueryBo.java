package wiki.primo.generator.mybatis.plus.cae.query;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import wiki.primo.generator.mybatis.plus.cae.entity.LandRecoveryInformation;
import java.util.List;

																		

/**
 * <p>
 * 土地回收信息
 * 查询条件类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
public class LandRecoveryInformationQueryBo{

	private QueryBoExt queryBoExt;

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 批准机关
	 */
	private String approvalCompany;

	/**
	 * 批准文号
	 */
	private String approvalCertificateNumber;

	/**
	 * 批准时间
	 */
	private Long approvalTime;

	/**
	 * 收回土地范围
	 */
	private Long reclaimedLandPosition;

	/**
	 * 原土地使用者
	 */
	private String originalLandUser;

	/**
	 * 原用途
	 */
	private String originalPurpose;

	/**
	 * 使用权类型
	 */
	private String useRightType;

	/**
	 * 土地证号
	 */
	private String landCertificateNumber;

	/**
	 * 原土地面积
	 */
	private Long originalLandArea;

	/**
	 * 收回土地面积
	 */
	private Long recoveredLandArea;

	/**
	 * 补偿总价格
	 */
	private Long totalCompensationPrice;

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
	public QueryWrapper<LandRecoveryInformation> buildQuery() {
		QueryWrapper<LandRecoveryInformation> query = new QueryWrapper<>();

		if(id!=null){
			query.eq(LandRecoveryInformation.ID,id);
		}
		if(approvalCompany!=null){
			query.eq(LandRecoveryInformation.APPROVAL_COMPANY,approvalCompany);
		}
		if(approvalCertificateNumber!=null){
			query.eq(LandRecoveryInformation.APPROVAL_CERTIFICATE_NUMBER,approvalCertificateNumber);
		}
		if(approvalTime!=null){
			query.eq(LandRecoveryInformation.APPROVAL_TIME,approvalTime);
		}
		if(reclaimedLandPosition!=null){
			query.eq(LandRecoveryInformation.RECLAIMED_LAND_POSITION,reclaimedLandPosition);
		}
		if(originalLandUser!=null){
			query.eq(LandRecoveryInformation.ORIGINAL_LAND_USER,originalLandUser);
		}
		if(originalPurpose!=null){
			query.eq(LandRecoveryInformation.ORIGINAL_PURPOSE,originalPurpose);
		}
		if(useRightType!=null){
			query.eq(LandRecoveryInformation.USE_RIGHT_TYPE,useRightType);
		}
		if(landCertificateNumber!=null){
			query.eq(LandRecoveryInformation.LAND_CERTIFICATE_NUMBER,landCertificateNumber);
		}
		if(originalLandArea!=null){
			query.eq(LandRecoveryInformation.ORIGINAL_LAND_AREA,originalLandArea);
		}
		if(recoveredLandArea!=null){
			query.eq(LandRecoveryInformation.RECOVERED_LAND_AREA,recoveredLandArea);
		}
		if(totalCompensationPrice!=null){
			query.eq(LandRecoveryInformation.TOTAL_COMPENSATION_PRICE,totalCompensationPrice);
		}
		if(remarks!=null){
			query.eq(LandRecoveryInformation.REMARKS,remarks);
		}
		if(createTime!=null){
			query.eq(LandRecoveryInformation.CREATE_TIME,createTime);
		}
		if(creator!=null){
			query.eq(LandRecoveryInformation.CREATOR,creator);
		}
		if(updateTime!=null){
			query.eq(LandRecoveryInformation.UPDATE_TIME,updateTime);
		}
		if(updater!=null){
			query.eq(LandRecoveryInformation.UPDATER,updater);
		}
		if(dataLocation!=null){
			query.eq(LandRecoveryInformation.DATA_LOCATION,dataLocation);
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
                query.in(LandRecoveryInformation.ID,queryBoExt.getIdList());
            }
                        if(queryBoExt.getApprovalCompanyList()!=null && queryBoExt.getApprovalCompanyList().size()>0){
                query.in(LandRecoveryInformation.APPROVAL_COMPANY,queryBoExt.getApprovalCompanyList());
            }
                        if(queryBoExt.getApprovalCertificateNumberList()!=null && queryBoExt.getApprovalCertificateNumberList().size()>0){
                query.in(LandRecoveryInformation.APPROVAL_CERTIFICATE_NUMBER,queryBoExt.getApprovalCertificateNumberList());
            }
                        if(queryBoExt.getApprovalTimeList()!=null && queryBoExt.getApprovalTimeList().size()>0){
                query.in(LandRecoveryInformation.APPROVAL_TIME,queryBoExt.getApprovalTimeList());
            }
                        if(queryBoExt.getReclaimedLandPositionList()!=null && queryBoExt.getReclaimedLandPositionList().size()>0){
                query.in(LandRecoveryInformation.RECLAIMED_LAND_POSITION,queryBoExt.getReclaimedLandPositionList());
            }
                        if(queryBoExt.getOriginalLandUserList()!=null && queryBoExt.getOriginalLandUserList().size()>0){
                query.in(LandRecoveryInformation.ORIGINAL_LAND_USER,queryBoExt.getOriginalLandUserList());
            }
                        if(queryBoExt.getOriginalPurposeList()!=null && queryBoExt.getOriginalPurposeList().size()>0){
                query.in(LandRecoveryInformation.ORIGINAL_PURPOSE,queryBoExt.getOriginalPurposeList());
            }
                        if(queryBoExt.getUseRightTypeList()!=null && queryBoExt.getUseRightTypeList().size()>0){
                query.in(LandRecoveryInformation.USE_RIGHT_TYPE,queryBoExt.getUseRightTypeList());
            }
                        if(queryBoExt.getLandCertificateNumberList()!=null && queryBoExt.getLandCertificateNumberList().size()>0){
                query.in(LandRecoveryInformation.LAND_CERTIFICATE_NUMBER,queryBoExt.getLandCertificateNumberList());
            }
                        if(queryBoExt.getOriginalLandAreaList()!=null && queryBoExt.getOriginalLandAreaList().size()>0){
                query.in(LandRecoveryInformation.ORIGINAL_LAND_AREA,queryBoExt.getOriginalLandAreaList());
            }
                        if(queryBoExt.getRecoveredLandAreaList()!=null && queryBoExt.getRecoveredLandAreaList().size()>0){
                query.in(LandRecoveryInformation.RECOVERED_LAND_AREA,queryBoExt.getRecoveredLandAreaList());
            }
                        if(queryBoExt.getTotalCompensationPriceList()!=null && queryBoExt.getTotalCompensationPriceList().size()>0){
                query.in(LandRecoveryInformation.TOTAL_COMPENSATION_PRICE,queryBoExt.getTotalCompensationPriceList());
            }
                        if(queryBoExt.getRemarksList()!=null && queryBoExt.getRemarksList().size()>0){
                query.in(LandRecoveryInformation.REMARKS,queryBoExt.getRemarksList());
            }
                        if(queryBoExt.getCreateTimeList()!=null && queryBoExt.getCreateTimeList().size()>0){
                query.in(LandRecoveryInformation.CREATE_TIME,queryBoExt.getCreateTimeList());
            }
                        if(queryBoExt.getCreatorList()!=null && queryBoExt.getCreatorList().size()>0){
                query.in(LandRecoveryInformation.CREATOR,queryBoExt.getCreatorList());
            }
                        if(queryBoExt.getUpdateTimeList()!=null && queryBoExt.getUpdateTimeList().size()>0){
                query.in(LandRecoveryInformation.UPDATE_TIME,queryBoExt.getUpdateTimeList());
            }
                        if(queryBoExt.getUpdaterList()!=null && queryBoExt.getUpdaterList().size()>0){
                query.in(LandRecoveryInformation.UPDATER,queryBoExt.getUpdaterList());
            }
                        if(queryBoExt.getDataLocationList()!=null && queryBoExt.getDataLocationList().size()>0){
                query.in(LandRecoveryInformation.DATA_LOCATION,queryBoExt.getDataLocationList());
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
		
	public String getApprovalCompany() {
        return approvalCompany;
	}

	public void setApprovalCompany(String approvalCompany) {
        this.approvalCompany = approvalCompany;
    }
		
	public String getApprovalCertificateNumber() {
        return approvalCertificateNumber;
	}

	public void setApprovalCertificateNumber(String approvalCertificateNumber) {
        this.approvalCertificateNumber = approvalCertificateNumber;
    }
		
	public Long getApprovalTime() {
        return approvalTime;
	}

	public void setApprovalTime(Long approvalTime) {
        this.approvalTime = approvalTime;
    }
		
	public Long getReclaimedLandPosition() {
        return reclaimedLandPosition;
	}

	public void setReclaimedLandPosition(Long reclaimedLandPosition) {
        this.reclaimedLandPosition = reclaimedLandPosition;
    }
		
	public String getOriginalLandUser() {
        return originalLandUser;
	}

	public void setOriginalLandUser(String originalLandUser) {
        this.originalLandUser = originalLandUser;
    }
		
	public String getOriginalPurpose() {
        return originalPurpose;
	}

	public void setOriginalPurpose(String originalPurpose) {
        this.originalPurpose = originalPurpose;
    }
		
	public String getUseRightType() {
        return useRightType;
	}

	public void setUseRightType(String useRightType) {
        this.useRightType = useRightType;
    }
		
	public String getLandCertificateNumber() {
        return landCertificateNumber;
	}

	public void setLandCertificateNumber(String landCertificateNumber) {
        this.landCertificateNumber = landCertificateNumber;
    }
		
	public Long getOriginalLandArea() {
        return originalLandArea;
	}

	public void setOriginalLandArea(Long originalLandArea) {
        this.originalLandArea = originalLandArea;
    }
		
	public Long getRecoveredLandArea() {
        return recoveredLandArea;
	}

	public void setRecoveredLandArea(Long recoveredLandArea) {
        this.recoveredLandArea = recoveredLandArea;
    }
		
	public Long getTotalCompensationPrice() {
        return totalCompensationPrice;
	}

	public void setTotalCompensationPrice(Long totalCompensationPrice) {
        this.totalCompensationPrice = totalCompensationPrice;
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
         * 批准机关
         * 集合
         */
        private List<String> approvalCompanyList;
		        /**
         * 批准文号
         * 集合
         */
        private List<String> approvalCertificateNumberList;
		        /**
         * 批准时间
         * 集合
         */
        private List<Long> approvalTimeList;
		        /**
         * 收回土地范围
         * 集合
         */
        private List<Long> reclaimedLandPositionList;
		        /**
         * 原土地使用者
         * 集合
         */
        private List<String> originalLandUserList;
		        /**
         * 原用途
         * 集合
         */
        private List<String> originalPurposeList;
		        /**
         * 使用权类型
         * 集合
         */
        private List<String> useRightTypeList;
		        /**
         * 土地证号
         * 集合
         */
        private List<String> landCertificateNumberList;
		        /**
         * 原土地面积
         * 集合
         */
        private List<Long> originalLandAreaList;
		        /**
         * 收回土地面积
         * 集合
         */
        private List<Long> recoveredLandAreaList;
		        /**
         * 补偿总价格
         * 集合
         */
        private List<Long> totalCompensationPriceList;
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
                public List<String> getApprovalCompanyList() {
            return approvalCompanyList;
        }

        public void setApprovalCompanyList(List<String> approvalCompanyList) {
            this.approvalCompanyList = approvalCompanyList;
        }
                public List<String> getApprovalCertificateNumberList() {
            return approvalCertificateNumberList;
        }

        public void setApprovalCertificateNumberList(List<String> approvalCertificateNumberList) {
            this.approvalCertificateNumberList = approvalCertificateNumberList;
        }
                public List<Long> getApprovalTimeList() {
            return approvalTimeList;
        }

        public void setApprovalTimeList(List<Long> approvalTimeList) {
            this.approvalTimeList = approvalTimeList;
        }
                public List<Long> getReclaimedLandPositionList() {
            return reclaimedLandPositionList;
        }

        public void setReclaimedLandPositionList(List<Long> reclaimedLandPositionList) {
            this.reclaimedLandPositionList = reclaimedLandPositionList;
        }
                public List<String> getOriginalLandUserList() {
            return originalLandUserList;
        }

        public void setOriginalLandUserList(List<String> originalLandUserList) {
            this.originalLandUserList = originalLandUserList;
        }
                public List<String> getOriginalPurposeList() {
            return originalPurposeList;
        }

        public void setOriginalPurposeList(List<String> originalPurposeList) {
            this.originalPurposeList = originalPurposeList;
        }
                public List<String> getUseRightTypeList() {
            return useRightTypeList;
        }

        public void setUseRightTypeList(List<String> useRightTypeList) {
            this.useRightTypeList = useRightTypeList;
        }
                public List<String> getLandCertificateNumberList() {
            return landCertificateNumberList;
        }

        public void setLandCertificateNumberList(List<String> landCertificateNumberList) {
            this.landCertificateNumberList = landCertificateNumberList;
        }
                public List<Long> getOriginalLandAreaList() {
            return originalLandAreaList;
        }

        public void setOriginalLandAreaList(List<Long> originalLandAreaList) {
            this.originalLandAreaList = originalLandAreaList;
        }
                public List<Long> getRecoveredLandAreaList() {
            return recoveredLandAreaList;
        }

        public void setRecoveredLandAreaList(List<Long> recoveredLandAreaList) {
            this.recoveredLandAreaList = recoveredLandAreaList;
        }
                public List<Long> getTotalCompensationPriceList() {
            return totalCompensationPriceList;
        }

        public void setTotalCompensationPriceList(List<Long> totalCompensationPriceList) {
            this.totalCompensationPriceList = totalCompensationPriceList;
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
