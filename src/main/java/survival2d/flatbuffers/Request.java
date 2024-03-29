// automatically generated by the FlatBuffers compiler, do not modify

package survival2d.flatbuffers;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Request extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_12_0(); }
  public static Request getRootAsRequest(ByteBuffer _bb) { return getRootAsRequest(_bb, new Request()); }
  public static Request getRootAsRequest(ByteBuffer _bb, Request obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Request __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public byte requestType() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public Table request(Table obj) { int o = __offset(6); return o != 0 ? __union(obj, o + bb_pos) : null; }

  public static int createRequest(FlatBufferBuilder builder,
      byte request_type,
      int requestOffset) {
    builder.startTable(2);
    Request.addRequest(builder, requestOffset);
    Request.addRequestType(builder, request_type);
    return Request.endRequest(builder);
  }

  public static void startRequest(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addRequestType(FlatBufferBuilder builder, byte requestType) { builder.addByte(0, requestType, 0); }
  public static void addRequest(FlatBufferBuilder builder, int requestOffset) { builder.addOffset(1, requestOffset, 0); }
  public static int endRequest(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishRequestBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedRequestBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Request get(int j) { return get(new Request(), j); }
    public Request get(Request obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

