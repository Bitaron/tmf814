package nmsSession;


/**
* nmsSession/NmsSession_IPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from nmsSession.idl
* Wednesday, June 15, 2016 7:24:39 PM COT
*/


/** 
   * <p>This interface is instantiated at the NMS. The NMS passes
   * a handle to an instance of this interface in the client 
   * parameter of the emsSessionFactory::EmsSessionFactory_I::getEmsSession()
   * operation in EmsSessionFactory_I.</p>
   */
public abstract class NmsSession_IPOA extends org.omg.PortableServer.Servant
 implements nmsSession.NmsSession_IOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("eventLossOccurred", new java.lang.Integer (0));
    _methods.put ("eventLossCleared", new java.lang.Integer (1));
    _methods.put ("alarmLossOccurred", new java.lang.Integer (2));
    _methods.put ("_get_associatedSession", new java.lang.Integer (3));
    _methods.put ("ping", new java.lang.Integer (4));
    _methods.put ("endSession", new java.lang.Integer (5));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {

  /**
     * <p>When an EMS fails to push an event, it can notify all connected NMSs by 
     * invoking this method on every active NmsSession_I.  This method should also 
     * be invoked on any new NmsSession_I set up during the event loss period.</p>
     * 
     * <p>Once the EMS invokes this method on the NmsSession_Is, it sets an 
     * internal flag to indicate that it has already informed NMSes of event loss. 
     * As long as this flag is set, the EMS will not invoke this method again.</p>
     *
     * <p>When this method is invoked on an NmsSession_I, the NMS comes to know 
     * that the EMS has failed to push one or more events that may be of interest 
     * to it. The NMS should consider itself to be potentially out-of-sync with 
     * the EMS. It should wait until the EMS calls eventLossCleared before 
     * resynchronizing with the EMS.</p>
     *
     * <br>globaldefs::Time_T startTime: The time of the first notification lost.
     * <br>string notificationId: The notificationId of the first notification 
     * lost.
     **/
       case 0:  // nmsSession/NmsSession_I/eventLossOccurred
       {
         String startTime = globaldefs.Time_THelper.read (in);
         String notificationId = in.read_string ();
         this.eventLossOccurred (startTime, notificationId);
         out = $rh.createReply();
         break;
       }


  /**
     * <p>The EMS invokes this method to indicate that the event or alarm loss 
     * period is over, and that it is now capable of providing relevant
     * notifications.</p>
     * 
     * <p>After invoking this method on the NmsSession_Is, the EMS clears the 
     * internal flag set by alarmLossOccured or/and eventLossOccurred.  If 
     * event or alarm loss occurs again, alarmLossOccurred or eventLossOccurred 
     * will be called.</p>
     *
     * <p>How and when the EMS decides to invoke eventLossCleared is an EMS 
     * implementation detail. The actual algorithm that the EMS uses may be as 
     * simple as a timer-based mechanism or a complicated one which monitors the 
     * current rate at which the EMS pushes events and the available resources in 
     * NOSE.</p>
     *
     * <br>globaldefs::Time_T endTime: The time of the end of the event loss 
     * period, as determined by the EMS.
     **/
       case 1:  // nmsSession/NmsSession_I/eventLossCleared
       {
         String endTime = globaldefs.Time_THelper.read (in);
         this.eventLossCleared (endTime);
         out = $rh.createReply();
         break;
       }


  /**
     * <p>When an EMS fails to discsrd an alarm, a TCA, a file transfer status or 
     * a protection switch notification, it can notify all connected NMSs 
     * by invoking this method on every active NmsSession_I.  This method 
     * should also be invoked on any new NmsSession_I set up during the event 
     * loss period.</p>
     * 
     * <p>Once the EMS invokes this method on the NmsSession_Is, it sets an 
     * internal flag to indicate that it has already informed NMSs of alarm
     * loss. As long as this flag is set, the EMS will not invoke this method
     * again. It however may invoke eventLossOccurred if it fails to push a 
     * different type of event. </p>
     *
     * <p>When this method is invoked on an NmsSession_I, the NMS comes to know 
     * that the EMS has failed to push one or more alarms, TCA, file transfer 
     * or protection switch notifications that may be of interest to it. The 
     * NMS should consider itself to be potentially out-of-sync with the EMS 
     * with respect to these types of notifications. It should wait until the
     * EMS calls eventLossCleared before resynchronizing on alarms, TCA, 
     * file transfer and protection switch data with the EMS.</p>
     *
     * <br>globaldefs::Time_T startTime: The time of the first notification lost.
     * <br>string notificationId: The notificationId of the first notification 
     * lost.
     **/
       case 2:  // nmsSession/NmsSession_I/alarmLossOccurred
       {
         String startTime = globaldefs.Time_THelper.read (in);
         String notificationId = in.read_string ();
         this.alarmLossOccurred (startTime, notificationId);
         out = $rh.createReply();
         break;
       }


  /**
     * <p>This attribute contains a reference to the Session_I on the other side 
     * (NMS/EMS)to which the object is associated.
     * This attribute can be checked to make sure the NmsSession_I/EmsSession_I 
     * association is still valid (in particular in case of communication 
     * failures).</p>
     **/
       case 3:  // session/Session_I/_get_associatedSession
       {
         session.Session_I $result = null;
         $result = this.associatedSession ();
         out = $rh.createReply();
         session.Session_IHelper.write (out, $result);
         break;
       }


  /**
     * <p> Allows for the detection of loss of communication.
     * It is implementation specific to differenciate intermittent 
     * problems from loss of connection.</p>
     **/
       case 4:  // session/Session_I/ping
       {
         this.ping ();
         out = $rh.createReply();
         break;
       }


  /**
     * <p> Allows for a controlled disconnect between parties.
     * All resources allocated for the session are deleted by operation.</p>
     **/
       case 5:  // session/Session_I/endSession
       {
         this.endSession ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:mtnm.tmforum.org/nmsSession/NmsSession_I:1.0", 
    "IDL:mtnm.tmforum.org/session/Session_I:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public NmsSession_I _this() 
  {
    return NmsSession_IHelper.narrow(
    super._this_object());
  }

  public NmsSession_I _this(org.omg.CORBA.ORB orb) 
  {
    return NmsSession_IHelper.narrow(
    super._this_object(orb));
  }


} // class NmsSession_IPOA