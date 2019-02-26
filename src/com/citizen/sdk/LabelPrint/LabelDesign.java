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

public class LabelDesign implements ILabelDesign {
  protected NObject javonetHandle;

  public LabelDesign() {
    try {
      javonetHandle = Javonet.New("com.citizen.sdk.LabelPrint.LabelDesign");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LabelDesign(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Integer DrawTextPtrFont(
      java.lang.String data,
      java.lang.Integer locale,
      java.lang.Integer font,
      java.lang.Integer rotation,
      java.lang.Integer hexp,
      java.lang.Integer vexp,
      java.lang.Integer size,
      java.lang.Integer x,
      java.lang.Integer y) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelDesign")
              .invoke("DrawTextPtrFont", data, locale, font, rotation, hexp, vexp, size, x, y);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer DrawTextDLFont(
      java.lang.String data,
      java.lang.Integer encoding,
      java.lang.String fontID,
      java.lang.Integer rotation,
      java.lang.Integer hexp,
      java.lang.Integer vexp,
      java.lang.Integer point,
      java.lang.Integer x,
      java.lang.Integer y) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelDesign")
              .invoke("DrawTextDLFont", data, encoding, fontID, rotation, hexp, vexp, point, x, y);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer DrawTextPCFont(
      java.lang.String data,
      java.lang.String fontName,
      java.lang.Integer rotation,
      java.lang.Integer hRatio,
      java.lang.Integer vRatio,
      java.lang.Integer point,
      java.lang.Integer style,
      java.lang.Integer x,
      java.lang.Integer y) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelDesign")
              .invoke(
                  "DrawTextPCFont", data, fontName, rotation, hRatio, vRatio, point, style, x, y);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer DrawTextPCFont(
      java.lang.String data,
      java.lang.String fontName,
      java.lang.Integer rotation,
      java.lang.Integer hRatio,
      java.lang.Integer vRatio,
      java.lang.Integer point,
      java.lang.Integer style,
      java.lang.Integer x,
      java.lang.Integer y,
      java.lang.Integer resolution) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelDesign")
              .invoke(
                  "DrawTextPCFont",
                  data,
                  fontName,
                  rotation,
                  hRatio,
                  vRatio,
                  point,
                  style,
                  x,
                  y,
                  resolution);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer DrawTextPCFont(
      java.lang.String data,
      java.lang.String fontName,
      java.lang.Integer rotation,
      java.lang.Integer hRatio,
      java.lang.Integer vRatio,
      java.lang.Integer point,
      java.lang.Integer style,
      java.lang.Integer x,
      java.lang.Integer y,
      java.lang.Integer resolution,
      java.lang.Integer measurementUnit) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelDesign")
              .invoke(
                  "DrawTextPCFont",
                  data,
                  fontName,
                  rotation,
                  hRatio,
                  vRatio,
                  point,
                  style,
                  x,
                  y,
                  resolution,
                  measurementUnit);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer DrawBarCode(
      java.lang.String data,
      java.lang.Integer symbology,
      java.lang.Integer rotation,
      java.lang.Integer thick,
      java.lang.Integer narrow,
      java.lang.Integer height,
      java.lang.Integer x,
      java.lang.Integer y,
      java.lang.Integer showText) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelDesign")
              .invoke(
                  "DrawBarCode", data, symbology, rotation, thick, narrow, height, x, y, showText);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer DrawMaxiCode(
      java.lang.String[] data,
      java.lang.Integer rotation,
      java.lang.Integer x,
      java.lang.Integer y) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelDesign")
              .invoke("DrawMaxiCode", new Object[] {data}, rotation, x, y);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer DrawPDF417(
      java.lang.String data,
      java.lang.Integer encoding,
      java.lang.Integer rotation,
      java.lang.Integer exp,
      java.lang.Integer ECLevel,
      java.lang.Integer x,
      java.lang.Integer y) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelDesign")
              .invoke("DrawPDF417", data, encoding, rotation, exp, ECLevel, x, y);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer DrawDataMatrix(
      java.lang.String data,
      java.lang.Integer encoding,
      java.lang.Integer rotation,
      java.lang.Integer exp,
      java.lang.Integer ECLevel,
      java.lang.Integer x,
      java.lang.Integer y) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelDesign")
              .invoke("DrawDataMatrix", data, encoding, rotation, exp, ECLevel, x, y);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer DrawQRCode(
      java.lang.String data,
      java.lang.Integer encoding,
      java.lang.Integer rotation,
      java.lang.Integer exp,
      java.lang.Integer ECLevel,
      java.lang.Integer x,
      java.lang.Integer y) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelDesign")
              .invoke("DrawQRCode", data, encoding, rotation, exp, ECLevel, x, y);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer DrawAztec(
      java.lang.String data,
      java.lang.Integer encoding,
      java.lang.Integer rotation,
      java.lang.Integer exp,
      java.lang.Integer ECLevel,
      java.lang.Integer x,
      java.lang.Integer y) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelDesign")
              .invoke("DrawAztec", data, encoding, rotation, exp, ECLevel, x, y);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer DrawGS1DataBar(
      java.lang.String[] data,
      java.lang.Integer type,
      java.lang.Integer rotation,
      java.lang.Integer exp,
      java.lang.Integer x,
      java.lang.Integer y) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelDesign")
              .invoke("DrawGS1DataBar", new Object[] {data}, type, rotation, exp, x, y);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer DrawNVBitmap(
      java.lang.String name,
      java.lang.Integer hexp,
      java.lang.Integer vexp,
      java.lang.Integer x,
      java.lang.Integer y) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelDesign")
              .invoke("DrawNVBitmap", name, hexp, vexp, x, y);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer DrawBitmap(
      java.lang.String filePath,
      java.lang.Integer rotation,
      java.lang.Integer width,
      java.lang.Integer height,
      java.lang.Integer x,
      java.lang.Integer y) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelDesign")
              .invoke("DrawBitmap", filePath, rotation, width, height, x, y);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer DrawBitmap(
      java.lang.String filePath,
      java.lang.Integer rotation,
      java.lang.Integer width,
      java.lang.Integer height,
      java.lang.Integer x,
      java.lang.Integer y,
      java.lang.Integer resolution,
      java.lang.Integer measurementUnit) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelDesign")
              .invoke(
                  "DrawBitmap",
                  filePath,
                  rotation,
                  width,
                  height,
                  x,
                  y,
                  resolution,
                  measurementUnit);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer DrawLine(
      java.lang.Integer x1,
      java.lang.Integer y1,
      java.lang.Integer x2,
      java.lang.Integer y2,
      java.lang.Integer thickness) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelDesign")
              .invoke("DrawLine", x1, y1, x2, y2, thickness);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer DrawRect(
      java.lang.Integer x,
      java.lang.Integer y,
      java.lang.Integer width,
      java.lang.Integer height,
      java.lang.Integer thickness) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelDesign")
              .invoke("DrawRect", x, y, width, height, thickness);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer FillRect(
      java.lang.Integer x,
      java.lang.Integer y,
      java.lang.Integer width,
      java.lang.Integer height,
      java.lang.Integer pattern) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelDesign")
              .invoke("FillRect", x, y, width, height, pattern);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer DrawCircle(
      java.lang.Integer x, java.lang.Integer y, java.lang.Integer radius) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelDesign")
              .invoke("DrawCircle", x, y, radius);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer FillCircle(
      java.lang.Integer x,
      java.lang.Integer y,
      java.lang.Integer radius,
      java.lang.Integer pattern) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelDesign")
              .invoke("FillCircle", x, y, radius, pattern);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer DrawPolygon(java.lang.Integer[] x, java.lang.Integer[] y) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelDesign")
              .invoke("DrawPolygon", new Object[] {x}, new Object[] {y});
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer FillPolygon(
      java.lang.Integer[] x, java.lang.Integer[] y, java.lang.Integer pattern) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("com.citizen.sdk.LabelPrint.ILabelDesign")
              .invoke("FillPolygon", new Object[] {x}, new Object[] {y}, pattern);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer EmbedRawDesignCommand(java.lang.Byte[] data) {
    try {
      java.lang.Integer res = javonetHandle.invoke("EmbedRawDesignCommand", new Object[] {data});
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
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
