package Poker;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private ArrayList<Card> deck;
    //private Image backofCard;


    //donde se va a crear la baraja
    public Deck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public Deck(){
        List<String> palos = Card.getvalidpalos(); //para llamar el static de los  palos

        List<String> Valores = Card.getvalidValor(); //para llamar al static de los valores

        List<String> colores = Card.getvalidColor(); //para llamar al static de los colores

        deck = new ArrayList<>();

        for (String palo:palos){
            for (String Valor:Valores){
                for (String color:colores) {
                    deck.add(new Card(Valor, palo, color));
                }
            }
        }
    }

    public void Shuffle(){
        this.deck = deck;
        System.out.println("Se mezcló el deck");
    }

    public void Head(){
        this.deck = deck;
        System.out.println("Quedan {número de cartas en deck} ");
    }

    public void Pick(){
        this.deck = deck;
        System.out.println("Quedan {número de cartas en deck} ");
    }

    public void Hand(){
        this.deck = deck;
        System.out.println("Quedan {número de cartas en deck} ");
    }

}
