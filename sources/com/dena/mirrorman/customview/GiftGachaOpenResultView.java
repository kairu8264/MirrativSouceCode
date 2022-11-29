package com.dena.mirrorman.customview;

import ae.qa;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaItem;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaUser;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaUserBasic;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftItemEffectType;
import com.dena.mirrorman.net.api.response.GiftGachaStockType;
import io.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jo.c0;
import jo.q;
import nd.x0;
import rd.b0;
import rd.c1;
import rd.w;
import rd.x;
import rd.z;
import ud.h0;
import ud.i0;
import ud.j0;
import ud.l0;
import ud.q0;
import uo.b1;
import uo.b3;
import uo.g1;
import uo.q0;
import uo.r0;
import wn.v;
import xn.a0;
import xn.r;
import yd.t;
import yd.u;

/* loaded from: classes2.dex */
public final class GiftGachaOpenResultView extends FrameLayout implements q0 {
    public static final a F = new a(null);
    public static final int G = 8;
    public final int A;
    public final int B;
    public final t C;
    public final List<po.i> D;
    public u E;

    /* renamed from: w  reason: collision with root package name */
    public final ao.g f25367w;

    /* renamed from: x  reason: collision with root package name */
    public final qa f25368x;

    /* renamed from: y  reason: collision with root package name */
    public final int f25369y;

    /* renamed from: z  reason: collision with root package name */
    public final int f25370z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f25371a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f25372b;

