// automatically generated by the FlatBuffers compiler, do not modify

package survival2d.flatbuffers;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class JoinTeamRequest extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_12_0(); }
  public static JoinTeamRequest getRootAsJoinTeamRequest(ByteBuffer _bb) { return getRootAsJoinTeamRequest(_bb, new JoinTeamRequest()); }
  public static JoinTeamRequest getRootAsJoinTeamRequest(ByteBuffer _bb, JoinTeamRequest obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public JoinTeamRequest __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int teamId() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }

  public static int createJoinTeamRequest(FlatBufferBuilder builder,
      int teamId) {
    builder.startTable(1);
    JoinTeamRequest.addTeamId(builder, teamId);
    return JoinTeamRequest.endJoinTeamRequest(builder);
  }

  public static void startJoinTeamRequest(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addTeamId(FlatBufferBuilder builder, int teamId) { builder.addInt(0, teamId, 0); }
  public static int endJoinTeamRequest(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public JoinTeamRequest get(int j) { return get(new JoinTeamRequest(), j); }
    public JoinTeamRequest get(JoinTeamRequest obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

