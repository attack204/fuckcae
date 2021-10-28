package wiki.primo.generator.mybatis.plus.cae.query;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import wiki.primo.generator.mybatis.plus.cae.entity.DistrictProjectDetailPlan;
import java.util.List;

			

/**
 * <p>
 * 项目详细计划映射表
 * 查询条件类
 * </p>
 *
 * @author attack204
 * @since 2021-10-28 16:08:23
 */
public class DistrictProjectDetailPlanQueryBo{

	private QueryBoExt queryBoExt;

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 项目Id
	 */
	private Long projectId;

	/**
	 * 详细计划Id
	 */
	private Long detailPlanId;


	/**
	 * 构建查询
	 * @return
	 */
	public QueryWrapper<DistrictProjectDetailPlan> buildQuery() {
		QueryWrapper<DistrictProjectDetailPlan> query = new QueryWrapper<>();

		if(id!=null){
			query.eq(DistrictProjectDetailPlan.ID,id);
		}
		if(projectId!=null){
			query.eq(DistrictProjectDetailPlan.PROJECT_ID,projectId);
		}
		if(detailPlanId!=null){
			query.eq(DistrictProjectDetailPlan.DETAIL_PLAN_ID,detailPlanId);
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
                query.in(DistrictProjectDetailPlan.ID,queryBoExt.getIdList());
            }
                        if(queryBoExt.getProjectIdList()!=null && queryBoExt.getProjectIdList().size()>0){
                query.in(DistrictProjectDetailPlan.PROJECT_ID,queryBoExt.getProjectIdList());
            }
                        if(queryBoExt.getDetailPlanIdList()!=null && queryBoExt.getDetailPlanIdList().size()>0){
                query.in(DistrictProjectDetailPlan.DETAIL_PLAN_ID,queryBoExt.getDetailPlanIdList());
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
		
	public Long getProjectId() {
        return projectId;
	}

	public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }
		
	public Long getDetailPlanId() {
        return detailPlanId;
	}

	public void setDetailPlanId(Long detailPlanId) {
        this.detailPlanId = detailPlanId;
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
         * 项目Id
         * 集合
         */
        private List<Long> projectIdList;
		        /**
         * 详细计划Id
         * 集合
         */
        private List<Long> detailPlanIdList;
		

                public List<Long> getIdList() {
            return idList;
        }

        public void setIdList(List<Long> idList) {
            this.idList = idList;
        }
                public List<Long> getProjectIdList() {
            return projectIdList;
        }

        public void setProjectIdList(List<Long> projectIdList) {
            this.projectIdList = projectIdList;
        }
                public List<Long> getDetailPlanIdList() {
            return detailPlanIdList;
        }

        public void setDetailPlanIdList(List<Long> detailPlanIdList) {
            this.detailPlanIdList = detailPlanIdList;
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
