package bpm_vvg.sluzbazakorisnike;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Agent implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Radno Mjesto")
   private java.lang.Integer radnoMjesto;
   @org.kie.api.definition.type.Label("Ime Agenta")
   private java.lang.String imeAgenta;
   @org.kie.api.definition.type.Label("Prezime Agenta")
   private java.lang.String prezimeAgenta;

   @org.kie.api.definition.type.Label(value = "Username Agent")
   private java.lang.String usernameAgent;

   public Agent()
   {
   }

   public java.lang.Integer getRadnoMjesto()
   {
      return this.radnoMjesto;
   }

   public void setRadnoMjesto(java.lang.Integer radnoMjesto)
   {
      this.radnoMjesto = radnoMjesto;
   }

   public java.lang.String getImeAgenta()
   {
      return this.imeAgenta;
   }

   public void setImeAgenta(java.lang.String imeAgenta)
   {
      this.imeAgenta = imeAgenta;
   }

   public java.lang.String getPrezimeAgenta()
   {
      return this.prezimeAgenta;
   }

   public void setPrezimeAgenta(java.lang.String prezimeAgenta)
   {
      this.prezimeAgenta = prezimeAgenta;
   }

   public java.lang.String getUsernameAgent()
   {
      return this.usernameAgent;
   }

   public void setUsernameAgent(java.lang.String usernameAgent)
   {
      this.usernameAgent = usernameAgent;
   }

   public Agent(java.lang.Integer radnoMjesto, java.lang.String imeAgenta,
         java.lang.String prezimeAgenta, java.lang.String usernameAgent)
   {
      this.radnoMjesto = radnoMjesto;
      this.imeAgenta = imeAgenta;
      this.prezimeAgenta = prezimeAgenta;
      this.usernameAgent = usernameAgent;
   }

}