/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'ChaseEnergyMsg'
 * message type.
 */

public class ChaseEnergyMsg extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 10;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 77;

    /** Create a new ChaseEnergyMsg of size 10. */
    public ChaseEnergyMsg() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new ChaseEnergyMsg of the given data_length. */
    public ChaseEnergyMsg(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new ChaseEnergyMsg with the given data_length
     * and base offset.
     */
    public ChaseEnergyMsg(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new ChaseEnergyMsg using the given byte array
     * as backing store.
     */
    public ChaseEnergyMsg(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new ChaseEnergyMsg using the given byte array
     * as backing store, with the given base offset.
     */
    public ChaseEnergyMsg(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new ChaseEnergyMsg using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public ChaseEnergyMsg(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new ChaseEnergyMsg embedded in the given message
     * at the given base offset.
     */
    public ChaseEnergyMsg(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new ChaseEnergyMsg embedded in the given message
     * at the given base offset and length.
     */
    public ChaseEnergyMsg(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <ChaseEnergyMsg> \n";
      try {
        s += "  [nodeid=0x"+Long.toHexString(get_nodeid())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [clock_time_h=0x"+Long.toHexString(get_clock_time_h())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [clock_time_l=0x"+Long.toHexString(get_clock_time_l())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [dc_time_h=0x"+Long.toHexString(get_dc_time_h())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [dc_time_l=0x"+Long.toHexString(get_dc_time_l())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: nodeid
    //   Field type: int, unsigned
    //   Offset (bits): 0
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'nodeid' is signed (false).
     */
    public static boolean isSigned_nodeid() {
        return false;
    }

    /**
     * Return whether the field 'nodeid' is an array (false).
     */
    public static boolean isArray_nodeid() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'nodeid'
     */
    public static int offset_nodeid() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'nodeid'
     */
    public static int offsetBits_nodeid() {
        return 0;
    }

    /**
     * Return the value (as a int) of the field 'nodeid'
     */
    public int get_nodeid() {
        return (int)getUIntBEElement(offsetBits_nodeid(), 16);
    }

    /**
     * Set the value of the field 'nodeid'
     */
    public void set_nodeid(int value) {
        setUIntBEElement(offsetBits_nodeid(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'nodeid'
     */
    public static int size_nodeid() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'nodeid'
     */
    public static int sizeBits_nodeid() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: clock_time_h
    //   Field type: int, unsigned
    //   Offset (bits): 16
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'clock_time_h' is signed (false).
     */
    public static boolean isSigned_clock_time_h() {
        return false;
    }

    /**
     * Return whether the field 'clock_time_h' is an array (false).
     */
    public static boolean isArray_clock_time_h() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'clock_time_h'
     */
    public static int offset_clock_time_h() {
        return (16 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'clock_time_h'
     */
    public static int offsetBits_clock_time_h() {
        return 16;
    }

    /**
     * Return the value (as a int) of the field 'clock_time_h'
     */
    public int get_clock_time_h() {
        return (int)getUIntBEElement(offsetBits_clock_time_h(), 16);
    }

    /**
     * Set the value of the field 'clock_time_h'
     */
    public void set_clock_time_h(int value) {
        setUIntBEElement(offsetBits_clock_time_h(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'clock_time_h'
     */
    public static int size_clock_time_h() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'clock_time_h'
     */
    public static int sizeBits_clock_time_h() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: clock_time_l
    //   Field type: int, unsigned
    //   Offset (bits): 32
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'clock_time_l' is signed (false).
     */
    public static boolean isSigned_clock_time_l() {
        return false;
    }

    /**
     * Return whether the field 'clock_time_l' is an array (false).
     */
    public static boolean isArray_clock_time_l() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'clock_time_l'
     */
    public static int offset_clock_time_l() {
        return (32 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'clock_time_l'
     */
    public static int offsetBits_clock_time_l() {
        return 32;
    }

    /**
     * Return the value (as a int) of the field 'clock_time_l'
     */
    public int get_clock_time_l() {
        return (int)getUIntBEElement(offsetBits_clock_time_l(), 16);
    }

    /**
     * Set the value of the field 'clock_time_l'
     */
    public void set_clock_time_l(int value) {
        setUIntBEElement(offsetBits_clock_time_l(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'clock_time_l'
     */
    public static int size_clock_time_l() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'clock_time_l'
     */
    public static int sizeBits_clock_time_l() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: dc_time_h
    //   Field type: int, unsigned
    //   Offset (bits): 48
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'dc_time_h' is signed (false).
     */
    public static boolean isSigned_dc_time_h() {
        return false;
    }

    /**
     * Return whether the field 'dc_time_h' is an array (false).
     */
    public static boolean isArray_dc_time_h() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'dc_time_h'
     */
    public static int offset_dc_time_h() {
        return (48 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'dc_time_h'
     */
    public static int offsetBits_dc_time_h() {
        return 48;
    }

    /**
     * Return the value (as a int) of the field 'dc_time_h'
     */
    public int get_dc_time_h() {
        return (int)getUIntBEElement(offsetBits_dc_time_h(), 16);
    }

    /**
     * Set the value of the field 'dc_time_h'
     */
    public void set_dc_time_h(int value) {
        setUIntBEElement(offsetBits_dc_time_h(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'dc_time_h'
     */
    public static int size_dc_time_h() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'dc_time_h'
     */
    public static int sizeBits_dc_time_h() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: dc_time_l
    //   Field type: int, unsigned
    //   Offset (bits): 64
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'dc_time_l' is signed (false).
     */
    public static boolean isSigned_dc_time_l() {
        return false;
    }

    /**
     * Return whether the field 'dc_time_l' is an array (false).
     */
    public static boolean isArray_dc_time_l() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'dc_time_l'
     */
    public static int offset_dc_time_l() {
        return (64 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'dc_time_l'
     */
    public static int offsetBits_dc_time_l() {
        return 64;
    }

    /**
     * Return the value (as a int) of the field 'dc_time_l'
     */
    public int get_dc_time_l() {
        return (int)getUIntBEElement(offsetBits_dc_time_l(), 16);
    }

    /**
     * Set the value of the field 'dc_time_l'
     */
    public void set_dc_time_l(int value) {
        setUIntBEElement(offsetBits_dc_time_l(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'dc_time_l'
     */
    public static int size_dc_time_l() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'dc_time_l'
     */
    public static int sizeBits_dc_time_l() {
        return 16;
    }

}
