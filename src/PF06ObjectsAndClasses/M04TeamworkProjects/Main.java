package PF06ObjectsAndClasses.M04TeamworkProjects;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int teamCount = Integer.parseInt(scanner.nextLine());
        Map<String, Team> teams = new LinkedHashMap<>();
        Set<String> creators = new HashSet<>();

        for (int i = 0; i < teamCount; i++) {
            String[] input = scanner.nextLine().split("-");
            String creator = input[0];
            String teamName = input[1];

            if (teams.containsKey(teamName)) {
                System.out.printf("Team %s was already created!%n", teamName);
            } else if (creators.contains(creator)) {
                System.out.printf("%s cannot create another team!%n", creator);
            } else {
                Team team = new Team(teamName, creator);
                teams.put(teamName, team);
                creators.add(creator);
                System.out.printf("Team %s has been created by %s!%n", teamName, creator);
            }
        }

        String line;
        Set<String> members = new HashSet<>();

        while (!(line = scanner.nextLine()).equals("end of assignment")) {
            String[] input = line.split("->");
            String user = input[0];
            String teamName = input[1];

            if (!teams.containsKey(teamName)) {
                System.out.printf("Team %s does not exist!%n", teamName);
            } else if (creators.contains(user) || members.contains(user)) {
                System.out.printf("Member %s cannot join team %s!%n", user, teamName);
            } else {
                teams.get(teamName).addMember(user);
                members.add(user);
            }
        }

        List<Team> validTeams = new ArrayList<>();
        List<Team> disbandTeams = new ArrayList<>();

        for (Team team : teams.values()) {
            if (team.getMembers().isEmpty()) {
                disbandTeams.add(team);
            } else {
                validTeams.add(team);
            }
        }

        validTeams.sort(Comparator.comparingInt((Team t) -> t.getMembers().size()).reversed().thenComparing(Team::getName));

        for (Team team : validTeams) {
            System.out.printf("%s\n- %s\n", team.getName(), team.getCreator());
            team.getMembers().stream()
                    .sorted()
                    .forEach(member -> System.out.printf("-- %s%n", member));
        }

        System.out.println("Teams to disband:");
        disbandTeams.stream()
                .sorted(Comparator.comparing(Team::getName))
                .forEach(team -> System.out.println(team.getName()));
    }
}