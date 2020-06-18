/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class NotNullConstraintsResponse implements org.apache.thrift.TBase<NotNullConstraintsResponse, NotNullConstraintsResponse._Fields>, java.io.Serializable, Cloneable, Comparable<NotNullConstraintsResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("NotNullConstraintsResponse");

  private static final org.apache.thrift.protocol.TField NOT_NULL_CONSTRAINTS_FIELD_DESC = new org.apache.thrift.protocol.TField("notNullConstraints", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new NotNullConstraintsResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new NotNullConstraintsResponseTupleSchemeFactory());
  }

  private List<SQLNotNullConstraint> notNullConstraints; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NOT_NULL_CONSTRAINTS((short)1, "notNullConstraints");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NOT_NULL_CONSTRAINTS
          return NOT_NULL_CONSTRAINTS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NOT_NULL_CONSTRAINTS, new org.apache.thrift.meta_data.FieldMetaData("notNullConstraints", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SQLNotNullConstraint.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(NotNullConstraintsResponse.class, metaDataMap);
  }

  public NotNullConstraintsResponse() {
  }

  public NotNullConstraintsResponse(
    List<SQLNotNullConstraint> notNullConstraints)
  {
    this();
    this.notNullConstraints = notNullConstraints;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NotNullConstraintsResponse(NotNullConstraintsResponse other) {
    if (other.isSetNotNullConstraints()) {
      List<SQLNotNullConstraint> __this__notNullConstraints = new ArrayList<SQLNotNullConstraint>(other.notNullConstraints.size());
      for (SQLNotNullConstraint other_element : other.notNullConstraints) {
        __this__notNullConstraints.add(new SQLNotNullConstraint(other_element));
      }
      this.notNullConstraints = __this__notNullConstraints;
    }
  }

  public NotNullConstraintsResponse deepCopy() {
    return new NotNullConstraintsResponse(this);
  }

  @Override
  public void clear() {
    this.notNullConstraints = null;
  }

  public int getNotNullConstraintsSize() {
    return (this.notNullConstraints == null) ? 0 : this.notNullConstraints.size();
  }

  public java.util.Iterator<SQLNotNullConstraint> getNotNullConstraintsIterator() {
    return (this.notNullConstraints == null) ? null : this.notNullConstraints.iterator();
  }

  public void addToNotNullConstraints(SQLNotNullConstraint elem) {
    if (this.notNullConstraints == null) {
      this.notNullConstraints = new ArrayList<SQLNotNullConstraint>();
    }
    this.notNullConstraints.add(elem);
  }

  public List<SQLNotNullConstraint> getNotNullConstraints() {
    return this.notNullConstraints;
  }

  public void setNotNullConstraints(List<SQLNotNullConstraint> notNullConstraints) {
    this.notNullConstraints = notNullConstraints;
  }

  public void unsetNotNullConstraints() {
    this.notNullConstraints = null;
  }

  /** Returns true if field notNullConstraints is set (has been assigned a value) and false otherwise */
  public boolean isSetNotNullConstraints() {
    return this.notNullConstraints != null;
  }

  public void setNotNullConstraintsIsSet(boolean value) {
    if (!value) {
      this.notNullConstraints = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NOT_NULL_CONSTRAINTS:
      if (value == null) {
        unsetNotNullConstraints();
      } else {
        setNotNullConstraints((List<SQLNotNullConstraint>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NOT_NULL_CONSTRAINTS:
      return getNotNullConstraints();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NOT_NULL_CONSTRAINTS:
      return isSetNotNullConstraints();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof NotNullConstraintsResponse)
      return this.equals((NotNullConstraintsResponse)that);
    return false;
  }

  public boolean equals(NotNullConstraintsResponse that) {
    if (that == null)
      return false;

    boolean this_present_notNullConstraints = true && this.isSetNotNullConstraints();
    boolean that_present_notNullConstraints = true && that.isSetNotNullConstraints();
    if (this_present_notNullConstraints || that_present_notNullConstraints) {
      if (!(this_present_notNullConstraints && that_present_notNullConstraints))
        return false;
      if (!this.notNullConstraints.equals(that.notNullConstraints))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_notNullConstraints = true && (isSetNotNullConstraints());
    list.add(present_notNullConstraints);
    if (present_notNullConstraints)
      list.add(notNullConstraints);

    return list.hashCode();
  }

  @Override
  public int compareTo(NotNullConstraintsResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetNotNullConstraints()).compareTo(other.isSetNotNullConstraints());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNotNullConstraints()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.notNullConstraints, other.notNullConstraints);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("NotNullConstraintsResponse(");
    boolean first = true;

    sb.append("notNullConstraints:");
    if (this.notNullConstraints == null) {
      sb.append("null");
    } else {
      sb.append(this.notNullConstraints);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetNotNullConstraints()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'notNullConstraints' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class NotNullConstraintsResponseStandardSchemeFactory implements SchemeFactory {
    public NotNullConstraintsResponseStandardScheme getScheme() {
      return new NotNullConstraintsResponseStandardScheme();
    }
  }

  private static class NotNullConstraintsResponseStandardScheme extends StandardScheme<NotNullConstraintsResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, NotNullConstraintsResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NOT_NULL_CONSTRAINTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list352 = iprot.readListBegin();
                struct.notNullConstraints = new ArrayList<SQLNotNullConstraint>(_list352.size);
                SQLNotNullConstraint _elem353;
                for (int _i354 = 0; _i354 < _list352.size; ++_i354)
                {
                  _elem353 = new SQLNotNullConstraint();
                  _elem353.read(iprot);
                  struct.notNullConstraints.add(_elem353);
                }
                iprot.readListEnd();
              }
              struct.setNotNullConstraintsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, NotNullConstraintsResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.notNullConstraints != null) {
        oprot.writeFieldBegin(NOT_NULL_CONSTRAINTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.notNullConstraints.size()));
          for (SQLNotNullConstraint _iter355 : struct.notNullConstraints)
          {
            _iter355.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class NotNullConstraintsResponseTupleSchemeFactory implements SchemeFactory {
    public NotNullConstraintsResponseTupleScheme getScheme() {
      return new NotNullConstraintsResponseTupleScheme();
    }
  }

  private static class NotNullConstraintsResponseTupleScheme extends TupleScheme<NotNullConstraintsResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, NotNullConstraintsResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.notNullConstraints.size());
        for (SQLNotNullConstraint _iter356 : struct.notNullConstraints)
        {
          _iter356.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, NotNullConstraintsResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list357 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.notNullConstraints = new ArrayList<SQLNotNullConstraint>(_list357.size);
        SQLNotNullConstraint _elem358;
        for (int _i359 = 0; _i359 < _list357.size; ++_i359)
        {
          _elem358 = new SQLNotNullConstraint();
          _elem358.read(iprot);
          struct.notNullConstraints.add(_elem358);
        }
      }
      struct.setNotNullConstraintsIsSet(true);
    }
  }

}

