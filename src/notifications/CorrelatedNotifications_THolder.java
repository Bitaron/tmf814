package notifications;

/**
* notifications/CorrelatedNotifications_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from notifications.idl
* Wednesday, June 15, 2016 7:24:40 PM COT
*/

public final class CorrelatedNotifications_THolder implements org.omg.CORBA.portable.Streamable
{
  public notifications.CorrelatedNotifications_T value = null;

  public CorrelatedNotifications_THolder ()
  {
  }

  public CorrelatedNotifications_THolder (notifications.CorrelatedNotifications_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = notifications.CorrelatedNotifications_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    notifications.CorrelatedNotifications_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return notifications.CorrelatedNotifications_THelper.type ();
  }

}