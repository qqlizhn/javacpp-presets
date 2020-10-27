// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow::io") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BufferedOutputStream extends OutputStream {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BufferedOutputStream(Pointer p) { super(p); }


  /** \brief Create a buffered output stream wrapping the given output stream.
   *  @param buffer_size [in] the size of the temporary write buffer
   *  @param pool [in] a MemoryPool to use for allocations
   *  @param raw [in] another OutputStream
   *  @return the created BufferedOutputStream */
  public static native @ByVal BufferedOutputStreamResult Create(
        @Cast("int64_t") long buffer_size, MemoryPool pool, @SharedPtr OutputStream raw);

  /** \brief Resize internal buffer
   *  @param new_buffer_size [in] the new buffer size
   *  @return Status */
  public native @ByVal Status SetBufferSize(@Cast("int64_t") long new_buffer_size);

  /** \brief Return the current size of the internal buffer */
  public native @Cast("int64_t") long buffer_size();

  /** \brief Return the number of remaining bytes that have not been flushed to
   *  the raw OutputStream */
  public native @Cast("int64_t") long bytes_buffered();

  /** \brief Flush any buffered writes and release the raw
   *  OutputStream. Further operations on this object are invalid
   *  @return the underlying OutputStream */
  public native @ByVal OutputStreamResult Detach();

  // OutputStream interface

  /** \brief Close the buffered output stream.  This implicitly closes the
   *  underlying raw output stream. */
  public native @ByVal Status Close();
  public native @ByVal Status Abort();
  public native @Cast("bool") boolean closed();

  public native @ByVal LongResult Tell();
  // Write bytes to the stream. Thread-safe
  public native @ByVal Status Write(@Const Pointer data, @Cast("int64_t") long nbytes);
  public native @ByVal Status Write(@SharedPtr ArrowBuffer data);

  public native @ByVal Status Flush();

  /** \brief Return the underlying raw output stream. */
  public native @SharedPtr OutputStream raw();
}