        static {
            int[] iArr = new int[GiftGachaStockType.values().length];
            iArr[GiftGachaStockType.STREAMER_RARE4.ordinal()] = 1;
            iArr[GiftGachaStockType.VIEWER_RARE4.ordinal()] = 2;
            f25371a = iArr;
            int[] iArr2 = new int[GiftItemEffectType.values().length];
            iArr2[GiftItemEffectType.EMOMO_QUEST.ordinal()] = 1;
            f25372b = iArr2;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.l<Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ GiftGachaUser f25373w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ h0 f25374x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(GiftGachaUser giftGachaUser, h0 h0Var) {
            super(1);
            this.f25373w = giftGachaUser;
            this.f25374x = h0Var;
        }

        public final void a(int i10) {
            if (i10 == this.f25373w.getItems().size() - 1) {
                this.f25374x.a().p(Integer.valueOf(this.f25373w.getDuplicatedPoint()));
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(Integer num) {
            a(num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.l<Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ GridLayoutManager f25375w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ GiftGachaOpenResultView f25376x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f25377y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(GridLayoutManager gridLayoutManager, GiftGachaOpenResultView giftGachaOpenResultView, int i10) {
            super(1);
            this.f25375w = gridLayoutManager;
            this.f25376x = giftGachaOpenResultView;
            this.f25377y = i10;
        }

        public final void a(int i10) {
            if (i10 % this.f25375w.f3() == 1) {
                this.f25376x.C.p(this.f25377y + i10);
                this.f25375w.S1(this.f25376x.C);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(Integer num) {
            a(num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.l<Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ GiftGachaUser f25378w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c0 f25379x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ h0 f25380y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(GiftGachaUser giftGachaUser, c0 c0Var, h0 h0Var) {
            super(1);
            this.f25378w = giftGachaUser;
            this.f25379x = c0Var;
            this.f25380y = h0Var;
        }

        public final void a(int i10) {
            GiftGachaItem giftGachaItem = this.f25378w.getItems().get(i10);
            if (giftGachaItem.isNew() || giftGachaItem.getDuplicatedPoint() <= 0) {
                return;
            }
            this.f25379x.f38129w += giftGachaItem.getDuplicatedPoint();
            this.f25380y.a().p(Integer.valueOf(this.f25379x.f38129w));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(Integer num) {
            a(num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.l<Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ GiftGachaUser f25381w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ GiftGachaOpenResultView f25382x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ GridLayoutManager f25383y;

        @co.f(c = "com.dena.mirrorman.customview.GiftGachaOpenResultView$startOpenGiftAnimation$14$1", f = "GiftGachaOpenResultView.kt", l = {357}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends co.l implements p<q0, ao.d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f25384w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ GridLayoutManager f25385x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ GiftGachaOpenResultView f25386y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(GridLayoutManager gridLayoutManager, GiftGachaOpenResultView giftGachaOpenResultView, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f25385x = gridLayoutManager;
                this.f25386y = giftGachaOpenResultView;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f25385x, this.f25386y, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f25384w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    this.f25384w = 1;
                    if (b1.a(1000L, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                this.f25385x.R1(this.f25386y.f25368x.B, new RecyclerView.b0(), 0);
                u listener = this.f25386y.getListener();
                if (listener != null) {
                    listener.e();
                }
                return v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(GiftGachaUser giftGachaUser, GiftGachaOpenResultView giftGachaOpenResultView, GridLayoutManager gridLayoutManager) {
            super(1);
            this.f25381w = giftGachaUser;
            this.f25382x = giftGachaOpenResultView;
            this.f25383y = gridLayoutManager;
        }

        public final void a(int i10) {
            if (i10 == this.f25381w.getItems().size() - 1) {
                GiftGachaOpenResultView giftGachaOpenResultView = this.f25382x;
                uo.l.d(giftGachaOpenResultView, null, null, new a(this.f25383y, giftGachaOpenResultView, null), 3, null);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(Integer num) {
            a(num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends q implements io.l<Integer, v> {
        public final /* synthetic */ GiftGachaOpenResultView A;
        public final /* synthetic */ androidx.recyclerview.widget.g B;
        public final /* synthetic */ GridLayoutManager C;
        public final /* synthetic */ c0 D;
        public final /* synthetic */ h0 E;
        public final /* synthetic */ List<GiftGachaUserBasic> F;
        public final /* synthetic */ String G;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ GiftGachaUser f25387w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.u f25388x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ GiftGachaUser f25389y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f25390z;

        /* loaded from: classes2.dex */
        public static final class a extends q implements io.l<Integer, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ GiftGachaUser f25391w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ c0 f25392x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ h0 f25393y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(GiftGachaUser giftGachaUser, c0 c0Var, h0 h0Var) {
                super(1);
                this.f25391w = giftGachaUser;
                this.f25392x = c0Var;
                this.f25393y = h0Var;
            }

            public final void a(int i10) {
                GiftGachaItem giftGachaItem = this.f25391w.getItems().get(i10);
                if (giftGachaItem.isNew() || giftGachaItem.getDuplicatedPoint() <= 0) {
                    return;
                }
                this.f25392x.f38129w += giftGachaItem.getDuplicatedPoint();
                this.f25393y.a().p(Integer.valueOf(this.f25392x.f38129w));
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(Integer num) {
                a(num.intValue());
                return v.f59242a;
            }
        }

        /* loaded from: classes2.dex */
        public static final class b extends q implements io.l<Integer, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ GiftGachaUser f25394w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ c0 f25395x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ h0 f25396y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(GiftGachaUser giftGachaUser, c0 c0Var, h0 h0Var) {
                super(1);
                this.f25394w = giftGachaUser;
                this.f25395x = c0Var;
                this.f25396y = h0Var;
            }

            public final void a(int i10) {
                GiftGachaItem giftGachaItem = this.f25394w.getItems().get(i10);
                if (giftGachaItem.isNew() || giftGachaItem.getDuplicatedPoint() <= 0) {
                    return;
                }
                this.f25395x.f38129w += giftGachaItem.getDuplicatedPoint();
                this.f25396y.a().p(Integer.valueOf(this.f25395x.f38129w));
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(Integer num) {
                a(num.intValue());
                return v.f59242a;
            }
        }

        /* loaded from: classes2.dex */
        public static final class c extends q implements io.l<Integer, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ GiftGachaUser f25397w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ GiftGachaOpenResultView f25398x;

            @co.f(c = "com.dena.mirrorman.customview.GiftGachaOpenResultView$startOpenGiftAnimation$16$3$1", f = "GiftGachaOpenResultView.kt", l = {455}, m = "invokeSuspend")
            /* loaded from: classes2.dex */
            public static final class a extends co.l implements p<q0, ao.d<? super v>, Object> {

                /* renamed from: w  reason: collision with root package name */
                public int f25399w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ GiftGachaOpenResultView f25400x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(GiftGachaOpenResultView giftGachaOpenResultView, ao.d<? super a> dVar) {
                    super(2, dVar);
                    this.f25400x = giftGachaOpenResultView;
                }

                @Override // co.a
                public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                    return new a(this.f25400x, dVar);
                }

                @Override // io.p
                public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                    return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    Object c10 = bo.c.c();
                    int i10 = this.f25399w;
                    if (i10 == 0) {
                        wn.m.b(obj);
                        this.f25399w = 1;
                        if (b1.a(1000L, this) == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        wn.m.b(obj);
                    }
                    u listener = this.f25400x.getListener();
                    if (listener != null) {
                        listener.e();
                    }
                    return v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(GiftGachaUser giftGachaUser, GiftGachaOpenResultView giftGachaOpenResultView) {
                super(1);
                this.f25397w = giftGachaUser;
                this.f25398x = giftGachaOpenResultView;
            }

            public final void a(int i10) {
                if (i10 == this.f25397w.getItems().size() - 1) {
                    GiftGachaOpenResultView giftGachaOpenResultView = this.f25398x;
                    uo.l.d(giftGachaOpenResultView, null, null, new a(giftGachaOpenResultView, null), 3, null);
                }
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(Integer num) {
                a(num.intValue());
                return v.f59242a;
            }
        }

        @co.f(c = "com.dena.mirrorman.customview.GiftGachaOpenResultView$startOpenGiftAnimation$16$5", f = "GiftGachaOpenResultView.kt", l = {477}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class d extends co.l implements p<q0, ao.d<? super v>, Object> {
            public final /* synthetic */ GiftGachaUser A;
            public final /* synthetic */ int B;
            public final /* synthetic */ GiftGachaOpenResultView C;
            public final /* synthetic */ GridLayoutManager D;
            public final /* synthetic */ GiftGachaUser E;
            public final /* synthetic */ androidx.lifecycle.u F;
            public final /* synthetic */ h0 G;
            public final /* synthetic */ x H;
            public final /* synthetic */ String I;

            /* renamed from: w  reason: collision with root package name */
            public int f25401w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ androidx.recyclerview.widget.g f25402x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ c1 f25403y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ List<GiftGachaUserBasic> f25404z;

            /* loaded from: classes2.dex */
            public static final class a extends q implements io.a<v> {
                public final /* synthetic */ GiftGachaOpenResultView A;
                public final /* synthetic */ int B;
                public final /* synthetic */ GiftGachaUser C;
                public final /* synthetic */ androidx.lifecycle.u D;
                public final /* synthetic */ h0 E;
                public final /* synthetic */ x F;
                public final /* synthetic */ GridLayoutManager G;
                public final /* synthetic */ String H;

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ androidx.recyclerview.widget.g f25405w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ c1 f25406x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ z f25407y;

                /* renamed from: z  reason: collision with root package name */
                public final /* synthetic */ GiftGachaUser f25408z;

                /* renamed from: com.dena.mirrorman.customview.GiftGachaOpenResultView$g$d$a$a  reason: collision with other inner class name */
                /* loaded from: classes2.dex */
                public static final class C0221a extends q implements io.l<Integer, v> {

                    /* renamed from: w  reason: collision with root package name */
                    public final /* synthetic */ GridLayoutManager f25409w;

                    /* renamed from: x  reason: collision with root package name */
                    public final /* synthetic */ GiftGachaOpenResultView f25410x;

                    /* renamed from: y  reason: collision with root package name */
                    public final /* synthetic */ int f25411y;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0221a(GridLayoutManager gridLayoutManager, GiftGachaOpenResultView giftGachaOpenResultView, int i10) {
                        super(1);
                        this.f25409w = gridLayoutManager;
                        this.f25410x = giftGachaOpenResultView;
                        this.f25411y = i10;
                    }

                    public final void a(int i10) {
                        if (i10 % this.f25409w.f3() == 1) {
                            this.f25410x.C.p(this.f25411y + i10);
                            this.f25409w.S1(this.f25410x.C);
                        }
                    }

                    @Override // io.l
                    public /* bridge */ /* synthetic */ v invoke(Integer num) {
                        a(num.intValue());
                        return v.f59242a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(androidx.recyclerview.widget.g gVar, c1 c1Var, z zVar, GiftGachaUser giftGachaUser, GiftGachaOpenResultView giftGachaOpenResultView, int i10, GiftGachaUser giftGachaUser2, androidx.lifecycle.u uVar, h0 h0Var, x xVar, GridLayoutManager gridLayoutManager, String str) {
                    super(0);
                    this.f25405w = gVar;
                    this.f25406x = c1Var;
                    this.f25407y = zVar;
                    this.f25408z = giftGachaUser;
                    this.A = giftGachaOpenResultView;
                    this.B = i10;
                    this.C = giftGachaUser2;
                    this.D = uVar;
                    this.E = h0Var;
                    this.F = xVar;
                    this.G = gridLayoutManager;
                    this.H = str;
                }

                public final void a() {
                    i0 a10;
                    this.f25405w.d(this.f25406x);
                    this.f25405w.d(this.f25407y);
                    if (this.f25408z == null) {
                        this.f25405w.a(new b0(r.d(ud.q0.f55372d.c())));
                        this.f25405w.a(new c1(de.n.b(this.A, 20)));
                        this.f25405w.a(new rd.u());
                        this.f25405w.a(new c1(this.B - de.n.b(this.A, 80)));
                        u listener = this.A.getListener();
                        if (listener != null) {
                            listener.e();
                        }
                    } else {
                        androidx.recyclerview.widget.g gVar = this.f25405w;
                        q0.a aVar = ud.q0.f55372d;
                        Resources resources = this.A.getResources();
                        jo.p.g(resources, "resources");
                        gVar.a(new b0(r.d(aVar.a(resources, this.f25408z.getUser()))));
                        if (this.C.getUser().getUserId() != this.f25408z.getUser().getUserId()) {
                            this.f25405w.a(new c1(de.n.b(this.A, 15)));
                            androidx.recyclerview.widget.g gVar2 = this.f25405w;
                            w wVar = new w(this.D, this.E, true);
                            wVar.c(System.currentTimeMillis() + 300);
                            gVar2.a(wVar);
                        }
                        this.f25405w.a(new c1(de.n.b(this.A, 20)));
                        ArrayList arrayList = new ArrayList();
                        long currentTimeMillis = System.currentTimeMillis() + 200;
                        List<GiftGachaItem> items = this.f25408z.getItems();
                        String str = this.H;
                        for (GiftGachaItem giftGachaItem : items) {
                            if (giftGachaItem.getRarity() >= 4) {
                                a10 = l0.f55109j.a(giftGachaItem, str, currentTimeMillis, true);
                            } else {
                                a10 = j0.f55043i.a(giftGachaItem, str, currentTimeMillis);
                            }
                            arrayList.add(a10);
                            currentTimeMillis += giftGachaItem.getRarity() >= 4 ? 1500L : 250L;
                        }
                        this.F.j(arrayList);
                        List<? extends RecyclerView.h<? extends RecyclerView.e0>> b10 = this.f25405w.b();
                        jo.p.g(b10, "concatAdapter.adapters");
                        int i10 = 0;
                        Iterator<T> it = b10.iterator();
                        while (it.hasNext()) {
                            i10 += ((RecyclerView.h) it.next()).getItemCount();
                        }
                        this.F.k(new C0221a(this.G, this.A, i10));
                        this.F.h(System.currentTimeMillis() + 300);
                        this.f25405w.a(this.F);
                        this.f25405w.a(new c1(Math.max(de.n.b(this.A, 60), this.B - ((this.f25408z.getItems().size() / this.G.f3()) * de.n.b(this.A, 100)))));
                    }
                    this.A.g(this.f25405w);
                }

                @Override // io.a
                public /* bridge */ /* synthetic */ v invoke() {
                    a();
                    return v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(androidx.recyclerview.widget.g gVar, c1 c1Var, List<GiftGachaUserBasic> list, GiftGachaUser giftGachaUser, int i10, GiftGachaOpenResultView giftGachaOpenResultView, GridLayoutManager gridLayoutManager, GiftGachaUser giftGachaUser2, androidx.lifecycle.u uVar, h0 h0Var, x xVar, String str, ao.d<? super d> dVar) {
                super(2, dVar);
                this.f25402x = gVar;
                this.f25403y = c1Var;
                this.f25404z = list;
                this.A = giftGachaUser;
                this.B = i10;
                this.C = giftGachaOpenResultView;
                this.D = gridLayoutManager;
                this.E = giftGachaUser2;
                this.F = uVar;
                this.G = h0Var;
                this.H = xVar;
                this.I = str;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new d(this.f25402x, this.f25403y, this.f25404z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
                return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                GiftGachaUserBasic user;
                Object c10 = bo.c.c();
                int i10 = this.f25401w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    this.f25401w = 1;
                    if (b1.a(500L, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                this.f25402x.d(this.f25403y);
                List<GiftGachaUserBasic> list = this.f25404z;
                GiftGachaOpenResultView giftGachaOpenResultView = this.C;
                ArrayList arrayList = new ArrayList(xn.t.u(list, 10));
                for (GiftGachaUserBasic giftGachaUserBasic : list) {
                    q0.a aVar = ud.q0.f55372d;
                    Resources resources = giftGachaOpenResultView.getResources();
                    jo.p.g(resources, "resources");
                    arrayList.add(aVar.a(resources, giftGachaUserBasic));
                }
                List p02 = a0.p0(arrayList, ud.q0.f55372d.c());
                GiftGachaUser giftGachaUser = this.A;
                int i11 = 0;
                z zVar = new z((giftGachaUser == null || (user = giftGachaUser.getUser()) == null) ? 0 : user.getUserId(), p02);
                c1 c1Var = new c1(this.B - de.n.b(this.C, 30));
                this.f25402x.a(zVar);
                this.f25402x.a(c1Var);
                t tVar = this.C.C;
                List<? extends RecyclerView.h<? extends RecyclerView.e0>> b10 = this.f25402x.b();
                jo.p.g(b10, "concatAdapter.adapters");
                Iterator<T> it = b10.iterator();
                while (it.hasNext()) {
                    i11 += ((RecyclerView.h) it.next()).getItemCount();
                }
                tVar.p(i11);
                this.D.S1(this.C.C);
                zVar.c(new a(this.f25402x, c1Var, zVar, this.A, this.C, this.B, this.E, this.F, this.G, this.H, this.D, this.I));
                return v.f59242a;
            }
        }

        /* loaded from: classes2.dex */
        public static final class e extends q implements io.l<Integer, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ GiftGachaOpenResultView f25412w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(GiftGachaOpenResultView giftGachaOpenResultView) {
                super(1);
                this.f25412w = giftGachaOpenResultView;
            }

            public final void a(int i10) {
                u listener = this.f25412w.getListener();
                if (listener != null) {
                    listener.b(i10);
                }
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(Integer num) {
                a(num.intValue());
                return v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(GiftGachaUser giftGachaUser, androidx.lifecycle.u uVar, GiftGachaUser giftGachaUser2, boolean z10, GiftGachaOpenResultView giftGachaOpenResultView, androidx.recyclerview.widget.g gVar, GridLayoutManager gridLayoutManager, c0 c0Var, h0 h0Var, List<GiftGachaUserBasic> list, String str) {
            super(1);
            this.f25387w = giftGachaUser;
            this.f25388x = uVar;
            this.f25389y = giftGachaUser2;
            this.f25390z = z10;
            this.A = giftGachaOpenResultView;
            this.B = gVar;
            this.C = gridLayoutManager;
            this.D = c0Var;
            this.E = h0Var;
            this.F = list;
            this.G = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0138 A[LOOP:0: B:37:0x0132->B:39:0x0138, LOOP_END] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(int r22) {
            /*
                Method dump skipped, instructions count: 378
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.customview.GiftGachaOpenResultView.g.a(int):void");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(Integer num) {
            a(num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends GridLayoutManager.c {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ GridLayoutManager f25414f;

        public h(GridLayoutManager gridLayoutManager) {
            this.f25414f = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i10) {
            List list = GiftGachaOpenResultView.this.D;
            boolean z10 = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((po.i) it.next()).t(i10)) {
                        z10 = true;
                        break;
                    }
                }
            }
            if (z10) {
                return 1;
            }
            return this.f25414f.f3();
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends RecyclerView.o {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f25416b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f25417c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ GridLayoutManager f25418d;

        public i(int i10, int i11, GridLayoutManager gridLayoutManager) {
            this.f25416b = i10;
            this.f25417c = i11;
            this.f25418d = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            Object obj;
            jo.p.h(rect, "outRect");
            jo.p.h(view, "view");
            jo.p.h(recyclerView, "parent");
            jo.p.h(b0Var, "state");
            super.g(rect, view, recyclerView, b0Var);
            int f02 = recyclerView.f0(view);
            Iterator it = GiftGachaOpenResultView.this.D.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((po.i) obj).t(f02)) {
                    break;
                }
            }
            po.i iVar = (po.i) obj;
            if (iVar == null) {
                return;
            }
            int k10 = f02 - iVar.k();
            rect.top = GiftGachaOpenResultView.this.f25369y / 2;
            rect.bottom = GiftGachaOpenResultView.this.f25369y / 2;
            rect.left = this.f25416b + (((GiftGachaOpenResultView.this.f25369y + this.f25417c) - (GiftGachaOpenResultView.this.getResources().getDisplayMetrics().widthPixels / this.f25418d.f3())) * (k10 % this.f25418d.f3()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends q implements io.l<String, v> {
        public j() {
            super(1);
        }

        public final void a(String str) {
            jo.p.h(str, "it");
            u listener = GiftGachaOpenResultView.this.getListener();
            if (listener != null) {
                listener.c(str);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(String str) {
            a(str);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends q implements io.l<Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ GiftGachaUser f25420w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ h0 f25421x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(GiftGachaUser giftGachaUser, h0 h0Var) {
            super(1);
            this.f25420w = giftGachaUser;
            this.f25421x = h0Var;
        }

        public final void a(int i10) {
            if (i10 == this.f25420w.getItems().size() - 1) {
                this.f25421x.a().p(Integer.valueOf(this.f25420w.getDuplicatedPoint()));
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(Integer num) {
            a(num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends q implements io.l<Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f25422w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ GiftGachaOpenResultView f25423x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f25424y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ GridLayoutManager f25425z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(int i10, GiftGachaOpenResultView giftGachaOpenResultView, int i11, GridLayoutManager gridLayoutManager) {
            super(1);
            this.f25422w = i10;
            this.f25423x = giftGachaOpenResultView;
            this.f25424y = i11;
            this.f25425z = gridLayoutManager;
        }

        public final void a(int i10) {
            if (i10 % this.f25422w == 0) {
                this.f25423x.C.p(this.f25424y + i10);
                this.f25425z.S1(this.f25423x.C);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(Integer num) {
            a(num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends q implements io.l<Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ GiftGachaUser f25426w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c0 f25427x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ h0 f25428y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(GiftGachaUser giftGachaUser, c0 c0Var, h0 h0Var) {
            super(1);
            this.f25426w = giftGachaUser;
            this.f25427x = c0Var;
            this.f25428y = h0Var;
        }

        public final void a(int i10) {
            GiftGachaItem giftGachaItem = this.f25426w.getItems().get(i10);
            if (giftGachaItem.isNew() || giftGachaItem.getDuplicatedPoint() <= 0) {
                return;
            }
            this.f25427x.f38129w += giftGachaItem.getDuplicatedPoint();
            this.f25428y.a().p(Integer.valueOf(this.f25427x.f38129w));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(Integer num) {
            a(num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends q implements io.l<Integer, v> {
        public n() {
            super(1);
        }

        public final void a(int i10) {
            u listener = GiftGachaOpenResultView.this.getListener();
            if (listener != null) {
                listener.a(i10);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(Integer num) {
            a(num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends q implements io.l<Integer, v> {
        public o() {
            super(1);
        }

        public final void a(int i10) {
            u listener = GiftGachaOpenResultView.this.getListener();
            if (listener != null) {
                listener.d(i10);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(Integer num) {
            a(num.intValue());
            return v.f59242a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftGachaOpenResultView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        jo.p.h(context, "context");
        jo.p.h(attributeSet, "attrs");
        this.f25367w = g1.c().plus(b3.b(null, 1, null)).plus(new da.c());
        this.f25368x = (qa) androidx.databinding.f.e(LayoutInflater.from(getContext()), nd.b1.view_gift_gacha_open_result, this, true);
        this.f25369y = de.n.b(this, 10);
        this.f25370z = de.n.b(this, 20);
        this.A = getResources().getDimensionPixelSize(x0.gift_gacha_normal_item_width);
        this.B = getResources().getDimensionPixelSize(x0.gift_gacha_rare_item_width);
        this.C = new t(getContext());
        this.D = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x05a5  */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r41v0, types: [android.widget.FrameLayout, android.view.View, com.dena.mirrorman.customview.GiftGachaOpenResultView] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(androidx.lifecycle.u r42, com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaUser r43, com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaUser r44, com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaUser r45, java.util.List<com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaUserBasic> r46, java.lang.String r47, java.lang.String r48, com.dena.mirrorman.net.api.response.GiftGachaStockType r49, java.lang.String r50, boolean r51) {
        /*
            Method dump skipped, instructions count: 1516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.customview.GiftGachaOpenResultView.f(androidx.lifecycle.u, com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaUser, com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaUser, com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaUser, java.util.List, java.lang.String, java.lang.String, com.dena.mirrorman.net.api.response.GiftGachaStockType, java.lang.String, boolean):void");
    }

    public final void g(androidx.recyclerview.widget.g gVar) {
        this.D.clear();
        int i10 = 0;
        for (RecyclerView.h<? extends RecyclerView.e0> hVar : gVar.b()) {
            if (hVar instanceof x) {
                this.D.add(po.n.t(i10, ((x) hVar).getItemCount() + i10));
            }
            i10 += hVar.getItemCount();
        }
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f25367w;
    }

    public final u getListener() {
        return this.E;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        r0.d(this, null, 1, null);
        super.onDetachedFromWindow();
    }

    public final void setListener(u uVar) {
        this.E = uVar;
    }
}
