package com.ph.mapper.feature;

import com.ph.entity.feature.CreditcardSalaryFea;
import com.ph.entity.feature.CreditcardSalaryFeaMax;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CreditcardSalaryFeaMaxMapper extends BaseMapper<CreditcardSalaryFeaMax> {

    @Select("select * from creditcard_salary_fea_max where serial_id=#{serial_id} order by id desc limit 1")
    CreditcardSalaryFeaMax findBySerialId(int serialId);

    @Select("select * from creditcard_salary_fea_max where serial_id=#{serial_id}  order by id desc limit 1 for update")
    CreditcardSalaryFeaMax findBySerialIdForUpdate(int serialId);


}
