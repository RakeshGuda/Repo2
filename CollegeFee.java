class CollegeFee
{
           public static void main (String[]args)
           {
              String branch="Mech";
              switch(branch)
                {
                  case "IT":
                           int first=50000;
                               System.out.println("First year fee is"+first);
                            int second=60000;
                               System.out.println("Second year fee is"+second);
                            int third=70000;
                                System.out.println("Third year fee"+third);
                            int fourth=80000;
                                System.out.println("Fourth year fee"+fourth);
                           double total1=first+second+third+fourth;
                                  System.out.println("total fee for 4 years"+"="+total1);
                            break;
                  case "cse":
                            int first1=60000;
                               System.out.println("First year fee is"+first1);
                            int second1=70000;
                               System.out.println("Second year fee is"+second1);
                            int third1=60000;
                                System.out.println("Third year fee"+third1);
                            int fourth1=80000;
                                System.out.println("Fourth year fee"+fourth1);
                            double total2=first1+second1+third1+fourth1;
                                  System.out.println("total fee for 4 years"+"="+total2);
                             break;
                   case"Mech":
                              int first2=50000;
                               System.out.println("First year fee is"+first2);
                            int second2=40000;
                               System.out.println("Second year fee is"+second2);
                            int third2=30000;
                                System.out.println("Third year fee"+third2);
                            int fourth2=25000;
                                System.out.println("Fourth year fee"+fourth2);
                            double total3=first2+second2+third2+fourth2;
                                  System.out.println("total fee for 4 years"+total3);
                  
                   default:
                              System.out.println(" no data found");
                         
                    }     
           }
} 
