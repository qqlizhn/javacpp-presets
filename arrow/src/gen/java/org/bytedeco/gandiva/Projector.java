// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.gandiva;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.gandiva.*;


/** \brief projection using expressions.
 * 
 *  A projector is built for a specific schema and vector of expressions.
 *  Once the projector is built, it can be used to evaluate many row batches. */
@Namespace("gandiva") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.gandiva.class)
public class Projector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Projector(Pointer p) { super(p); }

  // Inline dtor will attempt to resolve the destructor for
  // LLVMGenerator on MSVC, so we compile the dtor in the object code

  /** Build a default projector for the given schema to evaluate
   *  the vector of expressions.
   * 
   *  @param schema [in] schema for the record batches, and the expressions.
   *  @param exprs [in] vector of expressions.
   *  @param projector [out] the returned projector object */
  
  ///
  public static native @ByVal Status Make(@SharedPtr @ByVal Schema schema, @SharedPtr Expression exprs,
                       @SharedPtr Projector projector);

  /** Build a projector for the given schema to evaluate the vector of expressions.
   *  Customize the projector with runtime configuration.
   * 
   *  @param schema [in] schema for the record batches, and the expressions.
   *  @param exprs [in] vector of expressions.
   *  @param configuration [in] run time configuration.
   *  @param projector [out] the returned projector object */
  
  ///
  public static native @ByVal Status Make(@SharedPtr @ByVal Schema schema, @SharedPtr Expression exprs,
                       @SharedPtr Configuration configuration,
                       @SharedPtr Projector projector);

  /** Build a projector for the given schema to evaluate the vector of expressions.
   *  Customize the projector with runtime configuration.
   * 
   *  @param schema [in] schema for the record batches, and the expressions.
   *  @param exprs [in] vector of expressions.
   *  @param selection_vector_mode [in] mode of selection vector
   *  @param configuration [in] run time configuration.
   *  @param projector [out] the returned projector object */
  
  ///
  public static native @ByVal Status Make(@SharedPtr @ByVal Schema schema, @SharedPtr Expression exprs,
                       SelectionVector.Mode selection_vector_mode,
                       @SharedPtr Configuration configuration,
                       @SharedPtr Projector projector);
  public static native @ByVal Status Make(@SharedPtr @ByVal Schema schema, @SharedPtr Expression exprs,
                       @Cast("gandiva::SelectionVector::Mode") int selection_vector_mode,
                       @SharedPtr Configuration configuration,
                       @SharedPtr Projector projector);

  /** Evaluate the specified record batch, and return the allocated and populated output
   *  arrays. The output arrays will be allocated from the memory pool 'pool', and added
   *  to the vector 'output'.
   * 
   *  @param batch [in] the record batch. schema should be the same as the one in 'Make'
   *  @param pool [in] memory pool used to allocate output arrays (if required).
   *  @param output [out] the vector of allocated/populated arrays. */
  
  ///
  public native @ByVal Status Evaluate(@Const @ByRef RecordBatch batch, MemoryPool pool,
                    ArrayVector output);

  /** Evaluate the specified record batch, and populate the output arrays. The output
   *  arrays of sufficient capacity must be allocated by the caller.
   * 
   *  @param batch [in] the record batch. schema should be the same as the one in 'Make'
   *  @param output [in,out] vector of arrays, the arrays are allocated by the caller and
   *                 populated by Evaluate. */
  
  ///
  public native @ByVal Status Evaluate(@Const @ByRef RecordBatch batch, @Const @ByRef ArrayDataVector output);

  /** Evaluate the specified record batch, and return the allocated and populated output
   *  arrays. The output arrays will be allocated from the memory pool 'pool', and added
   *  to the vector 'output'.
   * 
   *  @param batch [in] the record batch. schema should be the same as the one in 'Make'
   *  @param selection_vector [in] selection vector which has filtered row positions.
   *  @param pool [in] memory pool used to allocate output arrays (if required).
   *  @param output [out] the vector of allocated/populated arrays. */
  
  ///
  public native @ByVal Status Evaluate(@Const @ByRef RecordBatch batch,
                    @Const SelectionVector selection_vector, MemoryPool pool,
                    ArrayVector output);

  /** Evaluate the specified record batch, and populate the output arrays at the filtered
   *  positions. The output arrays of sufficient capacity must be allocated by the caller.
   * 
   *  @param batch [in] the record batch. schema should be the same as the one in 'Make'
   *  @param selection_vector [in] selection vector which has the filtered row positions
   *  @param output [in,out] vector of arrays, the arrays are allocated by the caller and
   *                  populated by Evaluate. */
  public native @ByVal Status Evaluate(@Const @ByRef RecordBatch batch,
                    @Const SelectionVector selection_vector, @Const @ByRef ArrayDataVector output);
}
