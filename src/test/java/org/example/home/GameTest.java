package org.example.home;

import org.example.home.home.Door;
import org.example.home.home.Game;
import org.example.home.home.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class GameTest extends AbstractTest{
    @Test
    void checkNotRiskWin () {
        //given
        Player player = new Player("Игрок", false);
        Game game = new Game(player, doors);
        //when
        Door door = game.round(0);
        //then
        Assertions.assertTrue(door.isPrize());
    }

    @Test
    void checkNotRiskLose() {
        //given
        Player player = new Player("Игрок", false);
        Game game = new Game(player, doors);
        //when
        Door door = game.round(1);
        //then
        Assertions.assertFalse(door.isPrize());
    }

    @Test
    void checkRiskWin () {
        //given
        Player player = new Player("Игрок", true);
        Game game = new Game(player, doors);
        //when
        Door door = game.round(2);
        //then
        Assertions.assertTrue(door.isPrize());
    }

    @Test
    void checkRiskLose () {
        //given
        Player player = new Player("Игрок", true);
        Game game = new Game(player, doors);
        //when
        Door door = game.round(2);
        //then
        Assertions.assertFalse(door.isPrize());
    }
}
