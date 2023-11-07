package Problems;

import java.util.List;

public class Person {

    private Problem add;
    private Problem solve;
    private List problem;
    private Problem tellProblems;

    public List getProblem() {
        return problem;
    }

    public void setProblem(List problem) {
        this.problem = problem;
    }



   public void add(Problem problems){
      problem.add(problems);
   }
   public  void solve(Problem problems){
       problems.setSolved(true);
   }

    public String tellProblems() {
      return tellProblems
    }
}
