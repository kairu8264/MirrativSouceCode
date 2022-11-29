package com.dena.mirrativ.catalog.mission;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.o;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import com.dena.mirrativ.catalog.mission.MissionActivity;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.MissionInfoResponse;
import com.dena.mirrorman.net.api.response.MissionStatusResponse;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.net.glide.GlideRequest;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import ha.a;
import ia.a;
import io.l;
import jo.f0;
import jo.p;
import jo.q;
import kq.a;
import r8.e1;
import r8.f1;
import r8.h1;
import so.m;
import uo.b0;
import uo.g1;
import uo.i2;
import uo.o2;
import uo.q0;
import vb.u;
import wn.v;
import z8.r;

/* loaded from: classes.dex */
public final class MissionActivity extends e.b implements u, r.b, q0 {
    public static final a V = new a(null);
    public static final int W = 8;
    public final ao.g O;
    public int P;
    public final wn.f Q;
    public final wn.f R;
    public r S;
    public BottomSheetBehavior<View> T;
    public t8.e U;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context, String str) {
            p.h(context, "context");
            p.h(str, "referer");
            Intent intent = new Intent(context, MissionActivity.class);
            intent.putExtra("EXTRA_REFERER", str);
            return intent;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends BottomSheetBehavior.g {
        public b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void a(View view, float f10) {
            p.h(view, "p0");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View view, int i10) {
            p.h(view, "p0");
            if (i10 == 5) {
                MissionActivity.this.finish();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements l<View, v> {
        public c() {
            super(1);
        }

        public final void a(View view) {
            p.h(view, "it");
            MissionActivity.this.L3(0);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends q implements l<View, v> {
        public d() {
            super(1);
        }

        public final void a(View view) {
            p.h(view, "it");
            MissionActivity.this.L3(1);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends q implements io.a<v> {
        public e() {
            super(0);
        }

        public final void a() {
            MissionActivity missionActivity = MissionActivity.this;
            missionActivity.L3(missionActivity.P);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.mission.MissionActivity$onCreate$7", f = "MissionActivity.kt", l = {289}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f20680w;

        /* renamed from: x  reason: collision with root package name */
        public Object f20681x;

        /* renamed from: y  reason: collision with root package name */
        public Object f20682y;

        /* renamed from: z  reason: collision with root package name */
        public int f20683z;

        public f(ao.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new f(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x009d, TryCatch #2 {all -> 0x009d, blocks: (B:17:0x0054, B:19:0x005c, B:24:0x0074, B:25:0x007a, B:27:0x0082, B:28:0x008d, B:22:0x006c), top: B:43:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
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
                int r1 = r9.f20683z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f20682y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f20681x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f20680w
                com.dena.mirrativ.catalog.mission.MissionActivity r4 = (com.dena.mirrativ.catalog.mission.MissionActivity) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> La0
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
                com.dena.mirrativ.catalog.mission.MissionActivity r10 = com.dena.mirrativ.catalog.mission.MissionActivity.this
                z8.k r10 = com.dena.mirrativ.catalog.mission.MissionActivity.D3(r10)
                wo.x r3 = r10.g()
                com.dena.mirrativ.catalog.mission.MissionActivity r10 = com.dena.mirrativ.catalog.mission.MissionActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> La0
                r4 = r10
                r10 = r9
            L3d:
                r10.f20680w = r4     // Catch: java.lang.Throwable -> La0
                r10.f20681x = r3     // Catch: java.lang.Throwable -> La0
                r10.f20682y = r1     // Catch: java.lang.Throwable -> La0
                r10.f20683z = r2     // Catch: java.lang.Throwable -> La0
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> La0
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
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L9d
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L9d
                if (r10 == 0) goto L97
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> L9d
                com.dena.mirrativ.mirrativapi.core.MRError r10 = (com.dena.mirrativ.mirrativapi.core.MRError) r10     // Catch: java.lang.Throwable -> L9d
                com.dena.mirrativ.mirrativapi.core.MRError$ForceUpdate r6 = com.dena.mirrativ.mirrativapi.core.MRError.ForceUpdate.INSTANCE     // Catch: java.lang.Throwable -> L9d
                boolean r6 = jo.p.c(r10, r6)     // Catch: java.lang.Throwable -> L9d
                if (r6 == 0) goto L6c
                r6 = r2
                goto L72
            L6c:
                com.dena.mirrativ.mirrativapi.core.MRError$Maintenance r6 = com.dena.mirrativ.mirrativapi.core.MRError.Maintenance.INSTANCE     // Catch: java.lang.Throwable -> L9d
                boolean r6 = jo.p.c(r10, r6)     // Catch: java.lang.Throwable -> L9d
            L72:
                if (r6 == 0) goto L7a
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> L9d
                r6.l(r5, r10)     // Catch: java.lang.Throwable -> L9d
                goto L91
            L7a:
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> L9d
                java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> L9d
                if (r10 != 0) goto L8d
                int r10 = r8.h1.f49918a     // Catch: java.lang.Throwable -> L9d
                java.lang.String r10 = r5.getString(r10)     // Catch: java.lang.Throwable -> L9d
                java.lang.String r7 = "getString(R.string.error_access)"
                jo.p.g(r10, r7)     // Catch: java.lang.Throwable -> L9d
            L8d:
                r7 = 0
                r6.B(r5, r10, r7)     // Catch: java.lang.Throwable -> L9d
            L91:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L97:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            L9d:
                r10 = move-exception
                r3 = r4
                goto La1
            La0:
                r10 = move-exception
            La1:
                throw r10     // Catch: java.lang.Throwable -> La2
            La2:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.catalog.mission.MissionActivity.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes.dex */
    public static final class g implements ia.a {
        public g() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            t8.e eVar = MissionActivity.this.U;
            if (eVar == null) {
                p.v("binding");
                eVar = null;
            }
            eVar.I.setVisibility(4);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            a.C0469a.b(this, animation);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            a.C0469a.c(this, animation);
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends q implements io.a<z8.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20685w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20686x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20687y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20685w = componentCallbacks;
            this.f20686x = aVar;
            this.f20687y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [z8.a, java.lang.Object] */
        @Override // io.a
        public final z8.a invoke() {
            ComponentCallbacks componentCallbacks = this.f20685w;
            return gq.a.a(componentCallbacks).c(f0.b(z8.a.class), this.f20686x, this.f20687y);
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f20688w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f20688w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f20688w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20689w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20690x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20691y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f20692z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f20689w = aVar;
            this.f20690x = aVar2;
            this.f20691y = aVar3;
            this.f20692z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f20689w;
            vq.a aVar2 = this.f20690x;
            io.a aVar3 = this.f20691y;
            xq.a aVar4 = this.f20692z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(z8.k.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f20693w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f20693w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f20693w.U();
            p.g(U, "viewModelStore");
            return U;
        }
    }

    public MissionActivity() {
        b0 b10;
        o2 c10 = g1.c();
        b10 = i2.b(null, 1, null);
        this.O = c10.plus(b10);
        this.Q = wn.g.b(wn.i.SYNCHRONIZED, new h(this, null, null));
        this.R = new s0(f0.b(z8.k.class), new k(this), new j(new i(this), null, null, gq.a.a(this)));
    }

    public static final void H3(MissionActivity missionActivity, View view) {
        p.h(missionActivity, "this$0");
        BottomSheetBehavior<View> bottomSheetBehavior = missionActivity.T;
        if (bottomSheetBehavior == null) {
            p.v("behavior");
            bottomSheetBehavior = null;
        }
        bottomSheetBehavior.z0(5);
    }

    public static final void I3(MissionActivity missionActivity, ha.a aVar) {
        p.h(missionActivity, "this$0");
        t8.e eVar = null;
        if (aVar instanceof a.d) {
            t8.e eVar2 = missionActivity.U;
            if (eVar2 == null) {
                p.v("binding");
            } else {
                eVar = eVar2;
            }
            eVar.P.b(StatusView.b.c.f20791w);
        } else if (aVar instanceof a.b) {
            t8.e eVar3 = missionActivity.U;
            if (eVar3 == null) {
                p.v("binding");
            } else {
                eVar = eVar3;
            }
            eVar.P.b(StatusView.b.C0181b.f20790w);
        } else if (aVar instanceof a.C0439a) {
            t8.e eVar4 = missionActivity.U;
            if (eVar4 == null) {
                p.v("binding");
            } else {
                eVar = eVar4;
            }
            StatusView statusView = eVar.P;
            String message = ((a.C0439a) aVar).b().getMessage();
            if (message == null) {
                message = missionActivity.getString(h1.f49918a);
                p.g(message, "getString(R.string.error_access)");
            }
            statusView.b(new StatusView.b.a(message, new e()));
        } else {
            Log.d("MissionActivity", "StatusState.Unknown");
        }
    }

    public static final void J3(MissionActivity missionActivity, MissionInfoResponse missionInfoResponse) {
        p.h(missionActivity, "this$0");
        if (missionInfoResponse == null) {
            return;
        }
        t8.e eVar = null;
        if (missionInfoResponse.getUnreceivedMissionNum() > 0) {
            int i10 = missionActivity.P;
            if (i10 == 0) {
                t8.e eVar2 = missionActivity.U;
                if (eVar2 == null) {
                    p.v("binding");
                    eVar2 = null;
                }
                eVar2.H.setText(String.valueOf(missionInfoResponse.getUnreceivedMissionNum()));
                t8.e eVar3 = missionActivity.U;
                if (eVar3 == null) {
                    p.v("binding");
                    eVar3 = null;
                }
                eVar3.G.setVisibility(0);
            } else if (i10 == 1) {
                t8.e eVar4 = missionActivity.U;
                if (eVar4 == null) {
                    p.v("binding");
                    eVar4 = null;
                }
                eVar4.R.setText(String.valueOf(missionInfoResponse.getUnreceivedMissionNum()));
                t8.e eVar5 = missionActivity.U;
                if (eVar5 == null) {
                    p.v("binding");
                    eVar5 = null;
                }
                eVar5.Q.setVisibility(0);
            }
        } else {
            int i11 = missionActivity.P;
            if (i11 == 0) {
                t8.e eVar6 = missionActivity.U;
                if (eVar6 == null) {
                    p.v("binding");
                    eVar6 = null;
                }
                eVar6.H.setText("");
                t8.e eVar7 = missionActivity.U;
                if (eVar7 == null) {
                    p.v("binding");
                    eVar7 = null;
                }
                eVar7.G.setVisibility(8);
            } else if (i11 == 1) {
                t8.e eVar8 = missionActivity.U;
                if (eVar8 == null) {
                    p.v("binding");
                    eVar8 = null;
                }
                eVar8.R.setText("");
                t8.e eVar9 = missionActivity.U;
                if (eVar9 == null) {
                    p.v("binding");
                    eVar9 = null;
                }
                eVar9.Q.setVisibility(8);
            }
        }
        t8.e eVar10 = missionActivity.U;
        if (eVar10 == null) {
            p.v("binding");
            eVar10 = null;
        }
        eVar10.K.setText(missionInfoResponse.getDescription());
        GlideRequest<Drawable> load = GlideApp.with((androidx.fragment.app.h) missionActivity).load(missionInfoResponse.getHeaderImageUrl());
        t8.e eVar11 = missionActivity.U;
        if (eVar11 == null) {
            p.v("binding");
        } else {
            eVar = eVar11;
        }
        load.into(eVar.C);
    }

    public static final void K3(MissionActivity missionActivity, MissionStatusResponse missionStatusResponse) {
        p.h(missionActivity, "this$0");
        if (missionStatusResponse == null) {
            return;
        }
        t8.e eVar = null;
        if (missionStatusResponse.getDailyUnreceivedMissionNum() > 0) {
            t8.e eVar2 = missionActivity.U;
            if (eVar2 == null) {
                p.v("binding");
                eVar2 = null;
            }
            eVar2.H.setText(String.valueOf(missionStatusResponse.getDailyUnreceivedMissionNum()));
            t8.e eVar3 = missionActivity.U;
            if (eVar3 == null) {
                p.v("binding");
                eVar3 = null;
            }
            eVar3.G.setVisibility(0);
        } else {
            t8.e eVar4 = missionActivity.U;
            if (eVar4 == null) {
                p.v("binding");
                eVar4 = null;
            }
            eVar4.G.setVisibility(8);
        }
        if (missionStatusResponse.getWeeklyUnreceivedMissionNum() > 0) {
            t8.e eVar5 = missionActivity.U;
            if (eVar5 == null) {
                p.v("binding");
                eVar5 = null;
            }
            eVar5.R.setText(String.valueOf(missionStatusResponse.getWeeklyUnreceivedMissionNum()));
            t8.e eVar6 = missionActivity.U;
            if (eVar6 == null) {
                p.v("binding");
            } else {
                eVar = eVar6;
            }
            eVar.Q.setVisibility(0);
            return;
        }
        t8.e eVar7 = missionActivity.U;
        if (eVar7 == null) {
            p.v("binding");
        } else {
            eVar = eVar7;
        }
        eVar.Q.setVisibility(8);
    }

    public final z8.a F3() {
        return (z8.a) this.Q.getValue();
    }

    public final z8.k G3() {
        return (z8.k) this.R.getValue();
    }

    @Override // vb.u
    public void H2(boolean z10) {
        if (g().b() != o.c.RESUMED) {
            return;
        }
        if (z10) {
            L3(this.P);
            return;
        }
        int i10 = this.P;
        t8.e eVar = null;
        if (i10 == 0) {
            t8.e eVar2 = this.U;
            if (eVar2 == null) {
                p.v("binding");
                eVar2 = null;
            }
            Integer i11 = m.i(eVar2.H.getText().toString());
            if (i11 != null) {
                int intValue = i11.intValue() - 1;
                if (intValue > 0) {
                    t8.e eVar3 = this.U;
                    if (eVar3 == null) {
                        p.v("binding");
                    } else {
                        eVar = eVar3;
                    }
                    eVar.H.setText(String.valueOf(intValue));
                    return;
                }
                t8.e eVar4 = this.U;
                if (eVar4 == null) {
                    p.v("binding");
                    eVar4 = null;
                }
                eVar4.H.setText("");
                t8.e eVar5 = this.U;
                if (eVar5 == null) {
                    p.v("binding");
                } else {
                    eVar = eVar5;
                }
                eVar.G.setVisibility(8);
            }
        } else if (i10 != 1) {
        } else {
            t8.e eVar6 = this.U;
            if (eVar6 == null) {
                p.v("binding");
                eVar6 = null;
            }
            Integer i12 = m.i(eVar6.R.getText().toString());
            if (i12 != null) {
                int intValue2 = i12.intValue() - 1;
                if (intValue2 > 0) {
                    t8.e eVar7 = this.U;
                    if (eVar7 == null) {
                        p.v("binding");
                    } else {
                        eVar = eVar7;
                    }
                    eVar.R.setText(String.valueOf(intValue2));
                    return;
                }
                t8.e eVar8 = this.U;
                if (eVar8 == null) {
                    p.v("binding");
                    eVar8 = null;
                }
                eVar8.R.setText("");
                t8.e eVar9 = this.U;
                if (eVar9 == null) {
                    p.v("binding");
                } else {
                    eVar = eVar9;
                }
                eVar.Q.setVisibility(8);
            }
        }
    }

    public final void L3(int i10) {
        r a10;
        this.P = i10;
        String stringExtra = getIntent().getStringExtra("EXTRA_REFERER");
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (i10 == 0) {
            a10 = r.G0.a(z8.j.DAILY, stringExtra);
        } else if (i10 != 1) {
            a10 = r.G0.a(z8.j.DAILY, stringExtra);
        } else {
            a10 = r.G0.a(z8.j.WEEKLY, stringExtra);
        }
        this.S = a10;
        if (a10 != null) {
            a10.D3(this);
        }
        t8.e eVar = null;
        if (i10 == 1) {
            t8.e eVar2 = this.U;
            if (eVar2 == null) {
                p.v("binding");
                eVar2 = null;
            }
            eVar2.N.setSelected(false);
            t8.e eVar3 = this.U;
            if (eVar3 == null) {
                p.v("binding");
                eVar3 = null;
            }
            eVar3.O.setSelected(true);
        } else {
            t8.e eVar4 = this.U;
            if (eVar4 == null) {
                p.v("binding");
                eVar4 = null;
            }
            eVar4.N.setSelected(true);
            t8.e eVar5 = this.U;
            if (eVar5 == null) {
                p.v("binding");
                eVar5 = null;
            }
            eVar5.O.setSelected(false);
        }
        r rVar = this.S;
        if (rVar != null) {
            t8.e eVar6 = this.U;
            if (eVar6 == null) {
                p.v("binding");
            } else {
                eVar = eVar6;
            }
            eVar.I.setVisibility(4);
            a3().k().r(e1.O, rVar).i();
        }
    }

    @Override // z8.r.b
    public void e1() {
        t8.e eVar = this.U;
        t8.e eVar2 = null;
        if (eVar == null) {
            p.v("binding");
            eVar = null;
        }
        if (eVar.I.getVisibility() == 0) {
            t8.e eVar3 = this.U;
            if (eVar3 == null) {
                p.v("binding");
            } else {
                eVar2 = eVar3;
            }
            AppCompatImageView appCompatImageView = eVar2.I;
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setInterpolator(new LinearInterpolator());
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new g());
            appCompatImageView.startAnimation(alphaAnimation);
        }
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        BottomSheetBehavior<View> bottomSheetBehavior = this.T;
        if (bottomSheetBehavior == null) {
            p.v("behavior");
            bottomSheetBehavior = null;
        }
        bottomSheetBehavior.z0(5);
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding g10 = androidx.databinding.f.g(this, f1.activity_mission);
        p.g(g10, "setContentView(this, R.layout.activity_mission)");
        t8.e eVar = (t8.e) g10;
        this.U = eVar;
        if (eVar == null) {
            p.v("binding");
            eVar = null;
        }
        BottomSheetBehavior<View> c02 = BottomSheetBehavior.c0(eVar.M);
        p.g(c02, "from(binding.mainContainer)");
        this.T = c02;
        if (c02 == null) {
            p.v("behavior");
            c02 = null;
        }
        c02.t0(true);
        BottomSheetBehavior<View> bottomSheetBehavior = this.T;
        if (bottomSheetBehavior == null) {
            p.v("behavior");
            bottomSheetBehavior = null;
        }
        bottomSheetBehavior.y0(true);
        BottomSheetBehavior<View> bottomSheetBehavior2 = this.T;
        if (bottomSheetBehavior2 == null) {
            p.v("behavior");
            bottomSheetBehavior2 = null;
        }
        bottomSheetBehavior2.v0(0);
        BottomSheetBehavior<View> bottomSheetBehavior3 = this.T;
        if (bottomSheetBehavior3 == null) {
            p.v("behavior");
            bottomSheetBehavior3 = null;
        }
        bottomSheetBehavior3.z0(3);
        BottomSheetBehavior<View> bottomSheetBehavior4 = this.T;
        if (bottomSheetBehavior4 == null) {
            p.v("behavior");
            bottomSheetBehavior4 = null;
        }
        bottomSheetBehavior4.S(new b());
        t8.e eVar2 = this.U;
        if (eVar2 == null) {
            p.v("binding");
            eVar2 = null;
        }
        AppCompatButton appCompatButton = eVar2.N;
        p.g(appCompatButton, "binding.missionDailyButton");
        yd.g1.a(appCompatButton, new c());
        t8.e eVar3 = this.U;
        if (eVar3 == null) {
            p.v("binding");
            eVar3 = null;
        }
        AppCompatButton appCompatButton2 = eVar3.O;
        p.g(appCompatButton2, "binding.missionWeeklyButton");
        yd.g1.a(appCompatButton2, new d());
        t8.e eVar4 = this.U;
        if (eVar4 == null) {
            p.v("binding");
            eVar4 = null;
        }
        eVar4.D.setOnClickListener(new View.OnClickListener() { // from class: z8.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MissionActivity.H3(MissionActivity.this, view);
            }
        });
        G3().j().i(this, new androidx.lifecycle.f0() { // from class: z8.d
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MissionActivity.I3(MissionActivity.this, (ha.a) obj);
            }
        });
        G3().h().i(this, new androidx.lifecycle.f0() { // from class: z8.e
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MissionActivity.J3(MissionActivity.this, (MissionInfoResponse) obj);
            }
        });
        uo.l.d(this, null, null, new f(null), 3, null);
        G3().i().i(this, new androidx.lifecycle.f0() { // from class: z8.f
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MissionActivity.K3(MissionActivity.this, (MissionStatusResponse) obj);
            }
        });
        F3().c(Referer.MISSION);
        L3(0);
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }

    @Override // z8.r.b
    public void t() {
        t8.e eVar = this.U;
        t8.e eVar2 = null;
        if (eVar == null) {
            p.v("binding");
            eVar = null;
        }
        if (eVar.I.getVisibility() == 4) {
            t8.e eVar3 = this.U;
            if (eVar3 == null) {
                p.v("binding");
                eVar3 = null;
            }
            eVar3.I.setVisibility(0);
            t8.e eVar4 = this.U;
            if (eVar4 == null) {
                p.v("binding");
            } else {
                eVar2 = eVar4;
            }
            AppCompatImageView appCompatImageView = eVar2.I;
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setInterpolator(new LinearInterpolator());
            alphaAnimation.setDuration(300L);
            appCompatImageView.startAnimation(alphaAnimation);
        }
    }
}
