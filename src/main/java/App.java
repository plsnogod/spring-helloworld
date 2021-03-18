import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
//        System.out.println(bean.getMessage());
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");



        ApplicationContext applicationContext1 =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat bean2 = (Cat) applicationContext.getBean("cat");
 //       System.out.println(bean2.getMessage());
        ApplicationContext applicationContext2 =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat bean3 = (Cat) applicationContext.getBean("cat");
 //       System.out.println(bean3.getMessage());

//        System.out.println(bean.getMessage());
//        System.out.println(bean.getMessage());
//        System.out.println(bean2.getMessage());
//        System.out.println(bean2.getMessage());
        System.out.println(bean==bean);
        System.out.println(bean2==bean3);
    }
}