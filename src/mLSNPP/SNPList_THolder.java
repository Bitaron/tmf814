package mLSNPP;


/**
* mLSNPP/SNPList_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from mLSNPP.idl
* Wednesday, June 15, 2016 7:24:38 PM COT
*/


/**

   **/
public final class SNPList_THolder implements org.omg.CORBA.portable.Streamable
{
  public mLSNPP.SNP_T value[] = null;

  public SNPList_THolder ()
  {
  }

  public SNPList_THolder (mLSNPP.SNP_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = mLSNPP.SNPList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    mLSNPP.SNPList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return mLSNPP.SNPList_THelper.type ();
  }

}