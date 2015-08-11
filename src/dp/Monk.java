//class Monk.java
    package dp;
    public class Monk implements Runnable
        {
        String name;
        Fork ForkLeft;
        Fork ForkRight;
        public Monk(String str, Fork Fork1, Fork Fork2)
            {
            name = str;
            this.ForkLeft = Fork1;
            this.ForkRight = Fork2;
            }
        public void run()
            {
            System.out.println(name + " is started");
            for (int i = 1; i<5; i++)
                {
                try 
                    {
                    Thread.sleep((int)( Math.random() * 1000));
                    }
                catch (InterruptedException e)
                    {
                    }
                System.out.println(name + " is thinking");
                try
                    {
                    Thread.sleep((int)( Math.random() * 1000));
                    }
                catch (InterruptedException e)
                    {
                    }
                System.out.println(name + " wants to eat");
                while (!(this.ForkLeft.available == true && this.ForkRight.available == true))
                    {
                    }
                this.ForkLeft.use();
                this.ForkRight.use();
                try
                    {
                    Thread.sleep((int)( Math.random() * 1000));
                    }
                catch (InterruptedException e)
                    {
                    }
                System.out.println(name + " is eating");
                try
                    {
                    Thread.sleep((int)( Math.random() * 1000));
                    }
                catch (InterruptedException e)
                    {
                    }
                System.out.println(name + " completed eating");
                try
                    {
                    Thread.sleep((int)( Math.random() * 1000));
                    }
                catch (InterruptedException e)
                    {
                    }
                ForkLeft.done();
                ForkRight.done();
                }
            }
        }
