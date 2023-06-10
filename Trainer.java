package PokePal_Proje;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

class Trainer {
	private String name;
   
   private ArrayList<Pokemon> team;
   
     
   
     
	public Trainer(String name) {
        this.name = name;
        
       this.team = new ArrayList<Pokemon>();
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addToTeam(Pokemon pokemon) {
        if (team.size() < 6) {
            team.add(pokemon);
            System.out.println(pokemon.getName() + " is added to " + name + "'s team.");
        } else {
            System.out.println(name + "'s team is full. Cannot add " + pokemon.getName() + ".");
        }
    }//addtoteam
	
	public void removeFromTeam(int index) {
        
		if (index < 0 || index >= team.size()) {
            System.out.println("Invalid index,try again later.");
            
        } else {
            Pokemon Pokemonremoved = team.remove(index);
            System.out.println(Pokemonremoved.getName() + " removed from " + name + "'s team.");
            
        }
    }//removeteam
	
	
	
	
	
	
	
	
@Override
	public String toString() {
		return "Trainer [name=" + name + "team=" + team + "]";
	}

public void displayTeam() {
	if (team.size()==0) {
		System.out.println(name + "'s team is empty.");
	}
	else {
		System.out.println(name + "'s team: ");
		for (int i = 0; i < team.size(); i++) {
			System.out.println((i + 1)  + ". " + team.get(i).getName());
		}
	}
}//diplayteam

public ArrayList<Pokemon> getTeam() {
	return team;
}

public void setTeam(ArrayList<Pokemon> team) {
	this.team = team;
}
   
}//class
