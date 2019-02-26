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

public interface ILabelPrinter {
  public void Dispose();

  public java.lang.Integer GetVersionCode();

  public java.lang.String GetVersionName();

  public java.lang.Integer Connect(java.lang.Integer connectType, java.lang.String addr);

  public java.lang.Integer Connect(
      java.lang.Integer connectType, java.lang.String addr, java.lang.Integer port);

  public java.lang.Integer Connect(
      java.lang.Integer connectType,
      java.lang.String addr,
      java.lang.Integer port,
      java.lang.Integer timeout);

  public java.lang.Integer Disconnect();

  public java.lang.Integer SetCommProperties(
      java.lang.Integer baudRate, java.lang.Integer parity, java.lang.Integer handShake);

  public java.lang.Integer PrinterCheck();

  public java.lang.Integer SendData(java.lang.Byte[] data);

  public java.lang.Integer Print(LabelDesign design, java.lang.Integer quantity);

  public java.lang.Integer StoreNVBitmap(
      java.lang.String filePath,
      java.lang.String name,
      java.lang.Integer rotation,
      java.lang.Integer width,
      java.lang.Integer height);

  public java.lang.Integer ClearOutput();

  public java.lang.Integer GetErrorExtended(AtomicReference<java.lang.String> msg);

  public java.lang.String[] SearchLabelPrinter(
      java.lang.Integer ifType,
      java.lang.Integer searchTime,
      AtomicReference<java.lang.Integer> result,
      Class<?> returnArrayType);

  public CitizenPrinterInfo[] SearchCitizenPrinter(
      java.lang.Integer ifType,
      java.lang.Integer searchTime,
      AtomicReference<java.lang.Integer> result,
      Class<?> returnArrayType);

  public java.lang.Integer Preview(
      LabelDesign design,
      java.lang.Integer resolution,
      java.lang.Integer measurementUnit,
      java.lang.Integer paperWidth,
      java.lang.Integer paperHeight);

  public java.lang.Integer SetHorizontalMagnification(java.lang.Integer horizontalMagnification);

  public java.lang.Integer GetHorizontalMagnification();

  public java.lang.Integer SetVerticalMagnification(java.lang.Integer verticalMagnification);

  public java.lang.Integer GetVerticalMagnification();

  public java.lang.Integer SetFormatAttribute(java.lang.Integer formatAttribute);

  public java.lang.Integer GetFormatAttribute();

  public java.lang.Integer SetContinuousMediaLength(java.lang.Integer continuousMediaLength);

  public java.lang.Integer GetContinuousMediaLength();

  public java.lang.Integer SetMeasurementUnit(java.lang.Integer measurementUnit);

  public java.lang.Integer GetMeasurementUnit();

  public java.lang.Integer SetPrintSpeed(java.lang.Integer printSpeed);

  public java.lang.Integer GetPrintSpeed();

  public java.lang.Integer SetFeedSpeed(java.lang.Integer feedSpeed);

  public java.lang.Integer GetFeedSpeed();

  public java.lang.Integer SetSlewSpeed(java.lang.Integer slewSpeed);

  public java.lang.Integer GetSlewSpeed();

  public java.lang.Integer SetBackupSpeed(java.lang.Integer backupSpeed);

  public java.lang.Integer GetBackupSpeed();

  public java.lang.Integer SetPrintDarkness(java.lang.Integer printDarkness);

  public java.lang.Integer GetPrintDarkness();

  public java.lang.Integer SetDoubleHeat(java.lang.Integer doubleHeat);

  public java.lang.Integer GetDoubleHeat();

  public java.lang.Integer SetVerticalOffset(java.lang.Integer verticalOffset);

  public java.lang.Integer GetVerticalOffset();

  public java.lang.Integer SetHorizontalOffset(java.lang.Integer horizontalOffset);

  public java.lang.Integer GetHorizontalOffset();

  public java.lang.Integer SetMediaHandling(java.lang.Integer mediaHandling);

  public java.lang.Integer GetMediaHandling();

  public java.lang.Integer SetStartOffset(java.lang.Integer startOffset);

  public java.lang.Integer GetStartOffset();

  public java.lang.Integer SetStopOffset(java.lang.Integer stopOffset);

  public java.lang.Integer GetStopOffset();

  public java.lang.Integer SetLabelSensor(java.lang.Integer labelSensor);

  public java.lang.Integer GetLabelSensor();

  public java.lang.Integer SetPrintMethod(java.lang.Integer printMethod);

  public java.lang.Integer GetPrintMethod();

  public java.lang.Integer SetSensorLocation(java.lang.Integer sensorLocation);

  public java.lang.Integer GetSensorLocation();

  public java.lang.Integer GetCommandInterpreterInAction();

  public java.lang.Integer GetPaperError();

  public java.lang.Integer GetRibbonEnd();

  public java.lang.Integer GetBatchProcessing();

  public java.lang.Integer GetPrinting();

  public java.lang.Integer GetPause();

  public java.lang.Integer GetWaitingForPeeling();
}
