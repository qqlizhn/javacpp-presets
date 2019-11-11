// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


//
// Load Configuration Directory Entry
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_LOAD_CONFIG_DIRECTORY32 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_LOAD_CONFIG_DIRECTORY32() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_LOAD_CONFIG_DIRECTORY32(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_LOAD_CONFIG_DIRECTORY32(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_LOAD_CONFIG_DIRECTORY32 position(long position) {
        return (IMAGE_LOAD_CONFIG_DIRECTORY32)super.position(position);
    }

    public native @Cast("DWORD") int Size(); public native IMAGE_LOAD_CONFIG_DIRECTORY32 Size(int setter);
    public native @Cast("DWORD") int TimeDateStamp(); public native IMAGE_LOAD_CONFIG_DIRECTORY32 TimeDateStamp(int setter);
    public native @Cast("WORD") short MajorVersion(); public native IMAGE_LOAD_CONFIG_DIRECTORY32 MajorVersion(short setter);
    public native @Cast("WORD") short MinorVersion(); public native IMAGE_LOAD_CONFIG_DIRECTORY32 MinorVersion(short setter);
    public native @Cast("DWORD") int GlobalFlagsClear(); public native IMAGE_LOAD_CONFIG_DIRECTORY32 GlobalFlagsClear(int setter);
    public native @Cast("DWORD") int GlobalFlagsSet(); public native IMAGE_LOAD_CONFIG_DIRECTORY32 GlobalFlagsSet(int setter);
    public native @Cast("DWORD") int CriticalSectionDefaultTimeout(); public native IMAGE_LOAD_CONFIG_DIRECTORY32 CriticalSectionDefaultTimeout(int setter);
    public native @Cast("DWORD") int DeCommitFreeBlockThreshold(); public native IMAGE_LOAD_CONFIG_DIRECTORY32 DeCommitFreeBlockThreshold(int setter);
    public native @Cast("DWORD") int DeCommitTotalFreeThreshold(); public native IMAGE_LOAD_CONFIG_DIRECTORY32 DeCommitTotalFreeThreshold(int setter);
    public native @Cast("DWORD") int LockPrefixTable(); public native IMAGE_LOAD_CONFIG_DIRECTORY32 LockPrefixTable(int setter);                // VA
    public native @Cast("DWORD") int MaximumAllocationSize(); public native IMAGE_LOAD_CONFIG_DIRECTORY32 MaximumAllocationSize(int setter);
    public native @Cast("DWORD") int VirtualMemoryThreshold(); public native IMAGE_LOAD_CONFIG_DIRECTORY32 VirtualMemoryThreshold(int setter);
    public native @Cast("DWORD") int ProcessHeapFlags(); public native IMAGE_LOAD_CONFIG_DIRECTORY32 ProcessHeapFlags(int setter);
    public native @Cast("DWORD") int ProcessAffinityMask(); public native IMAGE_LOAD_CONFIG_DIRECTORY32 ProcessAffinityMask(int setter);
    public native @Cast("WORD") short CSDVersion(); public native IMAGE_LOAD_CONFIG_DIRECTORY32 CSDVersion(short setter);
    public native @Cast("WORD") short Reserved1(); public native IMAGE_LOAD_CONFIG_DIRECTORY32 Reserved1(short setter);
    public native @Cast("DWORD") int EditList(); public native IMAGE_LOAD_CONFIG_DIRECTORY32 EditList(int setter);                       // VA
    public native @Cast("DWORD") int SecurityCookie(); public native IMAGE_LOAD_CONFIG_DIRECTORY32 SecurityCookie(int setter);                 // VA
    public native @Cast("DWORD") int SEHandlerTable(); public native IMAGE_LOAD_CONFIG_DIRECTORY32 SEHandlerTable(int setter);                 // VA
    public native @Cast("DWORD") int SEHandlerCount(); public native IMAGE_LOAD_CONFIG_DIRECTORY32 SEHandlerCount(int setter);
    public native @Cast("DWORD") int GuardCFCheckFunctionPointer(); public native IMAGE_LOAD_CONFIG_DIRECTORY32 GuardCFCheckFunctionPointer(int setter);    // VA
    public native @Cast("DWORD") int Reserved2(); public native IMAGE_LOAD_CONFIG_DIRECTORY32 Reserved2(int setter);
    public native @Cast("DWORD") int GuardCFFunctionTable(); public native IMAGE_LOAD_CONFIG_DIRECTORY32 GuardCFFunctionTable(int setter);           // VA
    public native @Cast("DWORD") int GuardCFFunctionCount(); public native IMAGE_LOAD_CONFIG_DIRECTORY32 GuardCFFunctionCount(int setter);
    public native @Cast("DWORD") int GuardFlags(); public native IMAGE_LOAD_CONFIG_DIRECTORY32 GuardFlags(int setter);
}