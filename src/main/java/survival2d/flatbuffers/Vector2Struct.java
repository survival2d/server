// automatically generated by the FlatBuffers compiler, do not modify

package survival2d.flatbuffers;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Vector2Struct extends Struct {
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Vector2Struct __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public float x() { return bb.getFloat(bb_pos + 0); }
  public float y() { return bb.getFloat(bb_pos + 4); }

  public static int createVector2Struct(FlatBufferBuilder builder, float x, float y) {
    builder.prep(4, 8);
    builder.putFloat(y);
    builder.putFloat(x);
    return builder.offset();
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Vector2Struct get(int j) { return get(new Vector2Struct(), j); }
    public Vector2Struct get(Vector2Struct obj, int j) {  return obj.__assign(__element(j), bb); }
  }
}

