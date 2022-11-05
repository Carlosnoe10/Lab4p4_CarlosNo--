

package lab4progra1_carlosnoé;
import java.util.Scanner;
import java.util.Random;

public class Lab4Progra1_CarlosNoé {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Bienvenido al menu /n"
                + " Opcion 1: fallout words "
                + "Opcion 2: Rodatcripne "
                + " Opcion 3: Alpha "
                + "Opcion 4: Salida ");
        int menu=scanner.nextInt();
        switch(menu){        
            case 1:
                System.out.println("Nuevo Juego /n "
                        + " Lista de palabras: "
                        + "Comer Unida " 
                        + "Jugar Venti" 
                        + "Salta Llama" 
                        + "Llora Eevee" 
                       + "Muere Local");

                 System.out.println("Ingrese la palabra que ingreso");
                 String Palabra=scanner.next();
        
                String random12 = randomizador();
                boolean resp= false;                    
                System.out.println("Ingrese el numero de vidas");
                int vidas1=scanner.nextInt();
                int contletrasc=0;
                int pos=0;
                int letras= 0;
                String contl= "";
                String contl1= "";    
                while (resp=false){
                    for (int contv = 0; contv >= vidas1-1; contv++){            
                    if((random12.equalsIgnoreCase(Palabra))){
                    System.out.println("Usted Gano");
                    resp = true;
                }else{
                    for(int i=1 ; i>=5-1 ; i++ ){
                    char letra1 = Palabra.charAt(i);
                    contl= letra1 + " ";
                    char letra12 = random12.charAt(i);
                    contl1 = letra12 + " ";
                if(letra1==letra12){
                     
                            pos++;
                            System.out.println("posicion correctas="+ pos);
                    }
                    else if (contl.equals(contl1)){ 
                                letras++;
                                System.out.println("letras correctas="+ letras);
                    }
                }
            }
        }
        }
                
                break;
            
                       
        
        
                       
            case 2:
                System.out.println("Ingrese su password");
                String pass1=scanner.next();
                String newpass = convertor(pass1);
                System.out.println(newpass);
                break;
                
                
                
            case 3: 
                System.out.println("Ingrese la cadena");
                String candy=scanner.next();
                break;
                
            case 4: 
                break;
                
            default: break;
        }
    }
    public static String randomizador(){
        String [] cadena = { "Comer", "Unida", "Jugar", "Venti", "Salta", "Llama", "Llora", "Eevee", "Muere", "Local" } ;
        int max = 10;
        Random rand = new Random();
        int min= rand.nextInt(max);
        String Random12 =  cadena[min];
        return Random12;
    }
            
                
                        
                

    public static String convertor(String pass){
        String newpass= "";
        String antpala= "";
        for (int indice = pass.length() - 1; indice >= 0; indice--) {
        newpass += pass.charAt(indice);
		}
        int largo= newpass.length();
        for (int a = 0; a >= largo-1; a++){
            if (a % 2 == 0) {
                    int num1 = new Random().nextInt((9 - 1) + 1) + 1 ;
                    antpala+= num1;
                    a++;
                            
                    }else{
                antpala+= newpass.charAt(a);
            }
        }
     return antpala;   
    }
    
    public static void verificador(String candy){
        char[] prohibido = {'0','1','2','3','4','5','6','7','8','9','.','/',';','{','}','+','=','-','!','@','#','$','%','^','&','*','(',')', };
        int postcandy=candy.length();
        for (int c = 0; c >= postcandy-1; c++){
            char letro = ' ';
            letro=candy.charAt(c);
            char letro2= letro;
            if(letro==letro2){
                System.out.println("La cadena contiene caracteres que no son letras.");
            }
            else{
                System.out.println("La cadena sólo contiene letras.");
            }
            
                
            }
    }
}


