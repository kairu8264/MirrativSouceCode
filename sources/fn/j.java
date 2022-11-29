package fn;

import com.google.protobuf.f0;
import com.google.protobuf.g0;
import com.google.protobuf.k0;

/* loaded from: classes4.dex */
public final class j implements w {

    /* renamed from: b  reason: collision with root package name */
    public static final m f32091b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final m f32092a;

    /* loaded from: classes4.dex */
    public static class a implements m {
        @Override // fn.m
        public l a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // fn.m
        public boolean b(Class<?> cls) {
            return false;
        }
    }

    /* loaded from: classes4.dex */
    public static class b implements m {

        /* renamed from: a  reason: collision with root package name */
        public m[] f32093a;

        public b(m... mVarArr) {
            this.f32093a = mVarArr;
        }

        @Override // fn.m
        public l a(Class<?> cls) {
            m[] mVarArr;
            for (m mVar : this.f32093a) {
                if (mVar.b(cls)) {
                    return mVar.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // fn.m
        public boolean b(Class<?> cls) {
            for (m mVar : this.f32093a) {
                if (mVar.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public j() {
        this(b());
    }

    public static m b() {
        return new b(f.c(), c());
    }

    public static m c() {
        try {
            return (m) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f32091b;
        }
    }

    public static boolean d(l lVar) {
        return lVar.c() == s.PROTO2;
    }

    public static <T> v<T> e(Class<T> cls, l lVar) {
        if (com.google.protobuf.r.class.isAssignableFrom(cls)) {
            if (d(lVar)) {
                return f0.N(cls, lVar, p.b(), com.google.protobuf.x.b(), k0.M(), d.b(), k.b());
            }
            return f0.N(cls, lVar, p.b(), com.google.protobuf.x.b(), k0.M(), null, k.b());
        } else if (d(lVar)) {
            return f0.N(cls, lVar, p.a(), com.google.protobuf.x.a(), k0.H(), d.a(), k.a());
        } else {
            return f0.N(cls, lVar, p.a(), com.google.protobuf.x.a(), k0.I(), null, k.a());
        }
    }

    @Override // fn.w
    public <T> v<T> a(Class<T> cls) {
        k0.J(cls);
        l a10 = this.f32092a.a(cls);
        if (a10.a()) {
            if (com.google.protobuf.r.class.isAssignableFrom(cls)) {
                return g0.l(k0.M(), d.b(), a10.b());
            }
            return g0.l(k0.H(), d.a(), a10.b());
        }
        return e(cls, a10);
    }

    public j(m mVar) {
        this.f32092a = (m) com.google.protobuf.t.b(mVar, "messageInfoFactory");
    }
}
