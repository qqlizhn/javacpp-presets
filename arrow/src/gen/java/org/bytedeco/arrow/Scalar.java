// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Base class for scalar values, representing a single value occupying
 *  an array "slot" */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class Scalar extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Scalar(Pointer p) { super(p); }


  /** \brief The type of the scalar value */
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type(); public native Scalar type(DataType setter);

  /** \brief Whether the value is valid (not null) or not */
  public native @Cast("bool") boolean is_valid(); public native Scalar is_valid(boolean setter);

  public native @Cast("bool") boolean Equals(@Const @ByRef Scalar other);

  public native @StdString String ToString();

  // TODO(bkietz) add compute::CastOptions
  public native @ByVal ScalarResult CastTo(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType to);
}
