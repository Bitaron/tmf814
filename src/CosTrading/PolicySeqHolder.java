package CosTrading;


/**
* CosTrading/PolicySeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosTrading.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/

public final class PolicySeqHolder implements org.omg.CORBA.portable.Streamable
{
  public CosTrading.Policy value[] = null;

  public PolicySeqHolder ()
  {
  }

  public PolicySeqHolder (CosTrading.Policy[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosTrading.PolicySeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosTrading.PolicySeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosTrading.PolicySeqHelper.type ();
  }

}