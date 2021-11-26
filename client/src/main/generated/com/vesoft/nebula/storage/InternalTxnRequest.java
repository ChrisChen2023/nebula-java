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
public class InternalTxnRequest implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("InternalTxnRequest");
  private static final TField TXN_ID_FIELD_DESC = new TField("txn_id", TType.I64, (short)1);
  private static final TField TERM_OF_PARTS_FIELD_DESC = new TField("term_of_parts", TType.MAP, (short)2);
  private static final TField ADD_EDGE_REQ_FIELD_DESC = new TField("add_edge_req", TType.STRUCT, (short)3);
  private static final TField UPD_EDGE_REQ_FIELD_DESC = new TField("upd_edge_req", TType.STRUCT, (short)4);
  private static final TField EDGE_VER_FIELD_DESC = new TField("edge_ver", TType.MAP, (short)5);

  public long txn_id;
  public Map<Integer,Long> term_of_parts;
  public AddEdgesRequest add_edge_req;
  public UpdateEdgeRequest upd_edge_req;
  public Map<Integer,List<Long>> edge_ver;
  public static final int TXN_ID = 1;
  public static final int TERM_OF_PARTS = 2;
  public static final int ADD_EDGE_REQ = 3;
  public static final int UPD_EDGE_REQ = 4;
  public static final int EDGE_VER = 5;

  // isset id assignments
  private static final int __TXN_ID_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(TXN_ID, new FieldMetaData("txn_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(TERM_OF_PARTS, new FieldMetaData("term_of_parts", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.I32), 
            new FieldValueMetaData(TType.I64))));
    tmpMetaDataMap.put(ADD_EDGE_REQ, new FieldMetaData("add_edge_req", TFieldRequirementType.OPTIONAL, 
        new StructMetaData(TType.STRUCT, AddEdgesRequest.class)));
    tmpMetaDataMap.put(UPD_EDGE_REQ, new FieldMetaData("upd_edge_req", TFieldRequirementType.OPTIONAL, 
        new StructMetaData(TType.STRUCT, UpdateEdgeRequest.class)));
    tmpMetaDataMap.put(EDGE_VER, new FieldMetaData("edge_ver", TFieldRequirementType.OPTIONAL, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.I32), 
            new ListMetaData(TType.LIST, 
                new FieldValueMetaData(TType.I64)))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(InternalTxnRequest.class, metaDataMap);
  }

  public InternalTxnRequest() {
  }

  public InternalTxnRequest(
      long txn_id,
      Map<Integer,Long> term_of_parts) {
    this();
    this.txn_id = txn_id;
    setTxn_idIsSet(true);
    this.term_of_parts = term_of_parts;
  }

  public InternalTxnRequest(
      long txn_id,
      Map<Integer,Long> term_of_parts,
      AddEdgesRequest add_edge_req,
      UpdateEdgeRequest upd_edge_req,
      Map<Integer,List<Long>> edge_ver) {
    this();
    this.txn_id = txn_id;
    setTxn_idIsSet(true);
    this.term_of_parts = term_of_parts;
    this.add_edge_req = add_edge_req;
    this.upd_edge_req = upd_edge_req;
    this.edge_ver = edge_ver;
  }

  public static class Builder {
    private long txn_id;
    private Map<Integer,Long> term_of_parts;
    private AddEdgesRequest add_edge_req;
    private UpdateEdgeRequest upd_edge_req;
    private Map<Integer,List<Long>> edge_ver;

    BitSet __optional_isset = new BitSet(1);

    public Builder() {
    }

    public Builder setTxn_id(final long txn_id) {
      this.txn_id = txn_id;
      __optional_isset.set(__TXN_ID_ISSET_ID, true);
      return this;
    }

    public Builder setTerm_of_parts(final Map<Integer,Long> term_of_parts) {
      this.term_of_parts = term_of_parts;
      return this;
    }

    public Builder setAdd_edge_req(final AddEdgesRequest add_edge_req) {
      this.add_edge_req = add_edge_req;
      return this;
    }

    public Builder setUpd_edge_req(final UpdateEdgeRequest upd_edge_req) {
      this.upd_edge_req = upd_edge_req;
      return this;
    }

    public Builder setEdge_ver(final Map<Integer,List<Long>> edge_ver) {
      this.edge_ver = edge_ver;
      return this;
    }

    public InternalTxnRequest build() {
      InternalTxnRequest result = new InternalTxnRequest();
      if (__optional_isset.get(__TXN_ID_ISSET_ID)) {
        result.setTxn_id(this.txn_id);
      }
      result.setTerm_of_parts(this.term_of_parts);
      result.setAdd_edge_req(this.add_edge_req);
      result.setUpd_edge_req(this.upd_edge_req);
      result.setEdge_ver(this.edge_ver);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public InternalTxnRequest(InternalTxnRequest other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.txn_id = TBaseHelper.deepCopy(other.txn_id);
    if (other.isSetTerm_of_parts()) {
      this.term_of_parts = TBaseHelper.deepCopy(other.term_of_parts);
    }
    if (other.isSetAdd_edge_req()) {
      this.add_edge_req = TBaseHelper.deepCopy(other.add_edge_req);
    }
    if (other.isSetUpd_edge_req()) {
      this.upd_edge_req = TBaseHelper.deepCopy(other.upd_edge_req);
    }
    if (other.isSetEdge_ver()) {
      this.edge_ver = TBaseHelper.deepCopy(other.edge_ver);
    }
  }

  public InternalTxnRequest deepCopy() {
    return new InternalTxnRequest(this);
  }

  public long getTxn_id() {
    return this.txn_id;
  }

  public InternalTxnRequest setTxn_id(long txn_id) {
    this.txn_id = txn_id;
    setTxn_idIsSet(true);
    return this;
  }

  public void unsetTxn_id() {
    __isset_bit_vector.clear(__TXN_ID_ISSET_ID);
  }

  // Returns true if field txn_id is set (has been assigned a value) and false otherwise
  public boolean isSetTxn_id() {
    return __isset_bit_vector.get(__TXN_ID_ISSET_ID);
  }

  public void setTxn_idIsSet(boolean __value) {
    __isset_bit_vector.set(__TXN_ID_ISSET_ID, __value);
  }

  public Map<Integer,Long> getTerm_of_parts() {
    return this.term_of_parts;
  }

  public InternalTxnRequest setTerm_of_parts(Map<Integer,Long> term_of_parts) {
    this.term_of_parts = term_of_parts;
    return this;
  }

  public void unsetTerm_of_parts() {
    this.term_of_parts = null;
  }

  // Returns true if field term_of_parts is set (has been assigned a value) and false otherwise
  public boolean isSetTerm_of_parts() {
    return this.term_of_parts != null;
  }

  public void setTerm_of_partsIsSet(boolean __value) {
    if (!__value) {
      this.term_of_parts = null;
    }
  }

  public AddEdgesRequest getAdd_edge_req() {
    return this.add_edge_req;
  }

  public InternalTxnRequest setAdd_edge_req(AddEdgesRequest add_edge_req) {
    this.add_edge_req = add_edge_req;
    return this;
  }

  public void unsetAdd_edge_req() {
    this.add_edge_req = null;
  }

  // Returns true if field add_edge_req is set (has been assigned a value) and false otherwise
  public boolean isSetAdd_edge_req() {
    return this.add_edge_req != null;
  }

  public void setAdd_edge_reqIsSet(boolean __value) {
    if (!__value) {
      this.add_edge_req = null;
    }
  }

  public UpdateEdgeRequest getUpd_edge_req() {
    return this.upd_edge_req;
  }

  public InternalTxnRequest setUpd_edge_req(UpdateEdgeRequest upd_edge_req) {
    this.upd_edge_req = upd_edge_req;
    return this;
  }

  public void unsetUpd_edge_req() {
    this.upd_edge_req = null;
  }

  // Returns true if field upd_edge_req is set (has been assigned a value) and false otherwise
  public boolean isSetUpd_edge_req() {
    return this.upd_edge_req != null;
  }

  public void setUpd_edge_reqIsSet(boolean __value) {
    if (!__value) {
      this.upd_edge_req = null;
    }
  }

  public Map<Integer,List<Long>> getEdge_ver() {
    return this.edge_ver;
  }

  public InternalTxnRequest setEdge_ver(Map<Integer,List<Long>> edge_ver) {
    this.edge_ver = edge_ver;
    return this;
  }

  public void unsetEdge_ver() {
    this.edge_ver = null;
  }

  // Returns true if field edge_ver is set (has been assigned a value) and false otherwise
  public boolean isSetEdge_ver() {
    return this.edge_ver != null;
  }

  public void setEdge_verIsSet(boolean __value) {
    if (!__value) {
      this.edge_ver = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case TXN_ID:
      if (__value == null) {
        unsetTxn_id();
      } else {
        setTxn_id((Long)__value);
      }
      break;

    case TERM_OF_PARTS:
      if (__value == null) {
        unsetTerm_of_parts();
      } else {
        setTerm_of_parts((Map<Integer,Long>)__value);
      }
      break;

    case ADD_EDGE_REQ:
      if (__value == null) {
        unsetAdd_edge_req();
      } else {
        setAdd_edge_req((AddEdgesRequest)__value);
      }
      break;

    case UPD_EDGE_REQ:
      if (__value == null) {
        unsetUpd_edge_req();
      } else {
        setUpd_edge_req((UpdateEdgeRequest)__value);
      }
      break;

    case EDGE_VER:
      if (__value == null) {
        unsetEdge_ver();
      } else {
        setEdge_ver((Map<Integer,List<Long>>)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case TXN_ID:
      return new Long(getTxn_id());

    case TERM_OF_PARTS:
      return getTerm_of_parts();

    case ADD_EDGE_REQ:
      return getAdd_edge_req();

    case UPD_EDGE_REQ:
      return getUpd_edge_req();

    case EDGE_VER:
      return getEdge_ver();

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
    if (!(_that instanceof InternalTxnRequest))
      return false;
    InternalTxnRequest that = (InternalTxnRequest)_that;

    if (!TBaseHelper.equalsNobinary(this.txn_id, that.txn_id)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetTerm_of_parts(), that.isSetTerm_of_parts(), this.term_of_parts, that.term_of_parts)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetAdd_edge_req(), that.isSetAdd_edge_req(), this.add_edge_req, that.add_edge_req)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetUpd_edge_req(), that.isSetUpd_edge_req(), this.upd_edge_req, that.upd_edge_req)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetEdge_ver(), that.isSetEdge_ver(), this.edge_ver, that.edge_ver)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {txn_id, term_of_parts, add_edge_req, upd_edge_req, edge_ver});
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
        case TXN_ID:
          if (__field.type == TType.I64) {
            this.txn_id = iprot.readI64();
            setTxn_idIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case TERM_OF_PARTS:
          if (__field.type == TType.MAP) {
            {
              TMap _map278 = iprot.readMapBegin();
              this.term_of_parts = new HashMap<Integer,Long>(Math.max(0, 2*_map278.size));
              for (int _i279 = 0; 
                   (_map278.size < 0) ? iprot.peekMap() : (_i279 < _map278.size); 
                   ++_i279)
              {
                int _key280;
                long _val281;
                _key280 = iprot.readI32();
                _val281 = iprot.readI64();
                this.term_of_parts.put(_key280, _val281);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case ADD_EDGE_REQ:
          if (__field.type == TType.STRUCT) {
            this.add_edge_req = new AddEdgesRequest();
            this.add_edge_req.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case UPD_EDGE_REQ:
          if (__field.type == TType.STRUCT) {
            this.upd_edge_req = new UpdateEdgeRequest();
            this.upd_edge_req.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case EDGE_VER:
          if (__field.type == TType.MAP) {
            {
              TMap _map282 = iprot.readMapBegin();
              this.edge_ver = new HashMap<Integer,List<Long>>(Math.max(0, 2*_map282.size));
              for (int _i283 = 0; 
                   (_map282.size < 0) ? iprot.peekMap() : (_i283 < _map282.size); 
                   ++_i283)
              {
                int _key284;
                List<Long> _val285;
                _key284 = iprot.readI32();
                {
                  TList _list286 = iprot.readListBegin();
                  _val285 = new ArrayList<Long>(Math.max(0, _list286.size));
                  for (int _i287 = 0; 
                       (_list286.size < 0) ? iprot.peekList() : (_i287 < _list286.size); 
                       ++_i287)
                  {
                    long _elem288;
                    _elem288 = iprot.readI64();
                    _val285.add(_elem288);
                  }
                  iprot.readListEnd();
                }
                this.edge_ver.put(_key284, _val285);
              }
              iprot.readMapEnd();
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
    oprot.writeFieldBegin(TXN_ID_FIELD_DESC);
    oprot.writeI64(this.txn_id);
    oprot.writeFieldEnd();
    if (this.term_of_parts != null) {
      oprot.writeFieldBegin(TERM_OF_PARTS_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.I32, TType.I64, this.term_of_parts.size()));
        for (Map.Entry<Integer, Long> _iter289 : this.term_of_parts.entrySet())        {
          oprot.writeI32(_iter289.getKey());
          oprot.writeI64(_iter289.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.add_edge_req != null) {
      if (isSetAdd_edge_req()) {
        oprot.writeFieldBegin(ADD_EDGE_REQ_FIELD_DESC);
        this.add_edge_req.write(oprot);
        oprot.writeFieldEnd();
      }
    }
    if (this.upd_edge_req != null) {
      if (isSetUpd_edge_req()) {
        oprot.writeFieldBegin(UPD_EDGE_REQ_FIELD_DESC);
        this.upd_edge_req.write(oprot);
        oprot.writeFieldEnd();
      }
    }
    if (this.edge_ver != null) {
      if (isSetEdge_ver()) {
        oprot.writeFieldBegin(EDGE_VER_FIELD_DESC);
        {
          oprot.writeMapBegin(new TMap(TType.I32, TType.LIST, this.edge_ver.size()));
          for (Map.Entry<Integer, List<Long>> _iter290 : this.edge_ver.entrySet())          {
            oprot.writeI32(_iter290.getKey());
            {
              oprot.writeListBegin(new TList(TType.I64, _iter290.getValue().size()));
              for (long _iter291 : _iter290.getValue())              {
                oprot.writeI64(_iter291);
              }
              oprot.writeListEnd();
            }
          }
          oprot.writeMapEnd();
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
    StringBuilder sb = new StringBuilder("InternalTxnRequest");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("txn_id");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.getTxn_id(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("term_of_parts");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getTerm_of_parts() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getTerm_of_parts(), indent + 1, prettyPrint));
    }
    first = false;
    if (isSetAdd_edge_req())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("add_edge_req");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getAdd_edge_req() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getAdd_edge_req(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (isSetUpd_edge_req())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("upd_edge_req");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getUpd_edge_req() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getUpd_edge_req(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (isSetEdge_ver())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("edge_ver");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getEdge_ver() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getEdge_ver(), indent + 1, prettyPrint));
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

