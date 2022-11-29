package ai;

import ai.ni3;
import ai.ri3;
import com.google.android.gms.internal.ads.zzggm;
import com.google.android.gms.internal.ads.zzgin;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class ri3<MessageType extends ri3<MessageType, BuilderType>, BuilderType extends ni3<MessageType, BuilderType>> extends xg3<MessageType, BuilderType> {
    private static final Map<Object, ri3<?, ?>> zzb = new ConcurrentHashMap();
    public el3 zzc = el3.a();
    public int zzd = -1;

    public static <T extends ri3<T, ?>> T i(T t10) throws zzggm {
        if (t10 == null || t10.v()) {
            return t10;
        }
        zzggm zzggmVar = new zzggm(new zzgin(t10).getMessage());
        zzggmVar.a(t10);
        throw zzggmVar;
    }

    public static Object j(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static wi3 k() {
        return si3.f();
    }

    public static wi3 l(wi3 wi3Var) {
        int size = wi3Var.size();
        return wi3Var.E(size == 0 ? 10 : size + size);
    }

    public static zi3 m() {
        return lj3.f();
    }

    public static <E> aj3<E> n() {
        return gk3.f();
    }

    public static <E> aj3<E> o(aj3<E> aj3Var) {
        int size = aj3Var.size();
        return aj3Var.i(size == 0 ? 10 : size + size);
    }

    public static <T extends ri3<T, ?>> T p(T t10, byte[] bArr, int i10, int i11, di3 di3Var) throws zzggm {
        T t11 = (T) t10.A(4, null, null);
        try {
            ok3 b10 = fk3.a().b(t11.getClass());
            b10.i(t11, bArr, 0, i11, new ah3(di3Var));
            b10.e(t11);
            if (t11.zza == 0) {
                return t11;
            }
            throw new RuntimeException();
        } catch (zzggm e10) {
            e = e10;
            if (e.c()) {
                e = new zzggm(e);
            }
            e.a(t11);
            throw e;
        } catch (IOException e11) {
            if (e11.getCause() instanceof zzggm) {
                throw ((zzggm) e11.getCause());
            }
            zzggm zzggmVar = new zzggm(e11);
            zzggmVar.a(t11);
            throw zzggmVar;
        } catch (IndexOutOfBoundsException unused) {
            zzggm d10 = zzggm.d();
            d10.a(t11);
            throw d10;
        }
    }

    public static <T extends ri3<T, ?>> T q(T t10, oh3 oh3Var) throws zzggm {
        di3 a10 = di3.a();
        try {
            uh3 J = oh3Var.J();
            T t11 = (T) t10.A(4, null, null);
            try {
                ok3 b10 = fk3.a().b(t11.getClass());
                b10.k(t11, vh3.T(J), a10);
                b10.e(t11);
                try {
                    J.h(0);
                    i(t11);
                    i(t11);
                    return t11;
                } catch (zzggm e10) {
                    e10.a(t11);
                    throw e10;
                }
            } catch (zzggm e11) {
                e = e11;
                if (e.c()) {
                    e = new zzggm(e);
                }
                e.a(t11);
                throw e;
            } catch (IOException e12) {
                if (e12.getCause() instanceof zzggm) {
                    throw ((zzggm) e12.getCause());
                }
                zzggm zzggmVar = new zzggm(e12);
                zzggmVar.a(t11);
                throw zzggmVar;
            } catch (RuntimeException e13) {
                if (e13.getCause() instanceof zzggm) {
                    throw ((zzggm) e13.getCause());
                }
                throw e13;
            }
        } catch (zzggm e14) {
            throw e14;
        }
    }

    public static <T extends ri3<T, ?>> T r(T t10, oh3 oh3Var, di3 di3Var) throws zzggm {
        try {
            uh3 J = oh3Var.J();
            T t11 = (T) t10.A(4, null, null);
            try {
                try {
                    ok3 b10 = fk3.a().b(t11.getClass());
                    b10.k(t11, vh3.T(J), di3Var);
                    b10.e(t11);
                    try {
                        J.h(0);
                        i(t11);
                        return t11;
                    } catch (zzggm e10) {
                        e10.a(t11);
                        throw e10;
                    }
                } catch (zzggm e11) {
                    e = e11;
                    if (e.c()) {
                        e = new zzggm(e);
                    }
                    e.a(t11);
                    throw e;
                } catch (IOException e12) {
                    if (e12.getCause() instanceof zzggm) {
                        throw ((zzggm) e12.getCause());
                    }
                    zzggm zzggmVar = new zzggm(e12);
                    zzggmVar.a(t11);
                    throw zzggmVar;
                }
            } catch (RuntimeException e13) {
                if (e13.getCause() instanceof zzggm) {
                    throw ((zzggm) e13.getCause());
                }
                throw e13;
            }
        } catch (zzggm e14) {
            throw e14;
        }
    }

    public static <T extends ri3<T, ?>> T s(T t10, byte[] bArr) throws zzggm {
        T t11 = (T) p(t10, bArr, 0, bArr.length, di3.a());
        i(t11);
        return t11;
    }

    public static <T extends ri3<T, ?>> T t(T t10, byte[] bArr, di3 di3Var) throws zzggm {
        T t11 = (T) p(t10, bArr, 0, bArr.length, di3Var);
        i(t11);
        return t11;
    }

    public static <T extends ri3> T x(Class<T> cls) {
        Map<Object, ri3<?, ?>> map = zzb;
        ri3<?, ?> ri3Var = map.get(cls);
        if (ri3Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                ri3Var = map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (ri3Var == null) {
            ri3Var = (ri3) ((ri3) nl3.k(cls)).A(6, null, null);
            if (ri3Var != null) {
                map.put(cls, ri3Var);
            } else {
                throw new IllegalStateException();
            }
        }
        return ri3Var;
    }

    public static <T extends ri3> void y(Class<T> cls, T t10) {
        zzb.put(cls, t10);
    }

    public static Object z(xj3 xj3Var, String str, Object[] objArr) {
        return new hk3(xj3Var, str, objArr);
    }

    public abstract Object A(int i10, Object obj, Object obj2);

    @Override // ai.xg3
    public final int a() {
        return this.zzd;
    }

    @Override // ai.xj3
    public final int b() {
        int i10 = this.zzd;
        if (i10 == -1) {
            int g10 = fk3.a().b(getClass()).g(this);
            this.zzd = g10;
            return g10;
        }
        return i10;
    }

    @Override // ai.xj3
    public final /* bridge */ /* synthetic */ wj3 c() {
        ni3 ni3Var = (ni3) A(5, null, null);
        ni3Var.o(this);
        return ni3Var;
    }

    @Override // ai.xg3
    public final void d(int i10) {
        this.zzd = i10;
    }

    @Override // ai.xj3
    public final /* bridge */ /* synthetic */ wj3 e() {
        return (ni3) A(5, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return fk3.a().b(getClass()).m(this, (ri3) obj);
        }
        return false;
    }

    @Override // ai.xj3
    public final void f(yh3 yh3Var) throws IOException {
        fk3.a().b(getClass()).f(this, zh3.l(yh3Var));
    }

    @Override // ai.yj3
    public final /* bridge */ /* synthetic */ xj3 g() {
        return (ri3) A(6, null, null);
    }

    public final int hashCode() {
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int h10 = fk3.a().b(getClass()).h(this);
        this.zza = h10;
        return h10;
    }

    public final String toString() {
        return zj3.a(this, super.toString());
    }

    public final <MessageType extends ri3<MessageType, BuilderType>, BuilderType extends ni3<MessageType, BuilderType>> BuilderType u() {
        return (BuilderType) A(5, null, null);
    }

    public final boolean v() {
        byte byteValue = ((Byte) A(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean l10 = fk3.a().b(getClass()).l(this);
        A(2, true != l10 ? null : this, null);
        return l10;
    }

    public final BuilderType w() {
        BuilderType buildertype = (BuilderType) A(5, null, null);
        buildertype.o(this);
        return buildertype;
    }
}
