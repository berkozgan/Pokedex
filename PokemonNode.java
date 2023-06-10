package PokePal_Proje;


class PokemonNode {
    private Pokemon pokemon;
    private PokemonNode next;
   
    
    public PokemonNode(Pokemon pokemon) {
        this.pokemon = pokemon;
        this.next = null;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public PokemonNode getNext() {
        return next;
    }

    public void setNext(PokemonNode next) {
        this.next = next;
    }
}
