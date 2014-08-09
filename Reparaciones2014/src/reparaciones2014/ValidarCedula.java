
package reparaciones2014;
public class ValidarCedula {
    //metodo validar cedula RETORNA 1 CUANDO ES UNA CEDULA VERDADERA Y 0 EN CASO CONTRARIO
    public static int validacion(String numero){
        char car;
        int num,fact,sum,a,b,verifica,contar,p;
        sum=contar=p=0;
               
        if((numero.charAt(0)=='0'&&numero.charAt(1)=='1')||(numero.charAt(0)=='0'&&numero.charAt(1)=='2')
         ||(numero.charAt(0)=='0'&&numero.charAt(1)=='3')||(numero.charAt(0)=='0'&&numero.charAt(1)=='4')
         || (numero.charAt(0)=='0'&&numero.charAt(1)=='5')||(numero.charAt(0)=='0'&&numero.charAt(1)=='6')
         || (numero.charAt(0)=='0'&&numero.charAt(1)=='7')||(numero.charAt(0)=='0'&&numero.charAt(1)=='8') 
         ||(numero.charAt(0)=='0'&&numero.charAt(1)=='9') ||(numero.charAt(0)=='1'&&numero.charAt(1)=='0')      
         || (numero.charAt(0)=='1'&&numero.charAt(1)=='1')||(numero.charAt(0)=='1'&&numero.charAt(1)=='2')  
         || (numero.charAt(0)=='1'&&numero.charAt(1)=='3')|| (numero.charAt(0)=='1'&&numero.charAt(1)=='4') 
         || (numero.charAt(0)=='1'&&numero.charAt(1)=='5')|| (numero.charAt(0)=='1'&&numero.charAt(1)=='6')       
         || (numero.charAt(0)=='1'&&numero.charAt(1)=='7')|| (numero.charAt(0)=='1'&&numero.charAt(1)=='8')       
         || (numero.charAt(0)=='1'&&numero.charAt(1)=='9')|| (numero.charAt(0)=='2'&&numero.charAt(1)=='0')       
         || (numero.charAt(0)=='2'&&numero.charAt(1)=='1')|| (numero.charAt(0)=='2'&&numero.charAt(1)=='2')     
         || (numero.charAt(0)=='2'&&numero.charAt(1)=='3')|| (numero.charAt(0)=='2'&&numero.charAt(1)=='4'))
        {       
                
 
                
        for(int i=0;i<=numero.length()-2;i++){
            car=numero.charAt(i);
            num=car-48;
            if(numero.charAt(i)==numero.charAt(i+1)){
               contar++; 
            }
            if(i%2==0){
                fact=num*2;
                if(fact>=10){
                   fact-=9; 
                }
                sum+=fact;
            }
            else{
                sum+=num;
            }
        }
        
        a=sum%10;
        b=(sum+10)-a;
        verifica=b-sum;
        char f;
        f=numero.charAt(9);
        int h=f-48;
        if(contar==9||contar==8||contar==7||contar==6||contar==5||contar==4||contar==3||contar==2){
            p=0;
        }
        else  if(verifica==h||h==0){
            p=1;
        }
        return p;
    }
        else
         return p; 
    }
    public static void main(String [] arg) {
         /**Calendar c = new GregorianCalendar();
     String dia,mes,annio,fechaAct;
     dia = Integer.toString(c.get(Calendar.DAY_OF_MONTH));
mes = Integer.toString(c.get(Calendar.MONTH)+1);
annio = Integer.toString(c.get(Calendar.YEAR));
        fechaAct=annio+"/"+mes+"/"+dia;
        SimpleDateFormat formateador = new SimpleDateFormat("yyyy/MM/dd"); 
        Date FecRe= formateador.parse(fechaAct);
        System.out.println(fechaAct);*/
    }
    
}
