package flowDomainFragment;


/**
* flowDomainFragment/FDFrList_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from flowDomainFragment.idl
* Wednesday, June 15, 2016 7:24:36 PM COT
*/


/**
   * <p>Sequence of FlowDomainFragment_T objects.</p>
   **/
public final class FDFrList_THolder implements org.omg.CORBA.portable.Streamable
{
  public flowDomainFragment.FlowDomainFragment_T value[] = null;

  public FDFrList_THolder ()
  {
  }

  public FDFrList_THolder (flowDomainFragment.FlowDomainFragment_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = flowDomainFragment.FDFrList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    flowDomainFragment.FDFrList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return flowDomainFragment.FDFrList_THelper.type ();
  }

}
