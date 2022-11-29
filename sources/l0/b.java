package l0;

import android.os.Looper;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final wn.f f38961a = wn.g.a(a.f38962w);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<n0> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f38962w = new a();

        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final n0 invoke() {
            return Looper.getMainLooper() != null ? v.f39280w : m1.f39203w;
        }
    }

    public static final <T> v0.r<T> a(T t10, t1<T> t1Var) {
        jo.p.h(t1Var, "policy");
        return new w0(t10, t1Var);
    }
}
