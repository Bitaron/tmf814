package subnetworkConnection;

/**
* subnetworkConnection/RouteDescriptor_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from subnetworkConnection.idl
* Wednesday, June 15, 2016 7:24:41 PM COT
*/

public final class RouteDescriptor_THolder implements org.omg.CORBA.portable.Streamable
{
  public subnetworkConnection.RouteDescriptor_T value = null;

  public RouteDescriptor_THolder ()
  {
  }

  public RouteDescriptor_THolder (subnetworkConnection.RouteDescriptor_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = subnetworkConnection.RouteDescriptor_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    subnetworkConnection.RouteDescriptor_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return subnetworkConnection.RouteDescriptor_THelper.type ();
  }

}
