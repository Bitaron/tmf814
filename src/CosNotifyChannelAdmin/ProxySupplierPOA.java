package CosNotifyChannelAdmin;


/**
* CosNotifyChannelAdmin/ProxySupplierPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotifyChannelAdmin.idl
* Wednesday, June 15, 2016 7:24:32 PM COT
*/


/**
    * An interface for proxy suppliers.
    */
public abstract class ProxySupplierPOA extends org.omg.PortableServer.Servant
 implements CosNotifyChannelAdmin.ProxySupplierOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_MyType", new java.lang.Integer (0));
    _methods.put ("_get_MyAdmin", new java.lang.Integer (1));
    _methods.put ("_get_priority_filter", new java.lang.Integer (2));
    _methods.put ("_set_priority_filter", new java.lang.Integer (3));
    _methods.put ("_get_lifetime_filter", new java.lang.Integer (4));
    _methods.put ("_set_lifetime_filter", new java.lang.Integer (5));
    _methods.put ("obtain_offered_types", new java.lang.Integer (6));
    _methods.put ("validate_event_qos", new java.lang.Integer (7));
    _methods.put ("get_qos", new java.lang.Integer (8));
    _methods.put ("set_qos", new java.lang.Integer (9));
    _methods.put ("validate_qos", new java.lang.Integer (10));
    _methods.put ("add_filter", new java.lang.Integer (11));
    _methods.put ("remove_filter", new java.lang.Integer (12));
    _methods.put ("get_filter", new java.lang.Integer (13));
    _methods.put ("get_all_filters", new java.lang.Integer (14));
    _methods.put ("remove_all_filters", new java.lang.Integer (15));
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
         * The type of this proxy.
         */
       case 0:  // CosNotifyChannelAdmin/ProxySupplier/_get_MyType
       {
         CosNotifyChannelAdmin.ProxyType $result = null;
         $result = this.MyType ();
         out = $rh.createReply();
         CosNotifyChannelAdmin.ProxyTypeHelper.write (out, $result);
         break;
       }


  /**
         * The administration object that created this proxy.
         */
       case 1:  // CosNotifyChannelAdmin/ProxySupplier/_get_MyAdmin
       {
         CosNotifyChannelAdmin.ConsumerAdmin $result = null;
         $result = this.MyAdmin ();
         out = $rh.createReply();
         CosNotifyChannelAdmin.ConsumerAdminHelper.write (out, $result);
         break;
       }


  /**
         * A mapping filter which if a non-nil reference will be consulted 
         * for resolving the priority of the event.
         */
       case 2:  // CosNotifyChannelAdmin/ProxySupplier/_get_priority_filter
       {
         CosNotifyFilter.MappingFilter $result = null;
         $result = this.priority_filter ();
         out = $rh.createReply();
         CosNotifyFilter.MappingFilterHelper.write (out, $result);
         break;
       }


  /**
         * A mapping filter which if a non-nil reference will be consulted 
         * for resolving the priority of the event.
         */
       case 3:  // CosNotifyChannelAdmin/ProxySupplier/_set_priority_filter
       {
         CosNotifyFilter.MappingFilter newPriority_filter = CosNotifyFilter.MappingFilterHelper.read (in);
         this.priority_filter (newPriority_filter);
         out = $rh.createReply();
         break;
       }


  /**
         * A filter which if a non-nil reference will be consulted 
         * for resolving the priority of the event.
         */
       case 4:  // CosNotifyChannelAdmin/ProxySupplier/_get_lifetime_filter
       {
         CosNotifyFilter.MappingFilter $result = null;
         $result = this.lifetime_filter ();
         out = $rh.createReply();
         CosNotifyFilter.MappingFilterHelper.write (out, $result);
         break;
       }


  /**
         * A filter which if a non-nil reference will be consulted 
         * for resolving the priority of the event.
         */
       case 5:  // CosNotifyChannelAdmin/ProxySupplier/_set_lifetime_filter
       {
         CosNotifyFilter.MappingFilter newLifetime_filter = CosNotifyFilter.MappingFilterHelper.read (in);
         this.lifetime_filter (newLifetime_filter);
         out = $rh.createReply();
         break;
       }


  /**
         * Get a list of event type names that this proxy can potentially
         * forward to its associated consumers.
         * @parm <code>mode</code> - The mode of type retrieval.
         * @returns A sequence of event type names.
         */
       case 6:  // CosNotifyChannelAdmin/ProxySupplier/obtain_offered_types
       {
         CosNotifyChannelAdmin.ObtainInfoMode mode = CosNotifyChannelAdmin.ObtainInfoModeHelper.read (in);
         CosNotification.EventType $result[] = null;
         $result = this.obtain_offered_types (mode);
         out = $rh.createReply();
         CosNotification.EventTypeSeqHelper.write (out, $result);
         break;
       }


  /**
         * Validate whether or not this proxy can honour the specified 
         * quality of service requirements.
         * @parm <code>required_qos</code> - Quality of service name-value
         * pairs which a client is interested in validating.
         * @parm <code>available_qos</code> - Quality of service settings that
         * this proxy can support in addition to the ones in the input sequence.
         * @raises UnsupportedQoS If any of the quality of service settings
         * in the input sequence could not be honoured.
         */
       case 7:  // CosNotifyChannelAdmin/ProxySupplier/validate_event_qos
       {
         try {
           CosNotification.Property required_qos[] = CosNotification.QoSPropertiesHelper.read (in);
           CosNotification.NamedPropertyRangeSeqHolder available_qos = new CosNotification.NamedPropertyRangeSeqHolder ();
           this.validate_event_qos (required_qos, available_qos);
           out = $rh.createReply();
           CosNotification.NamedPropertyRangeSeqHelper.write (out, available_qos.value);
         } catch (CosNotification.UnsupportedQoS $ex) {
           out = $rh.createExceptionReply ();
           CosNotification.UnsupportedQoSHelper.write (out, $ex);
         }
         break;
       }


  /**
         * Returns the current quality of service settings for this object.
         * @returns A sequence of name-value pairs defining the quality of 
         * service settings.
         */
       case 8:  // CosNotification/QoSAdmin/get_qos
       {
         CosNotification.Property $result[] = null;
         $result = this.get_qos ();
         out = $rh.createReply();
         CosNotification.PropertySeqHelper.write (out, $result);
         break;
       }


  /**
         * Sets the quality of service settings for this object.
         * @parm <code>qos</code> - A sequence of name-value pairs defining
         * the desired quality of service settings.
         * @raises UnsupportedQoS If the requested settings are not supported.
         */
       case 9:  // CosNotification/QoSAdmin/set_qos
       {
         try {
           CosNotification.Property qos[] = CosNotification.QoSPropertiesHelper.read (in);
           this.set_qos (qos);
           out = $rh.createReply();
         } catch (CosNotification.UnsupportedQoS $ex) {
           out = $rh.createExceptionReply ();
           CosNotification.UnsupportedQoSHelper.write (out, $ex);
         }
         break;
       }


  /**
         * Validates a set of quality of service requirements.
         * @parm <code>qos</code> -  A sequence of name-value pairs defining
         * quality of service settings that are to be validated.
         * @parm <code>available_qos</code> - A sequence of all additional
         * quality of service setting supported by this object.
         * @raises UnsupportedQoS If any of the setting in the input argument
         * are not supported.
         */
       case 10:  // CosNotification/QoSAdmin/validate_qos
       {
         try {
           CosNotification.Property required_qos[] = CosNotification.QoSPropertiesHelper.read (in);
           CosNotification.NamedPropertyRangeSeqHolder available_qos = new CosNotification.NamedPropertyRangeSeqHolder ();
           this.validate_qos (required_qos, available_qos);
           out = $rh.createReply();
           CosNotification.NamedPropertyRangeSeqHelper.write (out, available_qos.value);
         } catch (CosNotification.UnsupportedQoS $ex) {
           out = $rh.createExceptionReply ();
           CosNotification.UnsupportedQoSHelper.write (out, $ex);
         }
         break;
       }


  /**
         * Add a filter to this object's list of filters. All these filters
         * are tried upon reception of an event.
         * @parm <code>new_filter</code> - The filter to add.
         * @returns An unique ID that identifies the added filter.
         */
       case 11:  // CosNotifyFilter/FilterAdmin/add_filter
       {
         CosNotifyFilter.Filter new_filter = CosNotifyFilter.FilterHelper.read (in);
         int $result = (int)0;
         $result = this.add_filter (new_filter);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }


  /**
         * Remove a filter from this object's list of filters.
         * @parm <code>filter</code> - The filter ID.
         * @raises FilterNotFound If the ID does not correspond to any
         * filter that has been added to this object.
         */
       case 12:  // CosNotifyFilter/FilterAdmin/remove_filter
       {
         try {
           int filter = CosNotifyFilter.FilterIDHelper.read (in);
           this.remove_filter (filter);
           out = $rh.createReply();
         } catch (CosNotifyFilter.FilterNotFound $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyFilter.FilterNotFoundHelper.write (out, $ex);
         }
         break;
       }


  /**
         * Get a filter from the filter ID.
         * @parm <code>filter</code> - The filter ID.
         * @raises FilterNotFound If the ID does not correspond to any
         * filter that has been added to this object.
         */
       case 13:  // CosNotifyFilter/FilterAdmin/get_filter
       {
         try {
           int filter = CosNotifyFilter.FilterIDHelper.read (in);
           CosNotifyFilter.Filter $result = null;
           $result = this.get_filter (filter);
           out = $rh.createReply();
           CosNotifyFilter.FilterHelper.write (out, $result);
         } catch (CosNotifyFilter.FilterNotFound $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyFilter.FilterNotFoundHelper.write (out, $ex);
         }
         break;
       }


  /**
         * Get all filters added to this administration object.
         * @returns A sequence of filter IDs.
         */
       case 14:  // CosNotifyFilter/FilterAdmin/get_all_filters
       {
         int $result[] = null;
         $result = this.get_all_filters ();
         out = $rh.createReply();
         CosNotifyFilter.FilterIDSeqHelper.write (out, $result);
         break;
       }


  /**
         * Remove all filters added to this administration object.
         */
       case 15:  // CosNotifyFilter/FilterAdmin/remove_all_filters
       {
         this.remove_all_filters ();
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
    "IDL:omg.org/CosNotifyChannelAdmin/ProxySupplier:1.0", 
    "IDL:omg.org/CosNotification/QoSAdmin:1.0", 
    "IDL:omg.org/CosNotifyFilter/FilterAdmin:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public ProxySupplier _this() 
  {
    return ProxySupplierHelper.narrow(
    super._this_object());
  }

  public ProxySupplier _this(org.omg.CORBA.ORB orb) 
  {
    return ProxySupplierHelper.narrow(
    super._this_object(orb));
  }


} // class ProxySupplierPOA