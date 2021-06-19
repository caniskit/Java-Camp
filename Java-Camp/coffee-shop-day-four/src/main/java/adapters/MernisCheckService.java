package adapters;

import abstracts.CustomerCheckService;
import entity.Customer;
import tr.gov.nvi.tckimlik.ws.KPSPublic;
import tr.gov.nvi.tckimlik.ws.KPSPublicSoap;

public class MernisCheckService implements CustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        KPSPublic service = new KPSPublic();
        KPSPublicSoap identityService =service.getKPSPublicSoap();
        return identityService.tcKimlikNoDogrula(Long.valueOf(customer.getNationalId()),customer.getFirstName(),customer.getLastName(),customer.getDateOfBirth().getYear());
    }
}
