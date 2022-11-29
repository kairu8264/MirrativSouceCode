package nf;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.lifecycle.LiveData;
import ce.l;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.customview.GroupShotMemberSettingView;
import com.dena.mirrorman.net.api.response.EventNoticeResponse;
import com.dena.mirrorman.net.api.response.GroupShotBackground;
import com.dena.mirrorman.net.api.response.GroupShotBackgroundsResponse;
import com.dena.mirrorman.net.api.response.GroupShotViewer;
import com.dena.mirrorman.net.api.response.live.LiveGiftRankingUser;
import com.dena.mirrorman.net.bcsvr.response.RankingUser;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import ha.a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import nd.s0;
import org.greenrobot.eventbus.ThreadMode;
import pd.b1;
import pd.e0;
import ud.h1;
import ud.i1;
import ud.j1;
import ud.k1;
import uo.r0;

/* loaded from: classes3.dex */
public final class h0 extends androidx.lifecycle.q0 implements uo.q0 {
    public final s0<List<RankingUser>> A;
    public final androidx.lifecycle.e0<GroupShotMemberSettingView.b> B;
    public final LiveData<GroupShotMemberSettingView.b> C;
    public final androidx.lifecycle.e0<Integer> D;
    public final LiveData<Integer> E;
    public final androidx.lifecycle.e0<Integer> F;
    public final LiveData<Integer> G;
    public final s0<Bitmap> H;
    public final s0<List<h1>> I;
    public final androidx.lifecycle.e0<Boolean> J;
    public final LiveData<Boolean> K;
    public final androidx.lifecycle.e0<List<LiveGiftRankingUser>> L;
    public final LiveData<List<LiveGiftRankingUser>> M;
    public final wo.f<wn.k<List<GroupShotViewer>, File>> N;
    public final wo.f<Uri> O;
    public final wo.f<Uri> P;
    public final androidx.lifecycle.e0<ha.a> Q;
    public final LiveData<ha.a> R;
    public final wo.f<MRError> S;
    public List<GroupShotBackground> T;
    public Bitmap U;
    public String V;
    public File W;
    public List<GroupShotViewer> X;
    public final xo.s<GroupShotBackgroundsResponse> Y;
    public final xo.g0<GroupShotBackgroundsResponse> Z;

    /* renamed from: a0  reason: collision with root package name */
    public final androidx.lifecycle.e0<EventNoticeResponse> f42898a0;

    /* renamed from: b0  reason: collision with root package name */
    public final LiveData<EventNoticeResponse> f42899b0;

    /* renamed from: c0  reason: collision with root package name */
    public final xo.r<String> f42900c0;

    /* renamed from: d0  reason: collision with root package name */
    public final xo.s<Boolean> f42901d0;

    /* renamed from: e0  reason: collision with root package name */
    public final xo.g0<Boolean> f42902e0;

    /* renamed from: f0  reason: collision with root package name */
    public final xo.s<Integer> f42903f0;

    /* renamed from: g0  reason: collision with root package name */
    public final xo.g0<Integer> f42904g0;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f42905y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f42906z;

