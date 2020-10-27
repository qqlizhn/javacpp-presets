// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief A function may contain multiple variants of a kernel for a given
 *  type combination for different SIMD levels. Based on the active system's
 *  CPU info or the user's preferences, we can elect to use one over the other. */
@Namespace("arrow::compute") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class SimdLevel extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SimdLevel() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SimdLevel(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SimdLevel(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SimdLevel position(long position) {
        return (SimdLevel)super.position(position);
    }
    @Override public SimdLevel getPointer(long i) {
        return new SimdLevel(this).position(position + i);
    }

  public enum type { NONE(0), SSE4_2(1), AVX(2), AVX2(3), AVX512(4), NEON(5), MAX(6);

      public final int value;
      private type(int v) { this.value = v; }
      private type(type e) { this.value = e.value; }
      public type intern() { for (type e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }
}
