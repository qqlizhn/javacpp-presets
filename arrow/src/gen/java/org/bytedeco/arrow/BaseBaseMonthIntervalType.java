// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Name("arrow::TemporalScalar<arrow::MonthIntervalType>") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BaseBaseMonthIntervalType extends Scalar {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseBaseMonthIntervalType(Pointer p) { super(p); }


  public BaseBaseMonthIntervalType(@Cast("arrow::TemporalScalar<arrow::MonthIntervalType>::ValueType") int value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(value, type); }
  private native void allocate(@Cast("arrow::TemporalScalar<arrow::MonthIntervalType>::ValueType") int value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);
}
