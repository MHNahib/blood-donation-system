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
class Patient {
    
    private String name, phone, blood, age;
    
    public Patient(String name, String phone, String blood, String age){
        this.name= name;
        this.phone=phone;
        this.blood= blood;
        this.age=age;
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

    public String getAge() {
        return age;
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

    public void setAge(String age) {
        this.age = age;
    }
    
    
    
}
