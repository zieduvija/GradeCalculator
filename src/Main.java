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
            int[] studentaAtzimes = new int[kriteriji.length];
            System.out.println("Ievadi "+(i+1)+" studenta vārdu: ");
            studenti[i] = ievade.nextLine();

            for(int j = 0; j<kriteriji.length; j++)
            {
                int atzime = 0;
                System.out.println("Studenta: "+studenti[i]+"\nVērtējums kritērijā: "+kriteriji[j]);
                do{
                    if(atzime > 10 || atzime < 0)
                        System.out.println("Ievadītā atzīme ir nederīga!");
                    atzime = ievade.nextInt();
                }while(atzime > 10 || atzime < 0);
                studentaAtzimes[j] = atzime;
            }

            System.out.println("Studenta: "+studenti[i]+"\nVidējā atzīme: "+AprēķinātAtzīmi(svari, studentaAtzimes));

        }


    }

    static int AprēķinātAtzīmi(int[] svari, int[] atzimes){
        int atzime = 0;
        for(int i = 0; i<svari.length; i++)
            atzime += svari[i]*atzimes[i];

        return atzime/100;
    }

}