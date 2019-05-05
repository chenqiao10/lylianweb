package com.yijie.data.client.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yijie.data.client.dao.ProjectDesignMapper;
import com.yijie.data.client.dao.ProjectsMapper;
import com.yijie.data.client.model.ProjectDesign;
import com.yijie.data.client.model.Projects;
import com.yijie.data.client.service.ProjectService;
@Service
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	private ProjectsMapper projectsMapper;
	
	@Autowired
	private ProjectDesignMapper projectDesignMapper;

	
	@Override
	public Projects projectMessage(Projects pro) {
		try {
			List<Projects> list = projectsMapper.projectSelect(pro);
			if(list.size() == 0){
				return null;
			}else{
				return list.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Projects> projectTable(Projects pro) {
		try {
			List<Projects> list = projectsMapper.projectSelect(pro);
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Integer projectBuild(Projects pro) {
		try {
			projectsMapper.projectInsert(pro);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Integer projectDelete(Projects pro) {
		try {
			projectsMapper.projectDelete(pro);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Integer projectUpdate(Projects pro) {
		try {
			projectsMapper.projectUpdate(pro);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Integer projectDesignAdd(List<ProjectDesign> projectDesigns) {
		try {
			for(ProjectDesign projectDesign : projectDesigns){
				projectDesignMapper.projectDesignInsert(projectDesign);
			}
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Integer projectDesignUpdate(List<ProjectDesign> projectDesigns) {
		try {
			for(ProjectDesign projectDesign : projectDesigns){
				projectDesignMapper.projectDesignUpdate(projectDesign);
			}
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Integer projectDesignDelete(ProjectDesign projectDesign) {
		try {
			projectDesignMapper.projectDesignDelete(projectDesign);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Integer projectCount(Projects projects) {
		// TODO 自动生成的方法存根
		return projectsMapper.projectCount(projects);
	}

}
