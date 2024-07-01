public class car {
    public static void main(String[] args) {

        String[] x=new String[5];
        x[0]="red";
        x[1]="blue";
        x[2]="yellow";
        x[3]="grey";
        x[4]="black";

        for (int i=0; i<x.length; i++){
            if (x[i].equals("blue")){
                System.out.println("Car number "+i+" is blue.");
            }
            else {
                System.out.println("Car number "+i+" is not blue");
            }
        }
    }
}