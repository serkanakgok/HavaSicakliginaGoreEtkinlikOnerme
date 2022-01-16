import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        int heat;

        System.out.print("Lütfen hava sıcaklığını giriniz :");
        Scanner data = new Scanner(System.in);
        heat = data.nextInt();

        boolean space = heat<=-100;
        boolean ski = -100<heat&&heat<=5;
        boolean cin = 5<heat&&heat<=15;
        boolean pic = 15<heat&&heat<=25;

        System.out.println();
        if (space){
            System.out.println("Uzaya mı çıktınız :-O");
        }else if (ski){
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        }else if (cin){
            System.out.println("Sinemaya gidebilirsiniz.");
        }else if (pic){
            System.out.println("Pikniğe gidebilirsiniz.O");
        }else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}