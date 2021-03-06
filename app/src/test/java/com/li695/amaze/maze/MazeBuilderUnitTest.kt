package com.li695.amaze.maze

import com.li695.amaze.walker.BotWalker
import org.junit.Assert.assertEquals
import org.junit.Test

class MazeBuilderUnitTest {
    @Test
    fun simpleRandomMaze() {
        val maze = MazeBuilder.build(width = 20, height = 20)
        assertEquals(maze.width, 20)
        assertEquals(maze.height, 20)
        val bot = BotWalker(maze)
        bot.passMaze()
    }
}
