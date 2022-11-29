package k3;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import jo.p;

/* loaded from: classes.dex */
public final class b {
    public static final Bundle a(wn.k<String, ? extends Object>... kVarArr) {
        p.h(kVarArr, "pairs");
        Bundle bundle = new Bundle(kVarArr.length);
        int length = kVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            wn.k<String, ? extends Object> kVar = kVarArr[i10];
            i10++;
            String a10 = kVar.a();
            Object b10 = kVar.b();
            if (b10 == null) {
                bundle.putString(a10, null);
            } else if (b10 instanceof Boolean) {
                bundle.putBoolean(a10, ((Boolean) b10).booleanValue());
            } else if (b10 instanceof Byte) {
                bundle.putByte(a10, ((Number) b10).byteValue());
            } else if (b10 instanceof Character) {
                bundle.putChar(a10, ((Character) b10).charValue());
            } else if (b10 instanceof Double) {
                bundle.putDouble(a10, ((Number) b10).doubleValue());
            } else if (b10 instanceof Float) {
                bundle.putFloat(a10, ((Number) b10).floatValue());
            } else if (b10 instanceof Integer) {
                bundle.putInt(a10, ((Number) b10).intValue());
            } else if (b10 instanceof Long) {
                bundle.putLong(a10, ((Number) b10).longValue());
            } else if (b10 instanceof Short) {
                bundle.putShort(a10, ((Number) b10).shortValue());
            } else if (b10 instanceof Bundle) {
                bundle.putBundle(a10, (Bundle) b10);
            } else if (b10 instanceof CharSequence) {
                bundle.putCharSequence(a10, (CharSequence) b10);
            } else if (b10 instanceof Parcelable) {
                bundle.putParcelable(a10, (Parcelable) b10);
            } else if (b10 instanceof boolean[]) {
                bundle.putBooleanArray(a10, (boolean[]) b10);
            } else if (b10 instanceof byte[]) {
                bundle.putByteArray(a10, (byte[]) b10);
            } else if (b10 instanceof char[]) {
                bundle.putCharArray(a10, (char[]) b10);
            } else if (b10 instanceof double[]) {
                bundle.putDoubleArray(a10, (double[]) b10);
            } else if (b10 instanceof float[]) {
                bundle.putFloatArray(a10, (float[]) b10);
            } else if (b10 instanceof int[]) {
                bundle.putIntArray(a10, (int[]) b10);
            } else if (b10 instanceof long[]) {
                bundle.putLongArray(a10, (long[]) b10);
            } else if (b10 instanceof short[]) {
                bundle.putShortArray(a10, (short[]) b10);
            } else if (b10 instanceof Object[]) {
                Class<?> componentType = b10.getClass().getComponentType();
                p.e(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(a10, (Parcelable[]) b10);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(a10, (String[]) b10);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(a10, (CharSequence[]) b10);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(a10, (Serializable) b10);
                } else {
                    String canonicalName = componentType.getCanonicalName();
                    throw new IllegalArgumentException("Illegal value array type " + ((Object) canonicalName) + " for key \"" + a10 + '\"');
                }
            } else if (b10 instanceof Serializable) {
                bundle.putSerializable(a10, (Serializable) b10);
            } else {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 18 && (b10 instanceof IBinder)) {
                    bundle.putBinder(a10, (IBinder) b10);
                } else if (i11 >= 21 && (b10 instanceof Size)) {
                    bundle.putSize(a10, (Size) b10);
                } else if (i11 >= 21 && (b10 instanceof SizeF)) {
                    bundle.putSizeF(a10, (SizeF) b10);
                } else {
                    String canonicalName2 = b10.getClass().getCanonicalName();
                    throw new IllegalArgumentException("Illegal value type " + ((Object) canonicalName2) + " for key \"" + a10 + '\"');
                }
            }
        }
        return bundle;
    }
}
