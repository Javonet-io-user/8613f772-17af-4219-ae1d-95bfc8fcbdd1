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

public interface ILabelDesign {
  public java.lang.Integer DrawTextPtrFont(
      java.lang.String data,
      java.lang.Integer locale,
      java.lang.Integer font,
      java.lang.Integer rotation,
      java.lang.Integer hexp,
      java.lang.Integer vexp,
      java.lang.Integer size,
      java.lang.Integer x,
      java.lang.Integer y);

  public java.lang.Integer DrawTextDLFont(
      java.lang.String data,
      java.lang.Integer encoding,
      java.lang.String fontID,
      java.lang.Integer rotation,
      java.lang.Integer hexp,
      java.lang.Integer vexp,
      java.lang.Integer point,
      java.lang.Integer x,
      java.lang.Integer y);

  public java.lang.Integer DrawTextPCFont(
      java.lang.String data,
      java.lang.String fontName,
      java.lang.Integer rotation,
      java.lang.Integer hRatio,
      java.lang.Integer vRatio,
      java.lang.Integer point,
      java.lang.Integer style,
      java.lang.Integer x,
      java.lang.Integer y);

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
      java.lang.Integer resolution);

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
      java.lang.Integer measurementUnit);

  public java.lang.Integer DrawBarCode(
      java.lang.String data,
      java.lang.Integer symbology,
      java.lang.Integer rotation,
      java.lang.Integer thick,
      java.lang.Integer narrow,
      java.lang.Integer height,
      java.lang.Integer x,
      java.lang.Integer y,
      java.lang.Integer showText);

  public java.lang.Integer DrawMaxiCode(
      java.lang.String[] data,
      java.lang.Integer rotation,
      java.lang.Integer x,
      java.lang.Integer y);

  public java.lang.Integer DrawPDF417(
      java.lang.String data,
      java.lang.Integer encoding,
      java.lang.Integer rotation,
      java.lang.Integer exp,
      java.lang.Integer ECLevel,
      java.lang.Integer x,
      java.lang.Integer y);

  public java.lang.Integer DrawDataMatrix(
      java.lang.String data,
      java.lang.Integer encoding,
      java.lang.Integer rotation,
      java.lang.Integer exp,
      java.lang.Integer ECLevel,
      java.lang.Integer x,
      java.lang.Integer y);

  public java.lang.Integer DrawQRCode(
      java.lang.String data,
      java.lang.Integer encoding,
      java.lang.Integer rotation,
      java.lang.Integer exp,
      java.lang.Integer ECLevel,
      java.lang.Integer x,
      java.lang.Integer y);

  public java.lang.Integer DrawAztec(
      java.lang.String data,
      java.lang.Integer encoding,
      java.lang.Integer rotation,
      java.lang.Integer exp,
      java.lang.Integer ECLevel,
      java.lang.Integer x,
      java.lang.Integer y);

  public java.lang.Integer DrawGS1DataBar(
      java.lang.String[] data,
      java.lang.Integer type,
      java.lang.Integer rotation,
      java.lang.Integer exp,
      java.lang.Integer x,
      java.lang.Integer y);

  public java.lang.Integer DrawNVBitmap(
      java.lang.String name,
      java.lang.Integer hexp,
      java.lang.Integer vexp,
      java.lang.Integer x,
      java.lang.Integer y);

  public java.lang.Integer DrawBitmap(
      java.lang.String filePath,
      java.lang.Integer rotation,
      java.lang.Integer width,
      java.lang.Integer height,
      java.lang.Integer x,
      java.lang.Integer y);

  public java.lang.Integer DrawBitmap(
      java.lang.String filePath,
      java.lang.Integer rotation,
      java.lang.Integer width,
      java.lang.Integer height,
      java.lang.Integer x,
      java.lang.Integer y,
      java.lang.Integer resolution,
      java.lang.Integer measurementUnit);

  public java.lang.Integer DrawLine(
      java.lang.Integer x1,
      java.lang.Integer y1,
      java.lang.Integer x2,
      java.lang.Integer y2,
      java.lang.Integer thickness);

  public java.lang.Integer DrawRect(
      java.lang.Integer x,
      java.lang.Integer y,
      java.lang.Integer width,
      java.lang.Integer height,
      java.lang.Integer tickness);

  public java.lang.Integer FillRect(
      java.lang.Integer x,
      java.lang.Integer y,
      java.lang.Integer width,
      java.lang.Integer height,
      java.lang.Integer pattern);

  public java.lang.Integer DrawCircle(
      java.lang.Integer x, java.lang.Integer y, java.lang.Integer radius);

  public java.lang.Integer FillCircle(
      java.lang.Integer x,
      java.lang.Integer y,
      java.lang.Integer radius,
      java.lang.Integer pattern);

  public java.lang.Integer DrawPolygon(java.lang.Integer[] x, java.lang.Integer[] y);

  public java.lang.Integer FillPolygon(
      java.lang.Integer[] x, java.lang.Integer[] y, java.lang.Integer pattern);
}
