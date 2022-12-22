// automatically generated by the FlatBuffers compiler, do not modify

package survival2d.flatbuffers;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class NewSafeZoneResponse extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_12_0(); }
  public static NewSafeZoneResponse getRootAsNewSafeZoneResponse(ByteBuffer _bb) { return getRootAsNewSafeZoneResponse(_bb, new NewSafeZoneResponse()); }
  public static NewSafeZoneResponse getRootAsNewSafeZoneResponse(ByteBuffer _bb, NewSafeZoneResponse obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public NewSafeZoneResponse __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public survival2d.flatbuffers.Vec2 safeZone() { return safeZone(new survival2d.flatbuffers.Vec2()); }
  public survival2d.flatbuffers.Vec2 safeZone(survival2d.flatbuffers.Vec2 obj) { int o = __offset(4); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public double radius() { int o = __offset(6); return o != 0 ? bb.getDouble(o + bb_pos) : 0.0; }

  public static void startNewSafeZoneResponse(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addSafeZone(FlatBufferBuilder builder, int safeZoneOffset) { builder.addStruct(0, safeZoneOffset, 0); }
  public static void addRadius(FlatBufferBuilder builder, double radius) { builder.addDouble(1, radius, 0.0); }
  public static int endNewSafeZoneResponse(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public NewSafeZoneResponse get(int j) { return get(new NewSafeZoneResponse(), j); }
    public NewSafeZoneResponse get(NewSafeZoneResponse obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

