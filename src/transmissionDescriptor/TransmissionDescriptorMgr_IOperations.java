package transmissionDescriptor;


/**
* transmissionDescriptor/TransmissionDescriptorMgr_IOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from transmissionDescriptor.idl
* Wednesday, June 15, 2016 7:24:43 PM COT
*/


/**
   * <p>The transmissionDescriptorManager is used to gain access to operations
   * that deal with Transmission Descriptor.</p>
   *
   * <p>A handle to an instance of this interface is gained via the
   * emsSession::EmsSession_I::getManager()  operation in Manager.</p>
   **/
public interface TransmissionDescriptorMgr_IOperations  extends common.Common_IOperations
{

  /**
     * <p>This allows an NMS to request all of the transmissionDescriptors that
  
     * are under the control of the transmissionDescriptorMgr_I.</p>
     * 
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     * 
     * <br>unsigned long how_many: number of iterators to return in 
     * transmissionDescList.
     * <br>transmissionDescriptor::TransmissionDescriptorList 
     * transmissionDescList: the first batch of iterators.
     * <br>transmissionDescriptor::TransmissionDescriptorIterator_I 
     * transmissionDescIt: the iterator used to access the remaining Transmission 
     * Descriptors.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if the EMS does not support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_TOO_MANY_OPEN_ITERATORS - Raised when maximum number of iterators
     *  that the EMS can support has been reached<br>
     * EXCPT_UNABLE_TO_COMPLY - If the EMS cannot comply with the request,
     *  and cannot determine the reason it could not comply,
     *  it may raise this exception. <br>
    * <br>
     **/
  void getAllTransmissionDescriptors (int how_many, transmissionDescriptor.TransmissionDescriptorList_THolder transmissionDescList, transmissionDescriptor.TransmissionDescriptorIterator_IHolder transmissionDescIt) throws globaldefs.ProcessingFailureException;

