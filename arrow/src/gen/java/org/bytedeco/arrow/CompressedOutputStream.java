// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.arrow.global.arrow.*;
  // namespace util

@Namespace("arrow::io") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class CompressedOutputStream extends OutputStream {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CompressedOutputStream(Pointer p) { super(p); }


  /** \brief Create a compressed output stream wrapping the given output stream. */
  public static native @ByVal CompressedOutputStreamResult Make(
        Codec codec, @SharedPtr OutputStream raw,
        MemoryPool pool/*=arrow::default_memory_pool()*/);
  public static native @ByVal CompressedOutputStreamResult Make(
        Codec codec, @SharedPtr OutputStream raw);

  public static native @Deprecated @ByVal Status Make(Codec codec, @SharedPtr OutputStream raw,
                       @SharedPtr CompressedOutputStream out);
  public static native @Deprecated @ByVal Status Make(MemoryPool pool, Codec codec,
                       @SharedPtr OutputStream raw,
                       @SharedPtr CompressedOutputStream out);

  // OutputStream interface

  /** \brief Close the compressed output stream.  This implicitly closes the
   *  underlying raw output stream. */
  public native @ByVal Status Close();
  public native @ByVal Status Abort();
  public native @Cast("bool") boolean closed();

  public native @ByVal LongResult Tell();

  public native @ByVal Status Write(@Const Pointer data, @Cast("int64_t") long nbytes);
  /** \cond FALSE */
  /** \endcond */
  public native @ByVal Status Flush();

  /** \brief Return the underlying raw output stream. */
  public native @SharedPtr OutputStream raw();
}
