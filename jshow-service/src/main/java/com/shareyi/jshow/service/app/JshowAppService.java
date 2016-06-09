package com.shareyi.jshow.service.app;

import java.util.List;
import com.shareyi.jshow.common.PageQuery;
import com.shareyi.jshow.common.CommonResult;
import com.shareyi.jshow.domain.app.JshowApp;

/**
 * @author zhangshibin
 * @since 2015-12-7
 * jshow 应用信息service 接口
 *
 */
public interface JshowAppService {
   
    /**
     * 添加并返回设置id的JshowApp对象
     * 
     * @param jshowApp
     * @return
     */
    public CommonResult<JshowApp> addJshowApp(JshowApp jshowApp);
    
	/**
     * 更新JshowApp
     * 
     * @param jshowApp
     */
    public CommonResult<JshowApp> updateJshowApp(JshowApp jshowApp);
    

    

	 /**
     * 根据主键删除JshowApp
     * 
     * @param id
     */
    public CommonResult<JshowApp> deleteJshowApp(Integer id);

	/**
     * 根据主键获取JshowApp
     * 
     * @param id
     * @return
     */	
    public CommonResult<JshowApp> getJshowAppById(Integer id);

     


    /**
     * 根据example取得JshowApp列表
     * 
     * @param  jshowApp
     * @return
     */
    public CommonResult<List<JshowApp>> getListByExample(JshowApp jshowApp);
    

	/**
     * 分页取得JshowApp列表
     * 
     * @param pageQuery
     * @return
     */
    public CommonResult<List<JshowApp>> getJshowAppByPage(PageQuery pageQuery);
	
	/**
     * 根据查询条件返回数量
     * 
     * @param pageQuery
     * @return
     */
    public int count(PageQuery pageQuery);
	
	
}
