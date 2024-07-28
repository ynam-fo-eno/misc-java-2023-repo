public class MyRunnable implements Runnable
{

    @Override
    public void run()
    {
        for (int i=0;i<10;i++)
        {
            System.out.println(i+1);
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
        System.out.println("There ends thread#2!");
    }
}
