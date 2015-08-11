//class Fork.java
    package dp;
    public class Fork
        {
        public boolean available = true;
        String name;
        public Fork(String str)
            {
            this.name = str;
            }
        synchronized boolean use()
            {
            while (available = false)
                {
                try
                    {
                    wait();
                    }
                catch (InterruptedException e)
                    {
                    }
                }
            available = false;
            notify();
            return true;
            }
        synchronized void done()
            {
            available = true;
            notify();
            }
        }
