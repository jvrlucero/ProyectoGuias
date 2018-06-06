
package Guia2;

import Guia5.Guia5_2_Menu;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Guia2 extends javax.swing.JFrame {

    public Guia2() {
        Menu();
    }
    @SuppressWarnings("unchecked")
    
    int selector;
    int index=0;
    String registro[]=new String[10];
    private void Menu(){
        String caTCH="";
        do{
            selector=4;
            try{
                try{                  
                caTCH=JOptionPane.showInputDialog("Ingrese una de las siguientes opciones:\n  1   Ingresar datos\n"
                        + "  2   Ordenar los datos\n  3   Mostrar los datos\n  4   Salir");
                selector=Integer.parseInt(caTCH);
                } catch(Exception e){
                    selector=0;
                    if((caTCH.length()==0)||(caTCH==null)||(caTCH.equals(""))){
                        this.dispose();
                        Salir();
                    }
                }
                if(selector!=1&&selector!=2&&selector!=3&&selector!=4)
                    JOptionPane.showMessageDialog(this, "Ingrese un número valido");
            } catch(Exception e){
                selector=4;
            }
            if(selector==1)
                IngresarDatos();
            if(selector==2)
                OrdenarDatos();
            if(selector==3)
                MostrarDatos();            
        }while(selector!=4);
        
        if(selector==4){
            Salir();
            Guia5_2_Menu Menu=new Guia5_2_Menu();
            Menu.setVisible(true);
        }
            
    }
    private void IngresarDatos(){
        String in="";
        if(index<10){
        do{
            try{
                in=JOptionPane.showInputDialog("Ingrese el dato"); 
                if(in=="")
                    in="↨";
                else if(in==null)
                    in="↨";
            } catch(Exception e){
                in="↨";
            }
        }while(!ComprobarCadena(in)&&index<9);        
        if(in!="↨")        
            registro[index]=in;
            index++;
            JOptionPane.showMessageDialog(this, "Registrado exitosamente");             
        } else     
            JOptionPane.showMessageDialog(this, "Registro lleno"); 
    }
    private void OrdenarDatos(){ 
        boolean C_ordeno=true;
        String[] regis={"Pepe", "Juan", "Alex","Julian", "Francisco", "Luis","Shepe","Oscar","Walter","Abi"};
        if(registro[0]==null){
            JOptionPane.showMessageDialog(this, "No hay ningun dato");
            C_ordeno=false;
        }     
        else if(registro[1]==null){
            JOptionPane.showMessageDialog(this, "Solo hay un dato xD"); 
            C_ordeno=false;
        }
        else if(registro[2]==null) 
            ProcesadoDeOrden2datos();
        else if(registro[3]==null) 
            ProcesadoDeOrden3datos();
        else if(registro[4]==null) 
            ProcesadoDeOrden4datos();
        else if(registro[5]==null) 
            ProcesadoDeOrden5datos();
        else if(registro[6]==null) 
            ProcesadoDeOrden6datos();
        else if(registro[7]==null) 
            ProcesadoDeOrden7datos();
        else if(registro[8]==null) 
            ProcesadoDeOrden8datos();
        else if(registro[9]==null) 
            ProcesadoDeOrden9datos();
        else if(registro[9]!=null) 
            ProcesadoDeOrden10datos();
        if(C_ordeno==true)
            JOptionPane.showMessageDialog(this, "Los datos han sido ordenados");
            
    }
    private void ProcesadoDeOrden2datos(){
        String[] temp={registro[0],registro[1]};
        Arrays.sort(temp);
        registro[0]=temp[0];
        registro[1]=temp[1];        
    }    
    private void ProcesadoDeOrden3datos(){
        String[] temp={registro[0],registro[1],registro[2]};
        Arrays.sort(temp);
        registro[0]=temp[0];
        registro[1]=temp[1];
        registro[2]=temp[2];        
    }    
    private void ProcesadoDeOrden4datos(){
        String[] temp={registro[0],registro[1],registro[2],registro[3]};
        Arrays.sort(temp);
        registro[0]=temp[0];
        registro[1]=temp[1];
        registro[2]=temp[2]; 
        registro[3]=temp[3];        
    }    
    private void ProcesadoDeOrden5datos(){
        String[] temp={registro[0],registro[1],registro[2],registro[3],registro[4]};
        Arrays.sort(temp);
        registro[0]=temp[0];
        registro[1]=temp[1];
        registro[2]=temp[2]; 
        registro[3]=temp[3]; 
        registro[4]=temp[4];        
    }    
    private void ProcesadoDeOrden6datos(){
        String[] temp={registro[0],registro[1],registro[2],registro[3],registro[4],registro[5]};
        Arrays.sort(temp);
        registro[0]=temp[0];
        registro[1]=temp[1];
        registro[2]=temp[2]; 
        registro[3]=temp[3]; 
        registro[4]=temp[4]; 
        registro[5]=temp[5];        
    }    
    private void ProcesadoDeOrden7datos(){
        String[] temp={registro[0],registro[1],registro[2],registro[3],registro[4],registro[5],registro[6]};
        Arrays.sort(temp);
        registro[0]=temp[0];
        registro[1]=temp[1];
        registro[2]=temp[2]; 
        registro[3]=temp[3]; 
        registro[4]=temp[4]; 
        registro[5]=temp[5];  
        registro[6]=temp[6];       
    }    
    private void ProcesadoDeOrden8datos(){
        String[] temp={registro[0],registro[1],registro[2],registro[3],registro[4],registro[5],registro[6],registro[7]};
        Arrays.sort(temp);
        registro[0]=temp[0];
        registro[1]=temp[1];
        registro[2]=temp[2]; 
        registro[3]=temp[3]; 
        registro[4]=temp[4]; 
        registro[5]=temp[5];  
        registro[6]=temp[6];  
        registro[7]=temp[7];       
    }    
    private void ProcesadoDeOrden9datos(){
        String[] temp={registro[0],registro[1],registro[2],registro[3],registro[4],registro[5],registro[6],registro[7],registro[8]};
        Arrays.sort(temp);
        registro[0]=temp[0];
        registro[1]=temp[1];
        registro[2]=temp[2]; 
        registro[3]=temp[3]; 
        registro[4]=temp[4]; 
        registro[5]=temp[5];  
        registro[6]=temp[6];  
        registro[7]=temp[7];   
        registro[8]=temp[8];       
    }    
    private void ProcesadoDeOrden10datos(){
        String[] temp={registro[0],registro[1],registro[2],registro[3],registro[4],registro[5],registro[6],registro[7],registro[8],registro[9]};
        Arrays.sort(temp);
        registro[0]=temp[0];
        registro[1]=temp[1];
        registro[2]=temp[2]; 
        registro[3]=temp[3]; 
        registro[4]=temp[4]; 
        registro[5]=temp[5];  
        registro[6]=temp[6];  
        registro[7]=temp[7];   
        registro[8]=temp[8];   
        registro[9]=temp[9];        
    }
    private void MostrarDatos(){
        String resume="";
        for(int y=0;y<10;y++)
            if(registro[y]!=null)
                resume+=registro[y]+"\n";
        if(resume.equals(""))
            resume="No hay datos";
        JOptionPane.showMessageDialog(this, resume);
        
    }    
    private boolean ComprobarCadena(String cadena){
        boolean res=true;
        int x;
        if(cadena!="↨")
        try{
            x=-1;
            do{
                x++;
            }while(Character.isLetter(cadena.charAt(x))&&(x<(cadena.length()-1)));
            
            if(cadena.length()>10){               
                JOptionPane.showMessageDialog(this, "Ingrese hasta 10 letras");
                res=false;
            } else if(!Character.isLetter(cadena.charAt(x--))){
                JOptionPane.showMessageDialog(this, "Por favor ingrese sólo letras"); 
                res=false;
            }
            
        }catch(Exception e){
            if(cadena!="↨"){
            JOptionPane.showMessageDialog(this, "Error");             
            res=false;}
            
        } else if(cadena=="↨")
                res=true;
        return res;
    }
    private void Salir(){
        this.dispose();
    }
    public static void main(String args[]) {java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guia2().setEnabled(false);
            }
        }
    );    
    }
    
}
