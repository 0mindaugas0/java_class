import java.util.Scanner;

public class PagrindinePrograma {
    public static void main(String[] args) {

            Studentas studentas1 = new Studentas("Vardaitis", "Pavardaitis", 3, 7.5);
            System.out.println("studentas1.getVardas() = " + studentas1.getVardas());

            Studentas studentas2 = new Studentas("Vardaite", "Pavardaite", 4, 7.3);
            System.out.println("studentas2.getVardas() =" + studentas2.getVardas());

            Studentas studentas3 = nuskaitytiStudentaIsKonsoles();
            System.out.println("studentas2 = " + studentas2);
        }


        public static  Studentas nuskaitytiStudentaIsKonsoles() {
            Scanner skaitytuvas = new Scanner(System.in);
            System.out.println("Įveskite studento vardą: ");
            String vardas = skaitytuvas.nextLine();
            System.out.println("Įveskite studento pavardę :");
            String pavarde = skaitytuvas.nextLine();
            System.out.println("Įveskite klasę: ");
            int klase = skaitytuvas.nextInt();
            System.out.println("Įveskite studento pažymį: ");
            double pazymys = skaitytuvas.nextDouble();

            Studentas studentas = new Studentas(vardas, pavarde, klase, pazymys);
            return studentas;
        }
    }
