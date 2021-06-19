package adapters;

import abstracts.ICustomerCheckService;
import entity.Customer;
import ws.KPSPublic;
import ws.KPSPublicSoap;

public class MernisCheckSerivce implements ICustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        KPSPublic service =new KPSPublic();
        KPSPublicSoap soapService =service.getKPSPublicSoap();
        return soapService.tcKimlikNoDogrula(Long.valueOf(customer.getNationalityId()),customer.getFirstName(),customer.getLastName(),customer.getDateOfBirth().getYear());
    }
}
