package CosNotifyComm;

/**
* CosNotifyComm/PushConsumerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotifyComm.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/


/**
    * An interface for push consumers.
    */
public final class PushConsumerHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyComm.PushConsumer value = null;

  public PushConsumerHolder ()
  {
  }

  public PushConsumerHolder (CosNotifyComm.PushConsumer initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyComm.PushConsumerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyComm.PushConsumerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyComm.PushConsumerHelper.type ();
  }

}