package DsLogAdmin;


/**
* DsLogAdmin/LogIdListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DsLogAdmin.idl
* Wednesday, June 15, 2016 7:24:34 PM COT
*/

public final class LogIdListHolder implements org.omg.CORBA.portable.Streamable
{
  public int value[] = null;

  public LogIdListHolder ()
  {
  }

  public LogIdListHolder (int[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = DsLogAdmin.LogIdListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    DsLogAdmin.LogIdListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return DsLogAdmin.LogIdListHelper.type ();
  }

}
