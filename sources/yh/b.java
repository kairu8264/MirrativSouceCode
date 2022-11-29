package yh;

import android.os.IBinder;
import java.lang.reflect.Field;
import rh.p;
import yh.a;

/* loaded from: classes3.dex */
public final class b<T> extends a.AbstractBinderC1060a {

    /* renamed from: w  reason: collision with root package name */
    public final T f62010w;

    public b(T t10) {
        this.f62010w = t10;
    }

    public static <T> a h1(T t10) {
        return new b(t10);
    }

    public static <T> T z0(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f62010w;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 == 1) {
            p.i(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return (T) field.get(asBinder);
                } catch (IllegalAccessException e10) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
                } catch (NullPointerException e11) {
                    throw new IllegalArgumentException("Binder object is null.", e11);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        int length = declaredFields.length;
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("Unexpected number of IObjectWrapper declared fields: ");
        sb2.append(length);
        throw new IllegalArgumentException(sb2.toString());
    }
}
