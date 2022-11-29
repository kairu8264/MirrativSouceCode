package com.dena.mirrorman.feature.notice;

import ae.a7;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import co.l;
import com.dena.mirrorman.feature.notice.FollowPushSettingsActivity;
import com.dena.mirrorman.feature.notice.PushSettingsFragment;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.notice.NotificationPushSettingsV3Response;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import da.j;
import io.p;
import jo.f0;
import jo.q;
import kf.t;
import nd.b1;
import nf.o;
import uo.q0;
import uo.r0;
import wn.f;
import wn.g;
import wn.i;
import wn.m;
import wn.v;

/* loaded from: classes2.dex */
public final class PushSettingsFragment extends Fragment implements CompoundButton.OnCheckedChangeListener, q0 {
    public final f A0;
    public final f B0;
    public a7 C0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ j f25904x0;

    /* renamed from: y0  reason: collision with root package name */
    public final String f25905y0;

    /* renamed from: z0  reason: collision with root package name */
    public final f f25906z0;

    @co.f(c = "com.dena.mirrorman.feature.notice.PushSettingsFragment$loadPushSettings$1", f = "PushSettingsFragment.kt", l = {97}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f25907w;

        public a(ao.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f25907w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    MRRequest s32 = PushSettingsFragment.this.s3();
                    String r32 = PushSettingsFragment.this.r3();
                    this.f25907w = 1;
                    obj = s32.notificationGetSettingsRequest(r32, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                PushSettingsFragment.this.z3((NotificationPushSettingsV3Response) obj);
                PushSettingsFragment.this.A3();
                PushSettingsFragment.this.p3().H.setVisibility(0);
            } catch (Exception unused) {
                PushSettingsFragment.this.A3();
            }
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<MRRequest> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25909w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25910x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25911y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25909w = componentCallbacks;
            this.f25910x = aVar;
            this.f25911y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.net.retrofit.MRRequest, java.lang.Object] */
        @Override // io.a
        public final MRRequest invoke() {
            ComponentCallbacks componentCallbacks = this.f25909w;
            return gq.a.a(componentCallbacks).c(f0.b(MRRequest.class), this.f25910x, this.f25911y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.a<t> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25912w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25913x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25914y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25912w = componentCallbacks;
            this.f25913x = aVar;
            this.f25914y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.t, java.lang.Object] */
        @Override // io.a
        public final t invoke() {
            ComponentCallbacks componentCallbacks = this.f25912w;
            return gq.a.a(componentCallbacks).c(f0.b(t.class), this.f25913x, this.f25914y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<o> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25915w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25916x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25917y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25915w = componentCallbacks;
            this.f25916x = aVar;
            this.f25917y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.o] */
        @Override // io.a
        public final o invoke() {
            ComponentCallbacks componentCallbacks = this.f25915w;
            return gq.a.a(componentCallbacks).c(f0.b(o.class), this.f25916x, this.f25917y);
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.notice.PushSettingsFragment$syncPushSettingsToServer$1", f = "PushSettingsFragment.kt", l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f25918w;

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

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f25918w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    MRRequest s32 = PushSettingsFragment.this.s3();
                    String r32 = PushSettingsFragment.this.r3();
                    int i11 = PushSettingsFragment.this.p3().R.isChecked() ? 1 : 0;
                    int i12 = PushSettingsFragment.this.p3().O.isChecked() ? 1 : 0;
                    int i13 = PushSettingsFragment.this.p3().T.isChecked() ? 1 : 0;
                    int i14 = PushSettingsFragment.this.p3().C.isChecked() ? 1 : 0;
                    int i15 = PushSettingsFragment.this.p3().J.isChecked() ? 1 : 0;
                    int i16 = PushSettingsFragment.this.p3().F.isChecked() ? 1 : 0;
                    this.f25918w = 1;
                    obj = s32.postNotificationPushSettings(r32, i11, i12, i13, i14, i15, i16, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                PushSettingsFragment.this.z3((NotificationPushSettingsV3Response) obj);
            } catch (Exception unused) {
            }
            return v.f59242a;
        }
    }

    public PushSettingsFragment() {
        super(b1.fragment_push_settings);
        this.f25904x0 = new j();
        this.f25905y0 = Referer.SETTINGS;
        i iVar = i.SYNCHRONIZED;
        this.f25906z0 = g.b(iVar, new b(this, null, null));
        this.A0 = g.b(iVar, new c(this, null, null));
        this.B0 = g.b(iVar, new d(this, null, null));
    }

    public static final void x3(PushSettingsFragment pushSettingsFragment, View view) {
        jo.p.h(pushSettingsFragment, "this$0");
        if (pushSettingsFragment.u3()) {
            FollowPushSettingsActivity.a aVar = FollowPushSettingsActivity.S;
            Context N2 = pushSettingsFragment.N2();
            jo.p.g(N2, "requireContext()");
            pushSettingsFragment.f3(FollowPushSettingsActivity.a.b(aVar, N2, null, 2, null));
        }
    }

    public static final void y3(PushSettingsFragment pushSettingsFragment, View view) {
        jo.p.h(pushSettingsFragment, "this$0");
        pushSettingsFragment.w3();
    }

    public final void A3() {
        p3().R.setChecked(t3().Y3());
        p3().O.setChecked(t3().H1());
        p3().T.setChecked(t3().f4());
        p3().C.setChecked(t3().R0());
        p3().J.setChecked(t3().J0());
        p3().F.setChecked(t3().m3());
        C3();
        p3().R.setOnCheckedChangeListener(this);
        p3().O.setOnCheckedChangeListener(this);
        p3().T.setOnCheckedChangeListener(this);
        p3().C.setOnCheckedChangeListener(this);
        p3().J.setOnCheckedChangeListener(this);
        p3().F.setOnCheckedChangeListener(this);
    }

    public final void B3() {
        uo.l.d(this, null, null, new e(null), 3, null);
    }

    public final void C3() {
        p3().Q.setAlpha(u3() ? 1.0f : 0.3f);
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        r0.d(this, null, 1, null);
        this.C0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void Z1() {
        super.Z1();
        Context q02 = q0();
        if (q02 != null) {
            if (b3.m.d(q02).a()) {
                p3().M.setVisibility(8);
            } else {
                p3().M.setVisibility(0);
            }
        }
        v3();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        this.C0 = a7.T(view);
        p3().Q.setOnClickListener(new View.OnClickListener() { // from class: re.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PushSettingsFragment.x3(PushSettingsFragment.this, view2);
            }
        });
        p3().L.setOnClickListener(new View.OnClickListener() { // from class: re.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PushSettingsFragment.y3(PushSettingsFragment.this, view2);
            }
        });
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f25904x0.getCoroutineContext();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        jo.p.h(compoundButton, "buttonView");
        int id2 = compoundButton.getId();
        if (id2 == p3().R.getId()) {
            C3();
            B3();
            return;
        }
        if ((((id2 == p3().O.getId() || id2 == p3().T.getId()) || id2 == p3().C.getId()) || id2 == p3().J.getId()) || id2 == p3().F.getId()) {
            B3();
        }
    }

    public final a7 p3() {
        a7 a7Var = this.C0;
        jo.p.e(a7Var);
        return a7Var;
    }

    public final o q3() {
        return (o) this.B0.getValue();
    }

    public final String r3() {
        return this.f25905y0;
    }

    public final MRRequest s3() {
        return (MRRequest) this.f25906z0.getValue();
    }

    public final t t3() {
        return (t) this.A0.getValue();
    }

    public final boolean u3() {
        if (p3().R.isChecked()) {
            Integer f10 = q3().s().f();
            if (f10 != null && f10.intValue() > 0) {
                return true;
            }
        }
        return false;
    }

    public final void v3() {
        uo.l.d(this, null, null, new a(null), 3, null);
    }

    public final void w3() {
        Context q02;
        ApplicationInfo applicationInfo;
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        Context q03 = q0();
        String packageName = q03 != null ? q03.getPackageName() : null;
        if (packageName == null || (q02 = q0()) == null || (applicationInfo = q02.getApplicationInfo()) == null) {
            return;
        }
        int i10 = applicationInfo.uid;
        intent.putExtra("app_package", packageName);
        intent.putExtra("app_uid", i10);
        intent.putExtra("android.provider.extra.APP_PACKAGE", packageName);
        f3(intent);
    }

    public final void z3(NotificationPushSettingsV3Response notificationPushSettingsV3Response) {
        t3().s1(notificationPushSettingsV3Response.isEnabledLives());
        t3().M3(notificationPushSettingsV3Response.isEnabledPresentBoxes());
        t3().F2(notificationPushSettingsV3Response.isEnabledYours());
        t3().q4(notificationPushSettingsV3Response.isEnabledCampaigns());
        t3().q1(notificationPushSettingsV3Response.isEnabledNews());
        t3().K3(notificationPushSettingsV3Response.isEnabledChats());
    }
}
