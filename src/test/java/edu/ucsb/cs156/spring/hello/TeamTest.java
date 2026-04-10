package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }
    @Test
    void equals_returns_false_when_names_differ() {
        Team t1 = new Team();
        t1.setName("foo");

        Team t2 = new Team();
        t2.setName("bar");

        assertFalse(t1.equals(t2));
    }

    @Test
    void equals_returns_false_when_members_differ() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");

        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("baz");

        assertFalse(t1.equals(t2));
    }

    @Test
    void equals_returns_true_when_same_object() {
        assertTrue(team.equals(team));
    }

    @Test
    void equals_returns_false_when_object_is_null() {
        assertFalse(team.equals(null));
    }

    @Test
    void equals_returns_false_when_object_is_different_type() {
        assertFalse(team.equals("not a team"));
    }

    @Test
    void equals_returns_true_when_names_and_members_are_same() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");

        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");

        assertTrue(t1.equals(t2));
    }

    @Test
    void hashCode_returns_same_value_when_teams_are_equal() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");

        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");

        assertEquals(t1.hashCode(), t2.hashCode());
    }

    @Test
    void hashCode_returns_expected_value_for_empty_team() {
        Team t = new Team();
        assertEquals(1, t.hashCode());
    }
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
