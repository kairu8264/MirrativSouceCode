package be;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.q0;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftSlot;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftType;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftUnityTextConfig;
import ha.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kq.a;
import yd.t1;

/* loaded from: classes2.dex */
public final class h5 extends androidx.fragment.app.e implements uo.q0 {
    public static final a Z0 = new a(null);

    /* renamed from: a1  reason: collision with root package name */
    public static final int f17873a1 = 8;
    public final /* synthetic */ da.j N0;
    public i5 O0;
    public i5 P0;
    public final wn.f Q0;
    public nf.k0 R0;
    public final wn.f S0;
    public final wn.f T0;
    public final wn.f U0;
    public final wn.f V0;
    public final wn.f W0;
    public final wn.f X0;
    public final wn.f Y0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final h5 a(String str, String str2, String str3) {
            jo.p.h(str, "referer");
            jo.p.h(str2, "giftText");
            jo.p.h(str3, "giftImageFileAbsolutePath");
            h5 h5Var = new h5();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_REFERER", str);
            bundle.putString("EXTRA_KEY_GIFT_TEXT", str2);
            bundle.putString("EXTRA_KEY_GIFT_IMAGE_FILE_ABSOLUTE_PATH", str3);
            bundle.putSerializable("EXTRA_KEY_GIFT_TYPE", UniqueEmomoGiftType.STAMP_GIFT);
            h5Var.V2(bundle);
            return h5Var;
        }

