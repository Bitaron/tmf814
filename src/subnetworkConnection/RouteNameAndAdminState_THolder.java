package subnetworkConnection;

/**
* subnetworkConnection/RouteNameAndAdminState_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from subnetworkConnection.idl
* Wednesday, June 15, 2016 7:24:41 PM COT
*/

public final class RouteNameAndAdminState_THolder implements org.omg.CORBA.portable.Streamable
{
  public subnetworkConnection.RouteNameAndAdminState_T value = null;

  public RouteNameAndAdminState_THolder ()
  {
  }

  public RouteNameAndAdminState_THolder (subnetworkConnection.RouteNameAndAdminState_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = subnetworkConnection.RouteNameAndAdminState_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    subnetworkConnection.RouteNameAndAdminState_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return subnetworkConnection.RouteNameAndAdminState_THelper.type ();
  }

}
