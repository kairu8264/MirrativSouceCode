package be;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.b4;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.event.ShooterMatchingResponse;
import com.dena.mirrorman.net.api.response.event.ShooterMemberStatus;
import com.dena.mirrorman.net.api.response.event.ShooterMemberType;
import com.dena.mirrorman.net.api.response.event.ShooterTeamStatus;
import com.dena.mirrorman.net.api.response.event.ShooterViewingUser;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import ie.f;
import ie.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kq.a;
import ud.k3;
import ud.l3;
import ud.p3;
import uo.d2;

/* loaded from: classes2.dex */
public final class b4 extends com.google.android.material.bottomsheet.b implements f.b, ie.h, x4, f4, uo.q0 {
    public final /* synthetic */ da.j O0 = new da.j();
    public final wn.f P0;
    public nf.f0 Q0;
    public final wn.f R0;
    public nf.g0 S0;
    public final AutoClearedValue T0;
    public final wn.f U0;
    public final wn.f V0;
    public final wn.f W0;
    public final wn.f X0;
    public uo.d2 Y0;
    public uo.d2 Z0;

    /* renamed from: a1  reason: collision with root package name */
    public d4 f17695a1;

    /* renamed from: c1  reason: collision with root package name */
    public static final /* synthetic */ qo.h<Object>[] f17693c1 = {jo.f0.d(new jo.s(b4.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/BottomSheetDialogFragmentShooterInviteBinding;", 0))};

    /* renamed from: b1  reason: collision with root package name */
    public static final a f17692b1 = new a(null);

    /* renamed from: d1  reason: collision with root package name */
    public static final int f17694d1 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final b4 a(int i10, int i11, int i12) {
            b4 b4Var = new b4();
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_KEY_SEASON_ID", i10);
            bundle.putInt("EXTRA_KEY_RATING_POINT", i11);
            bundle.putInt("EXTRA_KEY_RATING_ICON_TYPE", i12);
            b4Var.V2(bundle);
            return b4Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a0 extends jo.q implements io.a<od.l0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17696w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17697x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17698y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17696w = componentCallbacks;
            this.f17697x = aVar;
            this.f17698y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.l0, java.lang.Object] */
        @Override // io.a
        public final od.l0 invoke() {
            ComponentCallbacks componentCallbacks = this.f17696w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.l0.class), this.f17697x, this.f17698y);
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17699a;

        static {
            int[] iArr = new int[ShooterTeamStatus.values().length];
            iArr[ShooterTeamStatus.NONE.ordinal()] = 1;
            iArr[ShooterTeamStatus.MATCHING.ordinal()] = 2;
            iArr[ShooterTeamStatus.MATCHED.ordinal()] = 3;
            iArr[ShooterTeamStatus.CANCELED.ordinal()] = 4;
            f17699a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b0 extends jo.q implements io.a<od.m0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17700w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17701x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17702y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17700w = componentCallbacks;
            this.f17701x = aVar;
            this.f17702y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.m0, java.lang.Object] */
        @Override // io.a
        public final od.m0 invoke() {
            ComponentCallbacks componentCallbacks = this.f17700w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.m0.class), this.f17701x, this.f17702y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c<T> implements androidx.lifecycle.f0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.c0 f17703a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveData f17704b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ LiveData f17705c;

        public c(androidx.lifecycle.c0 c0Var, LiveData liveData, LiveData liveData2) {
            this.f17703a = c0Var;
            this.f17704b = liveData;
            this.f17705c = liveData2;
        }

        @Override // androidx.lifecycle.f0
        public final void d(Object obj) {
            T f10 = this.f17703a.f();
            Object f11 = this.f17704b.f();
            Object f12 = this.f17705c.f();
            if (f10 == null || f11 == null || f12 == null) {
                return;
            }
            androidx.lifecycle.c0 c0Var = this.f17703a;
            ShooterTeamStatus shooterTeamStatus = (ShooterTeamStatus) f11;
            wn.k kVar = (wn.k) f10;
            ArrayList arrayList = new ArrayList();
            for (T t10 : (List) f12) {
                if (((ShooterMemberStatus) ((wn.k) t10).b()).didInvite()) {
                    arrayList.add(t10);
                }
            }
            c0Var.p(wn.q.a(shooterTeamStatus, arrayList));
        }
    }

    /* loaded from: classes2.dex */
    public static final class c0 extends jo.q implements io.a<kf.x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17706w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17707x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17708y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17706w = componentCallbacks;
            this.f17707x = aVar;
            this.f17708y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final kf.x invoke() {
            ComponentCallbacks componentCallbacks = this.f17706w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.x.class), this.f17707x, this.f17708y);
        }
    }

    @co.f(c = "com.dena.mirrorman.dialog.ShooterInviteBottomSheetDialogFragment$observeStoreValues$10", f = "ShooterInviteBottomSheetDialogFragment.kt", l = {364}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f17709w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ b4 f17711w;

            public a(b4 b4Var) {
                this.f17711w = b4Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                if (this.f17711w.q0() != null) {
                    b4 b4Var = this.f17711w;
                    if (mRError instanceof MRError.Failure) {
                        of.n.f45411a.B(b4Var.q0(), ((MRError.Failure) mRError).getErrorMessage(), false);
                    } else {
                        if (mRError instanceof MRError.ForceUpdate ? true : jo.p.c(mRError, MRError.Maintenance.INSTANCE)) {
                            of.n.f45411a.l(b4Var.q0(), mRError);
                        } else if (mRError instanceof MRError.Network) {
                            of.n.z(b4Var.q0());
                        }
                    }
                }
                this.f17711w.n3();
                return wn.v.f59242a;
            }
        }

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f17709w;
            if (i10 == 0) {
                wn.m.b(obj);
                nf.f0 f0Var = b4.this.Q0;
                if (f0Var == null) {
                    jo.p.v("store");
                    f0Var = null;
                }
                xo.c<MRError> j10 = f0Var.j();
                a aVar = new a(b4.this);
                this.f17709w = 1;
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

    @co.f(c = "com.dena.mirrorman.dialog.ShooterInviteBottomSheetDialogFragment$startInvitedMemberStatusCheckTimer$1", f = "ShooterInviteBottomSheetDialogFragment.kt", l = {408}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public int f17712w;

        /* renamed from: x  reason: collision with root package name */
        public int f17713x;

        /* renamed from: y  reason: collision with root package name */
        public int f17714y;

        /* renamed from: z  reason: collision with root package name */
        public Object f17715z;

        public d0(ao.d<? super d0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0104  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0063 -> B:20:0x0066). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 263
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: be.b4.d0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrorman.dialog.ShooterInviteBottomSheetDialogFragment$observeStoreValues$11", f = "ShooterInviteBottomSheetDialogFragment.kt", l = {379}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f17716w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ b4 f17718w;

            public a(b4 b4Var) {
                this.f17718w = b4Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                this.f17718w.U3().e(Referer.Event.SHOOTER_RANKING);
                return wn.v.f59242a;
            }
        }

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
            int i10 = this.f17716w;
            if (i10 == 0) {
                wn.m.b(obj);
                nf.g0 g0Var = b4.this.S0;
                if (g0Var == null) {
                    jo.p.v("matchingStore");
                    g0Var = null;
                }
                xo.w<wn.v> k10 = g0Var.k();
                a aVar = new a(b4.this);
                this.f17716w = 1;
                if (k10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @co.f(c = "com.dena.mirrorman.dialog.ShooterInviteBottomSheetDialogFragment$startInvitingMemberStatusCheckTimer$1", f = "ShooterInviteBottomSheetDialogFragment.kt", l = {389}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public int f17719w;

        /* renamed from: x  reason: collision with root package name */
        public int f17720x;

        /* renamed from: y  reason: collision with root package name */
        public int f17721y;

        /* renamed from: z  reason: collision with root package name */
        public Object f17722z;

        public e0(ao.d<? super e0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0103  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0063 -> B:20:0x0066). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 262
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: be.b4.e0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrorman.dialog.ShooterInviteBottomSheetDialogFragment$observeStoreValues$2", f = "ShooterInviteBottomSheetDialogFragment.kt", l = {267}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f17723w;

        @co.f(c = "com.dena.mirrorman.dialog.ShooterInviteBottomSheetDialogFragment$observeStoreValues$2$1", f = "ShooterInviteBottomSheetDialogFragment.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends co.l implements io.r<List<? extends wn.k<? extends ShooterViewingUser, ? extends ShooterMemberStatus>>, List<? extends String>, ShooterMatchingResponse, ao.d<? super List<? extends ud.j3>>, Object> {
            public final /* synthetic */ b4 A;

            /* renamed from: w  reason: collision with root package name */
            public int f17725w;

            /* renamed from: x  reason: collision with root package name */
            public /* synthetic */ Object f17726x;

            /* renamed from: y  reason: collision with root package name */
            public /* synthetic */ Object f17727y;

            /* renamed from: z  reason: collision with root package name */
            public /* synthetic */ Object f17728z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b4 b4Var, ao.d<? super a> dVar) {
                super(4, dVar);
                this.A = b4Var;
            }

            @Override // io.r
            /* renamed from: a */
            public final Object F(List<? extends wn.k<ShooterViewingUser, ? extends ShooterMemberStatus>> list, List<String> list2, ShooterMatchingResponse shooterMatchingResponse, ao.d<? super List<? extends ud.j3>> dVar) {
                a aVar = new a(this.A, dVar);
                aVar.f17726x = list;
                aVar.f17727y = list2;
                aVar.f17728z = shooterMatchingResponse;
                return aVar.invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                ud.k3 k3Var;
                bo.c.c();
                if (this.f17725w == 0) {
                    wn.m.b(obj);
                    List<wn.k> list = (List) this.f17726x;
                    List list2 = (List) this.f17727y;
                    ShooterMatchingResponse shooterMatchingResponse = (ShooterMatchingResponse) this.f17728z;
                    b4 b4Var = this.A;
                    ArrayList arrayList = new ArrayList(xn.t.u(list, 10));
                    for (wn.k kVar : list) {
                        ShooterViewingUser shooterViewingUser = (ShooterViewingUser) kVar.a();
                        ShooterMemberStatus shooterMemberStatus = (ShooterMemberStatus) kVar.b();
                        boolean z10 = false;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator it = list2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (jo.p.c((String) it.next(), shooterViewingUser.getUserId())) {
                                        z10 = true;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        l3.a aVar = ud.l3.f55147y;
                        Context N2 = b4Var.N2();
                        jo.p.g(N2, "requireContext()");
                        arrayList.add(aVar.a(N2, shooterViewingUser, shooterMemberStatus, z10));
                    }
                    if (shooterMatchingResponse != null) {
                        b4 b4Var2 = this.A;
                        k3.a aVar2 = ud.k3.f55090h;
                        Context N22 = b4Var2.N2();
                        jo.p.g(N22, "requireContext()");
                        k3Var = aVar2.a(N22, shooterMatchingResponse.isMatchingEnabled(), shooterMatchingResponse.getStreamerIconUrls(), shooterMatchingResponse.getStreamerNumText());
                    } else {
                        k3Var = null;
                    }
                    return xn.a0.o0(arrayList, xn.s.n(k3Var));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* loaded from: classes2.dex */
        public static final class b implements xo.d<List<? extends ud.j3>> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ b4 f17729w;

            public b(b4 b4Var) {
                this.f17729w = b4Var;
            }

            public static final void g(b4 b4Var, List list) {
                jo.p.h(b4Var, "this$0");
                jo.p.h(list, "$bindModels");
                RecyclerView.h adapter = b4Var.T3().R.getAdapter();
                jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrorman.adapter.ShooterCandidateViewerAdapter");
                ((rd.x0) adapter).d(list);
            }

            @Override // xo.d
            /* renamed from: d */
            public final Object emit(final List<? extends ud.j3> list, ao.d<? super wn.v> dVar) {
                RecyclerView.h adapter = this.f17729w.T3().R.getAdapter();
                jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrorman.adapter.ShooterCandidateViewerAdapter");
                rd.x0 x0Var = (rd.x0) adapter;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!(((ud.j3) obj) instanceof ud.k3)) {
                        arrayList.add(obj);
                    }
                }
                final b4 b4Var = this.f17729w;
                x0Var.f(arrayList, new Runnable() { // from class: be.c4
                    @Override // java.lang.Runnable
                    public final void run() {
                        b4.f.b.g(b4.this, list);
                    }
                });
                return wn.v.f59242a;
            }
        }

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
            int i10 = this.f17723w;
            if (i10 == 0) {
                wn.m.b(obj);
                nf.f0 f0Var = b4.this.Q0;
                if (f0Var == null) {
                    jo.p.v("store");
                    f0Var = null;
                }
                xo.c a10 = androidx.lifecycle.l.a(f0Var.u());
                nf.f0 f0Var2 = b4.this.Q0;
                if (f0Var2 == null) {
                    jo.p.v("store");
                    f0Var2 = null;
                }
                xo.c a11 = androidx.lifecycle.l.a(f0Var2.h());
                nf.g0 g0Var = b4.this.S0;
                if (g0Var == null) {
                    jo.p.v("matchingStore");
                    g0Var = null;
                }
                xo.c i11 = xo.e.i(a10, a11, g0Var.m(), new a(b4.this, null));
                b bVar = new b(b4.this);
                this.f17723w = 1;
                if (i11.a(bVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.dialog.ShooterInviteBottomSheetDialogFragment$observeStoreValues$9", f = "ShooterInviteBottomSheetDialogFragment.kt", l = {352}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f17730w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ b4 f17732w;

            /* renamed from: be.b4$g$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0123a extends jo.q implements io.a<wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ b4 f17733w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0123a(b4 b4Var) {
                    super(0);
                    this.f17733w = b4Var;
                }

                public final void a() {
                    this.f17733w.S3().h(this.f17733w.X3());
                }

                @Override // io.a
                public /* bridge */ /* synthetic */ wn.v invoke() {
                    a();
                    return wn.v.f59242a;
                }
            }

            public a(b4 b4Var) {
                this.f17732w = b4Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                List<wn.k<ShooterViewingUser, ShooterMemberStatus>> f10;
                nf.f0 f0Var = this.f17732w.Q0;
                if (f0Var == null) {
                    jo.p.v("store");
                    f0Var = null;
                }
                boolean z10 = false;
                if (f0Var.u().f() != null && (!f10.isEmpty())) {
                    z10 = true;
                }
                if (z10) {
                    StatusView statusView = this.f17732w.T3().N;
                    String message = mRError.getMessage();
                    if (message == null) {
                        message = this.f17732w.U0(nd.f1.f41966c);
                        jo.p.g(message, "getString(R.string.error_access)");
                    }
                    statusView.b(new StatusView.b.a(message, new C0123a(this.f17732w)));
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
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f17730w;
            if (i10 == 0) {
                wn.m.b(obj);
                nf.f0 f0Var = b4.this.Q0;
                if (f0Var == null) {
                    jo.p.v("store");
                    f0Var = null;
                }
                xo.c<MRError> i11 = f0Var.i();
                a aVar = new a(b4.this);
                this.f17730w = 1;
                if (i11.a(aVar, this) == c10) {
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

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f17734w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f17734w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f17734w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17735w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(io.a aVar) {
            super(0);
            this.f17735w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f17735w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17736w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17737x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17738y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f17739z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f17736w = aVar;
            this.f17737x = aVar2;
            this.f17738y = aVar3;
            this.f17739z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f17736w;
            vq.a aVar2 = this.f17737x;
            io.a aVar3 = this.f17738y;
            xq.a aVar4 = this.f17739z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.f0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17740w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(io.a aVar) {
            super(0);
            this.f17740w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f17740w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f17741w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Fragment fragment) {
            super(0);
            this.f17741w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f17741w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17742w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(io.a aVar) {
            super(0);
            this.f17742w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f17742w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17743w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17744x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17745y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f17746z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f17743w = aVar;
            this.f17744x = aVar2;
            this.f17745y = aVar3;
            this.f17746z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f17743w;
            vq.a aVar2 = this.f17744x;
            io.a aVar3 = this.f17745y;
            xq.a aVar4 = this.f17746z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.g0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17747w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(io.a aVar) {
            super(0);
            this.f17747w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f17747w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.l<String, wn.v> {
        public p() {
            super(1);
        }

        public final void a(String str) {
            jo.p.h(str, "userId");
            nf.f0 f0Var = b4.this.Q0;
            Object obj = null;
            if (f0Var == null) {
                jo.p.v("store");
                f0Var = null;
            }
            List<wn.k<ShooterViewingUser, ShooterMemberStatus>> f10 = f0Var.u().f();
            if (f10 != null) {
                Iterator<T> it = f10.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (jo.p.c(((ShooterViewingUser) ((wn.k) next).a()).getUserId(), str)) {
                        obj = next;
                        break;
                    }
                }
                wn.k kVar = (wn.k) obj;
                if (kVar != null && ((ShooterMemberStatus) kVar.b()).didInvite()) {
                    b4.this.S3().g(str);
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
    public static final class q extends jo.q implements io.l<String, wn.v> {
        public q() {
            super(1);
        }

        public final void a(String str) {
            Object obj;
            jo.p.h(str, "userId");
            nf.f0 f0Var = b4.this.Q0;
            nf.f0 f0Var2 = null;
            if (f0Var == null) {
                jo.p.v("store");
                f0Var = null;
            }
            Integer f10 = f0Var.s().f();
            if (f10 == null) {
                return;
            }
            int intValue = f10.intValue();
            nf.f0 f0Var3 = b4.this.Q0;
            if (f0Var3 == null) {
                jo.p.v("store");
                f0Var3 = null;
            }
            List<wn.k<ShooterViewingUser, ShooterMemberStatus>> f11 = f0Var3.u().f();
            if (f11 != null) {
                Iterator<T> it = f11.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (jo.p.c(((ShooterViewingUser) ((wn.k) obj).a()).getUserId(), str)) {
                        break;
                    }
                }
                wn.k kVar = (wn.k) obj;
                if (kVar == null) {
                    return;
                }
                ShooterMemberStatus shooterMemberStatus = (ShooterMemberStatus) kVar.b();
                if (shooterMemberStatus.isInvitable()) {
                    nf.f0 f0Var4 = b4.this.Q0;
                    if (f0Var4 == null) {
                        jo.p.v("store");
                    } else {
                        f0Var2 = f0Var4;
                    }
                    if (jo.p.c(f0Var2.x().f(), Boolean.TRUE)) {
                        return;
                    }
                    b4.this.S3().i(b4.this.X3(), intValue, str, ShooterMemberStatus.INVITING);
                } else if (shooterMemberStatus.didInvite()) {
                    b4.this.S3().g(str);
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
    public static final class r extends jo.q implements io.a<wn.v> {
        public r() {
            super(0);
        }

        public final void a() {
            d4 d4Var = b4.this.f17695a1;
            if (d4Var != null) {
                d4Var.c0();
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends jo.q implements io.a<wn.v> {
        public s() {
            super(0);
        }

        public final void a() {
            ie.g a10;
            g.a aVar = ie.g.P0;
            Context q02 = b4.this.q0();
            String str = (q02 == null || (str = q02.getString(nd.f1.text_shooter_matching_confirmation_cancel_matching_title)) == null) ? "" : "";
            Context q03 = b4.this.q0();
            String str2 = (q03 == null || (str2 = q03.getString(nd.f1.text_shooter_matching_cancel)) == null) ? "" : "";
            Context q04 = b4.this.q0();
            a10 = aVar.a(str, (r15 & 2) != 0 ? null : null, (r15 & 4) != 0 ? 0 : 0, (r15 & 8) != 0 ? 8388611 : 0, (r15 & 16) != 0 ? null : str2, (r15 & 32) == 0 ? 0 : 0, (r15 & 64) == 0 ? q04 != null ? q04.getString(nd.f1.f41995w0) : null : null);
            a10.z3(b4.this.p0(), "DIALOG_TAG_SHOOTER_MATCHING_CANCEL");
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends jo.q implements io.a<wn.v> {
        public t() {
            super(0);
        }

        public final void a() {
            d4 d4Var = b4.this.f17695a1;
            if (d4Var != null) {
                d4Var.s0();
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends jo.q implements io.a<Integer> {
        public u() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(b4.this.M2().getInt("EXTRA_KEY_RATING_ICON_TYPE"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class v extends jo.q implements io.a<Integer> {
        public v() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(b4.this.M2().getInt("EXTRA_KEY_RATING_POINT"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class w extends jo.q implements io.a<Integer> {
        public w() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(b4.this.M2().getInt("EXTRA_KEY_SEASON_ID"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class x extends jo.q implements io.l<View, wn.v> {
        public x() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            nf.f0 f0Var = b4.this.Q0;
            if (f0Var == null) {
                jo.p.v("store");
                f0Var = null;
            }
            Integer f10 = f0Var.s().f();
            if (f10 != null) {
                b4.this.S3().j(b4.this.X3(), f10.intValue(), ShooterTeamStatus.CANCELED);
            }
            b4.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class y extends RecyclerView.u {
        public y() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            jo.p.h(recyclerView, "recyclerView");
            super.b(recyclerView, i10, i11);
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            nf.f0 f0Var = null;
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            nf.f0 f0Var2 = b4.this.Q0;
            if (f0Var2 == null) {
                jo.p.v("store");
                f0Var2 = null;
            }
            List<wn.k<ShooterViewingUser, ShooterMemberStatus>> f10 = f0Var2.u().f();
            if (f10 == null) {
                return;
            }
            nf.f0 f0Var3 = b4.this.Q0;
            if (f0Var3 == null) {
                jo.p.v("store");
                f0Var3 = null;
            }
            Long f11 = f0Var3.p().f();
            if (f11 == null) {
                return;
            }
            long longValue = f11.longValue();
            nf.f0 f0Var4 = b4.this.Q0;
            if (f0Var4 == null) {
                jo.p.v("store");
            } else {
                f0Var = f0Var4;
            }
            Boolean f12 = f0Var.w().f();
            if (f12 != null && !f12.booleanValue() && longValue > 1 && f10.size() <= linearLayoutManager.l2() + 10) {
                b4.this.S3().f(b4.this.X3(), longValue);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class z extends jo.q implements io.l<View, wn.v> {
        public z() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            nf.f0 f0Var = b4.this.Q0;
            if (f0Var == null) {
                jo.p.v("store");
                f0Var = null;
            }
            Integer f10 = f0Var.s().f();
            if (f10 == null) {
                return;
            }
            b4.this.S3().j(b4.this.X3(), f10.intValue(), ShooterTeamStatus.MATCHING);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public b4() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.P0 = wn.g.b(iVar, new a0(this, null, null));
        this.R0 = wn.g.b(iVar, new b0(this, null, null));
        this.T0 = nd.a.a(this);
        this.U0 = wn.g.b(iVar, new c0(this, null, null));
        this.V0 = wn.g.a(new w());
        this.W0 = wn.g.a(new v());
        this.X0 = wn.g.a(new u());
    }

    public static final void a4(b4 b4Var, Boolean bool) {
        jo.p.h(b4Var, "this$0");
        StatusView statusView = b4Var.T3().N;
        jo.p.g(bool, "isLoading");
        statusView.b(bool.booleanValue() ? StatusView.b.C0181b.f20790w : StatusView.b.c.f20791w);
    }

    public static final void b4(b4 b4Var, wn.k kVar) {
        jo.p.h(b4Var, "this$0");
        b4Var.T3().V(ud.o3.f55289d.a((ShooterTeamStatus) kVar.a(), (List) kVar.b()));
    }

    public static final void c4(b4 b4Var, ShooterTeamStatus shooterTeamStatus) {
        androidx.fragment.app.e eVar;
        jo.p.h(b4Var, "this$0");
        uo.d2 d2Var = b4Var.Y0;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        uo.d2 d2Var2 = b4Var.Z0;
        if (d2Var2 != null) {
            d2.a.a(d2Var2, null, 1, null);
        }
        int i10 = shooterTeamStatus == null ? -1 : b.f17699a[shooterTeamStatus.ordinal()];
        if (i10 == 1) {
            b4Var.k4();
            b4Var.j4();
        } else if (i10 == 2) {
            nf.f0 f0Var = b4Var.Q0;
            if (f0Var == null) {
                jo.p.v("store");
                f0Var = null;
            }
            Integer f10 = f0Var.v().f();
            if (f10 == null) {
                f10 = 30;
            }
            long currentTimeMillis = System.currentTimeMillis() + (f10.intValue() * 1000);
            Fragment e02 = b4Var.p0().e0("ShooterMatchingDialogFragment");
            eVar = e02 instanceof androidx.fragment.app.e ? (androidx.fragment.app.e) e02 : null;
            if (eVar != null) {
                eVar.n3();
            }
            w4.R0.a(currentTimeMillis).z3(b4Var.p0(), "ShooterMatchingDialogFragment");
        } else if (i10 == 3) {
            Fragment e03 = b4Var.p0().e0("ShooterMatchingDialogFragment");
            androidx.fragment.app.e eVar2 = e03 instanceof androidx.fragment.app.e ? (androidx.fragment.app.e) e03 : null;
            if (eVar2 != null) {
                eVar2.n3();
            }
            Fragment e04 = b4Var.p0().e0("ShooterLoadingDialogFragment");
            eVar = e04 instanceof androidx.fragment.app.e ? (androidx.fragment.app.e) e04 : null;
            if (eVar != null) {
                eVar.n3();
            }
            e4.Q0.a().z3(b4Var.p0(), "ShooterLoadingDialogFragment");
        } else if (i10 != 4) {
        } else {
            Fragment e05 = b4Var.p0().e0("ShooterMatchingDialogFragment");
            androidx.fragment.app.e eVar3 = e05 instanceof androidx.fragment.app.e ? (androidx.fragment.app.e) e05 : null;
            if (eVar3 != null) {
                eVar3.n3();
            }
            Fragment e06 = b4Var.p0().e0("ShooterLoadingDialogFragment");
            eVar = e06 instanceof androidx.fragment.app.e ? (androidx.fragment.app.e) e06 : null;
            if (eVar != null) {
                eVar.n3();
            }
            b4Var.n3();
        }
    }

    public static final void d4(b4 b4Var, String str) {
        jo.p.h(b4Var, "this$0");
        jo.p.g(str, "rejectingUserId");
        if (str.length() == 0) {
            return;
        }
        nf.f0 f0Var = b4Var.Q0;
        Object obj = null;
        if (f0Var == null) {
            jo.p.v("store");
            f0Var = null;
        }
        List<wn.k<ShooterViewingUser, ShooterMemberStatus>> f10 = f0Var.u().f();
        if (f10 != null) {
            ArrayList arrayList = new ArrayList(xn.t.u(f10, 10));
            Iterator<T> it = f10.iterator();
            while (it.hasNext()) {
                arrayList.add((ShooterViewingUser) ((wn.k) it.next()).a());
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (jo.p.c(((ShooterViewingUser) next).getUserId(), str)) {
                    obj = next;
                    break;
                }
            }
            ShooterViewingUser shooterViewingUser = (ShooterViewingUser) obj;
            if (shooterViewingUser == null) {
                return;
            }
            f.a aVar = ie.f.V0;
            String V0 = b4Var.V0(nd.f1.text_shooter_member_deselect_title, shooterViewingUser.getName());
            jo.p.g(V0, "getString(R.string.text_…eselect_title, user.name)");
            f.a.b(aVar, V0, b4Var.U0(nd.f1.S5), b4Var.U0(nd.f1.f41995w0), null, false, 24, null).z3(b4Var.p0(), "CustomYesNoDialog");
        }
    }

    public static final void e4(b4 b4Var, List list) {
        jo.p.h(b4Var, "this$0");
        p3.a aVar = ud.p3.f55333j;
        Context N2 = b4Var.N2();
        jo.p.g(N2, "requireContext()");
        List d10 = xn.r.d(aVar.c(N2, b4Var.Y3().T4(), b4Var.Y3().u2(), b4Var.W3(), b4Var.V3()));
        jo.p.g(list, "it");
        ArrayList<wn.k> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ShooterMemberStatus) ((wn.k) obj).b()).didInvite()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(xn.t.u(arrayList, 10));
        for (wn.k kVar : arrayList) {
            p3.a aVar2 = ud.p3.f55333j;
            Context N22 = b4Var.N2();
            jo.p.g(N22, "requireContext()");
            arrayList2.add(aVar2.a(N22, (ShooterViewingUser) kVar.a(), (ShooterMemberStatus) kVar.b()));
        }
        ArrayList arrayList3 = new ArrayList(3);
        for (int i10 = 0; i10 < 3; i10++) {
            arrayList3.add(ud.p3.f55333j.b());
        }
        List w02 = xn.a0.w0(xn.a0.o0(xn.a0.o0(d10, arrayList2), arrayList3), 4);
        RecyclerView.h adapter = b4Var.T3().G.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrorman.adapter.ShooterInvitedViewerAdapter");
        ((rd.y0) adapter).d(w02);
    }

    public static final void f4(b4 b4Var, List list) {
        jo.p.h(b4Var, "this$0");
        List d10 = xn.r.d(b4Var.Y3().u2());
        jo.p.g(list, "it");
        ArrayList<wn.k> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ShooterMemberStatus) ((wn.k) obj).b()) == ShooterMemberStatus.APPROVED) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(xn.t.u(arrayList, 10));
        for (wn.k kVar : arrayList) {
            arrayList2.add(((ShooterViewingUser) kVar.a()).getIconUrl());
        }
        b4Var.T3().K.g(xn.a0.o0(d10, arrayList2));
    }

    @Override // ie.h
    public void D2(String str) {
        jo.p.h(str, "tag");
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        ae.k0 T = ae.k0.T(LayoutInflater.from(N2()), null, false);
        jo.p.g(T, "inflate(\n            Lay…          false\n        )");
        g4(T);
        View u10 = T3().u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void H1() {
        uo.r0.d(this, null, 1, null);
        uo.d2 d2Var = this.Y0;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        uo.d2 d2Var2 = this.Z0;
        if (d2Var2 != null) {
            d2.a.a(d2Var2, null, 1, null);
        }
        super.H1();
    }

    public final od.l0 S3() {
        return (od.l0) this.P0.getValue();
    }

    @Override // be.x4
    public void T() {
        nf.f0 f0Var = this.Q0;
        if (f0Var == null) {
            jo.p.v("store");
            f0Var = null;
        }
        Integer f10 = f0Var.s().f();
        if (f10 != null) {
            f10.intValue();
            S3().j(X3(), f10.intValue(), ShooterTeamStatus.CANCELED);
        }
        n3();
    }

    public final ae.k0 T3() {
        return (ae.k0) this.T0.b(this, f17693c1[0]);
    }

    public final od.m0 U3() {
        return (od.m0) this.R0.getValue();
    }

    public final int V3() {
        return ((Number) this.X0.getValue()).intValue();
    }

    public final int W3() {
        return ((Number) this.W0.getValue()).intValue();
    }

    public final int X3() {
        return ((Number) this.V0.getValue()).intValue();
    }

    public final kf.x Y3() {
        return (kf.x) this.U0.getValue();
    }

    public final void Z3() {
        nf.f0 f0Var = this.Q0;
        if (f0Var == null) {
            jo.p.v("store");
            f0Var = null;
        }
        f0Var.w().i(a1(), new androidx.lifecycle.f0() { // from class: be.w3
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                b4.a4(b4.this, (Boolean) obj);
            }
        });
        uo.l.d(this, null, null, new f(null), 3, null);
        nf.f0 f0Var2 = this.Q0;
        if (f0Var2 == null) {
            jo.p.v("store");
            f0Var2 = null;
        }
        f0Var2.u().i(a1(), new androidx.lifecycle.f0() { // from class: be.z3
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                b4.e4(b4.this, (List) obj);
            }
        });
        nf.f0 f0Var3 = this.Q0;
        if (f0Var3 == null) {
            jo.p.v("store");
            f0Var3 = null;
        }
        f0Var3.u().i(a1(), new androidx.lifecycle.f0() { // from class: be.y3
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                b4.f4(b4.this, (List) obj);
            }
        });
        wn.k a10 = wn.q.a(ShooterTeamStatus.NONE, xn.s.k());
        nf.f0 f0Var4 = this.Q0;
        if (f0Var4 == null) {
            jo.p.v("store");
            f0Var4 = null;
        }
        LiveData<ShooterTeamStatus> t10 = f0Var4.t();
        nf.f0 f0Var5 = this.Q0;
        if (f0Var5 == null) {
            jo.p.v("store");
            f0Var5 = null;
        }
        LiveData<List<wn.k<ShooterViewingUser, ShooterMemberStatus>>> u10 = f0Var5.u();
        androidx.lifecycle.c0 c0Var = new androidx.lifecycle.c0();
        c0Var.p(a10);
        for (LiveData liveData : xn.s.m(t10, u10)) {
            c0Var.q(liveData, new c(c0Var, t10, u10));
        }
        LiveData a11 = androidx.lifecycle.p0.a(c0Var);
        jo.p.g(a11, "distinctUntilChanged(this)");
        a11.i(a1(), new androidx.lifecycle.f0() { // from class: be.a4
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                b4.b4(b4.this, (wn.k) obj);
            }
        });
        nf.f0 f0Var6 = this.Q0;
        if (f0Var6 == null) {
            jo.p.v("store");
            f0Var6 = null;
        }
        f0Var6.t().i(a1(), new androidx.lifecycle.f0() { // from class: be.v3
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                b4.c4(b4.this, (ShooterTeamStatus) obj);
            }
        });
        nf.f0 f0Var7 = this.Q0;
        if (f0Var7 == null) {
            jo.p.v("store");
            f0Var7 = null;
        }
        f0Var7.q().i(a1(), new androidx.lifecycle.f0() { // from class: be.x3
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                b4.d4(b4.this, (String) obj);
            }
        });
        uo.l.d(this, null, null, new g(null), 3, null);
        uo.l.d(this, null, null, new d(null), 3, null);
        uo.l.d(this, null, null, new e(null), 3, null);
    }

    @Override // be.f4
    public void a2() {
        nf.f0 f0Var = this.Q0;
        nf.f0 f0Var2 = null;
        if (f0Var == null) {
            jo.p.v("store");
            f0Var = null;
        }
        Integer f10 = f0Var.s().f();
        if (f10 == null) {
            return;
        }
        int intValue = f10.intValue();
        nf.f0 f0Var3 = this.Q0;
        if (f0Var3 == null) {
            jo.p.v("store");
            f0Var3 = null;
        }
        Integer f11 = f0Var3.k().f();
        if (f11 == null) {
            return;
        }
        int intValue2 = f11.intValue();
        nf.f0 f0Var4 = this.Q0;
        if (f0Var4 == null) {
            jo.p.v("store");
            f0Var4 = null;
        }
        String f12 = f0Var4.r().f();
        if (f12 == null) {
            return;
        }
        nf.f0 f0Var5 = this.Q0;
        if (f0Var5 == null) {
            jo.p.v("store");
        } else {
            f0Var2 = f0Var5;
        }
        ShooterMemberType f13 = f0Var2.l().f();
        if (f13 == null) {
            return;
        }
        d4 d4Var = this.f17695a1;
        if (d4Var != null) {
            d4Var.g1(intValue, intValue2, f12, f13);
        }
        n3();
    }

    @Override // ie.f.b
    public void b(String str) {
        jo.p.h(str, "tag");
        nf.f0 f0Var = this.Q0;
        nf.f0 f0Var2 = null;
        if (f0Var == null) {
            jo.p.v("store");
            f0Var = null;
        }
        Integer f10 = f0Var.s().f();
        if (f10 == null) {
            return;
        }
        int intValue = f10.intValue();
        nf.f0 f0Var3 = this.Q0;
        if (f0Var3 == null) {
            jo.p.v("store");
        } else {
            f0Var2 = f0Var3;
        }
        String f11 = f0Var2.q().f();
        if (f11 == null) {
            return;
        }
        S3().i(X3(), intValue, f11, ShooterMemberStatus.CANCELING);
        S3().e(f11);
    }

    @Override // ie.f.b
    public void c(String str) {
        jo.p.h(str, "tag");
        nf.f0 f0Var = this.Q0;
        if (f0Var == null) {
            jo.p.v("store");
            f0Var = null;
        }
        String f10 = f0Var.q().f();
        if (f10 == null) {
            return;
        }
        S3().c(f10);
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        h hVar = new h(this);
        xq.a a10 = gq.a.a(this);
        i iVar = new i(hVar);
        this.Q0 = (nf.f0) ((androidx.lifecycle.q0) androidx.fragment.app.e0.a(this, jo.f0.b(nf.f0.class), new k(iVar), new j(hVar, null, null, a10)).getValue());
        l lVar = new l(this);
        xq.a a11 = gq.a.a(this);
        m mVar = new m(lVar);
        this.S0 = (nf.g0) ((androidx.lifecycle.q0) androidx.fragment.app.e0.a(this, jo.f0.b(nf.g0.class), new o(mVar), new n(lVar, null, null, a11)).getValue());
        RecyclerView recyclerView = T3().G;
        androidx.lifecycle.u a12 = a1();
        jo.p.g(a12, "viewLifecycleOwner");
        recyclerView.setAdapter(new rd.y0(a12, new p()));
        T3().G.setItemAnimator(null);
        o3.c0.E0(T3().G, false);
        RecyclerView recyclerView2 = T3().R;
        androidx.lifecycle.u a13 = a1();
        jo.p.g(a13, "viewLifecycleOwner");
        recyclerView2.setAdapter(new rd.x0(a13, new q(), new r(), new s(), new t()));
        T3().R.setItemAnimator(null);
        i4();
        Z3();
        h4();
        S3().d(Referer.Event.SHOOTER_RANKING, X3());
    }

    public final void g4(ae.k0 k0Var) {
        this.T0.a(this, f17693c1[0], k0Var);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O0.getCoroutineContext();
    }

    public final void h4() {
        View findViewById;
        Dialog p32 = p3();
        com.google.android.material.bottomsheet.a aVar = p32 instanceof com.google.android.material.bottomsheet.a ? (com.google.android.material.bottomsheet.a) p32 : null;
        if (aVar == null || (findViewById = aVar.findViewById(nd.z0.f42369y3)) == null) {
            return;
        }
        int i10 = (int) (O0().getDisplayMetrics().heightPixels * 0.9d);
        findViewById.setBackgroundResource(17170445);
        findViewById.getLayoutParams().height = i10;
        findViewById.setOnClickListener(null);
        BottomSheetBehavior c02 = BottomSheetBehavior.c0(findViewById);
        jo.p.g(c02, "from(bottomSheet)");
        c02.z0(3);
        c02.v0(i10);
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.g(T3().D);
        cVar.l(T3().D.getId(), i10);
        cVar.c(T3().D);
    }

    public final void i4() {
        AppCompatImageView appCompatImageView = T3().C;
        jo.p.g(appCompatImageView, "binding.closeImageView");
        yd.g1.a(appCompatImageView, new x());
        T3().R.k(new y());
        RoundedButtonView roundedButtonView = T3().I;
        jo.p.g(roundedButtonView, "binding.playButton");
        yd.g1.a(roundedButtonView, new z());
    }

    public final void j4() {
        uo.d2 d10;
        d10 = uo.l.d(this, null, null, new d0(null), 3, null);
        this.Z0 = d10;
    }

    public final void k4() {
        uo.d2 d10;
        d10 = uo.l.d(this, null, null, new e0(null), 3, null);
        this.Y0 = d10;
    }

    @Override // ie.h
    public void p(String str) {
        d4 d4Var;
        jo.p.h(str, "tag");
        if (!jo.p.c(str, "DIALOG_TAG_SHOOTER_MATCHING_CANCEL") || (d4Var = this.f17695a1) == null) {
            return;
        }
        d4Var.g0();
    }

    @Override // androidx.fragment.app.e
    public int q3() {
        return nd.g1.f42011k;
    }

    @Override // be.x4
    public void u() {
        nf.f0 f0Var = this.Q0;
        if (f0Var == null) {
            jo.p.v("store");
            f0Var = null;
        }
        Integer f10 = f0Var.s().f();
        if (f10 == null) {
            return;
        }
        S3().j(X3(), f10.intValue(), ShooterTeamStatus.FORCE_MATCHING);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.f17695a1 = context instanceof d4 ? (d4) context : null;
    }
}
