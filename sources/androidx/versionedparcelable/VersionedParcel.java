package androidx.versionedparcelable;

import android.os.Parcelable;
import i5.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import s.a;

/* loaded from: classes.dex */
public abstract class VersionedParcel {

    /* renamed from: a  reason: collision with root package name */
    public final a<String, Method> f16456a;

    /* renamed from: b  reason: collision with root package name */
    public final a<String, Method> f16457b;

    /* renamed from: c  reason: collision with root package name */
    public final a<String, Class> f16458c;

    /* loaded from: classes.dex */
    public static class ParcelException extends RuntimeException {
    }

    public VersionedParcel(a<String, Method> aVar, a<String, Method> aVar2, a<String, Class> aVar3) {
        this.f16456a = aVar;
        this.f16457b = aVar2;
        this.f16458c = aVar3;
    }

    public abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i10) {
        w(i10);
        A(bArr);
    }

    public abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int i10) {
        w(i10);
        C(charSequence);
    }

    public abstract void E(int i10);

    public void F(int i10, int i11) {
        w(i11);
        E(i10);
    }

    public abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int i10) {
        w(i10);
        G(parcelable);
    }

    public abstract void I(String str);

    public void J(String str, int i10) {
        w(i10);
        I(str);
    }

    public <T extends c> void K(T t10, VersionedParcel versionedParcel) {
        try {
            e(t10.getClass()).invoke(null, t10, versionedParcel);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    public void L(c cVar) {
        if (cVar == null) {
            I(null);
            return;
        }
        N(cVar);
        VersionedParcel b10 = b();
        K(cVar, b10);
        b10.a();
    }

    public void M(c cVar, int i10) {
        w(i10);
        L(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N(c cVar) {
        try {
            I(c(cVar.getClass()).getName());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e10);
        }
    }

    public abstract void a();

    public abstract VersionedParcel b();

    public final Class c(Class<? extends c> cls) throws ClassNotFoundException {
        Class cls2 = this.f16458c.get(cls.getName());
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.f16458c.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method d(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f16456a.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
            this.f16456a.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public final Method e(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f16457b.get(cls.getName());
        if (method == null) {
            Class c10 = c(cls);
            System.currentTimeMillis();
            Method declaredMethod = c10.getDeclaredMethod("write", cls, VersionedParcel.class);
            this.f16457b.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public boolean h(boolean z10, int i10) {
        return !m(i10) ? z10 : g();
    }

    public abstract byte[] i();

    public byte[] j(byte[] bArr, int i10) {
        return !m(i10) ? bArr : i();
    }

    public abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int i10) {
        return !m(i10) ? charSequence : k();
    }

    public abstract boolean m(int i10);

    public <T extends c> T n(String str, VersionedParcel versionedParcel) {
        try {
            return (T) d(str).invoke(null, versionedParcel);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    public abstract int o();

    public int p(int i10, int i11) {
        return !m(i11) ? i10 : o();
    }

    public abstract <T extends Parcelable> T q();

    public <T extends Parcelable> T r(T t10, int i10) {
        return !m(i10) ? t10 : (T) q();
    }

    public abstract String s();

    public String t(String str, int i10) {
        return !m(i10) ? str : s();
    }

    public <T extends c> T u() {
        String s10 = s();
        if (s10 == null) {
            return null;
        }
        return (T) n(s10, b());
    }

    public <T extends c> T v(T t10, int i10) {
        return !m(i10) ? t10 : (T) u();
    }

    public abstract void w(int i10);

    public void x(boolean z10, boolean z11) {
    }

    public abstract void y(boolean z10);

    public void z(boolean z10, int i10) {
        w(i10);
        y(z10);
    }
}
