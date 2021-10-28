package wiki.primo.generator.mybatis.plus.cae.query;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import wiki.primo.generator.mybatis.plus.cae.entity.SysPerm;
import java.util.List;

								

/**
 * <p>
 * 系统权限表
 * 查询条件类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
public class SysPermQueryBo{

	private QueryBoExt queryBoExt;

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 父权限Id
	 */
	private Long pid;

	/**
	 * 权限编码
	 */
	private String code;

	/**
	 * 权限名称
	 */
	private String name;

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
	public QueryWrapper<SysPerm> buildQuery() {
		QueryWrapper<SysPerm> query = new QueryWrapper<>();

		if(id!=null){
			query.eq(SysPerm.ID,id);
		}
		if(pid!=null){
			query.eq(SysPerm.PID,pid);
		}
		if(code!=null){
			query.eq(SysPerm.CODE,code);
		}
		if(name!=null){
			query.eq(SysPerm.NAME,name);
		}
		if(createTime!=null){
			query.eq(SysPerm.CREATE_TIME,createTime);
		}
		if(creator!=null){
			query.eq(SysPerm.CREATOR,creator);
		}
		if(updateTime!=null){
			query.eq(SysPerm.UPDATE_TIME,updateTime);
		}
		if(updater!=null){
			query.eq(SysPerm.UPDATER,updater);
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
                query.in(SysPerm.ID,queryBoExt.getIdList());
            }
                        if(queryBoExt.getPidList()!=null && queryBoExt.getPidList().size()>0){
                query.in(SysPerm.PID,queryBoExt.getPidList());
            }
                        if(queryBoExt.getCodeList()!=null && queryBoExt.getCodeList().size()>0){
                query.in(SysPerm.CODE,queryBoExt.getCodeList());
            }
                        if(queryBoExt.getNameList()!=null && queryBoExt.getNameList().size()>0){
                query.in(SysPerm.NAME,queryBoExt.getNameList());
            }
                        if(queryBoExt.getCreateTimeList()!=null && queryBoExt.getCreateTimeList().size()>0){
                query.in(SysPerm.CREATE_TIME,queryBoExt.getCreateTimeList());
            }
                        if(queryBoExt.getCreatorList()!=null && queryBoExt.getCreatorList().size()>0){
                query.in(SysPerm.CREATOR,queryBoExt.getCreatorList());
            }
                        if(queryBoExt.getUpdateTimeList()!=null && queryBoExt.getUpdateTimeList().size()>0){
                query.in(SysPerm.UPDATE_TIME,queryBoExt.getUpdateTimeList());
            }
                        if(queryBoExt.getUpdaterList()!=null && queryBoExt.getUpdaterList().size()>0){
                query.in(SysPerm.UPDATER,queryBoExt.getUpdaterList());
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
		
	public Long getPid() {
        return pid;
	}

	public void setPid(Long pid) {
        this.pid = pid;
    }
		
	public String getCode() {
        return code;
	}

	public void setCode(String code) {
        this.code = code;
    }
		
	public String getName() {
        return name;
	}

	public void setName(String name) {
        this.name = name;
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
         * 父权限Id
         * 集合
         */
        private List<Long> pidList;
		        /**
         * 权限编码
         * 集合
         */
        private List<String> codeList;
		        /**
         * 权限名称
         * 集合
         */
        private List<String> nameList;
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
                public List<Long> getPidList() {
            return pidList;
        }

        public void setPidList(List<Long> pidList) {
            this.pidList = pidList;
        }
                public List<String> getCodeList() {
            return codeList;
        }

        public void setCodeList(List<String> codeList) {
            this.codeList = codeList;
        }
                public List<String> getNameList() {
            return nameList;
        }

        public void setNameList(List<String> nameList) {
            this.nameList = nameList;
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
