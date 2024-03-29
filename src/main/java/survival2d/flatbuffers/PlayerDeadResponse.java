// automatically generated by the FlatBuffers compiler, do not modify

package survival2d.flatbuffers;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class PlayerDeadResponse extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_12_0(); }
  public static PlayerDeadResponse getRootAsPlayerDeadResponse(ByteBuffer _bb) { return getRootAsPlayerDeadResponse(_bb, new PlayerDeadResponse()); }
  public static PlayerDeadResponse getRootAsPlayerDeadResponse(ByteBuffer _bb, PlayerDeadResponse obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public PlayerDeadResponse __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int playerId() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }

  public static int createPlayerDeadResponse(FlatBufferBuilder builder,
      int playerId) {
    builder.startTable(1);
    PlayerDeadResponse.addPlayerId(builder, playerId);
    return PlayerDeadResponse.endPlayerDeadResponse(builder);
  }

  public static void startPlayerDeadResponse(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addPlayerId(FlatBufferBuilder builder, int playerId) { builder.addInt(0, playerId, 0); }
  public static int endPlayerDeadResponse(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public PlayerDeadResponse get(int j) { return get(new PlayerDeadResponse(), j); }
    public PlayerDeadResponse get(PlayerDeadResponse obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

