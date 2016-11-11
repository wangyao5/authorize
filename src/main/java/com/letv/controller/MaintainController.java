package com.letv.controller;

import com.letv.entity.CompanyEntity;
import com.letv.repository.CompanyRepository;
import com.letv.repository.LittleCategoryRepository;
import com.letv.repository.WorkFlowRepository;
import com.letv.vo.CompanyVO;
import com.letv.vo.Result;
import com.letv.vo.WorkFlowVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 维护信息接口
 */
@Controller
public class MaintainController {
    @Autowired
    CompanyRepository companyRepository;

    @Autowired
    WorkFlowRepository workFlowRepository;

    @Autowired
    LittleCategoryRepository littleCategoryRepository;

    /**
     * 保存/更新我方公司名
     * @param sid
     * @param companies
     * @return
     */
    @Transactional
    @RequestMapping(value = "/company/save/up/{sid}", method = RequestMethod.POST)
    @CrossOrigin
    public @ResponseBody Result saveCompany(@PathVariable("sid") String sid, @RequestBody List<CompanyVO> companies) {
        Result result;
        //判断sid是否可操作该，我方公司的维护
        if (true){
            for(CompanyVO company: companies){
                //有公司ID数据库编号，调用update
                if (company.getId() > 0){
                    companyRepository.update(company.getId(), company.getName());
                } else {
                    //保存公司信息
                    CompanyEntity companyEntity = new CompanyEntity();
                    companyEntity.setName(company.getName());
                    CompanyEntity resultCompanyEntity = companyRepository.save(companyEntity);
                    company.setId(resultCompanyEntity.getId());
                }
            }
            result = Result.createSuccessResult("ok", companies);
        }
        return result;
    }

    /**
     * 获取我方公司列表
     * @param sid
     * @return
     */
    @Transactional
    @RequestMapping(value = "/company/findAll/{sid}", method = RequestMethod.GET)
    @CrossOrigin
    public @ResponseBody Result findAllCompany(@PathVariable("sid") String sid) {
        List<CompanyEntity> companies = companyRepository.findAll();
        return Result.createSuccessResult("ok", companies);
    }

    /**
     * 主流程维护
     */
    @Transactional
    @RequestMapping(value = "/workflow/save/{sid}", method = RequestMethod.GET)
    @CrossOrigin
    public @ResponseBody Result saveWorkFlow(@PathVariable("sid") String sid, @RequestBody WorkFlowVO workFlow){

        return null;
    }



}
