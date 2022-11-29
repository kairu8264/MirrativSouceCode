package nf;

import androidx.lifecycle.LiveData;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import od.d;
import org.greenrobot.eventbus.ThreadMode;
import pd.e;
import uo.g1;
import uo.i2;
import uo.o2;
import uo.r0;

/* loaded from: classes3.dex */
public final class e extends androidx.lifecycle.q0 implements uo.q0 {
    public static final a I = new a(null);
    public static final int J = 8;
    public final androidx.lifecycle.e0<d.a> A;
    public final LiveData<d.a> B;
    public final List<b> C;
    public final androidx.lifecycle.e0<b> D;
    public final LiveData<b> E;
    public final androidx.lifecycle.e0<Boolean> F;
    public final LiveData<Boolean> G;
    public final wo.q<wn.v> H;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f42606y;

    /* renamed from: z  reason: collision with root package name */
    public final ao.g f42607z;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class b {

        /* loaded from: classes3.dex */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f42608a = new a();

            public a() {
                super(null);
            }
        }

        /* renamed from: nf.e$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public enum EnumC0631b {
            BEFORE,
            JUST,
            LATER
        }

        /* loaded from: classes3.dex */
        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            public final int f42609a;

            /* renamed from: b  reason: collision with root package name */
            public final EnumC0631b f42610b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(int i10, EnumC0631b enumC0631b) {
                super(null);
                jo.p.h(enumC0631b, TtmlNode.TAG_SPAN);
                this.f42609a = i10;
                this.f42610b = enumC0631b;
            }

            public final EnumC0631b a() {
                return this.f42610b;
            }

            public final int b() {
                return this.f42609a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    return this.f42609a == cVar.f42609a && this.f42610b == cVar.f42610b;
                }
                return false;
            }

            public int hashCode() {
                return (Integer.hashCode(this.f42609a) * 31) + this.f42610b.hashCode();
            }

            public String toString() {
                return "Year(year=" + this.f42609a + ", span=" + this.f42610b + ')';
            }

            public /* synthetic */ c(int i10, EnumC0631b enumC0631b, int i11, jo.h hVar) {
                this(i10, (i11 & 2) != 0 ? EnumC0631b.JUST : enumC0631b);
            }
        }

        public b() {
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }
    }

    @co.f(c = "com.dena.mirrorman.store.ChooseMyProfileStore$on$1", f = "ChooseMyProfileStore.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42611w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ e.b f42613y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e.b bVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f42613y = bVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f42613y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f42611w == 0) {
                wn.m.b(obj);
                e.this.A.p(this.f42613y.a());
                e.this.F.p(co.b.a((e.this.j().f() == null || jo.p.c(e.this.k().f(), b.a.f42608a)) ? false : true));
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @co.f(c = "com.dena.mirrorman.store.ChooseMyProfileStore$on$2", f = "ChooseMyProfileStore.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42614w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ e.c f42616y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e.c cVar, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f42616y = cVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f42616y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f42614w == 0) {
                wn.m.b(obj);
                e.this.D.p(this.f42616y.a());
                e.this.F.p(co.b.a((e.this.j().f() == null || jo.p.c(e.this.k().f(), b.a.f42608a)) ? false : true));
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @co.f(c = "com.dena.mirrorman.store.ChooseMyProfileStore$on$3", f = "ChooseMyProfileStore.kt", l = {101}, m = "invokeSuspend")
    /* renamed from: nf.e$e  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0632e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42617w;

        public C0632e(ao.d<? super C0632e> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new C0632e(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((C0632e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42617w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.q qVar = e.this.H;
                wn.v vVar = wn.v.f59242a;
                this.f42617w = 1;
                if (qVar.r(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    public e(q8.a aVar) {
        uo.b0 b10;
        jo.p.h(aVar, "dispatcher");
        this.f42606y = aVar;
        aVar.b(this);
        o2 c10 = g1.c();
        b10 = i2.b(null, 1, null);
        this.f42607z = c10.plus(b10);
        androidx.lifecycle.e0<d.a> e0Var = new androidx.lifecycle.e0<>(null);
        this.A = e0Var;
        this.B = e0Var;
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        arrayList.add(new b.c(1940, b.EnumC0631b.BEFORE));
        int i10 = calendar.get(1);
        po.i t10 = po.n.t(1941, i10);
        ArrayList arrayList2 = new ArrayList(xn.t.u(t10, 10));
        Iterator<Integer> it = t10.iterator();
        while (it.hasNext()) {
            arrayList2.add(new b.c(((xn.i0) it).b(), null, 2, null));
        }
        arrayList.addAll(arrayList2);
        arrayList.add(new b.c(i10, null, 2, null));
        calendar.add(1, -23);
        int indexOf = arrayList.indexOf(new b.c(calendar.get(1), null, 2, null));
        if (indexOf != -1) {
            arrayList.add(indexOf, b.a.f42608a);
        }
        this.C = arrayList;
        androidx.lifecycle.e0<b> e0Var2 = new androidx.lifecycle.e0<>(b.a.f42608a);
        this.D = e0Var2;
        this.E = e0Var2;
        androidx.lifecycle.e0<Boolean> e0Var3 = new androidx.lifecycle.e0<>(Boolean.FALSE);
        this.F = e0Var3;
        this.G = e0Var3;
        this.H = new wo.q<>();
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f42606y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f42607z;
    }

    public final LiveData<d.a> j() {
        return this.B;
    }

    public final LiveData<b> k() {
        return this.E;
    }

    public final List<b> l() {
        return this.C;
    }

    public final wo.x<wn.v> m() {
        return this.H.g();
    }

    public final LiveData<Boolean> n() {
        return this.G;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(e.b bVar) {
        jo.p.h(bVar, "event");
        uo.l.d(this, null, null, new c(bVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(e.c cVar) {
        jo.p.h(cVar, "event");
        uo.l.d(this, null, null, new d(cVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(e.a aVar) {
        jo.p.h(aVar, "event");
        uo.l.d(this, null, null, new C0632e(null), 3, null);
    }
}
