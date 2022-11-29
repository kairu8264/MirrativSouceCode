package p000do;

import com.google.android.exoplayer2.C;
import fo.a;
import jo.p;
import so.o;

/* renamed from: do.b  reason: invalid package */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f29744a;

    static {
        a aVar;
        Object newInstance;
        Object newInstance2;
        int a10 = a();
        if (a10 >= 65544 || a10 < 65536) {
            try {
                newInstance = a.class.newInstance();
                p.g(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
            } catch (ClassNotFoundException unused) {
                Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                p.g(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    if (newInstance3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    aVar = (a) newInstance3;
                } catch (ClassCastException e10) {
                    ClassLoader classLoader = newInstance3.getClass().getClassLoader();
                    ClassLoader classLoader2 = a.class.getClassLoader();
                    if (p.c(classLoader, classLoader2)) {
                        throw e10;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e10);
                }
            }
            try {
                if (newInstance == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                }
                aVar = (a) newInstance;
                f29744a = aVar;
            } catch (ClassCastException e11) {
                ClassLoader classLoader3 = newInstance.getClass().getClassLoader();
                ClassLoader classLoader4 = a.class.getClassLoader();
                if (p.c(classLoader3, classLoader4)) {
                    throw e11;
                }
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e11);
            }
        }
        if (a10 >= 65543 || a10 < 65536) {
            try {
                try {
                    newInstance2 = eo.a.class.newInstance();
                    p.g(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                    } catch (ClassCastException e12) {
                        ClassLoader classLoader5 = newInstance2.getClass().getClassLoader();
                        ClassLoader classLoader6 = a.class.getClassLoader();
                        if (p.c(classLoader5, classLoader6)) {
                            throw e12;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e12);
                    }
                } catch (ClassNotFoundException unused2) {
                }
            } catch (ClassNotFoundException unused3) {
                Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                p.g(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    if (newInstance4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    aVar = (a) newInstance4;
                } catch (ClassCastException e13) {
                    ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                    ClassLoader classLoader8 = a.class.getClassLoader();
                    if (p.c(classLoader7, classLoader8)) {
                        throw e13;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e13);
                }
            }
            if (newInstance2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            }
            aVar = (a) newInstance2;
            f29744a = aVar;
        }
        aVar = new a();
        f29744a = aVar;
    }

    public static final int a() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        int T = o.T(property, '.', 0, false, 6, null);
        if (T < 0) {
            try {
                return Integer.parseInt(property) * C.DEFAULT_BUFFER_SEGMENT_SIZE;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        }
        int i10 = T + 1;
        int T2 = o.T(property, '.', i10, false, 4, null);
        if (T2 < 0) {
            T2 = property.length();
        }
        String substring = property.substring(0, T);
        p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = property.substring(i10, T2);
        p.g(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        try {
            return (Integer.parseInt(substring) * C.DEFAULT_BUFFER_SEGMENT_SIZE) + Integer.parseInt(substring2);
        } catch (NumberFormatException unused2) {
            return 65542;
        }
    }
}
