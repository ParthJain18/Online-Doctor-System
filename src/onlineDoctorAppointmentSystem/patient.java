/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlineDoctorAppointmentSystem;

/**
 *
 * @author SANTOSH
 */
class patient {
    private int id,DoctorId;
    private String patient,date,time,contact;
    
    public patient(int id, int DoctorId, String patient,String date ,String time,String contact){
        this.patient=patient;
        this.id=id;
        this.DoctorId=DoctorId;
        this.date=date;
        this.time=time;
        this.contact=contact;
    }
    public int getid(){
        return id;
    }
    public int getdoctorid(){
        return DoctorId;
    }
    public String getpatient(){
        return patient;
    }
    public String getdate(){
        return date;
    }
    public String gettime(){
        return time;
    }
    public String getcontact(){
        return contact;
    }
    
}
