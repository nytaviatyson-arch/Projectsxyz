public class Towers {
    public void solve(int n, char fromPeg, char toPeg, char auxPeg) {
      if (n == 1) {
            System.out.println("Move disk 1 from " + fromPeg + " to " + toPeg);
            return;
        }
    solve(n - 1, fromPeg, auxPeg, toPeg);  
    System.out.println("Move disk " + n + " from " + fromPeg + " to " + toPeg);
    solve(n - 1, auxPeg, toPeg, fromPeg);
    }
}