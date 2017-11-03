package org.ucsc.ewa.billModule.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.ucsc.ewa.billModule.model.AccDetails;
import org.ucsc.ewa.billModule.repository.BillRepository;
import org.springframework.stereotype.Service;
import org.ucsc.ewa.billModule.model.BillingDetails;
import org.ucsc.ewa.billModule.model.ConDetails;
import org.ucsc.ewa.billModule.model.cusBilldetails;
import org.ucsc.ewa.billModule.repository.AccRepository;
import org.ucsc.ewa.billModule.repository.ConRepository;

@Service
public class BillServiceImpl implements BillService {

    @Autowired
    private BillRepository billRepository;
    
    @Autowired
    private ConRepository conRepository;
    
    @Autowired
    private AccRepository accRepository;    

   
    
    @Override
    public cusBilldetails findBillInfoByMobileNo(String mobileNo){
        cusBilldetails cusObj = new cusBilldetails();
        ConDetails connection = conRepository.findConnectionByMobileNo(mobileNo);
        if(connection != null){
            AccDetails account = accRepository.findOne(connection.getAccId());
            List<BillingDetails> billList = billRepository.findBillDetailsByMobileNo(connection.getId());           
            
            cusObj.setCusName(account.getFirstName()+" "+account.getLastName());
            cusObj.setNic(account.getNic());
            cusObj.setBalance(connection.getAccBalance());
            cusObj.setBill(billList);
//            cusObj.setId(account.getId());
        }
        return cusObj;
    }
}
