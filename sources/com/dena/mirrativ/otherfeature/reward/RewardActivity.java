package com.dena.mirrativ.otherfeature.reward;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrativ.otherfeature.reward.RewardActivity;
import com.dena.mirrorman.clientlog.logs.AdLogBase;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.api.response.RewardAdCompleteResponse;
import com.dena.mirrorman.util.FragmentRunner;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import gb.f;
import hf.e0;
import java.util.HashMap;
import jo.f0;
import jo.p;
import kq.a;
import nd.i1;
import nf.o;
import of.n;
import rg.f;
import rg.q;
import uo.q0;
import vb.u;
import wn.v;
import xn.r;

/* loaded from: classes2.dex */
public final class RewardActivity extends e.b implements u, q0 {
    public static final a Z = new a(null);

    /* renamed from: a0  reason: collision with root package name */
    public static final int f21905a0 = 8;
    public final /* synthetic */ da.j O = new da.j();
    public final wn.f P;
    public final wn.f Q;
    public final wn.f R;
    public final wn.f S;
    public final wn.f T;
    public boolean U;
    public final wn.f V;
    public final FragmentRunner W;
    public gh.b X;
    public db.c Y;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context, String str, int i10) {
            p.h(context, "context");
            p.h(str, "referer");
            Intent intent = new Intent(context, RewardActivity.class);
            intent.putExtra("referer", str);
            intent.putExtra("auto_load_reward_id", i10);
            intent.addFlags(C.DEFAULT_BUFFER_SEGMENT_SIZE);
            return intent;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends rg.l {
        public b() {
        }

        @Override // rg.l
        public void b() {
            if (RewardActivity.this.U) {
                return;
            }
            RewardActivity.this.finish();
        }

        @Override // rg.l
        public void c(rg.a aVar) {
        }

        @Override // rg.l
        public void e() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends gh.c {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f21908b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f21909c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ q f21910d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ b f21911e;

        public c(int i10, String str, q qVar, b bVar) {
            this.f21908b = i10;
            this.f21909c = str;
            this.f21910d = qVar;
            this.f21911e = bVar;
        }

        @Override // rg.d
        public void a(rg.m mVar) {
            p.h(mVar, "loadAdError");
            super.a(mVar);
            RewardActivity.this.Q3(false, this.f21908b, this.f21909c);
            RewardActivity.this.H3().d(false);
            RewardActivity rewardActivity = RewardActivity.this;
            String string = rewardActivity.getString(wa.j.text_coin_challenge_no_ad);
            p.g(string, "getString(R.string.text_coin_challenge_no_ad)");
            rewardActivity.G3(string);
        }

        @Override // rg.d
        /* renamed from: c */
        public void b(gh.b bVar) {
            p.h(bVar, AdLogBase.AD);
            RewardActivity.this.X = bVar;
            gh.b bVar2 = RewardActivity.this.X;
            if (bVar2 != null) {
                bVar2.c(RewardActivity.this, this.f21910d);
            }
            gh.b bVar3 = RewardActivity.this.X;
            if (bVar3 != null) {
                bVar3.b(this.f21911e);
            }
            RewardActivity.this.Q3(true, this.f21908b, this.f21909c);
            RewardActivity.this.H3().d(false);
        }
    }

    @co.f(c = "com.dena.mirrativ.otherfeature.reward.RewardActivity$onCreate$3", f = "RewardActivity.kt", l = {201}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f21912w;

        /* renamed from: x  reason: collision with root package name */
        public Object f21913x;

        /* renamed from: y  reason: collision with root package name */
        public Object f21914y;

        /* renamed from: z  reason: collision with root package name */
        public int f21915z;

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ RewardAdCompleteResponse f21916w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ RewardActivity f21917x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(RewardAdCompleteResponse rewardAdCompleteResponse, RewardActivity rewardActivity) {
                super(0);
                this.f21916w = rewardAdCompleteResponse;
                this.f21917x = rewardActivity;
            }

            public final void a() {
                f.a.b(gb.f.P0, this.f21916w.getTitle(), this.f21916w.getIconImageUrl(), this.f21917x.getString(wa.j.text_mission_reward_description_popup), false, 8, null).z3(this.f21917x.a3(), "RewardPostResultDialogFragment");
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #0 {all -> 0x007a, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
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
                int r1 = r9.f21915z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f21914y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f21913x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f21912w
                com.dena.mirrativ.otherfeature.reward.RewardActivity r4 = (com.dena.mirrativ.otherfeature.reward.RewardActivity) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> L7d
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
                com.dena.mirrativ.otherfeature.reward.RewardActivity r10 = com.dena.mirrativ.otherfeature.reward.RewardActivity.this
                gb.g r10 = com.dena.mirrativ.otherfeature.reward.RewardActivity.D3(r10)
                wo.x r3 = r10.i()
                com.dena.mirrativ.otherfeature.reward.RewardActivity r10 = com.dena.mirrativ.otherfeature.reward.RewardActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L7d
                r4 = r10
                r10 = r9
            L3d:
                r10.f21912w = r4     // Catch: java.lang.Throwable -> L7d
                r10.f21913x = r3     // Catch: java.lang.Throwable -> L7d
                r10.f21914y = r1     // Catch: java.lang.Throwable -> L7d
                r10.f21915z = r2     // Catch: java.lang.Throwable -> L7d
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> L7d
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
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L7a
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L7a
                if (r10 == 0) goto L74
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> L7a
                com.dena.mirrorman.net.api.response.RewardAdCompleteResponse r10 = (com.dena.mirrorman.net.api.response.RewardAdCompleteResponse) r10     // Catch: java.lang.Throwable -> L7a
                com.dena.mirrorman.util.FragmentRunner r6 = com.dena.mirrativ.otherfeature.reward.RewardActivity.B3(r5)     // Catch: java.lang.Throwable -> L7a
                com.dena.mirrativ.otherfeature.reward.RewardActivity$d$a r7 = new com.dena.mirrativ.otherfeature.reward.RewardActivity$d$a     // Catch: java.lang.Throwable -> L7a
                r7.<init>(r10, r5)     // Catch: java.lang.Throwable -> L7a
                r6.c(r7)     // Catch: java.lang.Throwable -> L7a
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L74:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            L7a:
                r10 = move-exception
                r3 = r4
                goto L7e
            L7d:
                r10 = move-exception
            L7e:
                throw r10     // Catch: java.lang.Throwable -> L7f
            L7f:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.otherfeature.reward.RewardActivity.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.otherfeature.reward.RewardActivity$onCreate$4", f = "RewardActivity.kt", l = {201}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f21918w;

        /* renamed from: x  reason: collision with root package name */
        public Object f21919x;

        /* renamed from: y  reason: collision with root package name */
        public Object f21920y;

        /* renamed from: z  reason: collision with root package name */
        public int f21921z;

        public e(ao.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new e(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00a1, TryCatch #0 {all -> 0x00a1, blocks: (B:17:0x0054, B:19:0x005c, B:24:0x0070, B:25:0x0079, B:30:0x0087, B:28:0x007f, B:22:0x0068), top: B:41:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
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
                int r1 = r8.f21921z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f21920y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f21919x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f21918w
                com.dena.mirrativ.otherfeature.reward.RewardActivity r4 = (com.dena.mirrativ.otherfeature.reward.RewardActivity) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> La4
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
                com.dena.mirrativ.otherfeature.reward.RewardActivity r9 = com.dena.mirrativ.otherfeature.reward.RewardActivity.this
                gb.g r9 = com.dena.mirrativ.otherfeature.reward.RewardActivity.D3(r9)
                wo.x r3 = r9.h()
                com.dena.mirrativ.otherfeature.reward.RewardActivity r9 = com.dena.mirrativ.otherfeature.reward.RewardActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> La4
                r4 = r9
                r9 = r8
            L3d:
                r9.f21918w = r4     // Catch: java.lang.Throwable -> La4
                r9.f21919x = r3     // Catch: java.lang.Throwable -> La4
                r9.f21920y = r1     // Catch: java.lang.Throwable -> La4
                r9.f21921z = r2     // Catch: java.lang.Throwable -> La4
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> La4
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
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> La1
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> La1
                if (r9 == 0) goto L9b
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> La1
                com.dena.mirrativ.mirrativapi.core.MRError r9 = (com.dena.mirrativ.mirrativapi.core.MRError) r9     // Catch: java.lang.Throwable -> La1
                boolean r6 = r9 instanceof com.dena.mirrativ.mirrativapi.core.MRError.ForceUpdate     // Catch: java.lang.Throwable -> La1
                if (r6 == 0) goto L68
                r6 = r2
                goto L6e
            L68:
                com.dena.mirrativ.mirrativapi.core.MRError$Maintenance r6 = com.dena.mirrativ.mirrativapi.core.MRError.Maintenance.INSTANCE     // Catch: java.lang.Throwable -> La1
                boolean r6 = jo.p.c(r9, r6)     // Catch: java.lang.Throwable -> La1
            L6e:
                if (r6 == 0) goto L79
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> La1
                r6.l(r5, r9)     // Catch: java.lang.Throwable -> La1
                r5.finish()     // Catch: java.lang.Throwable -> La1
                goto L95
            L79:
                boolean r6 = r9 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Failure     // Catch: java.lang.Throwable -> La1
                if (r6 == 0) goto L7f
                r9 = r2
                goto L85
            L7f:
                com.dena.mirrativ.mirrativapi.core.MRError$Network r6 = com.dena.mirrativ.mirrativapi.core.MRError.Network.INSTANCE     // Catch: java.lang.Throwable -> La1
                boolean r9 = jo.p.c(r9, r6)     // Catch: java.lang.Throwable -> La1
            L85:
                if (r9 == 0) goto L95
                int r9 = wa.j.f58546c     // Catch: java.lang.Throwable -> La1
                java.lang.String r9 = r5.getString(r9)     // Catch: java.lang.Throwable -> La1
                java.lang.String r6 = "getString(R.string.error_access)"
                jo.p.g(r9, r6)     // Catch: java.lang.Throwable -> La1
                com.dena.mirrativ.otherfeature.reward.RewardActivity.z3(r5, r9)     // Catch: java.lang.Throwable -> La1
            L95:
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L9b:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            La1:
                r9 = move-exception
                r3 = r4
                goto La5
            La4:
                r9 = move-exception
            La5:
                throw r9     // Catch: java.lang.Throwable -> La6
            La6:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.otherfeature.reward.RewardActivity.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<e0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21922w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21923x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21924y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21922w = componentCallbacks;
            this.f21923x = aVar;
            this.f21924y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.e0, java.lang.Object] */
        @Override // io.a
        public final e0 invoke() {
            ComponentCallbacks componentCallbacks = this.f21922w;
            return gq.a.a(componentCallbacks).c(f0.b(e0.class), this.f21923x, this.f21924y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<gb.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21925w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21926x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21927y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21925w = componentCallbacks;
            this.f21926x = aVar;
            this.f21927y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, gb.a] */
        @Override // io.a
        public final gb.a invoke() {
            ComponentCallbacks componentCallbacks = this.f21925w;
            return gq.a.a(componentCallbacks).c(f0.b(gb.a.class), this.f21926x, this.f21927y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21928w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21929x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21930y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21928w = componentCallbacks;
            this.f21929x = aVar;
            this.f21930y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f21928w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f21929x, this.f21930y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<o> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21931w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21932x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21933y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21931w = componentCallbacks;
            this.f21932x = aVar;
            this.f21933y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.o] */
        @Override // io.a
        public final o invoke() {
            ComponentCallbacks componentCallbacks = this.f21931w;
            return gq.a.a(componentCallbacks).c(f0.b(o.class), this.f21932x, this.f21933y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21934w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21935x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21936y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21934w = componentCallbacks;
            this.f21935x = aVar;
            this.f21936y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f21934w;
            return gq.a.a(componentCallbacks).c(f0.b(i1.class), this.f21935x, this.f21936y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f21937w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f21937w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f21937w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f21938w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21939x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21940y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f21941z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f21938w = aVar;
            this.f21939x = aVar2;
            this.f21940y = aVar3;
            this.f21941z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f21938w;
            vq.a aVar2 = this.f21939x;
            io.a aVar3 = this.f21940y;
            xq.a aVar4 = this.f21941z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(gb.g.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f21942w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentActivity componentActivity) {
            super(0);
            this.f21942w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f21942w.U();
            p.g(U, "viewModelStore");
            return U;
        }
    }

    public RewardActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.P = wn.g.b(iVar, new f(this, null, null));
        this.Q = wn.g.b(iVar, new g(this, null, null));
        this.R = new s0(f0.b(gb.g.class), new m(this), new l(new k(this), null, null, gq.a.a(this)));
        this.S = wn.g.b(iVar, new h(this, null, null));
        this.T = wn.g.b(iVar, new i(this, null, null));
        this.V = wn.g.b(iVar, new j(this, null, null));
        this.W = new FragmentRunner(this);
    }

    public static final void O3(RewardActivity rewardActivity, int i10, gh.a aVar) {
        p.h(rewardActivity, "this$0");
        rewardActivity.U = true;
        rewardActivity.H3().c(i10);
    }

    public static final void P3(RewardActivity rewardActivity, Boolean bool) {
        p.h(rewardActivity, "this$0");
        db.c cVar = rewardActivity.Y;
        if (cVar == null) {
            p.v("binding");
            cVar = null;
        }
        StatusView statusView = cVar.C;
        p.g(bool, "showAdLoadingState");
        statusView.b(bool.booleanValue() ? StatusView.b.C0181b.f20790w : StatusView.b.c.f20791w);
    }

    public final void G3(String str) {
        n.f45411a.B(getApplicationContext(), str, false);
        finish();
    }

    @Override // vb.u
    public void H2(boolean z10) {
        finish();
    }

    public final gb.a H3() {
        return (gb.a) this.Q.getValue();
    }

    public final o I3() {
        return (o) this.T.getValue();
    }

    public final MRLogger J3() {
        return (MRLogger) this.S.getValue();
    }

    public final e0 K3() {
        return (e0) this.P.getValue();
    }

    public final i1 L3() {
        return (i1) this.V.getValue();
    }

    public final gb.g M3() {
        return (gb.g) this.R.getValue();
    }

    public final void N3(final int i10, String str) {
        if (!K3().c()) {
            String string = getString(wa.j.f58546c);
            p.g(string, "getString(R.string.error_access)");
            G3(string);
        } else if (p.c(I3().H().f(), Boolean.TRUE)) {
            String string2 = getString(wa.j.f58557s);
            p.g(string2, "getString(R.string.text_…available_with_live_play)");
            G3(string2);
        } else if (L3().a().d()) {
            String string3 = getString(wa.j.f58556r);
            p.g(string3, "getString(R.string.text_no_kyc_info_when_onlive)");
            G3(string3);
        } else {
            c cVar = new c(i10, str, new q() { // from class: gb.d
                @Override // rg.q
                public final void a(gh.a aVar) {
                    RewardActivity.O3(RewardActivity.this, i10, aVar);
                }
            }, new b());
            H3().d(true);
            gh.b.a(this, getString(wa.j.ad_mob_sdk_key), new f.a().c(), cVar);
        }
    }

    public final void Q3(boolean z10, int i10, String str) {
        p.h(str, "title");
        MRLogger J3 = J3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_COIN_CHALLENGE_CM_VIEW_TAP);
        builder.setPageId(getIntent().getStringExtra("referer"));
        xm.e eVar = new xm.e();
        HashMap hashMap = new HashMap();
        hashMap.put("is_cm_enabled", z10 ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
        hashMap.put("reward_id", String.valueOf(i10));
        hashMap.put("title", str);
        v vVar = v.f59242a;
        builder.setPayload(r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, eVar.s(hashMap))));
        J3.sendLog(builder.build());
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding g10 = androidx.databinding.f.g(this, wa.f.activity_reward);
        p.g(g10, "setContentView(this, R.layout.activity_reward)");
        this.Y = (db.c) g10;
        M3().j().i(this, new androidx.lifecycle.f0() { // from class: gb.c
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                RewardActivity.P3(RewardActivity.this, (Boolean) obj);
            }
        });
        int intExtra = getIntent().getIntExtra("auto_load_reward_id", 0);
        if (intExtra != 0) {
            N3(intExtra, "");
        }
        uo.l.d(this, null, null, new d(null), 3, null);
        uo.l.d(this, null, null, new e(null), 3, null);
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }
}
