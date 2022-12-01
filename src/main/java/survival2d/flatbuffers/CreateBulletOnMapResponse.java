// automatically generated by the FlatBuffers compiler, do not modify

package survival2d.flatbuffers;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class CreateBulletOnMapResponse extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_12_0(); }
  public static CreateBulletOnMapResponse getRootAsCreateBulletOnMapResponse(ByteBuffer _bb) { return getRootAsCreateBulletOnMapResponse(_bb, new CreateBulletOnMapResponse()); }
  public static CreateBulletOnMapResponse getRootAsCreateBulletOnMapResponse(ByteBuffer _bb, CreateBulletOnMapResponse obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public CreateBulletOnMapResponse __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public survival2d.flatbuffers.Bullet bullet() { return bullet(new survival2d.flatbuffers.Bullet()); }
  public survival2d.flatbuffers.Bullet bullet(survival2d.flatbuffers.Bullet obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createCreateBulletOnMapResponse(FlatBufferBuilder builder,
      int bulletOffset) {
    builder.startTable(1);
    CreateBulletOnMapResponse.addBullet(builder, bulletOffset);
    return CreateBulletOnMapResponse.endCreateBulletOnMapResponse(builder);
  }

  public static void startCreateBulletOnMapResponse(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addBullet(FlatBufferBuilder builder, int bulletOffset) { builder.addOffset(0, bulletOffset, 0); }
  public static int endCreateBulletOnMapResponse(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public CreateBulletOnMapResponse get(int j) { return get(new CreateBulletOnMapResponse(), j); }
    public CreateBulletOnMapResponse get(CreateBulletOnMapResponse obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}
