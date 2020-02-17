// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.arrow.global.arrow.*;


/** Concrete Array class for variable-size string (utf-8) data */
@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class StringArray extends BinaryArray {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringArray(Pointer p) { super(p); }


  public StringArray(@SharedPtr @Cast({"", "std::shared_ptr<arrow::ArrayData>"}) ArrayData data) { super((Pointer)null); allocate(data); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::ArrayData>"}) ArrayData data);

  public StringArray(@Cast("int64_t") long length, @SharedPtr ArrowBuffer value_offsets,
                @SharedPtr ArrowBuffer data,
                @SharedPtr ArrowBuffer null_bitmap/*=nullptr*/,
                @Cast("int64_t") long null_count/*=arrow::kUnknownNullCount*/, @Cast("int64_t") long offset/*=0*/) { super((Pointer)null); allocate(length, value_offsets, data, null_bitmap, null_count, offset); }
  private native void allocate(@Cast("int64_t") long length, @SharedPtr ArrowBuffer value_offsets,
                @SharedPtr ArrowBuffer data,
                @SharedPtr ArrowBuffer null_bitmap/*=nullptr*/,
                @Cast("int64_t") long null_count/*=arrow::kUnknownNullCount*/, @Cast("int64_t") long offset/*=0*/);
  public StringArray(@Cast("int64_t") long length, @SharedPtr ArrowBuffer value_offsets,
                @SharedPtr ArrowBuffer data) { super((Pointer)null); allocate(length, value_offsets, data); }
  private native void allocate(@Cast("int64_t") long length, @SharedPtr ArrowBuffer value_offsets,
                @SharedPtr ArrowBuffer data);
}
