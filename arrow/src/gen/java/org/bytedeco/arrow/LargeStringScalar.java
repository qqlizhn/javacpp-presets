// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class LargeStringScalar extends LargeBinaryScalar {
    static { Loader.load(); }

  
    
      
      
        public LargeStringScalar(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(type); }
        private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);
  
  
    public LargeStringScalar(@SharedPtr ArrowBuffer value,
                        @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(value, type); }
    private native void allocate(@SharedPtr ArrowBuffer value,
                        @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);
  
    public LargeStringScalar(@SharedPtr ArrowBuffer value) { super((Pointer)null); allocate(value); }
    private native void allocate(@SharedPtr ArrowBuffer value);
  
    public LargeStringScalar() { super((Pointer)null); allocate(); }
    private native void allocate();
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LargeStringScalar(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LargeStringScalar(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public LargeStringScalar position(long position) {
        return (LargeStringScalar)super.position(position);
    }

}
