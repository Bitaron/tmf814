package flowDomain;


/**
* flowDomain/FDList_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from flowDomain.idl
* Wednesday, June 15, 2016 7:24:36 PM COT
*/


/**
   * <p>Sequence of FlowDomain_T objects.</p>
   **/
public final class FDList_THolder implements org.omg.CORBA.portable.Streamable
{
  public flowDomain.FlowDomain_T value[] = null;

  public FDList_THolder ()
  {
  }

  public FDList_THolder (flowDomain.FlowDomain_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = flowDomain.FDList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    flowDomain.FDList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return flowDomain.FDList_THelper.type ();
  }

}
