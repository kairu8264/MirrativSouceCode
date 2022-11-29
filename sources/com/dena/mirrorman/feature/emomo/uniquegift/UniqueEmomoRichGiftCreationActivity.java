package com.dena.mirrorman.feature.emomo.uniquegift;

import ae.a0;
import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.h5;
import be.i5;
import be.j0;
import be.k0;
import be.n5;
import be.y0;
import be.z0;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarSimpleValue;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.dialog.UniqueEmomoRichGiftEditMessageDialogFragment;
import com.dena.mirrorman.feature.emomo.uniquegift.UniqueEmomoRichGiftCreationActivity;
import com.dena.mirrorman.feature.player.EditTextWithOnKeyPreImeListener;
import com.dena.mirrorman.fragment.EmomoGameViewFragment;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftPreset;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftUnityTextConfig;
import com.dena.mirrorman.unity.UnityActionCreator;
import com.dena.mirrorman.unity.UnityScreenShotAvatarPosition;
import com.dena.mirrorman.unity.UnityScreenshot;
import com.dena.mirrorman.unity.UnityStore;
import ha.a;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kq.a;
import nd.b1;
import nd.f1;
import nd.i1;
import nd.w0;
import nf.m0;
import uo.q0;
import uo.r0;
import yd.g1;
import yd.t1;

/* loaded from: classes2.dex */
public final class UniqueEmomoRichGiftCreationActivity extends e.b implements i5, n5, z0, k0, q0 {

    /* renamed from: a0  reason: collision with root package name */
    public static final a f25730a0 = new a(null);

