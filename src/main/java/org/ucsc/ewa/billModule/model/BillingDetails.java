package org.ucsc.ewa.billModule.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "billing_details")
public class BillingDetails extends BaseEntity {

    @Column(name = "connection_id")
    private Long connectionId;

    @Column(name = "bill_date")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date billDate;
    
    @Column(name = "bill_amount")
    private Double billAmount;

    @Column(name = "payment_method")
    private String paymentMethod;
    
    @Column(name = "payment_status")
    private String paymentStatus;

    @Column(name = "forward_balance")
    private Double forwardBalance;
    
    @Column(name = "payment_date")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date paymentDate;

    public Long getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(Long connectionId) {
        this.connectionId = connectionId;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public Double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(Double billAmount) {
        this.billAmount = billAmount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Double getForwardBalance() {
        return forwardBalance;
    }

    public void setForwardBalance(Double forwardBalance) {
        this.forwardBalance = forwardBalance;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    
}
