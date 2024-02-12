package org.rushen;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Sim s = applicationContext.getBean("sim", Sim.class);

        s.calling();
        s.data();
    }
}
