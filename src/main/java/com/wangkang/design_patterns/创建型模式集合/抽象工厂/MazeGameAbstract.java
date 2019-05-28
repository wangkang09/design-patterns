package com.wangkang.design_patterns.创建型模式集合.抽象工厂;

import com.wangkang.design_patterns.创建型模式集合.*;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 16:09 2019/5/27
 * @Modified By:
 */
public class MazeGameAbstract {

    //抽象工厂中的组合产品方法
    public Maze CreateMaze(AbstractMazeFactory factory) {
        Maze aMaze = factory.createMaze();
        Room room1 = factory.createRoom(1);
        Room room2 = factory.createRoom(2);

        Door aDoor = factory.createDoor(room1,room2);//这个门关联的两个房间
        Wall aWall = factory.createWall();
        room1.set_sideType(Direction.East,aDoor);
        room1.set_sideType(Direction.South,aWall);
        room1.set_sideType(Direction.West,aWall);
        room1.set_sideType(Direction.North,aWall);

        room1.set_sideType(Direction.East,aWall);
        room1.set_sideType(Direction.South,aWall);
        room1.set_sideType(Direction.West,aDoor);
        room1.set_sideType(Direction.North,aWall);

        aMaze.addRoom(room1);
        aMaze.addRoom(room2);
        return aMaze;
    }

    public Room getGateOfMaze() {
        return new MazeGameRaw().CreateMaze().getRoom(0);
    }
}
