package he;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.t;
import com.dena.mirrativ.mirrativapi.common.EventBannerResponse;
import nd.w0;
import nd.y0;
import qf.d2;
import qf.e2;
import qf.f2;
import qf.h1;
import qf.h2;
import qf.j2;
import qf.k2;
import ud.a3;
import ud.b3;
import ud.c3;
import ud.d3;
import ud.q2;
import ud.r2;
import ud.s2;
import ud.t2;
import ud.u2;
import ud.v2;
import ud.w2;
import ud.x2;
import ud.y2;
import ud.z2;
import wn.v;

/* loaded from: classes2.dex */
public final class b extends t<r2, RecyclerView.e0> {

    /* renamed from: c  reason: collision with root package name */
    public he.c f35454c;

    /* loaded from: classes2.dex */
    public static final class a extends j.f<r2> {
        @Override // androidx.recyclerview.widget.j.f
        @SuppressLint({"DiffUtilEquals"})
        /* renamed from: d */
        public boolean a(r2 r2Var, r2 r2Var2) {
            jo.p.h(r2Var, "oldItem");
            jo.p.h(r2Var2, "newItem");
            return r2Var == r2Var2;
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(r2 r2Var, r2 r2Var2) {
            jo.p.h(r2Var, "oldItem");
            jo.p.h(r2Var2, "newItem");
            return jo.p.c(r2Var, r2Var2);
        }
    }

    /* renamed from: he.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0454b extends jo.q implements io.l<String, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.e0 f35456x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0454b(RecyclerView.e0 e0Var) {
            super(1);
            this.f35456x = e0Var;
        }

        public final void a(String str) {
            jo.p.h(str, "userId");
            he.c g10 = b.this.g();
            if (g10 != null) {
                g10.b(this.f35456x, str);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(String str) {
            a(str);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<a3, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.e0 f35458x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.e0 e0Var) {
            super(1);
            this.f35458x = e0Var;
        }

        public final void a(a3 a3Var) {
            jo.p.h(a3Var, "it");
            he.c g10 = b.this.g();
            if (g10 != null) {
                g10.g(this.f35458x, a3Var);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(a3 a3Var) {
            a(a3Var);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.l<a3, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.e0 f35460x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(RecyclerView.e0 e0Var) {
            super(1);
            this.f35460x = e0Var;
        }

        public final void a(a3 a3Var) {
            jo.p.h(a3Var, "it");
            he.c g10 = b.this.g();
            if (g10 != null) {
                g10.h(this.f35460x, a3Var);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(a3 a3Var) {
            a(a3Var);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.l<String, v> {

        /* renamed from: w  reason: collision with root package name */
        public static final e f35461w = new e();

