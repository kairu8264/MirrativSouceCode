package com.dena.mirrorman.feature.notice;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.l;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.feature.notice.FollowPushSettingsActivity;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.user.UrgeUser;
import ha.a;
import java.util.List;
import jo.f0;
import jo.p;
import jo.q;
import nd.b1;
import nd.f1;
import od.k;
import uo.q0;
import uo.r0;
import wn.v;

/* loaded from: classes2.dex */
public final class FollowPushSettingsActivity extends e.b implements q0 {
    public static final a S = new a(null);
    public static final int T = 8;
    public static final int U = f1.text_push_setting_live;
    public final /* synthetic */ da.j O = new da.j();
    public final wn.f P;
    public final wn.f Q;
    public final wn.f R;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public static /* synthetic */ Intent b(a aVar, Context context, Integer num, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                num = Integer.valueOf(FollowPushSettingsActivity.U);
            }
            return aVar.a(context, num);
        }

        public final Intent a(Context context, Integer num) {
            p.h(context, "context");
            Intent intent = new Intent(context, FollowPushSettingsActivity.class);
            intent.putExtra("BUNDLE_KEY_TITLE_RESOURCE_ID", num);
            return intent;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<uq.a> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f25886w = new b();

        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            return uq.b.b(Referer.Notice.FOLLOW_PUSH_SETTINGS);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends RecyclerView.u {
        public c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            p.h(recyclerView, "recyclerView");
            super.b(recyclerView, i10, i11);
            Integer f10 = FollowPushSettingsActivity.this.G3().h().f();
            boolean z10 = false;
            if (f10 == null) {
                f10 = 0;
            }
            int intValue = f10.intValue();
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            ha.a f11 = FollowPushSettingsActivity.this.G3().i().f();
            if (f11 != null && f11.a()) {
                z10 = true;
            }
            if (z10 || intValue < 1 || linearLayoutManager.l2() + 10 < linearLayoutManager.j0()) {
                return;
            }
            FollowPushSettingsActivity.this.E3().e(intValue);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<v> {
        public d() {
            super(0);
        }

        public final void a() {
            FollowPushSettingsActivity.this.E3().f();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.notice.FollowPushSettingsActivity$onCreate$5", f = "FollowPushSettingsActivity.kt", l = {128}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f25889w;

        /* renamed from: x  reason: collision with root package name */
        public Object f25890x;

        /* renamed from: y  reason: collision with root package name */
        public Object f25891y;

        /* renamed from: z  reason: collision with root package name */
        public int f25892z;

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
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0099, TryCatch #0 {all -> 0x0099, blocks: (B:17:0x0054, B:19:0x005c, B:24:0x0070, B:25:0x0076, B:27:0x007e, B:28:0x0089, B:22:0x0068), top: B:39:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
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
                int r1 = r9.f25892z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f25891y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f25890x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f25889w
                com.dena.mirrorman.feature.notice.FollowPushSettingsActivity r4 = (com.dena.mirrorman.feature.notice.FollowPushSettingsActivity) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> L9c
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
                com.dena.mirrorman.feature.notice.FollowPushSettingsActivity r10 = com.dena.mirrorman.feature.notice.FollowPushSettingsActivity.this
                nf.l r10 = com.dena.mirrorman.feature.notice.FollowPushSettingsActivity.D3(r10)
                wo.x r3 = r10.g()
                com.dena.mirrorman.feature.notice.FollowPushSettingsActivity r10 = com.dena.mirrorman.feature.notice.FollowPushSettingsActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L9c
                r4 = r10
                r10 = r9
            L3d:
                r10.f25889w = r4     // Catch: java.lang.Throwable -> L9c
                r10.f25890x = r3     // Catch: java.lang.Throwable -> L9c
                r10.f25891y = r1     // Catch: java.lang.Throwable -> L9c
                r10.f25892z = r2     // Catch: java.lang.Throwable -> L9c
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> L9c
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
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L99
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L99
                if (r10 == 0) goto L93
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> L99
                com.dena.mirrativ.mirrativapi.core.MRError r10 = (com.dena.mirrativ.mirrativapi.core.MRError) r10     // Catch: java.lang.Throwable -> L99
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.ForceUpdate     // Catch: java.lang.Throwable -> L99
                if (r6 == 0) goto L68
                r6 = r2
                goto L6e
            L68:
                com.dena.mirrativ.mirrativapi.core.MRError$Maintenance r6 = com.dena.mirrativ.mirrativapi.core.MRError.Maintenance.INSTANCE     // Catch: java.lang.Throwable -> L99
                boolean r6 = jo.p.c(r10, r6)     // Catch: java.lang.Throwable -> L99
            L6e:
                if (r6 == 0) goto L76
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> L99
                r6.l(r5, r10)     // Catch: java.lang.Throwable -> L99
                goto L8d
            L76:
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> L99
                java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> L99
                if (r10 != 0) goto L89
                int r10 = nd.f1.f41966c     // Catch: java.lang.Throwable -> L99
                java.lang.String r10 = r5.getString(r10)     // Catch: java.lang.Throwable -> L99
                java.lang.String r7 = "getString(R.string.error_access)"
                jo.p.g(r10, r7)     // Catch: java.lang.Throwable -> L99
            L89:
                r7 = 0
                r6.B(r5, r10, r7)     // Catch: java.lang.Throwable -> L99
            L8d:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L93:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            L99:
                r10 = move-exception
                r3 = r4
                goto L9d
            L9c:
                r10 = move-exception
            L9d:
                throw r10     // Catch: java.lang.Throwable -> L9e
            L9e:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.feature.notice.FollowPushSettingsActivity.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.l<UrgeUser, v> {
        public f() {
            super(1);
        }

        public final void a(UrgeUser urgeUser) {
            p.h(urgeUser, MRLog.TARGET_TYPE_USER);
            FollowPushSettingsActivity followPushSettingsActivity = FollowPushSettingsActivity.this;
            followPushSettingsActivity.startActivity(followPushSettingsActivity.F3().s(FollowPushSettingsActivity.this, urgeUser.getUserId(), Referer.Notice.FOLLOW_PUSH_SETTINGS));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(UrgeUser urgeUser) {
            a(urgeUser);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends q implements io.p<UrgeUser, Boolean, v> {
        public g() {
            super(2);
        }

        public final void a(UrgeUser urgeUser, boolean z10) {
            p.h(urgeUser, MRLog.TARGET_TYPE_USER);
            FollowPushSettingsActivity.this.E3().g(urgeUser.getUserId(), z10);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(UrgeUser urgeUser, Boolean bool) {
            a(urgeUser, bool.booleanValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends q implements io.a<k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25895w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25896x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25897y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25895w = componentCallbacks;
            this.f25896x = aVar;
            this.f25897y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.k, java.lang.Object] */
        @Override // io.a
        public final k invoke() {
            ComponentCallbacks componentCallbacks = this.f25895w;
            return gq.a.a(componentCallbacks).c(f0.b(k.class), this.f25896x, this.f25897y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends q implements io.a<nf.l> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25898w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25899x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25900y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25898w = componentCallbacks;
            this.f25899x = aVar;
            this.f25900y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.l, java.lang.Object] */
        @Override // io.a
        public final nf.l invoke() {
            ComponentCallbacks componentCallbacks = this.f25898w;
            return gq.a.a(componentCallbacks).c(f0.b(nf.l.class), this.f25899x, this.f25900y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25901w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25902x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25903y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25901w = componentCallbacks;
            this.f25902x = aVar;
            this.f25903y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f25901w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f25902x, this.f25903y);
        }
    }

    public FollowPushSettingsActivity() {
        b bVar = b.f25886w;
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.P = wn.g.b(iVar, new h(this, null, bVar));
        this.Q = wn.g.b(iVar, new i(this, null, null));
        this.R = wn.g.b(iVar, new j(this, null, null));
    }

    public static final void H3(FollowPushSettingsActivity followPushSettingsActivity, View view) {
        p.h(followPushSettingsActivity, "this$0");
        followPushSettingsActivity.finish();
    }

    public static final void I3(re.e eVar, List list) {
        p.h(eVar, "$adapter");
        p.g(list, "it");
        eVar.h(list);
    }

    public static final void J3(ae.g gVar, FollowPushSettingsActivity followPushSettingsActivity, ha.a aVar) {
        p.h(followPushSettingsActivity, "this$0");
        if (aVar instanceof a.d) {
            gVar.D.b(StatusView.b.c.f20791w);
        } else if (aVar instanceof a.b) {
            gVar.D.b(StatusView.b.C0181b.f20790w);
        } else if (aVar instanceof a.c) {
        } else {
            if (aVar instanceof a.e) {
                gVar.D.b(new StatusView.b.d(followPushSettingsActivity.getString(f1.f41988r3), 0.0f, 2, null));
            } else if (aVar instanceof a.C0439a) {
                StatusView statusView = gVar.D;
                String message = ((a.C0439a) aVar).b().getMessage();
                if (message == null) {
                    message = followPushSettingsActivity.getString(f1.f41966c);
                    p.g(message, "getString(R.string.error_access)");
                }
                statusView.b(new StatusView.b.a(message, new d()));
            }
        }
    }

    public final k E3() {
        return (k) this.P.getValue();
    }

    public final tb.c F3() {
        return (tb.c) this.R.getValue();
    }

    public final nf.l G3() {
        return (nf.l) this.Q.getValue();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final ae.g gVar = (ae.g) androidx.databinding.f.g(this, b1.activity_follow_push_settings);
        gVar.F.setNavigationOnClickListener(new View.OnClickListener() { // from class: re.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FollowPushSettingsActivity.H3(FollowPushSettingsActivity.this, view);
            }
        });
        gVar.E.setText(getIntent().getIntExtra("BUNDLE_KEY_TITLE_RESOURCE_ID", U));
        final re.e eVar = new re.e(new f(), new g());
        gVar.C.setAdapter(eVar);
        gVar.C.setLayoutManager(new LinearLayoutManager(this));
        gVar.C.k(new c());
        G3().j().i(this, new androidx.lifecycle.f0() { // from class: re.c
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                FollowPushSettingsActivity.I3(e.this, (List) obj);
            }
        });
        G3().i().i(this, new androidx.lifecycle.f0() { // from class: re.b
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                FollowPushSettingsActivity.J3(ae.g.this, this, (ha.a) obj);
            }
        });
        uo.l.d(this, null, null, new e(null), 3, null);
        E3().f();
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        r0.d(this, null, 1, null);
        super.onDestroy();
    }
}
