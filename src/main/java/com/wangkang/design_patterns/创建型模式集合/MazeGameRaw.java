package com.wangkang.design_patterns.创建型模式集合;

/**
 * @Description: 这是一个迷宫游戏类，主要里面的一个 createMaze() 方法来创建迷宫
 * @Author: wangkang
 * @Date: Created in 14:36 2019/5/27
 * @Modified By:
 */
public class MazeGameRaw {

    public Maze CreateMaze() {
        Maze aMaze = new Maze();
        Room room1 = new NormalRoom(1);
        Room room2 = new NormalRoom(2);

        Door aDoor = new NormalDoor(room1,room2);//这个门关联的两个房间

        room1.set_sideType(Direction.East,aDoor);
        room1.set_sideType(Direction.South,new NormalWall());
        room1.set_sideType(Direction.West,new NormalWall());
        room1.set_sideType(Direction.North,new NormalWall());

        room1.set_sideType(Direction.East,new NormalWall());
        room1.set_sideType(Direction.South,new NormalWall());
        room1.set_sideType(Direction.West,aDoor);
        room1.set_sideType(Direction.North,new NormalWall());

        aMaze.addRoom(room1);
        aMaze.addRoom(room2);
        return aMaze;
    }

    public Room getGateOfMaze() {
        return new MazeGameRaw().CreateMaze().getRoom(0);
    }
}
