package CosNotifyChannelAdmin;

/**
* CosNotifyChannelAdmin/ConsumerAdminHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotifyChannelAdmin.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/


/**
    * An interface for consumer administration objects.
    */
public final class ConsumerAdminHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyChannelAdmin.ConsumerAdmin value = null;

  public ConsumerAdminHolder ()
  {
  }

  public ConsumerAdminHolder (CosNotifyChannelAdmin.ConsumerAdmin initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyChannelAdmin.ConsumerAdminHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyChannelAdmin.ConsumerAdminHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyChannelAdmin.ConsumerAdminHelper.type ();
  }

}