// automatically generated by the FlatBuffers compiler, do not modify

package survival2d.flatbuffers;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class MedKitItemTable extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_12_0(); }
  public static MedKitItemTable getRootAsMedKitItemTable(ByteBuffer _bb) { return getRootAsMedKitItemTable(_bb, new MedKitItemTable()); }
  public static MedKitItemTable getRootAsMedKitItemTable(ByteBuffer _bb, MedKitItemTable obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public MedKitItemTable __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }


  public static void startMedKitItemTable(FlatBufferBuilder builder) { builder.startTable(0); }
  public static int endMedKitItemTable(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public MedKitItemTable get(int j) { return get(new MedKitItemTable(), j); }
    public MedKitItemTable get(MedKitItemTable obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}
