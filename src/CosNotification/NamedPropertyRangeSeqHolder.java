package CosNotification;


/**
* CosNotification/NamedPropertyRangeSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotification.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/


/**
    * A sequence of <code>NamedPropertyRange</code> structures.
    */
public final class NamedPropertyRangeSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotification.NamedPropertyRange value[] = null;

  public NamedPropertyRangeSeqHolder ()
  {
  }

  public NamedPropertyRangeSeqHolder (CosNotification.NamedPropertyRange[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotification.NamedPropertyRangeSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotification.NamedPropertyRangeSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotification.NamedPropertyRangeSeqHelper.type ();
  }

}