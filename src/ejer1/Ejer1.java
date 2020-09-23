
package ejer1;

import javax.swing.JOptionPane;


public class Ejer1 {

    public static void main(String[] args) {
        
        int n,opcion,s_actual,c_libre,n_depositos,n_retiros,deposito,retiro;
        int stock=2000,c_stock=3500,contar_dep=0,contar_ret=0;
        
        opcion=Integer.parseInt(JOptionPane.showInputDialog("\t BIENVENIDO A AL ALMACEN DE BOLSAS DE CEMENTOS\n:"
                + "-La capacidad del stock del almacen es: 3500 bolsas.\n"
                + "-Stock actual es 2000 bolsas.\n"
                + "MENU:\n "
                + "1.Deposito.\n"
                + "2.Retiro.\n"
                + "3.salir.\n"));
        switch(opcion){
            case 1: ;n_depositos=Integer.parseInt(JOptionPane.showInputDialog( "Digite cuantos depositos va a realizar: "));
                
                for(int i=0;i<n_depositos;i++){
                    do{
                       deposito=Integer.parseInt(JOptionPane.showInputDialog( (i+1)+". Digite cuanto va a depositar tiene q ser menor a 1500 bolsas: "));
                               }while(deposito>1500);
                       s_actual=stock+deposito;
                       c_libre=c_stock-s_actual;
                       
                       
                       JOptionPane.showMessageDialog(null, "El stock actual es: "+s_actual);
                       JOptionPane.showMessageDialog(null, "La capacidad libre es: "+c_libre);
            
                    contar_dep++;
                }
                JOptionPane.showMessageDialog(null, "El numero de depositos es: "+contar_dep);break;
                
            case 2: n_retiros=Integer.parseInt(JOptionPane.showInputDialog( "Digite cuantos retiros va a realizar: "));
             
            for(int i=0;i<n_retiros;i++){
                do{
                       retiro=Integer.parseInt(JOptionPane.showInputDialog( (i+1)+". Digite cuanto va a retirar,tiene q ser menor a 2000 bolsas: "));
                               }while(retiro>2000);
                
                s_actual=stock-retiro;
                c_libre=c_stock-s_actual;
                contar_ret++;
            JOptionPane.showMessageDialog(null, "El stock actual es: "+s_actual);
            JOptionPane.showMessageDialog(null, "La capacidad libre es: "+c_libre);
            }
            JOptionPane.showMessageDialog(null, "El numero de retiros es: "+contar_ret);break;
            
            
            case 3:break;
            
            
        }
        
        
        
        
        
        
        
    }
    
}
