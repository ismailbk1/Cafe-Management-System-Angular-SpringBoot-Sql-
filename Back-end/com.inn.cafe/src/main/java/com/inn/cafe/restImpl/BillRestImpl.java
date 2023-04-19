package com.inn.cafe.restImpl;

import com.inn.cafe.constents.CafeConstents;
import com.inn.cafe.model.Bill;
import com.inn.cafe.rest.BillRest;
import com.inn.cafe.serviceimpl.BillserviceImpl;
import com.inn.cafe.utils.Cafeutils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class BillRestImpl implements BillRest {

    private BillserviceImpl billservice;

    public BillRestImpl( BillserviceImpl billservice) {
        this.billservice=billservice;
    }

    @Override
    public ResponseEntity<String> generatReport(Map<String, Object> requestMap) {
        try{
            return billservice.generatReport(requestMap);
        }catch (Exception ex){
            ex.printStackTrace();
        }



        return Cafeutils.getResonseEntity(CafeConstents.Something_went_wrong, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    public ResponseEntity<List<Bill>> getBills() {
        try{
               return billservice.getBills();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
