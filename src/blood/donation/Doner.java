/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blood.donation;

/**
 *
 * @author com
 */
class Doner {
    
    private String name, phone, blood, district;
    
    public Doner(String name, String phone, String blood, String district){
        this.name= name;
        this.phone=phone;
        this.blood= blood;
        this.district=district;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getBlood() {
        return blood;
    }

    public String getDistrict() {
        return district;
    }
    
}
