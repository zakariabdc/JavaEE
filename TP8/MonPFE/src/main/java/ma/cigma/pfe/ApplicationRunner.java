package ma.cigma.pfe;

import ma.cigma.pfe.models.CarteFidelio;
import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.models.Facture;
import ma.cigma.pfe.models.Promotion;
import ma.cigma.pfe.presentation.ClientController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController) context.getBean("idCtrl");

        ctrl.save(new Client("Zakaria"));
        ctrl.save(new Client("Walid"));
        ctrl.save(new Client("Riad"));
        ctrl.save(new Client("Ghoufrane"));

        // Test modify use case for client with id==1
        ctrl.modify(new Client(1L,"new Name"));
        // Test remove use case for client with id==1
        ctrl.removeById(1L);
        //Select
        Client found = ctrl.getById(2);
        System.out.println(found);
        //Select *

            //TP8 (10pts)
            List<Client> clt = ctrl.getAll();
            clt.forEach(c -> System.out.println(c));
    }
}
