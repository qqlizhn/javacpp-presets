// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class CostGraphDef_Node extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CostGraphDef_Node(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CostGraphDef_Node(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CostGraphDef_Node position(long position) {
        return (CostGraphDef_Node)super.position(position);
    }

  public CostGraphDef_Node() { super((Pointer)null); allocate(); }
  private native void allocate();

  public CostGraphDef_Node(@Const @ByRef CostGraphDef_Node from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef CostGraphDef_Node from);

  public native @ByRef @Name("operator =") CostGraphDef_Node put(@Const @ByRef CostGraphDef_Node from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef CostGraphDef_Node default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const CostGraphDef_Node internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(CostGraphDef_Node other);
  public native void Swap(CostGraphDef_Node other);
  

  // implements Message ----------------------------------------------

  public native CostGraphDef_Node New();

  public native CostGraphDef_Node New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef CostGraphDef_Node from);
  public native void MergeFrom(@Const @ByRef CostGraphDef_Node from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // repeated .tensorflow.CostGraphDef.Node.InputInfo input_info = 4;
  public native int input_info_size();
  public native void clear_input_info();
  @MemberGetter public static native int kInputInfoFieldNumber();
  public static final int kInputInfoFieldNumber = kInputInfoFieldNumber();
  public native CostGraphDef_Node_InputInfo mutable_input_info(int index);
  public native @Const @ByRef CostGraphDef_Node_InputInfo input_info(int index);
  public native CostGraphDef_Node_InputInfo add_input_info();

  // repeated .tensorflow.CostGraphDef.Node.OutputInfo output_info = 5;
  public native int output_info_size();
  public native void clear_output_info();
  @MemberGetter public static native int kOutputInfoFieldNumber();
  public static final int kOutputInfoFieldNumber = kOutputInfoFieldNumber();
  public native CostGraphDef_Node_OutputInfo mutable_output_info(int index);
  public native @Const @ByRef CostGraphDef_Node_OutputInfo output_info(int index);
  public native CostGraphDef_Node_OutputInfo add_output_info();

  // repeated int32 control_input = 8;
  public native int control_input_size();
  public native void clear_control_input();
  @MemberGetter public static native int kControlInputFieldNumber();
  public static final int kControlInputFieldNumber = kControlInputFieldNumber();
  public native @Cast("google::protobuf::int32") int control_input(int index);
  public native void set_control_input(int index, @Cast("google::protobuf::int32") int value);
  public native void add_control_input(@Cast("google::protobuf::int32") int value);

  // string name = 1;
  public native void clear_name();
  @MemberGetter public static native int kNameFieldNumber();
  public static final int kNameFieldNumber = kNameFieldNumber();
  public native @StdString BytePointer name();
  public native void set_name(@StdString BytePointer value);
  public native void set_name(@StdString String value);
  public native void set_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_name();
  public native void set_allocated_name(@StdString @Cast({"char*", "std::string*"}) BytePointer name);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_name();
  public native void unsafe_arena_set_allocated_name(
        @StdString @Cast({"char*", "std::string*"}) BytePointer name);

  // string device = 2;
  public native void clear_device();
  @MemberGetter public static native int kDeviceFieldNumber();
  public static final int kDeviceFieldNumber = kDeviceFieldNumber();
  public native @StdString BytePointer device();
  public native void set_device(@StdString BytePointer value);
  public native void set_device(@StdString String value);
  public native void set_device(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_device(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_device();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_device();
  public native void set_allocated_device(@StdString @Cast({"char*", "std::string*"}) BytePointer device);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_device();
  public native void unsafe_arena_set_allocated_device(
        @StdString @Cast({"char*", "std::string*"}) BytePointer device);

  // int64 temporary_memory_size = 6;
  public native void clear_temporary_memory_size();
  @MemberGetter public static native int kTemporaryMemorySizeFieldNumber();
  public static final int kTemporaryMemorySizeFieldNumber = kTemporaryMemorySizeFieldNumber();
  public native @Cast("google::protobuf::int64") long temporary_memory_size();
  public native void set_temporary_memory_size(@Cast("google::protobuf::int64") long value);

  // int64 compute_cost = 9;
  public native void clear_compute_cost();
  @MemberGetter public static native int kComputeCostFieldNumber();
  public static final int kComputeCostFieldNumber = kComputeCostFieldNumber();
  public native @Cast("google::protobuf::int64") long compute_cost();
  public native void set_compute_cost(@Cast("google::protobuf::int64") long value);

  // int32 id = 3;
  public native void clear_id();
  @MemberGetter public static native int kIdFieldNumber();
  public static final int kIdFieldNumber = kIdFieldNumber();
  public native @Cast("google::protobuf::int32") int id();
  public native void set_id(@Cast("google::protobuf::int32") int value);

  // bool is_final = 7;
  public native void clear_is_final();
  @MemberGetter public static native int kIsFinalFieldNumber();
  public static final int kIsFinalFieldNumber = kIsFinalFieldNumber();
  public native @Cast("bool") boolean is_final();
  public native void set_is_final(@Cast("bool") boolean value);

  // bool inaccurate = 17;
  public native void clear_inaccurate();
  @MemberGetter public static native int kInaccurateFieldNumber();
  public static final int kInaccurateFieldNumber = kInaccurateFieldNumber();
  public native @Cast("bool") boolean inaccurate();
  public native void set_inaccurate(@Cast("bool") boolean value);

  // int64 host_temp_memory_size = 10 [deprecated = true];
  public native @Deprecated void clear_host_temp_memory_size();
  @MemberGetter public static native @Deprecated int kHostTempMemorySizeFieldNumber();
  public static final int kHostTempMemorySizeFieldNumber = kHostTempMemorySizeFieldNumber();
  public native @Cast("google::protobuf::int64") @Deprecated long host_temp_memory_size();
  public native @Deprecated void set_host_temp_memory_size(@Cast("google::protobuf::int64") long value);

  // int64 device_temp_memory_size = 11 [deprecated = true];
  public native @Deprecated void clear_device_temp_memory_size();
  @MemberGetter public static native @Deprecated int kDeviceTempMemorySizeFieldNumber();
  public static final int kDeviceTempMemorySizeFieldNumber = kDeviceTempMemorySizeFieldNumber();
  public native @Cast("google::protobuf::int64") @Deprecated long device_temp_memory_size();
  public native @Deprecated void set_device_temp_memory_size(@Cast("google::protobuf::int64") long value);

  // int64 persistent_memory_size = 12;
  public native void clear_persistent_memory_size();
  @MemberGetter public static native int kPersistentMemorySizeFieldNumber();
  public static final int kPersistentMemorySizeFieldNumber = kPersistentMemorySizeFieldNumber();
  public native @Cast("google::protobuf::int64") long persistent_memory_size();
  public native void set_persistent_memory_size(@Cast("google::protobuf::int64") long value);

  // int64 compute_time = 14;
  public native void clear_compute_time();
  @MemberGetter public static native int kComputeTimeFieldNumber();
  public static final int kComputeTimeFieldNumber = kComputeTimeFieldNumber();
  public native @Cast("google::protobuf::int64") long compute_time();
  public native void set_compute_time(@Cast("google::protobuf::int64") long value);

  // int64 memory_time = 15;
  public native void clear_memory_time();
  @MemberGetter public static native int kMemoryTimeFieldNumber();
  public static final int kMemoryTimeFieldNumber = kMemoryTimeFieldNumber();
  public native @Cast("google::protobuf::int64") long memory_time();
  public native void set_memory_time(@Cast("google::protobuf::int64") long value);

  // int64 device_persistent_memory_size = 16 [deprecated = true];
  public native @Deprecated void clear_device_persistent_memory_size();
  @MemberGetter public static native @Deprecated int kDevicePersistentMemorySizeFieldNumber();
  public static final int kDevicePersistentMemorySizeFieldNumber = kDevicePersistentMemorySizeFieldNumber();
  public native @Cast("google::protobuf::int64") @Deprecated long device_persistent_memory_size();
  public native @Deprecated void set_device_persistent_memory_size(@Cast("google::protobuf::int64") long value);
}