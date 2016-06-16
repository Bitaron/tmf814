package callSNC;


/**
* callSNC/CallAndTopLevelConnectionsAndSNCsList_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from callSNC.idl
* Wednesday, June 15, 2016 7:24:30 PM COT
*/


/** 
   * This structure represents a list of calls, their supporting top level
   * connections and the SNCs that support each top level connection.</p>
   * 
   **/
public final class CallAndTopLevelConnectionsAndSNCsList_THolder implements org.omg.CORBA.portable.Streamable
{
  public callSNC.CallAndTopLevelConnectionsAndSNCs_T value[] = null;

  public CallAndTopLevelConnectionsAndSNCsList_THolder ()
  {
  }

  public CallAndTopLevelConnectionsAndSNCsList_THolder (callSNC.CallAndTopLevelConnectionsAndSNCs_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = callSNC.CallAndTopLevelConnectionsAndSNCsList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    callSNC.CallAndTopLevelConnectionsAndSNCsList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return callSNC.CallAndTopLevelConnectionsAndSNCsList_THelper.type ();
  }

}