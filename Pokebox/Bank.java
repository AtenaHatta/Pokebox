import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class Bank{
    
    TreeMap<String, Integer[][]> pokeStorage = new TreeMap<>();

    public Bank() {
        pokeStorage.put("pika", Pokemon.pika);
        pokeStorage.put("clefairy", Pokemon.clefairy);
        pokeStorage.put("voltorb", Pokemon.voltorb);
        pokeStorage.put("pidgey", Pokemon.pidgey);
        pokeStorage.put("charmander", Pokemon.charmander);
        pokeStorage.put("dratini", Pokemon.dratini);
    }

    public String checkBankStorage(){
        if(pokeStorage.size() == 0){
            return "Your do not have any POK'eMON in your bank";
        }else{
            String output = "";
            for(Map.Entry<String, Integer[][]> entry : pokeStorage.entrySet()){
                output += "\n - " + entry.getKey().toUpperCase();
            }
            return output;   
        }
    }


    public String releasePokemon(Scanner input) {
        System.out.println(checkBankStorage());

        System.out.print("Type the name here: ");
        String pokeName = input.next();

        Integer[][] releaseFromBank = pokeStorage.get(pokeName);

        if (releaseFromBank == null) {
            return "Your do not have any POK'eMON in your bank";
        } else {
            pokeStorage.remove(pokeName);
            return "\n\nYou released: " + pokeName.toUpperCase();
        }
    }
     


}