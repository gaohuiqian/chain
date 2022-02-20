package com.huiqian.data.moniter.task.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huiqian.data.moniter.task.entity.ChainBlock;
import org.apache.ibatis.annotations.Select;

public interface BlockMapper extends BaseMapper<ChainBlock> {

    @Select("select max(block_number) from chain_block where chain=#{chain}")
    Integer maxBlockNumber(String chain);

}
