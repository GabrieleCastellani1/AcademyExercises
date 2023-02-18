package it.euris.academy2023.EserciziMichael.streamExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        //Es1: data una collection di stringhe stampare tutte quelle che iniziano per "a"
        List<String> stringList = Arrays.asList("ciao", "alberto", "luca", "antonio","gatto", "animale");
        stringList.stream()
                .filter(str -> str.startsWith("a"))
                .forEach(str -> System.out.println(str) );
        //OPPURE
        List<String> stringhe = stringList.stream()
                                        .filter(str -> str.startsWith("a"))
                                        .collect(Collectors.toList());
        for (String s : stringhe) {
            System.out.println(s);
        }

        //Es2: data una collection di interi, sommare tutti gli interi > 5 e restituire il risultato

        List<Integer> listIntger = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(
                listIntger.stream()
                        .filter(i -> i > 5)
                        .mapToInt(i -> i)
                        .sum()
                );

        //OPPURE
        System.out.println(
                listIntger.stream()
                        .filter(i -> i > 5)
                        .collect(Collectors.summingInt(i -> i.intValue()))
        );

        //OPPURE
        System.out.println(
                listIntger.stream()
                        .filter(i -> i > 5)
                        .reduce((x,y) -> x+y)//che è uguale, con la method reference a dire Integer::sum
        );

        //Es.3: data una collection di stringhe creare una nuova lista di oggetti
             // che al loro interno contengono le singole stringhe salvata come variabile di classe "nome"

        List<String> nomiList = Arrays.asList("michael", "alberto", "antonio", "luca");

        class Studente{
            String nome;
            public Studente(String s){
                this.nome = s;
            }
            public Studente(){};
        }

        List<Studente> studenti = nomiList.stream()
                                        .map(s -> new Studente(s))
                                        .collect(Collectors.toList());
        //OPPURE
        List<Studente> studenti2 = nomiList.stream()
                                        .map(s -> {
                                            Studente stud = new Studente();
                                            return stud;
                                        })
                                        .collect(Collectors.toList());

        //Es.4: ritornare il primo elemento della lista E controllare categoricamente che lo streeam non sia vuoto,
            //dunque usare i metodi isPresent() e ifPresent() che manipolano oggetti Optional<> utili allo scopo

        Optional<String> first = nomiList.stream().findFirst();

        first.ifPresent(value -> System.out.println(value));

        if(first.isPresent()){
            System.out.println(first.get());
        }
        first.get();
    }

    //Metodo che spiega il funzionamento degli oggetti Optional<>
    public Optional<String> getOptionalString(){
        return Optional.of("Stringa presente o meno");
    }

   private static class Studente {
        String nome;
        public Studente(String s) {
            this.nome = s;
        }
    }
}
