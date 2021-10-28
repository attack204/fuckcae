package wiki.primo.generator.mybatis.plus.cae.query;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import wiki.primo.generator.mybatis.plus.cae.entity.SysUserPosition;
import java.util.List;

			

/**
 * <p>
 * 用户地区表
 * 查询条件类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
public class SysUserPositionQueryBo{

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
	 * 地区Id
	 */
	private Long positionId;


	/**
	 * 构建查询
	 * @return
	 */
	public QueryWrapper<SysUserPosition> buildQuery() {
		QueryWrapper<SysUserPosition> query = new QueryWrapper<>();

		if(id!=null){
			query.eq(SysUserPosition.ID,id);
		}
		if(roleId!=null){
			query.eq(SysUserPosition.ROLE_ID,roleId);
		}
		if(positionId!=null){
			query.eq(SysUserPosition.POSITION_ID,positionId);
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
                query.in(SysUserPosition.ID,queryBoExt.getIdList());
            }
                        if(queryBoExt.getRoleIdList()!=null && queryBoExt.getRoleIdList().size()>0){
                query.in(SysUserPosition.ROLE_ID,queryBoExt.getRoleIdList());
            }
                        if(queryBoExt.getPositionIdList()!=null && queryBoExt.getPositionIdList().size()>0){
                query.in(SysUserPosition.POSITION_ID,queryBoExt.getPositionIdList());
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
		
	public Long getPositionId() {
        return positionId;
	}

	public void setPositionId(Long positionId) {
        this.positionId = positionId;
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
         * 地区Id
         * 集合
         */
        private List<Long> positionIdList;
		

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
                public List<Long> getPositionIdList() {
            return positionIdList;
        }

        public void setPositionIdList(List<Long> positionIdList) {
            this.positionIdList = positionIdList;
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
