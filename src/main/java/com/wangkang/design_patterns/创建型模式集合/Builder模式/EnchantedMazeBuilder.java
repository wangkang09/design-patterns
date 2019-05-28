package com.wangkang.design_patterns.创建型模式集合.Builder模式;

import com.wangkang.design_patterns.创建型模式集合.Maze;
import com.wangkang.design_patterns.创建型模式集合.Room;

import java.util.List;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 10:23 2019/5/28
 * @Modified By:
 */
public class EnchantedMazeBuilder extends MazeBuilder {

    @Override
    public Maze build() {
        return null;
    }

    @Override
    public MazeBuilder buildRooms(List<Room> rooms) {
        return null;
    }

    @Override
    public MazeBuilder buildDoor(Room room1, Room room2) {
        return null;
    }

    @Override
    public MazeBuilder buildWall() {
        return null;
    }
}
