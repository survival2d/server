// automatically generated by the FlatBuffers compiler, do not modify

package survival2d.flatbuffers;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FindMatchRequest extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_12_0(); }
  public static FindMatchRequest getRootAsFindMatchRequest(ByteBuffer _bb) { return getRootAsFindMatchRequest(_bb, new FindMatchRequest()); }
  public static FindMatchRequest getRootAsFindMatchRequest(ByteBuffer _bb, FindMatchRequest obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public FindMatchRequest __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }


  public static void startFindMatchRequest(FlatBufferBuilder builder) { builder.startTable(0); }
  public static int endFindMatchRequest(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public FindMatchRequest get(int j) { return get(new FindMatchRequest(), j); }
    public FindMatchRequest get(FindMatchRequest obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

