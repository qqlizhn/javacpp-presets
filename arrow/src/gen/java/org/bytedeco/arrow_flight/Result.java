// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_flight;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.arrow_flight.*;


/** \brief Opaque result returned after executing an action */
@Namespace("arrow::flight") @Properties(inherit = org.bytedeco.arrow.presets.arrow_flight.class)
public class Result extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Result() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Result(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Result(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Result position(long position) {
        return (Result)super.position(position);
    }

  public native @SharedPtr ArrowBuffer body(); public native Result body(ArrowBuffer setter);
}
