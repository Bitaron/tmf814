package DsLogAdmin;

/**
* DsLogAdmin/InvalidGrammarHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DsLogAdmin.idl
* Wednesday, June 15, 2016 7:24:34 PM COT
*/

public final class InvalidGrammarHolder implements org.omg.CORBA.portable.Streamable
{
  public DsLogAdmin.InvalidGrammar value = null;

  public InvalidGrammarHolder ()
  {
  }

  public InvalidGrammarHolder (DsLogAdmin.InvalidGrammar initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = DsLogAdmin.InvalidGrammarHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    DsLogAdmin.InvalidGrammarHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return DsLogAdmin.InvalidGrammarHelper.type ();
  }

}
