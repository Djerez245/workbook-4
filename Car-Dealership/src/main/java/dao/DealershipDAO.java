package dao;

import com.pluralsight.Dealership;
import com.pluralsight.Vehicle;

import java.util.ArrayList;
import java.util.List;

public interface DealershipDAO {

    Dealership findDealerShipById(int id);
    List<Dealership> findAllDealerships();
}
