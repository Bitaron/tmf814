package protection;

/**
* protection/ProtectionGroupType_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from protection.idl
* Wednesday, June 15, 2016 7:24:41 PM COT
*/


/**
   * <p>The protection group type identifies the type of the
   * protection Group.</p>
   * <p>It should be noted that although the term MSP was chosen 
   * as the original specific protection scheme to which the related behaviour
   * applied was Multiplex Section Protection, the label is now more generally 
   * applied to any 1+1 or 1:N Trail protection scheme.</p>
   **/
public final class ProtectionGroupType_THolder implements org.omg.CORBA.portable.Streamable
{
  public protection.ProtectionGroupType_T value = null;

  public ProtectionGroupType_THolder ()
  {
  }

  public ProtectionGroupType_THolder (protection.ProtectionGroupType_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = protection.ProtectionGroupType_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    protection.ProtectionGroupType_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return protection.ProtectionGroupType_THelper.type ();
  }

}