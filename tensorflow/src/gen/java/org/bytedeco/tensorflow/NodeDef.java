// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class NodeDef extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NodeDef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NodeDef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public NodeDef position(long position) {
        return (NodeDef)super.position(position);
    }

  public NodeDef() { super((Pointer)null); allocate(); }
  private native void allocate();

  public NodeDef(@Const @ByRef NodeDef from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef NodeDef from);

  public native @ByRef @Name("operator =") NodeDef put(@Const @ByRef NodeDef from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef NodeDef default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const NodeDef internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(NodeDef other);
  public native void Swap(NodeDef other);
  

  // implements Message ----------------------------------------------

  public native NodeDef New();

  public native NodeDef New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef NodeDef from);
  public native void MergeFrom(@Const @ByRef NodeDef from);
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

  // repeated string input = 3;
  public native int input_size();
  public native void clear_input();
  @MemberGetter public static native int kInputFieldNumber();
  public static final int kInputFieldNumber = kInputFieldNumber();
  public native @StdString BytePointer input(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_input(int index);
  public native void set_input(int index, @StdString BytePointer value);
  public native void set_input(int index, @StdString String value);
  public native void set_input(int index, @Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_input(int index, String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_input();
  public native void add_input(@StdString BytePointer value);
  public native void add_input(@StdString String value);
  public native void add_input(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void add_input(String value, @Cast("size_t") long size);

  // map<string, .tensorflow.AttrValue> attr = 5;
  public native int attr_size();
  public native void clear_attr();
  @MemberGetter public static native int kAttrFieldNumber();
  public static final int kAttrFieldNumber = kAttrFieldNumber();
  public native @Const @ByRef StringAttrValueMap attr();
  public native StringAttrValueMap mutable_attr();

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

  // string op = 2;
  public native void clear_op();
  @MemberGetter public static native int kOpFieldNumber();
  public static final int kOpFieldNumber = kOpFieldNumber();
  public native @StdString BytePointer op();
  public native void set_op(@StdString BytePointer value);
  public native void set_op(@StdString String value);
  public native void set_op(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_op(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_op();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_op();
  public native void set_allocated_op(@StdString @Cast({"char*", "std::string*"}) BytePointer op);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_op();
  public native void unsafe_arena_set_allocated_op(
        @StdString @Cast({"char*", "std::string*"}) BytePointer op);

  // string device = 4;
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

  // .tensorflow.NodeDef.ExperimentalDebugInfo experimental_debug_info = 6;
  public native @Cast("bool") boolean has_experimental_debug_info();
  public native void clear_experimental_debug_info();
  @MemberGetter public static native int kExperimentalDebugInfoFieldNumber();
  public static final int kExperimentalDebugInfoFieldNumber = kExperimentalDebugInfoFieldNumber();
  public native @Const @ByRef NodeDef_ExperimentalDebugInfo experimental_debug_info();
  public native NodeDef_ExperimentalDebugInfo release_experimental_debug_info();
  public native NodeDef_ExperimentalDebugInfo mutable_experimental_debug_info();
  public native void set_allocated_experimental_debug_info(NodeDef_ExperimentalDebugInfo experimental_debug_info);
  public native void unsafe_arena_set_allocated_experimental_debug_info(
        NodeDef_ExperimentalDebugInfo experimental_debug_info);
  public native NodeDef_ExperimentalDebugInfo unsafe_arena_release_experimental_debug_info();
}