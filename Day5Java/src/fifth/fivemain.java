package fifth;

class fiveb {

        fiveb() {

            System.out.println(2/0);
        }
}



    class fivetwo extends fiveb{

        fivetwo() {

            try {

                fiveb a = new fiveb();

            } catch (Exception e) {

                System.out.println("Divide by zero");

            }

        }

    }



    public class fivemain{



        public static void main(String[] args) {

            try {

//                fiveb a = new fiveb();
                fivetwo b=new fivetwo();

            } catch (Exception e) {

                System.out.println("Divide by zero");

            }



        }
    }

