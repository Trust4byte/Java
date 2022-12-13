import java.util.*;

public class Main {
    private static List<Tipp> tipps = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int current = 0;

        while(true){
            tipps.add(new Tipp());
            System.out.println("Bitte geben Sie ihre 6 Tipps ein.");

            for(int i = 0; i < 6; i++){
                int num;

                while(true){
                    num = Integer.parseInt(scan.nextLine());
                    if(num >= 1 && num <= 45){
                        if(tipps.get(current).add(num))
                            break;
                    }
                    System.out.println("Bitte Zahl zwischen 1 - 45 eingeben & keine doppelten Zahlen");
                }


            }

            System.out.println("Möchten Sie noch einen Tipp abgeben? (Y/N)");

            if(scan.nextLine().equalsIgnoreCase("n"))
                break;

            current++;
        }

        Set<Integer> lottoZahlen = draw();
        System.out.print("Ziehung: " );

        for(Integer i : lottoZahlen){
            System.out.print(i + ", ");
        }

        for(int i = 0; i < tipps.size(); i++){
            System.out.print("\n" + i + ". Tipp: ");
            for(Integer tipp : tipps.get(i).getSet()){
                System.out.print(tipp + ", ");
            }
            System.out.println("/ " + tipps.get(i).calcCorrect(lottoZahlen) + " richtige");
        }
    }

    public static Set<Integer> draw(){
        Random ran = new Random();

        Set<Integer> lottoZahlen = new TreeSet<>();

        for (int i = 0; i < 6; i++){
            if(!lottoZahlen.add(ran.nextInt(1, 46)))
                i--;
        }

        return lottoZahlen;
    }

}
