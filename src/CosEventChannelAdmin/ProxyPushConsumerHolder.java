package CosEventChannelAdmin;

/**
* CosEventChannelAdmin/ProxyPushConsumerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosEventChannelAdmin.idl
* Wednesday, June 15, 2016 7:24:31 PM COT
*/


/**
    * Interface for a proxy push consumer.
    */
public final class ProxyPushConsumerHolder implements org.omg.CORBA.portable.Streamable
{
  public CosEventChannelAdmin.ProxyPushConsumer value = null;

  public ProxyPushConsumerHolder ()
  {
  }

  public ProxyPushConsumerHolder (CosEventChannelAdmin.ProxyPushConsumer initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosEventChannelAdmin.ProxyPushConsumerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosEventChannelAdmin.ProxyPushConsumerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosEventChannelAdmin.ProxyPushConsumerHelper.type ();
  }

}
