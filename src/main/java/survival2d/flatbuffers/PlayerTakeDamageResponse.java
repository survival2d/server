// automatically generated by the FlatBuffers compiler, do not modify

package survival2d.flatbuffers;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class PlayerTakeDamageResponse extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_12_0(); }
  public static PlayerTakeDamageResponse getRootAsPlayerTakeDamageResponse(ByteBuffer _bb) { return getRootAsPlayerTakeDamageResponse(_bb, new PlayerTakeDamageResponse()); }
  public static PlayerTakeDamageResponse getRootAsPlayerTakeDamageResponse(ByteBuffer _bb, PlayerTakeDamageResponse obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public PlayerTakeDamageResponse __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String username() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer usernameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer usernameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public double remainHp() { int o = __offset(6); return o != 0 ? bb.getDouble(o + bb_pos) : 0.0; }

  public static int createPlayerTakeDamageResponse(FlatBufferBuilder builder,
      int usernameOffset,
      double remainHp) {
    builder.startTable(2);
    PlayerTakeDamageResponse.addRemainHp(builder, remainHp);
    PlayerTakeDamageResponse.addUsername(builder, usernameOffset);
    return PlayerTakeDamageResponse.endPlayerTakeDamageResponse(builder);
  }

  public static void startPlayerTakeDamageResponse(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addUsername(FlatBufferBuilder builder, int usernameOffset) { builder.addOffset(0, usernameOffset, 0); }
  public static void addRemainHp(FlatBufferBuilder builder, double remainHp) { builder.addDouble(1, remainHp, 0.0); }
  public static int endPlayerTakeDamageResponse(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public PlayerTakeDamageResponse get(int j) { return get(new PlayerTakeDamageResponse(), j); }
    public PlayerTakeDamageResponse get(PlayerTakeDamageResponse obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}
