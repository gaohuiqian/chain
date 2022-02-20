package com.huiqian.data.moniter.task.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class ChainBlock {

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    private String chain;
    private int blockNumber;
    private String data;

}
