package hi;

import hi.q8;
import hi.t8;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class t8<MessageType extends t8<MessageType, BuilderType>, BuilderType extends q8<MessageType, BuilderType>> extends e7<MessageType, BuilderType> {
    private static final Map<Object, t8<?, ?>> zza = new ConcurrentHashMap();
    public wa zzc = wa.c();
    public int zzd = -1;

    public static <E> a9<E> f() {
        return fa.f();
    }

    public static <E> a9<E> g(a9<E> a9Var) {
        int size = a9Var.size();
        return a9Var.v(size == 0 ? 10 : size + size);
    }

    public static Object h(Method method, Object obj, Object... objArr) {
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

    public static Object i(w9 w9Var, String str, Object[] objArr) {
        return new ga(w9Var, str, objArr);
    }

    public static <T extends t8> void j(Class<T> cls, T t10) {
        zza.put(cls, t10);
    }

    public static <T extends t8> T m(Class<T> cls) {
        Map<Object, t8<?, ?>> map = zza;
        t8<?, ?> t8Var = map.get(cls);
        if (t8Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t8Var = map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t8Var == null) {
            t8Var = (t8) ((t8) fb.j(cls)).q(6, null, null);
            if (t8Var != null) {
                map.put(cls, t8Var);
            } else {
                throw new IllegalStateException();
            }
        }
        return t8Var;
    }

    public static y8 n() {
        return u8.g();
    }

    public static z8 o() {
        return k9.f();
    }

    public static z8 p(z8 z8Var) {
        int size = z8Var.size();
        return z8Var.i(size == 0 ? 10 : size + size);
    }

    @Override // hi.e7
    public final int a() {
        return this.zzd;
    }

    @Override // hi.x9
    public final /* synthetic */ w9 b() {
        return (t8) q(6, null, null);
    }

    @Override // hi.e7
    public final void d(int i10) {
        this.zzd = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return ea.a().b(getClass()).g(this, (t8) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        if (i10 != 0) {
            return i10;
        }
        int b10 = ea.a().b(getClass()).b(this);
        this.zzb = b10;
        return b10;
    }

    public final <MessageType extends t8<MessageType, BuilderType>, BuilderType extends q8<MessageType, BuilderType>> BuilderType k() {
        return (BuilderType) q(5, null, null);
    }

    public final BuilderType l() {
        BuilderType buildertype = (BuilderType) q(5, null, null);
        buildertype.m(this);
        return buildertype;
    }

    public abstract Object q(int i10, Object obj, Object obj2);

    @Override // hi.w9
    public final void t0(b8 b8Var) throws IOException {
        ea.a().b(getClass()).i(this, c8.l(b8Var));
    }

    public final String toString() {
        return y9.a(this, super.toString());
    }

    @Override // hi.w9
    public final /* synthetic */ v9 u0() {
        q8 q8Var = (q8) q(5, null, null);
        q8Var.m(this);
        return q8Var;
    }

    @Override // hi.w9
    public final /* synthetic */ v9 v0() {
        return (q8) q(5, null, null);
    }

    @Override // hi.w9
    public final int z0() {
        int i10 = this.zzd;
        if (i10 == -1) {
            int a10 = ea.a().b(getClass()).a(this);
            this.zzd = a10;
            return a10;
        }
        return i10;
    }
}
