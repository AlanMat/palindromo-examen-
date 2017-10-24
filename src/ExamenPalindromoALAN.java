


 
import java.util.Stack;
public class ExamenPalindromoALAN {
public static void main(String[] args) {
        
        Resultado("555");
       
        Resultado("Ojo");
        
        Resultado("232");
        
        Resultado(" Oro");
        
        Resultado("Anita la gorda lagartona no traga la droga latina");
        
        Resultado("Ada");
       
        Resultado("Ata");
        
        Resultado("Somos");
        
        Resultado("707");
          
        Resultado("808");
        
        Resultado("Es genial ir ala escuela me agrada");
        
        Resultado("Todos los dias voy a correr");
          
        Resultado("Anilina");
        
        Resultado("ALAN MATA");
       
       
       
    }

    public  static  void Resultado(String Cadena){
        System.out.println(Cadena+" ¿.....el texto o palabra es polindromo......? "+palindromo(Cadena));
    }
 
 
    public  static  boolean palindromo(String Cadena){
       
        Stack<Character>pila=new Stack<>();
       
        for (int i=0; i<Cadena.length(); i++){
            pila.push(Cadena.charAt(i));
        }
        
        
        String CadenaInv="";
        while (!pila.empty()){
        CadenaInv+=pila.pop();
        }
        
        
            return  CadenaInv.equalsIgnoreCase(Cadena);

}
    
    
}
