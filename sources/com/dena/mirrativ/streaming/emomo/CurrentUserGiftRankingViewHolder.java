package com.dena.mirrativ.streaming.emomo;

import ac.p5;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import androidx.lifecycle.f0;
import androidx.lifecycle.o;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import androidx.recyclerview.widget.s;
import ao.d;
import cc.i;
import com.dena.mirrativ.streaming.emomo.CurrentUserGiftRankingViewHolder;
import io.l;
import jo.h;
import jo.p;
import uo.d2;
import uo.g1;
import uo.q0;
import uo.r0;
import wn.v;

/* loaded from: classes2.dex */
public final class CurrentUserGiftRankingViewHolder extends RecyclerView.e0 {

    /* renamed from: f  reason: collision with root package name */
    public static final a f23088f = new a(null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f23089g = 8;

    /* renamed from: a  reason: collision with root package name */
    public final u f23090a;

    /* renamed from: b  reason: collision with root package name */
    public final p5 f23091b;

    /* renamed from: c  reason: collision with root package name */
    public l<? super String, v> f23092c;

    /* renamed from: d  reason: collision with root package name */
    public d2 f23093d;

    /* renamed from: e  reason: collision with root package name */
    public final s f23094e;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final CurrentUserGiftRankingViewHolder a(u uVar, ViewGroup viewGroup) {
            p.h(uVar, "viewLifecycleOwner");
            p.h(viewGroup, "parent");
            ViewDataBinding e10 = f.e(LayoutInflater.from(viewGroup.getContext()), xb.p.view_holder_current_user_gift_ranking, viewGroup, false);
            p.g(e10, "inflate(\n               …      false\n            )");
            return new CurrentUserGiftRankingViewHolder(uVar, (p5) e10, null);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.CurrentUserGiftRankingViewHolder$bind$2$1", f = "CurrentUserGiftRankingViewHolder.kt", l = {95}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<q0, d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23097w;

        /* renamed from: x  reason: collision with root package name */
        public int f23098x;

        /* renamed from: y  reason: collision with root package name */
        public Object f23099y;

        /* renamed from: z  reason: collision with root package name */
        public int f23100z;

        public b(d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final d<v> create(Object obj, d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003d -> B:13:0x0040). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r7.f23100z
                r2 = 1
                if (r1 == 0) goto L20
                if (r1 != r2) goto L18
                int r1 = r7.f23098x
                int r3 = r7.f23097w
                java.lang.Object r4 = r7.f23099y
                com.dena.mirrativ.streaming.emomo.CurrentUserGiftRankingViewHolder r4 = (com.dena.mirrativ.streaming.emomo.CurrentUserGiftRankingViewHolder) r4
                wn.m.b(r8)
                r8 = r7
                goto L40
            L18:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L20:
                wn.m.b(r8)
                r8 = 2147483647(0x7fffffff, float:NaN)
                com.dena.mirrativ.streaming.emomo.CurrentUserGiftRankingViewHolder r1 = com.dena.mirrativ.streaming.emomo.CurrentUserGiftRankingViewHolder.this
                r3 = 0
                r4 = r1
                r1 = r3
                r3 = r8
                r8 = r7
            L2d:
                if (r1 >= r3) goto L45
                r5 = 10000(0x2710, double:4.9407E-320)
                r8.f23099y = r4
                r8.f23097w = r3
                r8.f23098x = r1
                r8.f23100z = r2
                java.lang.Object r5 = uo.b1.a(r5, r8)
                if (r5 != r0) goto L40
                return r0
            L40:
                com.dena.mirrativ.streaming.emomo.CurrentUserGiftRankingViewHolder.f(r4)
                int r1 = r1 + r2
                goto L2d
            L45:
                wn.v r8 = wn.v.f59242a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.CurrentUserGiftRankingViewHolder.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends r {
        public c(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.r
        public float v(DisplayMetrics displayMetrics) {
            p.h(displayMetrics, "displayMetrics");
            return 250.0f / displayMetrics.densityDpi;
        }
    }

    public CurrentUserGiftRankingViewHolder(u uVar, p5 p5Var) {
        super(p5Var.u());
        this.f23090a = uVar;
        this.f23091b = p5Var;
        s sVar = new s();
        this.f23094e = sVar;
        sVar.b(p5Var.B);
        p5Var.B.setOnTouchListener(cc.d.f19047w);
        p5Var.B.setAdapter(new i());
        uVar.g().a(new androidx.lifecycle.r() { // from class: com.dena.mirrativ.streaming.emomo.CurrentUserGiftRankingViewHolder.2

            /* renamed from: com.dena.mirrativ.streaming.emomo.CurrentUserGiftRankingViewHolder$2$a */
            /* loaded from: classes2.dex */
            public /* synthetic */ class a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f23096a;

                static {
                    int[] iArr = new int[o.b.values().length];
                    iArr[o.b.ON_DESTROY.ordinal()] = 1;
                    f23096a = iArr;
                }
            }

            @Override // androidx.lifecycle.r
            public void i(u uVar2, o.b bVar) {
                d2 d2Var;
                p.h(uVar2, "source");
                p.h(bVar, "event");
                if (a.f23096a[bVar.ordinal()] != 1 || (d2Var = CurrentUserGiftRankingViewHolder.this.f23093d) == null) {
                    return;
                }
                d2.a.a(d2Var, null, 1, null);
            }
        });
    }

    public /* synthetic */ CurrentUserGiftRankingViewHolder(u uVar, p5 p5Var, h hVar) {
        this(uVar, p5Var);
    }

    public static final boolean c(View view, MotionEvent motionEvent) {
        return true;
    }

    public static final void h(CurrentUserGiftRankingViewHolder currentUserGiftRankingViewHolder, Boolean bool) {
        p.h(currentUserGiftRankingViewHolder, "this$0");
        d2 d2Var = currentUserGiftRankingViewHolder.f23093d;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        p.g(bool, "it");
        currentUserGiftRankingViewHolder.f23093d = bool.booleanValue() ? uo.l.d(r0.a(g1.c()), null, null, new b(null), 3, null) : null;
    }

    public final void g(cc.c cVar) {
        p.h(cVar, "bindModel");
        RecyclerView.h adapter = this.f23091b.B.getAdapter();
        i iVar = adapter instanceof i ? (i) adapter : null;
        if (iVar != null) {
            iVar.g(this.f23092c);
            iVar.f(xn.s.m(cVar.a(), cVar.b()));
            RecyclerView.h adapter2 = this.f23091b.B.getAdapter();
            if (adapter2 != null) {
                this.f23091b.B.p1((adapter2.getItemCount() / 2) - 1);
            }
        }
        cVar.c().i(this.f23090a, new f0() { // from class: cc.e
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                CurrentUserGiftRankingViewHolder.h(CurrentUserGiftRankingViewHolder.this, (Boolean) obj);
            }
        });
    }

    public final void i() {
        View h10 = this.f23094e.h(this.f23091b.B.getLayoutManager());
        if (h10 == null) {
            return;
        }
        int g02 = this.f23091b.B.g0(h10);
        if (this.f23091b.B.getAdapter() == null) {
            return;
        }
        int i10 = g02 < Integer.MAX_VALUE ? g02 + 1 : 0;
        c cVar = new c(this.f23091b.u().getContext());
        cVar.p(i10);
        RecyclerView.p layoutManager = this.f23091b.B.getLayoutManager();
        p.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        ((LinearLayoutManager) layoutManager).S1(cVar);
    }

    public final void j(l<? super String, v> lVar) {
        this.f23092c = lVar;
    }
}
