package dc;

import ac.p2;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import androidx.appcompat.widget.AppCompatImageView;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.live.LiveWatchedUsersResponse;
import com.dena.mirrorman.net.api.response.user.UserBasicWithGraphParams;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import fa.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import jo.e0;
import jo.f0;
import oq.a;
import uo.q0;
import uo.r0;
import xb.k0;
import yd.g1;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class k extends FrameLayout implements fa.b, AbsListView.OnScrollListener, q0, oq.a {
    public static final c G = new c(null);
    public static final int H = 8;
    public final p2 A;
    public final String B;
    public int C;
    public k0 D;
    public ArrayList<Integer> E;
    public int F;

    /* renamed from: w  reason: collision with root package name */
    public final String f29423w;

    /* renamed from: x  reason: collision with root package name */
    public final HashMap<String, String> f29424x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ da.j f29425y;

    /* renamed from: z  reason: collision with root package name */
    public final wn.f f29426z;

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.l<View, wn.v> {
        public a() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            k.this.k();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            k.this.l();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public c() {
        }

        public /* synthetic */ c(jo.h hVar) {
            this();
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.floating.FloatingViewerListView$getLiveViewers$1", f = "FloatingViewerListView.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f29429w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ e0<Integer> f29431y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f29432z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e0<Integer> e0Var, int i10, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f29431y = e0Var;
            this.f29432z = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f29431y, this.f29432z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f29429w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    this.f29429w = 1;
                    obj = k.this.getRequest().getLiveWatchedUsers(k.this.B, k.this.f29423w, this.f29431y.f38136w, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                LiveWatchedUsersResponse liveWatchedUsersResponse = (LiveWatchedUsersResponse) obj;
                k.this.i(liveWatchedUsersResponse.getUsers(), liveWatchedUsersResponse.getCurrentPage(), liveWatchedUsersResponse.getNextPage());
            } catch (Exception e10) {
                k.this.n(this.f29432z);
                MRError error = MRErrorKt.convertMRException(e10).getError();
                if (error instanceof MRError.ForceUpdate ? true : jo.p.c(error, MRError.Maintenance.INSTANCE)) {
                    of.n.f45411a.l(k.this.getContext(), error);
                } else {
                    of.n nVar = of.n.f45411a;
                    Context context = k.this.getContext();
                    String message = error.getMessage();
                    if (message == null) {
                        message = k.this.getContext().getString(xb.r.f60070c);
                        jo.p.g(message, "context.getString(R.string.error_access)");
                    }
                    nVar.B(context, message, false);
                }
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<MRRequest> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f29433w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f29434x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f29435y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f29433w = aVar;
            this.f29434x = aVar2;
            this.f29435y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.net.retrofit.MRRequest, java.lang.Object] */
        @Override // io.a
        public final MRRequest invoke() {
            xq.a b10;
            oq.a aVar = this.f29433w;
            vq.a aVar2 = this.f29434x;
            io.a<? extends uq.a> aVar3 = this.f29435y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(MRRequest.class), aVar2, aVar3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, String str, HashMap<String, String> hashMap) {
        super(context);
        jo.p.h(context, "context");
        jo.p.h(str, "liveId");
        jo.p.h(hashMap, "commentList");
        this.f29423w = str;
        this.f29424x = hashMap;
        this.f29425y = new da.j();
        this.f29426z = wn.g.b(cr.a.f28611a.b(), new e(this, null, null));
        p2 T = p2.T(LayoutInflater.from(context), this, true);
        jo.p.g(T, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.A = T;
        this.B = Referer.Broadcast.VIEWERLIST;
        this.C = 1;
        this.E = new ArrayList<>();
        this.F = 1;
        AppCompatImageView appCompatImageView = T.B;
        jo.p.g(appCompatImageView, "binding.back");
        g1.a(appCompatImageView, new a());
        AppCompatImageView appCompatImageView2 = T.C;
        jo.p.g(appCompatImageView2, "binding.closeControl");
        g1.a(appCompatImageView2, new b());
        T.C.requestFocus();
        T.E.setOnScrollListener(this);
        m(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MRRequest getRequest() {
        return (MRRequest) this.f29426z.getValue();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f29425y.getCoroutineContext();
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
        return "FloatViewerListView";
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    public final void i(List<? extends UserBasicWithGraphParams> list, int i10, int i11) {
        this.C = i10;
        this.F = i11;
        k0 k0Var = this.D;
        if (k0Var == null) {
            Context context = getContext();
            jo.p.g(context, "context");
            k0 k0Var2 = new k0(context, xb.p.item_userlist_block, list);
            this.D = k0Var2;
            jo.p.e(k0Var2);
            k0Var2.h(this.f29424x);
            this.A.E.setAdapter((ListAdapter) this.D);
            return;
        }
        jo.p.e(k0Var);
        k0Var.addAll(list);
    }

    public final boolean j() {
        return this.C > this.F;
    }

    public final void k() {
        dq.c.c().l(new nd.v());
    }

    public final void l() {
        dq.c.c().l(new nd.w());
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.Integer] */
    public final void m(int i10) {
        if (TextUtils.isEmpty(this.f29423w) || this.E.contains(Integer.valueOf(i10))) {
            return;
        }
        this.E.add(Integer.valueOf(i10));
        e0 e0Var = new e0();
        if (i10 > 1) {
            e0Var.f38136w = Integer.valueOf(i10);
        }
        uo.l.d(this, null, null, new d(e0Var, i10, null), 3, null);
    }

    public final void n(int i10) {
        int indexOf = this.E.indexOf(Integer.valueOf(i10));
        if (indexOf > 0) {
            this.E.remove(indexOf);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        r0.d(this, null, 1, null);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        jo.p.h(absListView, "absListView");
        if (i12 != i10 + i11 || j()) {
            return;
        }
        m(this.F);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i10) {
        jo.p.h(absListView, "view");
    }
}
