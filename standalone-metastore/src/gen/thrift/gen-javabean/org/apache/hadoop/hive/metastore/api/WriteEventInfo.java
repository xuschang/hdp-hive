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
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class WriteEventInfo implements org.apache.thrift.TBase<WriteEventInfo, WriteEventInfo._Fields>, java.io.Serializable, Cloneable, Comparable<WriteEventInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("WriteEventInfo");

  private static final org.apache.thrift.protocol.TField WRITE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("writeId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField DATABASE_FIELD_DESC = new org.apache.thrift.protocol.TField("database", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TABLE_FIELD_DESC = new org.apache.thrift.protocol.TField("table", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField FILES_FIELD_DESC = new org.apache.thrift.protocol.TField("files", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField PARTITION_FIELD_DESC = new org.apache.thrift.protocol.TField("partition", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField TABLE_OBJ_FIELD_DESC = new org.apache.thrift.protocol.TField("tableObj", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField PARTITION_OBJ_FIELD_DESC = new org.apache.thrift.protocol.TField("partitionObj", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new WriteEventInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new WriteEventInfoTupleSchemeFactory());
  }

  private long writeId; // required
  private String database; // required
  private String table; // required
  private String files; // required
  private String partition; // optional
  private String tableObj; // optional
  private String partitionObj; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    WRITE_ID((short)1, "writeId"),
    DATABASE((short)2, "database"),
    TABLE((short)3, "table"),
    FILES((short)4, "files"),
    PARTITION((short)5, "partition"),
    TABLE_OBJ((short)6, "tableObj"),
    PARTITION_OBJ((short)7, "partitionObj");

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
        case 1: // WRITE_ID
          return WRITE_ID;
        case 2: // DATABASE
          return DATABASE;
        case 3: // TABLE
          return TABLE;
        case 4: // FILES
          return FILES;
        case 5: // PARTITION
          return PARTITION;
        case 6: // TABLE_OBJ
          return TABLE_OBJ;
        case 7: // PARTITION_OBJ
          return PARTITION_OBJ;
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
  private static final int __WRITEID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.PARTITION,_Fields.TABLE_OBJ,_Fields.PARTITION_OBJ};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.WRITE_ID, new org.apache.thrift.meta_data.FieldMetaData("writeId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DATABASE, new org.apache.thrift.meta_data.FieldMetaData("database", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TABLE, new org.apache.thrift.meta_data.FieldMetaData("table", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FILES, new org.apache.thrift.meta_data.FieldMetaData("files", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARTITION, new org.apache.thrift.meta_data.FieldMetaData("partition", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TABLE_OBJ, new org.apache.thrift.meta_data.FieldMetaData("tableObj", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARTITION_OBJ, new org.apache.thrift.meta_data.FieldMetaData("partitionObj", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(WriteEventInfo.class, metaDataMap);
  }

  public WriteEventInfo() {
  }

  public WriteEventInfo(
    long writeId,
    String database,
    String table,
    String files)
  {
    this();
    this.writeId = writeId;
    setWriteIdIsSet(true);
    this.database = database;
    this.table = table;
    this.files = files;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public WriteEventInfo(WriteEventInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.writeId = other.writeId;
    if (other.isSetDatabase()) {
      this.database = other.database;
    }
    if (other.isSetTable()) {
      this.table = other.table;
    }
    if (other.isSetFiles()) {
      this.files = other.files;
    }
    if (other.isSetPartition()) {
      this.partition = other.partition;
    }
    if (other.isSetTableObj()) {
      this.tableObj = other.tableObj;
    }
    if (other.isSetPartitionObj()) {
      this.partitionObj = other.partitionObj;
    }
  }

  public WriteEventInfo deepCopy() {
    return new WriteEventInfo(this);
  }

  @Override
  public void clear() {
    setWriteIdIsSet(false);
    this.writeId = 0;
    this.database = null;
    this.table = null;
    this.files = null;
    this.partition = null;
    this.tableObj = null;
    this.partitionObj = null;
  }

  public long getWriteId() {
    return this.writeId;
  }

  public void setWriteId(long writeId) {
    this.writeId = writeId;
    setWriteIdIsSet(true);
  }

  public void unsetWriteId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __WRITEID_ISSET_ID);
  }

  /** Returns true if field writeId is set (has been assigned a value) and false otherwise */
  public boolean isSetWriteId() {
    return EncodingUtils.testBit(__isset_bitfield, __WRITEID_ISSET_ID);
  }

  public void setWriteIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __WRITEID_ISSET_ID, value);
  }

  public String getDatabase() {
    return this.database;
  }

  public void setDatabase(String database) {
    this.database = database;
  }

  public void unsetDatabase() {
    this.database = null;
  }

  /** Returns true if field database is set (has been assigned a value) and false otherwise */
  public boolean isSetDatabase() {
    return this.database != null;
  }

  public void setDatabaseIsSet(boolean value) {
    if (!value) {
      this.database = null;
    }
  }

  public String getTable() {
    return this.table;
  }

  public void setTable(String table) {
    this.table = table;
  }

  public void unsetTable() {
    this.table = null;
  }

  /** Returns true if field table is set (has been assigned a value) and false otherwise */
  public boolean isSetTable() {
    return this.table != null;
  }

  public void setTableIsSet(boolean value) {
    if (!value) {
      this.table = null;
    }
  }

  public String getFiles() {
    return this.files;
  }

  public void setFiles(String files) {
    this.files = files;
  }

  public void unsetFiles() {
    this.files = null;
  }

  /** Returns true if field files is set (has been assigned a value) and false otherwise */
  public boolean isSetFiles() {
    return this.files != null;
  }

  public void setFilesIsSet(boolean value) {
    if (!value) {
      this.files = null;
    }
  }

  public String getPartition() {
    return this.partition;
  }

  public void setPartition(String partition) {
    this.partition = partition;
  }

  public void unsetPartition() {
    this.partition = null;
  }

  /** Returns true if field partition is set (has been assigned a value) and false otherwise */
  public boolean isSetPartition() {
    return this.partition != null;
  }

  public void setPartitionIsSet(boolean value) {
    if (!value) {
      this.partition = null;
    }
  }

  public String getTableObj() {
    return this.tableObj;
  }

  public void setTableObj(String tableObj) {
    this.tableObj = tableObj;
  }

  public void unsetTableObj() {
    this.tableObj = null;
  }

  /** Returns true if field tableObj is set (has been assigned a value) and false otherwise */
  public boolean isSetTableObj() {
    return this.tableObj != null;
  }

  public void setTableObjIsSet(boolean value) {
    if (!value) {
      this.tableObj = null;
    }
  }

  public String getPartitionObj() {
    return this.partitionObj;
  }

  public void setPartitionObj(String partitionObj) {
    this.partitionObj = partitionObj;
  }

  public void unsetPartitionObj() {
    this.partitionObj = null;
  }

  /** Returns true if field partitionObj is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionObj() {
    return this.partitionObj != null;
  }

  public void setPartitionObjIsSet(boolean value) {
    if (!value) {
      this.partitionObj = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case WRITE_ID:
      if (value == null) {
        unsetWriteId();
      } else {
        setWriteId((Long)value);
      }
      break;

    case DATABASE:
      if (value == null) {
        unsetDatabase();
      } else {
        setDatabase((String)value);
      }
      break;

    case TABLE:
      if (value == null) {
        unsetTable();
      } else {
        setTable((String)value);
      }
      break;

    case FILES:
      if (value == null) {
        unsetFiles();
      } else {
        setFiles((String)value);
      }
      break;

    case PARTITION:
      if (value == null) {
        unsetPartition();
      } else {
        setPartition((String)value);
      }
      break;

    case TABLE_OBJ:
      if (value == null) {
        unsetTableObj();
      } else {
        setTableObj((String)value);
      }
      break;

    case PARTITION_OBJ:
      if (value == null) {
        unsetPartitionObj();
      } else {
        setPartitionObj((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case WRITE_ID:
      return getWriteId();

    case DATABASE:
      return getDatabase();

    case TABLE:
      return getTable();

    case FILES:
      return getFiles();

    case PARTITION:
      return getPartition();

    case TABLE_OBJ:
      return getTableObj();

    case PARTITION_OBJ:
      return getPartitionObj();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case WRITE_ID:
      return isSetWriteId();
    case DATABASE:
      return isSetDatabase();
    case TABLE:
      return isSetTable();
    case FILES:
      return isSetFiles();
    case PARTITION:
      return isSetPartition();
    case TABLE_OBJ:
      return isSetTableObj();
    case PARTITION_OBJ:
      return isSetPartitionObj();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof WriteEventInfo)
      return this.equals((WriteEventInfo)that);
    return false;
  }

  public boolean equals(WriteEventInfo that) {
    if (that == null)
      return false;

    boolean this_present_writeId = true;
    boolean that_present_writeId = true;
    if (this_present_writeId || that_present_writeId) {
      if (!(this_present_writeId && that_present_writeId))
        return false;
      if (this.writeId != that.writeId)
        return false;
    }

    boolean this_present_database = true && this.isSetDatabase();
    boolean that_present_database = true && that.isSetDatabase();
    if (this_present_database || that_present_database) {
      if (!(this_present_database && that_present_database))
        return false;
      if (!this.database.equals(that.database))
        return false;
    }

    boolean this_present_table = true && this.isSetTable();
    boolean that_present_table = true && that.isSetTable();
    if (this_present_table || that_present_table) {
      if (!(this_present_table && that_present_table))
        return false;
      if (!this.table.equals(that.table))
        return false;
    }

    boolean this_present_files = true && this.isSetFiles();
    boolean that_present_files = true && that.isSetFiles();
    if (this_present_files || that_present_files) {
      if (!(this_present_files && that_present_files))
        return false;
      if (!this.files.equals(that.files))
        return false;
    }

    boolean this_present_partition = true && this.isSetPartition();
    boolean that_present_partition = true && that.isSetPartition();
    if (this_present_partition || that_present_partition) {
      if (!(this_present_partition && that_present_partition))
        return false;
      if (!this.partition.equals(that.partition))
        return false;
    }

    boolean this_present_tableObj = true && this.isSetTableObj();
    boolean that_present_tableObj = true && that.isSetTableObj();
    if (this_present_tableObj || that_present_tableObj) {
      if (!(this_present_tableObj && that_present_tableObj))
        return false;
      if (!this.tableObj.equals(that.tableObj))
        return false;
    }

    boolean this_present_partitionObj = true && this.isSetPartitionObj();
    boolean that_present_partitionObj = true && that.isSetPartitionObj();
    if (this_present_partitionObj || that_present_partitionObj) {
      if (!(this_present_partitionObj && that_present_partitionObj))
        return false;
      if (!this.partitionObj.equals(that.partitionObj))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_writeId = true;
    list.add(present_writeId);
    if (present_writeId)
      list.add(writeId);

    boolean present_database = true && (isSetDatabase());
    list.add(present_database);
    if (present_database)
      list.add(database);

    boolean present_table = true && (isSetTable());
    list.add(present_table);
    if (present_table)
      list.add(table);

    boolean present_files = true && (isSetFiles());
    list.add(present_files);
    if (present_files)
      list.add(files);

    boolean present_partition = true && (isSetPartition());
    list.add(present_partition);
    if (present_partition)
      list.add(partition);

    boolean present_tableObj = true && (isSetTableObj());
    list.add(present_tableObj);
    if (present_tableObj)
      list.add(tableObj);

    boolean present_partitionObj = true && (isSetPartitionObj());
    list.add(present_partitionObj);
    if (present_partitionObj)
      list.add(partitionObj);

    return list.hashCode();
  }

  @Override
  public int compareTo(WriteEventInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetWriteId()).compareTo(other.isSetWriteId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWriteId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.writeId, other.writeId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDatabase()).compareTo(other.isSetDatabase());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDatabase()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.database, other.database);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTable()).compareTo(other.isSetTable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTable()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.table, other.table);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFiles()).compareTo(other.isSetFiles());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFiles()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.files, other.files);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPartition()).compareTo(other.isSetPartition());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartition()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partition, other.partition);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTableObj()).compareTo(other.isSetTableObj());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableObj()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tableObj, other.tableObj);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPartitionObj()).compareTo(other.isSetPartitionObj());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionObj()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partitionObj, other.partitionObj);
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
    StringBuilder sb = new StringBuilder("WriteEventInfo(");
    boolean first = true;

    sb.append("writeId:");
    sb.append(this.writeId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("database:");
    if (this.database == null) {
      sb.append("null");
    } else {
      sb.append(this.database);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("table:");
    if (this.table == null) {
      sb.append("null");
    } else {
      sb.append(this.table);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("files:");
    if (this.files == null) {
      sb.append("null");
    } else {
      sb.append(this.files);
    }
    first = false;
    if (isSetPartition()) {
      if (!first) sb.append(", ");
      sb.append("partition:");
      if (this.partition == null) {
        sb.append("null");
      } else {
        sb.append(this.partition);
      }
      first = false;
    }
    if (isSetTableObj()) {
      if (!first) sb.append(", ");
      sb.append("tableObj:");
      if (this.tableObj == null) {
        sb.append("null");
      } else {
        sb.append(this.tableObj);
      }
      first = false;
    }
    if (isSetPartitionObj()) {
      if (!first) sb.append(", ");
      sb.append("partitionObj:");
      if (this.partitionObj == null) {
        sb.append("null");
      } else {
        sb.append(this.partitionObj);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetWriteId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'writeId' is unset! Struct:" + toString());
    }

    if (!isSetDatabase()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'database' is unset! Struct:" + toString());
    }

    if (!isSetTable()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'table' is unset! Struct:" + toString());
    }

    if (!isSetFiles()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'files' is unset! Struct:" + toString());
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class WriteEventInfoStandardSchemeFactory implements SchemeFactory {
    public WriteEventInfoStandardScheme getScheme() {
      return new WriteEventInfoStandardScheme();
    }
  }

  private static class WriteEventInfoStandardScheme extends StandardScheme<WriteEventInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, WriteEventInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // WRITE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.writeId = iprot.readI64();
              struct.setWriteIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DATABASE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.database = iprot.readString();
              struct.setDatabaseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TABLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.table = iprot.readString();
              struct.setTableIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // FILES
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.files = iprot.readString();
              struct.setFilesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PARTITION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.partition = iprot.readString();
              struct.setPartitionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // TABLE_OBJ
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tableObj = iprot.readString();
              struct.setTableObjIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // PARTITION_OBJ
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.partitionObj = iprot.readString();
              struct.setPartitionObjIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, WriteEventInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(WRITE_ID_FIELD_DESC);
      oprot.writeI64(struct.writeId);
      oprot.writeFieldEnd();
      if (struct.database != null) {
        oprot.writeFieldBegin(DATABASE_FIELD_DESC);
        oprot.writeString(struct.database);
        oprot.writeFieldEnd();
      }
      if (struct.table != null) {
        oprot.writeFieldBegin(TABLE_FIELD_DESC);
        oprot.writeString(struct.table);
        oprot.writeFieldEnd();
      }
      if (struct.files != null) {
        oprot.writeFieldBegin(FILES_FIELD_DESC);
        oprot.writeString(struct.files);
        oprot.writeFieldEnd();
      }
      if (struct.partition != null) {
        if (struct.isSetPartition()) {
          oprot.writeFieldBegin(PARTITION_FIELD_DESC);
          oprot.writeString(struct.partition);
          oprot.writeFieldEnd();
        }
      }
      if (struct.tableObj != null) {
        if (struct.isSetTableObj()) {
          oprot.writeFieldBegin(TABLE_OBJ_FIELD_DESC);
          oprot.writeString(struct.tableObj);
          oprot.writeFieldEnd();
        }
      }
      if (struct.partitionObj != null) {
        if (struct.isSetPartitionObj()) {
          oprot.writeFieldBegin(PARTITION_OBJ_FIELD_DESC);
          oprot.writeString(struct.partitionObj);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class WriteEventInfoTupleSchemeFactory implements SchemeFactory {
    public WriteEventInfoTupleScheme getScheme() {
      return new WriteEventInfoTupleScheme();
    }
  }

  private static class WriteEventInfoTupleScheme extends TupleScheme<WriteEventInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, WriteEventInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.writeId);
      oprot.writeString(struct.database);
      oprot.writeString(struct.table);
      oprot.writeString(struct.files);
      BitSet optionals = new BitSet();
      if (struct.isSetPartition()) {
        optionals.set(0);
      }
      if (struct.isSetTableObj()) {
        optionals.set(1);
      }
      if (struct.isSetPartitionObj()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetPartition()) {
        oprot.writeString(struct.partition);
      }
      if (struct.isSetTableObj()) {
        oprot.writeString(struct.tableObj);
      }
      if (struct.isSetPartitionObj()) {
        oprot.writeString(struct.partitionObj);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, WriteEventInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.writeId = iprot.readI64();
      struct.setWriteIdIsSet(true);
      struct.database = iprot.readString();
      struct.setDatabaseIsSet(true);
      struct.table = iprot.readString();
      struct.setTableIsSet(true);
      struct.files = iprot.readString();
      struct.setFilesIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.partition = iprot.readString();
        struct.setPartitionIsSet(true);
      }
      if (incoming.get(1)) {
        struct.tableObj = iprot.readString();
        struct.setTableObjIsSet(true);
      }
      if (incoming.get(2)) {
        struct.partitionObj = iprot.readString();
        struct.setPartitionObjIsSet(true);
      }
    }
  }

}

