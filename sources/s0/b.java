package s0;

import io.p;
import io.r;
import io.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import jo.j0;
import jo.q;
import l0.e1;
import l0.i;
import l0.l1;
import wn.v;

/* loaded from: classes.dex */
public final class b implements s0.a {
    public List<e1> A;

    /* renamed from: w  reason: collision with root package name */
    public final int f51783w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f51784x;

    /* renamed from: y  reason: collision with root package name */
    public Object f51785y;

    /* renamed from: z  reason: collision with root package name */
    public e1 f51786z;

    /* loaded from: classes.dex */
    public static final class a extends q implements p<i, Integer, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Object f51788x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f51789y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, int i10) {
            super(2);
            this.f51788x = obj;
            this.f51789y = i10;
        }

        public final void a(i iVar, int i10) {
            jo.p.h(iVar, "nc");
            b.this.c(this.f51788x, iVar, this.f51789y | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* renamed from: s0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0786b extends q implements p<i, Integer, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Object f51791x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Object f51792y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f51793z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0786b(Object obj, Object obj2, int i10) {
            super(2);
            this.f51791x = obj;
            this.f51792y = obj2;
            this.f51793z = i10;
        }

        public final void a(i iVar, int i10) {
            jo.p.h(iVar, "nc");
            b.this.b(this.f51791x, this.f51792y, iVar, this.f51793z | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements p<i, Integer, v> {
        public final /* synthetic */ int A;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Object f51795x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Object f51796y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ Object f51797z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, Object obj2, Object obj3, int i10) {
            super(2);
            this.f51795x = obj;
            this.f51796y = obj2;
            this.f51797z = obj3;
            this.A = i10;
        }

        public final void a(i iVar, int i10) {
            jo.p.h(iVar, "nc");
            b.this.a(this.f51795x, this.f51796y, this.f51797z, iVar, this.A | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public b(int i10, boolean z10) {
        this.f51783w = i10;
        this.f51784x = z10;
    }

    @Override // io.r
    public /* bridge */ /* synthetic */ Object F(Object obj, Object obj2, i iVar, Integer num) {
        return b(obj, obj2, iVar, num.intValue());
    }

    @Override // io.s
    public /* bridge */ /* synthetic */ Object P0(Object obj, Object obj2, Object obj3, i iVar, Integer num) {
        return a(obj, obj2, obj3, iVar, num.intValue());
    }

    public Object a(Object obj, Object obj2, Object obj3, i iVar, int i10) {
        jo.p.h(iVar, "c");
        i h10 = iVar.h(this.f51783w);
        e(h10);
        int d10 = h10.P(this) ? s0.c.d(3) : s0.c.f(3);
        Object obj4 = this.f51785y;
        Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object P0 = ((s) j0.e(obj4, 5)).P0(obj, obj2, obj3, h10, Integer.valueOf(d10 | i10));
        l1 l10 = h10.l();
        if (l10 != null) {
            l10.a(new c(obj, obj2, obj3, i10));
        }
        return P0;
    }

    public Object b(Object obj, Object obj2, i iVar, int i10) {
        jo.p.h(iVar, "c");
        i h10 = iVar.h(this.f51783w);
        e(h10);
        int d10 = h10.P(this) ? s0.c.d(2) : s0.c.f(2);
        Object obj3 = this.f51785y;
        Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object F = ((r) j0.e(obj3, 4)).F(obj, obj2, h10, Integer.valueOf(d10 | i10));
        l1 l10 = h10.l();
        if (l10 != null) {
            l10.a(new C0786b(obj, obj2, i10));
        }
        return F;
    }

    public Object c(Object obj, i iVar, int i10) {
        jo.p.h(iVar, "c");
        i h10 = iVar.h(this.f51783w);
        e(h10);
        int d10 = h10.P(this) ? s0.c.d(1) : s0.c.f(1);
        Object obj2 = this.f51785y;
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object s02 = ((io.q) j0.e(obj2, 3)).s0(obj, h10, Integer.valueOf(d10 | i10));
        l1 l10 = h10.l();
        if (l10 != null) {
            l10.a(new a(obj, i10));
        }
        return s02;
    }

    public Object d(i iVar, int i10) {
        jo.p.h(iVar, "c");
        i h10 = iVar.h(this.f51783w);
        e(h10);
        int d10 = i10 | (h10.P(this) ? s0.c.d(0) : s0.c.f(0));
        Object obj = this.f51785y;
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((p) j0.e(obj, 2)).invoke(h10, Integer.valueOf(d10));
        l1 l10 = h10.l();
        if (l10 != null) {
            l10.a((p) j0.e(this, 2));
        }
        return invoke;
    }

    public final void e(i iVar) {
        e1 v10;
        if (!this.f51784x || (v10 = iVar.v()) == null) {
            return;
        }
        iVar.F(v10);
        if (s0.c.e(this.f51786z, v10)) {
            this.f51786z = v10;
            return;
        }
        List<e1> list = this.A;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.A = arrayList;
            arrayList.add(v10);
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (s0.c.e(list.get(i10), v10)) {
                list.set(i10, v10);
                return;
            }
        }
        list.add(v10);
    }

    public final void f() {
        if (this.f51784x) {
            e1 e1Var = this.f51786z;
            if (e1Var != null) {
                e1Var.invalidate();
                this.f51786z = null;
            }
            List<e1> list = this.A;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).invalidate();
                }
                list.clear();
            }
        }
    }

    public final void g(Object obj) {
        jo.p.h(obj, "block");
        if (jo.p.c(this.f51785y, obj)) {
            return;
        }
        boolean z10 = this.f51785y == null;
        this.f51785y = obj;
        if (z10) {
            return;
        }
        f();
    }

    @Override // io.p
    public /* bridge */ /* synthetic */ Object invoke(i iVar, Integer num) {
        return d(iVar, num.intValue());
    }

    @Override // io.q
    public /* bridge */ /* synthetic */ Object s0(Object obj, i iVar, Integer num) {
        return c(obj, iVar, num.intValue());
    }
}
