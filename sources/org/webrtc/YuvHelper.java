package org.webrtc;

import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class YuvHelper {
    public static void I420Copy(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, int i14) {
        int i15 = (i13 + 1) / 2;
        int i16 = i13 * i14;
        int i17 = ((i14 + 1) / 2) * i15;
        int i18 = (i17 * 2) + i16;
        if (byteBuffer4.capacity() >= i18) {
            byteBuffer4.position(0);
            ByteBuffer slice = byteBuffer4.slice();
            byteBuffer4.position(i16);
            ByteBuffer slice2 = byteBuffer4.slice();
            byteBuffer4.position(i17 + i16);
            nativeI420Copy(byteBuffer, i10, byteBuffer2, i11, byteBuffer3, i12, slice, i13, slice2, i15, byteBuffer4.slice(), i15, i13, i14);
            return;
        }
        throw new IllegalArgumentException("Expected destination buffer capacity to be at least " + i18 + " was " + byteBuffer4.capacity());
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, int i14, int i15) {
        int i16 = i15 % 180;
        int i17 = i16 == 0 ? i13 : i14;
        int i18 = i16 == 0 ? i14 : i13;
        int i19 = (i17 + 1) / 2;
        int i20 = i18 * i17;
        int i21 = ((i18 + 1) / 2) * i19;
        int i22 = (i21 * 2) + i20;
        if (byteBuffer4.capacity() >= i22) {
            byteBuffer4.position(0);
            ByteBuffer slice = byteBuffer4.slice();
            byteBuffer4.position(i20);
            ByteBuffer slice2 = byteBuffer4.slice();
            byteBuffer4.position(i21 + i20);
            nativeI420Rotate(byteBuffer, i10, byteBuffer2, i11, byteBuffer3, i12, slice, i17, slice2, i19, byteBuffer4.slice(), i19, i13, i14, i15);
            return;
        }
        throw new IllegalArgumentException("Expected destination buffer capacity to be at least " + i22 + " was " + byteBuffer4.capacity());
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, int i14) {
        int i15 = (i13 + 1) / 2;
        int i16 = i13 * i14;
        int i17 = (((i14 + 1) / 2) * i15 * 2) + i16;
        if (byteBuffer4.capacity() >= i17) {
            byteBuffer4.position(0);
            ByteBuffer slice = byteBuffer4.slice();
            byteBuffer4.position(i16);
            nativeI420ToNV12(byteBuffer, i10, byteBuffer2, i11, byteBuffer3, i12, slice, i13, byteBuffer4.slice(), i15 * 2, i13, i14);
            return;
        }
        throw new IllegalArgumentException("Expected destination buffer capacity to be at least " + i17 + " was " + byteBuffer4.capacity());
    }

    public static void copyPlane(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, int i12, int i13) {
        nativeCopyPlane(byteBuffer, i10, byteBuffer2, i11, i12, i13);
    }

    private static native void nativeCopyPlane(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, int i12, int i13);

    private static native void nativeI420Copy(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, ByteBuffer byteBuffer5, int i14, ByteBuffer byteBuffer6, int i15, int i16, int i17);

    private static native void nativeI420Rotate(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, ByteBuffer byteBuffer5, int i14, ByteBuffer byteBuffer6, int i15, int i16, int i17, int i18);

    private static native void nativeI420ToNV12(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, ByteBuffer byteBuffer5, int i14, int i15, int i16);

    public static void I420ToNV12(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, ByteBuffer byteBuffer5, int i14, int i15, int i16) {
        nativeI420ToNV12(byteBuffer, i10, byteBuffer2, i11, byteBuffer3, i12, byteBuffer4, i13, byteBuffer5, i14, i15, i16);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, ByteBuffer byteBuffer5, int i14, ByteBuffer byteBuffer6, int i15, int i16, int i17) {
        nativeI420Copy(byteBuffer, i10, byteBuffer2, i11, byteBuffer3, i12, byteBuffer4, i13, byteBuffer5, i14, byteBuffer6, i15, i16, i17);
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, ByteBuffer byteBuffer5, int i14, ByteBuffer byteBuffer6, int i15, int i16, int i17, int i18) {
        nativeI420Rotate(byteBuffer, i10, byteBuffer2, i11, byteBuffer3, i12, byteBuffer4, i13, byteBuffer5, i14, byteBuffer6, i15, i16, i17, i18);
    }
}
