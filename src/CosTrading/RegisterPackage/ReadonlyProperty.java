package CosTrading.RegisterPackage;


/**
* CosTrading/RegisterPackage/ReadonlyProperty.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosTrading.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/

public final class ReadonlyProperty extends org.omg.CORBA.UserException
{
  public String type = null;
  public String name = null;

  public ReadonlyProperty ()
  {
    super(ReadonlyPropertyHelper.id());
  } // ctor

  public ReadonlyProperty (String _type, String _name)
  {
    super(ReadonlyPropertyHelper.id());
    type = _type;
    name = _name;
  } // ctor


  public ReadonlyProperty (String $reason, String _type, String _name)
  {
    super(ReadonlyPropertyHelper.id() + "  " + $reason);
    type = _type;
    name = _name;
  } // ctor

} // class ReadonlyProperty