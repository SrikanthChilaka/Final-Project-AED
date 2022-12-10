/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author srikanthchilaka
 */
public class AddressList {
private ArrayList<Address> addressList;
    ArrayList<Address> showAddress;
    
    public AddressList(){
        addressList = new ArrayList<>();
    }
    public ArrayList<Address> getAddressList() {
        return addressList;
    }
    public void setAddressList(ArrayList<Address> addressList) {
        this.addressList = addressList;
    }
    public ArrayList<Address> getShowAddress() {
        return showAddress;
    }
    public void setShowAddress(ArrayList<Address> showAddress) {
        this.showAddress = showAddress;
    }
        public Address AddAddress(){
        Address a = new Address();
        addressList.add(a);
        return a;
    }  
        public ArrayList<Address> searchAddress(String zip){
        showAddress = new ArrayList<>();
        for(Address a: addressList){
            if(a.getZip().equals(zip)){
                showAddress.add(a);
                return showAddress;
            }
        }
        return null;
    }
   }