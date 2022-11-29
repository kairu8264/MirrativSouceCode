package me;

import ae.g5;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.recyclerview.widget.RecyclerView;
import be.h5;
import be.i5;
import be.j0;
import be.k0;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.feature.player.EditTextWithOnKeyPreImeListener;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.unity.UnityScreenshot;
import java.io.File;
import java.io.Serializable;
import java.text.BreakIterator;
import java.util.List;
import jf.v0;
import jo.f0;
import kq.a;
import nd.b1;
import nd.f1;
import nd.i1;
import nf.n0;
import o3.c0;
import o3.p0;
import od.r0;
import sn.b;
import ud.a4;
import ud.z3;
import uo.q0;
import yd.g1;
import yd.t1;

/* loaded from: classes2.dex */
public final class w extends androidx.fragment.app.e implements i5, k0, q0 {
    public static final a X0 = new a(null);
    public static final int Y0 = 8;
    public final /* synthetic */ da.j N0;
    public final wn.f O0;
    public final wn.f P0;
    public final wn.f Q0;
    public n0 R0;
    public final wn.f S0;
    public final wn.f T0;
    public final wn.f U0;
    public final wn.f V0;
    public me.x W0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final w a(String str, v0 v0Var) {
            jo.p.h(str, "referer");
            jo.p.h(v0Var, "uniqueEmomoGiftCreationInfo");
            w wVar = new w();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_REFERER", str);
            bundle.putSerializable("EXTRA_KEY_UNIQUE_EMOMO_GIFT_CREATION_INFO", v0Var);
            wVar.V2(bundle);
            return wVar;
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f41072a;

        static {
            int[] iArr = new int[a4.a.values().length];
            iArr[a4.a.TOP.ordinal()] = 1;
            iArr[a4.a.LEFT.ordinal()] = 2;
            iArr[a4.a.RIGHT.ordinal()] = 3;
            iArr[a4.a.BOTTOM.ordinal()] = 4;
            f41072a = iArr;
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.emomo.uniquegift.UniqueEmomoStampGiftCreationDialogFragment$observeStoreValues$5", f = "UniqueEmomoStampGiftCreationDialogFragment.kt", l = {264}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f41073w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ g5 f41075y;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<File> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ w f41076w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ g5 f41077x;

            public a(w wVar, g5 g5Var) {
                this.f41076w = wVar;
                this.f41077x = g5Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(File file, ao.d<? super wn.v> dVar) {
                h5.a aVar = h5.Z0;
                String W3 = this.f41076w.W3();
                String valueOf = String.valueOf(this.f41077x.M.getText());
                String absolutePath = file.getAbsolutePath();
                jo.p.g(absolutePath, "stampImageFile.absolutePath");
                aVar.a(W3, valueOf, absolutePath).z3(this.f41076w.p0(), "UniqueEmomoGiftSlotsDialogFragment");
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g5 g5Var, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f41075y = g5Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f41075y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f41073w;
            if (i10 == 0) {
                wn.m.b(obj);
                n0 n0Var = w.this.R0;
                if (n0Var == null) {
                    jo.p.v("store");
                    n0Var = null;
                }
                xo.c<File> n10 = n0Var.n();
                a aVar = new a(w.this, this.f41075y);
                this.f41073w = 1;
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

    @co.f(c = "com.dena.mirrorman.feature.emomo.uniquegift.UniqueEmomoStampGiftCreationDialogFragment$observeStoreValues$6", f = "UniqueEmomoStampGiftCreationDialogFragment.kt", l = {274}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f41078w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ w f41080w;

            public a(w wVar) {
                this.f41080w = wVar;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                t1.a aVar = t1.f61795x;
                Context N2 = this.f41080w.N2();
                jo.p.g(N2, "requireContext()");
                String message = mRError.getMessage();
                if (message == null) {
                    message = this.f41080w.U0(f1.f41966c);
                    jo.p.g(message, "getString(R.string.error_access)");
                }
                aVar.a(N2, message);
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
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f41078w;
            if (i10 == 0) {
                wn.m.b(obj);
                n0 n0Var = w.this.R0;
                if (n0Var == null) {
                    jo.p.v("store");
                    n0Var = null;
                }
                xo.c<MRError> m10 = n0Var.m();
                a aVar = new a(w.this);
                this.f41078w = 1;
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

    @co.f(c = "com.dena.mirrorman.feature.emomo.uniquegift.UniqueEmomoStampGiftCreationDialogFragment$observeStoreValues$7", f = "UniqueEmomoStampGiftCreationDialogFragment.kt", l = {280}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f41081w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ g5 f41083y;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<String> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ g5 f41084w;

            public a(g5 g5Var) {
                this.f41084w = g5Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(String str, ao.d<? super wn.v> dVar) {
                this.f41084w.M.setText(str);
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(g5 g5Var, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f41083y = g5Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f41083y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f41081w;
            if (i10 == 0) {
                wn.m.b(obj);
                n0 n0Var = w.this.R0;
                if (n0Var == null) {
                    jo.p.v("store");
                    n0Var = null;
                }
                xo.c<String> k10 = n0Var.k();
                a aVar = new a(this.f41083y);
                this.f41081w = 1;
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

    @co.f(c = "com.dena.mirrorman.feature.emomo.uniquegift.UniqueEmomoStampGiftCreationDialogFragment$observeStoreValues$8", f = "UniqueEmomoStampGiftCreationDialogFragment.kt", l = {286}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f41085w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ g5 f41087y;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ g5 f41088w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ w f41089x;

            public a(g5 g5Var, w wVar) {
                this.f41088w = g5Var;
                this.f41089x = wVar;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                this.f41088w.M.setText("");
                t1.a aVar = t1.f61795x;
                Context N2 = this.f41089x.N2();
                jo.p.g(N2, "requireContext()");
                String message = mRError.getMessage();
                if (message == null) {
                    message = this.f41089x.U0(f1.text_unique_emomo_sanitize_failure_message);
                    jo.p.g(message, "getString(R.string.text_…sanitize_failure_message)");
                }
                aVar.a(N2, message);
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(g5 g5Var, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f41087y = g5Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f41087y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f41085w;
            if (i10 == 0) {
                wn.m.b(obj);
                n0 n0Var = w.this.R0;
                if (n0Var == null) {
                    jo.p.v("store");
                    n0Var = null;
                }
                xo.c<MRError> j10 = n0Var.j();
                a aVar = new a(this.f41087y, w.this);
                this.f41085w = 1;
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

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f41090w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f41090w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f41090w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f41091w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(io.a aVar) {
            super(0);
            this.f41091w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f41091w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f41092w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f41093x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f41094y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f41095z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f41092w = aVar;
            this.f41093x = aVar2;
            this.f41094y = aVar3;
            this.f41095z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f41092w;
            vq.a aVar2 = this.f41093x;
            io.a aVar3 = this.f41094y;
            xq.a aVar4 = this.f41095z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(n0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f41096w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(io.a aVar) {
            super(0);
            this.f41096w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((androidx.lifecycle.v0) this.f41096w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<String> {
        public k() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = w.this.M2().getString("EXTRA_KEY_REFERER");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l implements TextWatcher {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ g5 f41099x;

        public l(g5 g5Var) {
            this.f41099x = g5Var;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            w.this.g4(this.f41099x);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ g5 f41101x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(g5 g5Var) {
            super(1);
            this.f41101x = g5Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            w.this.p4(String.valueOf(this.f41101x.M.getText()));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ g5 f41103x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(g5 g5Var) {
            super(1);
            this.f41103x = g5Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            w.this.T3().e(w.this.S3(this.f41103x));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.p<Integer, KeyEvent, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ g5 f41105x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(g5 g5Var) {
            super(2);
            this.f41105x = g5Var;
        }

        public final void a(int i10, KeyEvent keyEvent) {
            jo.p.h(keyEvent, "event");
            if (i10 == 4 && keyEvent.getAction() == 1) {
                w.this.h4(this.f41105x);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num, KeyEvent keyEvent) {
            a(num.intValue(), keyEvent);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.l<a4, wn.v> {
        public p() {
            super(1);
        }

        public final void a(a4 a4Var) {
            jo.p.h(a4Var, "it");
            w.this.T3().h(a4Var);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(a4 a4Var) {
            a(a4Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.l<z3, wn.v> {
        public q() {
            super(1);
        }

        public final void a(z3 z3Var) {
            jo.p.h(z3Var, "it");
            w.this.T3().g(z3Var);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(z3 z3Var) {
            a(z3Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ g5 f41109x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(g5 g5Var) {
            super(1);
            this.f41109x = g5Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            w.this.i4(this.f41109x);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends jo.q implements io.a<r0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f41110w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f41111x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f41112y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f41110w = componentCallbacks;
            this.f41111x = aVar;
            this.f41112y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.r0] */
        @Override // io.a
        public final r0 invoke() {
            ComponentCallbacks componentCallbacks = this.f41110w;
            return gq.a.a(componentCallbacks).c(f0.b(r0.class), this.f41111x, this.f41112y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f41113w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f41114x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f41115y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f41113w = componentCallbacks;
            this.f41114x = aVar;
            this.f41115y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f41113w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f41114x, this.f41115y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends jo.q implements io.a<kf.x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f41116w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f41117x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f41118y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f41116w = componentCallbacks;
            this.f41117x = aVar;
            this.f41118y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final kf.x invoke() {
            ComponentCallbacks componentCallbacks = this.f41116w;
            return gq.a.a(componentCallbacks).c(f0.b(kf.x.class), this.f41117x, this.f41118y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class v extends jo.q implements io.a<kf.m> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f41119w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f41120x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f41121y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f41119w = componentCallbacks;
            this.f41120x = aVar;
            this.f41121y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.m, java.lang.Object] */
        @Override // io.a
        public final kf.m invoke() {
            ComponentCallbacks componentCallbacks = this.f41119w;
            return gq.a.a(componentCallbacks).c(f0.b(kf.m.class), this.f41120x, this.f41121y);
        }
    }

    /* renamed from: me.w$w  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0604w extends jo.q implements io.a<i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f41122w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f41123x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f41124y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0604w(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f41122w = componentCallbacks;
            this.f41123x = aVar;
            this.f41124y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f41122w;
            return gq.a.a(componentCallbacks).c(f0.b(i1.class), this.f41123x, this.f41124y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class x extends jo.q implements io.a<v0> {
        public x() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            Serializable serializable = w.this.M2().getSerializable("EXTRA_KEY_UNIQUE_EMOMO_GIFT_CREATION_INFO");
            jo.p.f(serializable, "null cannot be cast to non-null type com.dena.mirrorman.model.UniqueEmomoStampGiftCreationInfo");
            return (v0) serializable;
        }
    }

    public w() {
        super(b1.dialog_fragment_unique_emomo_stamp_gift_creation);
        this.N0 = new da.j();
        this.O0 = wn.g.a(new k());
        this.P0 = wn.g.a(new x());
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.Q0 = wn.g.b(iVar, new s(this, null, null));
        this.S0 = wn.g.b(iVar, new t(this, null, null));
        this.T0 = wn.g.b(iVar, new u(this, null, null));
        this.U0 = wn.g.b(iVar, new v(this, null, null));
        this.V0 = wn.g.b(iVar, new C0604w(this, null, null));
    }

    public static final void c4(g5 g5Var, Boolean bool) {
        jo.p.h(g5Var, "$binding");
        g5Var.L.setEnabled(!bool.booleanValue());
        g5Var.G.setEnabled(!bool.booleanValue());
    }

    public static final void d4(g5 g5Var, List list) {
        jo.p.h(g5Var, "$binding");
        RecyclerView.h adapter = g5Var.J.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrorman.feature.emomo.uniquegift.UniqueEmomoStampGiftCreationPaletteAdapter");
        ((y) adapter).d(list);
    }

    public static final void e4(g5 g5Var, z3 z3Var) {
        jo.p.h(g5Var, "$binding");
        if (z3Var == null) {
            return;
        }
        g5Var.P.setTextColor(z3Var.b());
        g5Var.P.setOutlineColor(z3Var.c());
        g5Var.I.setTextColor(z3Var.b());
        g5Var.I.setOutlineColor(z3Var.c());
        g5Var.K.setTextColor(z3Var.b());
        g5Var.K.setOutlineColor(z3Var.c());
        g5Var.E.setTextColor(z3Var.b());
        g5Var.E.setOutlineColor(z3Var.c());
    }

    public static final void f4(g5 g5Var, a4 a4Var) {
        jo.p.h(g5Var, "$binding");
        int i10 = b.f41072a[a4Var.b().ordinal()];
        if (i10 == 1) {
            g5Var.P.setVisibility(0);
            g5Var.I.setVisibility(4);
            g5Var.K.setVisibility(4);
            g5Var.E.setVisibility(4);
        } else if (i10 == 2) {
            g5Var.P.setVisibility(4);
            g5Var.I.setVisibility(0);
            g5Var.K.setVisibility(4);
            g5Var.E.setVisibility(4);
        } else if (i10 == 3) {
            g5Var.P.setVisibility(4);
            g5Var.I.setVisibility(4);
            g5Var.K.setVisibility(0);
            g5Var.E.setVisibility(4);
        } else if (i10 != 4) {
        } else {
            g5Var.P.setVisibility(4);
            g5Var.I.setVisibility(4);
            g5Var.K.setVisibility(4);
            g5Var.E.setVisibility(0);
        }
    }

    public static final boolean j4(g5 g5Var, w wVar, DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        jo.p.h(wVar, "this$0");
        if (keyEvent.getAction() == 1 && i10 == 4 && g5Var.Q.getVisibility() == 8) {
            wVar.p4(String.valueOf(g5Var.M.getText()));
            return true;
        }
        return false;
    }

    public static final p0 l4(g5 g5Var, View view, p0 p0Var) {
        jo.p.h(g5Var, "$binding");
        if (p0Var.q(p0.m.c())) {
            g5Var.R.setVisibility(8);
            g5Var.Q.setVisibility(0);
        } else {
            g5Var.R.setVisibility(0);
            g5Var.Q.setVisibility(8);
            g5Var.M.clearFocus();
        }
        return p0Var;
    }

    public static final boolean n4(w wVar, g5 g5Var, TextView textView, int i10, KeyEvent keyEvent) {
        jo.p.h(wVar, "this$0");
        jo.p.h(g5Var, "$binding");
        if (i10 == 6) {
            wVar.h4(g5Var);
            return true;
        }
        return false;
    }

    public static final void o4(w wVar, g5 g5Var, View view, boolean z10) {
        jo.p.h(wVar, "this$0");
        jo.p.h(g5Var, "$binding");
        if (z10) {
            return;
        }
        wVar.h4(g5Var);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void A1(Bundle bundle) {
        super.A1(bundle);
        g gVar = new g(this);
        xq.a a10 = gq.a.a(this);
        h hVar = new h(gVar);
        this.R0 = (n0) ((androidx.lifecycle.q0) e0.a(this, f0.b(n0.class), new j(hVar), new i(gVar, null, null, a10)).getValue());
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.W0 = null;
        uo.r0.d(this, null, 1, null);
        super.I1();
    }

    public final void R3() {
        of.j.f45405a.c(N2(), Z0());
        n3();
    }

    public final Bitmap S3(g5 g5Var) {
        Bitmap createBitmap = Bitmap.createBitmap(g5Var.B.getWidth(), g5Var.B.getHeight(), Bitmap.Config.ARGB_8888);
        g5Var.N.draw(new Canvas(createBitmap));
        jo.p.g(createBitmap, "stampImageBitmap");
        return createBitmap;
    }

    public final r0 T3() {
        return (r0) this.Q0.getValue();
    }

    public final kf.m U3() {
        return (kf.m) this.U0.getValue();
    }

    @Override // be.k0
    public void V(String str) {
        jo.p.h(str, "key");
        R3();
    }

    public final MRLogger V3() {
        return (MRLogger) this.S0.getValue();
    }

    public final String W3() {
        return (String) this.O0.getValue();
    }

    public final i1 X3() {
        return (i1) this.V0.getValue();
    }

    @Override // be.i5
    public void Y() {
        me.x xVar = this.W0;
        if (xVar != null) {
            xVar.v();
        }
        n3();
    }

    public final v0 Y3() {
        return (v0) this.P0.getValue();
    }

    public final Bitmap Z3(UnityScreenshot unityScreenshot) {
        Bitmap decodeFile = BitmapFactory.decodeFile(unityScreenshot.getImagePath());
        int faceSize = (int) (unityScreenshot.getFaceSize() * 3.2f);
        int faceSize2 = (int) (unityScreenshot.getFaceSize() * 3.2f);
        Bitmap createBitmap = Bitmap.createBitmap(faceSize, faceSize2, Bitmap.Config.ARGB_8888);
        int facePositionCenterX = (int) (unityScreenshot.getFacePositionCenterX() - (faceSize / 2.0f));
        int facePositionCenterY = (int) (unityScreenshot.getFacePositionCenterY() - (unityScreenshot.getFaceSize() * 1.1f));
        if (facePositionCenterY + faceSize2 > unityScreenshot.getPixelHeight()) {
            facePositionCenterY = unityScreenshot.getPixelHeight() - faceSize2;
        }
        new Canvas(createBitmap).drawBitmap(decodeFile, new Rect(facePositionCenterX, facePositionCenterY, facePositionCenterX + faceSize, facePositionCenterY + faceSize2), new Rect(0, 0, faceSize, faceSize2), (Paint) null);
        jo.p.g(createBitmap, "image");
        return createBitmap;
    }

    public final kf.x a4() {
        return (kf.x) this.T0.getValue();
    }

    public final void b4(final g5 g5Var) {
        n0 n0Var = this.R0;
        if (n0Var == null) {
            jo.p.v("store");
            n0Var = null;
        }
        n0Var.l().i(a1(), new androidx.lifecycle.f0() { // from class: me.u
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                w.d4(g5.this, (List) obj);
            }
        });
        n0 n0Var2 = this.R0;
        if (n0Var2 == null) {
            jo.p.v("store");
            n0Var2 = null;
        }
        n0Var2.o().i(a1(), new androidx.lifecycle.f0() { // from class: me.r
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                w.e4(g5.this, (z3) obj);
            }
        });
        n0 n0Var3 = this.R0;
        if (n0Var3 == null) {
            jo.p.v("store");
            n0Var3 = null;
        }
        n0Var3.p().i(a1(), new androidx.lifecycle.f0() { // from class: me.s
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                w.f4(g5.this, (a4) obj);
            }
        });
        n0 n0Var4 = this.R0;
        if (n0Var4 == null) {
            jo.p.v("store");
            n0Var4 = null;
        }
        n0Var4.q().i(a1(), new androidx.lifecycle.f0() { // from class: me.t
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                w.c4(g5.this, (Boolean) obj);
            }
        });
        uo.l.d(this, null, null, new c(g5Var, null), 3, null);
        uo.l.d(this, null, null, new d(null), 3, null);
        uo.l.d(this, null, null, new e(g5Var, null), 3, null);
        uo.l.d(this, null, null, new f(g5Var, null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        MRLogger V3 = V3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_MY_GIFT_CREATION_SIMPLE_TAB_IMP);
        if (X3().a().d()) {
            builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, U3().b()), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, a4().T4())));
        }
        V3.sendLog(builder.build());
        final g5 T = g5.T(view);
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        Dialog p33 = p3();
        if (p33 != null) {
            p33.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: me.o
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                    boolean j42;
                    j42 = w.j4(g5.this, this, dialogInterface, i10, keyEvent);
                    return j42;
                }
            });
        }
        GlideApp.with(N2()).load(Z3(Y3().b())).apply((e8.a<?>) e8.h.bitmapTransform(new m7.f(new sn.b(de.e.b(this, 300), de.e.b(this, 300), b.EnumC0806b.TOP), new sn.c(de.e.b(this, 4), 0)))).into(T.B);
        T.J.setAdapter(new y());
        T.J.setItemAnimator(null);
        jo.p.g(T, "binding");
        m4(T);
        b4(T);
        k4(T);
        T3().f(Y3().a());
    }

    public final void g4(g5 g5Var) {
        String valueOf = String.valueOf(g5Var.M.getText());
        String y10 = so.n.y(valueOf, "\n", "", false, 4, null);
        g5Var.P.setText(y10);
        g5Var.E.setText(y10);
        StringBuilder sb2 = new StringBuilder();
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(valueOf);
        int first = characterInstance.first();
        while (characterInstance.next() != -1) {
            int current = characterInstance.current();
            StringBuilder sb3 = new StringBuilder();
            String substring = valueOf.substring(first, current);
            jo.p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb3.append(substring);
            sb3.append('\n');
            sb2.append(sb3.toString());
            first = current;
        }
        String sb4 = sb2.toString();
        jo.p.g(sb4, "textVerticalBuilder.toString()");
        g5Var.I.setText(sb4);
        g5Var.K.setText(sb4);
        switch (de.l.a(valueOf)) {
            case 0:
            case 1:
            case 2:
            case 3:
                g5Var.I.setTextSize(1, 64.0f);
                g5Var.K.setTextSize(1, 64.0f);
                g5Var.I.setLineSpacing(0.0f, 1.0f);
                g5Var.K.setLineSpacing(0.0f, 1.0f);
                break;
            case 4:
                g5Var.I.setTextSize(1, 50.0f);
                g5Var.K.setTextSize(1, 50.0f);
                g5Var.I.setLineSpacing(0.0f, 1.0f);
                g5Var.K.setLineSpacing(0.0f, 1.0f);
                break;
            case 5:
                g5Var.I.setTextSize(1, 42.0f);
                g5Var.K.setTextSize(1, 42.0f);
                g5Var.I.setLineSpacing(0.0f, 0.95f);
                g5Var.K.setLineSpacing(0.0f, 0.95f);
                break;
            case 6:
                g5Var.I.setTextSize(1, 36.0f);
                g5Var.K.setTextSize(1, 36.0f);
                g5Var.I.setLineSpacing(0.0f, 0.9f);
                g5Var.K.setLineSpacing(0.0f, 0.9f);
                break;
            case 7:
                g5Var.I.setTextSize(1, 32.0f);
                g5Var.K.setTextSize(1, 32.0f);
                g5Var.I.setLineSpacing(0.0f, 0.85f);
                g5Var.K.setLineSpacing(0.0f, 0.85f);
                break;
            default:
                g5Var.I.setTextSize(1, 30.0f);
                g5Var.K.setTextSize(1, 30.0f);
                g5Var.I.setLineSpacing(0.0f, 0.8f);
                g5Var.K.setLineSpacing(0.0f, 0.8f);
                break;
        }
        switch (de.l.a(valueOf)) {
            case 0:
            case 1:
            case 2:
            case 3:
                g5Var.P.setTextSize(1, 68.0f);
                g5Var.E.setTextSize(1, 68.0f);
                return;
            case 4:
                g5Var.P.setTextSize(1, 56.0f);
                g5Var.E.setTextSize(1, 56.0f);
                return;
            case 5:
                g5Var.P.setTextSize(1, 44.0f);
                g5Var.E.setTextSize(1, 44.0f);
                return;
            case 6:
                g5Var.P.setTextSize(1, 37.0f);
                g5Var.E.setTextSize(1, 37.0f);
                return;
            case 7:
                g5Var.P.setTextSize(1, 32.0f);
                g5Var.E.setTextSize(1, 32.0f);
                return;
            default:
                g5Var.P.setTextSize(1, 28.0f);
                g5Var.E.setTextSize(1, 28.0f);
                return;
        }
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    public final void h4(g5 g5Var) {
        String valueOf = String.valueOf(g5Var.M.getText());
        if (valueOf.length() > 0) {
            T3().d(W3(), valueOf);
        }
        of.j.f45405a.c(N2(), g5Var.M);
    }

    public final void i4(g5 g5Var) {
        g5Var.M.setVisibility(0);
        g5Var.M.requestFocus();
        EditTextWithOnKeyPreImeListener editTextWithOnKeyPreImeListener = g5Var.M;
        Editable text = editTextWithOnKeyPreImeListener.getText();
        editTextWithOnKeyPreImeListener.setSelection(text != null ? text.length() : 0);
        of.j.f45405a.d(N2(), g5Var.M, 100);
    }

    public final void k4(final g5 g5Var) {
        Window window;
        View decorView;
        Dialog p32 = p3();
        if (p32 == null || (window = p32.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        c0.F0(decorView, new o3.v() { // from class: me.v
            @Override // o3.v
            public final p0 a(View view, p0 p0Var) {
                p0 l42;
                l42 = w.l4(g5.this, view, p0Var);
                return l42;
            }
        });
    }

    public final void m4(final g5 g5Var) {
        AppCompatImageView appCompatImageView = g5Var.F;
        jo.p.g(appCompatImageView, "binding.closeButton");
        g1.a(appCompatImageView, new m(g5Var));
        RoundedButtonView roundedButtonView = g5Var.L;
        jo.p.g(roundedButtonView, "binding.saveButton");
        g1.a(roundedButtonView, new n(g5Var));
        g5Var.M.setFilters(new InputFilter[]{new sf.b(8)});
        EditTextWithOnKeyPreImeListener editTextWithOnKeyPreImeListener = g5Var.M;
        jo.p.g(editTextWithOnKeyPreImeListener, "binding.stampCommentEditText");
        editTextWithOnKeyPreImeListener.addTextChangedListener(new l(g5Var));
        EditTextWithOnKeyPreImeListener editTextWithOnKeyPreImeListener2 = g5Var.M;
        editTextWithOnKeyPreImeListener2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: me.q
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                boolean n42;
                n42 = w.n4(w.this, g5Var, textView, i10, keyEvent);
                return n42;
            }
        });
        editTextWithOnKeyPreImeListener2.setOnKeyPreImeListener(new o(g5Var));
        editTextWithOnKeyPreImeListener2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: me.p
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                w.o4(w.this, g5Var, view, z10);
            }
        });
        RecyclerView.h adapter = g5Var.J.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrorman.feature.emomo.uniquegift.UniqueEmomoStampGiftCreationPaletteAdapter");
        y yVar = (y) adapter;
        yVar.h(new p());
        yVar.g(new q());
        RoundedButtonView roundedButtonView2 = g5Var.G;
        jo.p.g(roundedButtonView2, "binding.inputTextButton");
        g1.a(roundedButtonView2, new r(g5Var));
    }

    public final void p4(String str) {
        if (str.length() == 0) {
            R3();
            return;
        }
        j0.a aVar = j0.R0;
        String U0 = U0(f1.text_unique_emomo_close_alert_title);
        jo.p.g(U0, "getString(R.string.text_…_emomo_close_alert_title)");
        j0.a.b(aVar, U0, f1.text_unique_emomo_gift_yes, null, 4, null).z3(p0(), "CustomMessageDialog");
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), nd.g1.BlackThreeDialog);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        Fragment H0 = H0();
        this.W0 = H0 instanceof me.x ? (me.x) H0 : null;
    }
}
