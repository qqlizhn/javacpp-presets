// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.artoolkitplus;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.artoolkitplus.global.ARToolKitPlus.*;

// #endif

//static bool _isBitSet(_64bits bn, int which_bit);
//static void _setBit(_64bits &bn, int which_bit);
/*
 static void _clearBit(_64bits &bn, int which_bit);
 static void _copyBit(_64bits &dest_n, const int dest_bit, const _64bits src_n, const int src_bit);
 static int _countOnes(const _64bits src_n);
 */

//static int* toBitPattern(int b[], _64bits n, int n_bits);
//static _64bits fromBitPattern(int b[], int n_bits);

// static void printBitPattern(_64bits n, int n_bits);


@Namespace("ARToolKitPlus") @NoOffset @Properties(inherit = org.bytedeco.artoolkitplus.presets.ARToolKitPlus.class)
public class BCH extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BCH(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BCH(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BCH position(long position) {
        return (BCH)super.position(position);
    }

    public BCH() { super((Pointer)null); allocate(); }
    private native void allocate();

    public native void encode(IntPointer encoded_bits, @Cast("const ARToolKitPlus::_64bits") long orig_n);
    public native void encode(IntBuffer encoded_bits, @Cast("const ARToolKitPlus::_64bits") long orig_n);
    public native void encode(int[] encoded_bits, @Cast("const ARToolKitPlus::_64bits") long orig_n);
    public native @Cast("bool") boolean decode(@ByRef IntPointer err_n, @Cast("ARToolKitPlus::_64bits*") @ByRef LongPointer orig_n, @Const IntPointer encoded_bits);
    public native @Cast("bool") boolean decode(@ByRef IntBuffer err_n, @Cast("ARToolKitPlus::_64bits*") @ByRef LongBuffer orig_n, @Const IntBuffer encoded_bits);
    public native @Cast("bool") boolean decode(@ByRef int[] err_n, @Cast("ARToolKitPlus::_64bits*") @ByRef long[] orig_n, @Const int[] encoded_bits);

    public native void encode(@Cast("ARToolKitPlus::_64bits*") @ByRef LongPointer encoded_n, @Cast("const ARToolKitPlus::_64bits") long orig_n);
    public native void encode(@Cast("ARToolKitPlus::_64bits*") @ByRef LongBuffer encoded_n, @Cast("const ARToolKitPlus::_64bits") long orig_n);
    public native void encode(@Cast("ARToolKitPlus::_64bits*") @ByRef long[] encoded_n, @Cast("const ARToolKitPlus::_64bits") long orig_n);
    public native @Cast("bool") boolean decode(@ByRef IntPointer err_n, @Cast("ARToolKitPlus::_64bits*") @ByRef LongPointer orig_n, @Cast("const ARToolKitPlus::_64bits") long encoded_n);
    public native @Cast("bool") boolean decode(@ByRef IntBuffer err_n, @Cast("ARToolKitPlus::_64bits*") @ByRef LongBuffer orig_n, @Cast("const ARToolKitPlus::_64bits") long encoded_n);
    public native @Cast("bool") boolean decode(@ByRef int[] err_n, @Cast("ARToolKitPlus::_64bits*") @ByRef long[] orig_n, @Cast("const ARToolKitPlus::_64bits") long encoded_n);
}