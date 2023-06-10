package PokePal_Proje;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.temporal.TemporalAmount;


public class PokePal {

	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Scanner bruh = new Scanner(System.in);
		
		Pokemon Bulbasaur = new Pokemon("Bulbasaur", "grass", 1, "A strange seed was planted on its back at birth. The plant sprouts and grows with this POKéMON.");
		Pokemon Ivysaur = new Pokemon("Ivysaur", "grass", 2, "When the bulb on its back grows large, it appears to lose the ability to stand on its hind legs.");
		Pokemon Venusaur = new Pokemon("Venusaur", "grass", 3, "The plant blooms when it is absorbing solar energy. It stays on the move to seek sunlight.");
		Pokemon Charmander = new Pokemon("Charmander", "fire", 4, "Obviously prefers hot places. When it rains, steam is said to spout from the tip of its tail.");
		Pokemon Charmeleon = new Pokemon("Charmeleon", "fire", 5, "When it swings its burning tail, it elevates the temperature to unbearably high levels.");
		Pokemon Charizard = new Pokemon("Charizard", "fire", 6, "Spits fire that is hot enough to melt boulders. Known to cause forest fires unintentionally.");
		Pokemon Squirtle = new Pokemon("Squirtle", "water", 7, "After birth, its back swells and hardens into a shell. Powerfully sprays foam from its mouth.");
		Pokemon Wartortle = new Pokemon("Wartortle", "water", 8, "Often hides in water to stalk unwary prey. For swimming fast, it moves its ears to maintain balance.");
		Pokemon Blastoise = new Pokemon("Blastoise", "water", 9, "A brutal POKéMON with pressurized water jets on its shell. They are used for high-speed tackles.");
		Pokemon Caterpie = new Pokemon("Caterpie", "bug", 10, "Its short feet are tipped with suction pads that enable it to tirelessly climb slopes and walls.");
		Pokemon Metapod = new Pokemon("Metapod", "bug", 11, "This POKéMON is vulnerable to attack while its shell is soft, exposing its weak and tender body.");
		Pokemon Butterfree = new Pokemon("Butterfree", "bug", 12, "In battle, it flaps its wings at great speed to release highly toxic dust into the air.");
		Pokemon Weedle = new Pokemon("Weedle", "bug", 13, "Often found in forests, eating leaves. It has a sharp venomous stinger on its head.");
		Pokemon Kakuna = new Pokemon("Kakuna", "bug", 14, "Almost incapable of moving, this POKéMON can only harden its shell to protect itself from predators.");
		Pokemon Beedrill = new Pokemon("Beedrill", "bug", 15, "Flies at high speed and attacks using its large venomous stingers on its forelegs and tail.");
		Pokemon Pidgey = new Pokemon("Pidgey", "flying", 16, "A common sight in forests and woods. It flaps its wings at ground level to kick up blinding sand.");
		Pokemon Pidgeotto = new Pokemon("Pidgeotto", "flying", 17, "Very protective of its sprawling territorial area, this POKéMON will fiercely peck at any intruder.");
		Pokemon Pidgeot = new Pokemon("Pidgeot", "flying", 18, "This POKéMON flies at Mach 2 speed, seeking prey. Its large talons are feared as wicked weapons.");
		Pokemon Rattata = new Pokemon("Rattata", "normal", 19, "Bites anything when it attacks. Small and very quick, it is a common sight in many places.");
		Pokemon Raticate = new Pokemon("Raticate", "normal", 20, "Its hind feet are webbed. They act as flippers, so it can swim in rivers and hunt for prey.");
		Pokemon Spearow = new Pokemon("Spearow", "flying", 21, "Eats bugs in grassy areas. It has to flap its short wings at high speed to stay airborne.");
		Pokemon Fearow = new Pokemon("Fearow", "flying", 22, "With its huge and magnificent wings, it can keep aloft without ever having to land for rest.");
		Pokemon Ekans = new Pokemon("Ekans", "poison", 23, "Moves silently and stealthily. Eats the eggs of birds, such as PIDGEY and SPEAROW, whole.");
		Pokemon Arbok = new Pokemon("Arbok", "poison", 24, "The frightening patterns on its belly have been studied. Six variations have been confirmed.");
		Pokemon Pikachu = new Pokemon("Pikachu", "electric", 25, "When several of these POKéMON gather, their electricity could build and cause lightning storms.");
		Pokemon Raichu = new Pokemon("Raichu", "electric", 26, "Its long tail serves as a ground to protect itself from its own high voltage power.");
		Pokemon Sandshrew = new Pokemon("Sandshrew", "ground", 27, "Burrows deep underground in arid locations far from water. It only emerges to hunt for food.");
		Pokemon Sandslash = new Pokemon("Sandslash", "ground", 28, "Curls up into a spiny ball when threatened. It can roll while curled up to attack or escape.");
		Pokemon NidoranF = new Pokemon("Nidoran♀", "poison", 29, "Although small, its venomous barbs render this POKéMON dangerous.");
		Pokemon Nidorina = new Pokemon("Nidorina", "poison", 30, "The female's horn develops slowly. Prefers physical attacks such as clawing and biting.");
		Pokemon Nidoqueen = new Pokemon("Nidoqueen", "poison", 31, "Its hard scales provide strong protection. It uses its hefty bulk to execute powerful moves.");
		Pokemon NidoranM = new Pokemon("Nidoran♂", "poison", 32, "Stiffens its ears to sense danger. The larger its horns, the more powerful its secreted venom.");
		Pokemon Nidorino = new Pokemon("Nidorino", "poison", 33, "An aggressive POKéMON that is quick to attack. The horn on its head secretes a powerful venom.");
		Pokemon Nidoking = new Pokemon("Nidoking", "poison", 34, "Its steel-like hide adds to its powerful tackle. Its horns are so hard, they can pierce a diamond.");
		Pokemon Clefairy = new Pokemon("Clefairy", "normal", 35, "Its magical and cute appeal has many admirers. It is rare and found only in certain areas.");
		Pokemon Clefable = new Pokemon("Clefable", "normal", 36, "A timid fairy POKéMON that is rarely seen. It will run and hide the moment it senses people.");
		Pokemon Vulpix = new Pokemon("Vulpix", "fire", 37, "At the time of birth, it has just one tail. The tail splits from its tip as it grows older.");
		Pokemon Ninetales = new Pokemon("Ninetales", "fire", 38, "Very smart and very vengeful. Grabbing one of its many tails could result in a 1000-year curse.");
		Pokemon Jigglypuff = new Pokemon("Jigglypuff", "normal", 39, "Uses its alluring eyes to enrapture its foe. It then sings a pleasing melody that lulls the foe to sleep.");
		Pokemon Wigglytuff = new Pokemon("Wigglytuff", "normal", 40, "The body is soft and rubbery. When angered, it will suck in air and inflate itself to an enormous size.");
		Pokemon Zubat = new Pokemon("Zubat", "poison", 41, "Emits ultrasonic cries while it flies. They act as a sonar used to check for obstacles.");
		Pokemon Golbat = new Pokemon("Golbat", "poison", 42, "Once it strikes, it will not stop draining energy from the victim even if it gets too heavy to fly.");
		Pokemon Oddish = new Pokemon("Oddish", "grass", 43, "During the day, it stays in the cold underground to avoid the sun. It grows by bathing in moonlight.");
		Pokemon Gloom = new Pokemon("Gloom", "grass", 44, "The smell from its drool-like syrup and the pollen on its petals are very powerful. Be careful.");
		Pokemon Vileplume = new Pokemon("Vileplume", "grass", 45, "Flaps its broad flower petals to scatter its poisonous pollen. The flapping sound is very loud.");
		Pokemon Paras = new Pokemon("Paras", "bug", 46, "Burrows to suck tree roots. The mushrooms on its back grow by drawing nutrients from the bug host.");
		Pokemon Parasect = new Pokemon("Parasect", "bug", 47, "A host-parasite pair in which the parasite mushroom has taken over the host bug. Prefers damp places.");
		Pokemon Venonat = new Pokemon("Venonat", "bug", 48, "Its eyes function as radar, enabling it to be active in darkness. The eyes can also shoot powerful beams.");
		Pokemon Venomoth = new Pokemon("Venomoth", "bug", 49, "The powdery scales on its wings are hard to remove. They also contain poison that leaks out on contact.");
		Pokemon Diglett = new Pokemon("Diglett", "ground", 50, "Lives about one yard underground where it feeds on plant roots. It sometimes appears above ground.");
		Pokemon Dugtrio = new Pokemon("Dugtrio", "ground", 51, "A team of triplets that can burrow over 60 MPH. Due to this, some people think it's an earthquake.");
		Pokemon Meowth = new Pokemon("Meowth", "normal", 52, "Appears to be more active at night. It loves round and shiny things. It can't stop from picking them up.");
		Pokemon Persian = new Pokemon("Persian", "normal", 53, "Although its fur has many admirers, it is tough to raise as a pet because of its fickle meanness.");
		Pokemon Psyduck = new Pokemon("Psyduck", "water", 54, "While lulling its enemies with its vacant look, this wily POKéMON will use psychokinetic powers.");
		Pokemon Golduck = new Pokemon("Golduck", "water", 55, "Often seen swimming elegantly by lakeshores. It is often mistaken for the Japanese monster, Kappa.");
		Pokemon Mankey = new Pokemon("Mankey","fighting", 56, "It’s unsafe to approach if it gets violently enraged for no reason and can’t distinguish friends from foes.");
		Pokemon Primeape = new Pokemon("Primeape", "fighting", 56, "Always furious and tenacious to boot. It will not abandon chasing its quarry until it is caught.");
		Pokemon Growlithe = new Pokemon("Growlithe", "fire", 57, "Very loyal. It will bark at those who approach its trainer unexpectedly and run them out of town.");
		Pokemon Arcanine = new Pokemon("Arcanine", "fire", 58, "The sight of it running over 6,200 miles in a single day and night has captivated many people.");
		Pokemon Poliwag = new Pokemon("Poliwag", "water", 59, "The direction of the spiral on the belly differs by area. It is more adept at swimming than walking.");
		Pokemon Poliwhirl = new Pokemon("Poliwhirl", "water", 60, "Capable of living in or out of water. When out of water, it sweats to keep its body slimy.");
		Pokemon Poliwrath = new Pokemon("Poliwrath", "water", 61, "An adept swimmer at both the front crawl and breaststroke. Easily overtakes the best human swimmers.");
		Pokemon Abra = new Pokemon("Abra", "psychic", 63, "Using its ability to read minds, it will identify impending danger and teleport to safety.");
		Pokemon Kadabra = new Pokemon("Kadabra", "psychic", 64, "It emits special alpha waves from its body that induce headaches just by being close.");
		Pokemon Alakazam = new Pokemon("Alakazam", "psychic", 65, "Its brain cells multiply continuously until it dies. As a result, it remembers everything.");
		Pokemon Machop = new Pokemon("Machop", "fighting", 66, "Loves to build its muscles. It trains in all styles of martial arts to become even stronger.");
		Pokemon Machoke = new Pokemon("Machoke", "fighting", 67, "The belt around its waist holds back its energy. Without it, this Pokémon would be unstoppable.");
		Pokemon Machamp = new Pokemon("Machamp", "fighting", 68, "Using its four arms to do incredibly powerful punches and grabs, it can KO opponents in one fell swoop.");
		Pokemon Bellsprout = new Pokemon("Bellsprout", "grass", 69, "Prefers hot and humid places. It ensnares tiny insects with its vines and devours them.");
		Pokemon Weepinbell = new Pokemon("Weepinbell", "grass", 70, "It spits out poisonpowder to immobilize the enemy and then finishes it with a spray of acid.");
		Pokemon Victreebel = new Pokemon("Victreebel", "grass", 71, "Said to live in huge colonies deep in jungles, although no one has ever returned from there.");
		Pokemon Tentacool = new Pokemon("Tentacool", "water", 72, "Drifts in shallow seas. Anglers who hook them by accident are often punished by its stinging acid.");
		Pokemon Tentacruel = new Pokemon("Tentacruel", "water",  73, "The tentacles are normally kept short. On hunts, they are extended to ensnare and immobilize prey.");
		Pokemon Geodude = new Pokemon("Geodude", "rock", 74, "Commonly found near mountain trails and the like. If you step on one by accident, it gets angry.");
		Pokemon Graveler = new Pokemon("Graveler", "rock", 75, "Rolls down slopes to move. It rolls over any obstacle without slowing or changing its direction.");
		Pokemon Golem = new Pokemon("Golem", "rock", 76, "Its boulder-like body is extremely hard. It can easily withstand dynamite blasts without taking damage.");
		Pokemon Ponyta = new Pokemon("Ponyta", "fire", 77, "Capable of jumping incredibly high. Its hooves and sturdy legs absorb the impact of a hard landing.");
		Pokemon Rapidash = new Pokemon("Rapidash", "fire", 78, "Very competitive, this Pokémon will chase anything that moves fast in the hopes of racing it.");
		Pokemon Slowpoke = new Pokemon("Slowpoke", "water", 79, "Incredibly slow and dopey. It takes 5 seconds for it to feel pain when under attack.");
		Pokemon Slowbro = new Pokemon("Slowbro", "water", 80, "The Shellder that latches onto Slowpoke's tail is said to feed on the host's leftover scraps.");
		Pokemon Magnemite = new Pokemon("Magnemite", "electric", 81, "Uses anti-gravity to stay suspended. Appears without warning and uses Thunder Wave and similar moves.");
		Pokemon Magneton = new Pokemon("Magneton", "electric",  82, "Generates strange radio signals. Exhibits an astonishingly sharp sense of direction.");
		Pokemon Farfetchd = new Pokemon("Farfetch'd", "flying", 83, "The plant stalk it holds is its weapon. The stalk is used like a sword to cut all sorts of things.");
		Pokemon Doduo = new Pokemon("Doduo",  "flying", 84, "A bird that makes up for its poor flying with its fast foot speed. Leaves giant footprints.");
		Pokemon Dodrio = new Pokemon("Dodrio", "flying", 85, "One of Doduo's split heads becomes a separate entity when it evolves. It can fly at speeds of up to 60 mph.");
		Pokemon Seel = new Pokemon("Seel", "water", 86, "The protruding horn on its head is very hard. It is used for bashing through thick ice.");
		Pokemon Dewgong = new Pokemon("Dewgong", "water",  87, "Stores thermal energy in its body. Swims at a steady 8 knots even in intensely cold waters.");
		Pokemon Grimer = new Pokemon("Grimer", "poison", 88, "Appears in filthy areas. Thrives by sucking up polluted sludge that is pumped out of factories.");
		Pokemon Muk = new Pokemon("Muk", "poison", 89, "Smells so awful, it can cause fainting. Through degeneration of its nose, it lost its sense of smell.");
		Pokemon Shellder = new Pokemon("Shellder", "water", 90, "Clamps onto prey with its shell and injects poison into the prey's body. Its favorite food is slowpoke tails.");
		Pokemon Cloyster = new Pokemon("Cloyster", "water", 91, "For protection, it uses its harder-than-diamonds shell. It also shoots spikes from the shell.");
		Pokemon Gastly = new Pokemon("Gastly", "ghost", 92, "Almost invisible, this gaseous Pokémon cloaks the target and puts it to sleep without notice.");
		Pokemon Haunter = new Pokemon("Haunter", "ghost", 93, "Because of its ability to slip through block walls, it is said to be from another dimension.");
		Pokemon Gengar = new Pokemon("Gengar", "ghost",  94, "Under a full moon, this Pokémon likes to mimic the shadows of people and laugh at their fright.");
		Pokemon Onix = new Pokemon("Onix", "rock", 95, "As it digs through the ground, it absorbs many hard objects. This is what makes its body so solid.");
		Pokemon Drowzee = new Pokemon("Drowzee", "psychic", 96, "Puts enemies to sleep then eats their dreams. Occasionally gets sick from eating bad dreams.");
		Pokemon Hypno = new Pokemon("Hypno", "psychic", 97, "When it locks eyes with an enemy, it will use a mix of PSI moves such as Hypnosis and Confusion.");
		Pokemon Krabby = new Pokemon("Krabby", "water", 98, "Its pincers are not only powerful weapons, they are used for balance when walking sideways.");
		Pokemon Kingler = new Pokemon("Kingler", "water", 99, "The larger pincer has 10,000-horsepower crushing force. However, its huge size makes it unwieldy to use.");
		Pokemon Voltorb = new Pokemon("Voltorb", "electric", 100, "Usually found in power plants. Easily mistaken for a Poké Ball, they have zapped many people.");
		Pokemon Electrode = new Pokemon("Electrode", "electric", 101, "It explodes in response to even minor stimuli. It is feared, with the nickname of 'The Bomb Ball'.");
		Pokemon Exeggcute = new Pokemon("Exeggcute", "grass", 102, "The heads attract each other and spin around. There must be 6 heads for it to maintain balance.");
		Pokemon Exeggutor = new Pokemon("Exeggutor", "grass", 103, "The taller the Exeggutor, the more violent its headaches. Its three heads think independently.");
		Pokemon Cubone = new Pokemon("Cubone", "ground", 104, "Wears the skull of its deceased mother. Its cries echo inside the skull and come out as a sad melody.");
		Pokemon Marowak = new Pokemon("Marowak", "ground", 105, "The bone it holds is its key weapon. It throws the bone skillfully like a boomerang to KO targets.");
		Pokemon Hitmonlee = new Pokemon("Hitmonlee", "fighting", 106, "When in a hurry, its legs lengthen progressively. It runs smoothly with extra long, loping strides.");
		Pokemon Hitmonchan = new Pokemon("Hitmonchan", "fighting", 107, "The spirit of a boxer has been implanted in its genes. It throws punches that are faster than a bullet train.");
		Pokemon Lickitung = new Pokemon("Lickitung", "normal", 108, "Its tongue can be extended like a chameleon's. It leaves a tingling sensation when it licks enemies.");
		Pokemon Koffing = new Pokemon("Koffing", "poison", 109, "Because it stores several kinds of toxic gases in its body, it is prone to exploding without warning.");
		Pokemon Weezing = new Pokemon("Weezing", "poison", 110, "Where two kinds of poison gases meet, two Koffings can fuse into a Weezing over many years.");
		Pokemon Rhyhorn = new Pokemon("Rhyhorn", "rock",  111, "Its massive bones are 1000 times harder than human bones. It can easily knock a trailer flying.");
		Pokemon Rhydon = new Pokemon("Rhydon", "ground", 112, "Protected by an armor-like hide, it is capable of living in molten lava of 3,600 degrees Fahrenheit.");
		Pokemon Chansey = new Pokemon("Chansey", "normal", 113, "A rare and elusive Pokémon that is said to bring happiness to those who manage to catch it.");
		Pokemon Tangela = new Pokemon("Tangela", "grass", 114, "The vines that cloak its entire body are always jiggling. They become more jumbled the older the Pokémon gets.");
		Pokemon Kangaskhan = new Pokemon("Kangaskhan", "normal", 115, "The infant rarely ventures out of its mother's protective pouch until it is 3 years old.");
		Pokemon Horsea = new Pokemon("Horsea", "water", 116, "It makes its nest in the shade of corals. If it senses danger, it spits murky ink and flees.");
		Pokemon Seadra = new Pokemon("Seadra", "water", 117, "Touching the back fin causes numbness. It hooks its tail to coral to stay in place while sleeping.");
		Pokemon Goldeen = new Pokemon("Goldeen", "water", 118, "Its dorsal, pectoral, and tail fins wave elegantly in water. That is why it is known as the Water Dancer.");
		Pokemon Seaking = new Pokemon("Seaking", "water", 119, "In the autumn spawning season, they can be seen swimming powerfully up rivers and creeks.");
		Pokemon Staryu = new Pokemon("Staryu", "water", 120, "An enigmatic Pokémon that can effortlessly regenerate any appendage that is lost in battle.");
		Pokemon Starmie = new Pokemon("Starmie", "water", 121, "Its central core glows with the seven colors of the rainbow. Some people value the core as a gem.");
		Pokemon MrMime = new Pokemon("Mr. Mime", "psychic",  122, "If interrupted while it is miming, it will slap around the offender with its broad hands.");
		Pokemon Scyther = new Pokemon("Scyther", "bug", 123, "With ninja-like agility and speed, it can create the illusion that there is more than one.");
		Pokemon Jynx = new Pokemon("Jynx",  "psychic", 124, "It seductively wiggles its hips as it walks. It can cause people to dance in unison with it.");
		Pokemon Electabuzz = new Pokemon("Electabuzz", "electric", 125, "When a storm arrives, gangs of this Pokémon compete with each other to scale heights that are likely to be stricken by lightning bolts.");
		Pokemon Magmar = new Pokemon("Magmar", "fire", 126, "Born in an active volcano. Its body is always cloaked in flames, so it looks like a big ball of fire.");
		Pokemon Pinsir = new Pokemon("Pinsir", "bug", 127, "Its large, powerful pincers are strong enough to shatter thick logs. It can use a guillotine-like move to chop down trees.");
		Pokemon Tauros = new Pokemon("Tauros", "normal", 128, "A wild, rampaging Pokémon that is said to be unbeatable in battle. It is fiercely territorial.");
		Pokemon Magikarp = new Pokemon("Magikarp", "water", 129, "A pathetic excuse for a Pokémon that is only capable of flopping and splashing. This behavior prompted scientists to undertake research into it.");
		Pokemon Gyarados = new Pokemon("Gyarados", "water",  130, "It has an extremely aggressive nature. The Hyper Beam it shoots from its mouth totally incinerates all targets.");
		Pokemon Lapras = new Pokemon("Lapras", "water",  131, "A gentle soul that can read the minds of people. It can ferry people across the sea on its back.");
		Pokemon Ditto = new Pokemon("Ditto", "normal", 132, "When it spots an enemy, its body transforms into an almost-perfect copy of its opponent.");
		Pokemon Eevee = new Pokemon("Eevee", "normal", 133, "Its genetic code is irregular. It may mutate if it is exposed to radiation from element STONEs.");
		Pokemon Vaporeon = new Pokemon("Vaporeon", "water", 134, "Lives close to water. Its long tail is ridged with a fin which is often mistaken for a mermaid's.");
		Pokemon Jolteon = new Pokemon("Jolteon", "electric", 135, "It accumulates negative ions in the atmosphere to blast out 10000-volt lightning bolts.");
		Pokemon Flareon = new Pokemon("Flareon", "fire", 136, "When storing thermal energy in its body, its temperature could soar to over 1600 degrees.");
		Pokemon Porygon = new Pokemon("Porygon", "normal", 137, "A Pokémon that consists entirely of programming code. Capable of moving freely in cyberspace.");
		Pokemon Omanyte = new Pokemon("Omanyte", "rock",  138, "An ancient Pokémon that lived in the sea, it was restored from an ancient fossil. It swam by undulating the 10 tentacles around its mouth.");
		Pokemon Omastar = new Pokemon("Omastar", "rock",  139, "Sharp beaks ring its mouth. Its shell was too big for it to move freely, so it became extinct.");
		Pokemon Kabuto = new Pokemon("Kabuto",  "water", 140, "This Pokémon lived in ancient times. On rare occasions, it has been discovered as a living fossil.");
		Pokemon Kabutops = new Pokemon("Kabutops",  "water", 141, "A slim and fast swimmer. It slices its prey with its sharp sickles and drinks the body fluids.");
		Pokemon Aerodactyl = new Pokemon("Aerodactyl", "rock",  142, "A ferocious, prehistoric Pokémon that goes for the enemy's throat with its serrated, saw-like fangs.");
		Pokemon Snorlax = new Pokemon("Snorlax", "normal", 143, "Very lazy. Just eats and sleeps. As its rotund bulk builds, it becomes steadily more slothful.");
		Pokemon Articuno = new Pokemon("Articuno", "ice", 144, "A legendary bird Pokémon that is said to appear to doomed people who are lost in icy mountains.");
		Pokemon Zapdos = new Pokemon("Zapdos", "electric",145, "This legendary bird Pokémon is said to appear when the sky turns dark and lightning showers down.");
		Pokemon Moltres = new Pokemon("Moltres", "fire", 146, "It is said to be the legendary bird Pokémon of fire. Everytime it flaps its blazing wings, it creates dazzling flashes of flames.");
		Pokemon Dratini = new Pokemon("Dratini", "dragon", 147, "Long considered a mythical Pokémon until recently, when a small colony was found living underwater.");
		Pokemon Dragonair = new Pokemon("Dragonair", "dragon", 148, "A mystical Pokémon that exudes a gentle aura. Has the ability to change climate conditions.");
		Pokemon Dragonite = new Pokemon("Dragonite", "dragon", 149, "It is said that somewhere in the ocean lies an island where these gather. Only they live there.");
		Pokemon Mewtwo = new Pokemon("Mewtwo", "psychic", 150, "It was created by a scientist after years of horrific gene splicing and DNA engineering experiments.");
		Pokemon Mew = new Pokemon("Mew", "psychic", 151, "So rare that it is still said to be a mirage by many experts. Only a few people have seen it worldwide.");		
		
		
		PokemonLinkedList Pokedex = new PokemonLinkedList();
		TrainerTree tree = new TrainerTree();
		Pokedex.addPokemon(Bulbasaur);
		Pokedex.addPokemon(Ivysaur);
		Pokedex.addPokemon(Venusaur);
		Pokedex.addPokemon(Charmander);
		Pokedex.addPokemon(Charmeleon);
		Pokedex.addPokemon(Charizard);
		Pokedex.addPokemon(Squirtle);
		Pokedex.addPokemon(Wartortle);
		Pokedex.addPokemon(Blastoise);
		Pokedex.addPokemon(Caterpie);
		Pokedex.addPokemon(Metapod);
		Pokedex.addPokemon(Butterfree);
		Pokedex.addPokemon(Weedle);
		Pokedex.addPokemon(Kakuna);
		Pokedex.addPokemon(Beedrill);
		Pokedex.addPokemon(Pidgey);
		Pokedex.addPokemon(Pidgeotto);
		Pokedex.addPokemon(Pidgeot);
		Pokedex.addPokemon(Rattata);
		Pokedex.addPokemon(Raticate);
		Pokedex.addPokemon(Spearow);
		Pokedex.addPokemon(Fearow);
		Pokedex.addPokemon(Ekans);
		Pokedex.addPokemon(Arbok);
		Pokedex.addPokemon(Pikachu);
		Pokedex.addPokemon(Raichu);
		Pokedex.addPokemon(Sandshrew);
		Pokedex.addPokemon(Sandslash);
		Pokedex.addPokemon(NidoranF);
		Pokedex.addPokemon(Nidorina);
		Pokedex.addPokemon(Nidoqueen);
		Pokedex.addPokemon(NidoranM);
		Pokedex.addPokemon(Nidorino);
		Pokedex.addPokemon(Nidoking);
		Pokedex.addPokemon(Clefairy);
		Pokedex.addPokemon(Clefable);
		Pokedex.addPokemon(Vulpix);
		Pokedex.addPokemon(Ninetales);
		Pokedex.addPokemon(Jigglypuff);
		Pokedex.addPokemon(Wigglytuff);
		Pokedex.addPokemon(Zubat);
		Pokedex.addPokemon(Golbat);
		Pokedex.addPokemon(Oddish);
		Pokedex.addPokemon(Gloom);
		Pokedex.addPokemon(Vileplume);
		Pokedex.addPokemon(Paras);
		Pokedex.addPokemon(Parasect);
		Pokedex.addPokemon(Venonat);
		Pokedex.addPokemon(Venomoth);
		Pokedex.addPokemon(Diglett);
		Pokedex.addPokemon(Dugtrio);
		Pokedex.addPokemon(Meowth);
		Pokedex.addPokemon(Persian);
		Pokedex.addPokemon(Psyduck);
		Pokedex.addPokemon(Golduck);
		Pokedex.addPokemon(Mankey);
		Pokedex.addPokemon(Primeape);
		Pokedex.addPokemon(Growlithe);
		Pokedex.addPokemon(Arcanine);
		Pokedex.addPokemon(Poliwag);
		Pokedex.addPokemon(Poliwhirl);
		Pokedex.addPokemon(Poliwrath);
		Pokedex.addPokemon(Abra);
		Pokedex.addPokemon(Kadabra);
		Pokedex.addPokemon(Alakazam);
		Pokedex.addPokemon(Machop);
		Pokedex.addPokemon(Machoke);
		Pokedex.addPokemon(Machamp);
		Pokedex.addPokemon(Bellsprout);
		Pokedex.addPokemon(Weepinbell);
		Pokedex.addPokemon(Victreebel);
		Pokedex.addPokemon(Tentacool);
		Pokedex.addPokemon(Tentacruel);
		Pokedex.addPokemon(Geodude);
		Pokedex.addPokemon(Graveler);
		Pokedex.addPokemon(Golem);
		Pokedex.addPokemon(Ponyta);
		Pokedex.addPokemon(Rapidash);
		Pokedex.addPokemon(Slowpoke);
		Pokedex.addPokemon(Slowbro);
		Pokedex.addPokemon(Magnemite);
		Pokedex.addPokemon(Magneton);
		Pokedex.addPokemon(Farfetchd);
		Pokedex.addPokemon(Doduo);
		Pokedex.addPokemon(Dodrio);
		Pokedex.addPokemon(Seel);
		Pokedex.addPokemon(Dewgong);
		Pokedex.addPokemon(Grimer);
		Pokedex.addPokemon(Muk);
		Pokedex.addPokemon(Shellder);
		Pokedex.addPokemon(Cloyster);
		Pokedex.addPokemon(Gastly);
		Pokedex.addPokemon(Haunter);
		Pokedex.addPokemon(Gengar);
		Pokedex.addPokemon(Onix);
		Pokedex.addPokemon(Drowzee);
		Pokedex.addPokemon(Hypno);
		Pokedex.addPokemon(Krabby);
		Pokedex.addPokemon(Kingler);
		Pokedex.addPokemon(Voltorb);
		Pokedex.addPokemon(Electrode);
		Pokedex.addPokemon(Exeggcute);
		Pokedex.addPokemon(Exeggutor);
		Pokedex.addPokemon(Cubone);
		Pokedex.addPokemon(Marowak);
		Pokedex.addPokemon(Hitmonlee);
		Pokedex.addPokemon(Hitmonchan);
		Pokedex.addPokemon(Lickitung);
		Pokedex.addPokemon(Koffing);
		Pokedex.addPokemon(Weezing);
		Pokedex.addPokemon(Rhyhorn);
		Pokedex.addPokemon(Rhydon);
		Pokedex.addPokemon(Chansey);
		Pokedex.addPokemon(Tangela);
		Pokedex.addPokemon(Kangaskhan);
		Pokedex.addPokemon(Horsea);
		Pokedex.addPokemon(Seadra);
		Pokedex.addPokemon(Goldeen);
		Pokedex.addPokemon(Seaking);
		Pokedex.addPokemon(Staryu);
		Pokedex.addPokemon(Starmie);
		Pokedex.addPokemon(MrMime);
		Pokedex.addPokemon(Scyther);
		Pokedex.addPokemon(Jynx);
		Pokedex.addPokemon(Electabuzz);
		Pokedex.addPokemon(Magmar);
		Pokedex.addPokemon(Pinsir);
		Pokedex.addPokemon(Tauros);
		Pokedex.addPokemon(Magikarp);
		Pokedex.addPokemon(Gyarados);
		Pokedex.addPokemon(Lapras);
		Pokedex.addPokemon(Ditto);
		Pokedex.addPokemon(Eevee);
		Pokedex.addPokemon(Vaporeon);
		Pokedex.addPokemon(Jolteon);
		Pokedex.addPokemon(Flareon);
		Pokedex.addPokemon(Porygon);
		Pokedex.addPokemon(Omanyte);
		Pokedex.addPokemon(Omastar);
		Pokedex.addPokemon(Kabuto);
		Pokedex.addPokemon(Kabutops);
		Pokedex.addPokemon(Aerodactyl);
		Pokedex.addPokemon(Snorlax);
		Pokedex.addPokemon(Articuno);
		Pokedex.addPokemon(Zapdos);
		Pokedex.addPokemon(Moltres);
		Pokedex.addPokemon(Dratini);
		Pokedex.addPokemon(Dragonair);
		Pokedex.addPokemon(Dragonite);
		Pokedex.addPokemon(Mewtwo);
		Pokedex.addPokemon(Mew);
		
		
		 mainLoop: while (true) {
			 System.out.println("-----------------Welcome to PokePal!-----------------\nWhich function do you want to use?\n1->for registering yourself and your team by searching Pokemon!\n2->for searching registered trainers!\n3->for playing 'Fire-Water-Grass'!\n4->for exit");
            if (sc.hasNextInt()) {
                int hadi = sc.nextInt();

                if (hadi == 1) {
                   

                    System.out.println("------Welcome to the world of Pokemon, Trainer!------\nNow, what is your name?");
                    sc.nextLine();
                    String name = sc.nextLine();                   
                   
                   

                    Trainer trainer = new Trainer(name);

                    System.out.println("Which Pokemon would you like to see between 1-151?");
                    while (true) {
                        if (sc.hasNextInt()) {
                            int choice = sc.nextInt();

                            if (choice >= 1 && choice <= 151) {
                                Pokemon pokemon = Pokedex.DisplayPokemon(choice);

                                if (pokemon != null) {
                                    System.out.println(pokemon.toString());
                                    System.out.println("Would you like to add this Pokemon to your team?\n"
                                            + "yes -> 1\n"
                                            + "no -> 0");

                                    while (true) {
                                        if (sc.hasNextInt()) {
                                            int addChoice = sc.nextInt();
                                            if (addChoice == 1) {
                                                if (trainer.getTeam().size() < 6) {
                                                    trainer.addToTeam(pokemon);
                                                } else {
                                                    System.out.println("You cannot add more than 6 Pokemon to your team.");
                                                }
                                                break;
                                            } else if (addChoice == 0) {
                                                System.out.println("OK, no Pokemon added to the team.");
                                                break;
                                            } else {
                                                System.out.println("Invalid input. Please enter 1 for yes and 0 for no.");
                                            }
                                        } else {
                                            System.out.println("Invalid input. Please enter an integer.");
                                            sc.next();
                                        }
                                    }

                                    System.out.println("Would you like to see another Pokemon?\n"
                                            + "yes -> 1\n"
                                            + "no -> 0");

                                    while (true) {
                                        if (sc.hasNextInt()) {
                                            int dewam = sc.nextInt();
                                            sc.nextLine();
                                            if (dewam == 0) {
                                                
                                                System.out.println("Thanks for using our Pokedex!");
                                                trainer.displayTeam();   
                                               System.out.println("Would you like to remove a Pokemon ?yes->1\nno->0");
                                             while(true) {
                                            	 if(sc.hasNextInt()) {
                                            		 int secim = sc.nextInt();
                                            		 if(secim==1) {
                                            			if(trainer.getTeam().size()==0) {
                                            				System.out.println("Your team is already empty.");
                                            				break;
                                            			}
                                            			else {
                                            				System.out.println("Which Pokemon you like to remove?\n----Warning Trainer!----\nPokemon Legaue has decided that Trainers can only remove one Pokemon ever.Because remember Pokemon are our friends and loosing a Pokemon's trust is something we should avoide as Pokemon trainers. ");
                                            				 trainer.displayTeam();
                                                 			int bye = sc.nextInt();
                                                 			trainer.removeFromTeam(bye-1);
                                                 			trainer.displayTeam();
                                                 			break;
                                            			}
                                        			
                                            		 }//1se
                                            		 
                                            		 else if(secim==0) {
                                            			System.out.println("Yeah it's hard to say goodbye to your Pokemon...");
                                            			break;
                                            		 }
                                            		 else {
                                            			 System.out.println("Invalid input; enter 1 for yes, 0 for no.");
                                            			 
                                            		 }
                                            		 
                                            	 }//ifhasint
                                            	 else {
                                            		 System.out.println("Invalid input,please enter an integar.");
                                            		 sc.next();
                                            	 }
                                             }//while
                                             
                                               
                                               
                                                System.out.println("\n\n\n");
                                                tree.addTrainer(trainer);
                                                continue mainLoop;
                                               
                                            } else if (dewam == 1) {
                                                System.out.println("Which Pokemon would you like to see between 1-151?");
                                                break;
                                            } else {
                                                System.out.println("Invalid input. Please enter 1 for yes and 0 for no.");
                                            }
                                        } else {
                                            System.out.println("Invalid input. Please enter an integer.");
                                            sc.next();
                                        }
                                    }
                                }
                            } else {
                                System.out.println("Invalid input. Please enter an integer between 1-151.");
                            }
                        } else {
                            System.out.println("Invalid input. Please enter an integer.");
                            sc.next();
                        }
                    }

                }//if 1 
                else if (hadi == 2) {
                	
                	System.out.print("------Welcome to the TrainerSearcher!------\nEnter the name of the trainer you want to search: ");
                	String searchName = bruh.nextLine();

                	// Search for the trainer
                	String trainerInfo = tree.searchTrainer(searchName);
                	System.out.println(trainerInfo);
                	if(trainerInfo !="Trainer not found.") {
                	System.out.print("Do you want to remove this trainer? (yes/no): ");
                	String confirm = bruh.nextLine();

                	while (!confirm.equalsIgnoreCase("yes") && !confirm.equalsIgnoreCase("no")) {
                	    System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                	    System.out.print("Do you want to remove this trainer? (yes/no): ");
                	    confirm = bruh.nextLine();
                	}

                	if (confirm.equalsIgnoreCase("yes")) {
                	    tree.removeTrainer(searchName);
                	    System.out.println("Trainer removed successfully.");
                	} else {
                	    System.out.println("Trainer removal canceled.");
                	    // Perform any additional actions or display messages as needed
                	}
                	}//iç if
                	
                    
                }//if 2
                else if (hadi == 3) {
                	Scanner scanner = new Scanner(System.in);
                	String[] choices = {"fire", "water", "grass"};
                	int userScore = 0;
                	int computerScore = 0;

                	System.out.println("-------Welcome to Fire-Water-Grass!-------\nRules are: Fire beats Grass, Water beats Fire, and Grass beats Water.");

                	while (userScore < 3 && computerScore < 3) {
                	    System.out.println("Enter your choice (fire, water, or grass):");
                	    String userChoice = scanner.nextLine().toLowerCase();
                	    String computerChoice = choices[(int) (Math.random() * 3)];

                	    System.out.println("Computer chooses: " + computerChoice);

                	    if (userChoice.equals(computerChoice)) {
                	        System.out.println("It's a tie!");
                	    } else if ((userChoice.equals("fire") && computerChoice.equals("grass"))
                	            || (userChoice.equals("water") && computerChoice.equals("fire"))
                	            || (userChoice.equals("grass") && computerChoice.equals("water"))) {
                	        System.out.println("You win this round!");
                	        userScore++;
                	    } else if ((computerChoice.equals("fire") && userChoice.equals("grass"))
                	            || (computerChoice.equals("water") && userChoice.equals("fire"))
                	            || (computerChoice.equals("grass") && userChoice.equals("water"))) {
                	        System.out.println("Computer wins this round!");
                	        computerScore++;
                	    } else {
                	        System.out.println("Invalid input! Please enter 'fire', 'water', or 'grass'.");
                	    }

                	    System.out.println("Your score: " + userScore);
                	    System.out.println("Computer score: " + computerScore);
                	    System.out.println();
                	}

                	if (userScore == 3) {
                	    System.out.println("Congratulations! You win the game!");
                	} else {
                	    System.out.println("Sorry, the computer wins the game!\n\n\n\n");
                	}

                } //if 3
                else if (hadi == 4) {
                    System.out.println("Thanks for using the PokePal!");
                    break;
                } //if4
                else {
                    System.out.println("Invalid input, please enter between 1-4.");
                }
            } else {
                System.out.println("Invalid input, please enter one of the given integers.");
                sc.next();
            }
        }//dış while
		
	    

	}//main

	

}//class

