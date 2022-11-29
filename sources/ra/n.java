package ra;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.activity.HandleUrlSchemeActivity;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.clientlog.logs.NoticeCampaignVisibleLogger;
import com.dena.mirrorman.clientlog.logs.detail.NoticeCampaignPageTargetDetail;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.notice.CampaignNotice;
import ha.a;
import java.io.Serializable;
import java.util.List;
import jf.b0;
import jf.g0;
import jo.f0;
import kq.a;
import od.c0;
import ra.g;
import uo.b0;
import uo.b3;
import uo.g1;
import uo.q0;
import uo.r0;
import wn.v;
import xn.a0;

/* loaded from: classes2.dex */
public final class n extends Fragment implements q0 {
    public final wn.f B0;
    public final wn.f C0;
    public final wn.f D0;
    public final wn.f E0;
    public final wn.f F0;
    public final wn.f G0;
    public final androidx.activity.result.c<Intent> H0;
    public static final /* synthetic */ qo.h<Object>[] J0 = {f0.d(new jo.s(n.class, "binding", "getBinding()Lcom/dena/mirrativ/notification/databinding/FragmentNoticeCampaignPageBinding;", 0))};
    public static final a I0 = new a(null);
    public static final int K0 = 8;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ da.j f50613x0 = new da.j();

    /* renamed from: y0  reason: collision with root package name */
    public final wn.f f50614y0 = wn.g.a(new k());

