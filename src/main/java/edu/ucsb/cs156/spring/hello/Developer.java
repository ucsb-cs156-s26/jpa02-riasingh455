package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        // TODO: Change this to your name
        // You may use just the name that is used on <https://bit.ly/cs156-s26-teams>
        // i.e. your first name, or your first and initial of last name

        return "Ria";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "riasingh455";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("s26-08");
        team.addMember("Anjali");
        team.addMember("Ria");
        team.addMember("Christian");
        team.addMember("Matthew");
        team.addMember("Taedon");
        team.addMember("Wendy");
        return team;
    }
}
