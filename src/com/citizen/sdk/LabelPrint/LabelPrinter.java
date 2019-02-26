package com.citizen.sdk.LabelPrint;

import Common.Activation;
import static Common.Helper.Convert;
import static Common.Helper.getGetObjectName;
import static Common.Helper.getReturnObjectName;
import static Common.Helper.ConvertToConcreteInterfaceImplementation;
import Common.Helper;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import com.citizen.sdk.LabelPrint.*;
import jio.System.*;

public class LabelPrinter implements ILabelPrinter, IDisposable {
  protected NObject javonetHandle;
  /** GetFiled */
  public static java.lang.String getLIBRARY_DESCRIPTION() {
    try {
      java.lang.String res = Javonet.getType("LabelPrinter").get("LIBRARY_DESCRIPTION");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setLIBRARY_DESCRIPTION(java.lang.String param) {
    try {
      Javonet.getType("LabelPrinter").set("LIBRARY_DESCRIPTION", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.String getLIBRARY_BUILD() {
    try {
      java.lang.String res = Javonet.getType("LabelPrinter").get("LIBRARY_BUILD");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setLIBRARY_BUILD(java.lang.String param) {
    try {
      Javonet.getType("LabelPrinter").set("LIBRARY_BUILD", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LabelPrinter() {
    try {
      javonetHandle = Javonet.New("com.citizen.sdk.LabelPrint.LabelPrinter");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LabelPrinter(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Dispose() {
    try {
      javonetHandle.explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter").invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer GetVersionCode() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("GetVersionCode");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.String GetVersionName() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("GetVersionName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.Integer Connect(java.lang.Integer connectType, java.lang.String addr) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("Connect", connectType, addr);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer Connect(
      java.lang.Integer connectType, java.lang.String addr, java.lang.Integer port) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("Connect", connectType, addr, port);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer Connect(
      java.lang.Integer connectType,
      java.lang.String addr,
      java.lang.Integer port,
      java.lang.Integer timeout) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("Connect", connectType, addr, port, timeout);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer Disconnect() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("Disconnect");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer SetCommProperties(
      java.lang.Integer baudRate, java.lang.Integer parity, java.lang.Integer handShake) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("SetCommProperties", baudRate, parity, handShake);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer PrinterCheck() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("PrinterCheck");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer SendData(java.lang.Byte[] data) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("SendData", new Object[] {data});
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer Print(LabelDesign design, java.lang.Integer quantity) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("Print", design, quantity);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer StoreNVBitmap(
      java.lang.String filePath,
      java.lang.String name,
      java.lang.Integer rotation,
      java.lang.Integer width,
      java.lang.Integer height) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("StoreNVBitmap", filePath, name, rotation, width, height);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer ClearOutput() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("ClearOutput");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetErrorExtended(AtomicReference<java.lang.String> msg) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke(
                  "GetErrorExtended",
                  new NOut(msg, Helper.JavaToDotnetType.get(java.lang.String.class)));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.String[] SearchLabelPrinter(
      java.lang.Integer ifType,
      java.lang.Integer searchTime,
      AtomicReference<java.lang.Integer> result,
      Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke(
                  "SearchLabelPrinter",
                  ifType,
                  searchTime,
                  new NOut(result, Helper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return null;
      return (java.lang.String[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public CitizenPrinterInfo[] SearchCitizenPrinter(
      java.lang.Integer ifType,
      java.lang.Integer searchTime,
      AtomicReference<java.lang.Integer> result,
      Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke(
                  "SearchCitizenPrinter",
                  ifType,
                  searchTime,
                  new NOut(result, Helper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return null;
      return (CitizenPrinterInfo[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Integer Preview(
      LabelDesign design,
      java.lang.Integer resolution,
      java.lang.Integer measurementUnit,
      java.lang.Integer paperWidth,
      java.lang.Integer paperHeight) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("Preview", design, resolution, measurementUnit, paperWidth, paperHeight);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer SetHorizontalMagnification(java.lang.Integer horizontalMagnification) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("SetHorizontalMagnification", horizontalMagnification);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetHorizontalMagnification() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("GetHorizontalMagnification");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer SetVerticalMagnification(java.lang.Integer verticalMagnification) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("SetVerticalMagnification", verticalMagnification);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetVerticalMagnification() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("GetVerticalMagnification");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer SetFormatAttribute(java.lang.Integer formatAttribute) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("SetFormatAttribute", formatAttribute);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetFormatAttribute() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("GetFormatAttribute");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer SetContinuousMediaLength(java.lang.Integer continuousMediaLength) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("SetContinuousMediaLength", continuousMediaLength);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetContinuousMediaLength() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("GetContinuousMediaLength");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer SetMeasurementUnit(java.lang.Integer measurementUnit) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("SetMeasurementUnit", measurementUnit);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetMeasurementUnit() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("GetMeasurementUnit");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer SetPrintSpeed(java.lang.Integer printSpeed) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("SetPrintSpeed", printSpeed);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetPrintSpeed() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("GetPrintSpeed");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer SetFeedSpeed(java.lang.Integer feedSpeed) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("SetFeedSpeed", feedSpeed);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetFeedSpeed() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("GetFeedSpeed");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer SetSlewSpeed(java.lang.Integer slewSpeed) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("SetSlewSpeed", slewSpeed);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetSlewSpeed() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("GetSlewSpeed");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer SetBackupSpeed(java.lang.Integer backupSpeed) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("SetBackupSpeed", backupSpeed);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetBackupSpeed() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("GetBackupSpeed");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer SetPrintDarkness(java.lang.Integer printDarkness) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("SetPrintDarkness", printDarkness);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetPrintDarkness() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("GetPrintDarkness");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer SetDoubleHeat(java.lang.Integer doubleHeat) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("SetDoubleHeat", doubleHeat);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetDoubleHeat() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("GetDoubleHeat");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer SetVerticalOffset(java.lang.Integer verticalOffset) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("SetVerticalOffset", verticalOffset);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetVerticalOffset() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("GetVerticalOffset");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer SetHorizontalOffset(java.lang.Integer horizontalOffset) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("SetHorizontalOffset", horizontalOffset);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetHorizontalOffset() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("GetHorizontalOffset");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer SetMediaHandling(java.lang.Integer mediaHandling) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("SetMediaHandling", mediaHandling);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetMediaHandling() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("GetMediaHandling");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer SetStartOffset(java.lang.Integer startOffset) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("SetStartOffset", startOffset);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetStartOffset() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("GetStartOffset");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer SetStopOffset(java.lang.Integer stopOffset) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("SetStopOffset", stopOffset);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetStopOffset() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("GetStopOffset");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer SetLabelSensor(java.lang.Integer labelSensor) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("SetLabelSensor", labelSensor);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetLabelSensor() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("GetLabelSensor");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer SetPrintMethod(java.lang.Integer printMethod) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("SetPrintMethod", printMethod);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetPrintMethod() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("GetPrintMethod");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer SetSensorLocation(java.lang.Integer sensorLocation) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("SetSensorLocation", sensorLocation);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetSensorLocation() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("GetSensorLocation");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetCommandInterpreterInAction() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("GetCommandInterpreterInAction");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetPaperError() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("GetPaperError");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetRibbonEnd() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("GetRibbonEnd");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetBatchProcessing() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("GetBatchProcessing");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetPrinting() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("GetPrinting");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetPause() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("GetPause");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetWaitingForPeeling() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelPrinter")
              .invoke("GetWaitingForPeeling");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void SetLog(java.lang.Integer mode, java.lang.String path, java.lang.Integer maxSize) {
    try {
      javonetHandle.invoke("SetLog", mode, path, maxSize);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
