package com.wangkang.design_patterns.创建型模式集合;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 13:13 2019/5/27
 * @Modified By:
 */
public abstract class Room extends MapSite{
    private int roomNo;//该房间号
    private MapSite[] sides = new Wall[4];//初始化房间的四周都为墙

    public Room(int roomNo) {
        this.roomNo = roomNo;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public MapSite get_sides(Direction direction) {
        return sides[direction.ordinal()];
    }
    //设置这个房间的所有4个相邻的房间
    public void setSides(MapSite[] sides) {
        this.sides = sides;
    }
    //设置这个房间某个相邻的房间
    public void set_sideType(Direction direction, MapSite mapSite) {
        this.sides[direction.ordinal()] = mapSite;
    }

}
