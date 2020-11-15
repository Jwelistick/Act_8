package Poker;

import java.util.Arrays;
import java.util.List;

public class Card {
    private String Valor, palo, color;

    public Card(String Valor, String palo, String color){
        setValor(Valor);
        setPalo(palo);
        setColor(color);
    }

    public String getColor(){
        return color;
    }

    public static List<String> getvalidColor(){
        return Arrays.asList("rojo", "negro");
    }

    /**
     * Opciones válidas de la cara serán
     * @param color a,2,3,4,5,6,7,8,9,10,j,q,k
     *             Cualquier otra opción  puesta va a dar error
     */

    public void setColor(String color) {
        List<String> validcolor = getvalidColor();
        color = color.toLowerCase(); //pa' evitarnos problemas

        if (validcolor.contains(color))
            this.color = color;
        else
            throw new IllegalArgumentException("Color inválido, los válidos son: " +
                    "rojo y negro");
    }


    public String getValor() {
        return Valor;
    }

    public static List<String> getvalidValor(){
        return Arrays.asList("A","2","3","4","5","6","7","8","9","10","J","Q","K");
    }

    /**
     * Opciones válidas de la cara serán
     * @param valor a,2,3,4,5,6,7,8,9,10,j,q,k
     *             Cualquier otra opción  puesta va a dar error
     */

    public void setValor(String valor) {
        List<String> validValor = getvalidValor();
        valor = valor.toUpperCase(); //pa' evitarnos problemas

        if (validValor.contains(valor))
            this.Valor = valor;
        else
            throw new IllegalArgumentException("Carta inválida, las válidas son: " +
                    "A,2,3,4,5,6,7,8,9,10,J,Q,K");
    }

    public String getPalo() {
        return palo;
    }
    public static List<String> getvalidpalos(){
        return Arrays.asList("corazones", "diamantes", "espadas", "tréboles");
    }

    public void setPalo(String palo) {
        List<String> validpalo = getvalidpalos();
        palo = palo.toLowerCase(); //pa' evitarnos problemas

        if (validpalo.contains(palo))
            this.palo = palo;
        else
            throw new IllegalArgumentException("los palos válidos son: " +
                "corazones diamantes espadas y tréboles");
    }

    public String toString(){
        return String.format("%s de %s color %s", Valor, palo, color);
    }
}
