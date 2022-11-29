package ec;

import ac.m1;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StyleSpan;
import android.util.Size;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.t;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.streaming.emomo.StreamEmomoActivity;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.live.LiveCommentResponse;
import com.dena.mirrorman.net.api.response.live.LiveDetailResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mirrativ.llstream.decoder.PacketJitterConfig;
import dc.j;
import ec.e;
import hf.v0;
import java.util.LinkedList;
import java.util.List;
import jo.f0;
import nd.d0;
import nd.i1;
import of.e;
import oq.a;
import tb.c;
import ud.d4;
import ud.n4;
import uo.d2;
import uo.g1;
import uo.i2;
import uo.o2;
import uo.q0;
import uo.r0;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class z extends sd.a implements e.b, oq.a {

    /* renamed from: k0  reason: collision with root package name */
    public static final b f30451k0 = new b(null);

    /* renamed from: l0  reason: collision with root package name */
    public static final int f30452l0 = 8;
    public final String G;
    public final wn.f H;
    public final wn.f I;
    public final wn.f J;
    public final wn.f K;
    public final wn.f L;
    public final wn.f M;
    public final wn.f N;
    public final wn.f O;
    public final wn.f P;
    public final wn.f Q;
    public final m1 R;
    public final LinkedList<d4> S;
    public final Size T;
    public final Handler U;
    public final int V;
    public final View.OnTouchListener W;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f30453a0;

    /* renamed from: b0  reason: collision with root package name */
    public d2 f30454b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f30455c0;

    /* renamed from: d0  reason: collision with root package name */
    public long f30456d0;

    /* renamed from: e0  reason: collision with root package name */
    public LinearLayoutManager f30457e0;

    /* renamed from: f0  reason: collision with root package name */
    public LinearLayoutManager f30458f0;

    /* renamed from: g0  reason: collision with root package name */
    public a0 f30459g0;

    /* renamed from: h0  reason: collision with root package name */
    public Runnable f30460h0;

    /* renamed from: i0  reason: collision with root package name */
    public String f30461i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f30462j0;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.u {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            jo.p.h(recyclerView, "recyclerView");
            super.b(recyclerView, i10, i11);
            z.this.R.L.setVisibility(8);
            LinearLayoutManager linearLayoutManager = z.this.f30457e0;
            if (linearLayoutManager != null) {
                z.this.f30455c0 = linearLayoutManager.i2();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }

        public final Size b(Context context) {
            e.a c10 = of.e.c(context);
            int d10 = of.e.d(context);
            int b10 = of.e.b(context);
            int a10 = of.e.a(context);
            if (a10 != 80) {
                if (a10 != 8388613) {
                    return new Size(c10.d(), c10.b());
                }
                return new Size(c10.d() - b10, c10.b() - d10);
            }
            return new Size(c10.d(), (c10.b() - d10) - b10);
        }
    }

    /* loaded from: classes2.dex */
    public final class c {
        public c() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends RecyclerView.j {
        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i10, int i11) {
            super.d(i10, i11);
            RecyclerView.p layoutManager = z.this.R.G.getLayoutManager();
            jo.p.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            if (((LinearLayoutManager) layoutManager).i2() == 0) {
                z.this.R.G.p1(0);
            }
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.floating.comment.FloatingCommentView$onClickLinkedLive$1", f = "FloatingCommentView.kt", l = {370}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f30470w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f30472y;

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.l<Intent, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ z f30473w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(z zVar) {
                super(1);
                this.f30473w = zVar;
            }

            public final void a(Intent intent) {
                jo.p.h(intent, "it");
                intent.addFlags(335544320);
                PendingIntent.getActivity(this.f30473w.getContext(), 0, intent, 201326592).send();
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(Intent intent) {
                a(intent);
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f30472y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f30472y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f30470w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest request = z.this.getRequest();
                    String str = this.f30472y;
                    this.f30470w = 1;
                    obj = request.getLiveDetail(Referer.BROADCAST, str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                Context context = z.this.getContext();
                jo.p.g(context, "context");
                new ce.x(context, new a(z.this)).a((LiveDetailResponse) obj, Referer.BROADCAST);
            } catch (Throwable unused) {
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.floating.comment.FloatingCommentView$postComment$1$1", f = "FloatingCommentView.kt", l = {726}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f30474w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f30476y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f30476y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f30476y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            Object postLiveComment$default;
            Object c10 = bo.c.c();
            int i10 = this.f30474w;
            boolean z11 = true;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest request = z.this.getRequest();
                    String str = z.this.G;
                    String str2 = this.f30476y;
                    this.f30474w = 1;
                    z10 = true;
                    z11 = true;
                    try {
                        postLiveComment$default = MRRequest.DefaultImpls.postLiveComment$default(request, Referer.BROADCAST, str, 1, str2, null, null, null, null, null, null, null, this, 2032, null);
                        if (postLiveComment$default == c10) {
                            return c10;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        MRError error = MRErrorKt.convertMRException(th).getError();
                        if (error instanceof MRError.Maintenance ? z10 : jo.p.c(error, MRError.ForceUpdate.INSTANCE)) {
                            of.n.f45411a.l(z.this.getContext(), error);
                        } else {
                            of.n nVar = of.n.f45411a;
                            Context context = z.this.getContext();
                            String message = error.getMessage();
                            if (message == null) {
                                message = z.this.getContext().getString(xb.r.f60070c);
                                jo.p.g(message, "context.getString(R.string.error_access)");
                            }
                            nVar.B(context, message, false);
                            if (TextUtils.isEmpty(z.this.R.I.getText())) {
                                z.this.R.I.setText(this.f30476y);
                            }
                        }
                        return wn.v.f59242a;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                    postLiveComment$default = obj;
                    z10 = true;
                }
                LiveCommentResponse liveCommentResponse = (LiveCommentResponse) postLiveComment$default;
            } catch (Throwable th3) {
                th = th3;
                z10 = z11;
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h implements ViewTreeObserver.OnGlobalLayoutListener {
        public h() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            z.this.t();
            z.this.R.O.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<fa.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f30478w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f30479x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f30480y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f30478w = aVar;
            this.f30479x = aVar2;
            this.f30480y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, fa.c] */
        @Override // io.a
        public final fa.c invoke() {
            xq.a b10;
            oq.a aVar = this.f30478w;
            vq.a aVar2 = this.f30479x;
            io.a<? extends uq.a> aVar3 = this.f30480y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(fa.c.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<od.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f30481w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f30482x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f30483y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f30481w = aVar;
            this.f30482x = aVar2;
            this.f30483y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.b] */
        @Override // io.a
        public final od.b invoke() {
            xq.a b10;
            oq.a aVar = this.f30481w;
            vq.a aVar2 = this.f30482x;
            io.a<? extends uq.a> aVar3 = this.f30483y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(od.b.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<nf.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f30484w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f30485x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f30486y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f30484w = aVar;
            this.f30485x = aVar2;
            this.f30486y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.c] */
        @Override // io.a
        public final nf.c invoke() {
            xq.a b10;
            oq.a aVar = this.f30484w;
            vq.a aVar2 = this.f30485x;
            io.a<? extends uq.a> aVar3 = this.f30486y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(nf.c.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<od.p> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f30487w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f30488x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f30489y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f30487w = aVar;
            this.f30488x = aVar2;
            this.f30489y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.p, java.lang.Object] */
        @Override // io.a
        public final od.p invoke() {
            xq.a b10;
            oq.a aVar = this.f30487w;
            vq.a aVar2 = this.f30488x;
            io.a<? extends uq.a> aVar3 = this.f30489y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(od.p.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<nf.o> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f30490w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f30491x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f30492y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f30490w = aVar;
            this.f30491x = aVar2;
            this.f30492y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.o] */
        @Override // io.a
        public final nf.o invoke() {
            xq.a b10;
            oq.a aVar = this.f30490w;
            vq.a aVar2 = this.f30491x;
            io.a<? extends uq.a> aVar3 = this.f30492y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(nf.o.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f30493w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f30494x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f30495y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f30493w = aVar;
            this.f30494x = aVar2;
            this.f30495y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            xq.a b10;
            oq.a aVar = this.f30493w;
            vq.a aVar2 = this.f30494x;
            io.a<? extends uq.a> aVar3 = this.f30495y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(tb.c.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f30496w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f30497x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f30498y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f30496w = aVar;
            this.f30497x = aVar2;
            this.f30498y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            xq.a b10;
            oq.a aVar = this.f30496w;
            vq.a aVar2 = this.f30497x;
            io.a<? extends uq.a> aVar3 = this.f30498y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(MRLogger.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<MRRequest> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f30499w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f30500x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f30501y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f30499w = aVar;
            this.f30500x = aVar2;
            this.f30501y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.net.retrofit.MRRequest, java.lang.Object] */
        @Override // io.a
        public final MRRequest invoke() {
            xq.a b10;
            oq.a aVar = this.f30499w;
            vq.a aVar2 = this.f30500x;
            io.a<? extends uq.a> aVar3 = this.f30501y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(MRRequest.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.a<i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f30502w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f30503x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f30504y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f30502w = aVar;
            this.f30503x = aVar2;
            this.f30504y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final i1 invoke() {
            xq.a b10;
            oq.a aVar = this.f30502w;
            vq.a aVar2 = this.f30503x;
            io.a<? extends uq.a> aVar3 = this.f30504y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(i1.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f30505w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f30506x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f30507y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f30505w = aVar;
            this.f30506x = aVar2;
            this.f30507y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final v0 invoke() {
            xq.a b10;
            oq.a aVar = this.f30505w;
            vq.a aVar2 = this.f30506x;
            io.a<? extends uq.a> aVar3 = this.f30507y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(v0.class), aVar2, aVar3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Context context, String str) {
        super(context);
        jo.p.h(context, "context");
        jo.p.h(str, "mLiveID");
        this.G = str;
        cr.a aVar = cr.a.f28611a;
        this.H = wn.g.b(aVar.b(), new j(this, null, null));
        this.I = wn.g.b(aVar.b(), new k(this, null, null));
        this.J = wn.g.b(aVar.b(), new l(this, null, null));
        this.K = wn.g.b(aVar.b(), new m(this, null, null));
        this.L = wn.g.b(aVar.b(), new n(this, null, null));
        this.M = wn.g.b(aVar.b(), new o(this, null, null));
        this.N = wn.g.b(aVar.b(), new p(this, null, null));
        this.O = wn.g.b(aVar.b(), new q(this, null, null));
        this.P = wn.g.b(aVar.b(), new r(this, null, null));
        this.Q = wn.g.b(aVar.b(), new i(this, null, null));
        m1 m1Var = (m1) androidx.databinding.f.e(LayoutInflater.from(getContext()), xb.p.floating_comment, this, true);
        this.R = m1Var;
        this.S = new LinkedList<>();
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: ec.w
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean j02;
                j02 = z.j0(z.this, view, motionEvent);
                return j02;
            }
        };
        this.W = onTouchListener;
        setMLayoutParams(X(false, false));
        this.V = context.getResources().getConfiguration().orientation;
        this.T = f30451k0.b(context);
        r0();
        o0();
        m1Var.E.setOnClickListener(new View.OnClickListener() { // from class: ec.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z.J(z.this, view);
            }
        });
        m1Var.I.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ec.x
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                boolean K;
                K = z.K(z.this, textView, i10, keyEvent);
                return K;
            }
        });
        m1Var.I.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: ec.u
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                z.L(z.this, view, z10);
            }
        });
        m1Var.I.setOnLongClickListener(new View.OnLongClickListener() { // from class: ec.v
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean M;
                M = z.M(z.this, view);
                return M;
            }
        });
        m1Var.L.setOnClickListener(new View.OnClickListener() { // from class: ec.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z.N(z.this, view);
            }
        });
        s0();
        ec.e eVar = new ec.e();
        eVar.registerAdapterDataObserver(new e());
        eVar.p(this);
        m1Var.G.setAdapter(eVar);
        m1Var.G.g(new p001if.b(de.n.b(this, 4)));
        m1Var.G.requestFocus();
        getCastServiceStore().S().i((androidx.lifecycle.u) context, new androidx.lifecycle.f0() { // from class: ec.y
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                z.O(z.this, (List) obj);
            }
        });
        this.f30455c0 = 0;
        m1Var.G.k(new a());
        this.U = new Handler();
        if (this.f30460h0 == null) {
            this.f30460h0 = new Runnable() { // from class: ec.p
                @Override // java.lang.Runnable
                public final void run() {
                    z.P(z.this);
                }
            };
        }
        setViewCount(0);
        m0();
        setOnTouchListener(onTouchListener);
    }

    public static final void J(z zVar, View view) {
        jo.p.h(zVar, "this$0");
        zVar.W();
    }

    public static final boolean K(z zVar, TextView textView, int i10, KeyEvent keyEvent) {
        jo.p.h(zVar, "this$0");
        if (i10 == 4) {
            zVar.l0(zVar.R.I.getText().toString());
            return true;
        }
        return false;
    }

    public static final void L(z zVar, View view, boolean z10) {
        jo.p.h(zVar, "this$0");
        if (z10) {
            zVar.C0(true);
            Object systemService = zVar.getMContext().getSystemService("input_method");
            jo.p.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(view, 1);
            return;
        }
        Object systemService2 = zVar.getMContext().getSystemService("input_method");
        jo.p.f(systemService2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService2).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static final boolean M(z zVar, View view) {
        jo.p.h(zVar, "this$0");
        zVar.R.L.setVisibility(0);
        return true;
    }

    public static final void N(z zVar, View view) {
        jo.p.h(zVar, "this$0");
        zVar.R.L.setVisibility(8);
        of.n nVar = of.n.f45411a;
        Context mContext = zVar.getMContext();
        EditText editText = zVar.R.I;
        jo.p.g(editText, "binding.floatCommentPost");
        nVar.t(mContext, editText);
    }

    public static final void O(z zVar, List list) {
        jo.p.h(zVar, "this$0");
        RecyclerView.h adapter = zVar.R.G.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrativ.streaming.floating.comment.FloatingCommentAdapter");
        ((ec.e) adapter).d(list);
    }

    public static final void P(z zVar) {
        jo.p.h(zVar, "this$0");
        if (zVar.S.size() > 0) {
            d4 poll = zVar.S.poll();
            if (!TextUtils.isEmpty(poll.a())) {
                zVar.setCommentInsertTimestamp(false);
            }
            zVar.f0(poll);
        }
    }

    public static final void d0(z zVar, View view) {
        jo.p.h(zVar, "this$0");
        zVar.Y();
        zVar.a0();
        if (jo.p.c(zVar.getGlobalStore().H().f(), Boolean.FALSE)) {
            zVar.getGlobalActionCreator().A();
        }
        try {
            if (zVar.getUserHelper().h()) {
                StreamEmomoActivity.a aVar = StreamEmomoActivity.Q0;
                Context context = zVar.getContext();
                jo.p.g(context, "context");
                Intent b10 = StreamEmomoActivity.a.b(aVar, context, null, 2, null);
                b10.addFlags(335544320);
                PendingIntent.getActivity(zVar.getContext(), 0, b10, 67108864).send();
            } else {
                zVar.A0();
            }
        } catch (PendingIntent.CanceledException e10) {
            g9.a.c(e10);
        }
        zVar.getCastServiceActionCreator().g();
    }

    public static final void e0(View view) {
        dq.c.c().l(t.c.f19474a);
    }

    public static final void g0(z zVar) {
        jo.p.h(zVar, "this$0");
        zVar.R.H.p1(0);
    }

    private final od.b getCastServiceActionCreator() {
        return (od.b) this.H.getValue();
    }

    private final nf.c getCastServiceStore() {
        return (nf.c) this.I.getValue();
    }

    private final fa.c getFloatViewManager() {
        return (fa.c) this.Q.getValue();
    }

    private final od.p getGlobalActionCreator() {
        return (od.p) this.J.getValue();
    }

    private final nf.o getGlobalStore() {
        return (nf.o) this.K.getValue();
    }

    private final tb.c getIntentResolver() {
        return (tb.c) this.L.getValue();
    }

    private final MRLogger getMRLogger() {
        return (MRLogger) this.M.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MRRequest getRequest() {
        return (MRRequest) this.N.getValue();
    }

    private final i1 getSharedApplicationModel() {
        return (i1) this.O.getValue();
    }

    private final v0 getUserHelper() {
        return (v0) this.P.getValue();
    }

    public static final boolean j0(z zVar, View view, MotionEvent motionEvent) {
        jo.p.h(zVar, "this$0");
        int actionMasked = motionEvent.getActionMasked();
        int id2 = view.getId();
        if (actionMasked == 0) {
            zVar.R.L.setVisibility(8);
            zVar.setButtonPressedState(id2);
            if (zVar.h0(id2)) {
                zVar.s((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                return true;
            }
            zVar.setMoved(false);
        } else if (actionMasked == 1) {
            if (zVar.o()) {
                zVar.setMoved(false);
            } else {
                if ((id2 == xb.o.setting_container || id2 == xb.o.player_setting) || id2 == xb.o.f60029qa) {
                    dq.c.c().l(new nd.t());
                } else {
                    if (id2 == xb.o.M1 || id2 == xb.o.float_comment_listview_small) {
                        zVar.B0(true);
                    } else {
                        if (id2 == xb.o.history_container || id2 == xb.o.float_comment_post) {
                            zVar.C0(true);
                        } else {
                            zVar.C0(false);
                        }
                    }
                }
            }
            zVar.n0();
        } else if (actionMasked != 2) {
            if (actionMasked != 3) {
                return false;
            }
            zVar.setMoved(false);
            zVar.n0();
        } else if (zVar.h0(id2)) {
            zVar.m((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
            zVar.n0();
            return true;
        } else {
            zVar.setMoved(false);
        }
        return false;
    }

    public static final void p0(z zVar, View view) {
        jo.p.h(zVar, "this$0");
        zVar.R.L.setVisibility(8);
        zVar.B0(true);
    }

    private final void setButtonPressedState(int i10) {
        n0();
        if ((i10 == xb.o.setting_container || i10 == xb.o.player_setting) || i10 == xb.o.f60029qa) {
            this.R.O.setPressed(true);
            return;
        }
        if (i10 == xb.o.M1 || i10 == xb.o.float_comment_listview_small) {
            this.R.F.setPressed(true);
        }
    }

    private final void setCommentInsertTimestamp(boolean z10) {
        this.f30456d0 = z10 ? 0L : System.currentTimeMillis();
    }

    public final void A0() {
        Intent K = getIntentResolver().K(getMContext(), false, false, false);
        K.addFlags(335544320);
        getContext().startActivity(K);
    }

    public final void B0(boolean z10) {
        if (z10) {
            Z();
            z0();
            return;
        }
        w0();
        b0();
    }

    public final void C0(boolean z10) {
        setMLayoutParams(X(z10, true));
        w();
        dq.c.c().l(new d(this, getMLayoutParams().x, getMLayoutParams().y, false, 4, null));
        if (z10) {
            this.R.I.requestFocus();
            Object systemService = getMContext().getSystemService("input_method");
            jo.p.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(this.R.I, 1);
            return;
        }
        this.R.G.requestFocus();
    }

    public final void D0(int i10) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(getResources().getDimensionPixelOffset(i10), -2, q(), 520, -3);
        layoutParams.gravity = 8388659;
        layoutParams.x = getMLayoutParams().x;
        layoutParams.y = getMLayoutParams().y;
        setMLayoutParams(layoutParams);
        w();
        dq.c.c().l(new d(this, getMLayoutParams().x, getMLayoutParams().y, false, 4, null));
    }

    public final void W() {
        B0(false);
    }

    public final WindowManager.LayoutParams X(boolean z10, boolean z11) {
        WindowManager.LayoutParams layoutParams;
        if (z10) {
            layoutParams = new WindowManager.LayoutParams(getResources().getDimensionPixelOffset(xb.m.float_comment_width), -2, q(), 512, -3);
        } else {
            layoutParams = new WindowManager.LayoutParams(getResources().getDimensionPixelOffset(xb.m.float_comment_width), -2, q(), 520, -3);
        }
        layoutParams.gravity = 8388659;
        if (z11) {
            layoutParams.x = getMLayoutParams().x;
            layoutParams.y = getMLayoutParams().y;
        }
        return layoutParams;
    }

    public final void Y() {
        this.R.B.setVisibility(8);
        dq.c.c().l(new c());
    }

    public final void Z() {
        this.R.F.setVisibility(8);
        this.S.clear();
        Runnable runnable = this.f30460h0;
        if (runnable != null) {
            this.U.removeCallbacks(runnable);
        }
        o0();
    }

    @Override // ec.e.b
    public void a(String str) {
        uo.b0 b10;
        jo.p.h(str, "linkOwnerLiveId");
        this.R.L.setVisibility(8);
        o2 c10 = g1.c();
        b10 = i2.b(null, 1, null);
        uo.l.d(r0.a(c10.plus(b10)), null, null, new f(str, null), 3, null);
    }

    public final void a0() {
        Z();
        b0();
        D0(xb.m.float_no_comment_width);
    }

    @Override // ec.e.b
    public void b(String str) {
        jo.p.h(str, "userId");
        getCastServiceActionCreator().v(Referer.Broadcast.COLLAB_END, str);
        hf.b.f35490a.h();
        FirebaseAnalytics.getInstance(getContext()).a("jdwii7", null);
    }

    public final void b0() {
        this.R.J.setVisibility(8);
        this.R.L.setVisibility(8);
        C0(false);
    }

    @Override // ec.e.b
    public void c(String str) {
        jo.p.h(str, "url");
        of.n.r(getMContext(), str);
        MRLogger mRLogger = getMRLogger();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_POSTED_GAME_ID_COMMENT_TAP);
        builder.setTargetType("url");
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, this.G)));
        mRLogger.sendLog(builder.build());
    }

    public final void c0() {
        this.R.C.setOnClickListener(new View.OnClickListener() { // from class: ec.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z.d0(z.this, view);
            }
        });
        this.R.D.setOnClickListener(t.f30445w);
    }

    @Override // ec.e.b
    public void d(String str) {
        jo.p.h(str, "liveId");
        Context context = getContext();
        tb.c intentResolver = getIntentResolver();
        Context context2 = getContext();
        jo.p.g(context2, "context");
        Intent f10 = c.a.f(intentResolver, context2, str, Referer.COLLAB_RECOMMEND_LIVE, null, null, false, false, false, false, null, AnalyticsListener.EVENT_AUDIO_ATTRIBUTES_CHANGED, null);
        f10.addFlags(335544320);
        context.startActivity(f10);
    }

    @Override // ec.e.b
    public void f(String str) {
        jo.p.h(str, "value");
        fa.c floatViewManager = getFloatViewManager();
        Context mContext = getMContext();
        String string = getContext().getString(xb.r.text_view_game_id_copy_toast);
        jo.p.g(string, "context.getString(R.stri…_view_game_id_copy_toast)");
        String string2 = getMContext().getString(xb.r.S1);
        jo.p.g(string2, "mContext.getString(R.string.text_ok)");
        floatViewManager.f(new dc.c(mContext, string, string2));
        MRLogger mRLogger = getMRLogger();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_POSTED_GAME_ID_COMMENT_TAP);
        builder.setTargetType(MRLog.TARGET_TYPE_GAME_ID);
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, this.G)));
        mRLogger.sendLog(builder.build());
    }

    public final void f0(d4 d4Var) {
        if (d4Var == null) {
            return;
        }
        boolean z10 = d4Var.getType() == d4.a.VIEW_TYPE_END;
        a0 a0Var = this.f30459g0;
        if (a0Var != null) {
            List d10 = xn.r.d(d4Var);
            List<d4> a10 = a0Var.a();
            jo.p.g(a10, "it.currentList");
            a0Var.f(xn.a0.o0(d10, a10), new Runnable() { // from class: ec.o
                @Override // java.lang.Runnable
                public final void run() {
                    z.g0(z.this);
                }
            });
        }
        if (this.S.size() <= 0) {
            if (z10) {
                return;
            }
            g9.a.g("[livecomment] 3.0 :" + this.S.size());
            this.S.add(n4.f55266j.a(d4Var.b()));
            Runnable runnable = this.f30460h0;
            if (runnable != null) {
                this.U.postDelayed(runnable, PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS);
                return;
            }
            return;
        }
        int size = this.S.size();
        if (z10 || size > 2) {
            g9.a.g("[livecomment] 0 :" + this.S.size());
            Runnable runnable2 = this.f30460h0;
            if (runnable2 != null) {
                this.U.post(runnable2);
            }
        } else if (size > 0) {
            g9.a.g("[livecomment] 1.5 :" + this.S.size());
            Runnable runnable3 = this.f30460h0;
            if (runnable3 != null) {
                this.U.postDelayed(runnable3, 1500L);
            }
        }
    }

    @Override // ec.e.b
    public void g(String str) {
        jo.p.h(str, "userId");
        this.R.L.setVisibility(8);
        if (this.R.B.getVisibility() == 0 && !getSharedApplicationModel().a().e()) {
            this.R.C.callOnClick();
            return;
        }
        if (str.length() > 0) {
            dq.c.c().l(new d0(str, false));
        }
    }

    public final Bundle getInstanceStateToSave() {
        Bundle bundle = new Bundle();
        Point currentViewLocation = getCurrentViewLocation();
        bundle.putParcelable("location", currentViewLocation);
        if (!currentViewLocation.equals(0, 0)) {
            bundle.putInt("orientation", this.V);
            bundle.putParcelable("locationRatio", new PointF((currentViewLocation.x * 1.0f) / this.T.getWidth(), (currentViewLocation.y * 1.0f) / this.T.getHeight()));
        }
        bundle.putString("starcount", this.f30461i0);
        bundle.putInt("viewcount", this.f30462j0);
        return bundle;
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    @Override // ec.e.b
    public void h(String str) {
        jo.p.h(str, "userId");
        this.R.L.setVisibility(8);
        if (str.length() > 0) {
            dq.c.c().l(new d0(str, false));
        }
    }

    public final boolean h0(int i10) {
        if (i10 == xb.o.root) {
            return this.R.G.getVisibility() == 0;
        }
        return (((i10 == xb.o.setting_container || i10 == xb.o.player_setting) || i10 == xb.o.f60029qa) || i10 == xb.o.M1) || i10 == xb.o.float_comment_listview_small;
    }

    public final void i0() {
        this.f30453a0 = true;
        t();
    }

    public final void k0(d4 d4Var) {
        jo.p.h(d4Var, "data");
        if (this.f30455c0 == 0) {
            this.R.G.p1(0);
        }
        if (this.R.F.isShown()) {
            if (this.S.size() > 0) {
                this.S.add(d4Var);
                return;
            }
            this.S.add(d4Var);
            Runnable runnable = this.f30460h0;
            if (runnable != null) {
                this.U.removeCallbacks(runnable);
                if (t0()) {
                    this.U.postDelayed(runnable, 1500L);
                } else {
                    this.U.post(runnable);
                }
            }
        }
    }

    @Override // sd.a
    public void l() {
        dq.c.c().r(this);
        super.l();
    }

    public final void l0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.R.I.getEditableText().clear();
        d2 d2Var = this.f30454b0;
        if (d2Var != null) {
            uo.l.d(r0.a(g1.c().plus(d2Var)), null, null, new g(str, null), 3, null);
        }
    }

    @Override // sd.a
    public void m(int i10, int i11) {
        super.m(i10, i11);
        dq.c.c().l(new d(this, getMLayoutParams().x, getMLayoutParams().y, false, 4, null));
    }

    public final void m0() {
        this.R.O.getViewTreeObserver().addOnGlobalLayoutListener(new h());
    }

    @Override // sd.a
    public void n(Rect rect) {
        jo.p.h(rect, "outMargins");
        rect.set(-(this.f30453a0 ? getResources().getDimensionPixelOffset(xb.m.size52dp) : 0), 0, this.R.O.getWidth() + getResources().getDimensionPixelOffset(xb.m.float_comment_padding) + de.n.b(this, 5), this.R.O.getHeight());
    }

    public final void n0() {
        this.R.O.setPressed(false);
        this.R.F.setPressed(false);
    }

    public final void o0() {
        a0 a0Var = new a0();
        a0Var.h(new View.OnClickListener() { // from class: ec.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z.p0(z.this, view);
            }
        });
        this.f30459g0 = a0Var;
        this.R.H.setAdapter(a0Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        uo.b0 b10;
        super.onAttachedToWindow();
        t();
        b10 = i2.b(null, 1, null);
        this.f30454b0 = b10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d2 d2Var = this.f30454b0;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
    }

    @dq.l
    public final void onEvent(j.b bVar) {
        jo.p.h(bVar, "event");
        r(bVar.a() - ((int) getResources().getDimension(xb.m.float_status_x_offset)), bVar.b() - ((int) getResources().getDimension(xb.m.float_status_y_offset)));
    }

    public final void q0(Bundle bundle) {
        jo.p.h(bundle, "state");
        try {
            this.f30461i0 = bundle.getString("starcount");
            int i10 = bundle.getInt("viewcount");
            this.f30462j0 = i10;
            setViewCount(i10);
            Parcelable parcelable = bundle.getParcelable("location");
            jo.p.e(parcelable);
            Point point = (Point) parcelable;
            if (point.equals(0, 0)) {
                return;
            }
            if (bundle.getInt("orientation", 0) != this.V) {
                Parcelable parcelable2 = bundle.getParcelable("locationRatio");
                jo.p.e(parcelable2);
                PointF pointF = (PointF) parcelable2;
                b bVar = f30451k0;
                Context context = getContext();
                jo.p.g(context, "context");
                Size b10 = bVar.b(context);
                point = new Point(lo.c.c(pointF.x * b10.getWidth()), lo.c.c(pointF.y * b10.getHeight()));
            }
            setCurrentViewLocation(point);
        } catch (Exception e10) {
            g9.a.c(e10);
        }
    }

    public final void r0() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getMContext());
        linearLayoutManager.M2(false);
        this.f30458f0 = linearLayoutManager;
        this.R.H.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView = this.R.H;
        tn.b bVar = new tn.b();
        bVar.w(200L);
        recyclerView.setItemAnimator(bVar);
        this.R.H.p1(0);
    }

    public final void s0() {
        int i10;
        if (this.R.G.getLayoutManager() != null) {
            RecyclerView.p layoutManager = this.R.G.getLayoutManager();
            jo.p.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            i10 = ((LinearLayoutManager) layoutManager).e2();
        } else {
            i10 = 0;
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getMContext());
        linearLayoutManager.M2(false);
        this.f30457e0 = linearLayoutManager;
        this.R.G.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView = this.R.G;
        tn.b bVar = new tn.b();
        bVar.w(200L);
        recyclerView.setItemAnimator(bVar);
        this.R.G.p1(i10);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        jo.p.h(onTouchListener, "l");
        super.setOnTouchListener(onTouchListener);
        this.R.N.setOnTouchListener(onTouchListener);
        this.R.M.setOnTouchListener(onTouchListener);
        this.R.Q.setOnTouchListener(onTouchListener);
        this.R.H.setOnTouchListener(onTouchListener);
        this.R.I.setOnTouchListener(onTouchListener);
        this.R.J.setOnTouchListener(onTouchListener);
        this.R.O.setOnTouchListener(onTouchListener);
    }

    public final void setViewCount(int i10) {
        this.f30462j0 = i10;
        String valueOf = String.valueOf(i10);
        String str = ' ' + getResources().getString(xb.r.text_view);
        SpannableString spannableString = new SpannableString(valueOf + str);
        int length = valueOf.length();
        spannableString.setSpan(new AbsoluteSizeSpan(of.t.b(getMContext(), 10)), valueOf.length(), valueOf.length() + str.length(), 33);
        spannableString.setSpan(new StyleSpan(1), 0, length, 33);
        this.R.Q.setText(spannableString);
    }

    public final boolean t0() {
        return System.currentTimeMillis() - this.f30456d0 <= 1500;
    }

    public final void u0(boolean z10) {
        setMLayoutParams(X(z10, false));
        try {
            getMWindowManager().addView(this, getMLayoutParams());
        } catch (Exception e10) {
            g9.a.c(e10);
        }
        dq.c.c().l(new d(getMLayoutParams().x, getMLayoutParams().y, true));
        dq.c.c().p(this);
        setCommentInsertTimestamp(true);
    }

    public final void v0() {
        this.R.B.setVisibility(0);
    }

    public final void w0() {
        this.R.F.setVisibility(0);
        D0(xb.m.float_comment_width);
    }

    public final void x0() {
        this.R.D.setVisibility(0);
        this.R.C.setVisibility(8);
    }

    public final void y0() {
        this.R.C.setVisibility(0);
        this.R.D.setVisibility(8);
    }

    public final void z0() {
        this.R.G.p1(0);
        this.R.J.setVisibility(0);
        this.R.I.requestFocus();
        this.R.L.setVisibility(8);
    }

    /* loaded from: classes2.dex */
    public final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f30465a;

        /* renamed from: b  reason: collision with root package name */
        public final int f30466b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f30467c;

        public d(int i10, int i11, boolean z10) {
            this.f30465a = i10;
            this.f30466b = i11;
            this.f30467c = z10;
        }

        public final int a() {
            return this.f30465a;
        }

        public final int b() {
            return this.f30466b;
        }

        public /* synthetic */ d(z zVar, int i10, int i11, boolean z10, int i12, jo.h hVar) {
            this(i10, i11, (i12 & 4) != 0 ? false : z10);
        }
    }

    @dq.l
    public final void onEvent(ce.u uVar) {
        jo.p.h(uVar, "event");
        StreamEmomoActivity.a aVar = StreamEmomoActivity.Q0;
        Context context = getContext();
        jo.p.g(context, "context");
        Intent b10 = StreamEmomoActivity.a.b(aVar, context, null, 2, null);
        b10.addFlags(335544320);
        getContext().startActivity(b10);
    }
}
