// automatically generated by the FlatBuffers compiler, do not modify

package survival2d.flatbuffers;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class PlayerDropItemRequest extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_12_0(); }
  public static PlayerDropItemRequest getRootAsPlayerDropItemRequest(ByteBuffer _bb) { return getRootAsPlayerDropItemRequest(_bb, new PlayerDropItemRequest()); }
  public static PlayerDropItemRequest getRootAsPlayerDropItemRequest(ByteBuffer _bb, PlayerDropItemRequest obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public PlayerDropItemRequest __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int id() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }

  public static int createPlayerDropItemRequest(FlatBufferBuilder builder,
      int id) {
    builder.startTable(1);
    PlayerDropItemRequest.addId(builder, id);
    return PlayerDropItemRequest.endPlayerDropItemRequest(builder);
  }

  public static void startPlayerDropItemRequest(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addId(FlatBufferBuilder builder, int id) { builder.addInt(0, id, 0); }
  public static int endPlayerDropItemRequest(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public PlayerDropItemRequest get(int j) { return get(new PlayerDropItemRequest(), j); }
    public PlayerDropItemRequest get(PlayerDropItemRequest obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

