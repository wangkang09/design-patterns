package com.wangkang.design_patterns.创建型模式集合.抽象工厂;

import com.wangkang.design_patterns.创建型模式集合.Door;
import com.wangkang.design_patterns.创建型模式集合.Maze;
import com.wangkang.design_patterns.创建型模式集合.Room;
import com.wangkang.design_patterns.创建型模式集合.Wall;

/**
 * @Description: 抽象工厂
 * @Author: wangkang
 * @Date: Created in 15:51 2019/5/27
 * @Modified By:
 */
public abstract class AbstractMazeFactory {
    abstract Maze createMaze();
    abstract Wall createWall();
    abstract Room createRoom(int roomNo);
    abstract Door createDoor(Room room1,Room room2);
}
