package com.dena.mirrativ.streaming.liveprepare.mainsettings;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.streaming.CastService;
import com.dena.mirrativ.streaming.emomo.StreamEmomoActivity;
import com.dena.mirrativ.streaming.liveprepare.LivePermissionActivity;
import com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.user.UserBasicParams;
import com.dena.mirrorman.net.api.response.user.UserGroup;
import ha.a;
import java.util.ArrayList;
import java.util.List;
import jo.f0;
import jo.q;
import kf.x;
import kq.a;
import nd.i1;
import nf.v;
import od.w;
import rd.o0;
import uo.q0;
import uo.r0;
import xn.a0;
import xn.r;

/* loaded from: classes2.dex */
public final class LivePrepareForFriendActivity extends e.b implements q0 {
    public static final a Y = new a(null);
    public static final int Z = 8;
    public ac.e P;
    public final wn.f R;
    public final wn.f S;
    public final wn.f T;
    public final wn.f U;
    public final o0 V;
    public final androidx.activity.result.c<Intent> W;
    public final androidx.activity.result.c<Intent> X;
    public final /* synthetic */ da.j O = new da.j();
    public final wn.f Q = new s0(f0.b(v.class), new p(this), new o(new n(this), null, null, gq.a.a(this)));

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context) {
            jo.p.h(context, "context");
            return new Intent(context, LivePrepareForFriendActivity.class);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.l<v.a, wn.v> {
        public b() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(v.a aVar) {
            List o02;
            jo.p.h(aVar, "groupWithCheckStatus");
            if (aVar.b()) {
                List<UserGroup> k10 = LivePrepareForFriendActivity.this.O3().k();
                o02 = new ArrayList();
                for (Object obj : k10) {
                    if (!jo.p.c(((UserGroup) obj).getId(), aVar.a().getId())) {
                        o02.add(obj);
                    }
                }
            } else {
                o02 = a0.o0(LivePrepareForFriendActivity.this.O3().k(), r.d(aVar.a()));
            }
            LivePrepareForFriendActivity.this.L3().i(Referer.Broadcast.SETTING, LivePrepareForFriendActivity.this.O3().k(), LivePrepareForFriendActivity.this.O3().l(), o02, LivePrepareForFriendActivity.this.O3().l());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(v.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.l<v.b, wn.v> {
        public c() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(v.b bVar) {
            List<? extends UserBasicParams> o02;
            jo.p.h(bVar, "userWithCheckStatus");
            if (bVar.b()) {
                List<UserBasicParams> l10 = LivePrepareForFriendActivity.this.O3().l();
                o02 = new ArrayList<>();
                for (Object obj : l10) {
                    if (!jo.p.c(((UserBasicParams) obj).getUserId(), bVar.a().getUserId())) {
                        o02.add(obj);
                    }
                }
            } else {
                o02 = a0.o0(LivePrepareForFriendActivity.this.O3().l(), r.d(bVar.a()));
            }
            LivePrepareForFriendActivity.this.L3().i(Referer.Broadcast.SETTING, LivePrepareForFriendActivity.this.O3().k(), LivePrepareForFriendActivity.this.O3().l(), LivePrepareForFriendActivity.this.O3().k(), o02);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(v.b bVar) {
            a(bVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends RecyclerView.u {
        public d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            int intValue;
            jo.p.h(recyclerView, "recyclerView");
            ac.e eVar = LivePrepareForFriendActivity.this.P;
            ac.e eVar2 = null;
            if (eVar == null) {
                jo.p.v("binding");
                eVar = null;
            }
            RecyclerView.p layoutManager = eVar.G.getLayoutManager();
            jo.p.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int l22 = ((LinearLayoutManager) layoutManager).l2();
            Integer f10 = LivePrepareForFriendActivity.this.O3().m().f();
            if (f10 != null && (intValue = f10.intValue()) > 1) {
                int i12 = l22 + 5;
                ac.e eVar3 = LivePrepareForFriendActivity.this.P;
                if (eVar3 == null) {
                    jo.p.v("binding");
                    eVar3 = null;
                }
                RecyclerView.h adapter = eVar3.G.getAdapter();
                jo.p.e(adapter);
                if (i12 <= adapter.getItemCount() || jo.p.c(LivePrepareForFriendActivity.this.O3().r().f(), a.b.f34695b)) {
                    return;
                }
                w L3 = LivePrepareForFriendActivity.this.L3();
                ac.e eVar4 = LivePrepareForFriendActivity.this.P;
                if (eVar4 == null) {
                    jo.p.v("binding");
                } else {
                    eVar2 = eVar4;
                }
                L3.h(Referer.Broadcast.SETTING, eVar2.E.getText().toString(), intValue);
            }
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity$onCreate$2", f = "LivePrepareForFriendActivity.kt", l = {275}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f23952w;

        /* renamed from: x  reason: collision with root package name */
        public Object f23953x;

        /* renamed from: y  reason: collision with root package name */
        public Object f23954y;

        /* renamed from: z  reason: collision with root package name */
        public int f23955z;

        public e(ao.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0097, TRY_LEAVE, TryCatch #0 {all -> 0x0097, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
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
                int r1 = r9.f23955z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f23954y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f23953x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f23952w
                com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity r4 = (com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> L9a
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
                com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity r10 = com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity.this
                nf.v r10 = com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity.K3(r10)
                wo.x r3 = r10.q()
                com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity r10 = com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L9a
                r4 = r10
                r10 = r9
            L3d:
                r10.f23952w = r4     // Catch: java.lang.Throwable -> L9a
                r10.f23953x = r3     // Catch: java.lang.Throwable -> L9a
                r10.f23954y = r1     // Catch: java.lang.Throwable -> L9a
                r10.f23955z = r2     // Catch: java.lang.Throwable -> L9a
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> L9a
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
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L97
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L97
                if (r10 == 0) goto L91
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> L97
                wn.v r10 = (wn.v) r10     // Catch: java.lang.Throwable -> L97
                rd.o0 r10 = com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity.H3(r5)     // Catch: java.lang.Throwable -> L97
                nf.v r6 = com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity.K3(r5)     // Catch: java.lang.Throwable -> L97
                androidx.lifecycle.LiveData r6 = r6.j()     // Catch: java.lang.Throwable -> L97
                java.lang.Object r6 = r6.f()     // Catch: java.lang.Throwable -> L97
                jo.p.e(r6)     // Catch: java.lang.Throwable -> L97
                java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L97
                nf.v r7 = com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity.K3(r5)     // Catch: java.lang.Throwable -> L97
                androidx.lifecycle.e0 r7 = r7.t()     // Catch: java.lang.Throwable -> L97
                java.lang.Object r7 = r7.f()     // Catch: java.lang.Throwable -> L97
                jo.p.e(r7)     // Catch: java.lang.Throwable -> L97
                java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L97
                r10.f(r6, r7)     // Catch: java.lang.Throwable -> L97
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L91:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            L97:
                r10 = move-exception
                r3 = r4
                goto L9b
            L9a:
                r10 = move-exception
            L9b:
                throw r10     // Catch: java.lang.Throwable -> L9c
            L9c:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity$onCreate$3", f = "LivePrepareForFriendActivity.kt", l = {275}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f23956w;

        /* renamed from: x  reason: collision with root package name */
        public Object f23957x;

        /* renamed from: y  reason: collision with root package name */
        public Object f23958y;

        /* renamed from: z  reason: collision with root package name */
        public int f23959z;

        public f(ao.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:16:0x0053, B:18:0x005c, B:20:0x0068, B:22:0x006f), top: B:33:0x0053 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:33:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f23959z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f23958y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f23957x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f23956w
                com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity r4 = (com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L9d
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
                com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity r9 = com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity.this
                nf.v r9 = com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity.K3(r9)
                wo.x r3 = r9.s()
                com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity r9 = com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L9d
                r4 = r9
                r9 = r8
            L3d:
                r9.f23956w = r4     // Catch: java.lang.Throwable -> L9d
                r9.f23957x = r3     // Catch: java.lang.Throwable -> L9d
                r9.f23958y = r1     // Catch: java.lang.Throwable -> L9d
                r9.f23959z = r2     // Catch: java.lang.Throwable -> L9d
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L9d
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
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L9a
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L9a
                r6 = 0
                if (r9 == 0) goto L94
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L9a
                ye.c r9 = (ye.c) r9     // Catch: java.lang.Throwable -> L9a
                ac.e r9 = com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity.I3(r5)     // Catch: java.lang.Throwable -> L9a
                if (r9 != 0) goto L6e
                java.lang.String r9 = "binding"
                jo.p.v(r9)     // Catch: java.lang.Throwable -> L9a
                goto L6f
            L6e:
                r6 = r9
            L6f:
                android.widget.FrameLayout r9 = r6.C     // Catch: java.lang.Throwable -> L9a
                r6 = 8
                r9.setVisibility(r6)     // Catch: java.lang.Throwable -> L9a
                java.lang.String r9 = "media_projection"
                java.lang.Object r9 = r5.getSystemService(r9)     // Catch: java.lang.Throwable -> L9a
                java.lang.String r6 = "null cannot be cast to non-null type android.media.projection.MediaProjectionManager"
                jo.p.f(r9, r6)     // Catch: java.lang.Throwable -> L9a
                android.media.projection.MediaProjectionManager r9 = (android.media.projection.MediaProjectionManager) r9     // Catch: java.lang.Throwable -> L9a
                android.content.Intent r9 = r9.createScreenCaptureIntent()     // Catch: java.lang.Throwable -> L9a
                androidx.activity.result.c r6 = com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity.J3(r5)     // Catch: java.lang.Throwable -> L9a
                r6.a(r9)     // Catch: java.lang.Throwable -> L9a
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L94:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L9a:
                r9 = move-exception
                r3 = r4
                goto L9e
            L9d:
                r9 = move-exception
            L9e:
                throw r9     // Catch: java.lang.Throwable -> L9f
            L9f:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity$onCreate$4", f = "LivePrepareForFriendActivity.kt", l = {275}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f23960w;

        /* renamed from: x  reason: collision with root package name */
        public Object f23961x;

        /* renamed from: y  reason: collision with root package name */
        public Object f23962y;

        /* renamed from: z  reason: collision with root package name */
        public int f23963z;

        public g(ao.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: all -> 0x00ad, TryCatch #2 {all -> 0x00ad, blocks: (B:16:0x0053, B:18:0x005c, B:20:0x0068, B:22:0x006f, B:27:0x0084, B:28:0x008a, B:30:0x0092, B:31:0x009d, B:25:0x007c), top: B:46:0x0053 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:46:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f23963z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f23962y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f23961x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f23960w
                com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity r4 = (com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> Lb0
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
                com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity r10 = com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity.this
                nf.v r10 = com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity.K3(r10)
                wo.x r3 = r10.i()
                com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity r10 = com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> Lb0
                r4 = r10
                r10 = r9
            L3d:
                r10.f23960w = r4     // Catch: java.lang.Throwable -> Lb0
                r10.f23961x = r3     // Catch: java.lang.Throwable -> Lb0
                r10.f23962y = r1     // Catch: java.lang.Throwable -> Lb0
                r10.f23963z = r2     // Catch: java.lang.Throwable -> Lb0
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> Lb0
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
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> Lad
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> Lad
                r6 = 0
                if (r10 == 0) goto La7
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> Lad
                com.dena.mirrativ.mirrativapi.core.MRError r10 = (com.dena.mirrativ.mirrativapi.core.MRError) r10     // Catch: java.lang.Throwable -> Lad
                ac.e r7 = com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity.I3(r5)     // Catch: java.lang.Throwable -> Lad
                if (r7 != 0) goto L6e
                java.lang.String r7 = "binding"
                jo.p.v(r7)     // Catch: java.lang.Throwable -> Lad
                goto L6f
            L6e:
                r6 = r7
            L6f:
                android.widget.FrameLayout r6 = r6.C     // Catch: java.lang.Throwable -> Lad
                r7 = 8
                r6.setVisibility(r7)     // Catch: java.lang.Throwable -> Lad
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.ForceUpdate     // Catch: java.lang.Throwable -> Lad
                if (r6 == 0) goto L7c
                r6 = r2
                goto L82
            L7c:
                com.dena.mirrativ.mirrativapi.core.MRError$Maintenance r6 = com.dena.mirrativ.mirrativapi.core.MRError.Maintenance.INSTANCE     // Catch: java.lang.Throwable -> Lad
                boolean r6 = jo.p.c(r10, r6)     // Catch: java.lang.Throwable -> Lad
            L82:
                if (r6 == 0) goto L8a
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> Lad
                r6.l(r5, r10)     // Catch: java.lang.Throwable -> Lad
                goto La1
            L8a:
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> Lad
                java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> Lad
                if (r10 != 0) goto L9d
                int r10 = xb.r.f60070c     // Catch: java.lang.Throwable -> Lad
                java.lang.String r10 = r5.getString(r10)     // Catch: java.lang.Throwable -> Lad
                java.lang.String r7 = "getString(R.string.error_access)"
                jo.p.g(r10, r7)     // Catch: java.lang.Throwable -> Lad
            L9d:
                r7 = 0
                r6.B(r5, r10, r7)     // Catch: java.lang.Throwable -> Lad
            La1:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            La7:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            Lad:
                r10 = move-exception
                r3 = r4
                goto Lb1
            Lb0:
                r10 = move-exception
            Lb1:
                throw r10     // Catch: java.lang.Throwable -> Lb2
            Lb2:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends q implements io.a<wn.v> {
        public h() {
            super(0);
        }

        public final void a() {
            LivePrepareForFriendActivity.this.L3().f(Referer.Broadcast.SETTING);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends q implements io.a<wn.v> {
        public i() {
            super(0);
        }

        public final void a() {
            w L3 = LivePrepareForFriendActivity.this.L3();
            ac.e eVar = LivePrepareForFriendActivity.this.P;
            if (eVar == null) {
                jo.p.v("binding");
                eVar = null;
            }
            L3.g(Referer.Broadcast.SETTING, eVar.E.getText().toString());
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends q implements io.a<w> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23966w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23967x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23968y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23966w = componentCallbacks;
            this.f23967x = aVar;
            this.f23968y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.w] */
        @Override // io.a
        public final w invoke() {
            ComponentCallbacks componentCallbacks = this.f23966w;
            return gq.a.a(componentCallbacks).c(f0.b(w.class), this.f23967x, this.f23968y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends q implements io.a<x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23969w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23970x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23971y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23969w = componentCallbacks;
            this.f23970x = aVar;
            this.f23971y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final x invoke() {
            ComponentCallbacks componentCallbacks = this.f23969w;
            return gq.a.a(componentCallbacks).c(f0.b(x.class), this.f23970x, this.f23971y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends q implements io.a<i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23972w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23973x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23974y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23972w = componentCallbacks;
            this.f23973x = aVar;
            this.f23974y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f23972w;
            return gq.a.a(componentCallbacks).c(f0.b(i1.class), this.f23973x, this.f23974y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23975w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23976x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23977y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23975w = componentCallbacks;
            this.f23976x = aVar;
            this.f23977y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f23975w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f23976x, this.f23977y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f23978w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentActivity componentActivity) {
            super(0);
            this.f23978w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f23978w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f23979w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23980x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23981y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f23982z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f23979w = aVar;
            this.f23980x = aVar2;
            this.f23981y = aVar3;
            this.f23982z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f23979w;
            vq.a aVar2 = this.f23980x;
            io.a aVar3 = this.f23981y;
            xq.a aVar4 = this.f23982z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(v.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f23983w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentActivity componentActivity) {
            super(0);
            this.f23983w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f23983w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    public LivePrepareForFriendActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.R = wn.g.b(iVar, new j(this, null, null));
        this.S = wn.g.b(iVar, new k(this, null, null));
        this.T = wn.g.b(iVar, new l(this, null, null));
        this.U = wn.g.b(iVar, new m(this, null, null));
        this.V = new o0(new b(), new c());
        androidx.activity.result.c<Intent> V2 = V2(new c.c(), new androidx.activity.result.b() { // from class: lc.h0
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                LivePrepareForFriendActivity.R3(LivePrepareForFriendActivity.this, (androidx.activity.result.a) obj);
            }
        });
        jo.p.g(V2, "registerForActivityResul…t)\n        finish()\n    }");
        this.W = V2;
        androidx.activity.result.c<Intent> V22 = V2(new c.c(), new androidx.activity.result.b() { // from class: lc.i0
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                LivePrepareForFriendActivity.Q3(LivePrepareForFriendActivity.this, (androidx.activity.result.a) obj);
            }
        });
        jo.p.g(V22, "registerForActivityResul…reator.createLive()\n    }");
        this.X = V22;
    }

    public static final void Q3(LivePrepareForFriendActivity livePrepareForFriendActivity, androidx.activity.result.a aVar) {
        jo.p.h(livePrepareForFriendActivity, "this$0");
        LivePermissionActivity.a aVar2 = LivePermissionActivity.V;
        jo.p.g(aVar, "result");
        if (aVar2.c(aVar)) {
            ac.e eVar = livePrepareForFriendActivity.P;
            if (eVar == null) {
                jo.p.v("binding");
                eVar = null;
            }
            eVar.C.setVisibility(0);
            livePrepareForFriendActivity.L3().e();
        }
    }

    public static final void R3(LivePrepareForFriendActivity livePrepareForFriendActivity, androidx.activity.result.a aVar) {
        ye.c o10;
        Intent K;
        jo.p.h(livePrepareForFriendActivity, "this$0");
        if (aVar.b() == -1 && (o10 = livePrepareForFriendActivity.O3().o()) != null) {
            livePrepareForFriendActivity.N3().a().i("live_created");
            c3.a.n(livePrepareForFriendActivity.getApplicationContext(), CastService.X0.a(livePrepareForFriendActivity, ye.c.L.a(o10, aVar.b(), aVar.a()), true));
            if (livePrepareForFriendActivity.P3().L0()) {
                K = StreamEmomoActivity.a.b(StreamEmomoActivity.Q0, livePrepareForFriendActivity, null, 2, null);
            } else {
                K = livePrepareForFriendActivity.M3().K(livePrepareForFriendActivity, false, false, true);
            }
            K.addFlags(335544320);
            livePrepareForFriendActivity.startActivity(K);
            livePrepareForFriendActivity.finish();
        }
    }

    public static final void S3(LivePrepareForFriendActivity livePrepareForFriendActivity, View view) {
        jo.p.h(livePrepareForFriendActivity, "this$0");
        livePrepareForFriendActivity.onBackPressed();
    }

    public static final void T3(LivePrepareForFriendActivity livePrepareForFriendActivity, ha.a aVar) {
        jo.p.h(livePrepareForFriendActivity, "this$0");
        ac.e eVar = null;
        if (aVar instanceof a.d) {
            ac.e eVar2 = livePrepareForFriendActivity.P;
            if (eVar2 == null) {
                jo.p.v("binding");
            } else {
                eVar = eVar2;
            }
            eVar.I.b(StatusView.b.c.f20791w);
        } else if (aVar instanceof a.b) {
            ac.e eVar3 = livePrepareForFriendActivity.P;
            if (eVar3 == null) {
                jo.p.v("binding");
            } else {
                eVar = eVar3;
            }
            eVar.I.b(StatusView.b.C0181b.f20790w);
        } else if (aVar instanceof a.c) {
        } else {
            if (aVar instanceof a.e) {
                ac.e eVar4 = livePrepareForFriendActivity.P;
                if (eVar4 == null) {
                    jo.p.v("binding");
                    eVar4 = null;
                }
                eVar4.I.b(new StatusView.b.d(livePrepareForFriendActivity.getString(xb.r.text_no_follower_for_friend_only_live), 0.0f, 2, null));
            } else if (aVar instanceof a.C0439a) {
                ac.e eVar5 = livePrepareForFriendActivity.P;
                if (eVar5 == null) {
                    jo.p.v("binding");
                } else {
                    eVar = eVar5;
                }
                StatusView statusView = eVar.I;
                String message = ((a.C0439a) aVar).b().getMessage();
                if (message == null) {
                    message = livePrepareForFriendActivity.getString(xb.r.f60070c);
                    jo.p.g(message, "getString(R.string.error_access)");
                }
                statusView.b(new StatusView.b.a(message, new h()));
            }
        }
    }

    public static final void U3(LivePrepareForFriendActivity livePrepareForFriendActivity, ha.a aVar) {
        jo.p.h(livePrepareForFriendActivity, "this$0");
        ac.e eVar = null;
        if (aVar instanceof a.d) {
            ac.e eVar2 = livePrepareForFriendActivity.P;
            if (eVar2 == null) {
                jo.p.v("binding");
            } else {
                eVar = eVar2;
            }
            eVar.I.b(StatusView.b.c.f20791w);
        } else if (aVar instanceof a.b) {
            ac.e eVar3 = livePrepareForFriendActivity.P;
            if (eVar3 == null) {
                jo.p.v("binding");
            } else {
                eVar = eVar3;
            }
            eVar.I.b(StatusView.b.C0181b.f20790w);
        } else if (aVar instanceof a.c) {
        } else {
            if (aVar instanceof a.e) {
                ac.e eVar4 = livePrepareForFriendActivity.P;
                if (eVar4 == null) {
                    jo.p.v("binding");
                    eVar4 = null;
                }
                StatusView statusView = eVar4.I;
                int i10 = xb.r.text_no_result;
                Object[] objArr = new Object[1];
                ac.e eVar5 = livePrepareForFriendActivity.P;
                if (eVar5 == null) {
                    jo.p.v("binding");
                    eVar5 = null;
                }
                objArr[0] = eVar5.E.getText().toString();
                statusView.b(new StatusView.b.d(livePrepareForFriendActivity.getString(i10, objArr), 0.0f, 2, null));
            } else if ((aVar instanceof a.C0439a) && livePrepareForFriendActivity.V.getItemCount() == 0) {
                ac.e eVar6 = livePrepareForFriendActivity.P;
                if (eVar6 == null) {
                    jo.p.v("binding");
                } else {
                    eVar = eVar6;
                }
                StatusView statusView2 = eVar.I;
                String message = ((a.C0439a) aVar).b().getMessage();
                if (message == null) {
                    message = livePrepareForFriendActivity.getString(xb.r.f60070c);
                    jo.p.g(message, "getString(R.string.error_access)");
                }
                statusView2.b(new StatusView.b.a(message, new i()));
            }
        }
    }

    public static final boolean V3(LivePrepareForFriendActivity livePrepareForFriendActivity, TextView textView, int i10, KeyEvent keyEvent) {
        jo.p.h(livePrepareForFriendActivity, "this$0");
        if (i10 == 6) {
            ac.e eVar = livePrepareForFriendActivity.P;
            ac.e eVar2 = null;
            if (eVar == null) {
                jo.p.v("binding");
                eVar = null;
            }
            if (eVar.E.getText().toString().length() == 0) {
                livePrepareForFriendActivity.L3().f(Referer.Broadcast.SETTING);
            } else {
                w L3 = livePrepareForFriendActivity.L3();
                ac.e eVar3 = livePrepareForFriendActivity.P;
                if (eVar3 == null) {
                    jo.p.v("binding");
                    eVar3 = null;
                }
                L3.g(Referer.Broadcast.SETTING, eVar3.E.getText().toString());
            }
            of.j jVar = of.j.f45405a;
            ac.e eVar4 = livePrepareForFriendActivity.P;
            if (eVar4 == null) {
                jo.p.v("binding");
            } else {
                eVar2 = eVar4;
            }
            jVar.c(livePrepareForFriendActivity, eVar2.E);
            return true;
        }
        return false;
    }

    public static final void W3(LivePrepareForFriendActivity livePrepareForFriendActivity, MRError mRError) {
        jo.p.h(livePrepareForFriendActivity, "this$0");
        if (mRError instanceof MRError.ForceUpdate ? true : jo.p.c(mRError, MRError.Maintenance.INSTANCE)) {
            of.n.f45411a.l(livePrepareForFriendActivity, mRError);
        }
    }

    public static final void X3(LivePrepareForFriendActivity livePrepareForFriendActivity, View view) {
        jo.p.h(livePrepareForFriendActivity, "this$0");
        livePrepareForFriendActivity.X.a(LivePermissionActivity.V.a(livePrepareForFriendActivity));
    }

    public static final void Y3(LivePrepareForFriendActivity livePrepareForFriendActivity, View view, boolean z10) {
        jo.p.h(livePrepareForFriendActivity, "this$0");
        livePrepareForFriendActivity.Z3();
    }

    public final w L3() {
        return (w) this.R.getValue();
    }

    public final tb.c M3() {
        return (tb.c) this.U.getValue();
    }

    public final i1 N3() {
        return (i1) this.T.getValue();
    }

    public final v O3() {
        return (v) this.Q.getValue();
    }

    public final x P3() {
        return (x) this.S.getValue();
    }

    public final void Z3() {
        int i10;
        ac.e eVar = this.P;
        ac.e eVar2 = null;
        if (eVar == null) {
            jo.p.v("binding");
            eVar = null;
        }
        if (eVar.E.hasFocus()) {
            i10 = xb.l.f59952y;
        } else {
            i10 = xb.l.f59941k;
        }
        int d10 = c3.a.d(this, i10);
        Drawable f10 = c3.a.f(this, xb.n.ic_search_gray);
        if (f10 != null) {
            g3.a.n(f10, d10);
        } else {
            f10 = null;
        }
        ac.e eVar3 = this.P;
        if (eVar3 == null) {
            jo.p.v("binding");
            eVar3 = null;
        }
        eVar3.E.setCompoundDrawablesWithIntrinsicBounds(f10, (Drawable) null, (Drawable) null, (Drawable) null);
        ac.e eVar4 = this.P;
        if (eVar4 == null) {
            jo.p.v("binding");
        } else {
            eVar2 = eVar4;
        }
        eVar2.E.setTextColor(d10);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(xb.j.activity_live_prepare_for_friend_enter, xb.j.activity_live_prepare_for_friend_exit);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding g10 = androidx.databinding.f.g(this, xb.p.activity_live_prepare_for_friend_only);
        jo.p.g(g10, "setContentView(this, R.l…_prepare_for_friend_only)");
        ac.e eVar = (ac.e) g10;
        this.P = eVar;
        ac.e eVar2 = null;
        if (eVar == null) {
            jo.p.v("binding");
            eVar = null;
        }
        eVar.K.setText(getString(xb.r.text_emoji_lock) + getString(xb.r.text_private_ttl_default));
        ac.e eVar3 = this.P;
        if (eVar3 == null) {
            jo.p.v("binding");
            eVar3 = null;
        }
        eVar3.B.setOnClickListener(new View.OnClickListener() { // from class: lc.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LivePrepareForFriendActivity.S3(LivePrepareForFriendActivity.this, view);
            }
        });
        L3().f(Referer.Broadcast.SETTING);
        uo.l.d(this, null, null, new e(null), 3, null);
        uo.l.d(this, null, null, new f(null), 3, null);
        uo.l.d(this, null, null, new g(null), 3, null);
        O3().p().i(this, new androidx.lifecycle.f0() { // from class: lc.j0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                LivePrepareForFriendActivity.T3(LivePrepareForFriendActivity.this, (ha.a) obj);
            }
        });
        O3().r().i(this, new androidx.lifecycle.f0() { // from class: lc.k0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                LivePrepareForFriendActivity.U3(LivePrepareForFriendActivity.this, (ha.a) obj);
            }
        });
        ac.e eVar4 = this.P;
        if (eVar4 == null) {
            jo.p.v("binding");
            eVar4 = null;
        }
        eVar4.G.setAdapter(this.V);
        ac.e eVar5 = this.P;
        if (eVar5 == null) {
            jo.p.v("binding");
            eVar5 = null;
        }
        eVar5.E.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: lc.g0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                boolean V3;
                V3 = LivePrepareForFriendActivity.V3(LivePrepareForFriendActivity.this, textView, i10, keyEvent);
                return V3;
            }
        });
        O3().n().i(this, new androidx.lifecycle.f0() { // from class: lc.l0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                LivePrepareForFriendActivity.W3(LivePrepareForFriendActivity.this, (MRError) obj);
            }
        });
        ac.e eVar6 = this.P;
        if (eVar6 == null) {
            jo.p.v("binding");
            eVar6 = null;
        }
        eVar6.H.setOnClickListener(new View.OnClickListener() { // from class: lc.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LivePrepareForFriendActivity.X3(LivePrepareForFriendActivity.this, view);
            }
        });
        ac.e eVar7 = this.P;
        if (eVar7 == null) {
            jo.p.v("binding");
            eVar7 = null;
        }
        eVar7.G.k(new d());
        ac.e eVar8 = this.P;
        if (eVar8 == null) {
            jo.p.v("binding");
        } else {
            eVar2 = eVar8;
        }
        eVar2.E.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: lc.f0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                LivePrepareForFriendActivity.Y3(LivePrepareForFriendActivity.this, view, z10);
            }
        });
        Z3();
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        r0.d(this, null, 1, null);
        super.onDestroy();
    }
}
