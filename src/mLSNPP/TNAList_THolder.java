package mLSNPP;


/**
* mLSNPP/TNAList_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from mLSNPP.idl
* Wednesday, June 15, 2016 7:24:38 PM COT
*/


/**
   **/
public final class TNAList_THolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public TNAList_THolder ()
  {
  }

  public TNAList_THolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = mLSNPP.TNAList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    mLSNPP.TNAList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return mLSNPP.TNAList_THelper.type ();
  }

}
