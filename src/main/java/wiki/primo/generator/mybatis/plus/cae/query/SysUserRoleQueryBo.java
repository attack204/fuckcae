package wiki.primo.generator.mybatis.plus.cae.query;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import wiki.primo.generator.mybatis.plus.cae.entity.SysUserRole;
import java.util.List;

			

/**
 * <p>
 * 用户角色表
 * 查询条件类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
public class SysUserRoleQueryBo{

	private QueryBoExt queryBoExt;

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 用户Id
	 */
	private Long userId;

	/**
	 * 角色Id
	 */
	private Long roleId;


	/**
	 * 构建查询
	 * @return
	 */
	public QueryWrapper<SysUserRole> buildQuery() {
		QueryWrapper<SysUserRole> query = new QueryWrapper<>();

		if(id!=null){
			query.eq(SysUserRole.ID,id);
		}
		if(userId!=null){
			query.eq(SysUserRole.USER_ID,userId);
		}
		if(roleId!=null){
			query.eq(SysUserRole.ROLE_ID,roleId);
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
                query.in(SysUserRole.ID,queryBoExt.getIdList());
            }
                        if(queryBoExt.getUserIdList()!=null && queryBoExt.getUserIdList().size()>0){
                query.in(SysUserRole.USER_ID,queryBoExt.getUserIdList());
            }
                        if(queryBoExt.getRoleIdList()!=null && queryBoExt.getRoleIdList().size()>0){
                query.in(SysUserRole.ROLE_ID,queryBoExt.getRoleIdList());
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
		
	public Long getUserId() {
        return userId;
	}

	public void setUserId(Long userId) {
        this.userId = userId;
    }
		
	public Long getRoleId() {
        return roleId;
	}

	public void setRoleId(Long roleId) {
        this.roleId = roleId;
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
         * 用户Id
         * 集合
         */
        private List<Long> userIdList;
		        /**
         * 角色Id
         * 集合
         */
        private List<Long> roleIdList;
		

                public List<Long> getIdList() {
            return idList;
        }

        public void setIdList(List<Long> idList) {
            this.idList = idList;
        }
                public List<Long> getUserIdList() {
            return userIdList;
        }

        public void setUserIdList(List<Long> userIdList) {
            this.userIdList = userIdList;
        }
                public List<Long> getRoleIdList() {
            return roleIdList;
        }

        public void setRoleIdList(List<Long> roleIdList) {
            this.roleIdList = roleIdList;
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
