package bezeq.data_objects;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class OrderInfo implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "id")
   private int id = 29;
   @org.kie.api.definition.type.Label(value = "type")
   private java.lang.String type;

   public OrderInfo()
   {
   }

   public int getId()
   {
      return this.id;
   }

   public void setId(int id)
   {
      this.id = id;
   }

   public java.lang.String getType()
   {
      return this.type;
   }

   public void setType(java.lang.String type)
   {
      this.type = type;
   }

   public OrderInfo(int id, java.lang.String type)
   {
      this.id = id;
      this.type = type;
   }

}