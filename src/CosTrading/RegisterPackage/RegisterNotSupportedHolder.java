package CosTrading.RegisterPackage;

/**
* CosTrading/RegisterPackage/RegisterNotSupportedHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosTrading.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/

public final class RegisterNotSupportedHolder implements org.omg.CORBA.portable.Streamable
{
  public CosTrading.RegisterPackage.RegisterNotSupported value = null;

  public RegisterNotSupportedHolder ()
  {
  }

  public RegisterNotSupportedHolder (CosTrading.RegisterPackage.RegisterNotSupported initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosTrading.RegisterPackage.RegisterNotSupportedHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosTrading.RegisterPackage.RegisterNotSupportedHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosTrading.RegisterPackage.RegisterNotSupportedHelper.type ();
  }

}