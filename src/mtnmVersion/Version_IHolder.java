package mtnmVersion;

/**
* mtnmVersion/Version_IHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from mtnmVersion.idl
* Wednesday, June 15, 2016 7:24:39 PM COT
*/


/**
   * <p>The interface Version_I allows the NMS to query the current version
   * of the IDL interface implemented by the EMS system.
   * In order to use this interface, the NMS needs to invoke the getVersion
   * service to figure out which version of the interface the EMS
   * is providing.  getVersion() should be called by a client before 
   * other communications with
   * an EMS object.  The client can determine from the response string
   * which version of the EMS is available.</p>
   * <p> For details on how to support multiple versions of the IDL see
   * <a href=../../../supportingDocumentation/SD1-43_versioning.pdf >SD1-43 
   * Programmatic Versioning </a>.</p>
   * 
   * <h2> IDL change Process </h2> 
   * <p>Once a change is approved, the EMS and NMS
   * can implement the new changes.</p>
   * 
   * <h5> Version 3.5. </h5>
   * 
   **/
public final class Version_IHolder implements org.omg.CORBA.portable.Streamable
{
  public mtnmVersion.Version_I value = null;

  public Version_IHolder ()
  {
  }

  public Version_IHolder (mtnmVersion.Version_I initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = mtnmVersion.Version_IHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    mtnmVersion.Version_IHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return mtnmVersion.Version_IHelper.type ();
  }

}