        public e() {
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

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.e0 f35463x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ r2 f35464y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(RecyclerView.e0 e0Var, r2 r2Var) {
            super(0);
            this.f35463x = e0Var;
            this.f35464y = r2Var;
        }

        public final void a() {
            he.c g10 = b.this.g();
            if (g10 != null) {
                RecyclerView.e0 e0Var = this.f35463x;
                r2 r2Var = this.f35464y;
                jo.p.g(r2Var, "bindModel");
                g10.a(e0Var, (q2) r2Var);
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.e0 f35466x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ r2 f35467y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(RecyclerView.e0 e0Var, r2 r2Var) {
            super(0);
            this.f35466x = e0Var;
            this.f35467y = r2Var;
        }

        public final void a() {
            he.c g10 = b.this.g();
            if (g10 != null) {
                g10.b(this.f35466x, this.f35467y.e());
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
        public final /* synthetic */ RecyclerView.e0 f35469x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ r2 f35470y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(RecyclerView.e0 e0Var, r2 r2Var) {
            super(0);
            this.f35469x = e0Var;
            this.f35470y = r2Var;
        }

        public final void a() {
            he.c g10 = b.this.g();
            if (g10 != null) {
                g10.b(this.f35469x, this.f35470y.e());
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.l<String, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.e0 f35472x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(RecyclerView.e0 e0Var) {
            super(1);
            this.f35472x = e0Var;
        }

        public final void a(String str) {
            jo.p.h(str, "userId");
            he.c g10 = b.this.g();
            if (g10 != null) {
                g10.b(this.f35472x, str);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(String str) {
            a(str);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.e0 f35474x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(RecyclerView.e0 e0Var) {
            super(0);
            this.f35474x = e0Var;
        }

        public final void a() {
            he.c g10 = b.this.g();
            if (g10 != null) {
                g10.c(this.f35474x);
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.l<String, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.e0 f35476x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(RecyclerView.e0 e0Var) {
            super(1);
            this.f35476x = e0Var;
        }

        public final void a(String str) {
            jo.p.h(str, "userId");
            he.c g10 = b.this.g();
            if (g10 != null) {
                g10.b(this.f35476x, str);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(String str) {
            a(str);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.l<String, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.e0 f35478x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(RecyclerView.e0 e0Var) {
            super(1);
            this.f35478x = e0Var;
        }

        public final void a(String str) {
            jo.p.h(str, "userId");
            he.c g10 = b.this.g();
            if (g10 != null) {
                g10.b(this.f35478x, str);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(String str) {
            a(str);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.l<EventBannerResponse, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.e0 f35480x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(RecyclerView.e0 e0Var) {
            super(1);
            this.f35480x = e0Var;
        }

        public final void a(EventBannerResponse eventBannerResponse) {
            jo.p.h(eventBannerResponse, "eventBanner");
            he.c g10 = b.this.g();
            if (g10 != null) {
                g10.d(this.f35480x, eventBannerResponse);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(EventBannerResponse eventBannerResponse) {
            a(eventBannerResponse);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.l<String, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.e0 f35482x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(RecyclerView.e0 e0Var) {
            super(1);
            this.f35482x = e0Var;
        }

        public final void a(String str) {
            jo.p.h(str, "it");
            he.c g10 = b.this.g();
            if (g10 != null) {
                g10.f(this.f35482x, str);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(String str) {
            a(str);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.l<String, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.e0 f35484x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(RecyclerView.e0 e0Var) {
            super(1);
            this.f35484x = e0Var;
        }

        public final void a(String str) {
            jo.p.h(str, "it");
            he.c g10 = b.this.g();
            if (g10 != null) {
                g10.e(this.f35484x, str);
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
        public final /* synthetic */ RecyclerView.e0 f35486x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(RecyclerView.e0 e0Var) {
            super(1);
            this.f35486x = e0Var;
        }

        public final void a(String str) {
            jo.p.h(str, "it");
            he.c g10 = b.this.g();
            if (g10 != null) {
                g10.b(this.f35486x, str);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(String str) {
            a(str);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.l<String, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.e0 f35488x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(RecyclerView.e0 e0Var) {
            super(1);
            this.f35488x = e0Var;
        }

        public final void a(String str) {
            jo.p.h(str, "it");
            he.c g10 = b.this.g();
            if (g10 != null) {
                g10.b(this.f35488x, str);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(String str) {
            a(str);
            return v.f59242a;
        }
    }

    public b() {
        super(new a());
    }

    public final he.c g() {
        return this.f35454c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return b(i10).getType().ordinal();
    }

    public final void h(he.c cVar) {
        this.f35454c = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "viewHolder");
        r2 b10 = b(i10);
        if (e0Var instanceof k2) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.PlayerLiveCommentBindModel");
            ((k2) e0Var).a((t2) b10, new i(e0Var));
        } else if (e0Var instanceof e2) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.PlayerLiveCommentShareUrlRequestBindModel");
            ((e2) e0Var).a((d3) b10, new j(e0Var));
        } else if (e0Var instanceof j2) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.PlayerLiveCommentMemoBroadcastBindModel");
            ((j2) e0Var).a((c3) b10, new k(e0Var));
        } else if (e0Var instanceof qf.l) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.PlayerLiveCommentGiftBindModel");
            ((qf.l) e0Var).a((z2) b10, new l(e0Var));
        } else if (e0Var instanceof qf.k) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.PlayerLiveCommentEventNoticeBindModel");
            ((qf.k) e0Var).a((y2) b10, new m(e0Var));
        } else if (e0Var instanceof qf.h) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.PlayerLiveCommentAppUsedIdBindModel");
            ((qf.h) e0Var).b((s2) b10, w0.L0, y0.rectangle_corner12_whitethree80, new n(e0Var), new o(e0Var), new p(e0Var));
        } else if (e0Var instanceof d2) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.PlayerLiveCommentCheckProfileBindModel");
            ((d2) e0Var).b((v2) b10, new q(e0Var));
        } else if (e0Var instanceof qf.i) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.PlayerLiveCommentBotCommentBindModel");
            ((qf.i) e0Var).a((u2) b10);
        } else if (e0Var instanceof qf.e) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.PlayerLiveCommentCollabLiveGiftBindModel");
            ((qf.e) e0Var).a((x2) b10, new C0454b(e0Var));
        } else if (e0Var instanceof h1) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.PlayerLiveCommentLiveGameInvitedBindModel");
            ((h1) e0Var).a((a3) b10, new c(e0Var), new d(e0Var));
        } else if (e0Var instanceof qf.o) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.PlayerLiveCommentLuckyPrizeBindModel");
            ((qf.o) e0Var).c((b3) b10, e.f35461w);
        } else if (e0Var instanceof f2) {
            f2 f2Var = (f2) e0Var;
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.PlayerCheerLevelUpCommentBindModel");
            f2Var.a((q2) b10);
            f2Var.g(new f(e0Var, b10));
            f2Var.f(new g(e0Var, b10));
        } else if (e0Var instanceof h2) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.PlayerLiveCommentCheerleaderEnterBindModel");
            ((h2) e0Var).a((w2) b10, new h(e0Var, b10));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == r2.a.VIEW_TYPE_COMMENT.ordinal()) {
            return k2.f49264y.a(viewGroup);
        }
        if (i10 == r2.a.VIEW_TYPE_SHARE_URL_REQUEST.ordinal()) {
            return e2.f49121x.a(viewGroup);
        }
        if (i10 == r2.a.VIEW_TYPE_MEMO_BROADCAST.ordinal()) {
            return j2.f49244x.a(viewGroup);
        }
        if (i10 == r2.a.VIEW_TYPE_GIFT.ordinal()) {
            return qf.l.f49273b.a(viewGroup);
        }
        if (i10 == r2.a.VIEW_TYPE_EVENT_NOTICE.ordinal()) {
            return qf.k.f49255b.a(viewGroup);
        }
        if (i10 == r2.a.VIEW_TYPE_APP_USED_ID.ordinal()) {
            return qf.h.f49175b.a(viewGroup);
        }
        if (i10 == r2.a.VIEW_TYPE_CHECK_PROFILE.ordinal()) {
            return d2.f49104x.a(viewGroup);
        }
        if (i10 == r2.a.VIEW_TYPE_BOT.ordinal()) {
            return qf.i.f49210x.a(viewGroup);
        }
        if (i10 == r2.a.VIEW_TYPE_COLLAB_LIVE_GIFT.ordinal()) {
            return qf.e.f49113b.a(viewGroup);
        }
        if (i10 == r2.a.VIEW_TYPE_LIVE_GAME_INVITED.ordinal()) {
            return h1.f49195b.a(viewGroup);
        }
        if (i10 == r2.a.VIEW_TYPE_LUCKY_PRIZE.ordinal()) {
            return qf.o.f49310x.a(viewGroup);
        }
        if (i10 == r2.a.VIEW_TYPE_CHEER_LEVEL_UP.ordinal()) {
            return f2.f49142d.a(viewGroup);
        }
        if (i10 == r2.a.VIEW_TYPE_CHEERLEADER_ENTER.ordinal()) {
            return h2.f49202b.a(viewGroup);
        }
        throw new IllegalArgumentException("存在しないviewType={" + i10 + "}です");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewRecycled(RecyclerView.e0 e0Var) {
        jo.p.h(e0Var, "holder");
        super.onViewRecycled(e0Var);
        if (e0Var instanceof f2) {
            ((f2) e0Var).b().e();
        } else if (e0Var instanceof h2) {
            ((h2) e0Var).b().e();
        }
    }
}
