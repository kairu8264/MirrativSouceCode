package hc;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import be.z1;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.clientlog.logs.LogBase;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.net.api.response.GroupShotBackgroundsResponse;
import com.dena.mirrorman.net.api.response.GroupShotViewer;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kq.a;
import org.json.JSONObject;
import yd.g1;
import yd.t1;

/* loaded from: classes2.dex */
public final class h0 extends androidx.fragment.app.e implements uo.q0, hc.v {
    public final /* synthetic */ da.j N0 = new da.j();
    public final AutoClearedValue O0 = nd.a.a(this);
    public final wn.f P0 = wn.g.a(new t());
    public final wn.f Q0;
    public final wn.f R0;
    public final wn.f S0;
    public final wn.f T0;
    public final wn.f U0;
    public final wn.f V0;
    public final wn.f W0;
    public z0 X0;
    public i0 Y0;

    /* renamed from: a1  reason: collision with root package name */
    public static final /* synthetic */ qo.h<Object>[] f35120a1 = {jo.f0.d(new jo.s(h0.class, "binding", "getBinding()Lcom/dena/mirrativ/streaming/databinding/DialogFragmentGroupShotResultBinding;", 0))};
    public static final a Z0 = new a(null);

    /* renamed from: b1  reason: collision with root package name */
    public static final int f35121b1 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final h0 a(String str) {
            jo.p.h(str, "referer");
            h0 h0Var = new h0();
            Bundle bundle = new Bundle();
            bundle.putString("BUNDLE_KEY_REFERER", str);
            h0Var.V2(bundle);
            return h0Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a0 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f35122w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(Fragment fragment) {
            super(0);
            this.f35122w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f35122w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f35122w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f35123w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f35123w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f35123w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b0 extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f35124w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(io.a aVar) {
            super(0);
            this.f35124w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f35124w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f35125w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(io.a aVar) {
            super(0);
            this.f35125w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f35125w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c0 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f35126w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f35127x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f35128y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f35129z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f35126w = aVar;
            this.f35127x = aVar2;
            this.f35128y = aVar3;
            this.f35129z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f35126w;
            vq.a aVar2 = this.f35127x;
            io.a aVar3 = this.f35128y;
            xq.a aVar4 = this.f35129z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.h0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f35130w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f35131x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f35132y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f35133z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f35130w = aVar;
            this.f35131x = aVar2;
            this.f35132y = aVar3;
            this.f35133z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f35130w;
            vq.a aVar2 = this.f35131x;
            io.a aVar3 = this.f35132y;
            xq.a aVar4 = this.f35133z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(z0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class d0 extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f35134w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(io.a aVar) {
            super(0);
            this.f35134w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f35134w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f35135w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(io.a aVar) {
            super(0);
            this.f35135w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f35135w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.groupshot.GroupShotResultDialogFragment$onCreateDialog$10", f = "GroupShotResultDialogFragment.kt", l = {254}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f35136w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ h0 f35138w;

            public a(h0 h0Var) {
                this.f35138w = h0Var;
            }

            public final Object a(boolean z10, ao.d<? super wn.v> dVar) {
                this.f35138w.L3().R.setAlpha(z10 ? 1.0f : 0.5f);
                this.f35138w.L3().N.setAlpha(z10 ? 1.0f : 0.5f);
                this.f35138w.L3().M.setChecked(z10);
                return wn.v.f59242a;
            }

            @Override // xo.d
            public /* bridge */ /* synthetic */ Object emit(Boolean bool, ao.d dVar) {
                return a(bool.booleanValue(), dVar);
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
            int i10 = this.f35136w;
            if (i10 == 0) {
                wn.m.b(obj);
                z0 z0Var = h0.this.X0;
                if (z0Var == null) {
                    jo.p.v("groupShotStore");
                    z0Var = null;
                }
                xo.g0<Boolean> o10 = z0Var.o();
                a aVar = new a(h0.this);
                this.f35136w = 1;
                if (o10.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.streaming.groupshot.GroupShotResultDialogFragment$onCreateDialog$11", f = "GroupShotResultDialogFragment.kt", l = {262}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f35139w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ h0 f35141w;

            public a(h0 h0Var) {
                this.f35141w = h0Var;
            }

            public final Object a(boolean z10, ao.d<? super wn.v> dVar) {
                StatusView.b bVar;
                if (z10) {
                    bVar = StatusView.b.C0181b.f20790w;
                } else {
                    bVar = StatusView.b.c.f20791w;
                }
                this.f35141w.L3().O.b(bVar);
                return wn.v.f59242a;
            }

            @Override // xo.d
            public /* bridge */ /* synthetic */ Object emit(Boolean bool, ao.d dVar) {
                return a(bool.booleanValue(), dVar);
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
            int i10 = this.f35139w;
            if (i10 == 0) {
                wn.m.b(obj);
                z0 z0Var = h0.this.X0;
                if (z0Var == null) {
                    jo.p.v("groupShotStore");
                    z0Var = null;
                }
                xo.g0<Boolean> n10 = z0Var.n();
                a aVar = new a(h0.this);
                this.f35139w = 1;
                if (n10.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.streaming.groupshot.GroupShotResultDialogFragment$onCreateDialog$12", f = "GroupShotResultDialogFragment.kt", l = {273}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f35142w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ h0 f35144w;

            public a(h0 h0Var) {
                this.f35144w = h0Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                if (mRError instanceof MRError.Failure) {
                    t1.a aVar = t1.f61795x;
                    Context N2 = this.f35144w.N2();
                    jo.p.g(N2, "requireContext()");
                    aVar.a(N2, ((MRError.Failure) mRError).getErrorMessage());
                } else if (mRError instanceof MRError.Blocked) {
                    t1.a aVar2 = t1.f61795x;
                    Context N22 = this.f35144w.N2();
                    jo.p.g(N22, "requireContext()");
                    aVar2.a(N22, ((MRError.Blocked) mRError).getErrorMessage());
                } else {
                    if (mRError instanceof MRError.ForceUpdate ? true : jo.p.c(mRError, MRError.Maintenance.INSTANCE)) {
                        of.n.f45411a.l(this.f35144w.N2(), mRError);
                    } else if (mRError instanceof MRError.Network) {
                        of.n.z(this.f35144w.N2());
                    }
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
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f35142w;
            if (i10 == 0) {
                wn.m.b(obj);
                z0 z0Var = h0.this.X0;
                if (z0Var == null) {
                    jo.p.v("groupShotStore");
                    z0Var = null;
                }
                xo.c<MRError> h10 = z0Var.h();
                a aVar = new a(h0.this);
                this.f35142w = 1;
                if (h10.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.streaming.groupshot.GroupShotResultDialogFragment$onCreateDialog$13", f = "GroupShotResultDialogFragment.kt", l = {286}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f35145w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ h0 f35147w;

            public a(h0 h0Var) {
                this.f35147w = h0Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                t1.a aVar = t1.f61795x;
                Context N2 = this.f35147w.N2();
                jo.p.g(N2, "requireContext()");
                String U0 = this.f35147w.U0(xb.r.text_groupshot_gallery_post_succeeded);
                jo.p.g(U0, "getString(R.string.text_…t_gallery_post_succeeded)");
                aVar.a(N2, U0);
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
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f35145w;
            if (i10 == 0) {
                wn.m.b(obj);
                z0 z0Var = h0.this.X0;
                if (z0Var == null) {
                    jo.p.v("groupShotStore");
                    z0Var = null;
                }
                xo.c<wn.v> j10 = z0Var.j();
                a aVar = new a(h0.this);
                this.f35145w = 1;
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

    @co.f(c = "com.dena.mirrativ.streaming.groupshot.GroupShotResultDialogFragment$onCreateDialog$14", f = "GroupShotResultDialogFragment.kt", l = {297}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f35148w;

        @co.f(c = "com.dena.mirrativ.streaming.groupshot.GroupShotResultDialogFragment$onCreateDialog$14$1", f = "GroupShotResultDialogFragment.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends co.l implements io.q<Boolean, Boolean, ao.d<? super Boolean>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f35150w;

            /* renamed from: x  reason: collision with root package name */
            public /* synthetic */ boolean f35151x;

            /* renamed from: y  reason: collision with root package name */
            public /* synthetic */ boolean f35152y;

            public a(ao.d<? super a> dVar) {
                super(3, dVar);
            }

            public final Object a(boolean z10, boolean z11, ao.d<? super Boolean> dVar) {
                a aVar = new a(dVar);
                aVar.f35151x = z10;
                aVar.f35152y = z11;
                return aVar.invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                bo.c.c();
                if (this.f35150w == 0) {
                    wn.m.b(obj);
                    return co.b.a(!this.f35151x && this.f35152y);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // io.q
            public /* bridge */ /* synthetic */ Object s0(Boolean bool, Boolean bool2, ao.d<? super Boolean> dVar) {
                return a(bool.booleanValue(), bool2.booleanValue(), dVar);
            }
        }

        /* loaded from: classes2.dex */
        public static final class b implements xo.d<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ h0 f35153w;

            public b(h0 h0Var) {
                this.f35153w = h0Var;
            }

            public final Object a(boolean z10, ao.d<? super wn.v> dVar) {
                this.f35153w.L3().I.setTitleColor(z10 ? xb.l.f59952y : xb.l.A);
                this.f35153w.L3().I.setRoundedButtonViewBackgroundColor(z10 ? xb.l.f59943n : xb.l.f59941k);
                return wn.v.f59242a;
            }

            @Override // xo.d
            public /* bridge */ /* synthetic */ Object emit(Boolean bool, ao.d dVar) {
                return a(bool.booleanValue(), dVar);
            }
        }

        public j(ao.d<? super j> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f35148w;
            if (i10 == 0) {
                wn.m.b(obj);
                z0 z0Var = h0.this.X0;
                if (z0Var == null) {
                    jo.p.v("groupShotStore");
                    z0Var = null;
                }
                xo.g0<Boolean> k10 = z0Var.k();
                z0 z0Var2 = h0.this.X0;
                if (z0Var2 == null) {
                    jo.p.v("groupShotStore");
                    z0Var2 = null;
                }
                xo.c h10 = xo.e.h(k10, z0Var2.l(), new a(null));
                b bVar = new b(h0.this);
                this.f35148w = 1;
                if (h10.a(bVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.streaming.groupshot.GroupShotResultDialogFragment$onCreateDialog$15", f = "GroupShotResultDialogFragment.kt", l = {304}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f35154w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ h0 f35156w;

            public a(h0 h0Var) {
                this.f35156w = h0Var;
            }

            public final Object a(boolean z10, ao.d<? super wn.v> dVar) {
                this.f35156w.L3().L.setVisibility(z10 ? 0 : 8);
                return wn.v.f59242a;
            }

            @Override // xo.d
            public /* bridge */ /* synthetic */ Object emit(Boolean bool, ao.d dVar) {
                return a(bool.booleanValue(), dVar);
            }
        }

        public k(ao.d<? super k> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new k(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((k) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f35154w;
            if (i10 == 0) {
                wn.m.b(obj);
                z0 z0Var = h0.this.X0;
                if (z0Var == null) {
                    jo.p.v("groupShotStore");
                    z0Var = null;
                }
                xo.c<Boolean> p10 = z0Var.p();
                a aVar = new a(h0.this);
                this.f35154w = 1;
                if (p10.a(aVar, this) == c10) {
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
    public static final class l extends jo.q implements io.l<View, wn.v> {
        public l() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            h0.this.m3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.l<View, wn.v> {
        public m() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            h0.this.M3().U(true);
            Bitmap z10 = h0.this.R3().z();
            if (z10 != null) {
                h0.this.K3().p(z10);
            }
            MRLogger P3 = h0.this.P3();
            MRLog.Companion companion = MRLog.Companion;
            h0 h0Var = h0.this;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_GROUPSHOT_SAVE_CLICK);
            builder.setTargetType(MRLog.TARGET_TYPE_LIVE);
            builder.setTargetId(h0Var.O3().b());
            builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, h0Var.O3().b()), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, h0Var.S3().T4())));
            P3.sendLog(builder.build());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.l<View, wn.v> {
        public n() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            Bitmap z10 = h0.this.R3().z();
            if (z10 != null) {
                h0.this.K3().r(z10);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.l<View, wn.v> {
        public o() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            z0 z0Var = h0.this.X0;
            z0 z0Var2 = null;
            if (z0Var == null) {
                jo.p.v("groupShotStore");
                z0Var = null;
            }
            if (z0Var.n().getValue().booleanValue()) {
                return;
            }
            z0 z0Var3 = h0.this.X0;
            if (z0Var3 == null) {
                jo.p.v("groupShotStore");
            } else {
                z0Var2 = z0Var3;
            }
            if (z0Var2.k().getValue().booleanValue()) {
                return;
            }
            h0.this.N3().e();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.l<View, wn.v> {

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.l<GroupShotViewer, CharSequence> {

            /* renamed from: w  reason: collision with root package name */
            public static final a f35162w = new a();

            public a() {
                super(1);
            }

            @Override // io.l
            /* renamed from: a */
            public final CharSequence invoke(GroupShotViewer groupShotViewer) {
                jo.p.h(groupShotViewer, "it");
                return groupShotViewer.getUser().getUserId();
            }
        }

        public p() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0110  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(android.view.View r15) {
            /*
                Method dump skipped, instructions count: 347
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: hc.h0.p.a(android.view.View):void");
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
            GroupShotBackgroundsResponse value = h0.this.R3().y().getValue();
            if (value != null) {
                z1.P0.a(value.getGroupShotGalleryHelpImageUrl()).z3(h0.this.p0(), "HelpImagePopupDialogFragment");
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.groupshot.GroupShotResultDialogFragment$onCreateDialog$8", f = "GroupShotResultDialogFragment.kt", l = {335}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class r extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f35164w;

        /* renamed from: x  reason: collision with root package name */
        public Object f35165x;

        /* renamed from: y  reason: collision with root package name */
        public Object f35166y;

        /* renamed from: z  reason: collision with root package name */
        public int f35167z;

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.p<MRLogger, String, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ String f35168w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(2);
                this.f35168w = str;
            }

            public final void a(MRLogger mRLogger, String str) {
                jo.p.h(mRLogger, "logger");
                MRLog.Companion companion = MRLog.Companion;
                String str2 = this.f35168w;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_GROUPSHOT_SHARE);
                builder.setTargetId(MRLog.TARGET_ID_TAP);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(LogBase.SERVICE_NAME, str);
                wn.v vVar = wn.v.f59242a;
                builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, str2), wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, jSONObject.toString())));
                mRLogger.sendLog(builder.build());
            }

            @Override // io.p
            public /* bridge */ /* synthetic */ wn.v invoke(MRLogger mRLogger, String str) {
                a(mRLogger, str);
                return wn.v.f59242a;
            }
        }

        public r(ao.d<? super r> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new r(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((r) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00e4, TryCatch #0 {all -> 0x00e4, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x0084, B:25:0x00a0, B:26:0x00b1), top: B:37:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00de  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 238
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: hc.h0.r.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.groupshot.GroupShotResultDialogFragment$onCreateDialog$9", f = "GroupShotResultDialogFragment.kt", l = {335}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class s extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f35169w;

        /* renamed from: x  reason: collision with root package name */
        public Object f35170x;

        /* renamed from: y  reason: collision with root package name */
        public Object f35171y;

        /* renamed from: z  reason: collision with root package name */
        public int f35172z;

        public s(ao.d<? super s> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new s(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((s) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0093, TryCatch #0 {all -> 0x0093, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x0069), top: B:32:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r13.f35172z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r13.f35171y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r13.f35170x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r13.f35169w
                hc.h0 r4 = (hc.h0) r4
                wn.m.b(r14)     // Catch: java.lang.Throwable -> L96
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r13
                goto L53
            L20:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L28:
                wn.m.b(r14)
                hc.h0 r14 = hc.h0.this
                nf.h0 r14 = hc.h0.I3(r14)
                wo.x r3 = r14.M()
                hc.h0 r14 = hc.h0.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L96
                r4 = r14
                r14 = r13
            L3d:
                r14.f35169w = r4     // Catch: java.lang.Throwable -> L96
                r14.f35170x = r3     // Catch: java.lang.Throwable -> L96
                r14.f35171y = r1     // Catch: java.lang.Throwable -> L96
                r14.f35172z = r2     // Catch: java.lang.Throwable -> L96
                java.lang.Object r5 = r1.a(r14)     // Catch: java.lang.Throwable -> L96
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r12 = r0
                r0 = r14
                r14 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r12
            L53:
                r6 = 0
                java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch: java.lang.Throwable -> L93
                boolean r14 = r14.booleanValue()     // Catch: java.lang.Throwable -> L93
                if (r14 == 0) goto L8d
                java.lang.Object r14 = r3.next()     // Catch: java.lang.Throwable -> L93
                r11 = r14
                android.net.Uri r11 = (android.net.Uri) r11     // Catch: java.lang.Throwable -> L93
                android.content.Context r7 = r5.q0()     // Catch: java.lang.Throwable -> L93
                if (r7 == 0) goto L87
                com.dena.mirrorman.feature.live.LivePrepareLiveThumbnailActivity$a r6 = com.dena.mirrorman.feature.live.LivePrepareLiveThumbnailActivity.Y     // Catch: java.lang.Throwable -> L93
                java.lang.String r14 = "it"
                jo.p.g(r7, r14)     // Catch: java.lang.Throwable -> L93
                java.lang.String r8 = "broadcast"
                r9 = 2
                kf.m r14 = hc.h0.G3(r5)     // Catch: java.lang.Throwable -> L93
                java.lang.String r10 = r14.b()     // Catch: java.lang.Throwable -> L93
                android.content.Intent r14 = r6.a(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L93
                r6 = 268435456(0x10000000, float:2.5243549E-29)
                r14.addFlags(r6)     // Catch: java.lang.Throwable -> L93
                r5.f3(r14)     // Catch: java.lang.Throwable -> L93
            L87:
                r14 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L8d:
                wo.n.a(r4, r6)
                wn.v r14 = wn.v.f59242a
                return r14
            L93:
                r14 = move-exception
                r3 = r4
                goto L97
            L96:
                r14 = move-exception
            L97:
                throw r14     // Catch: java.lang.Throwable -> L98
            L98:
                r0 = move-exception
                wo.n.a(r3, r14)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: hc.h0.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends jo.q implements io.a<String> {
        public t() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = h0.this.M2().getString("BUNDLE_KEY_REFERER");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f35174w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f35175x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f35176y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f35174w = componentCallbacks;
            this.f35175x = aVar;
            this.f35176y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f35174w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f35175x, this.f35176y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class v extends jo.q implements io.a<kf.m> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f35177w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f35178x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f35179y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f35177w = componentCallbacks;
            this.f35178x = aVar;
            this.f35179y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.m, java.lang.Object] */
        @Override // io.a
        public final kf.m invoke() {
            ComponentCallbacks componentCallbacks = this.f35177w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.m.class), this.f35178x, this.f35179y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class w extends jo.q implements io.a<kf.x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f35180w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f35181x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f35182y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f35180w = componentCallbacks;
            this.f35181x = aVar;
            this.f35182y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final kf.x invoke() {
            ComponentCallbacks componentCallbacks = this.f35180w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.x.class), this.f35181x, this.f35182y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class x extends jo.q implements io.a<od.n0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f35183w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f35184x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f35185y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f35183w = componentCallbacks;
            this.f35184x = aVar;
            this.f35185y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.n0, java.lang.Object] */
        @Override // io.a
        public final od.n0 invoke() {
            ComponentCallbacks componentCallbacks = this.f35183w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.n0.class), this.f35184x, this.f35185y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class y extends jo.q implements io.a<od.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f35186w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f35187x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f35188y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f35186w = componentCallbacks;
            this.f35187x = aVar;
            this.f35188y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.b] */
        @Override // io.a
        public final od.b invoke() {
            ComponentCallbacks componentCallbacks = this.f35186w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.b.class), this.f35187x, this.f35188y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class z extends jo.q implements io.a<hc.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f35189w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f35190x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f35191y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f35189w = componentCallbacks;
            this.f35190x = aVar;
            this.f35191y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, hc.a] */
        @Override // io.a
        public final hc.a invoke() {
            ComponentCallbacks componentCallbacks = this.f35189w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hc.a.class), this.f35190x, this.f35191y);
        }
    }

    public h0() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.Q0 = wn.g.b(iVar, new u(this, null, null));
        this.R0 = wn.g.b(iVar, new v(this, null, null));
        this.S0 = wn.g.b(iVar, new w(this, null, null));
        this.T0 = wn.g.b(iVar, new x(this, null, null));
        this.U0 = wn.g.b(iVar, new y(this, null, null));
        a0 a0Var = new a0(this);
        xq.a a10 = gq.a.a(this);
        b0 b0Var = new b0(a0Var);
        this.V0 = androidx.fragment.app.e0.a(this, jo.f0.b(nf.h0.class), new d0(b0Var), new c0(a0Var, null, null, a10));
        this.W0 = wn.g.b(iVar, new z(this, null, null));
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void A1(Bundle bundle) {
        super.A1(bundle);
        b bVar = new b(this);
        xq.a a10 = gq.a.a(this);
        c cVar = new c(bVar);
        this.X0 = (z0) ((androidx.lifecycle.q0) androidx.fragment.app.e0.a(this, jo.f0.b(z0.class), new e(cVar), new d(bVar, null, null, a10)).getValue());
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        i0 i0Var = this.Y0;
        if (i0Var != null) {
            i0Var.K();
        }
        this.Y0 = null;
        uo.r0.d(this, null, 1, null);
        super.I1();
    }

    public final od.n0 K3() {
        return (od.n0) this.T0.getValue();
    }

    public final ac.w0 L3() {
        return (ac.w0) this.O0.b(this, f35120a1[0]);
    }

    public final od.b M3() {
        return (od.b) this.U0.getValue();
    }

    public final hc.a N3() {
        return (hc.a) this.W0.getValue();
    }

    public final kf.m O3() {
        return (kf.m) this.R0.getValue();
    }

    public final MRLogger P3() {
        return (MRLogger) this.Q0.getValue();
    }

    public final String Q3() {
        return (String) this.P0.getValue();
    }

    public final nf.h0 R3() {
        return (nf.h0) this.V0.getValue();
    }

    public final kf.x S3() {
        return (kf.x) this.S0.getValue();
    }

    public final void T3(ac.w0 w0Var) {
        this.O0.a(this, f35120a1[0], w0Var);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        w3(false);
        ac.w0 T = ac.w0.T(LayoutInflater.from(N2()), null, false);
        jo.p.g(T, "inflate(\n            Lay…          false\n        )");
        T3(T);
        Bitmap z10 = R3().z();
        if (z10 != null) {
            L3().G.setImageBitmap(z10);
        }
        AppCompatImageView appCompatImageView = L3().D;
        jo.p.g(appCompatImageView, "binding.closeImageView");
        g1.a(appCompatImageView, new l());
        RoundedButtonView roundedButtonView = L3().J;
        jo.p.g(roundedButtonView, "binding.savePhotoButtonView");
        g1.a(roundedButtonView, new m());
        RoundedButtonView roundedButtonView2 = L3().P;
        jo.p.g(roundedButtonView2, "binding.thumbnailButtonView");
        g1.a(roundedButtonView2, new n());
        View view = L3().K;
        jo.p.g(view, "binding.shareTweetClickableView");
        g1.a(view, new o());
        N3().g(Q3());
        RoundedButtonView roundedButtonView3 = L3().I;
        jo.p.g(roundedButtonView3, "binding.postGroupShotGalleryButtonView");
        g1.a(roundedButtonView3, new p());
        AppCompatTextView appCompatTextView = L3().F;
        appCompatTextView.setPaintFlags(appCompatTextView.getPaintFlags() | 8);
        jo.p.g(appCompatTextView, "");
        g1.a(appCompatTextView, new q());
        uo.l.d(this, null, null, new r(null), 3, null);
        uo.l.d(this, null, null, new s(null), 3, null);
        uo.l.d(this, null, null, new f(null), 3, null);
        uo.l.d(this, null, null, new g(null), 3, null);
        uo.l.d(this, null, null, new h(null), 3, null);
        uo.l.d(this, null, null, new i(null), 3, null);
        uo.l.d(this, null, null, new j(null), 3, null);
        uo.l.d(this, null, null, new k(null), 3, null);
        Dialog dialog = new Dialog(N2(), xb.s.f60094a);
        dialog.setContentView(L3().u());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(xb.l.f59949v);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -2);
        }
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.Y0 = context instanceof i0 ? (i0) context : null;
    }

    @Override // hc.v
    public void z(String str) {
        ArrayList k10;
        jo.p.h(str, "comment");
        Bitmap z10 = R3().z();
        if (z10 != null) {
            boolean z11 = R3().J() != null;
            List<GroupShotViewer> G = R3().G();
            if (G != null) {
                ArrayList arrayList = new ArrayList(xn.t.u(G, 10));
                for (GroupShotViewer groupShotViewer : G) {
                    arrayList.add(groupShotViewer.getUser().getUserId());
                }
                k10 = arrayList;
            } else {
                k10 = xn.s.k();
            }
            z0 z0Var = this.X0;
            if (z0Var == null) {
                jo.p.v("groupShotStore");
                z0Var = null;
            }
            N3().h(Q3(), str, z10, z11, k10, z0Var.o().getValue().booleanValue());
        }
    }
}
