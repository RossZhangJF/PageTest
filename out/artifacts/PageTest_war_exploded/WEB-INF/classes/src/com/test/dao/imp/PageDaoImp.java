package com.test.dao.imp;



import com.test.dao.PageDao;
import com.test.entry.Project;

import java.util.List;

public class PageDaoImp extends DaoImp implements PageDao {
    @Override
    public int SumSize() {
        String sql="select  count(*)  from project ;";
        int count=getTotal(sql);
        return count;
    }

    @Override
    public List <Project> getPageList(int dangPage, int pageSize) {
        String sql="select pro_id proId,pro_name proName,stu_name proPerson,pro_state proState,pro_date proDate  " +
                "  from project pro inner join student stu on pro.pro_person = stu.stu_id limit ?,?; ";
        List <Project> list=getAll(Project.class,sql,dangPage,pageSize);
        return list;
    }
}
