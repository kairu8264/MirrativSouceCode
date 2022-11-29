package cn;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* loaded from: classes4.dex */
public final class c extends b {

    /* renamed from: d  reason: collision with root package name */
    public static Class f20009d;

    /* renamed from: b  reason: collision with root package name */
    public final Object f20010b = d();

    /* renamed from: c  reason: collision with root package name */
    public final Field f20011c = c();

    public static Field c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object d() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f20009d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // cn.b
    public void b(AccessibleObject accessibleObject) {
        if (e(accessibleObject)) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e10) {
            throw new JsonIOException("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e10);
        }
    }

    public boolean e(AccessibleObject accessibleObject) {
        if (this.f20010b != null && this.f20011c != null) {
            try {
                f20009d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f20010b, accessibleObject, Long.valueOf(((Long) f20009d.getMethod("objectFieldOffset", Field.class).invoke(this.f20010b, this.f20011c)).longValue()), Boolean.TRUE);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
