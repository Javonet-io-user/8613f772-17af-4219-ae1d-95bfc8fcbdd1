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

public class CitizenPrinterInfo {
  protected NObject javonetHandle;
  /** GetFiled */
  public java.lang.String getipAddress() {
    try {
      java.lang.String res = javonetHandle.get("ipAddress");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public void setipAddress(java.lang.String param) {
    try {
      javonetHandle.set("ipAddress", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.String getmacAddress() {
    try {
      java.lang.String res = javonetHandle.get("macAddress");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public void setmacAddress(java.lang.String param) {
    try {
      javonetHandle.set("macAddress", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.String getdeviceName() {
    try {
      java.lang.String res = javonetHandle.get("deviceName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public void setdeviceName(java.lang.String param) {
    try {
      javonetHandle.set("deviceName", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.String getprinterModel() {
    try {
      java.lang.String res = javonetHandle.get("printerModel");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public void setprinterModel(java.lang.String param) {
    try {
      javonetHandle.set("printerModel", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.String getbdAddress() {
    try {
      java.lang.String res = javonetHandle.get("bdAddress");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public void setbdAddress(java.lang.String param) {
    try {
      javonetHandle.set("bdAddress", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CitizenPrinterInfo() {
    try {
      javonetHandle = Javonet.New("com.citizen.sdk.LabelPrint.CitizenPrinterInfo");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CitizenPrinterInfo(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
