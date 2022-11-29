package com.dena.mirrativ.catalog;

import ae.w8;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y;
import ao.d;
import co.f;
import co.l;
import com.dena.mirrorman.customview.PageControl;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import de.n;
import io.p;
import java.util.List;
import jo.h;
import r8.g;
import r8.h0;
import r8.i;
import r8.m0;
import uo.b0;
import uo.b1;
import uo.d2;
import uo.g1;
import uo.i2;
import uo.q0;
import uo.r0;
import wn.m;
import wn.v;
import xn.a0;

/* loaded from: classes.dex */
public final class CarouselView extends FrameLayout {
    public static final a D = new a(null);
    public static final int E = 8;
    public boolean A;
    public i B;
    public g C;

    /* renamed from: w  reason: collision with root package name */
    public final w8 f20376w;

    /* renamed from: x  reason: collision with root package name */
    public d2 f20377x;

    /* renamed from: y  reason: collision with root package name */
    public int f20378y;

    /* renamed from: z  reason: collision with root package name */
    public int f20379z;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    @f(c = "com.dena.mirrativ.catalog.CarouselView$autoScrollToNextItem$1", f = "CarouselView.kt", l = {145}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends l implements p<q0, d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20380w;

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

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f20380w;
            if (i10 == 0) {
                m.b(obj);
                this.f20380w = 1;
                if (b1.a(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            CarouselView.this.k(true);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ RecyclerView f20384w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ CarouselView f20385x;

        public c(RecyclerView recyclerView, CarouselView carouselView) {
            this.f20384w = recyclerView;
            this.f20385x = carouselView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f20384w.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f20385x.k(false);
            this.f20385x.h();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b0 b10;
        jo.p.h(context, "context");
        w8 T = w8.T(LayoutInflater.from(getContext()), this, true);
        jo.p.g(T, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.f20376w = T;
        b10 = i2.b(null, 1, null);
        this.f20377x = b10;
        this.f20378y = -1;
        this.f20379z = -1;
        RecyclerView recyclerView = T.C;
        new y().b(recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(T.u().getContext(), 0, false));
        jo.p.g(recyclerView, "");
        recyclerView.g(new p001if.c(n.b(recyclerView, 24), n.b(recyclerView, 12), n.b(recyclerView, 6), n.b(recyclerView, 12), n.b(recyclerView, 6), 0));
        recyclerView.k(new r8.b(this));
    }

    public final void h() {
        d2 d10;
        d2.a.a(this.f20377x, null, 1, null);
        d10 = uo.l.d(r0.a(g1.c()), null, null, new b(null), 3, null);
        this.f20377x = d10;
    }

    public final void i(List<? extends s8.a> list, i iVar, r8.c cVar, m0 m0Var, h0 h0Var, u uVar) {
        jo.p.h(list, "items");
        jo.p.h(uVar, "lifecycleOwner");
        this.A = false;
        this.B = iVar;
        g gVar = new g(uVar);
        gVar.g(list);
        gVar.d(cVar);
        gVar.h(h0Var);
        gVar.f(m0Var);
        this.C = gVar;
        uVar.g().a(new r() { // from class: com.dena.mirrativ.catalog.CarouselView$bind$2

            /* loaded from: classes.dex */
            public /* synthetic */ class a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f20383a;

                static {
                    int[] iArr = new int[o.b.values().length];
                    iArr[o.b.ON_PAUSE.ordinal()] = 1;
                    iArr[o.b.ON_RESUME.ordinal()] = 2;
                    f20383a = iArr;
                }
            }

            @Override // androidx.lifecycle.r
            public void i(u uVar2, o.b bVar) {
                d2 d2Var;
                jo.p.h(uVar2, "source");
                jo.p.h(bVar, "event");
                int i10 = a.f20383a[bVar.ordinal()];
                if (i10 == 1) {
                    d2Var = CarouselView.this.f20377x;
                    d2.a.a(d2Var, null, 1, null);
                } else if (i10 != 2) {
                } else {
                    CarouselView.this.h();
                }
            }
        });
        RecyclerView recyclerView = this.f20376w.C;
        g gVar2 = this.C;
        g gVar3 = null;
        if (gVar2 == null) {
            jo.p.v("carouselAdapter");
            gVar2 = null;
        }
        recyclerView.setAdapter(gVar2);
        g gVar4 = this.C;
        if (gVar4 == null) {
            jo.p.v("carouselAdapter");
        } else {
            gVar3 = gVar4;
        }
        int a10 = gVar3.a();
        RecyclerView.p layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.G1(a10);
        }
        this.f20379z = a10 - 1;
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new c(recyclerView, this));
        l(0);
    }

    public final void j(int i10) {
        g gVar = this.C;
        if (gVar == null) {
            jo.p.v("carouselAdapter");
            gVar = null;
        }
        s8.a aVar = (s8.a) a0.a0(gVar.b(), i10);
        if (aVar == null || this.f20378y == i10) {
            return;
        }
        i iVar = this.B;
        if (iVar != null) {
            iVar.a(aVar);
        }
        this.f20378y = i10;
    }

    public final void k(boolean z10) {
        if (this.A) {
            return;
        }
        RecyclerView.p layoutManager = this.f20376w.C.getLayoutManager();
        g gVar = null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || linearLayoutManager.j0() == 0) {
            return;
        }
        this.f20379z++;
        if (z10) {
            linearLayoutManager.R1(this.f20376w.C, new RecyclerView.b0(), this.f20379z);
            return;
        }
        g gVar2 = this.C;
        if (gVar2 == null) {
            jo.p.v("carouselAdapter");
        } else {
            gVar = gVar2;
        }
        int c10 = gVar.c(this.f20379z);
        l(c10);
        j(c10);
        linearLayoutManager.G1(this.f20379z);
    }

    public final void l(int i10) {
        PageControl pageControl = this.f20376w.B;
        g gVar = this.C;
        if (gVar == null) {
            jo.p.v("carouselAdapter");
            gVar = null;
        }
        pageControl.a(i10, gVar.b().size());
    }
}
