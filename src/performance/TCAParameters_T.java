package performance;


/**
* performance/TCAParameters_T.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from performance.idl
* Wednesday, June 15, 2016 7:24:40 PM COT
*/

public final class TCAParameters_T implements org.omg.CORBA.portable.IDLEntity
{
  public short layerRate = (short)0;
  public String granularity = null;
  public performance.PMThresholdValue_T tcaTypeValues[] = null;

  public TCAParameters_T ()
  {
  } // ctor

  public TCAParameters_T (short _layerRate, String _granularity, performance.PMThresholdValue_T[] _tcaTypeValues)
  {
    layerRate = _layerRate;
    granularity = _granularity;
    tcaTypeValues = _tcaTypeValues;
  } // ctor

} // class TCAParameters_T
