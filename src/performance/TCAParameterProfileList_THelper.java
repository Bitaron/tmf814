package performance;


/**
* performance/TCAParameterProfileList_THelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from performance.idl
* Wednesday, June 15, 2016 7:24:40 PM COT
*/


/**
   * <p>Sequence of TCAParameterProfile_T.</p>
   **/
abstract public class TCAParameterProfileList_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/performance/TCAParameterProfileList_T:1.0";

  public static void insert (org.omg.CORBA.Any a, performance.TCAParameterProfile_T[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static performance.TCAParameterProfile_T[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = performance.TCAParameterProfile_THelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (performance.TCAParameterProfileList_THelper.id (), "TCAParameterProfileList_T", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static performance.TCAParameterProfile_T[] read (org.omg.CORBA.portable.InputStream istream)
  {
    performance.TCAParameterProfile_T value[] = null;
    int _len0 = istream.read_long ();
    value = new performance.TCAParameterProfile_T[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = performance.TCAParameterProfile_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, performance.TCAParameterProfile_T[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      performance.TCAParameterProfile_THelper.write (ostream, value[_i0]);
  }

}
