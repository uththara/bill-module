package org.ucsc.ewa.billModule.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.ucsc.ewa.billModule.model.AccDetails;
import org.ucsc.ewa.billModule.service.BillService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.ucsc.ewa.billModule.model.cusBilldetails;



@RestController
@RequestMapping(value = "api/")
public class InitController {

    @Autowired
    private BillService billService;

  
    
     @RequestMapping(value = "getBillDetails/{mobileNo}", method = RequestMethod.GET)
     public cusBilldetails getPerson(@PathVariable("mobileNo") String mobileNo) {

        return billService.findBillInfoByMobileNo(mobileNo);
    }
}
