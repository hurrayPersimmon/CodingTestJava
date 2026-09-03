import java.util.*;

class Solution {
    List<String> answer;
    String[][] tickets;
    boolean[] visited;
    
    public String[] solution(String[][] tickets) {
        this.tickets = tickets;
        this.visited = new boolean[tickets.length];

        Arrays.sort(tickets, Comparator.comparing(ticket -> ticket[1]));

        List<String> route = new ArrayList<>();
        route.add("ICN");

        dfs("ICN", route);

        return answer.toArray(new String[0]);
    }
    
    private void dfs(String current, List<String> route){
        if(answer != null) return;
        
        if (route.size() == tickets.length + 1) {
            answer = new ArrayList<>(route);
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            if (visited[i]) continue;

            if (tickets[i][0].equals(current)) {
                visited[i] = true;
                route.add(tickets[i][1]);

                dfs(tickets[i][1], route);
                
                if(answer != null);

                visited[i] = false;
                route.remove(route.size() - 1);
            }
        }
    }
}