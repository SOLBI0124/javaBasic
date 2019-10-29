package z_exam;

public class SutdaCard {
   
//6-1
   int num;
   boolean isKwang;

//6-2   
   SutdaCard(){
      this(1,true);
      //this.num=1;
      //this.isKwang=true;
   }
   
   SutdaCard(int num, boolean isKwang){
      this.num=num;
      this.isKwang=isKwang;
   }

  
   
   String info(){
     String info="";
     	if(isKwang == true){
    		 info = num + "K";
    	 }else info = num + "";
      
      return info;
     
   }
   
   public static void main(String args[]) {
       SutdaCard card1 = new SutdaCard(3, false);
       SutdaCard card2 = new SutdaCard();
       System.out.println(card1.info());
       System.out.println(card2.info());
    }
}