    @co.f(c = "com.dena.mirrorman.store.StreamEmomoStore$on$10", f = "StreamEmomoStore.kt", l = {270}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42907w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b1.p f42909y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b1.p pVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f42909y = pVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f42909y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42907w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = h0.this.P;
                Uri a10 = this.f42909y.a();
                this.f42907w = 1;
                if (fVar.r(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.StreamEmomoStore$on$11", f = "StreamEmomoStore.kt", l = {289}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42910w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ l.b0 f42912y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l.b0 b0Var, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f42912y = b0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f42912y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42910w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = h0.this.A;
                List<RankingUser> b10 = this.f42912y.b();
                this.f42910w = 1;
                if (s0Var.d(b10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.StreamEmomoStore$on$12", f = "StreamEmomoStore.kt", l = {296}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42913w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ l.q f42915y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(l.q qVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f42915y = qVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f42915y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42913w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = h0.this.f42900c0;
                String userId = this.f42915y.b().getUserId();
                this.f42913w = 1;
                if (rVar.emit(userId, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.StreamEmomoStore$on$13", f = "StreamEmomoStore.kt", l = {313}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42916w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b1.c f42918y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b1.c cVar, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f42918y = cVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f42918y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42916w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.s sVar = h0.this.f42903f0;
                Integer d10 = co.b.d(this.f42918y.a());
                this.f42916w = 1;
                if (sVar.emit(d10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.StreamEmomoStore$on$1", f = "StreamEmomoStore.kt", l = {TsExtractor.TS_STREAM_TYPE_HDMV_DTS}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42919w;

        public e(ao.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42919w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = h0.this.I;
                List k10 = xn.s.k();
                this.f42919w = 1;
                if (s0Var.d(k10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.StreamEmomoStore$on$2", f = "StreamEmomoStore.kt", l = {153}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42921w;

        public f(ao.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42921w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = h0.this.I;
                List d10 = xn.r.d(new i1(null, 1, null));
                List<GroupShotBackground> w10 = h0.this.w();
                ArrayList arrayList = new ArrayList(xn.t.u(w10, 10));
                for (GroupShotBackground groupShotBackground : w10) {
                    arrayList.add(k1.a.b(k1.f55084e, groupShotBackground, false, 2, null));
                }
                List o02 = xn.a0.o0(d10, arrayList);
                this.f42921w = 1;
                if (s0Var.d(o02, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.StreamEmomoStore$on$3", f = "StreamEmomoStore.kt", l = {170}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42923w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ h1 f42925y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(h1 h1Var, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f42925y = h1Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f42925y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42923w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = h0.this.I;
                List d10 = xn.r.d(this.f42925y);
                List<GroupShotBackground> w10 = h0.this.w();
                h0 h0Var = h0.this;
                ArrayList arrayList = new ArrayList(xn.t.u(w10, 10));
                for (GroupShotBackground groupShotBackground : w10) {
                    arrayList.add(k1.f55084e.a(groupShotBackground, jo.p.c(groupShotBackground.getImageUrl(), h0Var.K())));
                }
                List o02 = xn.a0.o0(d10, arrayList);
                this.f42923w = 1;
                if (s0Var.d(o02, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.StreamEmomoStore$on$4", f = "StreamEmomoStore.kt", l = {187}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class h extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42926w;

        public h(ao.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42926w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = h0.this.I;
                List d10 = xn.r.d(new i1(null, 1, null));
                List<GroupShotBackground> w10 = h0.this.w();
                h0 h0Var = h0.this;
                ArrayList arrayList = new ArrayList(xn.t.u(w10, 10));
                for (GroupShotBackground groupShotBackground : w10) {
                    arrayList.add(k1.f55084e.a(groupShotBackground, jo.p.c(groupShotBackground.getImageUrl(), h0Var.K())));
                }
                List o02 = xn.a0.o0(d10, arrayList);
                this.f42926w = 1;
                if (s0Var.d(o02, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.StreamEmomoStore$on$5", f = "StreamEmomoStore.kt", l = {203}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class i extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42928w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b1.f f42930y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(b1.f fVar, ao.d<? super i> dVar) {
            super(2, dVar);
            this.f42930y = fVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i(this.f42930y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42928w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = h0.this.N;
                wn.k a10 = wn.q.a(this.f42930y.b(), this.f42930y.a());
                this.f42928w = 1;
                if (fVar.r(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            h0.this.X = this.f42930y.b();
            h0.this.W = this.f42930y.a();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.StreamEmomoStore$on$6", f = "StreamEmomoStore.kt", l = {213}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class j extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42931w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b1.d f42933y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(b1.d dVar, ao.d<? super j> dVar2) {
            super(2, dVar2);
            this.f42933y = dVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j(this.f42933y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42931w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = h0.this.S;
                MRError a10 = this.f42933y.a();
                this.f42931w = 1;
                if (fVar.r(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.StreamEmomoStore$on$7", f = "StreamEmomoStore.kt", l = {223}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class k extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42934w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b1.l f42936y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(b1.l lVar, ao.d<? super k> dVar) {
            super(2, dVar);
            this.f42936y = lVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new k(this.f42936y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((k) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42934w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = h0.this.I;
                List d10 = xn.r.d(new j1(this.f42936y.a(), true, null, 4, null));
                List<GroupShotBackground> w10 = h0.this.w();
                ArrayList arrayList = new ArrayList(xn.t.u(w10, 10));
                for (GroupShotBackground groupShotBackground : w10) {
                    arrayList.add(k1.a.b(k1.f55084e, groupShotBackground, false, 2, null));
                }
                List o02 = xn.a0.o0(d10, arrayList);
                this.f42934w = 1;
                if (s0Var.d(o02, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.StreamEmomoStore$on$8", f = "StreamEmomoStore.kt", l = {232}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class l extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42937w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b1.o f42939y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(b1.o oVar, ao.d<? super l> dVar) {
            super(2, dVar);
            this.f42939y = oVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new l(this.f42939y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((l) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42937w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = h0.this.H;
                Bitmap a10 = this.f42939y.a();
                this.f42937w = 1;
                if (s0Var.d(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.StreamEmomoStore$on$9", f = "StreamEmomoStore.kt", l = {263}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class m extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42940w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b1.m f42942y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(b1.m mVar, ao.d<? super m> dVar) {
            super(2, dVar);
            this.f42942y = mVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new m(this.f42942y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((m) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42940w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = h0.this.O;
                Uri a10 = this.f42942y.a();
                this.f42940w = 1;
                if (fVar.r(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    public h0(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f42905y = aVar;
        this.f42906z = r0.b();
        aVar.b(this);
        this.A = new s0<>();
        androidx.lifecycle.e0<GroupShotMemberSettingView.b> e0Var = new androidx.lifecycle.e0<>(GroupShotMemberSettingView.b.UnSelected);
        this.B = e0Var;
        this.C = e0Var;
        androidx.lifecycle.e0<Integer> e0Var2 = new androidx.lifecycle.e0<>(0);
        this.D = e0Var2;
        this.E = e0Var2;
        androidx.lifecycle.e0<Integer> e0Var3 = new androidx.lifecycle.e0<>(0);
        this.F = e0Var3;
        this.G = e0Var3;
        this.H = new s0<>();
        this.I = new s0<>();
        Boolean bool = Boolean.FALSE;
        androidx.lifecycle.e0<Boolean> e0Var4 = new androidx.lifecycle.e0<>(bool);
        this.J = e0Var4;
        this.K = e0Var4;
        androidx.lifecycle.e0<List<LiveGiftRankingUser>> e0Var5 = new androidx.lifecycle.e0<>(xn.s.k());
        this.L = e0Var5;
        this.M = e0Var5;
        this.N = wo.g.a(-2);
        this.O = wo.g.a(-2);
        this.P = wo.g.a(-2);
        androidx.lifecycle.e0<ha.a> e0Var6 = new androidx.lifecycle.e0<>(a.d.f34697b);
        this.Q = e0Var6;
        this.R = e0Var6;
        this.S = wo.g.a(-2);
        this.T = xn.s.k();
        xo.s<GroupShotBackgroundsResponse> a10 = xo.i0.a(null);
        this.Y = a10;
        this.Z = a10;
        androidx.lifecycle.e0<EventNoticeResponse> e0Var7 = new androidx.lifecycle.e0<>();
        this.f42898a0 = e0Var7;
        this.f42899b0 = e0Var7;
        this.f42900c0 = xo.y.b(0, 0, null, 7, null);
        xo.s<Boolean> a11 = xo.i0.a(bool);
        this.f42901d0 = a11;
        this.f42902e0 = a11;
        xo.s<Integer> a12 = xo.i0.a(0);
        this.f42903f0 = a12;
        this.f42904g0 = a12;
    }

    public final LiveData<Integer> A() {
        return this.G;
    }

    public final LiveData<GroupShotMemberSettingView.b> B() {
        return this.C;
    }

    public final LiveData<List<LiveGiftRankingUser>> C() {
        return this.M;
    }

    public final LiveData<Integer> D() {
        return this.E;
    }

    public final wo.x<MRError> E() {
        return this.S.g();
    }

    public final LiveData<ha.a> F() {
        return this.R;
    }

    public final List<GroupShotViewer> G() {
        return this.X;
    }

    public final wo.x<wn.k<List<GroupShotViewer>, File>> H() {
        return this.N.g();
    }

    public final xo.w<String> I() {
        return this.f42900c0;
    }

    public final Bitmap J() {
        return this.U;
    }

    public final String K() {
        return this.V;
    }

    public final wo.x<Uri> L() {
        return this.O.g();
    }

    public final wo.x<Uri> M() {
        return this.P.g();
    }

    public final LiveData<Boolean> N() {
        return this.K;
    }

    public final xo.g0<Boolean> O() {
        return this.f42902e0;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f42905y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f42906z.getCoroutineContext();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b1.j jVar) {
        jo.p.h(jVar, "event");
        this.Q.p(a.b.f34695b);
        this.J.p(Boolean.FALSE);
        uo.l.d(this, null, null, new e(null), 3, null);
    }

    public final LiveData<EventNoticeResponse> q() {
        return this.f42899b0;
    }

    public final wo.x<Bitmap> r() {
        return this.H.c();
    }

    public final xo.g0<Integer> s() {
        return this.f42904g0;
    }

    public final List<RankingUser> t() {
        return this.A.b();
    }

    public final wo.x<List<RankingUser>> u() {
        return this.A.c();
    }

    public final File v() {
        return this.W;
    }

    public final List<GroupShotBackground> w() {
        return this.T;
    }

    public final wo.x<List<h1>> x() {
        return this.I.c();
    }

    public final xo.g0<GroupShotBackgroundsResponse> y() {
        return this.Z;
    }

    public final Bitmap z() {
        return this.H.b();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b1.q qVar) {
        jo.p.h(qVar, "event");
        if (this.B.f() != qVar.a()) {
            this.D.p(0);
        }
        this.B.p(qVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b1.r rVar) {
        jo.p.h(rVar, "event");
        this.D.p(Integer.valueOf(rVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b1.g gVar) {
        jo.p.h(gVar, "event");
        this.Q.p(a.d.f34697b);
        this.T = gVar.a().getBackgrounds();
        this.Y.setValue(gVar.a());
        uo.l.d(this, null, null, new f(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b1.h hVar) {
        h1 i1Var;
        jo.p.h(hVar, "event");
        Bitmap bitmap = this.U;
        if (this.V != null) {
            i1Var = new i1(null, 1, null);
        } else if (bitmap != null) {
            i1Var = new j1(bitmap, true, null, 4, null);
        } else {
            i1Var = new i1(null, 1, null);
        }
        uo.l.d(this, null, null, new g(i1Var, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b1.e eVar) {
        jo.p.h(eVar, "event");
        this.Q.p(new a.C0439a(eVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b1.k kVar) {
        jo.p.h(kVar, "event");
        this.J.p(Boolean.TRUE);
        this.U = null;
        this.V = kVar.a();
        uo.l.d(this, null, null, new h(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b1.i iVar) {
        jo.p.h(iVar, "event");
        this.Q.p(a.b.f34695b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b1.f fVar) {
        jo.p.h(fVar, "event");
        this.Q.p(a.d.f34697b);
        uo.l.d(this, null, null, new i(fVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b1.d dVar) {
        jo.p.h(dVar, "event");
        this.Q.p(new a.C0439a(dVar.a()));
        uo.l.d(this, null, null, new j(dVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b1.l lVar) {
        jo.p.h(lVar, "event");
        this.J.p(Boolean.TRUE);
        this.U = lVar.a();
        this.V = null;
        uo.l.d(this, null, null, new k(lVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b1.o oVar) {
        jo.p.h(oVar, "event");
        uo.l.d(this, null, null, new l(oVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b1.a aVar) {
        jo.p.h(aVar, "event");
        this.T = xn.s.k();
        this.V = null;
        this.U = null;
        this.W = null;
        this.X = null;
        this.B.p(GroupShotMemberSettingView.b.UnSelected);
        this.D.p(0);
        this.L.p(xn.s.k());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(e0.b bVar) {
        int valueOf;
        jo.p.h(bVar, "event");
        if (bVar.a() != jf.x.LIVE) {
            return;
        }
        int size = bVar.b().getRanking().size();
        androidx.lifecycle.e0<Integer> e0Var = this.F;
        if (size >= 3) {
            valueOf = 3;
        } else {
            valueOf = Integer.valueOf(size);
        }
        e0Var.p(valueOf);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b1.m mVar) {
        jo.p.h(mVar, "event");
        uo.l.d(this, null, null, new m(mVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b1.p pVar) {
        jo.p.h(pVar, "event");
        uo.l.d(this, null, null, new a(pVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b1.s sVar) {
        jo.p.h(sVar, "event");
        this.L.p(sVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.b0 b0Var) {
        ArrayList arrayList;
        jo.p.h(b0Var, "event");
        if (jo.p.c(b0Var.a(), "CastService")) {
            List<RankingUser> t10 = t();
            if (t10 != null) {
                arrayList = new ArrayList(xn.t.u(t10, 10));
                for (RankingUser rankingUser : t10) {
                    arrayList.add(rankingUser.getUserId());
                }
            } else {
                arrayList = null;
            }
            List<RankingUser> b10 = b0Var.b();
            ArrayList arrayList2 = new ArrayList(xn.t.u(b10, 10));
            for (RankingUser rankingUser2 : b10) {
                arrayList2.add(rankingUser2.getUserId());
            }
            if (jo.p.c(arrayList2, arrayList)) {
                return;
            }
            uo.l.d(this, null, null, new b(b0Var, null), 3, null);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.q qVar) {
        jo.p.h(qVar, "event");
        uo.l.d(this, null, null, new c(qVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b1.b bVar) {
        jo.p.h(bVar, "event");
        this.f42898a0.p(bVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b1.n nVar) {
        jo.p.h(nVar, "event");
        this.f42901d0.setValue(Boolean.valueOf(nVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b1.c cVar) {
        jo.p.h(cVar, "event");
        uo.l.d(this, null, null, new d(cVar, null), 3, null);
    }
}
