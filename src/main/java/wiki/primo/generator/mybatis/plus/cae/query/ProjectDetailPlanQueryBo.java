package wiki.primo.generator.mybatis.plus.cae.query;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import wiki.primo.generator.mybatis.plus.cae.entity.ProjectDetailPlan;
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
public class ProjectDetailPlanQueryBo{

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
	private Long projectDetailId;


	/**
	 * 构建查询
	 * @return
	 */
	public QueryWrapper<ProjectDetailPlan> buildQuery() {
		QueryWrapper<ProjectDetailPlan> query = new QueryWrapper<>();

		if(id!=null){
			query.eq(ProjectDetailPlan.ID,id);
		}
		if(projectId!=null){
			query.eq(ProjectDetailPlan.PROJECT_ID,projectId);
		}
		if(projectDetailId!=null){
			query.eq(ProjectDetailPlan.PROJECT_DETAIL_ID,projectDetailId);
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
                query.in(ProjectDetailPlan.ID,queryBoExt.getIdList());
            }
                        if(queryBoExt.getProjectIdList()!=null && queryBoExt.getProjectIdList().size()>0){
                query.in(ProjectDetailPlan.PROJECT_ID,queryBoExt.getProjectIdList());
            }
                        if(queryBoExt.getProjectDetailIdList()!=null && queryBoExt.getProjectDetailIdList().size()>0){
                query.in(ProjectDetailPlan.PROJECT_DETAIL_ID,queryBoExt.getProjectDetailIdList());
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
		
	public Long getProjectDetailId() {
        return projectDetailId;
	}

	public void setProjectDetailId(Long projectDetailId) {
        this.projectDetailId = projectDetailId;
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
        private List<Long> projectDetailIdList;
		

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
                public List<Long> getProjectDetailIdList() {
            return projectDetailIdList;
        }

        public void setProjectDetailIdList(List<Long> projectDetailIdList) {
            this.projectDetailIdList = projectDetailIdList;
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
