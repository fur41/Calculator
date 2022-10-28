import java.util.Scanner;

    public class switchhesapmakinesi {

        public static void main(String[] args) {

            int n1 , n2 , select;

                Scanner inp = new Scanner(System.in);

                    System.out.print("\nBirinci sayıyı yazınız :");

                        n1 = inp.nextInt();
                                                         
                         System.out.print("\nİkinci sayıyı yazınız :");

                            n2 = inp.nextInt();

                                    System.out.println("\n1-\tToplama \n2-\tÇıkarma \n3-\tBölme \n4-\tÇarpma\n ");
                                    
                                        System.out.print("Seçiminizi yapınız :");   
                                    
                                            select = inp.nextInt();
                                    
                             switch (select) {
                                    
                                        case (1): System.out.println("\nToplam :" + (n1+n2)+"\n" + "_______________________________________ " + "\n"
                                                                                                 + "|______________________________________|" + "\n");
                                                
                                            break;
                                        
                                                case (2) : System.out.println("\nÇıkarım :" + (n1-n2) + "\n" + "________________________________________"  + "\n"
                                                                                                             + "|_______________________________________|" + "\n");
                                            
                                                    break;

                                                        case (3) : System.out.println("\nBölüm :" + (n1/n2) + "\n");
                                                  
                                                    System.out.println(n1+"\tSayısının\t"+n2+"\tSayısına bölümünden kalan :\t" +(n1%n2) + "\n" + " _______________________________________ " + "\n"
                                                                                                                                               + "|_______________________________________|" + "\n");
                                                            break;  
                                                
                                                                case (4) : System.out.println("\nÇarpım :" + (n1*n2));
                                        
                                                                    break;
                                            
                                                                        default : System.out.println("\n\tHatalı giriş yaptınız !" + "\n" + "__________________________________________ " + "\n"
                                                                                                                                          + "|_________________________________________|" + "\n");
                                    
                                    }


            
        }
    
}