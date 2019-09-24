package com.test.service.imp;


import com.test.dao.PageDao;
import com.test.dao.imp.PageDaoImp;
import com.test.entry.Page;
import com.test.entry.Project;
import com.test.service.PageService;

import java.util.List;

public class PageServiceImp implements PageService {
    @Override
    public Page getPage(int dangPage) {
        PageDao pd=new PageDaoImp();
        Page p=new Page();
        p.setPageSum(pd.SumSize());
        p.setDangPage(dangPage);
        List <Project> pageList=pd.getPageList(dangPage, p.getPageSize());
        p.setGetPageList(pageList);
        return p;
    }
}
