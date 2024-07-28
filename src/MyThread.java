public class MyThread extends Thread
{
        /*
        Here, we'lll use the thread to count backwards, from 10 through 1.
         */
        @Override
        public void run()
        {
                for (int i=10;i>0;i--)
                {
                        System.out.println(i);
                        try
                        {
                                Thread.sleep(1000);
                        } catch (InterruptedException e)
                        {
                                throw new RuntimeException(e);
                        }
                }
                System.out.println("There ends thread#1!");
        }
}
