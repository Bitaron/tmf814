package DsLogAdmin;

/**
* DsLogAdmin/InvalidLogFullActionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DsLogAdmin.idl
* Wednesday, June 15, 2016 7:24:34 PM COT
*/

public final class InvalidLogFullActionHolder implements org.omg.CORBA.portable.Streamable
{
  public DsLogAdmin.InvalidLogFullAction value = null;

  public InvalidLogFullActionHolder ()
  {
  }

  public InvalidLogFullActionHolder (DsLogAdmin.InvalidLogFullAction initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = DsLogAdmin.InvalidLogFullActionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    DsLogAdmin.InvalidLogFullActionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return DsLogAdmin.InvalidLogFullActionHelper.type ();
  }

}
