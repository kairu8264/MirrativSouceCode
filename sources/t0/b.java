package t0;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.f0;
import androidx.lifecycle.u;
import io.l;
import jo.p;
import jo.q;
import l0.a0;
import l0.c0;
import l0.c2;
import l0.i;
import l0.s0;
import l0.z;
import l0.z1;
import t0.b;

/* loaded from: classes.dex */
public final class b {

    /* loaded from: classes.dex */
    public static final class a extends q implements l<a0, z> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ LiveData<T> f53014w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ u f53015x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ s0<R> f53016y;

        /* renamed from: t0.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0818a implements z {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ LiveData f53017a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ f0 f53018b;

            public C0818a(LiveData liveData, f0 f0Var) {
                this.f53017a = liveData;
                this.f53018b = f0Var;
            }

            @Override // l0.z
            public void dispose() {
                this.f53017a.n(this.f53018b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LiveData<T> liveData, u uVar, s0<R> s0Var) {
            super(1);
            this.f53014w = liveData;
            this.f53015x = uVar;
            this.f53016y = s0Var;
        }

        public static final void c(s0 s0Var, Object obj) {
            p.h(s0Var, "$state");
            s0Var.setValue(obj);
        }

        @Override // io.l
        /* renamed from: b */
        public final z invoke(a0 a0Var) {
            p.h(a0Var, "$this$DisposableEffect");
            final s0<R> s0Var = this.f53016y;
            f0 f0Var = new f0() { // from class: t0.a
                @Override // androidx.lifecycle.f0
                public final void d(Object obj) {
                    b.a.c(s0.this, obj);
                }
            };
            this.f53014w.i(this.f53015x, f0Var);
            return new C0818a(this.f53014w, f0Var);
        }
    }

    public static final <R, T extends R> c2<R> a(LiveData<T> liveData, R r10, i iVar, int i10) {
        p.h(liveData, "<this>");
        iVar.x(-2027639486);
        u uVar = (u) iVar.G(androidx.compose.ui.platform.z.i());
        iVar.x(-3687241);
        Object y10 = iVar.y();
        if (y10 == i.f39065a.a()) {
            y10 = z1.e(r10, null, 2, null);
            iVar.q(y10);
        }
        iVar.O();
        s0 s0Var = (s0) y10;
        c0.b(liveData, uVar, new a(liveData, uVar, s0Var), iVar, 72);
        iVar.O();
        return s0Var;
    }

    public static final <T> c2<T> b(LiveData<T> liveData, i iVar, int i10) {
        p.h(liveData, "<this>");
        iVar.x(-2027640062);
        c2<T> a10 = a(liveData, liveData.f(), iVar, 8);
        iVar.O();
        return a10;
    }
}
