package cc;

import ac.a1;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import cc.o;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.api.response.CollabType;
import com.dena.mirrorman.net.api.response.user.CollabInvitableUser;
import java.util.Iterator;
import java.util.List;
import kq.a;
import yd.g1;

/* loaded from: classes2.dex */
public final class q extends androidx.fragment.app.e {
    public static final a S0 = new a(null);
    public static final int T0 = 8;
    public final wn.f N0;
    public final wn.f O0;
    public final wn.f P0;
    public final wn.f Q0;
    public zb.k R0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final q a(String str, String str2, String str3) {
            jo.p.h(str, "referer");
            jo.p.h(str2, "userId");
            jo.p.h(str3, "liveId");
            q qVar = new q();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_REFERER", str);
            bundle.putString("EXTRA_USER_ID", str2);
            bundle.putString("EXTRA_LIVE_ID", str3);
            qVar.V2(bundle);
            return qVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f19102w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f19102w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f19102w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f19103w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(io.a aVar) {
            super(0);
            this.f19103w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f19103w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f19104w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f19105x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f19106y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f19107z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f19104w = aVar;
            this.f19105x = aVar2;
            this.f19106y = aVar3;
            this.f19107z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f19104w;
            vq.a aVar2 = this.f19105x;
            io.a aVar3 = this.f19106y;
            xq.a aVar4 = this.f19107z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(zb.k.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f19108w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(io.a aVar) {
            super(0);
            this.f19108w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f19108w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.l<View, wn.v> {
        public f() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            q.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f19111x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f19112y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ CollabInvitableUser f19113z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, CollabInvitableUser collabInvitableUser) {
            super(1);
            this.f19111x = str;
            this.f19112y = str2;
            this.f19113z = collabInvitableUser;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            zb.k kVar = q.this.R0;
            if (kVar == null) {
                jo.p.v("store");
                kVar = null;
            }
            if (jo.p.c(kVar.p().f(), Boolean.TRUE)) {
                return;
            }
            q.this.E3().d(this.f19111x, this.f19112y, this.f19113z, CollabType.CALL);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f19115x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f19116y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ CollabInvitableUser f19117z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, String str2, CollabInvitableUser collabInvitableUser) {
            super(1);
            this.f19115x = str;
            this.f19116y = str2;
            this.f19117z = collabInvitableUser;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            zb.k kVar = q.this.R0;
            if (kVar == null) {
                jo.p.v("store");
                kVar = null;
            }
            if (jo.p.c(kVar.p().f(), Boolean.TRUE)) {
                return;
            }
            q.this.E3().d(this.f19115x, this.f19116y, this.f19117z, CollabType.LIVE);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<nf.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f19118w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f19119x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f19120y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f19118w = componentCallbacks;
            this.f19119x = aVar;
            this.f19120y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.c] */
        @Override // io.a
        public final nf.c invoke() {
            ComponentCallbacks componentCallbacks = this.f19118w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.c.class), this.f19119x, this.f19120y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<zb.d> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f19121w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f19122x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f19123y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f19121w = componentCallbacks;
            this.f19122x = aVar;
            this.f19123y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [zb.d, java.lang.Object] */
        @Override // io.a
        public final zb.d invoke() {
            ComponentCallbacks componentCallbacks = this.f19121w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(zb.d.class), this.f19122x, this.f19123y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<kf.x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f19124w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f19125x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f19126y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f19124w = componentCallbacks;
            this.f19125x = aVar;
            this.f19126y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final kf.x invoke() {
            ComponentCallbacks componentCallbacks = this.f19124w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.x.class), this.f19125x, this.f19126y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f19127w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f19128x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f19129y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f19127w = componentCallbacks;
            this.f19128x = aVar;
            this.f19129y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f19127w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f19128x, this.f19129y);
        }
    }

    public q() {
        super(xb.p.dialog_fragment_invite_collab);
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.N0 = wn.g.b(iVar, new i(this, null, null));
        this.O0 = wn.g.b(iVar, new j(this, null, null));
        this.P0 = wn.g.b(iVar, new k(this, null, null));
        this.Q0 = wn.g.b(iVar, new l(this, null, null));
    }

    public static final void I3(a1 a1Var, Boolean bool) {
        StatusView statusView = a1Var.G;
        jo.p.g(bool, "it");
        statusView.b(bool.booleanValue() ? StatusView.b.C0181b.f20790w : StatusView.b.c.f20791w);
    }

    public final zb.d E3() {
        return (zb.d) this.O0.getValue();
    }

    public final nf.c F3() {
        return (nf.c) this.N0.getValue();
    }

    public final MRLogger G3() {
        return (MRLogger) this.Q0.getValue();
    }

    public final kf.x H3() {
        return (kf.x) this.P0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        CollabInvitableUser collabInvitableUser;
        Object obj;
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(-2, -2);
        }
        String string = M2().getString("EXTRA_REFERER");
        jo.p.e(string);
        String string2 = M2().getString("EXTRA_USER_ID");
        jo.p.e(string2);
        String string3 = M2().getString("EXTRA_LIVE_ID");
        jo.p.e(string3);
        Fragment P2 = P2();
        jo.p.g(P2, "requireParentFragment()");
        b bVar = new b(P2);
        zb.k kVar = null;
        zb.k kVar2 = (zb.k) ((androidx.lifecycle.q0) androidx.fragment.app.e0.a(P2, jo.f0.b(zb.k.class), new e(new c(bVar)), new d(bVar, null, null, gq.a.a(P2))).getValue());
        this.R0 = kVar2;
        if (kVar2 == null) {
            jo.p.v("store");
            kVar2 = null;
        }
        List<CollabInvitableUser> f10 = kVar2.o().f();
        if (f10 != null) {
            Iterator<T> it = f10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jo.p.c(((CollabInvitableUser) obj).getUserId(), string2)) {
                    break;
                }
            }
            collabInvitableUser = (CollabInvitableUser) obj;
        } else {
            collabInvitableUser = null;
        }
        if (collabInvitableUser == null) {
            n3();
            return;
        }
        final a1 T = a1.T(view);
        o.a aVar = o.f19094e;
        Resources O0 = O0();
        jo.p.g(O0, "resources");
        T.V(aVar.a(O0, collabInvitableUser, F3().P0()));
        AppCompatImageView appCompatImageView = T.B;
        jo.p.g(appCompatImageView, "binding.closeImageView");
        g1.a(appCompatImageView, new f());
        AppCompatImageView appCompatImageView2 = T.C;
        jo.p.g(appCompatImageView2, "binding.collabCallImageView");
        g1.a(appCompatImageView2, new g(string, string3, collabInvitableUser));
        AppCompatImageView appCompatImageView3 = T.D;
        jo.p.g(appCompatImageView3, "binding.collabLiveImageView");
        g1.a(appCompatImageView3, new h(string, string3, collabInvitableUser));
        zb.k kVar3 = this.R0;
        if (kVar3 == null) {
            jo.p.v("store");
        } else {
            kVar = kVar3;
        }
        kVar.p().i(a1(), new androidx.lifecycle.f0() { // from class: cc.p
            @Override // androidx.lifecycle.f0
            public final void d(Object obj2) {
                q.I3(a1.this, (Boolean) obj2);
            }
        });
        MRLogger G3 = G3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_COLLAB_INVITE_IMP);
        builder.setTargetId(string2);
        builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, string3), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, H3().T4())));
        G3.sendLog(builder.build());
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), xb.s.f60094a);
    }
}
