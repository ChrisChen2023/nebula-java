/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.meta;

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
public class CreateBackupReq implements TBase, java.io.Serializable, Cloneable, Comparable<CreateBackupReq> {
  private static final TStruct STRUCT_DESC = new TStruct("CreateBackupReq");
  private static final TField SPACES_FIELD_DESC = new TField("spaces", TType.LIST, (short)1);

  public List<byte[]> spaces;
  public static final int SPACES = 1;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(SPACES, new FieldMetaData("spaces", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(CreateBackupReq.class, metaDataMap);
  }

  public CreateBackupReq() {
  }

  public CreateBackupReq(
      List<byte[]> spaces) {
    this();
    this.spaces = spaces;
  }

  public static class Builder {
    private List<byte[]> spaces;

    public Builder() {
    }

    public Builder setSpaces(final List<byte[]> spaces) {
      this.spaces = spaces;
      return this;
    }

    public CreateBackupReq build() {
      CreateBackupReq result = new CreateBackupReq();
      result.setSpaces(this.spaces);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CreateBackupReq(CreateBackupReq other) {
    if (other.isSetSpaces()) {
      this.spaces = TBaseHelper.deepCopy(other.spaces);
    }
  }

  public CreateBackupReq deepCopy() {
    return new CreateBackupReq(this);
  }

  public List<byte[]> getSpaces() {
    return this.spaces;
  }

  public CreateBackupReq setSpaces(List<byte[]> spaces) {
    this.spaces = spaces;
    return this;
  }

  public void unsetSpaces() {
    this.spaces = null;
  }

  // Returns true if field spaces is set (has been assigned a value) and false otherwise
  public boolean isSetSpaces() {
    return this.spaces != null;
  }

  public void setSpacesIsSet(boolean __value) {
    if (!__value) {
      this.spaces = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case SPACES:
      if (__value == null) {
        unsetSpaces();
      } else {
        setSpaces((List<byte[]>)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case SPACES:
      return getSpaces();

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
    if (!(_that instanceof CreateBackupReq))
      return false;
    CreateBackupReq that = (CreateBackupReq)_that;

    if (!TBaseHelper.equalsSlow(this.isSetSpaces(), that.isSetSpaces(), this.spaces, that.spaces)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {spaces});
  }

  @Override
  public int compareTo(CreateBackupReq other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSpaces()).compareTo(other.isSetSpaces());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(spaces, other.spaces);
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
        case SPACES:
          if (__field.type == TType.LIST) {
            {
              TList _list265 = iprot.readListBegin();
              this.spaces = new ArrayList<byte[]>(Math.max(0, _list265.size));
              for (int _i266 = 0; 
                   (_list265.size < 0) ? iprot.peekList() : (_i266 < _list265.size); 
                   ++_i266)
              {
                byte[] _elem267;
                _elem267 = iprot.readBinary();
                this.spaces.add(_elem267);
              }
              iprot.readListEnd();
            }
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
    if (this.spaces != null) {
      if (isSetSpaces()) {
        oprot.writeFieldBegin(SPACES_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.spaces.size()));
          for (byte[] _iter268 : this.spaces)          {
            oprot.writeBinary(_iter268);
          }
          oprot.writeListEnd();
        }
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
    StringBuilder sb = new StringBuilder("CreateBackupReq");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    if (isSetSpaces())
    {
      sb.append(indentStr);
      sb.append("spaces");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getSpaces() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getSpaces(), indent + 1, prettyPrint));
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

