/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.harena.itu.radimilahyharena.tp1.jsf;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.inject.Inject;
import java.io.Serializable;
import java.util.List;
import mg.harena.itu.radimilahyharena.tp1.entity.Customer;
import mg.harena.itu.radimilahyharena.tp1.service.CustomerManager;

/**
 *
 * @author H
 */
@Named(value = "customerBean")
@RequestScoped
public class CustomerBean implements Serializable {

    private List<Customer> customerList;

    @Inject
    private CustomerManager customerManager;

    public CustomerBean() {
    }

    /**
     * Retourne la liste des clients pour affichage dans une DataTable.
     * @return 
     */
    public List<Customer> getCustomers() {
        if (customerList == null) {
            customerList = customerManager.getAllCustomers();
        }
        return customerList;
    }

}
