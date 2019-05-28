package com.wangkang.design_patterns.创建型模式集合.抽象工厂;

import com.wangkang.design_patterns.创建型模式集合.*;

/**
 * @Description: 抽象工厂实例，生产 4个产品
 * @Author: wangkang
 * @Date: Created in 16:35 2019/5/27
 * @Modified By:
 */
public class EnchantedMazeFactory extends AbstractMazeFactory {
    @Override
    Maze createMaze() {
        return new Maze();
    }

    @Override
    Wall createWall() {
        return new NormalWall();
    }

    @Override
    Room createRoom(int roomNo) {
        return new NormalRoom(roomNo);
    }

    @Override
    Door createDoor(Room room1, Room room2) {
        return new NormalDoor(room1,room2);
    }
}
