// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.arrow.global.arrow.*;


/** Concrete Array class for list data */
@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class ListArray extends BaseListArray {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ListArray(Pointer p) { super(p); }

  public ListArray(@SharedPtr @Cast({"", "std::shared_ptr<arrow::ArrayData>"}) ArrayData data) { super((Pointer)null); allocate(data); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::ArrayData>"}) ArrayData data);

  
  ///
  ///
  public ListArray(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
              @SharedPtr ArrowBuffer value_offsets,
              @SharedPtr @Cast({"", "std::shared_ptr<arrow::Array>"}) Array values,
              @SharedPtr ArrowBuffer null_bitmap/*=nullptr*/,
              @Cast("int64_t") long null_count/*=arrow::kUnknownNullCount*/, @Cast("int64_t") long offset/*=0*/) { super((Pointer)null); allocate(type, length, value_offsets, values, null_bitmap, null_count, offset); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
              @SharedPtr ArrowBuffer value_offsets,
              @SharedPtr @Cast({"", "std::shared_ptr<arrow::Array>"}) Array values,
              @SharedPtr ArrowBuffer null_bitmap/*=nullptr*/,
              @Cast("int64_t") long null_count/*=arrow::kUnknownNullCount*/, @Cast("int64_t") long offset/*=0*/);
  public ListArray(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
              @SharedPtr ArrowBuffer value_offsets,
              @SharedPtr @Cast({"", "std::shared_ptr<arrow::Array>"}) Array values) { super((Pointer)null); allocate(type, length, value_offsets, values); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
              @SharedPtr ArrowBuffer value_offsets,
              @SharedPtr @Cast({"", "std::shared_ptr<arrow::Array>"}) Array values);

  /** \brief Construct ListArray from array of offsets and child value array
   * 
   *  This function does the bare minimum of validation of the offsets and
   *  input types, and will allocate a new offsets array if necessary (i.e. if
   *  the offsets contain any nulls). If the offsets do not have nulls, they
   *  are assumed to be well-formed
   * 
   *  @param offsets [in] Array containing n + 1 offsets encoding length and
   *  size. Must be of int32 type
   *  @param values [in] Array containing list values
   *  @param pool [in] MemoryPool in case new offsets array needs to be
   *  allocated because of null values
   *  @param out [out] Will have length equal to offsets.length() - 1 */
  
  ///
  public static native @ByVal Status FromArrays(@Const @ByRef Array offsets, @Const @ByRef Array values, MemoryPool pool,
                             @SharedPtr Array out);

  /** \brief Return an Array that is a concatenation of the lists in this array.
   * 
   *  Note that it's different from {@code values()} in that it takes into
   *  consideration of this array's offsets as well as null elements backed
   *  by non-empty lists (they are skipped, thus copying may be needed). */
  public native @ByVal ArrayResult Flatten(
        MemoryPool memory_pool/*=arrow::default_memory_pool()*/);
  public native @ByVal ArrayResult Flatten();
}
