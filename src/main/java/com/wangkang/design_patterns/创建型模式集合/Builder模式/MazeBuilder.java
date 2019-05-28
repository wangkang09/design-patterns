package com.wangkang.design_patterns.创建型模式集合.Builder模式;

import com.wangkang.design_patterns.创建型模式集合.Door;
import com.wangkang.design_patterns.创建型模式集合.Maze;
import com.wangkang.design_patterns.创建型模式集合.Room;
import com.wangkang.design_patterns.创建型模式集合.Wall;

import java.util.List;

/**
 * @Description: 该接口可以创建：1）迷宫。2）有一个特定房间号的房间。3）在有号码的房间之间的门。这个模式没有理解，先不总结
 * @Author: wangkang
 * @Date: Created in 10:15 2019/5/28
 * @Modified By:
 */
public abstract class MazeBuilder {
    protected Maze maze;
    protected List<Room> rooms;
    protected Door door;
    protected Wall wall;


    public abstract Maze build();
    public abstract MazeBuilder buildRooms(List<Room> rooms);
    public abstract MazeBuilder buildDoor(Room room1, Room room2);
    public abstract MazeBuilder buildWall();
}
