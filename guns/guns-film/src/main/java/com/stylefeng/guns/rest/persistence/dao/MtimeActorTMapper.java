package com.stylefeng.guns.rest.persistence.dao;

import com.stylefeng.guns.rest.persistence.model.MtimeActorT;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.stylefeng.guns.rest.persistence.model.bo.filmBo.DirectorBo;

/**
 * <p>
 * 演员表 Mapper 接口
 * </p>
 *
 * @author ZhangYao
 * @since 2019-04-21
 */
public interface MtimeActorTMapper extends BaseMapper<MtimeActorT> {

    DirectorBo selectDirectorById(int directId);
}
