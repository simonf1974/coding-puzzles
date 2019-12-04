package com.coinbase.interview.component;

//import com.coinbase.interview.component.util.Maze;
//import com.coinbase.interview.component.util.Node;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;


import java.util.List;

public class MazeAcceptanceTest {

    @Test
    public void should_find_path_to_end() {
        Maze rat = new Maze();
        int maze[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 }
        };
        boolean canBeSolved = rat.solveMaze(maze);
        assertThat(canBeSolved).isEqualTo(true);
    }

    @Test
    public void should_not_find_path_to_end() {
        Maze rat = new Maze();
        int maze[][] = {
                { 0, 1, 1, 0 },
                { 0, 1, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 1, 1, 0 },
        };
        boolean canBeSolved = rat.solveMaze(maze);
        assertThat(canBeSolved).isEqualTo(false);
    }
}
