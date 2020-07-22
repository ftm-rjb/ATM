package atm;
import java.util.*;
public class ATM {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String name[] = {"Sara" , "No Name" , "Puya" , "Shima" , "Mina" , "mobile" , "ahmar" , 
                         "mahak" , "bargh" , "ADMIN"};
        int shomare[] = {123 , 134 , 145 , 156 , 167 , 9876 , 9765 , 9654 , 9543 , 9999};
        int ramz[] = {1111 , 2222 , 3333 , 4444 , 5555 , 6666 , 7777 , 8888 , 9999 , 0000};
        int masdudi[] = {1 , 0 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1};
        int mojudi[] = {10000 , 0 , 50000 , 25000 , 200000 , 1000000 , 1000000 , 2000000 
                , 1000000 , 5300000};
        
        int x , y=5;
        while(y>0){
            System.out.println("Be ATM ma khosh amadid!");
            System.out.println("1.shomare karte khod ra vared konid: ");
            int a = input.nextInt();
            x = Arrays.binarySearch(shomare,a);
            if(x>=0 && x<9){
                if(masdudi[x] == 0){
                    System.out.println("karte shoma masdud ast 23");
                    }
                    else{
                        for(int j=0 ; j<3 ; j++){
                        System.out.format("2.%s ramze khod ra vared konid: ",name[x]);
                        int b = input.nextInt();
                        if(b != ramz[x] && j==2){
                                System.out.println("eshtebah! karte shoma masdud shod");
                                masdudi[x] = 0;
                            }
                        else if(b == ramz[x]){

                        System.out.println("Menu Asli: ");
                        System.out.println("1.elame mojudi (karmozde 100 tuman)");
                        System.out.println("2.enteghale vajh(karmozde 500 tuman");
                        System.out.println("3.daryafte vajh");
                        System.out.println("4.taghire ramz");
                        System.out.println("5.sayere khadamat");
                        System.out.println("6.khoruj");
                        int c = input.nextInt();
                        if(c==1){
                            mojudi[x] -= 100;
                            System.out.println("mojudie hesabe shoma "+mojudi[x]+" tuman mibashad");

                        }
                        else if(c==2){
                            System.out.println("shomare karte daryaftkonnade ra vared konid:");
                            int d = input.nextInt();
                            System.out.println("mablaghe morede nazar ra vared konid(be tuman):");
                            int e = input.nextInt();
                            int w = Arrays.binarySearch(shomare , d);
                            if(d == shomare[w]){
                                if(e <= mojudi[x]-500){
                                    mojudi[w] += e;
                                    mojudi[x] -= (e+500);
                                    System.out.println("anjam shod.mojudi shoma: "+mojudi[x]+" tuman");
                                    }
                                else{
                                    System.out.println("mojudi kafi nist");
                                }
                            }
                            else{
                                System.out.println("shomare kart mojud nemibashad");
                                }                            
                        }
                        else if(c==3){
                            System.out.println("mablaghe morede nazar ra vared konid(be tuman): ");
                            int f = input.nextInt();
                            if(f <= mojudi[x]){
                                mojudi[x] -= f;
                                mojudi[9] -= f;
                                System.out.println("aya mayel be daryafte resid hastid?(1.Yes , 2.No)");
                                int g = input.nextInt();
                                if(g == 1){
                                    System.out.println("pule khod ra bardarid");                                    
                                    System.out.println("mojudi shoma"+mojudi[x]+"tuman mibashad.");
                                }
                                else if(g == 2){
                                    System.out.println("pule khod ra bardarid");
                                }
                            }
                            else{
                                System.out.println("mojudi kafi nist");
                            }
                        }
                        else if(c==4){
                            System.out.println("ramze jadid ra vared konid: ");
                            int h = input.nextInt();
                            System.out.println("ramze jadid ra mojadadan vared konid: ");
                            int q = input.nextInt();
                            if(h == q){
                                ramz[x] = h;
                                System.out.println("anjam shod");
                            }
                            else if(h != q){
                                System.out.println("eshtebah vared kardid!");
                            }
                        }
                        else if(c==5){
                            System.out.println("1.kharide sharje mobile (karmozd 200 tuman)");
                            System.out.println("2.komak be helele ahmar");
                            System.out.println("3.komak be mahak");
                            System.out.println("4.pardakhte ghabze bargh");
                            System.out.println("5.khoruj");
                            int r = input.nextInt();
                            if(r == 1){
                                System.out.println("shomare mobile khod ra vared konid: ");
                                int k = input.nextInt();
                                System.out.println("mablaghe morede nazar ra vared konid(be tuman): ");
                                int l = input.nextInt();
                                if(l <= (mojudi[x]-200)){
                                mojudi[x] -= (l);
                                mojudi[5] += (l-200);
                                    System.out.println("anjam shod.mojudi shoma: "+mojudi[x]+" tuman");
                            }
                                else{
                                    System.out.println("mojudi kafi nist");
                                }
                            }
                            else if(r == 2){
                                System.out.println("mablaghe morede nazar ra vared konid(be tuman): ");
                                int m = input.nextInt();
                                if(m <= mojudi[x]){
                                    mojudi[x] -= m;
                                    mojudi[6] += m;
                                    System.out.println("anjam shod.mojudi shoma: "+mojudi[x]+" tuman");
                                }
                                else{
                                    System.out.println("mojudi kafi nist");
                                }
                            }
                            else if(r == 3){
                                System.out.println("mablaghe morede nazar ra vared konid: ");
                                int n = input.nextInt();
                                if(n <= mojudi[x]){
                                    mojudi[x] -= n;
                                    mojudi[7] += n;
                                    System.out.println("anjam shod.mojudi shoma: "+mojudi[x]+" tuman");
                                }
                                else{
                                    System.out.println("mojudi kafi nist");
                                }
                            }
                            else if(r == 4){
                                System.out.println("shenase ghabz ra vared konid: ");
                                int o = input.nextInt();
                                System.out.println("mablaghe ghabz ra vared konid: ");
                                int p = input.nextInt();
                                if(p <= mojudi[x]){
                                    mojudi[x] -= p;
                                    mojudi[8] += p;
                                    System.out.println("anjam shod.mojudi shoma: "+mojudi[x]+" tuman");
                                }
                                else{
                                    System.out.println("mojudi kafi nist");
                                }
                            }
                            else if(r == 5){
                                System.out.println("ba movafaghiat kharej shodid");
                                break;
                            }
                        }
                        else if(c == 6){
                            System.out.println("ba movaffaghiat kharej shodid");
                            break;
                        }
                        break;
                    }
                }
            }
        }
        else if(x == 9){
            System.out.println("ADMIN ramze khod ra vared kon");
            int u = input.nextInt();
            if(u == ramz[9]){
                System.out.println("1.elame mojudi");
                System.out.println("2.afzayeshe hesab");
                int t = input.nextInt();
                if(t == 1){
                    System.out.println("mojudi kol "+mojudi[9]+"tuman mibashad");
                }
                else if(t == 2){
                    
                    System.out.println("ettelaate zir ra vared konid:");
                    System.out.println("1.name sahebe kart ra vared konid:");
                    String a1 = input.next();
                    name[1] = a1;
                    System.out.println("2.shomare karte jadid:");
                    int a2 = input.nextInt();
                    shomare[1] = a2;
                    masdudi[1] = 1;
                    System.out.println("ramze karte jadid:");
                    int a3 = input.nextInt();
                    ramz[1] = a3;
                    System.out.println("3.mojudi kart:");
                    int a4 = input.nextInt();
                    mojudi[1] = a4;
                    mojudi[9] += a4;
                    System.out.println("sabt shod");
                }
            }
            else{
                System.out.println("Eshtebah");
                }
            }
        else{
                System.out.println("mojud nist");
            }
    }
    }
}
