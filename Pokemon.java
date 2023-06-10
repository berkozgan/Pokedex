package PokePal_Proje;

public class Pokemon {
	 private String name;
	    private String type;
	    private int pokedexID;
	    private String description;

	    public Pokemon(String name, String type, int pokedexID, String description) {
	        this.name = name;
	        this.type = type;
	        this.pokedexID = pokedexID;
	        this.description = description;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getType() {
	        return type;
	    }

	    public int getPokedexID() {
	        return pokedexID;
	    }

	    public String getDescription() {
	        return description;
	    }

		@Override
		public String toString() {
			return "Pokemon [name=" + name + ", type=" + type + ", pokedexID=" + pokedexID + ", description=" + description
					+ "]";
		}

}
