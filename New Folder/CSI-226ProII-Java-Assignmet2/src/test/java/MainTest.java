/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.util.ArrayList;
import java.util.Scanner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Pavilion
 */
public class MainTest {
    
    public MainTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class Main.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String Scanner = "";
        String[] args = null;
        Main.main(Scanner, args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayAllPlayers method, of class Main.
     */
    @org.junit.jupiter.api.Test
    public void testDisplayAllPlayers() {
        System.out.println("displayAllPlayers");
        ArrayList<Player> players = null;
        Main.displayAllPlayers(players);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayPlayersWithOddNumbers method, of class Main.
     */
    @org.junit.jupiter.api.Test
    public void testDisplayPlayersWithOddNumbers() {
        System.out.println("displayPlayersWithOddNumbers");
        ArrayList<Player> players = null;
        Main.displayPlayersWithOddNumbers(players);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayPlayersWithNamesStartingWithLetter method, of class Main.
     */
    @org.junit.jupiter.api.Test
    public void testDisplayPlayersWithNamesStartingWithLetter() {
        System.out.println("displayPlayersWithNamesStartingWithLetter");
        ArrayList<Player> players = null;
        Scanner scanner = null;
        Main.displayPlayersWithNamesStartingWithLetter(players, scanner);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPlayer method, of class Main.
     */
    @org.junit.jupiter.api.Test
    public void testAddPlayer() {
        System.out.println("addPlayer");
        Object players = null;
        Scanner scanner = null;
        Main.addPlayer(players, scanner);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
