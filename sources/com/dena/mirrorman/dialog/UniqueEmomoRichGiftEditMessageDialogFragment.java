package com.dena.mirrorman.dialog;

import ae.c5;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.o;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import androidx.lifecycle.u0;
import androidx.recyclerview.widget.RecyclerView;
import be.n5;
import co.l;
import com.dena.mirrorman.dialog.UniqueEmomoRichGiftEditMessageDialogFragment;
import com.dena.mirrorman.feature.player.EditTextWithOnKeyPreImeListener;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftUnityFontConfig;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftUnityTextConfig;
import da.j;
import io.r;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jo.f0;
import jo.p;
import kq.a;
import me.y;
import nd.b1;
import nd.g1;
import nd.w0;
import nf.m0;
import ud.z3;
import uo.q0;
import uo.r0;
import wn.k;
import wn.m;
import wn.q;
import wn.v;
import xn.a0;
import xn.t;
import xo.g0;

/* loaded from: classes2.dex */
public final class UniqueEmomoRichGiftEditMessageDialogFragment extends androidx.fragment.app.e implements q0 {
    public static final a S0 = new a(null);
    public static final int T0 = 8;
    public final /* synthetic */ j N0;
    public m0 O0;
    public n5 P0;
    public final wn.f Q0;
    public ViewTreeObserver.OnGlobalLayoutListener R0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final UniqueEmomoRichGiftEditMessageDialogFragment a(UniqueEmomoGiftUnityTextConfig uniqueEmomoGiftUnityTextConfig, int i10) {
            p.h(uniqueEmomoGiftUnityTextConfig, "textConfig");
            UniqueEmomoRichGiftEditMessageDialogFragment uniqueEmomoRichGiftEditMessageDialogFragment = new UniqueEmomoRichGiftEditMessageDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("EXTRA_TEXT_CONFIG", uniqueEmomoGiftUnityTextConfig);
            bundle.putInt("EXTRA_MAX_LENGTH", i10);
            uniqueEmomoRichGiftEditMessageDialogFragment.V2(bundle);
            return uniqueEmomoRichGiftEditMessageDialogFragment;
        }
    }

    @co.f(c = "com.dena.mirrorman.dialog.UniqueEmomoRichGiftEditMessageDialogFragment$observeStoreValues$1", f = "UniqueEmomoRichGiftEditMessageDialogFragment.kt", l = {191}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f25637w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c5 f25639y;

        @co.f(c = "com.dena.mirrorman.dialog.UniqueEmomoRichGiftEditMessageDialogFragment$observeStoreValues$1$1", f = "UniqueEmomoRichGiftEditMessageDialogFragment.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends l implements r<List<? extends UniqueEmomoGiftUnityFontConfig>, Integer, List<? extends UniqueEmomoGiftUnityTextConfig>, ao.d<? super List<? extends k<? extends UniqueEmomoGiftUnityFontConfig, ? extends Boolean>>>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f25640w;

            /* renamed from: x  reason: collision with root package name */
            public /* synthetic */ Object f25641x;

            /* renamed from: y  reason: collision with root package name */
            public /* synthetic */ int f25642y;

            /* renamed from: z  reason: collision with root package name */
            public /* synthetic */ Object f25643z;

            public a(ao.d<? super a> dVar) {
                super(4, dVar);
            }

            @Override // io.r
            public /* bridge */ /* synthetic */ Object F(List<? extends UniqueEmomoGiftUnityFontConfig> list, Integer num, List<? extends UniqueEmomoGiftUnityTextConfig> list2, ao.d<? super List<? extends k<? extends UniqueEmomoGiftUnityFontConfig, ? extends Boolean>>> dVar) {
                return a(list, num.intValue(), list2, dVar);
            }

            public final Object a(List<UniqueEmomoGiftUnityFontConfig> list, int i10, List<UniqueEmomoGiftUnityTextConfig> list2, ao.d<? super List<k<UniqueEmomoGiftUnityFontConfig, Boolean>>> dVar) {
                a aVar = new a(dVar);
                aVar.f25641x = list;
                aVar.f25642y = i10;
                aVar.f25643z = list2;
                return aVar.invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                bo.c.c();
                if (this.f25640w == 0) {
                    m.b(obj);
                    List<UniqueEmomoGiftUnityFontConfig> list = (List) this.f25641x;
                    UniqueEmomoGiftUnityTextConfig uniqueEmomoGiftUnityTextConfig = (UniqueEmomoGiftUnityTextConfig) a0.a0((List) this.f25643z, this.f25642y);
                    ArrayList arrayList = new ArrayList(t.u(list, 10));
                    for (UniqueEmomoGiftUnityFontConfig uniqueEmomoGiftUnityFontConfig : list) {
                        arrayList.add(q.a(uniqueEmomoGiftUnityFontConfig, co.b.a(p.c(uniqueEmomoGiftUnityFontConfig.getId(), uniqueEmomoGiftUnityTextConfig != null ? uniqueEmomoGiftUnityTextConfig.getFontId() : null))));
                    }
                    return arrayList;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: com.dena.mirrorman.dialog.UniqueEmomoRichGiftEditMessageDialogFragment$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0226b implements xo.d<List<? extends k<? extends UniqueEmomoGiftUnityFontConfig, ? extends Boolean>>> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ c5 f25644w;

            public C0226b(c5 c5Var) {
                this.f25644w = c5Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(List<k<UniqueEmomoGiftUnityFontConfig, Boolean>> list, ao.d<? super v> dVar) {
                ArrayList arrayList = new ArrayList(t.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    k kVar = (k) it.next();
                    UniqueEmomoGiftUnityFontConfig uniqueEmomoGiftUnityFontConfig = (UniqueEmomoGiftUnityFontConfig) kVar.a();
                    arrayList.add(new z3(uniqueEmomoGiftUnityFontConfig.getId(), Color.parseColor(uniqueEmomoGiftUnityFontConfig.getTextColor()), uniqueEmomoGiftUnityFontConfig.getOutlineColor().length() == 0 ? null : co.b.d(Color.parseColor(uniqueEmomoGiftUnityFontConfig.getOutlineColor())), ((Boolean) kVar.b()).booleanValue(), null, 16, null));
                }
                RecyclerView.h adapter = this.f25644w.B.getAdapter();
                p.f(adapter, "null cannot be cast to non-null type com.dena.mirrorman.feature.emomo.uniquegift.UniqueEmomoStampGiftCreationPaletteAdapter");
                ((y) adapter).d(arrayList);
                return v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c5 c5Var, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f25639y = c5Var;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f25639y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f25637w;
            if (i10 == 0) {
                m.b(obj);
                m0 m0Var = UniqueEmomoRichGiftEditMessageDialogFragment.this.O0;
                if (m0Var == null) {
                    p.v("store");
                    m0Var = null;
                }
                g0<List<UniqueEmomoGiftUnityFontConfig>> o10 = m0Var.o();
                m0 m0Var2 = UniqueEmomoRichGiftEditMessageDialogFragment.this.O0;
                if (m0Var2 == null) {
                    p.v("store");
                    m0Var2 = null;
                }
                g0<Integer> l10 = m0Var2.l();
                m0 m0Var3 = UniqueEmomoRichGiftEditMessageDialogFragment.this.O0;
                if (m0Var3 == null) {
                    p.v("store");
                    m0Var3 = null;
                }
                xo.c i11 = xo.e.i(o10, l10, m0Var3.w(), new a(null));
                C0226b c0226b = new C0226b(this.f25639y);
                this.f25637w = 1;
                if (i11.a(c0226b, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f25645w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f25645w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f25645w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f25646w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25647x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25648y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f25649z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f25646w = aVar;
            this.f25647x = aVar2;
            this.f25648y = aVar3;
            this.f25649z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f25646w;
            vq.a aVar2 = this.f25647x;
            io.a aVar3 = this.f25648y;
            xq.a aVar4 = this.f25649z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(m0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f25650w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f25650w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f25650w.U();
            p.g(U, "viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.l<z3, v> {
        public f() {
            super(1);
        }

        public final void a(z3 z3Var) {
            p.h(z3Var, "bindModel");
            n5 n5Var = UniqueEmomoRichGiftEditMessageDialogFragment.this.P0;
            if (n5Var != null) {
                n5Var.f1(z3Var.a(), UniqueEmomoRichGiftEditMessageDialogFragment.this.H3().getIndex());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(z3 z3Var) {
            a(z3Var);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.p<Integer, KeyEvent, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ EditTextWithOnKeyPreImeListener f25652w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c5 f25653x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ UniqueEmomoRichGiftEditMessageDialogFragment f25654y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(EditTextWithOnKeyPreImeListener editTextWithOnKeyPreImeListener, c5 c5Var, UniqueEmomoRichGiftEditMessageDialogFragment uniqueEmomoRichGiftEditMessageDialogFragment) {
            super(2);
            this.f25652w = editTextWithOnKeyPreImeListener;
            this.f25653x = c5Var;
            this.f25654y = uniqueEmomoRichGiftEditMessageDialogFragment;
        }

        public final void a(int i10, KeyEvent keyEvent) {
            p.h(keyEvent, "event");
            if (i10 == 4 && keyEvent.getAction() == 1) {
                of.j.f45405a.c(this.f25652w.getContext(), this.f25653x.C);
                this.f25654y.n3();
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(Integer num, KeyEvent keyEvent) {
            a(num.intValue(), keyEvent);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h implements TextWatcher {
        public h() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            n5 n5Var = UniqueEmomoRichGiftEditMessageDialogFragment.this.P0;
            if (n5Var != null) {
                n5Var.b1(String.valueOf(editable), UniqueEmomoRichGiftEditMessageDialogFragment.this.H3().getIndex());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<UniqueEmomoGiftUnityTextConfig> {
        public i() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final UniqueEmomoGiftUnityTextConfig invoke() {
            Serializable serializable = UniqueEmomoRichGiftEditMessageDialogFragment.this.M2().getSerializable("EXTRA_TEXT_CONFIG");
            p.f(serializable, "null cannot be cast to non-null type com.dena.mirrorman.net.api.response.UniqueEmomoGiftUnityTextConfig");
            return (UniqueEmomoGiftUnityTextConfig) serializable;
        }
    }

    public UniqueEmomoRichGiftEditMessageDialogFragment() {
        super(b1.dialog_fragment_unique_emomo_rich_gift_edit_message);
        this.N0 = new j();
        this.Q0 = wn.g.a(new i());
    }

    public static final void J3(UniqueEmomoRichGiftEditMessageDialogFragment uniqueEmomoRichGiftEditMessageDialogFragment, c5 c5Var) {
        p.h(uniqueEmomoRichGiftEditMessageDialogFragment, "this$0");
        int[] iArr = {0, 0};
        c5Var.B.getLocationOnScreen(iArr);
        n5 n5Var = uniqueEmomoRichGiftEditMessageDialogFragment.P0;
        if (n5Var != null) {
            n5Var.w(iArr[1]);
        }
        of.j.e(of.j.f45405a, uniqueEmomoRichGiftEditMessageDialogFragment.N2(), c5Var.C, 0, 4, null);
    }

    public static final boolean L3(EditTextWithOnKeyPreImeListener editTextWithOnKeyPreImeListener, c5 c5Var, UniqueEmomoRichGiftEditMessageDialogFragment uniqueEmomoRichGiftEditMessageDialogFragment, TextView textView, int i10, KeyEvent keyEvent) {
        p.h(editTextWithOnKeyPreImeListener, "$this_apply");
        p.h(c5Var, "$binding");
        p.h(uniqueEmomoRichGiftEditMessageDialogFragment, "this$0");
        if (i10 == 6) {
            of.j.f45405a.c(editTextWithOnKeyPreImeListener.getContext(), c5Var.C);
            uniqueEmomoRichGiftEditMessageDialogFragment.n3();
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void A1(Bundle bundle) {
        super.A1(bundle);
        androidx.fragment.app.h L2 = L2();
        p.g(L2, "requireActivity()");
        this.O0 = (m0) ((androidx.lifecycle.q0) new s0(f0.b(m0.class), new e(L2), new d(new c(L2), null, null, gq.a.a(L2))).getValue());
    }

    public final UniqueEmomoGiftUnityTextConfig H3() {
        return (UniqueEmomoGiftUnityTextConfig) this.Q0.getValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.P0 = null;
        r0.d(this, null, 1, null);
        super.I1();
    }

    public final void I3(c5 c5Var) {
        uo.l.d(this, null, null, new b(c5Var, null), 3, null);
    }

    public final void K3(final c5 c5Var, int i10) {
        c5Var.B.setItemAnimator(null);
        RecyclerView recyclerView = c5Var.B;
        y yVar = new y();
        yVar.g(new f());
        recyclerView.setAdapter(yVar);
        final EditTextWithOnKeyPreImeListener editTextWithOnKeyPreImeListener = c5Var.C;
        editTextWithOnKeyPreImeListener.setText(H3().getText());
        if (H3().isDirty()) {
            editTextWithOnKeyPreImeListener.setSelection(H3().getText().length());
        } else {
            editTextWithOnKeyPreImeListener.setSelection(0, H3().getText().length());
        }
        editTextWithOnKeyPreImeListener.setFilters(new InputFilter[]{new sf.b(i10)});
        p.g(editTextWithOnKeyPreImeListener, "");
        editTextWithOnKeyPreImeListener.addTextChangedListener(new h());
        editTextWithOnKeyPreImeListener.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: be.m5
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean L3;
                L3 = UniqueEmomoRichGiftEditMessageDialogFragment.L3(EditTextWithOnKeyPreImeListener.this, c5Var, this, textView, i11, keyEvent);
                return L3;
            }
        });
        editTextWithOnKeyPreImeListener.setOnKeyPreImeListener(new g(editTextWithOnKeyPreImeListener, c5Var, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        Window window2;
        p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 != null && (window2 = p32.getWindow()) != null) {
            window2.setLayout(-1, -2);
            window2.getAttributes().gravity = 80;
        }
        final c5 T = c5.T(view);
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: be.l5
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                UniqueEmomoRichGiftEditMessageDialogFragment.J3(UniqueEmomoRichGiftEditMessageDialogFragment.this, T);
            }
        };
        T.u().getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        this.R0 = onGlobalLayoutListener;
        g().a(new androidx.lifecycle.r() { // from class: com.dena.mirrorman.dialog.UniqueEmomoRichGiftEditMessageDialogFragment$onViewCreated$4

            /* loaded from: classes2.dex */
            public /* synthetic */ class a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f25659a;

                static {
                    int[] iArr = new int[o.b.values().length];
                    iArr[o.b.ON_DESTROY.ordinal()] = 1;
                    f25659a = iArr;
                }
            }

            @Override // androidx.lifecycle.r
            public void i(u uVar, o.b bVar) {
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2;
                p.h(uVar, "source");
                p.h(bVar, "event");
                if (a.f25659a[bVar.ordinal()] == 1) {
                    ViewTreeObserver viewTreeObserver = c5.this.u().getViewTreeObserver();
                    onGlobalLayoutListener2 = this.R0;
                    viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener2);
                }
            }
        });
        int i10 = M2().getInt("EXTRA_MAX_LENGTH");
        p.g(T, "binding");
        K3(T, i10);
        I3(T);
        Dialog p33 = p3();
        if (p33 == null || (window = p33.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(4);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        p.h(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        n5 n5Var = this.P0;
        if (n5Var != null) {
            n5Var.w(L2().getWindow().getDecorView().getHeight());
        }
        n5 n5Var2 = this.P0;
        if (n5Var2 != null) {
            n5Var2.v2(H3().getIndex());
        }
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Dialog dialog = new Dialog(N2(), g1.f42010i);
        w3(false);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(w0.Q0);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.clearFlags(2);
        }
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        p.h(context, "context");
        super.x1(context);
        n5 n5Var = context instanceof n5 ? (n5) context : null;
        this.P0 = n5Var;
        if (n5Var != null) {
            n5Var.j(H3().getIndex());
        }
    }
}
