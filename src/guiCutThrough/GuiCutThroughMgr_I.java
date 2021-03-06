package guiCutThrough;


/**
* guiCutThrough/GuiCutThroughMgr_I.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from guiCutThrough.idl
* Wednesday, June 15, 2016 7:24:37 PM COT
*/


/**
   * <p>The GuiCutThroughMgr_I is used to access the GUI Cut-Through data
   * available at the EMS and launch an NMS display of the EMS GUI.</p>
   *
   * <p>A handle to this interface is gained via the
   * emsSession::EmsSession_I::getManager() operation in the managerInterface 
   * parameter when the managerName "GuiCutThrough" is used.</p>
   **/
public interface GuiCutThroughMgr_I extends GuiCutThroughMgr_IOperations, common.Common_I, org.omg.CORBA.portable.IDLEntity 
{
} // interface GuiCutThroughMgr_I
