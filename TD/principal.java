package TD;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.*;

public class principal {

    
    public static void main(String[] args)
    {
        
        Predicate<Paire<Integer, Double>> ttp = p -> p.fst < 100;
        Predicate<Paire<Integer, Double>> ttg = p -> p.fst > 200;
        Predicate<Paire<Integer, Double>> ti = ttp.or(ttg);
        Predicate<Paire<Integer, Double>> tc = ti.negate();
        Predicate<Paire<Integer, Double>> tl = p -> p.snd > 150.0;
        Predicate<Paire<Integer, Double>> pc = tl.negate();
        Predicate<Paire<Integer, Double>> accesAutorise = p-> tc.test(p) && pc.test(p);
        Paire<Integer,Double> paire= new Paire(120,150.0);
        Boolean resultatpetit=ttp.test(paire);
        System.out.println(resultatpetit);
        Boolean acceder=accesAutorise.test(paire);
        System.out.println(acceder);
    }
}



/*    Question 3 :
 *   function convertis un type en un autre type, par exemple le
 *   predicate convertis utype en boolean, cela permet de répondre à une question oui faux par rapport au parametre donné
 *   consumer prend un parametre et ne fait aucun retour, à utiliser si aucun retour n'est nécessaire par exemple pour faire un affichage.
 *   supplier permet de générer n'importe quel objet que l'on désire à partir d'aucun parametre, utile pour générer un nombre aléatoire par exemple
 */