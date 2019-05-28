package com.wangkang.design_patterns.创建型模式集合;

import java.util.List;

/**
 * @Description: 这是一个房间集合类：即迷宫
 * @Author: wangkang
 * @Date: Created in 14:34 2019/5/27
 * @Modified By:
 */
public class Maze {
    private List<Room> rooms;
    public void addRoom(Room room) {
        rooms.add(room);
    }
    public Room getRoom(int num) {
        if(num>rooms.size() && num < 1) return null;
        return rooms.get(num-1);
    }
}
