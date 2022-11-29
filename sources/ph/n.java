package ph;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;

/* loaded from: classes3.dex */
public abstract class n<A extends a.b, ResultT> {

    /* renamed from: a  reason: collision with root package name */
    public final nh.c[] f47528a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f47529b;

    /* renamed from: c  reason: collision with root package name */
    public final int f47530c;

    /* loaded from: classes3.dex */
    public static class a<A extends a.b, ResultT> {

        /* renamed from: a  reason: collision with root package name */
        public l<A, vi.h<ResultT>> f47531a;

        /* renamed from: c  reason: collision with root package name */
        public nh.c[] f47533c;

        /* renamed from: b  reason: collision with root package name */
        public boolean f47532b = true;

        /* renamed from: d  reason: collision with root package name */
        public int f47534d = 0;

        public /* synthetic */ a(v0 v0Var) {
        }

        public n<A, ResultT> a() {
            rh.p.b(this.f47531a != null, "execute parameter required");
            return new u0(this, this.f47533c, this.f47532b, this.f47534d);
        }

        public a<A, ResultT> b(l<A, vi.h<ResultT>> lVar) {
            this.f47531a = lVar;
            return this;
        }

        public a<A, ResultT> c(boolean z10) {
            this.f47532b = z10;
            return this;
        }

        public a<A, ResultT> d(nh.c... cVarArr) {
            this.f47533c = cVarArr;
            return this;
        }

        public a<A, ResultT> e(int i10) {
            this.f47534d = i10;
            return this;
        }
    }

    @Deprecated
    public n() {
        this.f47528a = null;
        this.f47529b = false;
        this.f47530c = 0;
    }

    public n(nh.c[] cVarArr, boolean z10, int i10) {
        this.f47528a = cVarArr;
        boolean z11 = false;
        if (cVarArr != null && z10) {
            z11 = true;
        }
        this.f47529b = z11;
        this.f47530c = i10;
    }

    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        return new a<>(null);
    }

    public abstract void b(A a10, vi.h<ResultT> hVar) throws RemoteException;

    public boolean c() {
        return this.f47529b;
    }

    public final int d() {
        return this.f47530c;
    }

    public final nh.c[] e() {
        return this.f47528a;
    }
}
