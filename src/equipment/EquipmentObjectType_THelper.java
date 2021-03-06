package equipment;


/**
* equipment/EquipmentObjectType_THelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from equipment.idl
* Wednesday, June 15, 2016 7:24:35 PM COT
*/


/**
   * <p>Type of equipment object in equipment holder.
   * Values are vendor-specific.</p>
   **/
abstract public class EquipmentObjectType_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/equipment/EquipmentObjectType_T:1.0";

  public static void insert (org.omg.CORBA.Any a, String that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static String extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_string_tc (0);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (equipment.EquipmentObjectType_THelper.id (), "EquipmentObjectType_T", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static String read (org.omg.CORBA.portable.InputStream istream)
  {
    String value = null;
    value = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, String value)
  {
    ostream.write_string (value);
  }

}
