package performance;


/**
* performance/HoldingTime_T.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from performance.idl
* Wednesday, June 15, 2016 7:24:40 PM COT
*/

public final class HoldingTime_T implements org.omg.CORBA.portable.IDLEntity
{
  public short storeTime24hr = (short)0;
  public short storeTime15min = (short)0;

  public HoldingTime_T ()
  {
  } // ctor

  public HoldingTime_T (short _storeTime24hr, short _storeTime15min)
  {
    storeTime24hr = _storeTime24hr;
    storeTime15min = _storeTime15min;
  } // ctor

} // class HoldingTime_T