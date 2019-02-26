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

public class LabelConst {
  protected NObject javonetHandle;
  /** GetFiled */
  public static java.lang.Integer getCLS_PROPERTY_DEFAULT() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PROPERTY_DEFAULT");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PROPERTY_DEFAULT(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PROPERTY_DEFAULT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PORT_NET() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PORT_NET");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PORT_NET(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PORT_NET", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PORT_Bluetooth() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PORT_Bluetooth");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PORT_Bluetooth(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PORT_Bluetooth", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PORT_USB() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PORT_USB");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PORT_USB(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PORT_USB", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PORT_COM() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PORT_COM");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PORT_COM(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PORT_COM", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PORT_LPT() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PORT_LPT");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PORT_LPT(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PORT_LPT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_COM_BAUDRATE_1200() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_COM_BAUDRATE_1200");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_COM_BAUDRATE_1200(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_COM_BAUDRATE_1200", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_COM_BAUDRATE_2400() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_COM_BAUDRATE_2400");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_COM_BAUDRATE_2400(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_COM_BAUDRATE_2400", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_COM_BAUDRATE_4800() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_COM_BAUDRATE_4800");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_COM_BAUDRATE_4800(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_COM_BAUDRATE_4800", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_COM_BAUDRATE_9600() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_COM_BAUDRATE_9600");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_COM_BAUDRATE_9600(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_COM_BAUDRATE_9600", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_COM_BAUDRATE_19200() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_COM_BAUDRATE_19200");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_COM_BAUDRATE_19200(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_COM_BAUDRATE_19200", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_COM_BAUDRATE_38400() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_COM_BAUDRATE_38400");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_COM_BAUDRATE_38400(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_COM_BAUDRATE_38400", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_COM_BAUDRATE_57600() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_COM_BAUDRATE_57600");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_COM_BAUDRATE_57600(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_COM_BAUDRATE_57600", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_COM_BAUDRATE_115200() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_COM_BAUDRATE_115200");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_COM_BAUDRATE_115200(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_COM_BAUDRATE_115200", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_COM_PARITY_NONE() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_COM_PARITY_NONE");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_COM_PARITY_NONE(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_COM_PARITY_NONE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_COM_PARITY_ODD() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_COM_PARITY_ODD");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_COM_PARITY_ODD(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_COM_PARITY_ODD", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_COM_PARITY_EVEN() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_COM_PARITY_EVEN");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_COM_PARITY_EVEN(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_COM_PARITY_EVEN", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_COM_HANDSHAKE_DTRDSR() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_COM_HANDSHAKE_DTRDSR");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_COM_HANDSHAKE_DTRDSR(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_COM_HANDSHAKE_DTRDSR", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_COM_HANDSHAKE_XONXOFF() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_COM_HANDSHAKE_XONXOFF");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_COM_HANDSHAKE_XONXOFF(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_COM_HANDSHAKE_XONXOFF", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SUCCESS() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SUCCESS");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SUCCESS(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SUCCESS", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_E_CONNECTED() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_E_CONNECTED");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_E_CONNECTED(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_E_CONNECTED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_E_DISCONNECT() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_E_DISCONNECT");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_E_DISCONNECT(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_E_DISCONNECT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_E_NOTCONNECT() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_E_NOTCONNECT");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_E_NOTCONNECT(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_E_NOTCONNECT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_E_CONNECT_NOTFOUND() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_E_CONNECT_NOTFOUND");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_E_CONNECT_NOTFOUND(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_E_CONNECT_NOTFOUND", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_E_USB_BIDIRECTIONAL() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_E_USB_BIDIRECTIONAL");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_E_USB_BIDIRECTIONAL(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_E_USB_BIDIRECTIONAL", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_E_ILLEGAL() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_E_ILLEGAL");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_E_ILLEGAL(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_E_ILLEGAL", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_E_OFFLINE() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_E_OFFLINE");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_E_OFFLINE(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_E_OFFLINE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_E_NOEXIST() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_E_NOEXIST");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_E_NOEXIST(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_E_NOEXIST", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_E_FAILURE() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_E_FAILURE");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_E_FAILURE(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_E_FAILURE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_E_TIMEOUT() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_E_TIMEOUT");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_E_TIMEOUT(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_E_TIMEOUT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_E_NO_LIST() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_E_NO_LIST");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_E_NO_LIST(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_E_NO_LIST", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_EPTR_BADFORMAT() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_EPTR_BADFORMAT");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_EPTR_BADFORMAT(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_EPTR_BADFORMAT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_STS_NO() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_STS_NO");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_STS_NO(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_STS_NO", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_STS_YES() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_STS_YES");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_STS_YES(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_STS_YES", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_LOCALE_JP() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_LOCALE_JP");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_LOCALE_JP(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_LOCALE_JP", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_LOCALE_OTHER() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_LOCALE_OTHER");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_LOCALE_OTHER(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_LOCALE_OTHER", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PRT_FNT_0() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PRT_FNT_0");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PRT_FNT_0(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PRT_FNT_0", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PRT_FNT_1() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PRT_FNT_1");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PRT_FNT_1(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PRT_FNT_1", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PRT_FNT_2() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PRT_FNT_2");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PRT_FNT_2(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PRT_FNT_2", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PRT_FNT_3() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PRT_FNT_3");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PRT_FNT_3(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PRT_FNT_3", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PRT_FNT_4() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PRT_FNT_4");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PRT_FNT_4(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PRT_FNT_4", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PRT_FNT_5() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PRT_FNT_5");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PRT_FNT_5(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PRT_FNT_5", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PRT_FNT_6() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PRT_FNT_6");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PRT_FNT_6(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PRT_FNT_6", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PRT_FNT_7() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PRT_FNT_7");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PRT_FNT_7(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PRT_FNT_7", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PRT_FNT_8() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PRT_FNT_8");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PRT_FNT_8(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PRT_FNT_8", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PRT_FNT_TRIUMVIRATE() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PRT_FNT_TRIUMVIRATE");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PRT_FNT_TRIUMVIRATE(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PRT_FNT_TRIUMVIRATE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PRT_FNT_TRIUMVIRATE_B() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PRT_FNT_TRIUMVIRATE_B");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PRT_FNT_TRIUMVIRATE_B(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PRT_FNT_TRIUMVIRATE_B", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PRT_FNT_KANJI() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PRT_FNT_KANJI");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PRT_FNT_KANJI(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PRT_FNT_KANJI", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PRT_FNT_KANJIT() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PRT_FNT_KANJIT");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PRT_FNT_KANJIT(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PRT_FNT_KANJIT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PRT_FNT_SIZE_4() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PRT_FNT_SIZE_4");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PRT_FNT_SIZE_4(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PRT_FNT_SIZE_4", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PRT_FNT_SIZE_5() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PRT_FNT_SIZE_5");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PRT_FNT_SIZE_5(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PRT_FNT_SIZE_5", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PRT_FNT_SIZE_6() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PRT_FNT_SIZE_6");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PRT_FNT_SIZE_6(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PRT_FNT_SIZE_6", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PRT_FNT_SIZE_8() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PRT_FNT_SIZE_8");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PRT_FNT_SIZE_8(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PRT_FNT_SIZE_8", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PRT_FNT_SIZE_10() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PRT_FNT_SIZE_10");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PRT_FNT_SIZE_10(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PRT_FNT_SIZE_10", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PRT_FNT_SIZE_12() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PRT_FNT_SIZE_12");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PRT_FNT_SIZE_12(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PRT_FNT_SIZE_12", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PRT_FNT_SIZE_14() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PRT_FNT_SIZE_14");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PRT_FNT_SIZE_14(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PRT_FNT_SIZE_14", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PRT_FNT_SIZE_18() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PRT_FNT_SIZE_18");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PRT_FNT_SIZE_18(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PRT_FNT_SIZE_18", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PRT_FNT_SIZE_24() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PRT_FNT_SIZE_24");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PRT_FNT_SIZE_24(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PRT_FNT_SIZE_24", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PRT_FNT_SIZE_30() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PRT_FNT_SIZE_30");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PRT_FNT_SIZE_30(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PRT_FNT_SIZE_30", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PRT_FNT_SIZE_36() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PRT_FNT_SIZE_36");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PRT_FNT_SIZE_36(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PRT_FNT_SIZE_36", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PRT_FNT_SIZE_48() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PRT_FNT_SIZE_48");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PRT_FNT_SIZE_48(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PRT_FNT_SIZE_48", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PRT_FNT_KANJI_SIZE_16() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PRT_FNT_KANJI_SIZE_16");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PRT_FNT_KANJI_SIZE_16(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PRT_FNT_KANJI_SIZE_16", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PRT_FNT_KANJI_SIZE_24() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PRT_FNT_KANJI_SIZE_24");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PRT_FNT_KANJI_SIZE_24(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PRT_FNT_KANJI_SIZE_24", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PRT_FNT_KANJI_SIZE_32() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PRT_FNT_KANJI_SIZE_32");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PRT_FNT_KANJI_SIZE_32(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PRT_FNT_KANJI_SIZE_32", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PRT_FNT_KANJI_SIZE_48() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PRT_FNT_KANJI_SIZE_48");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PRT_FNT_KANJI_SIZE_48(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PRT_FNT_KANJI_SIZE_48", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_DEFAULT() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_DEFAULT");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_DEFAULT(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_DEFAULT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_IBM037() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_IBM037");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_IBM037(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_IBM037", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_IBM437() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_IBM437");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_IBM437(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_IBM437", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_IBM500() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_IBM500");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_IBM500(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_IBM500", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_IBM737() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_IBM737");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_IBM737(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_IBM737", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_IBM775() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_IBM775");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_IBM775(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_IBM775", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_IBM850() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_IBM850");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_IBM850(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_IBM850", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_IBM852() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_IBM852");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_IBM852(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_IBM852", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_IBM855() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_IBM855");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_IBM855(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_IBM855", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_IBM857() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_IBM857");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_IBM857(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_IBM857", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_IBM860() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_IBM860");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_IBM860(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_IBM860", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_IBM861() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_IBM861");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_IBM861(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_IBM861", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_IBM863() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_IBM863");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_IBM863(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_IBM863", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_IBM865() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_IBM865");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_IBM865(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_IBM865", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_CP866() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_CP866");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_CP866(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_CP866", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_IBM869() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_IBM869");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_IBM869(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_IBM869", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_WINDOWS_874() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_WINDOWS_874");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_WINDOWS_874(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_WINDOWS_874", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_CP875() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_CP875");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_CP875(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_CP875", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_SHIFT_JIS() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_SHIFT_JIS");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_SHIFT_JIS(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_SHIFT_JIS", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_GB2312() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_GB2312");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_GB2312(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_GB2312", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_KS_C_5601_1987() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_KS_C_5601_1987");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_KS_C_5601_1987(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_KS_C_5601_1987", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_BIG5() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_BIG5");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_BIG5(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_BIG5", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_IBM1026() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_IBM1026");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_IBM1026(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_IBM1026", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_UTF_16() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_UTF_16");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_UTF_16(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_UTF_16", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_UNICODEFFFE() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_UNICODEFFFE");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_UNICODEFFFE(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_UNICODEFFFE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_WINDOWS_1250() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_WINDOWS_1250");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_WINDOWS_1250(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_WINDOWS_1250", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_WINDOWS_1251() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_WINDOWS_1251");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_WINDOWS_1251(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_WINDOWS_1251", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_WINDOWS_1252() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_WINDOWS_1252");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_WINDOWS_1252(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_WINDOWS_1252", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_WINDOWS_1253() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_WINDOWS_1253");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_WINDOWS_1253(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_WINDOWS_1253", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_WINDOWS_1254() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_WINDOWS_1254");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_WINDOWS_1254(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_WINDOWS_1254", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_WINDOWS_1255() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_WINDOWS_1255");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_WINDOWS_1255(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_WINDOWS_1255", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_WINDOWS_1256() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_WINDOWS_1256");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_WINDOWS_1256(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_WINDOWS_1256", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_WINDOWS_1257() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_WINDOWS_1257");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_WINDOWS_1257(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_WINDOWS_1257", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_WINDOWS_1258() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_WINDOWS_1258");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_WINDOWS_1258(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_WINDOWS_1258", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_JOHAB() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_JOHAB");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_JOHAB(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_JOHAB", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_MACINTOSH() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_MACINTOSH");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_MACINTOSH(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_MACINTOSH", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_X_MAC_JAPANESE() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_X_MAC_JAPANESE");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_X_MAC_JAPANESE(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_X_MAC_JAPANESE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_X_MAC_CHINESETRAD() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_X_MAC_CHINESETRAD");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_X_MAC_CHINESETRAD(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_X_MAC_CHINESETRAD", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_X_MAC_KOREAN() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_X_MAC_KOREAN");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_X_MAC_KOREAN(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_X_MAC_KOREAN", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_X_MAC_GREEK() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_X_MAC_GREEK");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_X_MAC_GREEK(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_X_MAC_GREEK", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_X_MAC_CYRILLIC() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_X_MAC_CYRILLIC");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_X_MAC_CYRILLIC(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_X_MAC_CYRILLIC", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_X_MAC_CHINESESIMP() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_X_MAC_CHINESESIMP");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_X_MAC_CHINESESIMP(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_X_MAC_CHINESESIMP", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_X_MAC_ROMANIAN() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_X_MAC_ROMANIAN");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_X_MAC_ROMANIAN(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_X_MAC_ROMANIAN", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_X_MAC_UKRAINIAN() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_X_MAC_UKRAINIAN");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_X_MAC_UKRAINIAN(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_X_MAC_UKRAINIAN", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_X_MAC_CE() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_X_MAC_CE");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_X_MAC_CE(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_X_MAC_CE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_X_MAC_ICELANDIC() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_X_MAC_ICELANDIC");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_X_MAC_ICELANDIC(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_X_MAC_ICELANDIC", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_X_MAC_TURKISH() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_X_MAC_TURKISH");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_X_MAC_TURKISH(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_X_MAC_TURKISH", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_X_MAC_CROATIAN() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_X_MAC_CROATIAN");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_X_MAC_CROATIAN(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_X_MAC_CROATIAN", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_X_CHINESE_CNS() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_X_CHINESE_CNS");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_X_CHINESE_CNS(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_X_CHINESE_CNS", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_US_ASCII() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_US_ASCII");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_US_ASCII(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_US_ASCII", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_X_CP20261() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_X_CP20261");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_X_CP20261(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_X_CP20261", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_IBM290() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_IBM290");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_IBM290(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_IBM290", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_KOI8_R() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_KOI8_R");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_KOI8_R(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_KOI8_R", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_EUC_JP_JIS() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_EUC_JP_JIS");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_EUC_JP_JIS(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_EUC_JP_JIS", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_X_CP20936() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_X_CP20936");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_X_CP20936(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_X_CP20936", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_X_CP20949() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_X_CP20949");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_X_CP20949(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_X_CP20949", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_X_CP21027() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_X_CP21027");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_X_CP21027(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_X_CP21027", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_KOI8_U() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_KOI8_U");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_KOI8_U(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_KOI8_U", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_ISO_8859_1() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_ISO_8859_1");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_ISO_8859_1(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_ISO_8859_1", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_ISO_8859_2() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_ISO_8859_2");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_ISO_8859_2(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_ISO_8859_2", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_ISO_8859_4() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_ISO_8859_4");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_ISO_8859_4(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_ISO_8859_4", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_ISO_8859_5() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_ISO_8859_5");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_ISO_8859_5(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_ISO_8859_5", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_ISO_8859_7() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_ISO_8859_7");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_ISO_8859_7(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_ISO_8859_7", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_ISO_8859_9() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_ISO_8859_9");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_ISO_8859_9(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_ISO_8859_9", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_ISO_8859_13() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_ISO_8859_13");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_ISO_8859_13(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_ISO_8859_13", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_ISO_8859_15() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_ISO_8859_15");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_ISO_8859_15(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_ISO_8859_15", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_ISO_2022_JP() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_ISO_2022_JP");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_ISO_2022_JP(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_ISO_2022_JP", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_CSISO2022JP() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_CSISO2022JP");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_CSISO2022JP(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_CSISO2022JP", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_ISO_2022_JP_S() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_ISO_2022_JP_S");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_ISO_2022_JP_S(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_ISO_2022_JP_S", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_ISO_2022_KR() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_ISO_2022_KR");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_ISO_2022_KR(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_ISO_2022_KR", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_X_CP50227() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_X_CP50227");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_X_CP50227(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_X_CP50227", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_EUC_JP() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_EUC_JP");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_EUC_JP(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_EUC_JP", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_EUC_CN() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_EUC_CN");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_EUC_CN(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_EUC_CN", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_EUC_KR() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_EUC_KR");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_EUC_KR(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_EUC_KR", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_HZ_GB_2312() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_HZ_GB_2312");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_HZ_GB_2312(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_HZ_GB_2312", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_GB18030() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_GB18030");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_GB18030(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_GB18030", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_UTF_7() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_UTF_7");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_UTF_7(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_UTF_7", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_ENC_CDPG_UTF_8() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_ENC_CDPG_UTF_8");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_ENC_CDPG_UTF_8(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_ENC_CDPG_UTF_8", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PRT_RES_203() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PRT_RES_203");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PRT_RES_203(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PRT_RES_203", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PRT_RES_300() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PRT_RES_300");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PRT_RES_300(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PRT_RES_300", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_FNT_DEFAULT() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_FNT_DEFAULT");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_FNT_DEFAULT(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_FNT_DEFAULT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_FNT_BOLD() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_FNT_BOLD");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_FNT_BOLD(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_FNT_BOLD", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_FNT_REVERSE() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_FNT_REVERSE");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_FNT_REVERSE(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_FNT_REVERSE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_FNT_UNDERLINE() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_FNT_UNDERLINE");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_FNT_UNDERLINE(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_FNT_UNDERLINE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_FNT_ITALIC() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_FNT_ITALIC");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_FNT_ITALIC(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_FNT_ITALIC", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_FNT_STRIKEOUT() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_FNT_STRIKEOUT");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_FNT_STRIKEOUT(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_FNT_STRIKEOUT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_RT_NORMAL() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_RT_NORMAL");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_RT_NORMAL(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_RT_NORMAL", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_RT_RIGHT90() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_RT_RIGHT90");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_RT_RIGHT90(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_RT_RIGHT90", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_RT_ROTATE180() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_RT_ROTATE180");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_RT_ROTATE180(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_RT_ROTATE180", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_RT_LEFT90() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_RT_LEFT90");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_RT_LEFT90(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_RT_LEFT90", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_BM_ASIS() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_BM_ASIS");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_BM_ASIS(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_BM_ASIS", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_BCS_CODE39() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_BCS_CODE39");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_BCS_CODE39(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_BCS_CODE39", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_BCS_UPCA() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_BCS_UPCA");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_BCS_UPCA(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_BCS_UPCA", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_BCS_UPCE() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_BCS_UPCE");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_BCS_UPCE(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_BCS_UPCE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_BCS_INTERLEAVED25() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_BCS_INTERLEAVED25");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_BCS_INTERLEAVED25(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_BCS_INTERLEAVED25", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_BCS_CODE128() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_BCS_CODE128");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_BCS_CODE128(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_BCS_CODE128", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_BCS_EAN13() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_BCS_EAN13");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_BCS_EAN13(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_BCS_EAN13", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_BCS_EAN8() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_BCS_EAN8");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_BCS_EAN8(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_BCS_EAN8", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_BCS_HIBC() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_BCS_HIBC");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_BCS_HIBC(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_BCS_HIBC", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_BCS_CODABAR() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_BCS_CODABAR");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_BCS_CODABAR(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_BCS_CODABAR", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_BCS_INT25() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_BCS_INT25");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_BCS_INT25(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_BCS_INT25", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_BCS_PLESSEY() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_BCS_PLESSEY");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_BCS_PLESSEY(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_BCS_PLESSEY", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_BCS_CASECODE() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_BCS_CASECODE");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_BCS_CASECODE(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_BCS_CASECODE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_BCS_UPC2DIG() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_BCS_UPC2DIG");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_BCS_UPC2DIG(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_BCS_UPC2DIG", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_BCS_UPC5DIG() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_BCS_UPC5DIG");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_BCS_UPC5DIG(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_BCS_UPC5DIG", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_BCS_CODE93() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_BCS_CODE93");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_BCS_CODE93(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_BCS_CODE93", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_BCS_ITF14() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_BCS_ITF14");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_BCS_ITF14(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_BCS_ITF14", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_BCS_ZIP() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_BCS_ZIP");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_BCS_ZIP(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_BCS_ZIP", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_BCS_ITF16() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_BCS_ITF16");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_BCS_ITF16(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_BCS_ITF16", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_BCS_UCCEAN128() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_BCS_UCCEAN128");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_BCS_UCCEAN128(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_BCS_UCCEAN128", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_BCS_INDUSTRIAL25() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_BCS_INDUSTRIAL25");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_BCS_INDUSTRIAL25(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_BCS_INDUSTRIAL25", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_BCS_UCCEAN128KMART() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_BCS_UCCEAN128KMART");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_BCS_UCCEAN128KMART(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_BCS_UCCEAN128KMART", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_BCS_COOP25() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_BCS_COOP25");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_BCS_COOP25(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_BCS_COOP25", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_BCS_UCCEAN128RANDOMWEIGHT() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_BCS_UCCEAN128RANDOMWEIGHT");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_BCS_UCCEAN128RANDOMWEIGHT(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_BCS_UCCEAN128RANDOMWEIGHT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_BCS_TELEPEN() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_BCS_TELEPEN");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_BCS_TELEPEN(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_BCS_TELEPEN", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_BCS_TEXT_HIDE() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_BCS_TEXT_HIDE");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_BCS_TEXT_HIDE(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_BCS_TEXT_HIDE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_BCS_TEXT_SHOW() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_BCS_TEXT_SHOW");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_BCS_TEXT_SHOW(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_BCS_TEXT_SHOW", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_DATAMATRIX_EC_LEVEL_200() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_DATAMATRIX_EC_LEVEL_200");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_DATAMATRIX_EC_LEVEL_200(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_DATAMATRIX_EC_LEVEL_200", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PDF417_EC_LEVEL_0() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PDF417_EC_LEVEL_0");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PDF417_EC_LEVEL_0(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PDF417_EC_LEVEL_0", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PDF417_EC_LEVEL_1() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PDF417_EC_LEVEL_1");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PDF417_EC_LEVEL_1(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PDF417_EC_LEVEL_1", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PDF417_EC_LEVEL_2() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PDF417_EC_LEVEL_2");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PDF417_EC_LEVEL_2(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PDF417_EC_LEVEL_2", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PDF417_EC_LEVEL_3() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PDF417_EC_LEVEL_3");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PDF417_EC_LEVEL_3(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PDF417_EC_LEVEL_3", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PDF417_EC_LEVEL_4() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PDF417_EC_LEVEL_4");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PDF417_EC_LEVEL_4(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PDF417_EC_LEVEL_4", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PDF417_EC_LEVEL_5() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PDF417_EC_LEVEL_5");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PDF417_EC_LEVEL_5(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PDF417_EC_LEVEL_5", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PDF417_EC_LEVEL_6() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PDF417_EC_LEVEL_6");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PDF417_EC_LEVEL_6(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PDF417_EC_LEVEL_6", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PDF417_EC_LEVEL_7() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PDF417_EC_LEVEL_7");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PDF417_EC_LEVEL_7(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PDF417_EC_LEVEL_7", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PDF417_EC_LEVEL_8() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PDF417_EC_LEVEL_8");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PDF417_EC_LEVEL_8(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PDF417_EC_LEVEL_8", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_QRCODE_EC_LEVEL_L() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_QRCODE_EC_LEVEL_L");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_QRCODE_EC_LEVEL_L(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_QRCODE_EC_LEVEL_L", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_QRCODE_EC_LEVEL_M() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_QRCODE_EC_LEVEL_M");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_QRCODE_EC_LEVEL_M(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_QRCODE_EC_LEVEL_M", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_QRCODE_EC_LEVEL_Q() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_QRCODE_EC_LEVEL_Q");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_QRCODE_EC_LEVEL_Q(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_QRCODE_EC_LEVEL_Q", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_QRCODE_EC_LEVEL_H() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_QRCODE_EC_LEVEL_H");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_QRCODE_EC_LEVEL_H(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_QRCODE_EC_LEVEL_H", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_AXTEC_EC_LEVEL_000() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_AXTEC_EC_LEVEL_000");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_AXTEC_EC_LEVEL_000(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_AXTEC_EC_LEVEL_000", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_GS1_DATABAR_OMNI_DIRECTIONAL() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_GS1_DATABAR_OMNI_DIRECTIONAL");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_GS1_DATABAR_OMNI_DIRECTIONAL(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_GS1_DATABAR_OMNI_DIRECTIONAL", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_GS1_DATABAR_COMPOSITE() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_GS1_DATABAR_COMPOSITE");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_GS1_DATABAR_COMPOSITE(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_GS1_DATABAR_COMPOSITE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_GS1_DATABAR_TRUNCATION() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_GS1_DATABAR_TRUNCATION");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_GS1_DATABAR_TRUNCATION(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_GS1_DATABAR_TRUNCATION", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_GS1_DATABAR_STACKED() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_GS1_DATABAR_STACKED");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_GS1_DATABAR_STACKED(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_GS1_DATABAR_STACKED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_GS1_DATABAR_STACKED_OMNI_DIRECTIONAL() {
    try {
      java.lang.Integer res =
          Javonet.getType("LabelConst").get("CLS_GS1_DATABAR_STACKED_OMNI_DIRECTIONAL");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_GS1_DATABAR_STACKED_OMNI_DIRECTIONAL(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_GS1_DATABAR_STACKED_OMNI_DIRECTIONAL", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_GS1_DATABAR_LIMITED() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_GS1_DATABAR_LIMITED");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_GS1_DATABAR_LIMITED(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_GS1_DATABAR_LIMITED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_GS1_DATABAR_EXPANDED() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_GS1_DATABAR_EXPANDED");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_GS1_DATABAR_EXPANDED(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_GS1_DATABAR_EXPANDED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SHADED_PTN_0() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SHADED_PTN_0");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SHADED_PTN_0(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SHADED_PTN_0", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SHADED_PTN_1() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SHADED_PTN_1");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SHADED_PTN_1(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SHADED_PTN_1", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SHADED_PTN_2() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SHADED_PTN_2");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SHADED_PTN_2(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SHADED_PTN_2", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SHADED_PTN_3() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SHADED_PTN_3");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SHADED_PTN_3(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SHADED_PTN_3", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SHADED_PTN_4() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SHADED_PTN_4");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SHADED_PTN_4(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SHADED_PTN_4", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SHADED_PTN_5() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SHADED_PTN_5");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SHADED_PTN_5(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SHADED_PTN_5", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SHADED_PTN_6() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SHADED_PTN_6");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SHADED_PTN_6(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SHADED_PTN_6", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SHADED_PTN_7() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SHADED_PTN_7");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SHADED_PTN_7(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SHADED_PTN_7", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SHADED_PTN_8() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SHADED_PTN_8");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SHADED_PTN_8(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SHADED_PTN_8", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SHADED_PTN_9() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SHADED_PTN_9");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SHADED_PTN_9(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SHADED_PTN_9", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SHADED_PTN_10() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SHADED_PTN_10");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SHADED_PTN_10(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SHADED_PTN_10", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SHADED_PTN_11() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SHADED_PTN_11");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SHADED_PTN_11(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SHADED_PTN_11", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_UNIT_MILLI() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_UNIT_MILLI");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_UNIT_MILLI(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_UNIT_MILLI", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_UNIT_INCH() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_UNIT_INCH");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_UNIT_INCH(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_UNIT_INCH", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SPEEDSETTING_1() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SPEEDSETTING_1");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SPEEDSETTING_1(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SPEEDSETTING_1", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SPEEDSETTING_2() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SPEEDSETTING_2");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SPEEDSETTING_2(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SPEEDSETTING_2", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SPEEDSETTING_3() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SPEEDSETTING_3");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SPEEDSETTING_3(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SPEEDSETTING_3", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SPEEDSETTING_4() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SPEEDSETTING_4");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SPEEDSETTING_4(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SPEEDSETTING_4", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SPEEDSETTING_5() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SPEEDSETTING_5");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SPEEDSETTING_5(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SPEEDSETTING_5", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SPEEDSETTING_6() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SPEEDSETTING_6");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SPEEDSETTING_6(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SPEEDSETTING_6", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SPEEDSETTING_7() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SPEEDSETTING_7");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SPEEDSETTING_7(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SPEEDSETTING_7", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SPEEDSETTING_8() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SPEEDSETTING_8");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SPEEDSETTING_8(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SPEEDSETTING_8", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SPEEDSETTING_9() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SPEEDSETTING_9");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SPEEDSETTING_9(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SPEEDSETTING_9", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SPEEDSETTING_A() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SPEEDSETTING_A");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SPEEDSETTING_A(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SPEEDSETTING_A", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SPEEDSETTING_B() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SPEEDSETTING_B");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SPEEDSETTING_B(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SPEEDSETTING_B", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SPEEDSETTING_C() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SPEEDSETTING_C");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SPEEDSETTING_C(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SPEEDSETTING_C", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SPEEDSETTING_D() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SPEEDSETTING_D");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SPEEDSETTING_D(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SPEEDSETTING_D", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SPEEDSETTING_E() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SPEEDSETTING_E");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SPEEDSETTING_E(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SPEEDSETTING_E", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SPEEDSETTING_F() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SPEEDSETTING_F");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SPEEDSETTING_F(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SPEEDSETTING_F", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SPEEDSETTING_G() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SPEEDSETTING_G");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SPEEDSETTING_G(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SPEEDSETTING_G", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SPEEDSETTING_H() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SPEEDSETTING_H");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SPEEDSETTING_H(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SPEEDSETTING_H", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SPEEDSETTING_I() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SPEEDSETTING_I");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SPEEDSETTING_I(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SPEEDSETTING_I", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SPEEDSETTING_J() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SPEEDSETTING_J");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SPEEDSETTING_J(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SPEEDSETTING_J", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SPEEDSETTING_K() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SPEEDSETTING_K");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SPEEDSETTING_K(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SPEEDSETTING_K", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SPEEDSETTING_L() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SPEEDSETTING_L");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SPEEDSETTING_L(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SPEEDSETTING_L", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SPEEDSETTING_M() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SPEEDSETTING_M");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SPEEDSETTING_M(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SPEEDSETTING_M", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SPEEDSETTING_N() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SPEEDSETTING_N");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SPEEDSETTING_N(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SPEEDSETTING_N", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SPEEDSETTING_O() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SPEEDSETTING_O");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SPEEDSETTING_O(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SPEEDSETTING_O", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SPEEDSETTING_P() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SPEEDSETTING_P");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SPEEDSETTING_P(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SPEEDSETTING_P", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SPEEDSETTING_Q() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SPEEDSETTING_Q");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SPEEDSETTING_Q(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SPEEDSETTING_Q", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SPEEDSETTING_R() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SPEEDSETTING_R");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SPEEDSETTING_R(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SPEEDSETTING_R", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SPEEDSETTING_S() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SPEEDSETTING_S");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SPEEDSETTING_S(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SPEEDSETTING_S", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SPEEDSETTING_T() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SPEEDSETTING_T");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SPEEDSETTING_T(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SPEEDSETTING_T", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SPEEDSETTING_U() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SPEEDSETTING_U");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SPEEDSETTING_U(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SPEEDSETTING_U", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SPEEDSETTING_V() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SPEEDSETTING_V");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SPEEDSETTING_V(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SPEEDSETTING_V", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SPEEDSETTING_W() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SPEEDSETTING_W");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SPEEDSETTING_W(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SPEEDSETTING_W", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SPEEDSETTING_X() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SPEEDSETTING_X");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SPEEDSETTING_X(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SPEEDSETTING_X", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_MEDIAHANDLING_NONE() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_MEDIAHANDLING_NONE");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_MEDIAHANDLING_NONE(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_MEDIAHANDLING_NONE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_MEDIAHANDLING_TEAROFF() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_MEDIAHANDLING_TEAROFF");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_MEDIAHANDLING_TEAROFF(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_MEDIAHANDLING_TEAROFF", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_MEDIAHANDLING_DISPENSES() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_MEDIAHANDLING_DISPENSES");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_MEDIAHANDLING_DISPENSES(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_MEDIAHANDLING_DISPENSES", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_MEDIAHANDLING_PAUSE() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_MEDIAHANDLING_PAUSE");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_MEDIAHANDLING_PAUSE(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_MEDIAHANDLING_PAUSE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_MEDIAHANDLING_CUT() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_MEDIAHANDLING_CUT");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_MEDIAHANDLING_CUT(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_MEDIAHANDLING_CUT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_MEDIAHANDLING_CUTANDPAUSE() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_MEDIAHANDLING_CUTANDPAUSE");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_MEDIAHANDLING_CUTANDPAUSE(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_MEDIAHANDLING_CUTANDPAUSE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_MEDIAHANDLING_PEELOFF() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_MEDIAHANDLING_PEELOFF");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_MEDIAHANDLING_PEELOFF(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_MEDIAHANDLING_PEELOFF", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_MEDIAHANDLING_REWIND() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_MEDIAHANDLING_REWIND");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_MEDIAHANDLING_REWIND(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_MEDIAHANDLING_REWIND", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SELSENSOR_NONE() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SELSENSOR_NONE");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SELSENSOR_NONE(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SELSENSOR_NONE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SELSENSOR_SEETHROUGH() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SELSENSOR_SEETHROUGH");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SELSENSOR_SEETHROUGH(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SELSENSOR_SEETHROUGH", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SELSENSOR_REFLECT() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SELSENSOR_REFLECT");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SELSENSOR_REFLECT(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SELSENSOR_REFLECT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PRTMETHOD_TT() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PRTMETHOD_TT");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PRTMETHOD_TT(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PRTMETHOD_TT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_PRTMETHOD_DT() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_PRTMETHOD_DT");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_PRTMETHOD_DT(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_PRTMETHOD_DT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SENS_LOCATION_FRONT() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SENS_LOCATION_FRONT");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SENS_LOCATION_FRONT(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SENS_LOCATION_FRONT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getCLS_SENS_LOCATION_ADJUSTABLE() {
    try {
      java.lang.Integer res = Javonet.getType("LabelConst").get("CLS_SENS_LOCATION_ADJUSTABLE");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setCLS_SENS_LOCATION_ADJUSTABLE(java.lang.Integer param) {
    try {
      Javonet.getType("LabelConst").set("CLS_SENS_LOCATION_ADJUSTABLE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LabelConst() {
    try {
      javonetHandle = Javonet.New("com.citizen.sdk.LabelPrint.LabelConst");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LabelConst(NObject handle) {
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
