package gc;

import ac.v1;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.dena.mirrativ.mirrativapi.core.StatusResponse;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.live.LinkedLive;
import com.dena.mirrorman.net.api.response.user.UserBasicWithGraphParams;
import com.dena.mirrorman.net.api.response.user.UserOnLive;
import com.dena.mirrorman.net.api.response.user.UsersResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import fa.b;
import oq.a;
import uo.q0;
import uo.r0;
import yd.g1;

/* loaded from: classes2.dex */
public final class b extends FrameLayout implements fa.b, AbsListView.OnScrollListener, oq.a, q0 {
    public static final d I = new d(null);
    public static final int J = 8;
    public final c A;
    public final String B;
    public boolean C;
    public int D;
    public boolean E;
    public String F;
    public io.l<? super LinkedLive, wn.v> G;
    public io.a<wn.v> H;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ da.j f32851w;

    /* renamed from: x  reason: collision with root package name */
    public final wn.f f32852x;

    /* renamed from: y  reason: collision with root package name */
    public final wn.f f32853y;

    /* renamed from: z  reason: collision with root package name */
    public final v1 f32854z;

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.l<View, wn.v> {
        public a() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            b.this.getFloatViewManager().c(b.this);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* renamed from: gc.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0384b extends jo.q implements io.l<View, wn.v> {
        public C0384b() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            io.a<wn.v> onClickBack = b.this.getOnClickBack();
            if (onClickBack != null) {
                onClickBack.invoke();
            }
            b.this.getFloatViewManager().c(b.this);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends ArrayAdapter<UserBasicWithGraphParams> {

        /* renamed from: w  reason: collision with root package name */
        public final io.l<UserBasicWithGraphParams, wn.v> f32857w;

        /* renamed from: x  reason: collision with root package name */
        public LinkedLive f32858x;

        /* loaded from: classes2.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            public final ImageView f32859a;

            /* renamed from: b  reason: collision with root package name */
            public final ImageView f32860b;

            /* renamed from: c  reason: collision with root package name */
            public final TextView f32861c;

            /* renamed from: d  reason: collision with root package name */
            public final View f32862d;

            /* renamed from: e  reason: collision with root package name */
            public final ImageView f32863e;

            /* renamed from: gc.b$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0385a extends jo.q implements io.l<View, wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ c f32864w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ UserBasicWithGraphParams f32865x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0385a(c cVar, UserBasicWithGraphParams userBasicWithGraphParams) {
                    super(1);
                    this.f32864w = cVar;
                    this.f32865x = userBasicWithGraphParams;
                }

                public final void a(View view) {
                    jo.p.h(view, "it");
                    this.f32864w.f32857w.invoke(this.f32865x);
                }

                @Override // io.l
                public /* bridge */ /* synthetic */ wn.v invoke(View view) {
                    a(view);
                    return wn.v.f59242a;
                }
            }

            public a(View view) {
                jo.p.h(view, "itemView");
                View findViewById = view.findViewById(xb.o.imageView);
                jo.p.f(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
                this.f32859a = (ImageView) findViewById;
                View findViewById2 = view.findViewById(xb.o.badgeImageView);
                jo.p.f(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
                this.f32860b = (ImageView) findViewById2;
                View findViewById3 = view.findViewById(xb.o.nameView);
                jo.p.f(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
                this.f32861c = (TextView) findViewById3;
                View findViewById4 = view.findViewById(xb.o.linkButtonView);
                jo.p.f(findViewById4, "null cannot be cast to non-null type android.view.View");
                this.f32862d = findViewById4;
                View findViewById5 = view.findViewById(xb.o.linkButtonImageView);
                jo.p.f(findViewById5, "null cannot be cast to non-null type android.widget.ImageView");
                this.f32863e = (ImageView) findViewById5;
                view.setTag(this);
            }

            public final void a(UserBasicWithGraphParams userBasicWithGraphParams, c cVar) {
                jo.p.h(userBasicWithGraphParams, MRLog.TARGET_TYPE_USER);
                jo.p.h(cVar, "adapter");
                this.f32861c.setText(userBasicWithGraphParams.getName());
                de.f.e(this.f32859a, userBasicWithGraphParams.getProfileImageUrl(), Integer.valueOf(xb.n.f59959f0));
                if (of.b.a(userBasicWithGraphParams.getBadges())) {
                    this.f32860b.setVisibility(8);
                } else {
                    of.f fVar = of.f.f45394a;
                    Context context = cVar.getContext();
                    jo.p.g(context, "adapter.context");
                    fVar.c(context, userBasicWithGraphParams.getBadges().get(0).getImageUrl(), this.f32860b);
                    this.f32860b.setVisibility(0);
                }
                UserOnLive onlive = userBasicWithGraphParams.getOnlive();
                String liveId = onlive != null ? onlive.getLiveId() : null;
                LinkedLive b10 = cVar.b();
                if (jo.p.c(liveId, b10 != null ? b10.getLiveId() : null)) {
                    this.f32863e.setImageResource(xb.q.btn_friend_link_selected);
                } else {
                    this.f32863e.setImageResource(xb.q.btn_friend_link_default);
                }
                g1.a(this.f32862d, new C0385a(cVar, userBasicWithGraphParams));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Context context, io.l<? super UserBasicWithGraphParams, wn.v> lVar) {
            super(context, t.c());
            jo.p.h(context, "context");
            jo.p.h(lVar, "onClickLink");
            this.f32857w = lVar;
        }

        public final LinkedLive b() {
            return this.f32858x;
        }

        public final void c(LinkedLive linkedLive) {
            this.f32858x = linkedLive;
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
            if (r4 == null) goto L11;
         */
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.view.View getView(int r3, android.view.View r4, android.view.ViewGroup r5) {
            /*
                r2 = this;
                java.lang.String r0 = "parent"
                jo.p.h(r5, r0)
                if (r4 == 0) goto L18
                java.lang.Object r0 = r4.getTag()
                java.lang.String r1 = "null cannot be cast to non-null type com.dena.mirrativ.streaming.floating.setting.FloatLiveLinkBroadcastersView.Adapter.ViewHolder"
                jo.p.f(r0, r1)
                gc.b$c$a r0 = (gc.b.c.a) r0
                wn.k r4 = wn.q.a(r4, r0)
                if (r4 != 0) goto L37
            L18:
                android.content.Context r4 = r2.getContext()
                android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
                int r0 = gc.t.c()
                r1 = 0
                android.view.View r4 = r4.inflate(r0, r5, r1)
                gc.b$c$a r5 = new gc.b$c$a
                java.lang.String r0 = "it"
                jo.p.g(r4, r0)
                r5.<init>(r4)
                wn.k r4 = wn.q.a(r4, r5)
            L37:
                java.lang.Object r5 = r4.a()
                android.view.View r5 = (android.view.View) r5
                java.lang.Object r4 = r4.b()
                gc.b$c$a r4 = (gc.b.c.a) r4
                java.lang.Object r3 = r2.getItem(r3)
                com.dena.mirrorman.net.api.response.user.UserBasicWithGraphParams r3 = (com.dena.mirrorman.net.api.response.user.UserBasicWithGraphParams) r3
                if (r3 != 0) goto L4c
                return r5
            L4c:
                r4.a(r3, r2)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: gc.b.c.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    /* loaded from: classes2.dex */
    public static final class d {
        public d() {
        }

        public /* synthetic */ d(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.l<UserBasicWithGraphParams, wn.v> {
        public e() {
            super(1);
        }

        public final void a(UserBasicWithGraphParams userBasicWithGraphParams) {
            jo.p.h(userBasicWithGraphParams, "it");
            b.this.k(userBasicWithGraphParams);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(UserBasicWithGraphParams userBasicWithGraphParams) {
            a(userBasicWithGraphParams);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.floating.setting.FloatLiveLinkBroadcastersView$fetchNextLiveViewers$1", f = "FloatingLiveLinkBroadcastersView.kt", l = {TsExtractor.TS_STREAM_TYPE_AC3}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f32867w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Integer f32869y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Integer num, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f32869y = num;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f32869y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f32867w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest request = b.this.getRequest();
                    String str = b.this.B;
                    Integer num = this.f32869y;
                    Integer d10 = co.b.d(0);
                    Integer d11 = co.b.d(1);
                    this.f32867w = 1;
                    obj = request.getSearchUsers(str, "", num, d10, d11, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                UsersResponse usersResponse = (UsersResponse) obj;
                b.this.D = usersResponse.getNextPage();
                b.this.A.addAll(usersResponse.getUsers());
                b.this.C = false;
            } catch (Throwable unused) {
                b.this.C = false;
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<fa.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f32870w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f32871x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f32872y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f32870w = aVar;
            this.f32871x = aVar2;
            this.f32872y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, fa.c] */
        @Override // io.a
        public final fa.c invoke() {
            xq.a b10;
            oq.a aVar = this.f32870w;
            vq.a aVar2 = this.f32871x;
            io.a<? extends uq.a> aVar3 = this.f32872y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(fa.c.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<MRRequest> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f32873w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f32874x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f32875y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f32873w = aVar;
            this.f32874x = aVar2;
            this.f32875y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.net.retrofit.MRRequest, java.lang.Object] */
        @Override // io.a
        public final MRRequest invoke() {
            xq.a b10;
            oq.a aVar = this.f32873w;
            vq.a aVar2 = this.f32874x;
            io.a<? extends uq.a> aVar3 = this.f32875y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(MRRequest.class), aVar2, aVar3);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.floating.setting.FloatLiveLinkBroadcastersView$toggleLink$1", f = "FloatingLiveLinkBroadcastersView.kt", l = {161, 163}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ UserBasicWithGraphParams A;
        public final /* synthetic */ LinkedLive B;

        /* renamed from: w  reason: collision with root package name */
        public int f32876w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ LinkedLive f32877x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b f32878y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f32879z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(LinkedLive linkedLive, b bVar, String str, UserBasicWithGraphParams userBasicWithGraphParams, LinkedLive linkedLive2, ao.d<? super i> dVar) {
            super(2, dVar);
            this.f32877x = linkedLive;
            this.f32878y = bVar;
            this.f32879z = str;
            this.A = userBasicWithGraphParams;
            this.B = linkedLive2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i(this.f32877x, this.f32878y, this.f32879z, this.A, this.B, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f32876w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    if (this.f32877x == null) {
                        MRRequest request = this.f32878y.getRequest();
                        String str = this.f32878y.B;
                        String str2 = this.f32879z;
                        this.f32876w = 1;
                        obj = request.postLiveUnlink(str, str2, this);
                        if (obj == c10) {
                            return c10;
                        }
                        StatusResponse statusResponse = (StatusResponse) obj;
                    } else {
                        MRRequest request2 = this.f32878y.getRequest();
                        String str3 = this.f32878y.B;
                        String str4 = this.f32879z;
                        UserOnLive onlive = this.A.getOnlive();
                        String liveId = onlive != null ? onlive.getLiveId() : null;
                        this.f32876w = 2;
                        obj = request2.postLiveLink(str3, str4, liveId, this);
                        if (obj == c10) {
                            return c10;
                        }
                        StatusResponse statusResponse2 = (StatusResponse) obj;
                    }
                } else if (i10 == 1) {
                    wn.m.b(obj);
                    StatusResponse statusResponse3 = (StatusResponse) obj;
                } else if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                    StatusResponse statusResponse22 = (StatusResponse) obj;
                }
                this.f32878y.E = false;
                LinkedLive linkedLive = this.f32877x;
                if (linkedLive != null) {
                    b bVar = this.f32878y;
                    fa.c floatViewManager = bVar.getFloatViewManager();
                    Context context = bVar.getContext();
                    jo.p.g(context, "context");
                    m0 m0Var = new m0(context);
                    int i11 = xb.l.f59943n;
                    String string = m0Var.getResources().getString(xb.r.text_friend_selected_ttl);
                    jo.p.g(string, "resources.getString(R.st…text_friend_selected_ttl)");
                    String string2 = m0Var.getResources().getString(xb.r.text_friend_selected_body, linkedLive.getOwnerName());
                    jo.p.g(string2, "resources.getString(\n   …                        )");
                    m0Var.b(i11, string, string2, false);
                    floatViewManager.f(m0Var);
                }
                io.l<LinkedLive, wn.v> onUpdateLinkedLive = this.f32878y.getOnUpdateLinkedLive();
                if (onUpdateLinkedLive != null) {
                    onUpdateLinkedLive.invoke(this.f32877x);
                }
            } catch (Exception unused) {
                this.f32878y.A.c(this.B);
                this.f32878y.A.notifyDataSetChanged();
            }
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        jo.p.h(context, "context");
        this.f32851w = new da.j();
        cr.a aVar = cr.a.f28611a;
        this.f32852x = wn.g.b(aVar.b(), new g(this, null, null));
        this.f32853y = wn.g.b(aVar.b(), new h(this, null, null));
        v1 T = v1.T(LayoutInflater.from(context), this, true);
        jo.p.g(T, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.f32854z = T;
        c cVar = new c(context, new e());
        this.A = cVar;
        this.B = Referer.Broadcast.VIEWERLIST;
        this.D = 1;
        T.D.requestFocus();
        AppCompatImageView appCompatImageView = T.D;
        jo.p.g(appCompatImageView, "binding.closeButtonView");
        g1.a(appCompatImageView, new a());
        AppCompatImageView appCompatImageView2 = T.B;
        jo.p.g(appCompatImageView2, "binding.backButtonView");
        g1.a(appCompatImageView2, new C0384b());
        T.C.setOnScrollListener(this);
        T.C.setAdapter((ListAdapter) cVar);
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fa.c getFloatViewManager() {
        return (fa.c) this.f32852x.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MRRequest getRequest() {
        return (MRRequest) this.f32853y.getValue();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f32851w.getCoroutineContext();
    }

    @Override // fa.b
    public View getFloatViewContentView() {
        return this;
    }

    @Override // fa.b
    public int getFloatViewGravity() {
        return b.a.a(this);
    }

    @Override // fa.b
    public int getFloatViewLayoutFlags() {
        return 32;
    }

    @Override // fa.b
    public int getFloatViewLayoutHeight() {
        return -2;
    }

    @Override // fa.b
    public int getFloatViewLayoutWidth() {
        return -2;
    }

    @Override // fa.b
    public String getFloatViewTag() {
        return "FloatLiveLinkBroadcastersView";
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    public final LinkedLive getLinkedLive() {
        return this.A.b();
    }

    public final String getLiveId() {
        return this.F;
    }

    public final io.a<wn.v> getOnClickBack() {
        return this.H;
    }

    public final io.l<LinkedLive, wn.v> getOnUpdateLinkedLive() {
        return this.G;
    }

    public final void j() {
        int i10;
        if (TextUtils.isEmpty(this.F) || this.C || (i10 = this.D) < 1) {
            return;
        }
        this.C = true;
        uo.l.d(this, null, null, new f(i10 >= 1 ? Integer.valueOf(i10) : null, null), 3, null);
    }

    public final void k(UserBasicWithGraphParams userBasicWithGraphParams) {
        LinkedLive b10;
        LinkedLive linkedLive;
        if (this.E) {
            return;
        }
        this.E = true;
        LinkedLive b11 = this.A.b();
        UserOnLive onlive = userBasicWithGraphParams.getOnlive();
        if (jo.p.c(onlive != null ? onlive.getLiveId() : null, b11 != null ? b11.getLiveId() : null)) {
            linkedLive = null;
        } else {
            b10 = t.b(userBasicWithGraphParams);
            linkedLive = b10;
        }
        this.A.c(linkedLive);
        this.A.notifyDataSetChanged();
        String str = this.F;
        if (str == null) {
            return;
        }
        uo.l.d(this, null, null, new i(linkedLive, this, str, userBasicWithGraphParams, b11, null), 3, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        r0.d(this, null, 1, null);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        jo.p.h(absListView, "absListView");
        if (i12 != i10 + i11) {
            return;
        }
        j();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i10) {
        jo.p.h(absListView, "view");
    }

    public final void setLinkedLive(LinkedLive linkedLive) {
        this.A.c(linkedLive);
    }

    public final void setLiveId(String str) {
        this.F = str;
    }

    public final void setOnClickBack(io.a<wn.v> aVar) {
        this.H = aVar;
    }

    public final void setOnUpdateLinkedLive(io.l<? super LinkedLive, wn.v> lVar) {
        this.G = lVar;
    }
}