    /* renamed from: b0  reason: collision with root package name */
    public static final int f25731b0 = 8;
    public ae.a0 Q;
    public final wn.f S;
    public final wn.f T;
    public final wn.f U;
    public final wn.f V;
    public final wn.f W;
    public final wn.f X;
    public final wn.f Y;
    public final wn.f Z;
    public final /* synthetic */ da.j O = new da.j();
    public final wn.f P = wn.g.a(new b());
    public final wn.f R = wn.g.a(new r());

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context, String str, UniqueEmomoGiftPreset uniqueEmomoGiftPreset) {
            jo.p.h(context, "context");
            jo.p.h(str, "referer");
            jo.p.h(uniqueEmomoGiftPreset, "uniqueEmomoGiftPreset");
            Intent intent = new Intent(context, UniqueEmomoRichGiftCreationActivity.class);
            intent.putExtra("EXTRA_PREV_REFERER", str);
            intent.putExtra("EXTRA_UNIQUE_EMOMO_GIFT_PRESET", uniqueEmomoGiftPreset);
            return intent;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a0 extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25732w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25733x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25734y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25732w = componentCallbacks;
            this.f25733x = aVar;
            this.f25734y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f25732w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f25733x, this.f25734y);
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
            return UniqueEmomoRichGiftCreationActivity.this.getCacheDir() + "/emomo_rich.png";
        }
    }

    /* loaded from: classes2.dex */
    public static final class b0 extends jo.q implements io.a<kf.x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25736w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25737x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25738y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25736w = componentCallbacks;
            this.f25737x = aVar;
            this.f25738y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final kf.x invoke() {
            ComponentCallbacks componentCallbacks = this.f25736w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.x.class), this.f25737x, this.f25738y);
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.emomo.uniquegift.UniqueEmomoRichGiftCreationActivity$observeStoreValues$1", f = "UniqueEmomoRichGiftCreationActivity.kt", l = {252}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f25739w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ ae.a0 f25741y;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<UniqueEmomoGiftPreset> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ae.a0 f25742w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ UniqueEmomoRichGiftCreationActivity f25743x;

            public a(ae.a0 a0Var, UniqueEmomoRichGiftCreationActivity uniqueEmomoRichGiftCreationActivity) {
                this.f25742w = a0Var;
                this.f25743x = uniqueEmomoRichGiftCreationActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(UniqueEmomoGiftPreset uniqueEmomoGiftPreset, ao.d<? super wn.v> dVar) {
                Object obj;
                if (uniqueEmomoGiftPreset == null) {
                    return wn.v.f59242a;
                }
                this.f25742w.F.setText(this.f25743x.getString(f1.text_unique_emomo_gift_text_length_note, new Object[]{String.valueOf(uniqueEmomoGiftPreset.getTextLength())}));
                jf.c value = this.f25743x.Q3().k().getValue();
                if (value == null) {
                    return wn.v.f59242a;
                }
                List<UniqueEmomoGiftUnityTextConfig> value2 = this.f25743x.Q3().w().getValue();
                UniqueEmomoRichGiftCreationActivity uniqueEmomoRichGiftCreationActivity = this.f25743x;
                Iterator<T> it = this.f25743x.Q3().q().getValue().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (jo.p.c(((ClosetAvatarSimpleValue) obj).getId(), uniqueEmomoRichGiftCreationActivity.Q3().u().getValue())) {
                        break;
                    }
                }
                ClosetAvatarSimpleValue closetAvatarSimpleValue = (ClosetAvatarSimpleValue) obj;
                if (closetAvatarSimpleValue == null) {
                    return wn.v.f59242a;
                }
                this.f25743x.R3().loadEditingRichUniqueGift(uniqueEmomoGiftPreset.getUnityPresetName(), value, value2, closetAvatarSimpleValue.getValue());
                this.f25743x.a3().k().r(this.f25742w.C.getId(), EmomoGameViewFragment.f26056y0.a()).i();
                this.f25743x.J3().j();
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ae.a0 a0Var, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f25741y = a0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f25741y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f25739w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.g0<UniqueEmomoGiftPreset> r10 = UniqueEmomoRichGiftCreationActivity.this.Q3().r();
                a aVar = new a(this.f25741y, UniqueEmomoRichGiftCreationActivity.this);
                this.f25739w = 1;
                if (r10.a(aVar, this) == c10) {
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

    /* loaded from: classes2.dex */
    public static final class c0 extends jo.q implements io.a<kf.m> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25744w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25745x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25746y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25744w = componentCallbacks;
            this.f25745x = aVar;
            this.f25746y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.m, java.lang.Object] */
        @Override // io.a
        public final kf.m invoke() {
            ComponentCallbacks componentCallbacks = this.f25744w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.m.class), this.f25745x, this.f25746y);
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.emomo.uniquegift.UniqueEmomoRichGiftCreationActivity$observeStoreValues$10", f = "UniqueEmomoRichGiftCreationActivity.kt", l = {375}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f25747w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ UniqueEmomoRichGiftCreationActivity f25749w;

            public a(UniqueEmomoRichGiftCreationActivity uniqueEmomoRichGiftCreationActivity) {
                this.f25749w = uniqueEmomoRichGiftCreationActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                t1.a aVar = t1.f61795x;
                UniqueEmomoRichGiftCreationActivity uniqueEmomoRichGiftCreationActivity = this.f25749w;
                String message = mRError.getMessage();
                if (message == null) {
                    message = this.f25749w.getString(f1.f41966c);
                    jo.p.g(message, "getString(R.string.error_access)");
                }
                aVar.a(uniqueEmomoRichGiftCreationActivity, message);
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
            int i10 = this.f25747w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<MRError> s10 = UniqueEmomoRichGiftCreationActivity.this.Q3().s();
                a aVar = new a(UniqueEmomoRichGiftCreationActivity.this);
                this.f25747w = 1;
                if (s10.a(aVar, this) == c10) {
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
    public static final class d0 extends jo.q implements io.a<i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25750w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25751x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25752y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25750w = componentCallbacks;
            this.f25751x = aVar;
            this.f25752y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f25750w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(i1.class), this.f25751x, this.f25752y);
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.emomo.uniquegift.UniqueEmomoRichGiftCreationActivity$observeStoreValues$11", f = "UniqueEmomoRichGiftCreationActivity.kt", l = {381}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f25753w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<Integer> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ UniqueEmomoRichGiftCreationActivity f25755w;

            public a(UniqueEmomoRichGiftCreationActivity uniqueEmomoRichGiftCreationActivity) {
                this.f25755w = uniqueEmomoRichGiftCreationActivity;
            }

            public final Object a(int i10, ao.d<? super wn.v> dVar) {
                this.f25755w.R3().richUniqueGiftSetMessageFocusMode(i10);
                return wn.v.f59242a;
            }

            @Override // xo.d
            public /* bridge */ /* synthetic */ Object emit(Integer num, ao.d dVar) {
                return a(num.intValue(), dVar);
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
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f25753w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.g0<Integer> l10 = UniqueEmomoRichGiftCreationActivity.this.Q3().l();
                a aVar = new a(UniqueEmomoRichGiftCreationActivity.this);
                this.f25753w = 1;
                if (l10.a(aVar, this) == c10) {
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

    /* loaded from: classes2.dex */
    public static final class e0 extends jo.q implements io.a<od.q0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25756w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25757x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25758y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25756w = componentCallbacks;
            this.f25757x = aVar;
            this.f25758y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.q0, java.lang.Object] */
        @Override // io.a
        public final od.q0 invoke() {
            ComponentCallbacks componentCallbacks = this.f25756w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.q0.class), this.f25757x, this.f25758y);
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.emomo.uniquegift.UniqueEmomoRichGiftCreationActivity$observeStoreValues$12", f = "UniqueEmomoRichGiftCreationActivity.kt", l = {387}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f25759w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ ae.a0 f25761y;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ae.a0 f25762w;

            public a(ae.a0 a0Var) {
                this.f25762w = a0Var;
            }

            public final Object a(boolean z10, ao.d<? super wn.v> dVar) {
                this.f25762w.I.setVisibility(z10 ? 0 : 8);
                return wn.v.f59242a;
            }

            @Override // xo.d
            public /* bridge */ /* synthetic */ Object emit(Boolean bool, ao.d dVar) {
                return a(bool.booleanValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ae.a0 a0Var, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f25761y = a0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f25761y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f25759w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<Boolean> z10 = UniqueEmomoRichGiftCreationActivity.this.Q3().z();
                a aVar = new a(this.f25761y);
                this.f25759w = 1;
                if (z10.a(aVar, this) == c10) {
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
    public static final class f0 extends jo.q implements io.a<UnityActionCreator> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25763w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25764x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25765y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25763w = componentCallbacks;
            this.f25764x = aVar;
            this.f25765y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.unity.UnityActionCreator, java.lang.Object] */
        @Override // io.a
        public final UnityActionCreator invoke() {
            ComponentCallbacks componentCallbacks = this.f25763w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(UnityActionCreator.class), this.f25764x, this.f25765y);
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.emomo.uniquegift.UniqueEmomoRichGiftCreationActivity$observeStoreValues$2", f = "UniqueEmomoRichGiftCreationActivity.kt", l = {278}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f25766w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ ae.a0 f25768y;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<List<? extends UniqueEmomoGiftUnityTextConfig>> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ae.a0 f25769w;

            public a(ae.a0 a0Var) {
                this.f25769w = a0Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(List<UniqueEmomoGiftUnityTextConfig> list, ao.d<? super wn.v> dVar) {
                ArrayList arrayList = new ArrayList(xn.t.u(list, 10));
                for (UniqueEmomoGiftUnityTextConfig uniqueEmomoGiftUnityTextConfig : list) {
                    arrayList.add(uniqueEmomoGiftUnityTextConfig.getText());
                }
                RecyclerView.h adapter = this.f25769w.G.getAdapter();
                jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrorman.feature.emomo.uniquegift.UniqueEmomoRichGiftPresetTextAdapter");
                ((me.i) adapter).d(arrayList);
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ae.a0 a0Var, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f25768y = a0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f25768y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f25766w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.g0<List<UniqueEmomoGiftUnityTextConfig>> w10 = UniqueEmomoRichGiftCreationActivity.this.Q3().w();
                a aVar = new a(this.f25768y);
                this.f25766w = 1;
                if (w10.a(aVar, this) == c10) {
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

    /* loaded from: classes2.dex */
    public static final class g0 extends jo.q implements io.a<UnityStore> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25770w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25771x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25772y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25770w = componentCallbacks;
            this.f25771x = aVar;
            this.f25772y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.dena.mirrorman.unity.UnityStore] */
        @Override // io.a
        public final UnityStore invoke() {
            ComponentCallbacks componentCallbacks = this.f25770w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(UnityStore.class), this.f25771x, this.f25772y);
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.emomo.uniquegift.UniqueEmomoRichGiftCreationActivity$observeStoreValues$3", f = "UniqueEmomoRichGiftCreationActivity.kt", l = {292}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f25773w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ ae.a0 f25775y;

        @co.f(c = "com.dena.mirrorman.feature.emomo.uniquegift.UniqueEmomoRichGiftCreationActivity$observeStoreValues$3$1", f = "UniqueEmomoRichGiftCreationActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends co.l implements io.q<List<? extends ClosetAvatarSimpleValue>, String, ao.d<? super List<? extends wn.k<? extends ClosetAvatarSimpleValue, ? extends Boolean>>>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f25776w;

            /* renamed from: x  reason: collision with root package name */
            public /* synthetic */ Object f25777x;

            /* renamed from: y  reason: collision with root package name */
            public /* synthetic */ Object f25778y;

            public a(ao.d<? super a> dVar) {
                super(3, dVar);
            }

            @Override // io.q
            /* renamed from: a */
            public final Object s0(List<ClosetAvatarSimpleValue> list, String str, ao.d<? super List<wn.k<ClosetAvatarSimpleValue, Boolean>>> dVar) {
                a aVar = new a(dVar);
                aVar.f25777x = list;
                aVar.f25778y = str;
                return aVar.invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                bo.c.c();
                if (this.f25776w == 0) {
                    wn.m.b(obj);
                    List<ClosetAvatarSimpleValue> list = (List) this.f25777x;
                    String str = (String) this.f25778y;
                    ArrayList arrayList = new ArrayList(xn.t.u(list, 10));
                    for (ClosetAvatarSimpleValue closetAvatarSimpleValue : list) {
                        arrayList.add(wn.q.a(closetAvatarSimpleValue, co.b.a(jo.p.c(closetAvatarSimpleValue.getId(), str))));
                    }
                    return arrayList;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* loaded from: classes2.dex */
        public static final class b implements xo.d<List<? extends wn.k<? extends ClosetAvatarSimpleValue, ? extends Boolean>>> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ae.a0 f25779w;

            public b(ae.a0 a0Var) {
                this.f25779w = a0Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(List<wn.k<ClosetAvatarSimpleValue, Boolean>> list, ao.d<? super wn.v> dVar) {
                RecyclerView.h adapter = this.f25779w.J.getAdapter();
                jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrorman.adapter.EmomoPoseAndTitleAdapter");
                ((rd.l) adapter).d(list);
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ae.a0 a0Var, ao.d<? super h> dVar) {
            super(2, dVar);
            this.f25775y = a0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h(this.f25775y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f25773w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c h10 = xo.e.h(UniqueEmomoRichGiftCreationActivity.this.Q3().q(), UniqueEmomoRichGiftCreationActivity.this.Q3().u(), new a(null));
                b bVar = new b(this.f25775y);
                this.f25773w = 1;
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

    /* loaded from: classes2.dex */
    public static final class h0 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f25780w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(ComponentActivity componentActivity) {
            super(0);
            this.f25780w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f25780w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.emomo.uniquegift.UniqueEmomoRichGiftCreationActivity$observeStoreValues$4", f = "UniqueEmomoRichGiftCreationActivity.kt", l = {298}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f25781w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ ae.a0 f25783y;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<String> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ae.a0 f25784w;

            public a(ae.a0 a0Var) {
                this.f25784w = a0Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(String str, ao.d<? super wn.v> dVar) {
                AppCompatTextView appCompatTextView = this.f25784w.K;
                appCompatTextView.setText(str.codePointCount(0, str.length()) + "/8");
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ae.a0 a0Var, ao.d<? super i> dVar) {
            super(2, dVar);
            this.f25783y = a0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i(this.f25783y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f25781w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.g0<String> x10 = UniqueEmomoRichGiftCreationActivity.this.Q3().x();
                a aVar = new a(this.f25783y);
                this.f25781w = 1;
                if (x10.a(aVar, this) == c10) {
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

    /* loaded from: classes2.dex */
    public static final class i0 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f25785w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25786x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25787y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f25788z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f25785w = aVar;
            this.f25786x = aVar2;
            this.f25787y = aVar3;
            this.f25788z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f25785w;
            vq.a aVar2 = this.f25786x;
            io.a aVar3 = this.f25787y;
            xq.a aVar4 = this.f25788z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(m0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.emomo.uniquegift.UniqueEmomoRichGiftCreationActivity$observeStoreValues$5", f = "UniqueEmomoRichGiftCreationActivity.kt", l = {304}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f25789w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ UniqueEmomoRichGiftCreationActivity f25791w;

            public a(UniqueEmomoRichGiftCreationActivity uniqueEmomoRichGiftCreationActivity) {
                this.f25791w = uniqueEmomoRichGiftCreationActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                Object obj;
                String value = this.f25791w.Q3().u().getValue();
                Iterator<T> it = this.f25791w.Q3().q().getValue().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (jo.p.c(((ClosetAvatarSimpleValue) obj).getId(), value)) {
                        break;
                    }
                }
                ClosetAvatarSimpleValue closetAvatarSimpleValue = (ClosetAvatarSimpleValue) obj;
                if (closetAvatarSimpleValue == null) {
                    return wn.v.f59242a;
                }
                this.f25791w.R3().richUniqueGiftSetAnimation(closetAvatarSimpleValue.getValue());
                this.f25791w.R3().previewRichUniqueGift();
                this.f25791w.J3().j();
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
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f25789w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<wn.v> p10 = UniqueEmomoRichGiftCreationActivity.this.Q3().p();
                a aVar = new a(UniqueEmomoRichGiftCreationActivity.this);
                this.f25789w = 1;
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
    public static final class j0 extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f25792w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(ComponentActivity componentActivity) {
            super(0);
            this.f25792w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f25792w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.emomo.uniquegift.UniqueEmomoRichGiftCreationActivity$observeStoreValues$6", f = "UniqueEmomoRichGiftCreationActivity.kt", l = {314}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f25793w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ UniqueEmomoRichGiftCreationActivity f25795w;

            public a(UniqueEmomoRichGiftCreationActivity uniqueEmomoRichGiftCreationActivity) {
                this.f25795w = uniqueEmomoRichGiftCreationActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                String unityFontName;
                int intValue = this.f25795w.Q3().l().getValue().intValue();
                UniqueEmomoGiftUnityTextConfig uniqueEmomoGiftUnityTextConfig = (UniqueEmomoGiftUnityTextConfig) xn.a0.a0(this.f25795w.Q3().w().getValue(), intValue);
                if (uniqueEmomoGiftUnityTextConfig != null && (unityFontName = uniqueEmomoGiftUnityTextConfig.getUnityFontName()) != null) {
                    this.f25795w.R3().richUniqueGiftSetColor(intValue, unityFontName);
                    return wn.v.f59242a;
                }
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
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((k) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f25793w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<wn.v> n10 = UniqueEmomoRichGiftCreationActivity.this.Q3().n();
                a aVar = new a(UniqueEmomoRichGiftCreationActivity.this);
                this.f25793w = 1;
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

    @co.f(c = "com.dena.mirrorman.feature.emomo.uniquegift.UniqueEmomoRichGiftCreationActivity$observeStoreValues$7", f = "UniqueEmomoRichGiftCreationActivity.kt", l = {325}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f25796w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<Integer> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ UniqueEmomoRichGiftCreationActivity f25798w;

            public a(UniqueEmomoRichGiftCreationActivity uniqueEmomoRichGiftCreationActivity) {
                this.f25798w = uniqueEmomoRichGiftCreationActivity;
            }

            public final Object a(int i10, ao.d<? super wn.v> dVar) {
                UniqueEmomoGiftUnityTextConfig uniqueEmomoGiftUnityTextConfig = (UniqueEmomoGiftUnityTextConfig) xn.a0.a0(this.f25798w.Q3().w().getValue(), i10);
                if (uniqueEmomoGiftUnityTextConfig == null) {
                    return wn.v.f59242a;
                }
                this.f25798w.R3().richUniqueGiftSetMessage(i10, uniqueEmomoGiftUnityTextConfig.getText());
                return wn.v.f59242a;
            }

            @Override // xo.d
            public /* bridge */ /* synthetic */ Object emit(Integer num, ao.d dVar) {
                return a(num.intValue(), dVar);
            }
        }

        public l(ao.d<? super l> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new l(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((l) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f25796w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<Integer> v10 = UniqueEmomoRichGiftCreationActivity.this.Q3().v();
                a aVar = new a(UniqueEmomoRichGiftCreationActivity.this);
                this.f25796w = 1;
                if (v10.a(aVar, this) == c10) {
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
    public static final class m extends jo.q implements io.a<wn.v> {
        public m() {
            super(0);
        }

        public final void a() {
            od.q0 J3 = UniqueEmomoRichGiftCreationActivity.this.J3();
            Serializable serializableExtra = UniqueEmomoRichGiftCreationActivity.this.getIntent().getSerializableExtra("EXTRA_UNIQUE_EMOMO_GIFT_PRESET");
            jo.p.f(serializableExtra, "null cannot be cast to non-null type com.dena.mirrorman.net.api.response.UniqueEmomoGiftPreset");
            J3.d((UniqueEmomoGiftPreset) serializableExtra);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.emomo.uniquegift.UniqueEmomoRichGiftCreationActivity$observeStoreValues$9", f = "UniqueEmomoRichGiftCreationActivity.kt", l = {357}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f25800w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<File> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ UniqueEmomoRichGiftCreationActivity f25802w;

            public a(UniqueEmomoRichGiftCreationActivity uniqueEmomoRichGiftCreationActivity) {
                this.f25802w = uniqueEmomoRichGiftCreationActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(File file, ao.d<? super wn.v> dVar) {
                String id2;
                String value = this.f25802w.Q3().u().getValue();
                UniqueEmomoGiftPreset value2 = this.f25802w.Q3().r().getValue();
                if (value2 != null && (id2 = value2.getId()) != null) {
                    String value3 = this.f25802w.Q3().x().getValue();
                    List<UniqueEmomoGiftUnityTextConfig> value4 = this.f25802w.Q3().w().getValue();
                    h5.a aVar = h5.Z0;
                    String N3 = this.f25802w.N3();
                    String absolutePath = file.getAbsolutePath();
                    jo.p.g(absolutePath, "it.absolutePath");
                    aVar.b(N3, value, id2, value3, value4, absolutePath).z3(this.f25802w.a3(), "UniqueEmomoGiftSlotsDialogFragment");
                    return wn.v.f59242a;
                }
                return wn.v.f59242a;
            }
        }

        public n(ao.d<? super n> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new n(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((n) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f25800w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<File> t10 = UniqueEmomoRichGiftCreationActivity.this.Q3().t();
                a aVar = new a(UniqueEmomoRichGiftCreationActivity.this);
                this.f25800w = 1;
                if (t10.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.feature.emomo.uniquegift.UniqueEmomoRichGiftCreationActivity$observeUnityStoreValues$1", f = "UniqueEmomoRichGiftCreationActivity.kt", l = {399}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class o extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f25803w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<UnityScreenshot> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ UniqueEmomoRichGiftCreationActivity f25805w;

            public a(UniqueEmomoRichGiftCreationActivity uniqueEmomoRichGiftCreationActivity) {
                this.f25805w = uniqueEmomoRichGiftCreationActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(UnityScreenshot unityScreenshot, ao.d<? super wn.v> dVar) {
                if (jo.p.c(unityScreenshot.getKey(), "UNIQUE_EMOMO_RICH_GIFT_SCREEN_SHOT_KEY")) {
                    this.f25805w.J3().g(this.f25805w.P3(unityScreenshot));
                    return wn.v.f59242a;
                }
                return wn.v.f59242a;
            }
        }

        public o(ao.d<? super o> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new o(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((o) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f25803w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<UnityScreenshot> screenshotCompletedFlow = UniqueEmomoRichGiftCreationActivity.this.S3().getScreenshotCompletedFlow();
                a aVar = new a(UniqueEmomoRichGiftCreationActivity.this);
                this.f25803w = 1;
                if (screenshotCompletedFlow.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.feature.emomo.uniquegift.UniqueEmomoRichGiftCreationActivity$observeUnityStoreValues$2", f = "UniqueEmomoRichGiftCreationActivity.kt", l = {407}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class p extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f25806w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ UniqueEmomoRichGiftCreationActivity f25808w;

            public a(UniqueEmomoRichGiftCreationActivity uniqueEmomoRichGiftCreationActivity) {
                this.f25808w = uniqueEmomoRichGiftCreationActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                t1.a aVar = t1.f61795x;
                UniqueEmomoRichGiftCreationActivity uniqueEmomoRichGiftCreationActivity = this.f25808w;
                String string = uniqueEmomoRichGiftCreationActivity.getString(f1.f41966c);
                jo.p.g(string, "getString(R.string.error_access)");
                aVar.a(uniqueEmomoRichGiftCreationActivity, string);
                return wn.v.f59242a;
            }
        }

        public p(ao.d<? super p> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new p(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((p) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f25806w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.v> screenshotFailedFlow = UniqueEmomoRichGiftCreationActivity.this.S3().getScreenshotFailedFlow();
                a aVar = new a(UniqueEmomoRichGiftCreationActivity.this);
                this.f25806w = 1;
                if (screenshotFailedFlow.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.feature.emomo.uniquegift.UniqueEmomoRichGiftCreationActivity$observeUnityStoreValues$3", f = "UniqueEmomoRichGiftCreationActivity.kt", l = {413}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class q extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f25809w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ UniqueEmomoRichGiftCreationActivity f25811w;

            public a(UniqueEmomoRichGiftCreationActivity uniqueEmomoRichGiftCreationActivity) {
                this.f25811w = uniqueEmomoRichGiftCreationActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                this.f25811w.J3().e();
                return wn.v.f59242a;
            }
        }

        public q(ao.d<? super q> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new q(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((q) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f25809w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.v> richUniqueGiftAnimationFinishedFlow = UniqueEmomoRichGiftCreationActivity.this.S3().getRichUniqueGiftAnimationFinishedFlow();
                a aVar = new a(UniqueEmomoRichGiftCreationActivity.this);
                this.f25809w = 1;
                if (richUniqueGiftAnimationFinishedFlow.a(aVar, this) == c10) {
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

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.a<String> {
        public r() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String stringExtra = UniqueEmomoRichGiftCreationActivity.this.getIntent().getStringExtra("EXTRA_PREV_REFERER");
            jo.p.e(stringExtra);
            return stringExtra;
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends jo.q implements io.l<View, wn.v> {
        public s() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            UniqueEmomoRichGiftCreationActivity.this.b4();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ae.a0 f25815x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(ae.a0 a0Var) {
            super(1);
            this.f25815x = a0Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            if (so.n.r(UniqueEmomoRichGiftCreationActivity.this.Q3().x().getValue())) {
                y0.a aVar = y0.O0;
                String string = UniqueEmomoRichGiftCreationActivity.this.getString(f1.text_unique_emomo_save_error_missing_title);
                jo.p.g(string, "getString(R.string.text_…save_error_missing_title)");
                y0.a.b(aVar, string, null, 2, null).z3(UniqueEmomoRichGiftCreationActivity.this.a3(), "DIALOG_TAG_SAVE_ERROR_REASON_TITLE_EMPTY");
                return;
            }
            UniqueEmomoRichGiftCreationActivity.this.R3().captureRichUniqueGiftScreenshot(UnityScreenShotAvatarPosition.CENTER, UniqueEmomoRichGiftCreationActivity.this.K3(), this.f25815x.C.getWidth(), this.f25815x.C.getHeight(), "UNIQUE_EMOMO_RICH_GIFT_SCREEN_SHOT_KEY");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends jo.q implements io.l<View, wn.v> {
        public u() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            UniqueEmomoRichGiftCreationActivity.this.R3().previewRichUniqueGift();
            UniqueEmomoRichGiftCreationActivity.this.J3().j();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class v extends jo.q implements io.p<Integer, KeyEvent, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ EditTextWithOnKeyPreImeListener f25817w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(EditTextWithOnKeyPreImeListener editTextWithOnKeyPreImeListener) {
            super(2);
            this.f25817w = editTextWithOnKeyPreImeListener;
        }

        public final void a(int i10, KeyEvent keyEvent) {
            jo.p.h(keyEvent, "event");
            if (i10 == 4 && keyEvent.getAction() == 1) {
                this.f25817w.clearFocus();
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num, KeyEvent keyEvent) {
            a(num.intValue(), keyEvent);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class w implements me.j {
        public w() {
        }

        @Override // me.j
        public void a(int i10) {
            UniqueEmomoGiftPreset value;
            UniqueEmomoGiftUnityTextConfig uniqueEmomoGiftUnityTextConfig = (UniqueEmomoGiftUnityTextConfig) xn.a0.a0(UniqueEmomoRichGiftCreationActivity.this.Q3().w().getValue(), i10);
            if (uniqueEmomoGiftUnityTextConfig == null || (value = UniqueEmomoRichGiftCreationActivity.this.Q3().r().getValue()) == null) {
                return;
            }
            UniqueEmomoRichGiftEditMessageDialogFragment.S0.a(uniqueEmomoGiftUnityTextConfig, value.getTextLength()).z3(UniqueEmomoRichGiftCreationActivity.this.a3(), "UniqueEmomoRichGiftEditMessageDialogFragment");
        }
    }

    /* loaded from: classes2.dex */
    public static final class x implements rd.m {
        public x() {
        }

        @Override // rd.m
        public void a(String str) {
            jo.p.h(str, "poseId");
            UniqueEmomoRichGiftCreationActivity.this.J3().i(str);
        }
    }

    /* loaded from: classes2.dex */
    public static final class y implements TextWatcher {
        public y() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            UniqueEmomoRichGiftCreationActivity.this.J3().m(String.valueOf(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class z extends GridLayoutManager.c {
        public z() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i10) {
            if (UniqueEmomoRichGiftCreationActivity.this.Q3().w().getValue().size() <= 2) {
                return 2;
            }
            return (UniqueEmomoRichGiftCreationActivity.this.Q3().w().getValue().size() > 3 || i10 != 2) ? 1 : 2;
        }
    }

    public UniqueEmomoRichGiftCreationActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.S = wn.g.b(iVar, new a0(this, null, null));
        this.T = wn.g.b(iVar, new b0(this, null, null));
        this.U = wn.g.b(iVar, new c0(this, null, null));
        this.V = wn.g.b(iVar, new d0(this, null, null));
        this.W = wn.g.b(iVar, new e0(this, null, null));
        this.X = new s0(jo.f0.b(m0.class), new j0(this), new i0(new h0(this), null, null, gq.a.a(this)));
        this.Y = wn.g.b(iVar, new f0(this, null, null));
        this.Z = wn.g.b(iVar, new g0(this, null, null));
    }

    public static final void V3(ae.a0 a0Var, UniqueEmomoRichGiftCreationActivity uniqueEmomoRichGiftCreationActivity, ha.a aVar) {
        jo.p.h(a0Var, "$binding");
        jo.p.h(uniqueEmomoRichGiftCreationActivity, "this$0");
        a0Var.H.setVisibility(jo.p.c(aVar, a.d.f34697b) ? 0 : 8);
        if (aVar instanceof a.d) {
            a0Var.N.b(StatusView.b.c.f20791w);
        } else if (aVar instanceof a.b) {
            a0Var.N.b(StatusView.b.C0181b.f20790w);
        } else if (aVar instanceof a.C0439a) {
            StatusView statusView = a0Var.N;
            String message = ((a.C0439a) aVar).b().getMessage();
            if (message == null) {
                message = uniqueEmomoRichGiftCreationActivity.getString(f1.f41966c);
                jo.p.g(message, "getString(R.string.error_access)");
            }
            statusView.b(new StatusView.b.a(message, new m()));
        }
    }

    public static final void Y3(UniqueEmomoRichGiftCreationActivity uniqueEmomoRichGiftCreationActivity, EditTextWithOnKeyPreImeListener editTextWithOnKeyPreImeListener, ae.a0 a0Var, View view, boolean z10) {
        jo.p.h(uniqueEmomoRichGiftCreationActivity, "this$0");
        jo.p.h(editTextWithOnKeyPreImeListener, "$this_apply");
        jo.p.h(a0Var, "$binding");
        if (z10) {
            of.j.f45405a.d(uniqueEmomoRichGiftCreationActivity, editTextWithOnKeyPreImeListener, 100);
            a0Var.M.setVisibility(4);
            return;
        }
        of.j.f45405a.c(uniqueEmomoRichGiftCreationActivity, editTextWithOnKeyPreImeListener);
        a0Var.M.setVisibility(0);
    }

    public static final boolean Z3(EditTextWithOnKeyPreImeListener editTextWithOnKeyPreImeListener, TextView textView, int i10, KeyEvent keyEvent) {
        jo.p.h(editTextWithOnKeyPreImeListener, "$this_apply");
        if (i10 == 6) {
            editTextWithOnKeyPreImeListener.clearFocus();
            return true;
        }
        return false;
    }

    public final void I3() {
        of.j.f45405a.b(this);
        ae.a0 a0Var = this.Q;
        if (a0Var == null) {
            jo.p.v("binding");
            a0Var = null;
        }
        a0Var.Q.setVisibility(4);
        R3().unloadRichUniqueGift();
        finish();
    }

    public final od.q0 J3() {
        return (od.q0) this.W.getValue();
    }

    public final String K3() {
        return (String) this.P.getValue();
    }

    public final kf.m L3() {
        return (kf.m) this.U.getValue();
    }

    public final MRLogger M3() {
        return (MRLogger) this.S.getValue();
    }

    public final String N3() {
        return (String) this.R.getValue();
    }

    public final i1 O3() {
        return (i1) this.V.getValue();
    }

    public final Bitmap P3(UnityScreenshot unityScreenshot) {
        Bitmap decodeFile = BitmapFactory.decodeFile(unityScreenshot.getImagePath());
        int faceSize = (int) (unityScreenshot.getFaceSize() * 3.2f);
        int faceSize2 = (int) (unityScreenshot.getFaceSize() * 3.2f);
        Bitmap createBitmap = Bitmap.createBitmap(faceSize, faceSize2, Bitmap.Config.ARGB_8888);
        float f10 = faceSize;
        float f11 = f10 / 2.0f;
        int facePositionCenterX = (int) (unityScreenshot.getFacePositionCenterX() - f11);
        int facePositionCenterY = (int) (unityScreenshot.getFacePositionCenterY() - (unityScreenshot.getFaceSize() * 1.1f));
        if (facePositionCenterY + faceSize2 > unityScreenshot.getPixelHeight()) {
            facePositionCenterY = unityScreenshot.getPixelHeight() - faceSize2;
        }
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(decodeFile, new Rect(facePositionCenterX, facePositionCenterY, facePositionCenterX + faceSize, facePositionCenterY + faceSize2), new Rect(0, 0, faceSize, faceSize2), (Paint) null);
        String value = Q3().x().getValue();
        float f12 = faceSize2;
        float f13 = 0.2f * f12;
        float f14 = 0.03f * f12;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextSize(f13);
        paint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        paint.setStrokeWidth(f14);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(getColor(w0.f42229d));
        paint.setStyle(Paint.Style.STROKE);
        paint.setTextSize(Math.min((f13 * f10) / (paint.measureText(value) + (f14 * 2)), f13));
        float measureText = paint.measureText(value);
        Rect rect = new Rect();
        paint.getTextBounds(value, 0, value.length(), rect);
        float f15 = f11 - (measureText / 2.0f);
        float faceSize3 = (((int) ((unityScreenshot.getFaceSize() * 1.1f) + (unityScreenshot.getFaceSize() / 2))) + rect.height()) - rect.bottom;
        canvas.drawText(value, f15, faceSize3, paint);
        paint.setStrokeWidth(0.0f);
        paint.setColor(getColor(w0.U0));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawText(value, f15, faceSize3, paint);
        float f16 = 0.32f * f12;
        canvas.drawBitmap(BitmapFactory.decodeResource(getResources(), nd.y0.ic_animation_gift_mark), (Rect) null, new RectF(f10 - f16, f12 - f16, f10, f12), (Paint) null);
        jo.p.g(createBitmap, "image");
        return createBitmap;
    }

    public final m0 Q3() {
        return (m0) this.X.getValue();
    }

    public final UnityActionCreator R3() {
        return (UnityActionCreator) this.Y.getValue();
    }

    public final UnityStore S3() {
        return (UnityStore) this.Z.getValue();
    }

    public final kf.x T3() {
        return (kf.x) this.T.getValue();
    }

    @SuppressLint({"SetTextI18n"})
    public final void U3(final ae.a0 a0Var) {
        uo.l.d(this, null, null, new c(a0Var, null), 3, null);
        uo.l.d(this, null, null, new g(a0Var, null), 3, null);
        uo.l.d(this, null, null, new h(a0Var, null), 3, null);
        uo.l.d(this, null, null, new i(a0Var, null), 3, null);
        uo.l.d(this, null, null, new j(null), 3, null);
        uo.l.d(this, null, null, new k(null), 3, null);
        uo.l.d(this, null, null, new l(null), 3, null);
        Q3().m().i(this, new androidx.lifecycle.f0() { // from class: me.c
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                UniqueEmomoRichGiftCreationActivity.V3(a0.this, this, (ha.a) obj);
            }
        });
        uo.l.d(this, null, null, new n(null), 3, null);
        uo.l.d(this, null, null, new d(null), 3, null);
        uo.l.d(this, null, null, new e(null), 3, null);
        uo.l.d(this, null, null, new f(a0Var, null), 3, null);
    }

    @Override // be.k0
    public void V(String str) {
        jo.p.h(str, "key");
        I3();
    }

    public final void W3(ae.a0 a0Var) {
        uo.l.d(this, null, null, new o(null), 3, null);
        uo.l.d(this, null, null, new p(null), 3, null);
        uo.l.d(this, null, null, new q(null), 3, null);
    }

    public final void X3(final ae.a0 a0Var) {
        AppCompatImageView appCompatImageView = a0Var.D;
        jo.p.g(appCompatImageView, "binding.closeButton");
        g1.a(appCompatImageView, new s());
        RoundedButtonView roundedButtonView = a0Var.L;
        jo.p.g(roundedButtonView, "binding.saveButton");
        g1.a(roundedButtonView, new t(a0Var));
        AppCompatImageView appCompatImageView2 = a0Var.I;
        jo.p.g(appCompatImageView2, "binding.playButtonImageView");
        g1.a(appCompatImageView2, new u());
        final EditTextWithOnKeyPreImeListener editTextWithOnKeyPreImeListener = a0Var.Q;
        editTextWithOnKeyPreImeListener.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: me.a
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                UniqueEmomoRichGiftCreationActivity.Y3(UniqueEmomoRichGiftCreationActivity.this, editTextWithOnKeyPreImeListener, a0Var, view, z10);
            }
        });
        jo.p.g(editTextWithOnKeyPreImeListener, "");
        editTextWithOnKeyPreImeListener.addTextChangedListener(new y());
        editTextWithOnKeyPreImeListener.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: me.b
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                boolean Z3;
                Z3 = UniqueEmomoRichGiftCreationActivity.Z3(EditTextWithOnKeyPreImeListener.this, textView, i10, keyEvent);
                return Z3;
            }
        });
        editTextWithOnKeyPreImeListener.setOnKeyPreImeListener(new v(editTextWithOnKeyPreImeListener));
        RecyclerView.h adapter = a0Var.G.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrorman.feature.emomo.uniquegift.UniqueEmomoRichGiftPresetTextAdapter");
        ((me.i) adapter).i(new w());
        RecyclerView.h adapter2 = a0Var.J.getAdapter();
        jo.p.f(adapter2, "null cannot be cast to non-null type com.dena.mirrorman.adapter.EmomoPoseAndTitleAdapter");
        ((rd.l) adapter2).i(new x());
    }

    @Override // be.i5
    public void Y() {
        setResult(-1);
        I3();
    }

    public final void a4(ae.a0 a0Var) {
        a0Var.G.setAdapter(new me.i());
        a0Var.G.setItemAnimator(null);
        RecyclerView recyclerView = a0Var.G;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        gridLayoutManager.o3(new z());
        recyclerView.setLayoutManager(gridLayoutManager);
        a0Var.J.setAdapter(new rd.l());
        a0Var.J.setItemAnimator(null);
        a0Var.Q.setFilters(new InputFilter[]{new sf.b(8)});
    }

    @Override // be.n5
    public void b1(String str, int i10) {
        jo.p.h(str, "message");
        J3().l(str);
    }

    public final void b4() {
        if (!Q3().y().getValue().booleanValue()) {
            I3();
            return;
        }
        j0.a aVar = be.j0.R0;
        String string = getString(f1.text_unique_emomo_close_alert_title);
        jo.p.g(string, "getString(R.string.text_…_emomo_close_alert_title)");
        j0.a.b(aVar, string, f1.text_unique_emomo_gift_yes, null, 4, null).z3(a3(), "CustomMessageDialog");
    }

    @Override // be.n5
    public void f1(String str, int i10) {
        jo.p.h(str, "fontId");
        J3().h(i10, str);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    @Override // be.n5
    public void j(int i10) {
        J3().k(i10);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        b4();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        MRLogger M3 = M3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_MY_GIFT_CREATION_RICH_TAB_IMP);
        if (O3().a().d()) {
            builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, L3().b()), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, T3().T4())));
        }
        M3.sendLog(builder.build());
        ViewDataBinding g10 = androidx.databinding.f.g(this, b1.activity_unique_emomo_rich_gift_creation);
        jo.p.g(g10, "setContentView(this, R.l…emomo_rich_gift_creation)");
        ae.a0 a0Var = (ae.a0) g10;
        this.Q = a0Var;
        ae.a0 a0Var2 = null;
        if (a0Var == null) {
            jo.p.v("binding");
            a0Var = null;
        }
        a4(a0Var);
        ae.a0 a0Var3 = this.Q;
        if (a0Var3 == null) {
            jo.p.v("binding");
            a0Var3 = null;
        }
        X3(a0Var3);
        ae.a0 a0Var4 = this.Q;
        if (a0Var4 == null) {
            jo.p.v("binding");
            a0Var4 = null;
        }
        U3(a0Var4);
        ae.a0 a0Var5 = this.Q;
        if (a0Var5 == null) {
            jo.p.v("binding");
        } else {
            a0Var2 = a0Var5;
        }
        W3(a0Var2);
        od.q0 J3 = J3();
        Serializable serializableExtra = getIntent().getSerializableExtra("EXTRA_UNIQUE_EMOMO_GIFT_PRESET");
        jo.p.f(serializableExtra, "null cannot be cast to non-null type com.dena.mirrorman.net.api.response.UniqueEmomoGiftPreset");
        J3.d((UniqueEmomoGiftPreset) serializableExtra);
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        r0.d(this, null, 1, null);
        super.onDestroy();
    }

    @Override // be.n5
    public void v2(int i10) {
        J3().f();
    }

    @Override // be.n5
    public void w(int i10) {
        int[] iArr = {0, 0};
        ae.a0 a0Var = this.Q;
        ae.a0 a0Var2 = null;
        if (a0Var == null) {
            jo.p.v("binding");
            a0Var = null;
        }
        a0Var.C.getLocationOnScreen(iArr);
        int i11 = iArr[1];
        ae.a0 a0Var3 = this.Q;
        if (a0Var3 == null) {
            jo.p.v("binding");
            a0Var3 = null;
        }
        int height = a0Var3.C.getHeight();
        int b10 = (i10 - i11) - de.a.b(this, 10);
        ae.a0 a0Var4 = this.Q;
        if (a0Var4 == null) {
            jo.p.v("binding");
            a0Var4 = null;
        }
        ViewGroup.LayoutParams layoutParams = a0Var4.C.getLayoutParams();
        if (b10 > height) {
            b10 = 0;
        }
        layoutParams.height = b10;
        ae.a0 a0Var5 = this.Q;
        if (a0Var5 == null) {
            jo.p.v("binding");
        } else {
            a0Var2 = a0Var5;
        }
        a0Var2.C.setLayoutParams(layoutParams);
    }

    @Override // be.z0
    public void z2(String str) {
        jo.p.h(str, "tag");
        if (jo.p.c(str, "DIALOG_TAG_SAVE_ERROR_REASON_TITLE_EMPTY")) {
            ae.a0 a0Var = this.Q;
            if (a0Var == null) {
                jo.p.v("binding");
                a0Var = null;
            }
            a0Var.Q.requestFocus();
        }
    }
}
