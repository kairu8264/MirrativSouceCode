package zb;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.p0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cc.q;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.api.response.user.CollabInvitableUser;
import com.dena.mirrorman.net.api.response.user.LiveViewingUser;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jo.f0;
import kq.a;
import p.d;
import uo.q0;
import uo.r0;
import xb.y;
import yd.g1;
import yd.t1;
import zb.b;

/* loaded from: classes2.dex */
public final class j extends com.google.android.material.bottomsheet.b implements q0 {
    public final /* synthetic */ da.j O0 = new da.j();
    public final wn.f P0;
    public zb.k Q0;
    public final wn.f R0;
    public final wn.f S0;
    public final wn.f T0;
    public final wn.f U0;
    public final AutoClearedValue V0;
    public final wn.f W0;
    public final wn.f X0;
    public static final /* synthetic */ qo.h<Object>[] Z0 = {f0.d(new jo.s(j.class, "binding", "getBinding()Lcom/dena/mirrativ/streaming/databinding/BottomSheetDialogFragmentCollabCandidateViewersBinding;", 0))};
    public static final a Y0 = new a(null);

    /* renamed from: a1  reason: collision with root package name */
    public static final int f62992a1 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final j a(String str, String str2) {
            jo.p.h(str, "referer");
            jo.p.h(str2, "liveId");
            j jVar = new j();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_REFERER", str);
            bundle.putString("EXTRA_KEY_LIVE_ID", str2);
            jVar.V2(bundle);
            return jVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<String> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = j.this.M2().getString("EXTRA_KEY_LIVE_ID");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c<T> implements androidx.lifecycle.f0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c0 f62994a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveData f62995b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ LiveData f62996c;

        public c(c0 c0Var, LiveData liveData, LiveData liveData2) {
            this.f62994a = c0Var;
            this.f62995b = liveData;
            this.f62996c = liveData2;
        }

        @Override // androidx.lifecycle.f0
        public final void d(Object obj) {
            T f10 = this.f62994a.f();
            Object f11 = this.f62995b.f();
            Object f12 = this.f62996c.f();
            if (f10 == null || f11 == null || f12 == null) {
                return;
            }
            c0 c0Var = this.f62994a;
            List list = (List) f11;
            List list2 = (List) f10;
            ArrayList arrayList = new ArrayList();
            for (T t10 : (List) f12) {
                CollabInvitableUser collabInvitableUser = (CollabInvitableUser) t10;
                boolean z10 = true;
                if (!list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (jo.p.c(collabInvitableUser.getUserId(), ((LiveViewingUser) it.next()).getUserId())) {
                                z10 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (z10) {
                    arrayList.add(t10);
                }
            }
            c0Var.p(arrayList);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d<T> implements androidx.lifecycle.f0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c0 f62997a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveData f62998b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ LiveData f62999c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ j f63000d;

        public d(c0 c0Var, LiveData liveData, LiveData liveData2, j jVar) {
            this.f62997a = c0Var;
            this.f62998b = liveData;
            this.f62999c = liveData2;
            this.f63000d = jVar;
        }

        @Override // androidx.lifecycle.f0
        public final void d(Object obj) {
            StatusView.b dVar;
            T f10 = this.f62997a.f();
            Object f11 = this.f62998b.f();
            Object f12 = this.f62999c.f();
            if (f10 == null || f11 == null || f12 == null) {
                return;
            }
            c0 c0Var = this.f62997a;
            List list = (List) f11;
            StatusView.b bVar = (StatusView.b) f10;
            if (((Boolean) f12).booleanValue()) {
                dVar = StatusView.b.C0181b.f20790w;
            } else {
                dVar = list.isEmpty() ? new StatusView.b.d(this.f63000d.U0(xb.r.text_can_invite_viewers_empty), 0.0f, 2, null) : StatusView.b.c.f20791w;
            }
            c0Var.p(dVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e<T> implements androidx.lifecycle.f0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c0 f63001a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveData f63002b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ LiveData f63003c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ LiveData f63004d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ LiveData f63005e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ j f63006f;

        public e(c0 c0Var, LiveData liveData, LiveData liveData2, LiveData liveData3, LiveData liveData4, j jVar) {
            this.f63001a = c0Var;
            this.f63002b = liveData;
            this.f63003c = liveData2;
            this.f63004d = liveData3;
            this.f63005e = liveData4;
            this.f63006f = jVar;
        }

        @Override // androidx.lifecycle.f0
        public final void d(Object obj) {
            T f10 = this.f63001a.f();
            Object f11 = this.f63002b.f();
            Object f12 = this.f63003c.f();
            Object f13 = this.f63004d.f();
            Object f14 = this.f63005e.f();
            if (f10 == null || f11 == null || f12 == null || f13 == null || f14 == null) {
                return;
            }
            c0 c0Var = this.f63001a;
            int intValue = ((Number) f14).intValue();
            List list = (List) f13;
            boolean booleanValue = ((Boolean) f12).booleanValue();
            List<CollabInvitableUser> list2 = (List) f11;
            List list3 = (List) f10;
            ArrayList arrayList = new ArrayList(xn.t.u(list2, 10));
            for (CollabInvitableUser collabInvitableUser : list2) {
                b.a aVar = zb.b.f62955j;
                Context N2 = this.f63006f.N2();
                jo.p.g(N2, "requireContext()");
                arrayList.add(aVar.a(N2, collabInvitableUser, booleanValue && list.size() < intValue));
            }
            c0Var.p(arrayList);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.collab.CollabCandidateViewersBottomSheetDialogFragment$observeStoreValues$10", f = "CollabCandidateViewersBottomSheetDialogFragment.kt", l = {268}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f63007w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ LiveData<List<CollabInvitableUser>> f63009y;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ j f63010w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ LiveData<List<CollabInvitableUser>> f63011x;

            public a(j jVar, LiveData<List<CollabInvitableUser>> liveData) {
                this.f63010w = jVar;
                this.f63011x = liveData;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
            @Override // xo.d
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(wn.v r7, ao.d<? super wn.v> r8) {
                /*
                    r6 = this;
                    zb.j r7 = r6.f63010w
                    com.dena.mirrorman.clientlog.logs.MRLogger r7 = zb.j.N3(r7)
                    com.dena.mirrorman.clientlog.logs.MRLog$Companion r8 = com.dena.mirrorman.clientlog.logs.MRLog.Companion
                    androidx.lifecycle.LiveData<java.util.List<com.dena.mirrorman.net.api.response.user.CollabInvitableUser>> r8 = r6.f63011x
                    zb.j r0 = r6.f63010w
                    com.dena.mirrorman.clientlog.logs.MRLog$Builder r1 = new com.dena.mirrorman.clientlog.logs.MRLog$Builder
                    java.lang.String r2 = "collab.invitable_users_list_get"
                    r1.<init>(r2)
                    java.lang.Object r8 = r8.f()
                    java.util.List r8 = (java.util.List) r8
                    r2 = 0
                    r3 = 1
                    if (r8 == 0) goto L2b
                    java.lang.String r4 = "value"
                    jo.p.g(r8, r4)
                    boolean r8 = r8.isEmpty()
                    r8 = r8 ^ r3
                    if (r8 != r3) goto L2b
                    r8 = r3
                    goto L2c
                L2b:
                    r8 = r2
                L2c:
                    if (r8 == 0) goto L31
                    java.lang.String r8 = "1"
                    goto L33
                L31:
                    java.lang.String r8 = "0"
                L33:
                    r1.setTargetId(r8)
                    r8 = 2
                    wn.k[] r8 = new wn.k[r8]
                    java.lang.String r4 = zb.j.M3(r0)
                    java.lang.String r5 = "live_id"
                    wn.k r4 = wn.q.a(r5, r4)
                    r8[r2] = r4
                    kf.x r0 = zb.j.Q3(r0)
                    java.lang.String r0 = r0.T4()
                    java.lang.String r2 = "cast_id"
                    wn.k r0 = wn.q.a(r2, r0)
                    r8[r3] = r0
                    java.util.List r8 = xn.s.m(r8)
                    r1.setPayload(r8)
                    com.dena.mirrorman.clientlog.logs.MRLog r8 = r1.build()
                    r7.sendLog(r8)
                    wn.v r7 = wn.v.f59242a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: zb.j.f.a.emit(wn.v, ao.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(LiveData<List<CollabInvitableUser>> liveData, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f63009y = liveData;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f63009y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f63007w;
            if (i10 == 0) {
                wn.m.b(obj);
                zb.k kVar = j.this.Q0;
                if (kVar == null) {
                    jo.p.v("store");
                    kVar = null;
                }
                xo.c<wn.v> n10 = kVar.n();
                a aVar = new a(j.this, this.f63009y);
                this.f63007w = 1;
                if (n10.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.streaming.collab.CollabCandidateViewersBottomSheetDialogFragment$observeStoreValues$11", f = "CollabCandidateViewersBottomSheetDialogFragment.kt", l = {282}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f63012w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ j f63014w;

            public a(j jVar) {
                this.f63014w = jVar;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                if (this.f63014w.q0() != null) {
                    j jVar = this.f63014w;
                    if (mRError instanceof MRError.Failure) {
                        of.n.f45411a.B(jVar.q0(), ((MRError.Failure) mRError).getErrorMessage(), false);
                    } else {
                        if (mRError instanceof MRError.ForceUpdate ? true : jo.p.c(mRError, MRError.Maintenance.INSTANCE)) {
                            of.n.f45411a.l(jVar.q0(), mRError);
                        } else if (mRError instanceof MRError.Network) {
                            of.n.z(jVar.q0());
                        }
                    }
                }
                return wn.v.f59242a;
            }
        }

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

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f63012w;
            if (i10 == 0) {
                wn.m.b(obj);
                zb.k kVar = j.this.Q0;
                if (kVar == null) {
                    jo.p.v("store");
                    kVar = null;
                }
                xo.c<MRError> k10 = kVar.k();
                a aVar = new a(j.this);
                this.f63012w = 1;
                if (k10.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.streaming.collab.CollabCandidateViewersBottomSheetDialogFragment$observeStoreValues$8", f = "CollabCandidateViewersBottomSheetDialogFragment.kt", l = {249}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f63015w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ j f63017w;

            /* renamed from: zb.j$h$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C1089a extends jo.q implements io.a<wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ j f63018w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1089a(j jVar) {
                    super(0);
                    this.f63018w = jVar;
                }

                public final void a() {
                    zb.d R3 = this.f63018w.R3();
                    String X3 = this.f63018w.X3();
                    jo.p.g(X3, "referer");
                    String U3 = this.f63018w.U3();
                    jo.p.g(U3, "liveId");
                    R3.f(X3, U3);
                }

                @Override // io.a
                public /* bridge */ /* synthetic */ wn.v invoke() {
                    a();
                    return wn.v.f59242a;
                }
            }

            public a(j jVar) {
                this.f63017w = jVar;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                List<CollabInvitableUser> f10;
                zb.k kVar = this.f63017w.Q0;
                if (kVar == null) {
                    jo.p.v("store");
                    kVar = null;
                }
                boolean z10 = false;
                if (kVar.o().f() != null && (!f10.isEmpty())) {
                    z10 = true;
                }
                if (z10) {
                    StatusView statusView = this.f63017w.S3().K;
                    String message = mRError.getMessage();
                    if (message == null) {
                        message = this.f63017w.U0(xb.r.f60070c);
                        jo.p.g(message, "getString(R.string.error_access)");
                    }
                    statusView.b(new StatusView.b.a(message, new C1089a(this.f63017w)));
                }
                return wn.v.f59242a;
            }
        }

        public h(ao.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f63015w;
            if (i10 == 0) {
                wn.m.b(obj);
                zb.k kVar = j.this.Q0;
                if (kVar == null) {
                    jo.p.v("store");
                    kVar = null;
                }
                xo.c<MRError> j10 = kVar.j();
                a aVar = new a(j.this);
                this.f63015w = 1;
                if (j10.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.streaming.collab.CollabCandidateViewersBottomSheetDialogFragment$observeStoreValues$9", f = "CollabCandidateViewersBottomSheetDialogFragment.kt", l = {261}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f63019w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<CollabInvitableUser> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ j f63021w;

            public a(j jVar) {
                this.f63021w = jVar;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(CollabInvitableUser collabInvitableUser, ao.d<? super wn.v> dVar) {
                Fragment e02 = this.f63021w.p0().e0("InviteCollabDialogFragment");
                cc.q qVar = e02 instanceof cc.q ? (cc.q) e02 : null;
                if (qVar != null) {
                    qVar.n3();
                }
                t1.a aVar = t1.f61795x;
                Context N2 = this.f63021w.N2();
                jo.p.g(N2, "requireContext()");
                String V0 = this.f63021w.V0(xb.r.text_sent_collab_invite, collabInvitableUser.getName());
                jo.p.g(V0, "getString(R.string.text_…invite, invitedUser.name)");
                aVar.a(N2, V0);
                return wn.v.f59242a;
            }
        }

        public i(ao.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f63019w;
            if (i10 == 0) {
                wn.m.b(obj);
                zb.k kVar = j.this.Q0;
                if (kVar == null) {
                    jo.p.v("store");
                    kVar = null;
                }
                xo.c<CollabInvitableUser> m10 = kVar.m();
                a aVar = new a(j.this);
                this.f63019w = 1;
                if (m10.a(aVar, this) == c10) {
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

    /* renamed from: zb.j$j  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C1090j extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f63022w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1090j(Fragment fragment) {
            super(0);
            this.f63022w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f63022w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f63023w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(io.a aVar) {
            super(0);
            this.f63023w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f63023w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f63024w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f63025x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f63026y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f63027z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f63024w = aVar;
            this.f63025x = aVar2;
            this.f63026y = aVar3;
            this.f63027z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f63024w;
            vq.a aVar2 = this.f63025x;
            io.a aVar3 = this.f63026y;
            xq.a aVar4 = this.f63027z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(zb.k.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f63028w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(io.a aVar) {
            super(0);
            this.f63028w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f63028w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.l<String, wn.v> {
        public n() {
            super(1);
        }

        public final void a(String str) {
            jo.p.h(str, "userId");
            zb.k kVar = j.this.Q0;
            Object obj = null;
            if (kVar == null) {
                jo.p.v("store");
                kVar = null;
            }
            List<CollabInvitableUser> f10 = kVar.o().f();
            if (f10 != null) {
                Iterator<T> it = f10.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (jo.p.c(((CollabInvitableUser) next).getUserId(), str)) {
                        obj = next;
                        break;
                    }
                }
                CollabInvitableUser collabInvitableUser = (CollabInvitableUser) obj;
                if (collabInvitableUser != null) {
                    j jVar = j.this;
                    q.a aVar = cc.q.S0;
                    String X3 = jVar.X3();
                    jo.p.g(X3, "referer");
                    String userId = collabInvitableUser.getUserId();
                    String U3 = jVar.U3();
                    jo.p.g(U3, "liveId");
                    aVar.a(X3, userId, U3).z3(jVar.p0(), "InviteCollabDialogFragment");
                }
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(String str) {
            a(str);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<String> {
        public o() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = j.this.M2().getString("EXTRA_KEY_REFERER");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.l<View, wn.v> {
        public p() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            new d.a().a().a(j.this.N2(), Uri.parse("https://mirrativtmbr.tumblr.com/post/629220003864084480/"));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.l<View, wn.v> {
        public q() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            j.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final r f63033w = new r();

        public r() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            dq.c.c().l(y.f60119a);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends RecyclerView.u {
        public s() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            jo.p.h(recyclerView, "recyclerView");
            super.b(recyclerView, i10, i11);
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            zb.k kVar = null;
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            zb.k kVar2 = j.this.Q0;
            if (kVar2 == null) {
                jo.p.v("store");
                kVar2 = null;
            }
            List<CollabInvitableUser> f10 = kVar2.o().f();
            if (f10 == null) {
                return;
            }
            zb.k kVar3 = j.this.Q0;
            if (kVar3 == null) {
                jo.p.v("store");
                kVar3 = null;
            }
            Integer f11 = kVar3.l().f();
            if (f11 == null) {
                return;
            }
            int intValue = f11.intValue();
            zb.k kVar4 = j.this.Q0;
            if (kVar4 == null) {
                jo.p.v("store");
            } else {
                kVar = kVar4;
            }
            Boolean f12 = kVar.q().f();
            if (f12 != null && !f12.booleanValue() && intValue > 1 && f10.size() <= linearLayoutManager.l2() + 10) {
                zb.d R3 = j.this.R3();
                String X3 = j.this.X3();
                jo.p.g(X3, "referer");
                String U3 = j.this.U3();
                jo.p.g(U3, "liveId");
                R3.e(X3, U3, intValue);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends jo.q implements io.a<zb.d> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f63035w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f63036x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f63037y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f63035w = componentCallbacks;
            this.f63036x = aVar;
            this.f63037y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [zb.d, java.lang.Object] */
        @Override // io.a
        public final zb.d invoke() {
            ComponentCallbacks componentCallbacks = this.f63035w;
            return gq.a.a(componentCallbacks).c(f0.b(zb.d.class), this.f63036x, this.f63037y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends jo.q implements io.a<nf.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f63038w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f63039x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f63040y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f63038w = componentCallbacks;
            this.f63039x = aVar;
            this.f63040y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.c] */
        @Override // io.a
        public final nf.c invoke() {
            ComponentCallbacks componentCallbacks = this.f63038w;
            return gq.a.a(componentCallbacks).c(f0.b(nf.c.class), this.f63039x, this.f63040y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class v extends jo.q implements io.a<kf.x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f63041w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f63042x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f63043y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f63041w = componentCallbacks;
            this.f63042x = aVar;
            this.f63043y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final kf.x invoke() {
            ComponentCallbacks componentCallbacks = this.f63041w;
            return gq.a.a(componentCallbacks).c(f0.b(kf.x.class), this.f63042x, this.f63043y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class w extends jo.q implements io.a<nf.w> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f63044w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f63045x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f63046y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f63044w = componentCallbacks;
            this.f63045x = aVar;
            this.f63046y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.w, java.lang.Object] */
        @Override // io.a
        public final nf.w invoke() {
            ComponentCallbacks componentCallbacks = this.f63044w;
            return gq.a.a(componentCallbacks).c(f0.b(nf.w.class), this.f63045x, this.f63046y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class x extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f63047w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f63048x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f63049y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f63047w = componentCallbacks;
            this.f63048x = aVar;
            this.f63049y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f63047w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f63048x, this.f63049y);
        }
    }

    public j() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.P0 = wn.g.b(iVar, new t(this, null, null));
        this.R0 = wn.g.b(iVar, new u(this, null, null));
        this.S0 = wn.g.b(iVar, new v(this, null, null));
        this.T0 = wn.g.b(iVar, new w(this, null, null));
        this.U0 = wn.g.b(iVar, new x(this, null, null));
        this.V0 = nd.a.a(this);
        this.W0 = wn.g.a(new o());
        this.X0 = wn.g.a(new b());
    }

    public static final void a4(j jVar, List list) {
        jo.p.h(jVar, "this$0");
        RecyclerView.h adapter = jVar.S3().N.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrativ.streaming.collab.CollabCandidateViewerAdapter");
        ((zb.a) adapter).d(list);
    }

    public static final void b4(j jVar, List list) {
        jo.p.h(jVar, "this$0");
        if (list.isEmpty()) {
            jVar.S3().C.setText(jVar.U0(xb.r.text_invite_collab_message));
        } else {
            jVar.S3().C.setText(jVar.V0(xb.r.text_collabrating_user_count, String.valueOf(list.size())));
        }
    }

    public static final void c4(j jVar, Integer num) {
        jo.p.h(jVar, "this$0");
        jVar.S3().I.setText(jVar.V0(xb.r.text_number_can_invite_viewers, String.valueOf(num)));
    }

    public static final void d4(j jVar, Boolean bool) {
        jo.p.h(jVar, "this$0");
        jo.p.g(bool, "isEnabledCollab");
        if (bool.booleanValue()) {
            jVar.S3().J.setVisibility(8);
            jVar.S3().E.setVisibility(8);
            jVar.S3().I.setVisibility(0);
            jVar.S3().C.setVisibility(0);
            return;
        }
        jVar.S3().J.setVisibility(0);
        jVar.S3().E.setVisibility(0);
        jVar.S3().I.setVisibility(8);
        jVar.S3().C.setVisibility(8);
    }

    public static final void e4(j jVar, StatusView.b bVar) {
        jo.p.h(jVar, "this$0");
        StatusView statusView = jVar.S3().K;
        jo.p.g(bVar, "it");
        statusView.b(bVar);
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        ac.i T = ac.i.T(LayoutInflater.from(N2()), null, false);
        jo.p.g(T, "inflate(\n            Lay…          false\n        )");
        f4(T);
        View u10 = S3().u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void H1() {
        r0.d(this, null, 1, null);
        super.H1();
    }

    public final zb.d R3() {
        return (zb.d) this.P0.getValue();
    }

    public final ac.i S3() {
        return (ac.i) this.V0.b(this, Z0[0]);
    }

    public final nf.c T3() {
        return (nf.c) this.R0.getValue();
    }

    public final String U3() {
        return (String) this.X0.getValue();
    }

    public final nf.w V3() {
        return (nf.w) this.T0.getValue();
    }

    public final MRLogger W3() {
        return (MRLogger) this.U0.getValue();
    }

    public final String X3() {
        return (String) this.W0.getValue();
    }

    public final kf.x Y3() {
        return (kf.x) this.S0.getValue();
    }

    public final void Z3() {
        List k10 = xn.s.k();
        LiveData<List<LiveViewingUser>> R = T3().R();
        zb.k kVar = this.Q0;
        if (kVar == null) {
            jo.p.v("store");
            kVar = null;
        }
        LiveData<List<CollabInvitableUser>> o10 = kVar.o();
        c0 c0Var = new c0();
        c0Var.p(k10);
        for (LiveData liveData : xn.s.m(R, o10)) {
            c0Var.q(liveData, new c(c0Var, R, o10));
        }
        LiveData a10 = p0.a(c0Var);
        jo.p.g(a10, "distinctUntilChanged(this)");
        StatusView.b.c cVar = StatusView.b.c.f20791w;
        jo.p.f(cVar, "null cannot be cast to non-null type com.dena.mirrativ.customview.StatusView.Status");
        zb.k kVar2 = this.Q0;
        if (kVar2 == null) {
            jo.p.v("store");
            kVar2 = null;
        }
        LiveData<Boolean> q10 = kVar2.q();
        c0 c0Var2 = new c0();
        c0Var2.p(cVar);
        for (LiveData liveData2 : xn.s.m(a10, q10)) {
            c0Var2.q(liveData2, new d(c0Var2, a10, q10, this));
        }
        LiveData a11 = p0.a(c0Var2);
        jo.p.g(a11, "distinctUntilChanged(this)");
        a11.i(a1(), new androidx.lifecycle.f0() { // from class: zb.e
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                j.e4(j.this, (StatusView.b) obj);
            }
        });
        List k11 = xn.s.k();
        LiveData<Boolean> g10 = V3().g();
        LiveData<List<LiveViewingUser>> R2 = T3().R();
        LiveData<Integer> c10 = V3().c();
        c0 c0Var3 = new c0();
        c0Var3.p(k11);
        for (Iterator it = xn.s.m(a10, g10, R2, c10).iterator(); it.hasNext(); it = it) {
            c0Var3.q((LiveData) it.next(), new e(c0Var3, a10, g10, R2, c10, this));
        }
        LiveData a12 = p0.a(c0Var3);
        jo.p.g(a12, "distinctUntilChanged(this)");
        a12.i(a1(), new androidx.lifecycle.f0() { // from class: zb.h
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                j.a4(j.this, (List) obj);
            }
        });
        T3().R().i(a1(), new androidx.lifecycle.f0() { // from class: zb.i
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                j.b4(j.this, (List) obj);
            }
        });
        V3().c().i(a1(), new androidx.lifecycle.f0() { // from class: zb.g
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                j.c4(j.this, (Integer) obj);
            }
        });
        V3().g().i(a1(), new androidx.lifecycle.f0() { // from class: zb.f
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                j.d4(j.this, (Boolean) obj);
            }
        });
        uo.l.d(this, null, null, new h(null), 3, null);
        uo.l.d(this, null, null, new i(null), 3, null);
        uo.l.d(this, null, null, new f(a10, null), 3, null);
        uo.l.d(this, null, null, new g(null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        View findViewById;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        C1090j c1090j = new C1090j(this);
        this.Q0 = (zb.k) ((androidx.lifecycle.q0) e0.a(this, f0.b(zb.k.class), new m(new k(c1090j)), new l(c1090j, null, null, gq.a.a(this))).getValue());
        S3().N.setLayoutManager(new LinearLayoutManager(N2()));
        RecyclerView recyclerView = S3().N;
        androidx.lifecycle.u a12 = a1();
        jo.p.g(a12, "viewLifecycleOwner");
        recyclerView.setAdapter(new zb.a(a12, new n()));
        g4();
        Z3();
        S3().D.setVisibility(T3().P0() ? 0 : 8);
        Dialog p32 = p3();
        com.google.android.material.bottomsheet.a aVar = p32 instanceof com.google.android.material.bottomsheet.a ? (com.google.android.material.bottomsheet.a) p32 : null;
        if (aVar != null && (findViewById = aVar.findViewById(xb.o.f60021p2)) != null) {
            int i10 = (int) (O0().getDisplayMetrics().heightPixels * 0.8d);
            findViewById.setBackgroundResource(17170445);
            findViewById.getLayoutParams().height = i10;
            findViewById.setOnClickListener(null);
            BottomSheetBehavior c02 = BottomSheetBehavior.c0(findViewById);
            jo.p.g(c02, "from(bottomSheet)");
            c02.z0(3);
            c02.v0(i10);
            androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
            cVar.g(S3().G);
            cVar.l(S3().G.getId(), i10);
            cVar.c(S3().G);
        }
        zb.d R3 = R3();
        String X3 = X3();
        jo.p.g(X3, "referer");
        String U3 = U3();
        jo.p.g(U3, "liveId");
        R3.f(X3, U3);
        MRLogger W3 = W3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_COLLAB_INVITABLE_USERS_IMP);
        builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, U3()), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, Y3().T4())));
        W3.sendLog(builder.build());
    }

    public final void f4(ac.i iVar) {
        this.V0.a(this, Z0[0], iVar);
    }

    public final void g4() {
        AppCompatImageView appCompatImageView = S3().H;
        jo.p.g(appCompatImageView, "binding.helpImageView");
        g1.a(appCompatImageView, new p());
        AppCompatImageView appCompatImageView2 = S3().B;
        jo.p.g(appCompatImageView2, "binding.closeImageView");
        g1.a(appCompatImageView2, new q());
        AppCompatTextView appCompatTextView = S3().J;
        jo.p.g(appCompatTextView, "binding.showCollabSettingsTextView");
        g1.a(appCompatTextView, r.f63033w);
        S3().N.k(new s());
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O0.getCoroutineContext();
    }
}
