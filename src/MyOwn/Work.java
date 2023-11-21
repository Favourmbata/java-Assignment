package MyOwn;

public class Work {

    int[][] surveyResponse = new int[5][10];

    String[]topics = {"Sexual abuse","Education","Pollution","global warming","mental health"};


         public  void rateFirstTopics(int userRating){
             int index = userRating -1;
             surveyResponse[0][index]++;
         }

         public void rateSecondTopica(int userRating){
             int index = userRating -1;
             surveyResponse[0][index]++;
         }

      public void rateThirdTopic(int userRating){
             int index = userRating - 1;
             surveyResponse[0][index]++;
      }

    public void rateFourthTopic(int userRating){
        int index = userRating - 1;
        surveyResponse[0][index]++;
    }


    public void rateFiftthTopic(int userRating){
        int index = userRating - 1;
        surveyResponse[0][index]++;
    }

   public void displlaySummary(int userRating){
       for (int i = 0; i <topics.length ; i++) {
           System.out.print(i +"\t");
           for (int j = 0; j <surveyResponse[j].length ; j++) {
               System.out.println(surveyResponse[i][j] +"");
           }
       }

       System.out.println();
         }




}

