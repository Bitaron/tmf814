package DsLogAdmin;


/**
* DsLogAdmin/InvalidRecordId.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DsLogAdmin.idl
* Wednesday, June 15, 2016 7:24:34 PM COT
*/

public final class InvalidRecordId extends org.omg.CORBA.UserException
{

  public InvalidRecordId ()
  {
    super(InvalidRecordIdHelper.id());
  } // ctor


  public InvalidRecordId (String $reason)
  {
    super(InvalidRecordIdHelper.id() + "  " + $reason);
  } // ctor

} // class InvalidRecordId
