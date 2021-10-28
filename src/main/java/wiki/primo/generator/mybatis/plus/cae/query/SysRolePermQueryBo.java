package wiki.primo.generator.mybatis.plus.cae.query;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import wiki.primo.generator.mybatis.plus.cae.entity.SysRolePerm;
import java.util.List;

			

/**
 * <p>
 * 角色权限表
 * 查询条件类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
public class SysRolePermQueryBo{

	private QueryBoExt queryBoExt;

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 角色Id
	 */
	private Long roleId;

	/**
	 * 权限Id
	 */
	private Long permId;


	/**
	 * 构建查询
	 * @return
	 */
	public QueryWrapper<SysRolePerm> buildQuery() {
		QueryWrapper<SysRolePerm> query = new QueryWrapper<>();

		if(id!=null){
			query.eq(SysRolePerm.ID,id);
		}
		if(roleId!=null){
			query.eq(SysRolePerm.ROLE_ID,roleId);
		}
		if(permId!=null){
			query.eq(SysRolePerm.PERM_ID,permId);
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
                query.in(SysRolePerm.ID,queryBoExt.getIdList());
            }
                        if(queryBoExt.getRoleIdList()!=null && queryBoExt.getRoleIdList().size()>0){
                query.in(SysRolePerm.ROLE_ID,queryBoExt.getRoleIdList());
            }
                        if(queryBoExt.getPermIdList()!=null && queryBoExt.getPermIdList().size()>0){
                query.in(SysRolePerm.PERM_ID,queryBoExt.getPermIdList());
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
		
	public Long getRoleId() {
        return roleId;
	}

	public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
		
	public Long getPermId() {
        return permId;
	}

	public void setPermId(Long permId) {
        this.permId = permId;
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
         * 角色Id
         * 集合
         */
        private List<Long> roleIdList;
		        /**
         * 权限Id
         * 集合
         */
        private List<Long> permIdList;
		

                public List<Long> getIdList() {
            return idList;
        }

        public void setIdList(List<Long> idList) {
            this.idList = idList;
        }
                public List<Long> getRoleIdList() {
            return roleIdList;
        }

        public void setRoleIdList(List<Long> roleIdList) {
            this.roleIdList = roleIdList;
        }
                public List<Long> getPermIdList() {
            return permIdList;
        }

        public void setPermIdList(List<Long> permIdList) {
            this.permIdList = permIdList;
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
