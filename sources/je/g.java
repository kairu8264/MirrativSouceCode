package je;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.t;
import com.dena.mirrativ.mirrativapi.common.EventBannerResponse;
import nd.w0;
import qf.a0;
import qf.a3;
import qf.b0;
import qf.c0;
import qf.c3;
import qf.e3;
import qf.f3;
import qf.s;
import qf.u;
import qf.w;
import qf.x;
import qf.y;
import qf.z;
import ud.c4;
import ud.d4;
import ud.e4;
import ud.f4;
import ud.h4;
import ud.i4;
import ud.j4;
import ud.k4;
import ud.l4;
import ud.m4;
import ud.o4;
import ud.p4;
import ud.q4;
import ud.r4;
import ud.s4;
import ud.t4;
import ud.u4;
import wn.v;
import yd.g1;

/* loaded from: classes2.dex */
public final class g extends t<d4, RecyclerView.e0> {

    /* renamed from: c  reason: collision with root package name */
    public b f37796c;

    /* loaded from: classes2.dex */
    public static final class a extends j.f<d4> {
        @Override // androidx.recyclerview.widget.j.f
        @SuppressLint({"DiffUtilEquals"})
        /* renamed from: d */
        public boolean a(d4 d4Var, d4 d4Var2) {
            jo.p.h(d4Var, "oldItem");
            jo.p.h(d4Var2, "newItem");
            return d4Var == d4Var2;
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(d4 d4Var, d4 d4Var2) {
            jo.p.h(d4Var, "oldItem");
            jo.p.h(d4Var2, "newItem");
            return jo.p.c(d4Var, d4Var2);
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(String str);

        void b(String str);

        void c(String str);

        void d(String str);

        void e(String str);

        void f(String str);

        void g();

        void h(EventBannerResponse eventBannerResponse);

        void i(String str);
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<String, v> {
        public c() {
            super(1);
        }

        public final void a(String str) {
            jo.p.h(str, "it");
            b bVar = g.this.f37796c;
            if (bVar != null) {
                bVar.e(str);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(String str) {
            a(str);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.l<String, v> {
        public d() {
            super(1);
        }

        public final void a(String str) {
            jo.p.h(str, "it");
            b bVar = g.this.f37796c;
            if (bVar != null) {
                bVar.b(str);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(String str) {
            a(str);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<v> {
        public e() {
            super(0);
        }

        public final void a() {
            b bVar = g.this.f37796c;
            if (bVar != null) {
                bVar.g();
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.l<String, v> {

        /* renamed from: w  reason: collision with root package name */
        public static final f f37800w = new f();

        public f() {
            super(1);
        }

        public final void a(String str) {
            jo.p.h(str, "it");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(String str) {
            a(str);
            return v.f59242a;
        }
    }

    /* renamed from: je.g$g  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0524g extends jo.q implements io.a<v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ d4 f37802x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0524g(d4 d4Var) {
            super(0);
            this.f37802x = d4Var;
        }

        public final void a() {
            b bVar = g.this.f37796c;
            if (bVar != null) {
                bVar.i(((c4) this.f37802x).j());
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ d4 f37804x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(d4 d4Var) {
            super(0);
            this.f37804x = d4Var;
        }

        public final void a() {
            b bVar = g.this.f37796c;
            if (bVar != null) {
                bVar.e(this.f37804x.e());
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ d4 f37806x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(d4 d4Var) {
            super(0);
            this.f37806x = d4Var;
        }

        public final void a() {
            b bVar = g.this.f37796c;
            if (bVar != null) {
                bVar.e(this.f37806x.e());
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.l<View, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ d4 f37808x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(d4 d4Var) {
            super(1);
            this.f37808x = d4Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            b bVar = g.this.f37796c;
            if (bVar != null) {
                bVar.e(this.f37808x.e());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.l<View, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ d4 f37810x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(d4 d4Var) {
            super(1);
            this.f37810x = d4Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            b bVar = g.this.f37796c;
            if (bVar != null) {
                bVar.a(((q4) this.f37810x).i());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.l<View, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ d4 f37812x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(d4 d4Var) {
            super(1);
            this.f37812x = d4Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            b bVar = g.this.f37796c;
            if (bVar != null) {
                bVar.e(this.f37812x.e());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.l<View, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ d4 f37814x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(d4 d4Var) {
            super(1);
            this.f37814x = d4Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            b bVar = g.this.f37796c;
            if (bVar != null) {
                bVar.e(this.f37814x.e());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.l<View, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ d4 f37816x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(d4 d4Var) {
            super(1);
            this.f37816x = d4Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            b bVar = g.this.f37796c;
            if (bVar != null) {
                bVar.h(((o4) this.f37816x).k());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.l<String, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ d4 f37818x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(d4 d4Var) {
            super(1);
            this.f37818x = d4Var;
        }

        public final void a(String str) {
            jo.p.h(str, "it");
            b bVar = g.this.f37796c;
            if (bVar != null) {
                bVar.f(this.f37818x.a());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(String str) {
            a(str);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.l<String, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ d4 f37820x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(d4 d4Var) {
            super(1);
            this.f37820x = d4Var;
        }

        public final void a(String str) {
            jo.p.h(str, "it");
            b bVar = g.this.f37796c;
            if (bVar != null) {
                bVar.c(this.f37820x.a());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(String str) {
            a(str);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.l<View, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ d4 f37822x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(d4 d4Var) {
            super(1);
            this.f37822x = d4Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            b bVar = g.this.f37796c;
            if (bVar != null) {
                bVar.e(this.f37822x.e());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.l<String, v> {
        public r() {
            super(1);
        }

        public final void a(String str) {
            jo.p.h(str, "it");
            b bVar = g.this.f37796c;
            if (bVar != null) {
                bVar.d(str);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(String str) {
            a(str);
            return v.f59242a;
        }
    }

    public g() {
        super(new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return b(i10).getType().ordinal();
    }

    public final void h(b bVar) {
        jo.p.h(bVar, "listener");
        this.f37796c = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "viewHolder");
        d4 b10 = b(i10);
        if (e0Var instanceof f3) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StreamingLiveCommentTextBindModel");
            ((f3) e0Var).a((t4) b10);
        } else if (e0Var instanceof x) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StreamingLiveCommentCollabRequestBindModel");
            ((x) e0Var).a((m4) b10);
        } else if (e0Var instanceof qf.n) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StreamingLiveCommentUrlSharedBindModel");
            ((qf.n) e0Var).a((u4) b10);
            View view = e0Var.itemView;
            jo.p.g(view, "viewHolder.itemView");
            g1.a(view, new j(b10));
        } else if (e0Var instanceof z) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StreamingLiveCommentLiveLinkedBindModel");
            ((z) e0Var).a((q4) b10);
            View view2 = e0Var.itemView;
            jo.p.g(view2, "viewHolder.itemView");
            g1.a(view2, new k(b10));
        } else if (e0Var instanceof y) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StreamingLiveCommentGiftBindModel");
            ((y) e0Var).a((p4) b10);
            View view3 = e0Var.itemView;
            jo.p.g(view3, "viewHolder.itemView");
            g1.a(view3, new l(b10));
        } else if (e0Var instanceof a0) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StreamingLiveCommentGiftBindModel");
            ((a0) e0Var).b((p4) b10);
            View view4 = e0Var.itemView;
            jo.p.g(view4, "viewHolder.itemView");
            g1.a(view4, new m(b10));
        } else if (e0Var instanceof qf.k) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StreamingLiveCommentEventNoticeBindModel");
            ((qf.k) e0Var).b((o4) b10);
            View view5 = e0Var.itemView;
            jo.p.g(view5, "viewHolder.itemView");
            g1.a(view5, new n(b10));
        } else if (e0Var instanceof qf.h) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StreamingLiveCommentAppUsedIdBindModel");
            qf.h.d((qf.h) e0Var, (e4) b10, w0.U0, 17170445, new o(b10), new p(b10), null, 32, null);
        } else if (e0Var instanceof c0) {
            if (b10 instanceof f4) {
                jo.p.g(b10, "liveComment");
                f4 f4Var = (f4) b10;
                ((c0) e0Var).a(b10, f4Var.k(), f4Var.l(), f4Var.j(), f4Var.i());
            } else if (b10 instanceof j4) {
                jo.p.g(b10, "liveComment");
                j4 j4Var = (j4) b10;
                ((c0) e0Var).a(b10, j4Var.k(), j4Var.l(), we.g.NONE, 0);
            } else {
                jo.p.g(b10, "liveComment");
                ((c0) e0Var).a(b10, false, false, we.g.NONE, 0);
            }
            View view6 = e0Var.itemView;
            jo.p.g(view6, "viewHolder.itemView");
            g1.a(view6, new q(b10));
        } else if (e0Var instanceof w) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StreamingLiveCommentCollabRecommendLiveBindModel");
            ((w) e0Var).b((l4) b10, new r());
        } else if (e0Var instanceof u) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StreamingLiveCommentCollabMatchingStartBindModel");
            ((u) e0Var).b((k4) b10, new c());
        } else if (e0Var instanceof s) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StreamingLiveCommentCollabEndBindModel");
            ((s) e0Var).b((i4) b10, new d());
        } else if (e0Var instanceof b0) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StreamingLiveCommentShooterMatchingViewerEnterBindModel");
            ((b0) e0Var).a((s4) b10, new e());
        } else if (e0Var instanceof qf.o) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StreamingLiveCommentLuckyPrizeBindModel");
            ((qf.o) e0Var).d((r4) b10, f.f37800w);
        } else if (e0Var instanceof a3) {
            a3 a3Var = (a3) e0Var;
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StreamingCheerLevelUpCommentBindModel");
            a3Var.a((c4) b10);
            a3Var.g(new C0524g(b10));
            a3Var.f(new h(b10));
        } else if (e0Var instanceof c3) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StreamingLiveCommentCheerleaderEnterBindModel");
            ((c3) e0Var).a((h4) b10, new i(b10));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return i10 == d4.a.VIEW_TYPE_TEXT.ordinal() ? f3.f49153b.a(viewGroup) : i10 == d4.a.VIEW_TYPE_COLLAB_REQUEST.ordinal() ? x.f49423b.a(viewGroup) : i10 == d4.a.VIEW_TYPE_SHARE_URL_REQUEST.ordinal() ? qf.n.f49300b.a(viewGroup) : i10 == d4.a.VIEW_TYPE_LIVE_LINKED.ordinal() ? z.f49459b.a(viewGroup) : i10 == d4.a.VIEW_TYPE_GIFT.ordinal() ? y.f49440b.a(viewGroup) : i10 == d4.a.VIEW_TYPE_MESSAGE_GIFT.ordinal() ? a0.f49022c.a(viewGroup) : i10 == d4.a.VIEW_TYPE_EVENT_NOTICE.ordinal() ? qf.k.f49255b.a(viewGroup) : i10 == d4.a.VIEW_TYPE_APP_USED_ID.ordinal() ? qf.h.f49175b.a(viewGroup) : i10 == d4.a.VIEW_TYPE_COLLAB_RECOMMEND_LIVE.ordinal() ? w.f49411b.a(viewGroup) : i10 == d4.a.VIEW_TYPE_COLLAB_MATCHING_START.ordinal() ? u.f49392b.a(viewGroup) : i10 == d4.a.VIEW_TYPE_COLLAB_END.ordinal() ? s.f49369b.a(viewGroup) : i10 == d4.a.VIEW_TYPE_SHOOTER_MATCHING_VIEWER_ENTER.ordinal() ? b0.f49055b.a(viewGroup) : i10 == d4.a.VIEW_TYPE_EMPTY.ordinal() ? e3.f49125a.a(viewGroup) : i10 == d4.a.VIEW_TYPE_LUCKY_PRIZE.ordinal() ? qf.o.f49310x.a(viewGroup) : i10 == d4.a.VIEW_TYPE_CHEER_LEVEL_UP.ordinal() ? a3.f49040d.a(viewGroup) : i10 == d4.a.VIEW_TYPE_CHEERLEADER_ENTER.ordinal() ? c3.f49089b.a(viewGroup) : c0.f49082b.a(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewAttachedToWindow(RecyclerView.e0 e0Var) {
        jo.p.h(e0Var, "viewHolder");
        super.onViewAttachedToWindow(e0Var);
        if (e0Var instanceof a0) {
            ((a0) e0Var).d();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewDetachedFromWindow(RecyclerView.e0 e0Var) {
        jo.p.h(e0Var, "viewHolder");
        if (e0Var instanceof a0) {
            ((a0) e0Var).c();
        }
        super.onViewDetachedFromWindow(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewRecycled(RecyclerView.e0 e0Var) {
        jo.p.h(e0Var, "holder");
        super.onViewRecycled(e0Var);
        if (e0Var instanceof a3) {
            ((a3) e0Var).b().e();
        } else if (e0Var instanceof c3) {
            ((c3) e0Var).b().e();
        }
    }
}
