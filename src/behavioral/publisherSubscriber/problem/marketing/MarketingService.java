package behavioral.publisherSubscriber.problem.marketing;

import java.util.ArrayList;
import java.util.List;

public class MarketingService {
    private List<Customer> premiumCustomers = new ArrayList<>();
    private List<Customer> regularCustomers = new ArrayList<>();
    private List<Customer> vipCustomers = new ArrayList<>();
    
    public void addPremiumCustomer(Customer customer) {
        premiumCustomers.add(customer);
    }
    
    public void addRegularCustomer(Customer customer) {
        regularCustomers.add(customer);
    }
    
    public void addVipCustomer(Customer customer) {
        vipCustomers.add(customer);
    }
    
    public void removePremiumCustomer(Customer customer) {
        premiumCustomers.remove(customer);
    }
    
    public void removeRegularCustomer(Customer customer) {
        regularCustomers.remove(customer);
    }
    
    public void removeVipCustomer(Customer customer) {
        vipCustomers.remove(customer);
    }
    
    public void sendPremiumPromotion(String promotion) {
        for (Customer customer : premiumCustomers) {
            customer.receivePromotion("프리미엄", promotion);
        }
    }
    
    public void sendRegularPromotion(String promotion) {
        for (Customer customer : regularCustomers) {
            customer.receivePromotion("일반", promotion);
        }
    }
    
    public void sendVipPromotion(String promotion) {
        for (Customer customer : vipCustomers) {
            customer.receivePromotion("VIP", promotion);
        }
    }
    
    public void sendGeneralAnnouncement(String announcement) {
        for (Customer customer : premiumCustomers) {
            customer.receivePromotion("공지", announcement);
        }
        for (Customer customer : regularCustomers) {
            customer.receivePromotion("공지", announcement);
        }
        for (Customer customer : vipCustomers) {
            customer.receivePromotion("공지", announcement);
        }
    }
}