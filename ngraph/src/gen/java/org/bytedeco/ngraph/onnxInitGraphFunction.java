// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Allocator;
import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;

@Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class onnxInitGraphFunction extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    onnxInitGraphFunction(Pointer p) { super(p); }
    protected onnxInitGraphFunction() { allocate(); }
    private native void allocate();
    public native @Cast("onnxStatus") int call(
    onnxBackend backend,
    @Cast("const uint64_t*") IntPointer auxPropertiesList,
    @Cast("size_t") long onnxModelSize,
    @Const Pointer onnxModel,
    @Cast("uint32_t") int weightsCount,
    @Const onnxTensorDescriptorV1 weightDescriptors,
    @ByPtrPtr onnxGraph graph);
}