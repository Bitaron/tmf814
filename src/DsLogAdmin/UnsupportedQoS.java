package DsLogAdmin;


/**
* DsLogAdmin/UnsupportedQoS.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DsLogAdmin.idl
* Wednesday, June 15, 2016 7:24:34 PM COT
*/

public final class UnsupportedQoS extends org.omg.CORBA.UserException
{
  public short denied[] = null;

  public UnsupportedQoS ()
  {
    super(UnsupportedQoSHelper.id());
  } // ctor

  public UnsupportedQoS (short[] _denied)
  {
    super(UnsupportedQoSHelper.id());
    denied = _denied;
  } // ctor


  public UnsupportedQoS (String $reason, short[] _denied)
  {
    super(UnsupportedQoSHelper.id() + "  " + $reason);
    denied = _denied;
  } // ctor

} // class UnsupportedQoS
