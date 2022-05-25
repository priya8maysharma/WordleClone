import java.util.*;
import java.net.*;
class wordle_abridged
{
     
    public static void main(String args[])throws Exception
    {
        Scanner s;
        wordle_abridged ob=new wordle_abridged();
        URL url = new URL("https://raw.githubusercontent.com/charlesreid1/five-letter-words/master/sgb-words.txt");
        s = new Scanner(url.openStream());
        String ar[]=new String[5757];
        int i=0;
        while(s.hasNextLine())
        {
            //System.out.println(s.nextLine());
            
            try
            {    
                String st=s.nextLine();
                ar[i]=st;
                i++;
            }
            catch(Exception e)
            {
                continue;
            }
        }
        //System.out.println("Array");
        /*Arrays.sort(ar);
        for(int j=0;j<i;j++)
        {
            System.out.println(ar[j]);
        }*/
        int h=0;
        Scanner sc=new Scanner(System.in);
        while(h==0)
        {
            int time=1;
            String st="";
            System.out.println("\n\n1.Play");
            System.out.println("2.Rules");
            System.out.println("3.Exit");
            int cho=sc.nextInt();
            sc.nextLine();
            switch(cho)
            {
                case 1:
                {
                    while(true)
                    {
               
                        System.out.println("Enter a five letter word");
                        st=sc.nextLine();
                        if(st.length()==5)
                        {
                            st=st.toLowerCase();
                            break;
                        }
                        else
                        {
                            System.out.println("Invalid Input....Please Enter a valid five letter word");
                         continue;
                        }
                    }
                    
                    double t=(Math.random()*1000)%5757;
                    int in=(int)t;
                    String w=ar[in];
                    int flag=0;
                    while(true)
                    {
                        String st1="";
                        String ga="";
                        System.out.println("\nTry:"+time);
                        if(st.equals(w))
                        {
                            flag=1;
                            break;
                        }
                       
                        for(int x=0;x<st.length();x++)
                        {
                            char ch=st.charAt(x);
                            st1=st1+ch+" ";
                            if(w.charAt(x)==ch)
                            {
                                ga=ga+"+"+" ";
                                System.out.println(""+w.charAt(x)+""+ch);
                                
                               
                                
                            }
                            else if(w.indexOf(ch)==-1)
                            {
                                ga=ga+"-"+ " ";
                               
                            }
                            else if(w.indexOf(ch)!=-1)
                            {
                                
                                ga=ga+"o"+" ";
                              
                            }
                        }
                        System.out.println("\n"+st1);
                        System.out.println(ga);
                      
                        time++;
                        if(time>=7)
                        {
                            break;
                        }
                         while(true)
                    {
               
                        System.out.println("Enter a five letter word");
                        st=sc.nextLine();
                        if(st.length()==5)
                        {
                            st=st.toLowerCase();
                            break;
                        }
                        else
                        {
                            System.out.println("Invalid Input....Please Enter a valid five letter word");
                         continue;
                        }
                    }
                    }
                    if(flag==1)
                    {
                        System.out.println("\nCongratulations , You Win\n");
                    }
                    else
                    {
                        System.out.println("Sorry,You lose!!");
                        System.out.println("\nThe Word Was:\n"+w);
                    }
                }
                break;
                case 2:  
                {
                    System.out.println("\nWELCOME TO WORDLE!!!");
                    System.out.println("\nEnter a 5 letter word and see if it matches our randomly chosen word \n"); 
                    System.out.println("\nEnter a 5 letter word and see if it matches our randomly chosen word \n"); 
                    System.out.println("Rules: \n+ means letter is in correct position \n- means letter doesn't exist in word \no mean letter exists but different position");
                }
                break;
                case 3:
                    h=1;
                    break;
                default:
                     System.out.println("Invalid Input");
            
            }
       }
   }
}
