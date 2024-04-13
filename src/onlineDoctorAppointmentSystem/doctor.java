/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlineDoctorAppointmentSystem;

/**
 *
 * @author SANTOSH
 */
class doctor {
    private int id,fees;
    private String name,qualification,speciality,Experience;
    
    public doctor(int id, int fees, String name,String qualification ,String speciality,String Experience){
        this.name=name;
        this.id=id;
        this.qualification=qualification;
        this.Experience=Experience;
        this.fees=fees;
        this.speciality=speciality;
    }
    public int getid(){
        return id;
    }
    public int getfees(){
        return fees;
    }
    public String getname(){
        return name;
    }
    public String getqualification(){
        return qualification;
    }
    public String getexperience(){
        return Experience;
    }
    public String getspeciality(){
        return speciality;
    }
    
}
