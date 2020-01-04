// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.llvm.global.LLVM.*;


/**
 * A remark emitted by the compiler.
 *
 * @since REMARKS_API_VERSION=0
 */
@Name("LLVMRemarkOpaqueEntry") @Opaque @Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMRemarkEntryRef extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public LLVMRemarkEntryRef() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LLVMRemarkEntryRef(Pointer p) { super(p); }
}
