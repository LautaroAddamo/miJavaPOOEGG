
package ejercicio9.Servicios;

import ejercicio9.Entidades.Matematica;


public class MatematicaServicio {
    public Matematica darValor(){
        Matematica nums = new Matematica();
        
        nums.setNumero1(Math.random()*10+1);
        nums.setNumero2(Math.random()*10+1);
        
        
        return nums;  
    }
    public double devolverMayor(Matematica nums){
        double mayor = Math.max(nums.getNumero1(), nums.getNumero2());
        return mayor;
    }
    public void calcularPotencia(Matematica nums){
        double redon1, redon2, pot;
        redon1 = Math.round(nums.getNumero1());
        redon2 = Math.round(nums.getNumero2());
        if(redon1>redon2){
            pot = Math.pow(redon1, redon2);
            System.out.println(redon1+" elevado a "+redon2+ " es igual a "+pot);
        }
        else if(redon2>redon1){
            pot = Math.pow(redon2, redon1);
            System.out.println(redon2+" eleveado a "+redon1+ " es igual a "+pot);
        }
        
    }
    public void calcularRaiz(Matematica nums){
        int abs1, abs2;
        abs1 =(int) Math.abs(nums.getNumero1());
        abs2 = (int) Math.abs(nums.getNumero2());
        
        int min = Math.min(abs2, abs1);
        
        System.out.println("La raiz de " +min+" es "+Math.sqrt(min));
        
    }
    
}
