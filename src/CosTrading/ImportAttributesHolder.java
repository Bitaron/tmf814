package CosTrading;

/**
* CosTrading/ImportAttributesHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosTrading.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/


/** This interface contains attributes that describe
 * policies used witin the trader when resolving queries.
 */
public final class ImportAttributesHolder implements org.omg.CORBA.portable.Streamable
{
  public CosTrading.ImportAttributes value = null;

  public ImportAttributesHolder ()
  {
  }

  public ImportAttributesHolder (CosTrading.ImportAttributes initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosTrading.ImportAttributesHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosTrading.ImportAttributesHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosTrading.ImportAttributesHelper.type ();
  }

}
