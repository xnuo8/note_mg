package com.xnuo.note.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class NoteVo {
    private String groupName;//分组名称
    private long noteCount;//数量

    private Integer typeId;
}
