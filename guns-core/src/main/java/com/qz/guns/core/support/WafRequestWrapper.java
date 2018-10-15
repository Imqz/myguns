package com.qz.guns.core.support;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * @author qinzhi
 * @date 2018/10/2 22:47
 */
public class WafRequestWrapper extends HttpServletRequestWrapper {
    private boolean filterXSS;

    private boolean filterSQL;


    public WafRequestWrapper(HttpServletRequest request, boolean filterXSS, boolean filterSQL) {
        super(request);
        this.filterXSS = filterXSS;
        this.filterSQL = filterSQL;
    }


    public WafRequestWrapper(HttpServletRequest request) {
        this(request, true, true);
    }

    /**
     * @param parameter 过滤参数
     * @return
     * @Description 参数过滤
     */
    @Override
    public String getParameter(String parameter) {
        return filterParamString(super.getParameter(parameter));

    }

    /**
     * @param rawValue 待处理内容
     * @return
     * @Description 过滤字符串内容
     */
    protected String filterParamString(String rawValue) {
        if (null == rawValue) {
            return null;
        }
        String tmpStr = rawValue;
        if (this.filterXSS) {
            tmpStr = WafKit.stripXSS(rawValue);
        }
        if (this.filterSQL) {
            tmpStr = WafKit.stripSqlInjection(tmpStr);
        }
        return tmpStr;
    }
}