  /**
     * <p>This operation has exactly the same behaviour as 
     * getAllTransmissionDescriptors, but
     * instead of returning the entire object structures, this operation returns 
     * their names.</p>
     *
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     *
     * <br>unsigned long how_many: the number of iterators to return in 
     * nameList.
     * <br>globaldefs::NamingAttributesList_T nameList: the first batch of 
     * iterator names.
     * <br>globaldefs::NamingAttributesIterator_I nameIt: the iterator used to 
     * retrieve the remaining iterator names.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     *  As for getAllTransmissionDescriptors.
  
     **/
  void getAllTransmissionDescriptorNames (int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;

  /** 
     * <p>This service returns the Transmission Descriptor struct for the given 
     * tmdName. The Transmission Descriptor structure contains an NVSList of 
     * traffic parameters.  The traffic parameters returned will be the parameters
     * in place on the actual Transmission Descriptor.  If there are no
     * traffic parameters, then the NVSList will be empty.</p>
     * <br>globaldefs::NamingAttributes_T tmdName: name of the Transmission 
     * Descriptor.
     * <br>TransmissionDescriptor_T tmd : the returned Transmission Descriptor.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if the EMS does not support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when tmdName does not reference 
     *  trasmissionDescriptor object<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when tmdName references object which does 
     *  not exist<br>
     * EXCPT_UNABLE_TO_COMPLY - If the EMS cannot comply with the request,
     *  and cannot determine the reason it could not comply,
     *  it may raise this exception. <br>
     * <br>
     **/
  void getTransmissionDescriptor (globaldefs.NameAndStringValue_T[] tmdName, transmissionDescriptor.TransmissionDescriptor_THolder tmd) throws globaldefs.ProcessingFailureException;

  /**
     * <p>This allows an NMS to request all of the TPs associated with the  
     * specified Transmission Descriptor. If there are no TPs which are 
     * associated with the specified Transmission Descriptor, then an empty list 
     * is returned. </p>
  
     * 
     * <p>In order to allow the NMS to deal with a large number of objects
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     * 
     * <br>globaldefs::NamingAttributes_T transmissionDescriptorName: the name of 
     * the Transmission Descriptor.
     * <br>unsigned long how_many: maximum number of TPs to return in the 
     * first batch.
     * <br>terminationPoint::TerminationPointList_T tpList: first batch of 
     * TPs.
     * <br>terminationPoint::TerminationPointIterator_I tpIt: iterator to 
     * access the remaining TPs.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if the EMS does not support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of a non-specific EMS internal 
     *  failure<br>
     * EXCPT_UNABLE_TO_COMPLY - If the EMS cannot comply with the request,
     *  and cannot determine the reason it could not comply,
     *  it may raise this exception. <br>
     * EXCPT_INVALID_INPUT - Raised when transmissionDescriptrName does not 
     *  reference a Transmission Descriptor object<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when transmissionDescriptorName references
     *  an object that does not exist<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is 
     *  lost<br>
     * EXCPT_TOO_MANY_OPEN_ITERATORS - Raised when maximum number of iterators
     *  that the EMS can support has been reached<br>
     * <br>
     **/
  void getAssociatedTPs (globaldefs.NameAndStringValue_T[] transmissionDescriptorName, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException;

  /**
     * <p>The createTransmissionDescriptor operation is used to create
     * a new Transmission Descriptor on the server. A Transmission Descriptor 
     * Create Data structure, representing the new Transmission Descriptor, is 
     * passed as input. The resulting Transmission Descriptor is 
     * returned as a result.</p>
     *
     * <br>TMDCreateData_T newTMDCreateData: information about the Transmission 
     * Descriptor to be created.
     * <br>TransmissionDescriptor_T newTransmissionDescriptor: result of the 
     * creation.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS does not support creation of TMDs via 
     *  this interface<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised if newTMDCreateData contains invalid data<br>
     * EXCPT_USERLABEL_IN_USE - Raised when the userLabel uniqueness constraint is 
     *  not met<br>
     * EXCPT_CAPACITY_EXCEEDED - Raised when maximum number of Transmission 
     *  Descriptors has been reached<br>
     * EXCPT_UNABLE_TO_COMPLY - If the EMS cannot comply with the request,
     *  and cannot determine the reason it could not comply,
     *  it may raise this exception. <br>
     * <br>
     **/
  void createTransmissionDescriptor (transmissionDescriptor.TMDCreateData_T newTMDCreateData, transmissionDescriptor.TransmissionDescriptor_THolder newTransmissionDescriptor) throws globaldefs.ProcessingFailureException;

  /**
     * <p>The delete Transmission Descriptor operation is used to 
     * delete a Transmission Descriptor on the server. This operation is
     * idempotent. If the service is called with the
     * name of a non-existent Transmission Descriptor, it will succeed.</p>
     *
     * <br>globaldefs::NamingAttributes_T transmissionDescriptorName:
     * The name of the TransmissionDescriptor to be deleted.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS does not support deletion of TMDs via 
     *  this interface<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_OBJECT_IN_USE - Raised if there are TPs or Matrix Flow Domains 
     *  that are using the Transmission Descriptor<br>
     * EXCPT_INVALID_INPUT - Raised when input parameter is syntactical incorrect.
     * EXCPT_ENTITY_NOT_FOUND - Raised when the Transmission Descriptor to be 
     *  deleted does not exist.
     * EXCPT_UNABLE_TO_COMPLY - If the EMS cannot comply with the request,
     *  and cannot determine the reason it could not comply,
     *  it may raise this exception. <br>
     * <br>
    **/
  void deleteTransmissionDescriptor (globaldefs.NameAndStringValue_T[] transmissionDescriptorName) throws globaldefs.ProcessingFailureException;

  /**
     * <p>The modifyTransmissionDescriptor operation is used to modify a
     * Transmission Descriptor (TMD) in the EMS.
     *. The resulting Transmission Descriptor is 
     * returned as a result.</p>
     *
     * <p> When transmission parameters are modified, this will automatically 
     * modify the corresponding parameters in all associated TPs/MFDs on a best 
     * effort basis. TPs/MFDs whose parameters could not be modified shall be 
     * returned by the EMS. </p>
     *
     * <p> Note: Only the modified parameters will be updated in the TPs/MFDs;
     * i.e., the TMD parameter/value list may be inconsistent with the corresponding 
     * parameter/value list of the associated TPs/MFDs. </p>
     *
     * <br>globaldefs::NamingAttributes_T tmdName: The name of the Transmission 
     * Descriptor to be modified.
     *
     * <br>TMDModifyData_T tmdModifyData: Information about the Transmission 
     * Descriptor to be modified.
     *
     * TPDataList_T <b>tpsToModify</b>: in: The list of TPs with associated 
     * parameters to be applied. out: The list of TPs with associated 
     * applied parameters. <br>
  
     * <br>TransmissionDescriptor_T modifiedTransmissionDescriptor: result of the 
     * modification.
     *
     * <br> globaldefs::NamingAttributesList_T failedMEList: the names of all
     * TMD associated MEs that could not be reached by the EMS. 
     *
     * <br> globaldefs::NamingAttributesList_T failedTPsMFDsList: the names of all
     * TPs and MFDs that could not be changed to the new parameter values due to
     * some error reasons.
     *
     * <br>string errorReason: In case a "best effort" parameter could not be set 
     * an indication of the fault reason is provided by the EMS. 
     *
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS does not support modification of TMDs via 
     *  this interface<br>
  
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised if tmdModifyData contains invalid data<br>
     * EXCPT_USERLABEL_IN_USE - Raised when the userLabel uniqueness constraint is 
     *  not met<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when tmdName references object which does 
     *  not exist<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is 
     *  lost<br>
     * EXCPT_UNABLE_TO_COMPLY - If the EMS cannot comply with the request,
     *  and cannot determine the reason it could not comply,
     *  it may raise this exception. <br>
     * <br>
     **/
  void modifyTransmissionDescriptor (globaldefs.NameAndStringValue_T[] tmdName, transmissionDescriptor.TMDModifyData_T tmdModifyData, subnetworkConnection.TPDataList_THolder tpsToModify, transmissionDescriptor.TransmissionDescriptor_THolder modifiedTransmissionDescriptor, globaldefs.NamingAttributesList_THolder failedMEList, globaldefs.NamingAttributesList_THolder failedTPsMFDsList, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;

  /**
     * <p>This service validates the TMD state
     * of the specified TP, MFD or FDFr object identified by ObjectName.</p>
     *
     * <p>It first verifies the existence of the assigned TMD
  
     * and then compares the transmission parameters of the TMD and object,
     * and the "additional TP info" parameters of the TMD with the additional
     * info parameters of the object.</p>
     *
     * <p>If a TMD parameter is not present as an object parameter or is present 
     * but with a different value, this is called a "parameter mismatch", and the 
     * TMD state will take the value "mismatch".  The service returns the current
     * TMD state and all mismatched transmission or "additional TP info"
     * parameters of the TMD (which should mostly be none) as its output.</p>
     *
     * <br>globaldefs::NamingAttributes_T objectName:
     * the TP, MFD or FDFr object whose TMD assignment shall be verified
     *
     * <br>string tmdAssignmentState: the TMD state (s) of the object
     * as determined by the verification procedure;
     *
     * <br>transmissionParameters::LayeredParameterList_T transmissionParams:
     * a "delta" list of mismatched TMD transmission parameters, or empty. See
     * <a href=../../../supportingDocumentation/SD1-16_LayeredParameters.pdf > 
     * SD1-16_LayeredParameters.pdf</a>
     * Layered Transmission Parameters</a> for more details.
     *
     * <br>globaldefs::NVSList_T additionalTPInfo: a "delta" list
     * of mismatched "additional TP info" parameters, or empty
  
     *
  
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if the entire request is not supported 
     * by the EMS or the request with the specified input parameters 
     * is not supported. <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal
     *  failure (see errorReason attribute of ProcessingFailureException())<br>
  
     * EXCPT_INVALID_INPUT - Raised when objectName is incorrectly formed <br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when objectName references an object
     *  that does not exist<br>
     * EXCPT_NE_COMM_LOSS - Raised when the communication to the managed
     *  element containing objectName is lost<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised when the EMS is unable to 
     *  execute the request<br>
     * <br>
     **/
  void validateTMDAssignmentToObject (globaldefs.NameAndStringValue_T[] objectName, org.omg.CORBA.StringHolder objectAssignmentState, transmissionParameters.LayeredParameterList_THolder transmissionParams, globaldefs.NVSList_THolder additionalTPInfo) throws globaldefs.ProcessingFailureException;

  /**
     * <p>This service associates/un-associates a TransmissionDescriptor (TMD) 
     * to/from a TP or MFD object. </p>
     * 
     * <br>The association of a TMD to an an object
     * by this operation amounts to a forced overwriting of the layered 
     * transmission parameters of the object by the layered transmission 
     * parameters of the TMD and to a forced overwriting of the additional info 
     * parameters of the object by the additional TP info parameters of the TMD. 
     * 
     * <br> When parameters of the TMD are already present as parameters of the 
     * object, the current object parameter values are overwritten by the TMD 
     * parameter values. When current parameters of the object are not present as 
     * parameters of the TMD, the current parameters are left unchanged. 
     * 
     * <br> An associated TMD is 
     * un-associated when no name is provided for the transmissionDescriptorName 
     * input parameter. The un-association of a TMD from an object has no effect 
     * on the other parameters of the object, i.e. the other layered transmission
     *  parameters and additional info parameters of the object remain 
     * unchanged. 
     * 
     * <br> Consistency rules:<ol> 
     * <li> When a TMD is assigned to an object this assignment is called
     *  consistent if whenever a TMD transmission parameter is also present as an 
     * object transmission parameter or a TMD additional TP info parameter is also 
     * present as an object additional info parameter, the common parameters 
     * of the TMD and object have the same values. </li>
     * <li> The degree of consistency of a TMD assignment to an object 
     * is determined by the TMD state of the object. </li>
     * </ol> <br>
     * 
     * globaldefs::NamingAttributes_T <b>tmdName</b>:
     * The name of the TransmissionDescriptor to associate to the object. 
     * NULL means that an associated TransmissionDescriptor has to be 
     * un-associated from the object. <br>
     * 
     * TPorMFDorFDFr_T <b>tPorMFDorFDFr</b>:The TP, MFD or FDFr object.
     * 
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised when EMS does not support  
     * this operation. <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS  
     * internal failure. <br>
     * EXCPT_INVALID_INPUT - Raised when any input parameter is syntactically  
     * incorrect. <br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when the TransmissionDescriptor  
     * to be assigned does not exist. <br>
     * EXCPT_UNABLE_TO_COMPLY - Raised when transmission parameter values  
     * could not be configured in the MFD. <br>
     * EXCPT_NE_COMM_LOSS - Raised when communication to managed element 
     * is lost. <br>
     * <br>
     **/
  void setTMDAssociation (globaldefs.NameAndStringValue_T[] tmdName, transmissionDescriptor.TPorMFDorFDFr_THolder tPorMFDorFDFr) throws globaldefs.ProcessingFailureException;
} // interface TransmissionDescriptorMgr_IOperations
