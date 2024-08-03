/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing various implementation-defined properties introduced with VK_KHR_maintenance4.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceMaintenance4Properties} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceMaintenance4Properties {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkDeviceSize {@link #maxBufferSize};
 * }</code></pre>
 */
public class VkPhysicalDeviceMaintenance4Properties extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXBUFFERSIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXBUFFERSIZE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMaintenance4Properties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMaintenance4Properties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** the maximum size {@code VkBuffer} that <b>can</b> be created. */
    @NativeType("VkDeviceSize")
    public long maxBufferSize() { return nmaxBufferSize(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceMaintenance4Properties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES} value to the {@link #sType} field. */
    public VkPhysicalDeviceMaintenance4Properties sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceMaintenance4Properties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMaintenance4Properties set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceMaintenance4Properties set(VkPhysicalDeviceMaintenance4Properties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMaintenance4Properties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMaintenance4Properties malloc() {
        return wrap(VkPhysicalDeviceMaintenance4Properties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance4Properties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMaintenance4Properties calloc() {
        return wrap(VkPhysicalDeviceMaintenance4Properties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance4Properties} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMaintenance4Properties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceMaintenance4Properties.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance4Properties} instance for the specified memory address. */
    public static VkPhysicalDeviceMaintenance4Properties create(long address) {
        return wrap(VkPhysicalDeviceMaintenance4Properties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMaintenance4Properties createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceMaintenance4Properties.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance4Properties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance4Properties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance4Properties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance4Properties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance4Properties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance4Properties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceMaintenance4Properties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance4Properties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMaintenance4Properties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMaintenance4Properties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMaintenance4Properties malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceMaintenance4Properties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMaintenance4Properties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMaintenance4Properties calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceMaintenance4Properties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance4Properties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance4Properties.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance4Properties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance4Properties.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMaintenance4Properties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMaintenance4Properties.PNEXT); }
    /** Unsafe version of {@link #maxBufferSize}. */
    public static long nmaxBufferSize(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceMaintenance4Properties.MAXBUFFERSIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMaintenance4Properties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMaintenance4Properties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMaintenance4Properties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMaintenance4Properties, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMaintenance4Properties ELEMENT_FACTORY = VkPhysicalDeviceMaintenance4Properties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMaintenance4Properties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMaintenance4Properties#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkPhysicalDeviceMaintenance4Properties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceMaintenance4Properties#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMaintenance4Properties.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMaintenance4Properties#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMaintenance4Properties.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMaintenance4Properties#maxBufferSize} field. */
        @NativeType("VkDeviceSize")
        public long maxBufferSize() { return VkPhysicalDeviceMaintenance4Properties.nmaxBufferSize(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceMaintenance4Properties#sType} field. */
        public VkPhysicalDeviceMaintenance4Properties.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMaintenance4Properties.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES} value to the {@link VkPhysicalDeviceMaintenance4Properties#sType} field. */
        public VkPhysicalDeviceMaintenance4Properties.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceMaintenance4Properties#pNext} field. */
        public VkPhysicalDeviceMaintenance4Properties.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMaintenance4Properties.npNext(address(), value); return this; }

    }

}