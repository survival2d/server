// automatically generated by the FlatBuffers compiler, do not modify

package survival2d.flatbuffers;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class GunItem extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_12_0(); }
  public static GunItem getRootAsGunItem(ByteBuffer _bb) { return getRootAsGunItem(_bb, new GunItem()); }
  public static GunItem getRootAsGunItem(ByteBuffer _bb, GunItem obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public GunItem __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public byte type() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public int numBullet() { int o = __offset(6); return o != 0 ? bb.getInt(o + bb_pos) : 0; }

  public static int createGunItem(FlatBufferBuilder builder,
      byte type,
      int numBullet) {
    builder.startTable(2);
    GunItem.addNumBullet(builder, numBullet);
    GunItem.addType(builder, type);
    return GunItem.endGunItem(builder);
  }

  public static void startGunItem(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addType(FlatBufferBuilder builder, byte type) { builder.addByte(0, type, 0); }
  public static void addNumBullet(FlatBufferBuilder builder, int numBullet) { builder.addInt(1, numBullet, 0); }
  public static int endGunItem(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public GunItem get(int j) { return get(new GunItem(), j); }
    public GunItem get(GunItem obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

