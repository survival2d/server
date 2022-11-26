// automatically generated by the FlatBuffers compiler, do not modify

package survival2d.flatbuffers;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class PlayerMoveResponse extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_12_0(); }
  public static PlayerMoveResponse getRootAsPlayerMoveResponse(ByteBuffer _bb) { return getRootAsPlayerMoveResponse(_bb, new PlayerMoveResponse()); }
  public static PlayerMoveResponse getRootAsPlayerMoveResponse(ByteBuffer _bb, PlayerMoveResponse obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public PlayerMoveResponse __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String id() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer idAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer idInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public survival2d.flatbuffers.Vec2 position() { return position(new survival2d.flatbuffers.Vec2()); }
  public survival2d.flatbuffers.Vec2 position(survival2d.flatbuffers.Vec2 obj) { int o = __offset(6); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public double rotation() { int o = __offset(8); return o != 0 ? bb.getDouble(o + bb_pos) : 0.0; }

  public static void startPlayerMoveResponse(FlatBufferBuilder builder) { builder.startTable(3); }
  public static void addId(FlatBufferBuilder builder, int idOffset) { builder.addOffset(0, idOffset, 0); }
  public static void addPosition(FlatBufferBuilder builder, int positionOffset) { builder.addStruct(1, positionOffset, 0); }
  public static void addRotation(FlatBufferBuilder builder, double rotation) { builder.addDouble(2, rotation, 0.0); }
  public static int endPlayerMoveResponse(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public PlayerMoveResponse get(int j) { return get(new PlayerMoveResponse(), j); }
    public PlayerMoveResponse get(PlayerMoveResponse obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

