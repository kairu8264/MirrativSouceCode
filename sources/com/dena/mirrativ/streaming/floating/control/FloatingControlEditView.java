package com.dena.mirrativ.streaming.floating.control;

import ac.q1;
import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.l;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.streaming.floating.control.FloatingControlEditView;
import com.dena.mirrorman.net.api.Referer;
import hf.c;
import io.p;
import java.util.ArrayList;
import java.util.List;
import jf.w;
import jo.f0;
import jo.q;
import kotlin.KotlinNothingValueException;
import of.j;
import of.n;
import oq.a;
import uo.b0;
import uo.g1;
import uo.i2;
import uo.q0;
import uo.r0;
import wn.m;
import wn.v;
import xb.r;
import xb.t;

/* loaded from: classes2.dex */
public final class FloatingControlEditView extends RelativeLayout implements oq.a, q0 {
    public final List<View> A;
    public final q1 B;
    public InputMethodManager C;
    public f D;

    /* renamed from: w  reason: collision with root package name */
    public final wn.f f23647w;

    /* renamed from: x  reason: collision with root package name */
    public final wn.f f23648x;

    /* renamed from: y  reason: collision with root package name */
    public w f23649y;

    /* renamed from: z  reason: collision with root package name */
    public final b0 f23650z;

    @co.f(c = "com.dena.mirrativ.streaming.floating.control.FloatingControlEditView$10", f = "FloatingControlEditView.kt", l = {223}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23651w;

        /* renamed from: com.dena.mirrativ.streaming.floating.control.FloatingControlEditView$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0208a implements xo.d<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ FloatingControlEditView f23653w;

            @co.f(c = "com.dena.mirrativ.streaming.floating.control.FloatingControlEditView$10$1", f = "FloatingControlEditView.kt", l = {224}, m = "emit")
            /* renamed from: com.dena.mirrativ.streaming.floating.control.FloatingControlEditView$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0209a extends co.d {

                /* renamed from: w  reason: collision with root package name */
                public Object f23654w;

                /* renamed from: x  reason: collision with root package name */
                public /* synthetic */ Object f23655x;

                /* renamed from: z  reason: collision with root package name */
                public int f23657z;

                public C0209a(ao.d<? super C0209a> dVar) {
                    super(dVar);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    this.f23655x = obj;
                    this.f23657z |= Integer.MIN_VALUE;
                    return C0208a.this.emit(null, this);
                }
            }

