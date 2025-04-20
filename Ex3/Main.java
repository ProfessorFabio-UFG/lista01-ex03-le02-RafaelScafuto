package Ex3;

import java.util.ArrayList;

public class Main {

        public static void main(String[] args) {
            ArrayList<Morador> listaMoradores = new ArrayList<>();


            listaMoradores.add(new Morador("Ana Silva", "101", "(11)99999-1111"));
            listaMoradores.add(new Morador("Carlos Pereira", "202", "(11)98888-2222"));
            listaMoradores.add(new Morador("Beatriz Lima", "303", "(11)97777-3333"));

            System.out.println("Moradores cadastrados:");
            for (Morador morador : listaMoradores) {
                System.out.println(morador);
            }
        }



}
