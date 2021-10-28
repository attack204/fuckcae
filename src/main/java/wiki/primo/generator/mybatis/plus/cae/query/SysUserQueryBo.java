package wiki.primo.generator.mybatis.plus.cae.query;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import wiki.primo.generator.mybatis.plus.cae.entity.SysUser;
import java.util.List;

												

/**
 * <p>
 * 系统用户表
 * 查询条件类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
public class SysUserQueryBo{

	private QueryBoExt queryBoExt;

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 用户名
	 */
	private String username;

	/**
	 * 所属部门
	 */
	private Long corp;

	/**
	 * 邮箱
	 */
	private String mail;

	/**
	 * 手机号
	 */
	private String phone;

	/**
	 * 性别
	 */
	private Integer sex;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 状态
	 */
	private Integer status;

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
	public QueryWrapper<SysUser> buildQuery() {
		QueryWrapper<SysUser> query = new QueryWrapper<>();

		if(id!=null){
			query.eq(SysUser.ID,id);
		}
		if(username!=null){
			query.eq(SysUser.USERNAME,username);
		}
		if(corp!=null){
			query.eq(SysUser.CORP,corp);
		}
		if(mail!=null){
			query.eq(SysUser.MAIL,mail);
		}
		if(phone!=null){
			query.eq(SysUser.PHONE,phone);
		}
		if(sex!=null){
			query.eq(SysUser.SEX,sex);
		}
		if(password!=null){
			query.eq(SysUser.PASSWORD,password);
		}
		if(status!=null){
			query.eq(SysUser.STATUS,status);
		}
		if(createTime!=null){
			query.eq(SysUser.CREATE_TIME,createTime);
		}
		if(creator!=null){
			query.eq(SysUser.CREATOR,creator);
		}
		if(updateTime!=null){
			query.eq(SysUser.UPDATE_TIME,updateTime);
		}
		if(updater!=null){
			query.eq(SysUser.UPDATER,updater);
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
                query.in(SysUser.ID,queryBoExt.getIdList());
            }
                        if(queryBoExt.getUsernameList()!=null && queryBoExt.getUsernameList().size()>0){
                query.in(SysUser.USERNAME,queryBoExt.getUsernameList());
            }
                        if(queryBoExt.getCorpList()!=null && queryBoExt.getCorpList().size()>0){
                query.in(SysUser.CORP,queryBoExt.getCorpList());
            }
                        if(queryBoExt.getMailList()!=null && queryBoExt.getMailList().size()>0){
                query.in(SysUser.MAIL,queryBoExt.getMailList());
            }
                        if(queryBoExt.getPhoneList()!=null && queryBoExt.getPhoneList().size()>0){
                query.in(SysUser.PHONE,queryBoExt.getPhoneList());
            }
                        if(queryBoExt.getSexList()!=null && queryBoExt.getSexList().size()>0){
                query.in(SysUser.SEX,queryBoExt.getSexList());
            }
                        if(queryBoExt.getPasswordList()!=null && queryBoExt.getPasswordList().size()>0){
                query.in(SysUser.PASSWORD,queryBoExt.getPasswordList());
            }
                        if(queryBoExt.getStatusList()!=null && queryBoExt.getStatusList().size()>0){
                query.in(SysUser.STATUS,queryBoExt.getStatusList());
            }
                        if(queryBoExt.getCreateTimeList()!=null && queryBoExt.getCreateTimeList().size()>0){
                query.in(SysUser.CREATE_TIME,queryBoExt.getCreateTimeList());
            }
                        if(queryBoExt.getCreatorList()!=null && queryBoExt.getCreatorList().size()>0){
                query.in(SysUser.CREATOR,queryBoExt.getCreatorList());
            }
                        if(queryBoExt.getUpdateTimeList()!=null && queryBoExt.getUpdateTimeList().size()>0){
                query.in(SysUser.UPDATE_TIME,queryBoExt.getUpdateTimeList());
            }
                        if(queryBoExt.getUpdaterList()!=null && queryBoExt.getUpdaterList().size()>0){
                query.in(SysUser.UPDATER,queryBoExt.getUpdaterList());
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
		
	public String getUsername() {
        return username;
	}

	public void setUsername(String username) {
        this.username = username;
    }
		
	public Long getCorp() {
        return corp;
	}

	public void setCorp(Long corp) {
        this.corp = corp;
    }
		
	public String getMail() {
        return mail;
	}

	public void setMail(String mail) {
        this.mail = mail;
    }
		
	public String getPhone() {
        return phone;
	}

	public void setPhone(String phone) {
        this.phone = phone;
    }
		
	public Integer getSex() {
        return sex;
	}

	public void setSex(Integer sex) {
        this.sex = sex;
    }
		
	public String getPassword() {
        return password;
	}

	public void setPassword(String password) {
        this.password = password;
    }
		
	public Integer getStatus() {
        return status;
	}

	public void setStatus(Integer status) {
        this.status = status;
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
         * 用户名
         * 集合
         */
        private List<String> usernameList;
		        /**
         * 所属部门
         * 集合
         */
        private List<Long> corpList;
		        /**
         * 邮箱
         * 集合
         */
        private List<String> mailList;
		        /**
         * 手机号
         * 集合
         */
        private List<String> phoneList;
		        /**
         * 性别
         * 集合
         */
        private List<Integer> sexList;
		        /**
         * 密码
         * 集合
         */
        private List<String> passwordList;
		        /**
         * 状态
         * 集合
         */
        private List<Integer> statusList;
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
                public List<String> getUsernameList() {
            return usernameList;
        }

        public void setUsernameList(List<String> usernameList) {
            this.usernameList = usernameList;
        }
                public List<Long> getCorpList() {
            return corpList;
        }

        public void setCorpList(List<Long> corpList) {
            this.corpList = corpList;
        }
                public List<String> getMailList() {
            return mailList;
        }

        public void setMailList(List<String> mailList) {
            this.mailList = mailList;
        }
                public List<String> getPhoneList() {
            return phoneList;
        }

        public void setPhoneList(List<String> phoneList) {
            this.phoneList = phoneList;
        }
                public List<Integer> getSexList() {
            return sexList;
        }

        public void setSexList(List<Integer> sexList) {
            this.sexList = sexList;
        }
                public List<String> getPasswordList() {
            return passwordList;
        }

        public void setPasswordList(List<String> passwordList) {
            this.passwordList = passwordList;
        }
                public List<Integer> getStatusList() {
            return statusList;
        }

        public void setStatusList(List<Integer> statusList) {
            this.statusList = statusList;
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
