package wiki.primo.generator.mybatis.plus.cae.query;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import wiki.primo.generator.mybatis.plus.cae.entity.SysRole;
import java.util.List;

											

/**
 * <p>
 * 系统角色表
 * 查询条件类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
public class SysRoleQueryBo{

	private QueryBoExt queryBoExt;

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 所属部门
	 */
	private Long corp;

	/**
	 * 角色名称
	 */
	private String name;

	/**
	 * 状态
	 */
	private Integer status;

	/**
	 * 权限标识符//
	 */
	private String permIdentifier;

	/**
	 * 角色顺序//
	 */
	private Integer roleOrder;

	/**
	 * 备注
	 */
	private String remarks;

	/**
	 * 创建时间
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
	public QueryWrapper<SysRole> buildQuery() {
		QueryWrapper<SysRole> query = new QueryWrapper<>();

		if(id!=null){
			query.eq(SysRole.ID,id);
		}
		if(corp!=null){
			query.eq(SysRole.CORP,corp);
		}
		if(name!=null){
			query.eq(SysRole.NAME,name);
		}
		if(status!=null){
			query.eq(SysRole.STATUS,status);
		}
		if(permIdentifier!=null){
			query.eq(SysRole.PERM_IDENTIFIER,permIdentifier);
		}
		if(roleOrder!=null){
			query.eq(SysRole.ROLE_ORDER,roleOrder);
		}
		if(remarks!=null){
			query.eq(SysRole.REMARKS,remarks);
		}
		if(createTime!=null){
			query.eq(SysRole.CREATE_TIME,createTime);
		}
		if(creator!=null){
			query.eq(SysRole.CREATOR,creator);
		}
		if(updateTime!=null){
			query.eq(SysRole.UPDATE_TIME,updateTime);
		}
		if(updater!=null){
			query.eq(SysRole.UPDATER,updater);
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
                query.in(SysRole.ID,queryBoExt.getIdList());
            }
                        if(queryBoExt.getCorpList()!=null && queryBoExt.getCorpList().size()>0){
                query.in(SysRole.CORP,queryBoExt.getCorpList());
            }
                        if(queryBoExt.getNameList()!=null && queryBoExt.getNameList().size()>0){
                query.in(SysRole.NAME,queryBoExt.getNameList());
            }
                        if(queryBoExt.getStatusList()!=null && queryBoExt.getStatusList().size()>0){
                query.in(SysRole.STATUS,queryBoExt.getStatusList());
            }
                        if(queryBoExt.getPermIdentifierList()!=null && queryBoExt.getPermIdentifierList().size()>0){
                query.in(SysRole.PERM_IDENTIFIER,queryBoExt.getPermIdentifierList());
            }
                        if(queryBoExt.getRoleOrderList()!=null && queryBoExt.getRoleOrderList().size()>0){
                query.in(SysRole.ROLE_ORDER,queryBoExt.getRoleOrderList());
            }
                        if(queryBoExt.getRemarksList()!=null && queryBoExt.getRemarksList().size()>0){
                query.in(SysRole.REMARKS,queryBoExt.getRemarksList());
            }
                        if(queryBoExt.getCreateTimeList()!=null && queryBoExt.getCreateTimeList().size()>0){
                query.in(SysRole.CREATE_TIME,queryBoExt.getCreateTimeList());
            }
                        if(queryBoExt.getCreatorList()!=null && queryBoExt.getCreatorList().size()>0){
                query.in(SysRole.CREATOR,queryBoExt.getCreatorList());
            }
                        if(queryBoExt.getUpdateTimeList()!=null && queryBoExt.getUpdateTimeList().size()>0){
                query.in(SysRole.UPDATE_TIME,queryBoExt.getUpdateTimeList());
            }
                        if(queryBoExt.getUpdaterList()!=null && queryBoExt.getUpdaterList().size()>0){
                query.in(SysRole.UPDATER,queryBoExt.getUpdaterList());
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
		
	public Long getCorp() {
        return corp;
	}

	public void setCorp(Long corp) {
        this.corp = corp;
    }
		
	public String getName() {
        return name;
	}

	public void setName(String name) {
        this.name = name;
    }
		
	public Integer getStatus() {
        return status;
	}

	public void setStatus(Integer status) {
        this.status = status;
    }
		
	public String getPermIdentifier() {
        return permIdentifier;
	}

	public void setPermIdentifier(String permIdentifier) {
        this.permIdentifier = permIdentifier;
    }
		
	public Integer getRoleOrder() {
        return roleOrder;
	}

	public void setRoleOrder(Integer roleOrder) {
        this.roleOrder = roleOrder;
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
         * 所属部门
         * 集合
         */
        private List<Long> corpList;
		        /**
         * 角色名称
         * 集合
         */
        private List<String> nameList;
		        /**
         * 状态
         * 集合
         */
        private List<Integer> statusList;
		        /**
         * 权限标识符//
         * 集合
         */
        private List<String> permIdentifierList;
		        /**
         * 角色顺序//
         * 集合
         */
        private List<Integer> roleOrderList;
		        /**
         * 备注
         * 集合
         */
        private List<String> remarksList;
		        /**
         * 创建时间
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
                public List<Long> getCorpList() {
            return corpList;
        }

        public void setCorpList(List<Long> corpList) {
            this.corpList = corpList;
        }
                public List<String> getNameList() {
            return nameList;
        }

        public void setNameList(List<String> nameList) {
            this.nameList = nameList;
        }
                public List<Integer> getStatusList() {
            return statusList;
        }

        public void setStatusList(List<Integer> statusList) {
            this.statusList = statusList;
        }
                public List<String> getPermIdentifierList() {
            return permIdentifierList;
        }

        public void setPermIdentifierList(List<String> permIdentifierList) {
            this.permIdentifierList = permIdentifierList;
        }
                public List<Integer> getRoleOrderList() {
            return roleOrderList;
        }

        public void setRoleOrderList(List<Integer> roleOrderList) {
            this.roleOrderList = roleOrderList;
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
