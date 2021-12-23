/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.storage;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import com.facebook.thrift.*;
import com.facebook.thrift.annotations.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class ScanCursor implements TBase, java.io.Serializable, Cloneable, Comparable<ScanCursor> {
  private static final TStruct STRUCT_DESC = new TStruct("ScanCursor");
  private static final TField NEXT_CURSOR_FIELD_DESC = new TField("next_cursor", TType.STRING, (short)1);

  public byte[] next_cursor;
  public static final int NEXT_CURSOR = 1;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(NEXT_CURSOR, new FieldMetaData("next_cursor", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(ScanCursor.class, metaDataMap);
  }

  public ScanCursor() {
  }

  public ScanCursor(
      byte[] next_cursor) {
    this();
    this.next_cursor = next_cursor;
  }

  public static class Builder {
    private byte[] next_cursor;

    public Builder() {
    }

    public Builder setNext_cursor(final byte[] next_cursor) {
      this.next_cursor = next_cursor;
      return this;
    }

    public ScanCursor build() {
      ScanCursor result = new ScanCursor();
      result.setNext_cursor(this.next_cursor);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ScanCursor(ScanCursor other) {
    if (other.isSetNext_cursor()) {
      this.next_cursor = TBaseHelper.deepCopy(other.next_cursor);
    }
  }

  public ScanCursor deepCopy() {
    return new ScanCursor(this);
  }

  public byte[] getNext_cursor() {
    return this.next_cursor;
  }

  public ScanCursor setNext_cursor(byte[] next_cursor) {
    this.next_cursor = next_cursor;
    return this;
  }

  public void unsetNext_cursor() {
    this.next_cursor = null;
  }

  // Returns true if field next_cursor is set (has been assigned a value) and false otherwise
  public boolean isSetNext_cursor() {
    return this.next_cursor != null;
  }

  public void setNext_cursorIsSet(boolean __value) {
    if (!__value) {
      this.next_cursor = null;
    }
  }

  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case NEXT_CURSOR:
      if (__value == null) {
        unsetNext_cursor();
      } else {
        setNext_cursor((byte[])__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case NEXT_CURSOR:
      return getNext_cursor();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object _that) {
    if (_that == null)
      return false;
    if (this == _that)
      return true;
    if (!(_that instanceof ScanCursor))
      return false;
    ScanCursor that = (ScanCursor)_that;

    if (!TBaseHelper.equalsSlow(this.isSetNext_cursor(), that.isSetNext_cursor(), this.next_cursor, that.next_cursor)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {next_cursor});
  }

  @Override
  public int compareTo(ScanCursor other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetNext_cursor()).compareTo(other.isSetNext_cursor());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(next_cursor, other.next_cursor);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField __field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      __field = iprot.readFieldBegin();
      if (__field.type == TType.STOP) { 
        break;
      }
      switch (__field.id)
      {
        case NEXT_CURSOR:
          if (__field.type == TType.STRING) {
            this.next_cursor = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, __field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.next_cursor != null) {
      if (isSetNext_cursor()) {
        oprot.writeFieldBegin(NEXT_CURSOR_FIELD_DESC);
        oprot.writeBinary(this.next_cursor);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(1, true);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
    String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("ScanCursor");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    if (isSetNext_cursor())
    {
      sb.append(indentStr);
      sb.append("next_cursor");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getNext_cursor() == null) {
        sb.append("null");
      } else {
          int __next_cursor_size = Math.min(this.getNext_cursor().length, 128);
          for (int i = 0; i < __next_cursor_size; i++) {
            if (i != 0) sb.append(" ");
            sb.append(Integer.toHexString(this.getNext_cursor()[i]).length() > 1 ? Integer.toHexString(this.getNext_cursor()[i]).substring(Integer.toHexString(this.getNext_cursor()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this.getNext_cursor()[i]).toUpperCase());
          }
          if (this.getNext_cursor().length > 128) sb.append(" ...");
      }
      first = false;
    }
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

