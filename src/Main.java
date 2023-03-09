import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ievade = new Scanner(System.in);

        System.out.println("Ievadi studentu skaitu: ");
        int studentuSkaits = ievade.nextInt();
        String[] studenti = new String[studentuSkaits];

        String[] kriteriji = {"Apmeklējums", "Mājasdarbi", "Kontroldarbi", "Eksāmens"};

        int[] svari = new int[kriteriji.length];

        for(int i = 0 ; i<kriteriji.length; i++)
        {
            int procenti = 0;
            System.out.println("Ievadi cik % svarīgs ir kritērijs: "+kriteriji[i]);
            do{
                if(procenti > 100 || procenti < 0)
                    System.out.println("Ievadītais procentu skaits ir nederīgs!");
                procenti = ievade.nextInt();
            }while(procenti > 100 || procenti < 0);
            svari[i] = procenti;
        }

        for(int i = 0; i< studentuSkaits; i++)
        {
            ievade.nextLine();
            System.out.println("Ievadi "+(i+1)+" studenta vārdu: ");
            studenti[i] = ievade.nextLine();

            for(int j = 0; j<kriteriji.length; j++)
            {
                int[] studentaAtzimes = new int[kriteriji.length];
                System.out.println("Studenta: "+studenti[i]+"\nVērtējums kritērijā: "+kriteriji[j]);
                studentaAtzimes[j] = ievade.nextInt();
            }
        }


    }
}