            public C0208a(FloatingControlEditView floatingControlEditView) {
                this.f23653w = floatingControlEditView;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
            @Override // xo.d
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(wn.v r6, ao.d<? super wn.v> r7) {
                /*
                    r5 = this;
                    boolean r6 = r7 instanceof com.dena.mirrativ.streaming.floating.control.FloatingControlEditView.a.C0208a.C0209a
                    if (r6 == 0) goto L13
                    r6 = r7
                    com.dena.mirrativ.streaming.floating.control.FloatingControlEditView$a$a$a r6 = (com.dena.mirrativ.streaming.floating.control.FloatingControlEditView.a.C0208a.C0209a) r6
                    int r0 = r6.f23657z
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r0 & r1
                    if (r2 == 0) goto L13
                    int r0 = r0 - r1
                    r6.f23657z = r0
                    goto L18
                L13:
                    com.dena.mirrativ.streaming.floating.control.FloatingControlEditView$a$a$a r6 = new com.dena.mirrativ.streaming.floating.control.FloatingControlEditView$a$a$a
                    r6.<init>(r7)
                L18:
                    java.lang.Object r7 = r6.f23655x
                    java.lang.Object r0 = bo.c.c()
                    int r1 = r6.f23657z
                    r2 = 1
                    if (r1 == 0) goto L35
                    if (r1 != r2) goto L2d
                    java.lang.Object r6 = r6.f23654w
                    com.dena.mirrativ.streaming.floating.control.FloatingControlEditView$a$a r6 = (com.dena.mirrativ.streaming.floating.control.FloatingControlEditView.a.C0208a) r6
                    wn.m.b(r7)
                    goto L46
                L2d:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L35:
                    wn.m.b(r7)
                    r3 = 100
                    r6.f23654w = r5
                    r6.f23657z = r2
                    java.lang.Object r6 = uo.b1.a(r3, r6)
                    if (r6 != r0) goto L45
                    return r0
                L45:
                    r6 = r5
                L46:
                    com.dena.mirrativ.streaming.floating.control.FloatingControlEditView r7 = r6.f23653w
                    fc.f r7 = com.dena.mirrativ.streaming.floating.control.FloatingControlEditView.p(r7)
                    androidx.lifecycle.LiveData r7 = r7.l()
                    java.lang.Object r7 = r7.f()
                    java.util.List r7 = (java.util.List) r7
                    r0 = 0
                    if (r7 == 0) goto L61
                    boolean r7 = r7.isEmpty()
                    r7 = r7 ^ r2
                    if (r7 != r2) goto L61
                    goto L62
                L61:
                    r2 = r0
                L62:
                    if (r2 == 0) goto L7d
                    com.dena.mirrativ.streaming.floating.control.FloatingControlEditView r6 = r6.f23653w
                    ac.q1 r6 = com.dena.mirrativ.streaming.floating.control.FloatingControlEditView.o(r6)
                    androidx.recyclerview.widget.RecyclerView r6 = r6.P
                    androidx.recyclerview.widget.RecyclerView$p r6 = r6.getLayoutManager()
                    boolean r7 = r6 instanceof androidx.recyclerview.widget.LinearLayoutManager
                    if (r7 == 0) goto L77
                    androidx.recyclerview.widget.LinearLayoutManager r6 = (androidx.recyclerview.widget.LinearLayoutManager) r6
                    goto L78
                L77:
                    r6 = 0
                L78:
                    if (r6 == 0) goto L7d
                    r6.J2(r0, r0)
                L7d:
                    wn.v r6 = wn.v.f59242a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.floating.control.FloatingControlEditView.a.C0208a.emit(wn.v, ao.d):java.lang.Object");
            }
        }

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
            int i10 = this.f23651w;
            if (i10 == 0) {
                m.b(obj);
                xo.w<v> m10 = FloatingControlEditView.this.getStore().m();
                C0208a c0208a = new C0208a(FloatingControlEditView.this);
                this.f23651w = 1;
                if (m10.a(c0208a, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.floating.control.FloatingControlEditView$11", f = "FloatingControlEditView.kt", l = {232}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23658w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Context f23660y;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ Context f23661w;

            public a(Context context) {
                this.f23661w = context;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super v> dVar) {
                n.A(this.f23661w.getApplicationContext(), r.f60070c, false);
                return v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f23660y = context;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f23660y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23658w;
            if (i10 == 0) {
                m.b(obj);
                xo.w<MRError> j10 = FloatingControlEditView.this.getStore().j();
                a aVar = new a(this.f23660y);
                this.f23658w = 1;
                if (j10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.l<View, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Context f23662w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(1);
            this.f23662w = context;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            new dc.g(this.f23662w).v();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.l<t, v> {
        public d() {
            super(1);
        }

        public final void a(t tVar) {
            jo.p.h(tVar, "bindModel");
            if (tVar.i()) {
                FloatingControlEditView.this.getActionCreator().h(null, null);
            } else {
                FloatingControlEditView.this.getActionCreator().h(Integer.valueOf(tVar.d()), tVar.c());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(t tVar) {
            a(tVar);
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.floating.control.FloatingControlEditView$9", f = "FloatingControlEditView.kt", l = {217}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23664w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Context f23666y;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ Context f23667w;

            public a(Context context) {
                this.f23667w = context;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super v> dVar) {
                n.A(this.f23667w.getApplicationContext(), r.f60070c, false);
                return v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f23666y = context;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f23666y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23664w;
            if (i10 == 0) {
                m.b(obj);
                xo.c<MRError> k10 = FloatingControlEditView.this.getStore().k();
                a aVar = new a(this.f23666y);
                this.f23664w = 1;
                if (k10.a(aVar, this) == c10) {
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
    public interface f {
        void a();
    }

    /* loaded from: classes2.dex */
    public static final class g extends q implements io.l<c.a, v> {
        public g() {
            super(1);
        }

        public final void a(c.a aVar) {
            jo.p.h(aVar, "info");
            FloatingControlEditView.this.getActionCreator().f(aVar);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(c.a aVar) {
            a(aVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends q implements io.a<fc.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f23669w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23670x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23671y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f23669w = aVar;
            this.f23670x = aVar2;
            this.f23671y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, fc.a] */
        @Override // io.a
        public final fc.a invoke() {
            xq.a b10;
            oq.a aVar = this.f23669w;
            vq.a aVar2 = this.f23670x;
            io.a<? extends uq.a> aVar3 = this.f23671y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(fc.a.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends q implements io.a<fc.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f23672w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23673x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23674y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f23672w = aVar;
            this.f23673x = aVar2;
            this.f23674y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, fc.f] */
        @Override // io.a
        public final fc.f invoke() {
            xq.a b10;
            oq.a aVar = this.f23672w;
            vq.a aVar2 = this.f23673x;
            io.a<? extends uq.a> aVar3 = this.f23674y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(fc.f.class), aVar2, aVar3);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FloatingControlEditView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        jo.p.h(context, "context");
    }

    public /* synthetic */ FloatingControlEditView(Context context, AttributeSet attributeSet, int i10, int i11, jo.h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fc.a getActionCreator() {
        return (fc.a) this.f23647w.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fc.f getStore() {
        return (fc.f) this.f23648x.getValue();
    }

    public static final void j(FloatingControlEditView floatingControlEditView, View view) {
        jo.p.h(floatingControlEditView, "this$0");
        floatingControlEditView.getActionCreator().g(null);
    }

    public static final boolean k(FloatingControlEditView floatingControlEditView, TextView textView, int i10, KeyEvent keyEvent) {
        jo.p.h(floatingControlEditView, "this$0");
        f fVar = floatingControlEditView.D;
        if (fVar != null) {
            fVar.a();
            return true;
        }
        return true;
    }

    public static final boolean l(Context context, FloatingControlEditView floatingControlEditView, TextView textView, int i10, KeyEvent keyEvent) {
        jo.p.h(context, "$context");
        jo.p.h(floatingControlEditView, "this$0");
        if (i10 == 3) {
            j.f45405a.c(context, floatingControlEditView.B.Q);
            floatingControlEditView.getActionCreator().e(Referer.Broadcast.SETTING, floatingControlEditView.B.Q.getText().toString());
            return true;
        }
        return true;
    }

    public static final void m(FloatingControlEditView floatingControlEditView, View view, boolean z10) {
        jo.p.h(floatingControlEditView, "this$0");
        jo.p.h(view, "v");
        InputMethodManager inputMethodManager = floatingControlEditView.C;
        if (inputMethodManager == null) {
            return;
        }
        if (!z10) {
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 1);
                return;
            }
            return;
        }
        EditText editText = floatingControlEditView.B.S;
        editText.setSelection(editText.length(), floatingControlEditView.B.S.length());
        InputMethodManager inputMethodManager2 = floatingControlEditView.C;
        if (inputMethodManager2 != null) {
            inputMethodManager2.toggleSoftInput(1, 1);
        }
        InputMethodManager inputMethodManager3 = floatingControlEditView.C;
        if (inputMethodManager3 != null) {
            inputMethodManager3.showSoftInput(view, 1);
        }
    }

    public static final void r(FloatingControlEditView floatingControlEditView, fc.d dVar, w wVar) {
        jo.p.h(floatingControlEditView, "this$0");
        jo.p.h(dVar, "$adapter");
        if (wVar != null && !TextUtils.isEmpty(wVar.b())) {
            AppCompatImageView appCompatImageView = floatingControlEditView.B.B;
            jo.p.g(appCompatImageView, "binding.appCurrentIcon");
            td.a.o(appCompatImageView, wVar.a(), 0, 4, null);
            floatingControlEditView.B.C.setText(wVar.c());
            dVar.l(wVar.b());
            dVar.notifyDataSetChanged();
        } else {
            floatingControlEditView.B.B.setImageResource(xb.q.logo_gray);
            floatingControlEditView.B.C.setText(r.text_appsetting_during_cast_none);
            dVar.l("");
            dVar.notifyDataSetChanged();
        }
        floatingControlEditView.getActionCreator().d(wVar != null ? wVar.b() : null);
    }

    public static final void s(FloatingControlEditView floatingControlEditView, List list) {
        jo.p.h(floatingControlEditView, "this$0");
        if (list.isEmpty()) {
            floatingControlEditView.B.J.setVisibility(8);
            floatingControlEditView.B.P.setVisibility(8);
            return;
        }
        floatingControlEditView.B.J.setVisibility(0);
        floatingControlEditView.B.P.setVisibility(0);
        RecyclerView.h adapter = floatingControlEditView.B.P.getAdapter();
        xb.w wVar = adapter instanceof xb.w ? (xb.w) adapter : null;
        if (wVar != null) {
            wVar.d(list);
        }
    }

    public static final void t(FloatingControlEditView floatingControlEditView, t tVar) {
        jo.p.h(floatingControlEditView, "this$0");
        if (tVar != null) {
            floatingControlEditView.B.O.setVisibility(0);
            floatingControlEditView.B.N.setVisibility(0);
            floatingControlEditView.B.O.setText(tVar.h());
            floatingControlEditView.B.N.setText(tVar.g());
            return;
        }
        floatingControlEditView.B.O.setVisibility(8);
        floatingControlEditView.B.N.setVisibility(8);
    }

    public static final void u(FloatingControlEditView floatingControlEditView, fc.d dVar, List list) {
        jo.p.h(floatingControlEditView, "this$0");
        jo.p.h(dVar, "$adapter");
        if (of.b.a(list)) {
            of.t.f(floatingControlEditView.A, 8);
            floatingControlEditView.B.B.setImageResource(xb.q.logo_gray);
            floatingControlEditView.B.C.setText(r.text_appsetting_broadcast_desc_no_app);
            return;
        }
        of.t.f(floatingControlEditView.A, 0);
        w selectedApp = floatingControlEditView.getSelectedApp();
        dVar.l((selectedApp == null || (r2 = selectedApp.b()) == null) ? "" : "");
        dVar.d(list);
    }

    public final int getAppsVisibility() {
        return this.B.E.getVisibility();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return g1.c().plus(this.f23650z);
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    public final f getOnActionListener() {
        return this.D;
    }

    public final w getSelectedApp() {
        w f10 = getStore().o().f();
        return f10 == null ? new w("", "", "", "") : f10;
    }

    public final CharSequence getTitle() {
        return this.B.S.getText().toString();
    }

    public final void q() {
        r0.d(this, null, 1, null);
    }

    public final void setAppInfoList(List<c.a> list) {
        jo.p.h(list, "appInfoList");
        getActionCreator().i(list);
    }

    public final void setAppsVisibility(int i10) {
        this.B.E.setVisibility(i10);
    }

    public final void setOnActionListener(f fVar) {
        this.D = fVar;
    }

    public final void setSelectedApp(w wVar) {
        this.f23649y = wVar;
        getActionCreator().g(wVar);
    }

    public final void setTitle(CharSequence charSequence) {
        this.B.S.setText(charSequence);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingControlEditView(final Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b0 b10;
        jo.p.h(context, "context");
        cr.a aVar = cr.a.f28611a;
        this.f23647w = wn.g.b(aVar.b(), new h(this, null, null));
        this.f23648x = wn.g.b(aVar.b(), new i(this, null, null));
        b10 = i2.b(null, 1, null);
        this.f23650z = b10;
        ArrayList arrayList = new ArrayList();
        this.A = arrayList;
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(context), xb.p.floating_control_edit, this, true);
        jo.p.g(e10, "inflate(\n        LayoutI… this,\n        true\n    )");
        q1 q1Var = (q1) e10;
        this.B = q1Var;
        View view = q1Var.D;
        jo.p.g(view, "binding.appDivider");
        arrayList.add(view);
        AppCompatTextView appCompatTextView = q1Var.I;
        jo.p.g(appCompatTextView, "binding.appSetNone");
        arrayList.add(appCompatTextView);
        RecyclerView recyclerView = q1Var.G;
        jo.p.g(recyclerView, "binding.appList");
        arrayList.add(recyclerView);
        q1Var.I.setOnClickListener(new View.OnClickListener() { // from class: fc.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FloatingControlEditView.j(FloatingControlEditView.this, view2);
            }
        });
        q1Var.S.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: fc.j
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean k10;
                k10 = FloatingControlEditView.k(FloatingControlEditView.this, textView, i11, keyEvent);
                return k10;
            }
        });
        q1Var.Q.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: fc.i
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean l10;
                l10 = FloatingControlEditView.l(context, this, textView, i11, keyEvent);
                return l10;
            }
        });
        Object systemService = context.getSystemService("input_method");
        jo.p.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        this.C = (InputMethodManager) systemService;
        q1Var.S.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: fc.h
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                FloatingControlEditView.m(FloatingControlEditView.this, view2, z10);
            }
        });
        EditText editText = q1Var.S;
        String string = getResources().getString(r.limit_live_title);
        jo.p.g(string, "resources.getString(R.string.limit_live_title)");
        editText.setFilters(new InputFilter[]{new sf.b(Integer.parseInt(string))});
        final fc.d dVar = new fc.d();
        w selectedApp = getSelectedApp();
        dVar.l((selectedApp == null || (r1 = selectedApp.b()) == null) ? "" : "");
        dVar.k(new g());
        AppCompatImageView appCompatImageView = q1Var.K;
        jo.p.g(appCompatImageView, "binding.focusEventHeaderImageView");
        yd.g1.a(appCompatImageView, new c(context));
        q1Var.P.setLayoutManager(new LinearLayoutManager(context, 0, false));
        q1Var.P.g(new p001if.c(de.n.b(this, 10), 0, 0, 0, 0, 0));
        RecyclerView recyclerView2 = q1Var.P;
        xb.w wVar = new xb.w();
        wVar.h(new d());
        recyclerView2.setAdapter(wVar);
        RecyclerView recyclerView3 = q1Var.G;
        recyclerView3.setLayoutManager(new GridLayoutManager(context, 4));
        recyclerView3.setAdapter(dVar);
        Context context2 = q1Var.u().getContext();
        u uVar = context2 instanceof u ? (u) context2 : null;
        if (uVar != null) {
            getStore().i().i(uVar, new androidx.lifecycle.f0() { // from class: fc.n
                @Override // androidx.lifecycle.f0
                public final void d(Object obj) {
                    FloatingControlEditView.u(FloatingControlEditView.this, dVar, (List) obj);
                }
            });
            getStore().o().i(uVar, new androidx.lifecycle.f0() { // from class: fc.m
                @Override // androidx.lifecycle.f0
                public final void d(Object obj) {
                    FloatingControlEditView.r(FloatingControlEditView.this, dVar, (w) obj);
                }
            });
            getStore().l().i(uVar, new androidx.lifecycle.f0() { // from class: fc.l
                @Override // androidx.lifecycle.f0
                public final void d(Object obj) {
                    FloatingControlEditView.s(FloatingControlEditView.this, (List) obj);
                }
            });
            getStore().n().i(uVar, new androidx.lifecycle.f0() { // from class: fc.k
                @Override // androidx.lifecycle.f0
                public final void d(Object obj) {
                    FloatingControlEditView.t(FloatingControlEditView.this, (t) obj);
                }
            });
        }
        uo.l.d(this, null, null, new e(context, null), 3, null);
        uo.l.d(this, null, null, new a(null), 3, null);
        uo.l.d(this, null, null, new b(context, null), 3, null);
        of.t tVar = of.t.f45427a;
        EditText editText2 = q1Var.S;
        jo.p.g(editText2, "binding.titleEdit");
        tVar.d(editText2, 4);
    }
}
