package PF06ObjectsAndClasses.M04TeamworkProjects;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private final String name;
    private final String creator;
    private final List<String> members;

    public Team(String name, String creator) {
        this.name = name;
        this.creator = creator;
        this.members = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getCreator() {
        return creator;
    }

    public List<String> getMembers() {
        return members;
    }

    public void addMember(String member) {
        members.add(member);
    }
}