        public final h5 b(String str, String str2, String str3, String str4, List<UniqueEmomoGiftUnityTextConfig> list, String str5) {
            jo.p.h(str, "referer");
            jo.p.h(str2, "motionId");
            jo.p.h(str3, "presetId");
            jo.p.h(str4, "giftTitle");
            jo.p.h(list, "textConfigs");
            jo.p.h(str5, "giftImageFileAbsolutePath");
            h5 h5Var = new h5();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_REFERER", str);
            bundle.putString("EXTRA_KEY_GIFT_MOTION_ID", str2);
            bundle.putString("EXTRA_KEY_GIFT_PRESET_ID", str3);
            bundle.putString("EXTRA_KEY_GIFT_TEXT", str4);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            wn.v vVar = wn.v.f59242a;
            bundle.putSerializable("EXTRA_KEY_GIFT_TEXT_CONFIGS", arrayList);
            bundle.putString("EXTRA_KEY_GIFT_IMAGE_FILE_ABSOLUTE_PATH", str5);
            bundle.putSerializable("EXTRA_KEY_GIFT_TYPE", UniqueEmomoGiftType.RICH_GIFT);
            h5Var.V2(bundle);
            return h5Var;
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
            String string = h5.this.M2().getString("EXTRA_KEY_GIFT_IMAGE_FILE_ABSOLUTE_PATH");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<String> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = h5.this.M2().getString("EXTRA_KEY_GIFT_TEXT");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<UniqueEmomoGiftType> {
        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final UniqueEmomoGiftType invoke() {
            Serializable serializable = h5.this.M2().getSerializable("EXTRA_KEY_GIFT_TYPE");
            jo.p.f(serializable, "null cannot be cast to non-null type com.dena.mirrorman.net.api.response.UniqueEmomoGiftType");
            return (UniqueEmomoGiftType) serializable;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<String> {
        public e() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = h5.this.M2().getString("EXTRA_KEY_GIFT_MOTION_ID");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<wn.v> {
        public f() {
            super(0);
        }

        public final void a() {
            h5.this.O3().c(h5.this.U3());
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.dialog.UniqueEmomoGiftSlotsDialogFragment$observeStoreValues$3", f = "UniqueEmomoGiftSlotsDialogFragment.kt", l = {198}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f17879w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ ae.y4 f17881y;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<List<? extends UniqueEmomoGiftSlot>> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ae.y4 f17882w;

            public a(ae.y4 y4Var) {
                this.f17882w = y4Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(List<UniqueEmomoGiftSlot> list, ao.d<? super wn.v> dVar) {
                RecyclerView.h adapter = this.f17882w.G.getAdapter();
                jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrorman.adapter.StampGiftSlotAdapter");
                ((rd.a1) adapter).d(list);
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ae.y4 y4Var, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f17881y = y4Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f17881y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f17879w;
            if (i10 == 0) {
                wn.m.b(obj);
                nf.k0 k0Var = h5.this.R0;
                if (k0Var == null) {
                    jo.p.v("store");
                    k0Var = null;
                }
                xo.c<List<UniqueEmomoGiftSlot>> q10 = k0Var.q();
                a aVar = new a(this.f17881y);
                this.f17879w = 1;
                if (q10.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.dialog.UniqueEmomoGiftSlotsDialogFragment$observeStoreValues$4", f = "UniqueEmomoGiftSlotsDialogFragment.kt", l = {204}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f17883w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ h5 f17885w;

            public a(h5 h5Var) {
                this.f17885w = h5Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                String U0;
                t1.a aVar = yd.t1.f61795x;
                Context N2 = this.f17885w.N2();
                jo.p.g(N2, "requireContext()");
                if (this.f17885w.R3() == UniqueEmomoGiftType.STAMP_GIFT) {
                    U0 = this.f17885w.U0(nd.f1.text_unique_emomo_gift_done);
                } else {
                    U0 = this.f17885w.U0(nd.f1.text_unique_emomo_rich_gift_done);
                }
                jo.p.g(U0, "if (giftType == UniqueEm…ne)\n                    }");
                aVar.a(N2, U0);
                i5 i5Var = this.f17885w.P0;
                if (i5Var != null) {
                    i5Var.Y();
                }
                i5 i5Var2 = this.f17885w.O0;
                if (i5Var2 != null) {
                    i5Var2.Y();
                }
                this.f17885w.n3();
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
            int i10 = this.f17883w;
            if (i10 == 0) {
                wn.m.b(obj);
                nf.k0 k0Var = h5.this.R0;
                if (k0Var == null) {
                    jo.p.v("store");
                    k0Var = null;
                }
                xo.c<wn.v> o10 = k0Var.o();
                a aVar = new a(h5.this);
                this.f17883w = 1;
                if (o10.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.dialog.UniqueEmomoGiftSlotsDialogFragment$observeStoreValues$5", f = "UniqueEmomoGiftSlotsDialogFragment.kt", l = {220}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f17886w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ h5 f17888w;

            public a(h5 h5Var) {
                this.f17888w = h5Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                t1.a aVar = yd.t1.f61795x;
                Context N2 = this.f17888w.N2();
                jo.p.g(N2, "requireContext()");
                String U0 = this.f17888w.U0(nd.f1.text_unique_emomo_gift_save_failed);
                jo.p.g(U0, "getString(R.string.text_…e_emomo_gift_save_failed)");
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
            int i10 = this.f17886w;
            if (i10 == 0) {
                wn.m.b(obj);
                nf.k0 k0Var = h5.this.R0;
                if (k0Var == null) {
                    jo.p.v("store");
                    k0Var = null;
                }
                xo.c<MRError> n10 = k0Var.n();
                a aVar = new a(h5.this);
                this.f17886w = 1;
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

    @co.f(c = "com.dena.mirrorman.dialog.UniqueEmomoGiftSlotsDialogFragment$observeStoreValues$6", f = "UniqueEmomoGiftSlotsDialogFragment.kt", l = {226}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f17889w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ h5 f17891w;

            public a(h5 h5Var) {
                this.f17891w = h5Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                String U0;
                t1.a aVar = yd.t1.f61795x;
                Context N2 = this.f17891w.N2();
                jo.p.g(N2, "requireContext()");
                if (this.f17891w.R3() == UniqueEmomoGiftType.STAMP_GIFT) {
                    U0 = this.f17891w.U0(nd.f1.text_unique_emomo_gift_done);
                } else {
                    U0 = this.f17891w.U0(nd.f1.text_unique_emomo_rich_gift_done);
                }
                jo.p.g(U0, "if (giftType == UniqueEm…ne)\n                    }");
                aVar.a(N2, U0);
                i5 i5Var = this.f17891w.P0;
                if (i5Var != null) {
                    i5Var.Y();
                }
                i5 i5Var2 = this.f17891w.O0;
                if (i5Var2 != null) {
                    i5Var2.Y();
                }
                this.f17891w.n3();
                return wn.v.f59242a;
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
            int i10 = this.f17889w;
            if (i10 == 0) {
                wn.m.b(obj);
                nf.k0 k0Var = h5.this.R0;
                if (k0Var == null) {
                    jo.p.v("store");
                    k0Var = null;
                }
                xo.c<wn.v> m10 = k0Var.m();
                a aVar = new a(h5.this);
                this.f17889w = 1;
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

    @co.f(c = "com.dena.mirrorman.dialog.UniqueEmomoGiftSlotsDialogFragment$observeStoreValues$7", f = "UniqueEmomoGiftSlotsDialogFragment.kt", l = {242}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f17892w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ h5 f17894w;

            public a(h5 h5Var) {
                this.f17894w = h5Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                t1.a aVar = yd.t1.f61795x;
                Context N2 = this.f17894w.N2();
                jo.p.g(N2, "requireContext()");
                String U0 = this.f17894w.U0(nd.f1.text_unique_emomo_gift_save_failed);
                jo.p.g(U0, "getString(R.string.text_…e_emomo_gift_save_failed)");
                aVar.a(N2, U0);
                return wn.v.f59242a;
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
            int i10 = this.f17892w;
            if (i10 == 0) {
                wn.m.b(obj);
                nf.k0 k0Var = h5.this.R0;
                if (k0Var == null) {
                    jo.p.v("store");
                    k0Var = null;
                }
                xo.c<MRError> l10 = k0Var.l();
                a aVar = new a(h5.this);
                this.f17892w = 1;
                if (l10.a(aVar, this) == c10) {
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
    public static final class l extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f17895w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Fragment fragment) {
            super(0);
            this.f17895w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f17895w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17896w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(io.a aVar) {
            super(0);
            this.f17896w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f17896w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17897w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17898x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17899y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f17900z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f17897w = aVar;
            this.f17898x = aVar2;
            this.f17899y = aVar3;
            this.f17900z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f17897w;
            vq.a aVar2 = this.f17898x;
            io.a aVar3 = this.f17899y;
            xq.a aVar4 = this.f17900z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.k0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17901w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(io.a aVar) {
            super(0);
            this.f17901w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f17901w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.l<UniqueEmomoGiftSlot, wn.v> {
        public p() {
            super(1);
        }

        public final void a(UniqueEmomoGiftSlot uniqueEmomoGiftSlot) {
            jo.p.h(uniqueEmomoGiftSlot, "it");
            if (uniqueEmomoGiftSlot.isEmpty()) {
                if (h5.this.R3() == UniqueEmomoGiftType.STAMP_GIFT) {
                    h5.this.O3().f(uniqueEmomoGiftSlot.getSlotId(), h5.this.P3(), h5.this.Q3());
                    return;
                } else {
                    h5.this.O3().e(uniqueEmomoGiftSlot.getSlotId(), h5.this.S3(), h5.this.T3(), h5.this.Q3(), h5.this.V3(), h5.this.P3());
                    return;
                }
            }
            q0.a aVar = q0.O0;
            h5 h5Var = h5.this;
            String V0 = h5Var.V0(nd.f1.text_unique_emomo_gift_slot_override_alert, h5Var.V0(nd.f1.text_unique_emomo_gift_slot_name, String.valueOf(uniqueEmomoGiftSlot.getSlotId())));
            jo.p.g(V0, "getString(R.string.text_…e, it.slotId.toString()))");
            String U0 = h5.this.U0(nd.f1.text_unique_emomo_gift_slot_override_confirmation);
            jo.p.g(U0, "getString(R.string.text_…ot_override_confirmation)");
            aVar.a(V0, U0).z3(h5.this.p0(), String.valueOf(uniqueEmomoGiftSlot.getSlotId()));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(UniqueEmomoGiftSlot uniqueEmomoGiftSlot) {
            a(uniqueEmomoGiftSlot);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.a<String> {
        public q() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = h5.this.M2().getString("EXTRA_KEY_GIFT_PRESET_ID");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.a<String> {
        public r() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = h5.this.M2().getString("EXTRA_KEY_REFERER");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends jo.q implements io.l<View, wn.v> {
        public s() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            h5.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends jo.q implements io.a<od.o0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17906w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17907x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17908y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17906w = componentCallbacks;
            this.f17907x = aVar;
            this.f17908y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.o0, java.lang.Object] */
        @Override // io.a
        public final od.o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f17906w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.o0.class), this.f17907x, this.f17908y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends jo.q implements io.a<List<? extends UniqueEmomoGiftUnityTextConfig>> {
        public u() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final List<UniqueEmomoGiftUnityTextConfig> invoke() {
            Serializable serializable = h5.this.M2().getSerializable("EXTRA_KEY_GIFT_TEXT_CONFIGS");
            jo.p.f(serializable, "null cannot be cast to non-null type kotlin.collections.List<com.dena.mirrorman.net.api.response.UniqueEmomoGiftUnityTextConfig>");
            return (List) serializable;
        }
    }

    public h5() {
        super(nd.b1.dialog_fragment_unique_emomo_gift_slots);
        this.N0 = new da.j();
        this.Q0 = wn.g.b(wn.i.SYNCHRONIZED, new t(this, null, null));
        this.S0 = wn.g.a(new r());
        this.T0 = wn.g.a(new e());
        this.U0 = wn.g.a(new q());
        this.V0 = wn.g.a(new c());
        this.W0 = wn.g.a(new u());
        this.X0 = wn.g.a(new b());
        this.Y0 = wn.g.a(new d());
    }

    public static final void X3(ae.y4 y4Var, h5 h5Var, ha.a aVar) {
        jo.p.h(y4Var, "$binding");
        jo.p.h(h5Var, "this$0");
        if (aVar instanceof a.b) {
            y4Var.H.b(StatusView.b.C0181b.f20790w);
        } else if (aVar instanceof a.C0439a) {
            StatusView statusView = y4Var.H;
            String message = ((a.C0439a) aVar).b().getMessage();
            if (message == null) {
                message = h5Var.U0(nd.f1.f41966c);
                jo.p.g(message, "getString(R.string.error_access)");
            }
            statusView.b(new StatusView.b.a(message, new f()));
        } else {
            y4Var.H.b(StatusView.b.c.f20791w);
        }
    }

    public static final void Y3(ae.y4 y4Var, Bitmap bitmap) {
        jo.p.h(y4Var, "$binding");
        y4Var.B.setImageBitmap(bitmap);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void A1(Bundle bundle) {
        super.A1(bundle);
        l lVar = new l(this);
        xq.a a10 = gq.a.a(this);
        m mVar = new m(lVar);
        this.R0 = (nf.k0) ((androidx.lifecycle.q0) androidx.fragment.app.e0.a(this, jo.f0.b(nf.k0.class), new o(mVar), new n(lVar, null, null, a10)).getValue());
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.P0 = null;
        this.O0 = null;
        uo.r0.d(this, null, 1, null);
        dq.c.c().r(this);
        super.I1();
    }

    public final od.o0 O3() {
        return (od.o0) this.Q0.getValue();
    }

    public final String P3() {
        return (String) this.X0.getValue();
    }

    public final String Q3() {
        return (String) this.V0.getValue();
    }

    public final UniqueEmomoGiftType R3() {
        return (UniqueEmomoGiftType) this.Y0.getValue();
    }

    public final String S3() {
        return (String) this.T0.getValue();
    }

    public final String T3() {
        return (String) this.U0.getValue();
    }

    public final String U3() {
        return (String) this.S0.getValue();
    }

    public final List<UniqueEmomoGiftUnityTextConfig> V3() {
        return (List) this.W0.getValue();
    }

    public final void W3(final ae.y4 y4Var) {
        nf.k0 k0Var = this.R0;
        if (k0Var == null) {
            jo.p.v("store");
            k0Var = null;
        }
        k0Var.r().i(a1(), new androidx.lifecycle.f0() { // from class: be.g5
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                h5.X3(ae.y4.this, this, (ha.a) obj);
            }
        });
        nf.k0 k0Var2 = this.R0;
        if (k0Var2 == null) {
            jo.p.v("store");
            k0Var2 = null;
        }
        k0Var2.k().i(a1(), new androidx.lifecycle.f0() { // from class: be.f5
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                h5.Y3(ae.y4.this, (Bitmap) obj);
            }
        });
        uo.l.d(this, null, null, new g(y4Var, null), 3, null);
        uo.l.d(this, null, null, new h(null), 3, null);
        uo.l.d(this, null, null, new i(null), 3, null);
        uo.l.d(this, null, null, new j(null), 3, null);
        uo.l.d(this, null, null, new k(null), 3, null);
    }

    public final void Z3(ae.y4 y4Var) {
        ImageView imageView = y4Var.E;
        jo.p.g(imageView, "binding.closeImageView");
        yd.g1.a(imageView, new s());
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        String U0;
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        ae.y4 T = ae.y4.T(view);
        TextView textView = T.I;
        int i10 = nd.f1.text_unique_emomo_gift_save_message;
        Object[] objArr = new Object[1];
        UniqueEmomoGiftType R3 = R3();
        UniqueEmomoGiftType uniqueEmomoGiftType = UniqueEmomoGiftType.STAMP_GIFT;
        if (R3 == uniqueEmomoGiftType) {
            U0 = U0(nd.f1.text_unique_emomo_gift_stamp_gift);
        } else {
            U0 = U0(nd.f1.text_unique_emomo_gift_rich_gift);
        }
        objArr[0] = U0;
        textView.setText(V0(i10, objArr));
        T.F.setVisibility(R3() != uniqueEmomoGiftType ? 8 : 0);
        T.G.setLayoutManager(new GridLayoutManager(N2(), 2));
        T.G.g(new p001if.c(de.e.b(this, 16), 0, 0, 0, 0, 0, 32, null));
        RecyclerView recyclerView = T.G;
        rd.a1 a1Var = new rd.a1();
        a1Var.j(new p());
        recyclerView.setAdapter(a1Var);
        jo.p.g(T, "binding");
        Z3(T);
        W3(T);
        O3().d(P3());
        O3().c(U3());
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @dq.l
    public final void on(s0 s0Var) {
        jo.p.h(s0Var, "event");
        nf.k0 k0Var = this.R0;
        Object obj = null;
        if (k0Var == null) {
            jo.p.v("store");
            k0Var = null;
        }
        Iterator<T> it = k0Var.p().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (jo.p.c(String.valueOf(((UniqueEmomoGiftSlot) next).getSlotId()), s0Var.a())) {
                obj = next;
                break;
            }
        }
        UniqueEmomoGiftSlot uniqueEmomoGiftSlot = (UniqueEmomoGiftSlot) obj;
        if (uniqueEmomoGiftSlot != null) {
            if (R3() == UniqueEmomoGiftType.STAMP_GIFT) {
                O3().f(uniqueEmomoGiftSlot.getSlotId(), P3(), Q3());
            } else {
                O3().e(uniqueEmomoGiftSlot.getSlotId(), S3(), T3(), Q3(), V3(), P3());
            }
        }
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), nd.g1.f42004a);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        dq.c.c().p(this);
        this.P0 = context instanceof i5 ? (i5) context : null;
        Fragment H0 = H0();
        this.O0 = H0 instanceof i5 ? (i5) H0 : null;
    }
}
