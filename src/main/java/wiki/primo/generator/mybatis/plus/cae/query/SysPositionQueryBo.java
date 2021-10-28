package wiki.primo.generator.mybatis.plus.cae.query;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import wiki.primo.generator.mybatis.plus.cae.entity.SysPosition;
import java.util.List;

		

/**
 * <p>
 * 地区表(记录用户所在地区，比如经区、高区)
 * 查询条件类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
public class SysPositionQueryBo{

	private QueryBoExt queryBoExt;

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 地区名称
	 */
	private String positionName;


	/**
	 * 构建查询
	 * @return
	 */
	public QueryWrapper<SysPosition> buildQuery() {
		QueryWrapper<SysPosition> query = new QueryWrapper<>();

		if(id!=null){
			query.eq(SysPosition.ID,id);
		}
		if(positionName!=null){
			query.eq(SysPosition.POSITION_NAME,positionName);
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
                query.in(SysPosition.ID,queryBoExt.getIdList());
            }
                        if(queryBoExt.getPositionNameList()!=null && queryBoExt.getPositionNameList().size()>0){
                query.in(SysPosition.POSITION_NAME,queryBoExt.getPositionNameList());
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
		
	public String getPositionName() {
        return positionName;
	}

	public void setPositionName(String positionName) {
        this.positionName = positionName;
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
         * 地区名称
         * 集合
         */
        private List<String> positionNameList;
		

                public List<Long> getIdList() {
            return idList;
        }

        public void setIdList(List<Long> idList) {
            this.idList = idList;
        }
                public List<String> getPositionNameList() {
            return positionNameList;
        }

        public void setPositionNameList(List<String> positionNameList) {
            this.positionNameList = positionNameList;
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
