// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.llvm.global.LLVM.*;

@Name("LLVMOpaqueRelocationIterator") @Opaque @Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMRelocationIteratorRef extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public LLVMRelocationIteratorRef() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LLVMRelocationIteratorRef(Pointer p) { super(p); }
}
