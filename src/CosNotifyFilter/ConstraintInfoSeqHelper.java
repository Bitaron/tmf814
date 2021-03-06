package CosNotifyFilter;


/**
* CosNotifyFilter/ConstraintInfoSeqHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotifyFilter.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/


/**
    * A sequence of <code>ConstraintInfo</code> structures.
    */
abstract public class ConstraintInfoSeqHelper
{
  private static String  _id = "IDL:omg.org/CosNotifyFilter/ConstraintInfoSeq:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNotifyFilter.ConstraintInfo[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNotifyFilter.ConstraintInfo[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = CosNotifyFilter.ConstraintInfoHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (CosNotifyFilter.ConstraintInfoSeqHelper.id (), "ConstraintInfoSeq", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosNotifyFilter.ConstraintInfo[] read (org.omg.CORBA.portable.InputStream istream)
  {
    CosNotifyFilter.ConstraintInfo value[] = null;
    int _len0 = istream.read_long ();
    value = new CosNotifyFilter.ConstraintInfo[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = CosNotifyFilter.ConstraintInfoHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNotifyFilter.ConstraintInfo[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      CosNotifyFilter.ConstraintInfoHelper.write (ostream, value[_i0]);
  }

}
