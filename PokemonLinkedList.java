package PokePal_Proje;

import PokePal_Proje.Pokemon;
import PokePal_Proje.PokemonNode;

class PokemonLinkedList {
    private PokemonNode head;
    private PokemonNode current;
    public PokemonLinkedList() {
        head = null;
        current =head;
    }

    public void addPokemon(Pokemon pokemon) {
        PokemonNode newNode = new PokemonNode(pokemon);
        if (head == null) {
            head = newNode;
        } else {
            PokemonNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public PokemonNode getHead() {
        return head;
    }


public Pokemon DisplayPokemon(int pokedexID) {  
    current =head;
	while (current != null) {
        if (current.getPokemon().getPokedexID() == pokedexID) {
            return current.getPokemon();
        } else {
            current = current.getNext();
        }
    }
    return null;
}






}//


 