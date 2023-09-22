package tp3.entity;
// Generated 2021-11-22 12:55:05 by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.Date;

/**
 * Location generated by hbm2java
 */
public class Location  implements java.io.Serializable {


     private BigDecimal idlocation;
     private Client client;
     private Examplaire examplaire;
     private Date datelocation;
     private Date dateretour;
     private Date confirmationretour;

    public Location() {
    }

	
    public Location(BigDecimal idlocation, Client client, Examplaire examplaire, Date datelocation, Date dateretour) {
        this.idlocation = idlocation;
        this.client = client;
        this.examplaire = examplaire;
        this.datelocation = datelocation;
        this.dateretour = dateretour;
    }
    public Location(BigDecimal idlocation, Client client, Examplaire examplaire, Date datelocation, Date dateretour, Date confirmationretour) {
       this.idlocation = idlocation;
       this.client = client;
       this.examplaire = examplaire;
       this.datelocation = datelocation;
       this.dateretour = dateretour;
       this.confirmationretour = confirmationretour;
    }
   
    public BigDecimal getIdlocation() {
        return this.idlocation;
    }
    
    public void setIdlocation(BigDecimal idlocation) {
        this.idlocation = idlocation;
    }
    public Client getClient() {
        return this.client;
    }
    
    public void setClient(Client client) {
        this.client = client;
    }
    public Examplaire getExamplaire() {
        return this.examplaire;
    }
    
    public void setExamplaire(Examplaire examplaire) {
        this.examplaire = examplaire;
    }
    public Date getDatelocation() {
        return this.datelocation;
    }
    
    public void setDatelocation(Date datelocation) {
        this.datelocation = datelocation;
    }
    public Date getDateretour() {
        return this.dateretour;
    }
    
    public void setDateretour(Date dateretour) {
        this.dateretour = dateretour;
    }
    public Date getConfirmationretour() {
        return this.confirmationretour;
    }
    
    public void setConfirmationretour(Date confirmationretour) {
        this.confirmationretour = confirmationretour;
    }




}


