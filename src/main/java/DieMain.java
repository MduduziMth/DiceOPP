public class DieMain {
    public static void main(String[] args) throws Exception {


      //  Die die20 = new Die(20);
       // die20.roll();

        int n = 0;
        do {

            Die dieDodgy6 = new Die(20, new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,});
            dieDodgy6.roll();
            System.out.println(dieDodgy6.value);

            Die die6 = new Die(6);
            die6.roll();
            System.out.println(die6.value);
            n++;
        }while (n < 50);


    }
}
