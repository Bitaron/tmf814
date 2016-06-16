package CosNotification;


/**
* CosNotification/_AdminPropertiesAdminStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotification.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/


/**
    * An interface for objects that have administrative settings.
    */
public class _AdminPropertiesAdminStub extends org.omg.CORBA.portable.ObjectImpl implements CosNotification.AdminPropertiesAdmin
{


  /**
         * Returns the current administrative settings for this object.
         * @returns A sequence of name-value pairs defining the administrative 
         * settings.
         */
  public CosNotification.Property[] get_admin ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_admin", true);
                $in = _invoke ($out);
                CosNotification.Property $result[] = CosNotification.AdminPropertiesHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_admin (        );
            } finally {
                _releaseReply ($in);
            }
  } // get_admin


  /**
         * Sets the administrative settings for this object.
         * @parm <code>admin</code> - A sequence of desired name-value pairs
         * defining the administrative settings.
         * @raises UnsupportedAdmin If any of the desired setting are not
         * available.
         */
  public void set_admin (CosNotification.Property[] admin) throws CosNotification.UnsupportedAdmin
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("set_admin", true);
                CosNotification.AdminPropertiesHelper.write ($out, admin);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotification/UnsupportedAdmin:1.0"))
                    throw CosNotification.UnsupportedAdminHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                set_admin (admin        );
            } finally {
                _releaseReply ($in);
            }
  } // set_admin

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosNotification/AdminPropertiesAdmin:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _AdminPropertiesAdminStub