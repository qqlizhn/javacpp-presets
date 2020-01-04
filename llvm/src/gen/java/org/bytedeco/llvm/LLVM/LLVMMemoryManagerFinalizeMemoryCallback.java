// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.llvm.global.LLVM.*;

@Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMMemoryManagerFinalizeMemoryCallback extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    LLVMMemoryManagerFinalizeMemoryCallback(Pointer p) { super(p); }
    protected LLVMMemoryManagerFinalizeMemoryCallback() { allocate(); }
    private native void allocate();
    public native @Cast("LLVMBool") int call(
  Pointer Opaque, @Cast("char**") @ByPtrPtr BytePointer ErrMsg);
}
