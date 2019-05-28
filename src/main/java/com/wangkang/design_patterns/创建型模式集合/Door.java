package com.wangkang.design_patterns.创建型模式集合;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 14:31 2019/5/27
 * @Modified By:
 */
public abstract class Door extends MapSite{

    //一扇门关联的是两个房间
    private Room roomNo1;
    private Room roomNo2;
    boolean isOpen;

    public Door(Room roomNo1, Room roomNo2) {
        this.roomNo1 = roomNo1;
        this.roomNo2 = roomNo2;
    }
}
