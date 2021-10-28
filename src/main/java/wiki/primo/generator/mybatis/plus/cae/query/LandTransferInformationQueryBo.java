package wiki.primo.generator.mybatis.plus.cae.query;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import wiki.primo.generator.mybatis.plus.cae.entity.LandTransferInformation;
import java.util.List;

																		

/**
 * <p>
 * 土地转让信息
 * 查询条件类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
public class LandTransferInformationQueryBo{

	private QueryBoExt queryBoExt;

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 转让方
	 */
	private String transferCompanyName;

	/**
	 * 住址
	 */
	private String companyPosition;

	/**
	 * 转让方联系电话
	 */
	private String transferPhone;

	/**
	 * 
	 */
	private String assigneeCompanyName;

	/**
	 * 受让方联系电话
	 */
	private String assigneePhone;

	/**
	 * 土地位置
	 */
	private String landPosition;

	/**
	 * 土地面积
	 */
	private String landArea;

	/**
	 * 证书号码
	 */
	private String certificateNumber;

	/**
	 * 土地用途
	 */
	private String landPurpose;

	/**
	 * 转让时间
	 */
	private Long dealTime;

	/**
	 * 金钱
	 */
	private Long dealMoney;

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
	public QueryWrapper<LandTransferInformation> buildQuery() {
		QueryWrapper<LandTransferInformation> query = new QueryWrapper<>();

		if(id!=null){
			query.eq(LandTransferInformation.ID,id);
		}
		if(transferCompanyName!=null){
			query.eq(LandTransferInformation.TRANSFER_COMPANY_NAME,transferCompanyName);
		}
		if(companyPosition!=null){
			query.eq(LandTransferInformation.COMPANY_POSITION,companyPosition);
		}
		if(transferPhone!=null){
			query.eq(LandTransferInformation.TRANSFER_PHONE,transferPhone);
		}
		if(assigneeCompanyName!=null){
			query.eq(LandTransferInformation.ASSIGNEE_COMPANY_NAME,assigneeCompanyName);
		}
		if(assigneePhone!=null){
			query.eq(LandTransferInformation.ASSIGNEE_PHONE,assigneePhone);
		}
		if(landPosition!=null){
			query.eq(LandTransferInformation.LAND_POSITION,landPosition);
		}
		if(landArea!=null){
			query.eq(LandTransferInformation.LAND_AREA,landArea);
		}
		if(certificateNumber!=null){
			query.eq(LandTransferInformation.CERTIFICATE_NUMBER,certificateNumber);
		}
		if(landPurpose!=null){
			query.eq(LandTransferInformation.LAND_PURPOSE,landPurpose);
		}
		if(dealTime!=null){
			query.eq(LandTransferInformation.DEAL_TIME,dealTime);
		}
		if(dealMoney!=null){
			query.eq(LandTransferInformation.DEAL_MONEY,dealMoney);
		}
		if(remarks!=null){
			query.eq(LandTransferInformation.REMARKS,remarks);
		}
		if(createTime!=null){
			query.eq(LandTransferInformation.CREATE_TIME,createTime);
		}
		if(creator!=null){
			query.eq(LandTransferInformation.CREATOR,creator);
		}
		if(updateTime!=null){
			query.eq(LandTransferInformation.UPDATE_TIME,updateTime);
		}
		if(updater!=null){
			query.eq(LandTransferInformation.UPDATER,updater);
		}
		if(dataLocation!=null){
			query.eq(LandTransferInformation.DATA_LOCATION,dataLocation);
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
                query.in(LandTransferInformation.ID,queryBoExt.getIdList());
            }
                        if(queryBoExt.getTransferCompanyNameList()!=null && queryBoExt.getTransferCompanyNameList().size()>0){
                query.in(LandTransferInformation.TRANSFER_COMPANY_NAME,queryBoExt.getTransferCompanyNameList());
            }
                        if(queryBoExt.getCompanyPositionList()!=null && queryBoExt.getCompanyPositionList().size()>0){
                query.in(LandTransferInformation.COMPANY_POSITION,queryBoExt.getCompanyPositionList());
            }
                        if(queryBoExt.getTransferPhoneList()!=null && queryBoExt.getTransferPhoneList().size()>0){
                query.in(LandTransferInformation.TRANSFER_PHONE,queryBoExt.getTransferPhoneList());
            }
                        if(queryBoExt.getAssigneeCompanyNameList()!=null && queryBoExt.getAssigneeCompanyNameList().size()>0){
                query.in(LandTransferInformation.ASSIGNEE_COMPANY_NAME,queryBoExt.getAssigneeCompanyNameList());
            }
                        if(queryBoExt.getAssigneePhoneList()!=null && queryBoExt.getAssigneePhoneList().size()>0){
                query.in(LandTransferInformation.ASSIGNEE_PHONE,queryBoExt.getAssigneePhoneList());
            }
                        if(queryBoExt.getLandPositionList()!=null && queryBoExt.getLandPositionList().size()>0){
                query.in(LandTransferInformation.LAND_POSITION,queryBoExt.getLandPositionList());
            }
                        if(queryBoExt.getLandAreaList()!=null && queryBoExt.getLandAreaList().size()>0){
                query.in(LandTransferInformation.LAND_AREA,queryBoExt.getLandAreaList());
            }
                        if(queryBoExt.getCertificateNumberList()!=null && queryBoExt.getCertificateNumberList().size()>0){
                query.in(LandTransferInformation.CERTIFICATE_NUMBER,queryBoExt.getCertificateNumberList());
            }
                        if(queryBoExt.getLandPurposeList()!=null && queryBoExt.getLandPurposeList().size()>0){
                query.in(LandTransferInformation.LAND_PURPOSE,queryBoExt.getLandPurposeList());
            }
                        if(queryBoExt.getDealTimeList()!=null && queryBoExt.getDealTimeList().size()>0){
                query.in(LandTransferInformation.DEAL_TIME,queryBoExt.getDealTimeList());
            }
                        if(queryBoExt.getDealMoneyList()!=null && queryBoExt.getDealMoneyList().size()>0){
                query.in(LandTransferInformation.DEAL_MONEY,queryBoExt.getDealMoneyList());
            }
                        if(queryBoExt.getRemarksList()!=null && queryBoExt.getRemarksList().size()>0){
                query.in(LandTransferInformation.REMARKS,queryBoExt.getRemarksList());
            }
                        if(queryBoExt.getCreateTimeList()!=null && queryBoExt.getCreateTimeList().size()>0){
                query.in(LandTransferInformation.CREATE_TIME,queryBoExt.getCreateTimeList());
            }
                        if(queryBoExt.getCreatorList()!=null && queryBoExt.getCreatorList().size()>0){
                query.in(LandTransferInformation.CREATOR,queryBoExt.getCreatorList());
            }
                        if(queryBoExt.getUpdateTimeList()!=null && queryBoExt.getUpdateTimeList().size()>0){
                query.in(LandTransferInformation.UPDATE_TIME,queryBoExt.getUpdateTimeList());
            }
                        if(queryBoExt.getUpdaterList()!=null && queryBoExt.getUpdaterList().size()>0){
                query.in(LandTransferInformation.UPDATER,queryBoExt.getUpdaterList());
            }
                        if(queryBoExt.getDataLocationList()!=null && queryBoExt.getDataLocationList().size()>0){
                query.in(LandTransferInformation.DATA_LOCATION,queryBoExt.getDataLocationList());
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
		
	public String getTransferCompanyName() {
        return transferCompanyName;
	}

	public void setTransferCompanyName(String transferCompanyName) {
        this.transferCompanyName = transferCompanyName;
    }
		
	public String getCompanyPosition() {
        return companyPosition;
	}

	public void setCompanyPosition(String companyPosition) {
        this.companyPosition = companyPosition;
    }
		
	public String getTransferPhone() {
        return transferPhone;
	}

	public void setTransferPhone(String transferPhone) {
        this.transferPhone = transferPhone;
    }
		
	public String getAssigneeCompanyName() {
        return assigneeCompanyName;
	}

	public void setAssigneeCompanyName(String assigneeCompanyName) {
        this.assigneeCompanyName = assigneeCompanyName;
    }
		
	public String getAssigneePhone() {
        return assigneePhone;
	}

	public void setAssigneePhone(String assigneePhone) {
        this.assigneePhone = assigneePhone;
    }
		
	public String getLandPosition() {
        return landPosition;
	}

	public void setLandPosition(String landPosition) {
        this.landPosition = landPosition;
    }
		
	public String getLandArea() {
        return landArea;
	}

	public void setLandArea(String landArea) {
        this.landArea = landArea;
    }
		
	public String getCertificateNumber() {
        return certificateNumber;
	}

	public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }
		
	public String getLandPurpose() {
        return landPurpose;
	}

	public void setLandPurpose(String landPurpose) {
        this.landPurpose = landPurpose;
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
         * 转让方
         * 集合
         */
        private List<String> transferCompanyNameList;
		        /**
         * 住址
         * 集合
         */
        private List<String> companyPositionList;
		        /**
         * 转让方联系电话
         * 集合
         */
        private List<String> transferPhoneList;
		        /**
         * 
         * 集合
         */
        private List<String> assigneeCompanyNameList;
		        /**
         * 受让方联系电话
         * 集合
         */
        private List<String> assigneePhoneList;
		        /**
         * 土地位置
         * 集合
         */
        private List<String> landPositionList;
		        /**
         * 土地面积
         * 集合
         */
        private List<String> landAreaList;
		        /**
         * 证书号码
         * 集合
         */
        private List<String> certificateNumberList;
		        /**
         * 土地用途
         * 集合
         */
        private List<String> landPurposeList;
		        /**
         * 转让时间
         * 集合
         */
        private List<Long> dealTimeList;
		        /**
         * 金钱
         * 集合
         */
        private List<Long> dealMoneyList;
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
                public List<String> getTransferCompanyNameList() {
            return transferCompanyNameList;
        }

        public void setTransferCompanyNameList(List<String> transferCompanyNameList) {
            this.transferCompanyNameList = transferCompanyNameList;
        }
                public List<String> getCompanyPositionList() {
            return companyPositionList;
        }

        public void setCompanyPositionList(List<String> companyPositionList) {
            this.companyPositionList = companyPositionList;
        }
                public List<String> getTransferPhoneList() {
            return transferPhoneList;
        }

        public void setTransferPhoneList(List<String> transferPhoneList) {
            this.transferPhoneList = transferPhoneList;
        }
                public List<String> getAssigneeCompanyNameList() {
            return assigneeCompanyNameList;
        }

        public void setAssigneeCompanyNameList(List<String> assigneeCompanyNameList) {
            this.assigneeCompanyNameList = assigneeCompanyNameList;
        }
                public List<String> getAssigneePhoneList() {
            return assigneePhoneList;
        }

        public void setAssigneePhoneList(List<String> assigneePhoneList) {
            this.assigneePhoneList = assigneePhoneList;
        }
                public List<String> getLandPositionList() {
            return landPositionList;
        }

        public void setLandPositionList(List<String> landPositionList) {
            this.landPositionList = landPositionList;
        }
                public List<String> getLandAreaList() {
            return landAreaList;
        }

        public void setLandAreaList(List<String> landAreaList) {
            this.landAreaList = landAreaList;
        }
                public List<String> getCertificateNumberList() {
            return certificateNumberList;
        }

        public void setCertificateNumberList(List<String> certificateNumberList) {
            this.certificateNumberList = certificateNumberList;
        }
                public List<String> getLandPurposeList() {
            return landPurposeList;
        }

        public void setLandPurposeList(List<String> landPurposeList) {
            this.landPurposeList = landPurposeList;
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
