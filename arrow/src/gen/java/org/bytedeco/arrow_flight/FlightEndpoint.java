// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_flight;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.arrow_flight.*;


/** \brief A flight ticket and list of locations where the ticket can be
 *  redeemed */
@Namespace("arrow::flight") @Properties(inherit = org.bytedeco.arrow.presets.arrow_flight.class)
public class FlightEndpoint extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FlightEndpoint() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FlightEndpoint(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FlightEndpoint(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FlightEndpoint position(long position) {
        return (FlightEndpoint)super.position(position);
    }
    @Override public FlightEndpoint getPointer(long i) {
        return new FlightEndpoint(this).position(position + i);
    }

  /** Opaque ticket identify; use with DoGet RPC */
  public native @ByRef Ticket ticket(); public native FlightEndpoint ticket(Ticket setter);

  /** List of locations where ticket can be redeemed. If the list is empty, the
   *  ticket can only be redeemed on the current service where the ticket was
   *  generated */
  public native @StdVector Location locations(); public native FlightEndpoint locations(Location setter);

  public native @Cast("bool") boolean Equals(@Const @ByRef FlightEndpoint other);

  
  
}