    /* renamed from: z0  reason: collision with root package name */
    public final AutoClearedValue f50615z0 = nd.a.a(this);
    public b0 A0 = b3.b(null, 1, null);

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final n a(g0 g0Var) {
            jo.p.h(g0Var, "page");
            n nVar = new n();
            Bundle bundle = new Bundle();
            bundle.putSerializable("EXTRA_PAGE_TYPE", g0Var);
            nVar.V2(bundle);
            return nVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<uq.a> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            return uq.b.b(n.this.A3());
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends GridLayoutManager.c {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ ra.g f50617e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ GridLayoutManager f50618f;

        public c(ra.g gVar, GridLayoutManager gridLayoutManager) {
            this.f50617e = gVar;
            this.f50618f = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i10) {
            List<CampaignNotice> a10 = this.f50617e.a();
            jo.p.g(a10, "noticeCampaignAdapter.currentList");
            CampaignNotice campaignNotice = (CampaignNotice) a0.a0(a10, i10);
            if (campaignNotice == null) {
                return 1;
            }
            if (campaignNotice.isUpcoming() || campaignNotice.isNow()) {
                return this.f50618f.f3();
            }
            return 1;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends RecyclerView.o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ra.g f50619a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f50620b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f50621c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f50622d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ n f50623e;

        public d(ra.g gVar, int i10, int i11, int i12, n nVar) {
            this.f50619a = gVar;
            this.f50620b = i10;
            this.f50621c = i11;
            this.f50622d = i12;
            this.f50623e = nVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            jo.p.h(rect, "outRect");
            jo.p.h(view, "view");
            jo.p.h(recyclerView, "parent");
            jo.p.h(b0Var, "state");
            super.g(rect, view, recyclerView, b0Var);
            int f02 = recyclerView.f0(view);
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            jo.p.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            int f10 = gridLayoutManager.j3().f(f02);
            int e10 = gridLayoutManager.j3().e(f02, gridLayoutManager.f3());
            List<CampaignNotice> a10 = this.f50619a.a();
            jo.p.g(a10, "noticeCampaignAdapter.currentList");
            CampaignNotice campaignNotice = (CampaignNotice) a0.a0(a10, f02);
            if (campaignNotice == null) {
                return;
            }
            campaignNotice.setColumn(e10);
            campaignNotice.setRow(gridLayoutManager.j3().d(f02, gridLayoutManager.f3()));
            if (f10 == 1) {
                if (e10 == 0) {
                    rect.set(this.f50620b, 0, this.f50621c, 0);
                } else {
                    rect.set(this.f50621c, 0, this.f50620b, 0);
                }
                campaignNotice.setColumnsNum(1);
            } else {
                int i10 = this.f50620b;
                rect.set(i10, 0, i10, 0);
                campaignNotice.setColumnsNum(0);
            }
            if (f02 == this.f50619a.getItemCount() - 1) {
                rect.set(rect.left, 0, rect.right, this.f50622d);
            }
            this.f50623e.I3(campaignNotice);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends RecyclerView.u {
        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            jo.p.h(recyclerView, "recyclerView");
            super.b(recyclerView, i10, i11);
            Long f10 = n.this.B3().m().f();
            if (f10 == null) {
                return;
            }
            long longValue = f10.longValue();
            String f11 = n.this.B3().n().f();
            if (f11 == null) {
                return;
            }
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            ha.a f12 = n.this.B3().p().f();
            if (f12 != null && f12.a()) {
                return;
            }
            if ((f11.length() == 0) || linearLayoutManager.l2() + 5 < linearLayoutManager.j0()) {
                return;
            }
            n.this.w3().g(f11, longValue);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<v> {
        public f() {
            super(0);
        }

        public final void a() {
            n.this.w3().h();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.notification.campaign.NoticeCampaignPageFragment$onCreateView$6", f = "NoticeCampaignPageFragment.kt", l = {273}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f50626w;

        /* renamed from: x  reason: collision with root package name */
        public Object f50627x;

        /* renamed from: y  reason: collision with root package name */
        public Object f50628y;

        /* renamed from: z  reason: collision with root package name */
        public int f50629z;

        public g(ao.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new g(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0082, TRY_LEAVE, TryCatch #0 {all -> 0x0082, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f50629z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f50628y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f50627x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f50626w
                ra.n r4 = (ra.n) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> L85
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L53
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                wn.m.b(r10)
                ra.n r10 = ra.n.this
                ra.o r10 = ra.n.t3(r10)
                wo.x r3 = r10.i()
                ra.n r10 = ra.n.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L85
                r4 = r10
                r10 = r9
            L3d:
                r10.f50626w = r4     // Catch: java.lang.Throwable -> L85
                r10.f50627x = r3     // Catch: java.lang.Throwable -> L85
                r10.f50628y = r1     // Catch: java.lang.Throwable -> L85
                r10.f50629z = r2     // Catch: java.lang.Throwable -> L85
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> L85
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r8 = r0
                r0 = r10
                r10 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r8
            L53:
                r6 = 0
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L82
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L82
                if (r10 == 0) goto L7c
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> L82
                java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> L82
                sa.e r6 = ra.n.p3(r5)     // Catch: java.lang.Throwable -> L82
                androidx.recyclerview.widget.RecyclerView r6 = r6.C     // Catch: java.lang.Throwable -> L82
                androidx.recyclerview.widget.RecyclerView$h r6 = r6.getAdapter()     // Catch: java.lang.Throwable -> L82
                java.lang.String r7 = "null cannot be cast to non-null type com.dena.mirrativ.notification.campaign.NoticeCampaignPageAdapter"
                jo.p.f(r6, r7)     // Catch: java.lang.Throwable -> L82
                ra.g r6 = (ra.g) r6     // Catch: java.lang.Throwable -> L82
                r6.d(r10)     // Catch: java.lang.Throwable -> L82
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L7c:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            L82:
                r10 = move-exception
                r3 = r4
                goto L86
            L85:
                r10 = move-exception
            L86:
                throw r10     // Catch: java.lang.Throwable -> L87
            L87:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ra.n.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.notification.campaign.NoticeCampaignPageFragment$onCreateView$7", f = "NoticeCampaignPageFragment.kt", l = {273}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f50630w;

        /* renamed from: x  reason: collision with root package name */
        public Object f50631x;

        /* renamed from: y  reason: collision with root package name */
        public Object f50632y;

        /* renamed from: z  reason: collision with root package name */
        public int f50633z;

        public h(ao.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new h(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0089, TryCatch #0 {all -> 0x0089, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x006e, B:22:0x0079), top: B:33:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r10.f50633z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r10.f50632y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r10.f50631x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r10.f50630w
                ra.n r4 = (ra.n) r4
                wn.m.b(r11)     // Catch: java.lang.Throwable -> L8c
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                goto L53
            L20:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L28:
                wn.m.b(r11)
                ra.n r11 = ra.n.this
                ra.o r11 = ra.n.t3(r11)
                wo.x r3 = r11.j()
                ra.n r11 = ra.n.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L8c
                r4 = r11
                r11 = r10
            L3d:
                r11.f50630w = r4     // Catch: java.lang.Throwable -> L8c
                r11.f50631x = r3     // Catch: java.lang.Throwable -> L8c
                r11.f50632y = r1     // Catch: java.lang.Throwable -> L8c
                r11.f50633z = r2     // Catch: java.lang.Throwable -> L8c
                java.lang.Object r5 = r1.a(r11)     // Catch: java.lang.Throwable -> L8c
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r9 = r0
                r0 = r11
                r11 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r9
            L53:
                r6 = 0
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L89
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L89
                if (r11 == 0) goto L83
                java.lang.Object r11 = r3.next()     // Catch: java.lang.Throwable -> L89
                com.dena.mirrativ.mirrativapi.core.MRError r11 = (com.dena.mirrativ.mirrativapi.core.MRError) r11     // Catch: java.lang.Throwable -> L89
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> L89
                android.content.Context r7 = r5.N2()     // Catch: java.lang.Throwable -> L89
                java.lang.String r11 = r11.getMessage()     // Catch: java.lang.Throwable -> L89
                if (r11 != 0) goto L79
                int r11 = qa.q.f48886a     // Catch: java.lang.Throwable -> L89
                java.lang.String r11 = r5.U0(r11)     // Catch: java.lang.Throwable -> L89
                java.lang.String r8 = "getString(R.string.error_access)"
                jo.p.g(r11, r8)     // Catch: java.lang.Throwable -> L89
            L79:
                r8 = 0
                r6.B(r7, r11, r8)     // Catch: java.lang.Throwable -> L89
                r11 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L83:
                wo.n.a(r4, r6)
                wn.v r11 = wn.v.f59242a
                return r11
            L89:
                r11 = move-exception
                r3 = r4
                goto L8d
            L8c:
                r11 = move-exception
            L8d:
                throw r11     // Catch: java.lang.Throwable -> L8e
            L8e:
                r0 = move-exception
                wo.n.a(r3, r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ra.n.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.notification.campaign.NoticeCampaignPageFragment$onCreateView$8", f = "NoticeCampaignPageFragment.kt", l = {273}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f50634w;

        /* renamed from: x  reason: collision with root package name */
        public Object f50635x;

        /* renamed from: y  reason: collision with root package name */
        public Object f50636y;

        /* renamed from: z  reason: collision with root package name */
        public int f50637z;

        public i(ao.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new i(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #0 {all -> 0x0078, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f50637z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f50636y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f50635x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f50634w
                ra.n r4 = (ra.n) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L7b
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r8
                goto L53
            L20:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L28:
                wn.m.b(r9)
                ra.n r9 = ra.n.this
                nf.o r9 = ra.n.q3(r9)
                wo.x r3 = r9.v()
                ra.n r9 = ra.n.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L7b
                r4 = r9
                r9 = r8
            L3d:
                r9.f50634w = r4     // Catch: java.lang.Throwable -> L7b
                r9.f50635x = r3     // Catch: java.lang.Throwable -> L7b
                r9.f50636y = r1     // Catch: java.lang.Throwable -> L7b
                r9.f50637z = r2     // Catch: java.lang.Throwable -> L7b
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L7b
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r7 = r0
                r0 = r9
                r9 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r7
            L53:
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L78
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L78
                if (r9 == 0) goto L72
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L78
                wn.v r9 = (wn.v) r9     // Catch: java.lang.Throwable -> L78
                sa.e r9 = ra.n.p3(r5)     // Catch: java.lang.Throwable -> L78
                androidx.recyclerview.widget.RecyclerView r9 = r9.C     // Catch: java.lang.Throwable -> L78
                r6 = 0
                r9.x1(r6)     // Catch: java.lang.Throwable -> L78
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L72:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L78:
                r9 = move-exception
                r3 = r4
                goto L7c
            L7b:
                r9 = move-exception
            L7c:
                throw r9     // Catch: java.lang.Throwable -> L7d
            L7d:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ra.n.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class j implements g.b {
        public j() {
        }

        @Override // ra.g.b
        public void a(CampaignNotice campaignNotice) {
            jo.p.h(campaignNotice, "campaignNotice");
            ha.a f10 = n.this.B3().p().f();
            if (f10 != null && f10.a()) {
                return;
            }
            NoticeCampaignPageTargetDetail noticeCampaignPageTargetDetail = new NoticeCampaignPageTargetDetail(campaignNotice);
            n.this.w3().j(campaignNotice);
            if (campaignNotice.getUrl().length() > 0) {
                jf.b0 a10 = n.this.C3().a(campaignNotice.getUrl());
                if (!(a10 instanceof b0.l0)) {
                    androidx.activity.result.c cVar = n.this.H0;
                    HandleUrlSchemeActivity.a aVar = HandleUrlSchemeActivity.f25127b0;
                    Context N2 = n.this.N2();
                    jo.p.g(N2, "requireContext()");
                    cVar.a(aVar.a(N2, Referer.Notice.CAMPAIGN, a10));
                }
            }
            MRLogger z32 = n.this.z3();
            MRLog.Companion companion = MRLog.Companion;
            n nVar = n.this;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_NOTICE_CATALOG_TAP);
            builder.setPageId(nVar.A3().h());
            builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, noticeCampaignPageTargetDetail.toArrayJson())));
            z32.sendLog(builder.build());
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<g0> {
        public k() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final g0 invoke() {
            Serializable serializable = n.this.M2().getSerializable("EXTRA_PAGE_TYPE");
            jo.p.e(serializable);
            return (g0) serializable;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<c0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50640w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50641x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50642y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50640w = componentCallbacks;
            this.f50641x = aVar;
            this.f50642y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.c0] */
        @Override // io.a
        public final c0 invoke() {
            ComponentCallbacks componentCallbacks = this.f50640w;
            return gq.a.a(componentCallbacks).c(f0.b(c0.class), this.f50641x, this.f50642y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<nf.o> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50643w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50644x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50645y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50643w = componentCallbacks;
            this.f50644x = aVar;
            this.f50645y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.o] */
        @Override // io.a
        public final nf.o invoke() {
            ComponentCallbacks componentCallbacks = this.f50643w;
            return gq.a.a(componentCallbacks).c(f0.b(nf.o.class), this.f50644x, this.f50645y);
        }
    }

    /* renamed from: ra.n$n  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0773n extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50646w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50647x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50648y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0773n(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50646w = componentCallbacks;
            this.f50647x = aVar;
            this.f50648y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f50646w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f50647x, this.f50648y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<NoticeCampaignVisibleLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50649w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50650x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50651y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50649w = componentCallbacks;
            this.f50650x = aVar;
            this.f50651y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.NoticeCampaignVisibleLogger, java.lang.Object] */
        @Override // io.a
        public final NoticeCampaignVisibleLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f50649w;
            return gq.a.a(componentCallbacks).c(f0.b(NoticeCampaignVisibleLogger.class), this.f50650x, this.f50651y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<of.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50652w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50653x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50654y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50652w = componentCallbacks;
            this.f50653x = aVar;
            this.f50654y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.k, java.lang.Object] */
        @Override // io.a
        public final of.k invoke() {
            ComponentCallbacks componentCallbacks = this.f50652w;
            return gq.a.a(componentCallbacks).c(f0.b(of.k.class), this.f50653x, this.f50654y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f50655w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Fragment fragment) {
            super(0);
            this.f50655w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f50655w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50656w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(io.a aVar) {
            super(0);
            this.f50656w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f50656w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50657w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50658x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50659y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f50660z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f50657w = aVar;
            this.f50658x = aVar2;
            this.f50659y = aVar3;
            this.f50660z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f50657w;
            vq.a aVar2 = this.f50658x;
            io.a aVar3 = this.f50659y;
            xq.a aVar4 = this.f50660z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(ra.o.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50661w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(io.a aVar) {
            super(0);
            this.f50661w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f50661w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends jo.q implements io.a<uq.a> {
        public u() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            return uq.b.b(n.this.A3());
        }
    }

    public n() {
        b bVar = new b();
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.B0 = wn.g.b(iVar, new l(this, null, bVar));
        u uVar = new u();
        q qVar = new q(this);
        xq.a a10 = gq.a.a(this);
        r rVar = new r(qVar);
        this.C0 = e0.a(this, f0.b(ra.o.class), new t(rVar), new s(qVar, null, uVar, a10));
        this.D0 = wn.g.b(iVar, new m(this, null, null));
        this.E0 = wn.g.b(iVar, new C0773n(this, null, null));
        this.F0 = wn.g.b(iVar, new o(this, null, null));
        this.G0 = wn.g.b(iVar, new p(this, null, null));
        androidx.activity.result.c<Intent> I2 = I2(new c.c(), new androidx.activity.result.b() { // from class: ra.i
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                n.K3(n.this, (androidx.activity.result.a) obj);
            }
        });
        jo.p.g(I2, "registerForActivityResul…nRewards)\n        }\n    }");
        this.H0 = I2;
    }

    public static final void E3(n nVar) {
        jo.p.h(nVar, "this$0");
        boolean z10 = false;
        nVar.x3().B.setRefreshing(false);
        ha.a f10 = nVar.B3().p().f();
        if (f10 != null && f10.a()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        nVar.w3().h();
    }

    public static final void F3(n nVar, ha.a aVar) {
        jo.p.h(nVar, "this$0");
        if (aVar instanceof a.d) {
            nVar.x3().D.b(StatusView.b.c.f20791w);
        } else if (aVar instanceof a.b) {
            nVar.x3().D.b(StatusView.b.C0181b.f20790w);
        } else if (aVar instanceof a.e) {
            nVar.x3().D.b(new StatusView.b.d(nVar.U0(qa.q.f48888f), 0.0f, 2, null));
        } else if ((aVar instanceof a.C0439a) && nVar.B3().h().isEmpty()) {
            StatusView statusView = nVar.x3().D;
            String message = ((a.C0439a) aVar).b().getMessage();
            if (message == null) {
                message = nVar.U0(qa.q.f48886a);
                jo.p.g(message, "getString(R.string.error_access)");
            }
            statusView.b(new StatusView.b.a(message, new f()));
        }
    }

    public static final void G3(n nVar, Integer num) {
        Long f10;
        jo.p.h(nVar, "this$0");
        int e10 = nVar.A3().e();
        if (num != null && num.intValue() == e10 && (f10 = nVar.B3().o().f()) != null && f10.longValue() > 0) {
            nVar.w3().e(f10.longValue(), nVar.B3().k());
            nVar.w3().i(nVar.B3().k());
        }
    }

    public static final void H3(n nVar, Long l10) {
        jo.p.h(nVar, "this$0");
        if (l10 != null && l10.longValue() == 0) {
            return;
        }
        Integer f10 = nVar.y3().o().f();
        int e10 = nVar.A3().e();
        if (f10 != null && f10.intValue() == e10) {
            c0 w32 = nVar.w3();
            jo.p.g(l10, "noticeLatestTime");
            w32.e(l10.longValue(), nVar.B3().k());
            nVar.w3().i(nVar.B3().k());
        }
    }

    public static final void K3(n nVar, androidx.activity.result.a aVar) {
        jo.p.h(nVar, "this$0");
        Integer f10 = nVar.B3().l().f();
        if (f10 != null) {
            nVar.w3().f(f10.intValue());
            nVar.w3().i(nVar.B3().k());
        }
    }

    public final g0 A3() {
        return (g0) this.f50614y0.getValue();
    }

    public final ra.o B3() {
        return (ra.o) this.C0.getValue();
    }

    public final of.k C3() {
        return (of.k) this.G0.getValue();
    }

    public final NoticeCampaignVisibleLogger D3() {
        return (NoticeCampaignVisibleLogger) this.F0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        this.A0 = b3.b(null, 1, null);
        sa.e T = sa.e.T(LayoutInflater.from(N2()), viewGroup, false);
        jo.p.g(T, "inflate(\n            Lay…          false\n        )");
        J3(T);
        x3().B.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: ra.m
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
            public final void a() {
                n.E3(n.this);
            }
        });
        x3().B.setSwipeableChildren(xn.s.m(Integer.valueOf(qa.o.f48885z), Integer.valueOf(qa.o.H)));
        ra.g gVar = new ra.g(new j(), A3());
        x3().C.setAdapter(gVar);
        RecyclerView recyclerView = x3().C;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(N2(), 2);
        gridLayoutManager.o3(new c(gVar, gridLayoutManager));
        recyclerView.setLayoutManager(gridLayoutManager);
        int dimensionPixelSize = O0().getDimensionPixelSize(qa.m.f48870a) / 2;
        x3().C.g(new d(gVar, de.e.b(this, 16), de.e.b(this, 6), dimensionPixelSize, this));
        x3().C.k(new e());
        B3().p().i(a1(), new androidx.lifecycle.f0() { // from class: ra.j
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                n.F3(n.this, (ha.a) obj);
            }
        });
        uo.l.d(this, null, null, new g(null), 3, null);
        uo.l.d(this, null, null, new h(null), 3, null);
        uo.l.d(this, null, null, new i(null), 3, null);
        y3().o().i(a1(), new androidx.lifecycle.f0() { // from class: ra.k
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                n.G3(n.this, (Integer) obj);
            }
        });
        B3().o().i(a1(), new androidx.lifecycle.f0() { // from class: ra.l
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                n.H3(n.this, (Long) obj);
            }
        });
        if (B3().h().isEmpty()) {
            w3().h();
        }
        gVar.d(B3().h());
        View u10 = x3().u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    @Override // androidx.fragment.app.Fragment
    public void H1() {
        r0.d(this, null, 1, null);
        super.H1();
    }

    public final void I3(CampaignNotice campaignNotice) {
        D3().sendNoticeCampaignVisibleLog(campaignNotice, A3().h());
    }

    public final void J3(sa.e eVar) {
        this.f50615z0.a(this, J0[0], eVar);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return g1.c().plus(this.A0).plus(new da.c());
    }

    public final c0 w3() {
        return (c0) this.B0.getValue();
    }

    public final sa.e x3() {
        return (sa.e) this.f50615z0.b(this, J0[0]);
    }

    public final nf.o y3() {
        return (nf.o) this.D0.getValue();
    }

    public final MRLogger z3() {
        return (MRLogger) this.E0.getValue();
    }
}
