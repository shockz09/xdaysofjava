public class Main {
    public static void main(String[] args) {
        int x = 100+50;
        String greeting = "HELLO";
        String txt = "Please locate where 'locate' occurs!";
        // System.out.println(greeting +" " + txt + " " + greeting.toLowerCase() +" " + txt.toUpperCase());
        System.out.println(txt.indexOf("locate"));
        Math.max(5,10);// highest value of x and y
        Math.min(5,10);//lowest value of x and y
        Math.sqrt(5);//returns the square root of the number which here is 5
        Math.abs(-4.7);//returns the absolute (positive) value of x
        Math.random();//returns a random num, example below
        int randomInt = (int)(Math.random()*101);//0 to 100
        // now boolean

        boolean isJavaFun = false; //xD
        System.out.println(isJavaFun);
        //bolean expression ftw

        int xo = 10;
        int y = 7;
        System.out.println(xo>y);

        if(20>18){
            System.out.println("20 is greater than 18 yeah");
        }
        int day = 4;
        switch(day){
            case 1:
        System.out.println("Monday");
        break;
        case 2:
        System.out.println("Tuesday");
        break;
        case 3:
        System.out.println("Wednesday");
        break;
        case 4:
        System.out.println("Thursday");
        break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
}
while( y<12 ){
            System.out.println(y);
            y++;
        }

        do{
            System.out.println("this tbh");
        }while(y<9);
    }

//for loops uwu

for         (int 1 =0; i <5; i++){
    System.out.println(i);
}
     for (int i =0 ; i<=10; i=i+2){
         System.out.println(i);
     }   
}