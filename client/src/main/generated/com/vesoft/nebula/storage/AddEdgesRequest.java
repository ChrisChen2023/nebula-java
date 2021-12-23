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
public class AddEdgesRequest implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("AddEdgesRequest");
  private static final TField SPACE_ID_FIELD_DESC = new TField("space_id", TType.I32, (short)1);
  private static final TField PARTS_FIELD_DESC = new TField("parts", TType.MAP, (short)2);
  private static final TField PROP_NAMES_FIELD_DESC = new TField("prop_names", TType.LIST, (short)3);
  private static final TField IF_NOT_EXISTS_FIELD_DESC = new TField("if_not_exists", TType.BOOL, (short)4);
  private static final TField IGNORE_EXISTED_INDEX_FIELD_DESC = new TField("ignore_existed_index", TType.BOOL, (short)5);
  private static final TField COMMON_FIELD_DESC = new TField("common", TType.STRUCT, (short)6);

  public int space_id;
  public Map<Integer,List<NewEdge>> parts;
  public List<byte[]> prop_names;
  public boolean if_not_exists;
  public boolean ignore_existed_index;
  public RequestCommon common;
  public static final int SPACE_ID = 1;
  public static final int PARTS = 2;
  public static final int PROP_NAMES = 3;
  public static final int IF_NOT_EXISTS = 4;
  public static final int IGNORE_EXISTED_INDEX = 5;
  public static final int COMMON = 6;

  // isset id assignments
  private static final int __SPACE_ID_ISSET_ID = 0;
  private static final int __IF_NOT_EXISTS_ISSET_ID = 1;
  private static final int __IGNORE_EXISTED_INDEX_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(SPACE_ID, new FieldMetaData("space_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(PARTS, new FieldMetaData("parts", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.I32), 
            new ListMetaData(TType.LIST, 
                new StructMetaData(TType.STRUCT, NewEdge.class)))));
    tmpMetaDataMap.put(PROP_NAMES, new FieldMetaData("prop_names", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.STRING))));
    tmpMetaDataMap.put(IF_NOT_EXISTS, new FieldMetaData("if_not_exists", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMetaDataMap.put(IGNORE_EXISTED_INDEX, new FieldMetaData("ignore_existed_index", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMetaDataMap.put(COMMON, new FieldMetaData("common", TFieldRequirementType.OPTIONAL, 
        new StructMetaData(TType.STRUCT, RequestCommon.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(AddEdgesRequest.class, metaDataMap);
  }

  public AddEdgesRequest() {
    this.ignore_existed_index = false;

  }

  public AddEdgesRequest(
      int space_id,
      Map<Integer,List<NewEdge>> parts,
      List<byte[]> prop_names,
      boolean if_not_exists,
      boolean ignore_existed_index) {
    this();
    this.space_id = space_id;
    setSpace_idIsSet(true);
    this.parts = parts;
    this.prop_names = prop_names;
    this.if_not_exists = if_not_exists;
    setIf_not_existsIsSet(true);
    this.ignore_existed_index = ignore_existed_index;
    setIgnore_existed_indexIsSet(true);
  }

  public AddEdgesRequest(
      int space_id,
      Map<Integer,List<NewEdge>> parts,
      List<byte[]> prop_names,
      boolean if_not_exists,
      boolean ignore_existed_index,
      RequestCommon common) {
    this();
    this.space_id = space_id;
    setSpace_idIsSet(true);
    this.parts = parts;
    this.prop_names = prop_names;
    this.if_not_exists = if_not_exists;
    setIf_not_existsIsSet(true);
    this.ignore_existed_index = ignore_existed_index;
    setIgnore_existed_indexIsSet(true);
    this.common = common;
  }

  public static class Builder {
    private int space_id;
    private Map<Integer,List<NewEdge>> parts;
    private List<byte[]> prop_names;
    private boolean if_not_exists;
    private boolean ignore_existed_index;
    private RequestCommon common;

    BitSet __optional_isset = new BitSet(3);

    public Builder() {
    }

    public Builder setSpace_id(final int space_id) {
      this.space_id = space_id;
      __optional_isset.set(__SPACE_ID_ISSET_ID, true);
      return this;
    }

    public Builder setParts(final Map<Integer,List<NewEdge>> parts) {
      this.parts = parts;
      return this;
    }

    public Builder setProp_names(final List<byte[]> prop_names) {
      this.prop_names = prop_names;
      return this;
    }

    public Builder setIf_not_exists(final boolean if_not_exists) {
      this.if_not_exists = if_not_exists;
      __optional_isset.set(__IF_NOT_EXISTS_ISSET_ID, true);
      return this;
    }

    public Builder setIgnore_existed_index(final boolean ignore_existed_index) {
      this.ignore_existed_index = ignore_existed_index;
      __optional_isset.set(__IGNORE_EXISTED_INDEX_ISSET_ID, true);
      return this;
    }

    public Builder setCommon(final RequestCommon common) {
      this.common = common;
      return this;
    }

    public AddEdgesRequest build() {
      AddEdgesRequest result = new AddEdgesRequest();
      if (__optional_isset.get(__SPACE_ID_ISSET_ID)) {
        result.setSpace_id(this.space_id);
      }
      result.setParts(this.parts);
      result.setProp_names(this.prop_names);
      if (__optional_isset.get(__IF_NOT_EXISTS_ISSET_ID)) {
        result.setIf_not_exists(this.if_not_exists);
      }
      if (__optional_isset.get(__IGNORE_EXISTED_INDEX_ISSET_ID)) {
        result.setIgnore_existed_index(this.ignore_existed_index);
      }
      result.setCommon(this.common);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AddEdgesRequest(AddEdgesRequest other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.space_id = TBaseHelper.deepCopy(other.space_id);
    if (other.isSetParts()) {
      this.parts = TBaseHelper.deepCopy(other.parts);
    }
    if (other.isSetProp_names()) {
      this.prop_names = TBaseHelper.deepCopy(other.prop_names);
    }
    this.if_not_exists = TBaseHelper.deepCopy(other.if_not_exists);
    this.ignore_existed_index = TBaseHelper.deepCopy(other.ignore_existed_index);
    if (other.isSetCommon()) {
      this.common = TBaseHelper.deepCopy(other.common);
    }
  }

  public AddEdgesRequest deepCopy() {
    return new AddEdgesRequest(this);
  }

  public int getSpace_id() {
    return this.space_id;
  }

  public AddEdgesRequest setSpace_id(int space_id) {
    this.space_id = space_id;
    setSpace_idIsSet(true);
    return this;
  }

  public void unsetSpace_id() {
    __isset_bit_vector.clear(__SPACE_ID_ISSET_ID);
  }

  // Returns true if field space_id is set (has been assigned a value) and false otherwise
  public boolean isSetSpace_id() {
    return __isset_bit_vector.get(__SPACE_ID_ISSET_ID);
  }

  public void setSpace_idIsSet(boolean __value) {
    __isset_bit_vector.set(__SPACE_ID_ISSET_ID, __value);
  }

  public Map<Integer,List<NewEdge>> getParts() {
    return this.parts;
  }

  public AddEdgesRequest setParts(Map<Integer,List<NewEdge>> parts) {
    this.parts = parts;
    return this;
  }

  public void unsetParts() {
    this.parts = null;
  }

  // Returns true if field parts is set (has been assigned a value) and false otherwise
  public boolean isSetParts() {
    return this.parts != null;
  }

  public void setPartsIsSet(boolean __value) {
    if (!__value) {
      this.parts = null;
    }
  }

  public List<byte[]> getProp_names() {
    return this.prop_names;
  }

  public AddEdgesRequest setProp_names(List<byte[]> prop_names) {
    this.prop_names = prop_names;
    return this;
  }

  public void unsetProp_names() {
    this.prop_names = null;
  }

  // Returns true if field prop_names is set (has been assigned a value) and false otherwise
  public boolean isSetProp_names() {
    return this.prop_names != null;
  }

  public void setProp_namesIsSet(boolean __value) {
    if (!__value) {
      this.prop_names = null;
    }
  }

  public boolean isIf_not_exists() {
    return this.if_not_exists;
  }

  public AddEdgesRequest setIf_not_exists(boolean if_not_exists) {
    this.if_not_exists = if_not_exists;
    setIf_not_existsIsSet(true);
    return this;
  }

  public void unsetIf_not_exists() {
    __isset_bit_vector.clear(__IF_NOT_EXISTS_ISSET_ID);
  }

  // Returns true if field if_not_exists is set (has been assigned a value) and false otherwise
  public boolean isSetIf_not_exists() {
    return __isset_bit_vector.get(__IF_NOT_EXISTS_ISSET_ID);
  }

  public void setIf_not_existsIsSet(boolean __value) {
    __isset_bit_vector.set(__IF_NOT_EXISTS_ISSET_ID, __value);
  }

  public boolean isIgnore_existed_index() {
    return this.ignore_existed_index;
  }

  public AddEdgesRequest setIgnore_existed_index(boolean ignore_existed_index) {
    this.ignore_existed_index = ignore_existed_index;
    setIgnore_existed_indexIsSet(true);
    return this;
  }

  public void unsetIgnore_existed_index() {
    __isset_bit_vector.clear(__IGNORE_EXISTED_INDEX_ISSET_ID);
  }

  // Returns true if field ignore_existed_index is set (has been assigned a value) and false otherwise
  public boolean isSetIgnore_existed_index() {
    return __isset_bit_vector.get(__IGNORE_EXISTED_INDEX_ISSET_ID);
  }

  public void setIgnore_existed_indexIsSet(boolean __value) {
    __isset_bit_vector.set(__IGNORE_EXISTED_INDEX_ISSET_ID, __value);
  }

  public RequestCommon getCommon() {
    return this.common;
  }

  public AddEdgesRequest setCommon(RequestCommon common) {
    this.common = common;
    return this;
  }

  public void unsetCommon() {
    this.common = null;
  }

  // Returns true if field common is set (has been assigned a value) and false otherwise
  public boolean isSetCommon() {
    return this.common != null;
  }

  public void setCommonIsSet(boolean __value) {
    if (!__value) {
      this.common = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case SPACE_ID:
      if (__value == null) {
        unsetSpace_id();
      } else {
        setSpace_id((Integer)__value);
      }
      break;

    case PARTS:
      if (__value == null) {
        unsetParts();
      } else {
        setParts((Map<Integer,List<NewEdge>>)__value);
      }
      break;

    case PROP_NAMES:
      if (__value == null) {
        unsetProp_names();
      } else {
        setProp_names((List<byte[]>)__value);
      }
      break;

    case IF_NOT_EXISTS:
      if (__value == null) {
        unsetIf_not_exists();
      } else {
        setIf_not_exists((Boolean)__value);
      }
      break;

    case IGNORE_EXISTED_INDEX:
      if (__value == null) {
        unsetIgnore_existed_index();
      } else {
        setIgnore_existed_index((Boolean)__value);
      }
      break;

    case COMMON:
      if (__value == null) {
        unsetCommon();
      } else {
        setCommon((RequestCommon)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case SPACE_ID:
      return new Integer(getSpace_id());

    case PARTS:
      return getParts();

    case PROP_NAMES:
      return getProp_names();

    case IF_NOT_EXISTS:
      return new Boolean(isIf_not_exists());

    case IGNORE_EXISTED_INDEX:
      return new Boolean(isIgnore_existed_index());

    case COMMON:
      return getCommon();

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
    if (!(_that instanceof AddEdgesRequest))
      return false;
    AddEdgesRequest that = (AddEdgesRequest)_that;

    if (!TBaseHelper.equalsNobinary(this.space_id, that.space_id)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetParts(), that.isSetParts(), this.parts, that.parts)) { return false; }

    if (!TBaseHelper.equalsSlow(this.isSetProp_names(), that.isSetProp_names(), this.prop_names, that.prop_names)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.if_not_exists, that.if_not_exists)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.ignore_existed_index, that.ignore_existed_index)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetCommon(), that.isSetCommon(), this.common, that.common)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {space_id, parts, prop_names, if_not_exists, ignore_existed_index, common});
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
        case SPACE_ID:
          if (__field.type == TType.I32) {
            this.space_id = iprot.readI32();
            setSpace_idIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case PARTS:
          if (__field.type == TType.MAP) {
            {
              TMap _map109 = iprot.readMapBegin();
              this.parts = new HashMap<Integer,List<NewEdge>>(Math.max(0, 2*_map109.size));
              for (int _i110 = 0; 
                   (_map109.size < 0) ? iprot.peekMap() : (_i110 < _map109.size); 
                   ++_i110)
              {
                int _key111;
                List<NewEdge> _val112;
                _key111 = iprot.readI32();
                {
                  TList _list113 = iprot.readListBegin();
                  _val112 = new ArrayList<NewEdge>(Math.max(0, _list113.size));
                  for (int _i114 = 0; 
                       (_list113.size < 0) ? iprot.peekList() : (_i114 < _list113.size); 
                       ++_i114)
                  {
                    NewEdge _elem115;
                    _elem115 = new NewEdge();
                    _elem115.read(iprot);
                    _val112.add(_elem115);
                  }
                  iprot.readListEnd();
                }
                this.parts.put(_key111, _val112);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case PROP_NAMES:
          if (__field.type == TType.LIST) {
            {
              TList _list116 = iprot.readListBegin();
              this.prop_names = new ArrayList<byte[]>(Math.max(0, _list116.size));
              for (int _i117 = 0; 
                   (_list116.size < 0) ? iprot.peekList() : (_i117 < _list116.size); 
                   ++_i117)
              {
                byte[] _elem118;
                _elem118 = iprot.readBinary();
                this.prop_names.add(_elem118);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case IF_NOT_EXISTS:
          if (__field.type == TType.BOOL) {
            this.if_not_exists = iprot.readBool();
            setIf_not_existsIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case IGNORE_EXISTED_INDEX:
          if (__field.type == TType.BOOL) {
            this.ignore_existed_index = iprot.readBool();
            setIgnore_existed_indexIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case COMMON:
          if (__field.type == TType.STRUCT) {
            this.common = new RequestCommon();
            this.common.read(iprot);
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
    oprot.writeFieldBegin(SPACE_ID_FIELD_DESC);
    oprot.writeI32(this.space_id);
    oprot.writeFieldEnd();
    if (this.parts != null) {
      oprot.writeFieldBegin(PARTS_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.I32, TType.LIST, this.parts.size()));
        for (Map.Entry<Integer, List<NewEdge>> _iter119 : this.parts.entrySet())        {
          oprot.writeI32(_iter119.getKey());
          {
            oprot.writeListBegin(new TList(TType.STRUCT, _iter119.getValue().size()));
            for (NewEdge _iter120 : _iter119.getValue())            {
              _iter120.write(oprot);
            }
            oprot.writeListEnd();
          }
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.prop_names != null) {
      oprot.writeFieldBegin(PROP_NAMES_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.prop_names.size()));
        for (byte[] _iter121 : this.prop_names)        {
          oprot.writeBinary(_iter121);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(IF_NOT_EXISTS_FIELD_DESC);
    oprot.writeBool(this.if_not_exists);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(IGNORE_EXISTED_INDEX_FIELD_DESC);
    oprot.writeBool(this.ignore_existed_index);
    oprot.writeFieldEnd();
    if (this.common != null) {
      if (isSetCommon()) {
        oprot.writeFieldBegin(COMMON_FIELD_DESC);
        this.common.write(oprot);
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
    StringBuilder sb = new StringBuilder("AddEdgesRequest");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("space_id");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.getSpace_id(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("parts");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getParts() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getParts(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("prop_names");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getProp_names() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getProp_names(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("if_not_exists");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.isIf_not_exists(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("ignore_existed_index");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.isIgnore_existed_index(), indent + 1, prettyPrint));
    first = false;
    if (isSetCommon())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("common");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getCommon() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getCommon(), indent + 1, prettyPrint));
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

