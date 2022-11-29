package hb;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.player.gifting.FocusedGiftView;
import com.dena.mirrorman.fragment.PlayerCommentFragment;
import com.dena.mirrorman.net.glide.GlideApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o3.p0;
import uo.d2;
import uo.i2;

/* loaded from: classes2.dex */
public final class f1 extends androidx.fragment.app.e {
    public static final a W0 = new a(null);
    public static final int X0 = 8;
    public kb.t N0;
    public final wn.f O0;
    public final wn.f P0;
    public final uo.b0 Q0;
    public lb.l R0;
    public b S0;
    public List<jf.q> T0;
    public String U0;
    public String V0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final f1 a(String str, String str2, String str3) {
            jo.p.h(str, "inputComment");
            jo.p.h(str2, "liveId");
            jo.p.h(str3, "referer");
            f1 f1Var = new f1();
            Bundle bundle = new Bundle();
            bundle.putString("inputComment", str);
            bundle.putString("liveId", str2);
            bundle.putString("referer", str3);
            f1Var.V2(bundle);
            return f1Var;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void c2(String str);

        void j1(String str);
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.p<Integer, KeyEvent, wn.v> {
        public c() {
            super(2);
        }

        public final void a(int i10, KeyEvent keyEvent) {
            jo.p.h(keyEvent, "event");
            if (i10 == 4 && keyEvent.getAction() == 1) {
                f1.this.m3();
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num, KeyEvent keyEvent) {
            a(num.intValue(), keyEvent);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements TextWatcher {
        public d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            f1 f1Var = f1.this;
            kb.t tVar = f1Var.N0;
            kb.t tVar2 = null;
            if (tVar == null) {
                jo.p.v("binding");
                tVar = null;
            }
            boolean z10 = false;
            if (tVar.C.getText() != null) {
                kb.t tVar3 = f1.this.N0;
                if (tVar3 == null) {
                    jo.p.v("binding");
                } else {
                    tVar2 = tVar3;
                }
                Editable text = tVar2.C.getText();
                jo.p.e(text);
                if (!so.n.r(text)) {
                    z10 = true;
                }
            }
            f1Var.e4(z10);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.l<jf.q, wn.v> {
        public e() {
            super(1);
        }

        public final void a(jf.q qVar) {
            lb.l lVar = f1.this.R0;
            if (lVar != null) {
                lVar.h1(qVar);
            }
            f1.this.f4(true);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(jf.q qVar) {
            a(qVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<i> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f34785w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f34786x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f34787y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f34785w = componentCallbacks;
            this.f34786x = aVar;
            this.f34787y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hb.i, java.lang.Object] */
        @Override // io.a
        public final i invoke() {
            ComponentCallbacks componentCallbacks = this.f34785w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(i.class), this.f34786x, this.f34787y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<nf.z> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f34788w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f34789x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f34790y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f34788w = componentCallbacks;
            this.f34789x = aVar;
            this.f34790y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.z, java.lang.Object] */
        @Override // io.a
        public final nf.z invoke() {
            ComponentCallbacks componentCallbacks = this.f34788w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.z.class), this.f34789x, this.f34790y);
        }
    }

    public f1() {
        uo.b0 b10;
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.O0 = wn.g.b(iVar, new f(this, null, null));
        this.P0 = wn.g.b(iVar, new g(this, null, null));
        b10 = i2.b(null, 1, null);
        this.Q0 = b10;
    }

    public static final boolean U3(f1 f1Var, TextView textView, int i10, KeyEvent keyEvent) {
        jo.p.h(f1Var, "this$0");
        if (i10 == 4) {
            f1Var.c4();
            return true;
        }
        return false;
    }

    public static final void V3(f1 f1Var, View view) {
        jo.p.h(f1Var, "this$0");
        jo.p.h(view, "view");
        if (f1Var.O3() != null) {
            f1Var.f4(true);
        } else {
            f1Var.N3(view);
        }
    }

    public static final void W3(View view) {
    }

    public static final void X3(f1 f1Var, List list) {
        jo.p.h(f1Var, "this$0");
        jo.p.h(list, "$focusedGifts");
        if (f1Var.O0().getConfiguration().orientation != 2) {
            return;
        }
        kb.t tVar = f1Var.N0;
        kb.t tVar2 = null;
        if (tVar == null) {
            jo.p.v("binding");
            tVar = null;
        }
        if (tVar.L.getTop() < 0) {
            androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
            kb.t tVar3 = f1Var.N0;
            if (tVar3 == null) {
                jo.p.v("binding");
                tVar3 = null;
            }
            cVar.g(tVar3.G);
            kb.t tVar4 = f1Var.N0;
            if (tVar4 == null) {
                jo.p.v("binding");
                tVar4 = null;
            }
            cVar.e(tVar4.L.getId(), 4);
            kb.t tVar5 = f1Var.N0;
            if (tVar5 == null) {
                jo.p.v("binding");
                tVar5 = null;
            }
            int id2 = tVar5.L.getId();
            kb.t tVar6 = f1Var.N0;
            if (tVar6 == null) {
                jo.p.v("binding");
                tVar6 = null;
            }
            cVar.i(id2, 3, tVar6.S.getId(), 3);
            kb.t tVar7 = f1Var.N0;
            if (tVar7 == null) {
                jo.p.v("binding");
                tVar7 = null;
            }
            cVar.c(tVar7.G);
        }
        ArrayList arrayList = new ArrayList(xn.t.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((FocusedGiftView) it.next()).getTop()));
        }
        Integer num = (Integer) xn.a0.m0(arrayList);
        if (num == null || num.intValue() >= 0) {
            return;
        }
        androidx.constraintlayout.widget.c cVar2 = new androidx.constraintlayout.widget.c();
        kb.t tVar8 = f1Var.N0;
        if (tVar8 == null) {
            jo.p.v("binding");
            tVar8 = null;
        }
        cVar2.g(tVar8.G);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            FocusedGiftView focusedGiftView = (FocusedGiftView) it2.next();
            cVar2.e(focusedGiftView.getId(), 4);
            cVar2.e(focusedGiftView.getId(), 3);
            int id3 = focusedGiftView.getId();
            kb.t tVar9 = f1Var.N0;
            if (tVar9 == null) {
                jo.p.v("binding");
                tVar9 = null;
            }
            cVar2.i(id3, 3, tVar9.S.getId(), 3);
        }
        kb.t tVar10 = f1Var.N0;
        if (tVar10 == null) {
            jo.p.v("binding");
        } else {
            tVar2 = tVar10;
        }
        cVar2.c(tVar2.G);
    }

    public static final void Y3(f1 f1Var, View view) {
        jo.p.h(f1Var, "this$0");
        f1Var.n3();
    }

    public static final void Z3(f1 f1Var, View view) {
        jo.p.h(f1Var, "this$0");
        f1Var.c4();
    }

    public static final o3.p0 a4(f1 f1Var, View view, o3.p0 p0Var) {
        jo.p.h(f1Var, "this$0");
        if (p0Var.q(p0.m.c())) {
            kb.t tVar = f1Var.N0;
            if (tVar == null) {
                jo.p.v("binding");
                tVar = null;
            }
            if (tVar.L.getVisibility() == 0) {
                f1Var.Q3().r(0);
            }
        }
        return p0Var;
    }

    public static final void b4(f1 f1Var, jf.f fVar) {
        jo.p.h(f1Var, "this$0");
        kb.t tVar = f1Var.N0;
        kb.t tVar2 = null;
        if (tVar == null) {
            jo.p.v("binding");
            tVar = null;
        }
        FocusedGiftView focusedGiftView = tVar.H;
        jo.p.g(fVar, "it");
        focusedGiftView.setCoinNum(fVar);
        kb.t tVar3 = f1Var.N0;
        if (tVar3 == null) {
            jo.p.v("binding");
            tVar3 = null;
        }
        tVar3.I.setCoinNum(fVar);
        kb.t tVar4 = f1Var.N0;
        if (tVar4 == null) {
            jo.p.v("binding");
            tVar4 = null;
        }
        tVar4.J.setCoinNum(fVar);
        kb.t tVar5 = f1Var.N0;
        if (tVar5 == null) {
            jo.p.v("binding");
        } else {
            tVar2 = tVar5;
        }
        tVar2.K.setCoinNum(fVar);
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        kb.t tVar = null;
        ViewDataBinding e10 = androidx.databinding.f.e(layoutInflater, x1.fragment_player_comment_gift, null, false);
        jo.p.g(e10, "inflate(inflater, R.layo…omment_gift, null, false)");
        kb.t tVar2 = (kb.t) e10;
        this.N0 = tVar2;
        if (tVar2 == null) {
            jo.p.v("binding");
        } else {
            tVar = tVar2;
        }
        View u10 = tVar.u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    @Override // androidx.fragment.app.Fragment
    public void F1() {
        kb.t tVar = this.N0;
        if (tVar == null) {
            jo.p.v("binding");
            tVar = null;
        }
        tVar.C.clearFocus();
        d2.a.a(this.Q0, null, 1, null);
        b bVar = this.S0;
        if (bVar != null) {
            bVar.j1(P3());
        }
        super.F1();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        super.I1();
        this.R0 = null;
        this.S0 = null;
    }

    public final void M3() {
        d4("");
        kb.t tVar = this.N0;
        if (tVar == null) {
            jo.p.v("binding");
            tVar = null;
        }
        tVar.C.getEditableText().clear();
    }

    public final void N3(View view) {
        kb.t tVar = this.N0;
        kb.t tVar2 = null;
        if (tVar == null) {
            jo.p.v("binding");
            tVar = null;
        }
        tVar.L.setVisibility(4);
        kb.t tVar3 = this.N0;
        if (tVar3 == null) {
            jo.p.v("binding");
            tVar3 = null;
        }
        tVar3.M.setVisibility(0);
        f4(false);
        kb.t tVar4 = this.N0;
        if (tVar4 == null) {
            jo.p.v("binding");
            tVar4 = null;
        }
        if (jo.p.c(view, tVar4.N)) {
            kb.t tVar5 = this.N0;
            if (tVar5 == null) {
                jo.p.v("binding");
            } else {
                tVar2 = tVar5;
            }
            tVar2.H.setVisibility(0);
            return;
        }
        kb.t tVar6 = this.N0;
        if (tVar6 == null) {
            jo.p.v("binding");
            tVar6 = null;
        }
        if (jo.p.c(view, tVar6.O)) {
            kb.t tVar7 = this.N0;
            if (tVar7 == null) {
                jo.p.v("binding");
            } else {
                tVar2 = tVar7;
            }
            tVar2.I.setVisibility(0);
            return;
        }
        kb.t tVar8 = this.N0;
        if (tVar8 == null) {
            jo.p.v("binding");
            tVar8 = null;
        }
        if (jo.p.c(view, tVar8.P)) {
            kb.t tVar9 = this.N0;
            if (tVar9 == null) {
                jo.p.v("binding");
            } else {
                tVar2 = tVar9;
            }
            tVar2.J.setVisibility(0);
            return;
        }
        kb.t tVar10 = this.N0;
        if (tVar10 == null) {
            jo.p.v("binding");
            tVar10 = null;
        }
        if (jo.p.c(view, tVar10.Q)) {
            kb.t tVar11 = this.N0;
            if (tVar11 == null) {
                jo.p.v("binding");
            } else {
                tVar2 = tVar11;
            }
            tVar2.K.setVisibility(0);
        }
    }

    public final FocusedGiftView O3() {
        FocusedGiftView[] focusedGiftViewArr = new FocusedGiftView[4];
        kb.t tVar = this.N0;
        if (tVar == null) {
            jo.p.v("binding");
            tVar = null;
        }
        focusedGiftViewArr[0] = tVar.H;
        kb.t tVar2 = this.N0;
        if (tVar2 == null) {
            jo.p.v("binding");
            tVar2 = null;
        }
        focusedGiftViewArr[1] = tVar2.I;
        kb.t tVar3 = this.N0;
        if (tVar3 == null) {
            jo.p.v("binding");
            tVar3 = null;
        }
        focusedGiftViewArr[2] = tVar3.J;
        kb.t tVar4 = this.N0;
        if (tVar4 == null) {
            jo.p.v("binding");
            tVar4 = null;
        }
        focusedGiftViewArr[3] = tVar4.K;
        for (FocusedGiftView focusedGiftView : xn.s.m(focusedGiftViewArr)) {
            if (focusedGiftView.getVisibility() == 0) {
                return focusedGiftView;
            }
        }
        return null;
    }

    public final String P3() {
        kb.t tVar = this.N0;
        if (tVar == null) {
            return "";
        }
        if (tVar == null) {
            jo.p.v("binding");
            tVar = null;
        }
        return String.valueOf(tVar.C.getText());
    }

    public final i Q3() {
        return (i) this.O0.getValue();
    }

    public final nf.z R3() {
        return (nf.z) this.P0.getValue();
    }

    public final void S3(List<jf.q> list) {
        this.T0 = list;
    }

    public final void T3() {
        FocusedGiftView[] focusedGiftViewArr = new FocusedGiftView[4];
        kb.t tVar = this.N0;
        kb.t tVar2 = null;
        if (tVar == null) {
            jo.p.v("binding");
            tVar = null;
        }
        focusedGiftViewArr[0] = tVar.H;
        kb.t tVar3 = this.N0;
        if (tVar3 == null) {
            jo.p.v("binding");
            tVar3 = null;
        }
        focusedGiftViewArr[1] = tVar3.I;
        kb.t tVar4 = this.N0;
        if (tVar4 == null) {
            jo.p.v("binding");
            tVar4 = null;
        }
        focusedGiftViewArr[2] = tVar4.J;
        kb.t tVar5 = this.N0;
        if (tVar5 == null) {
            jo.p.v("binding");
            tVar5 = null;
        }
        focusedGiftViewArr[3] = tVar5.K;
        final List m10 = xn.s.m(focusedGiftViewArr);
        kb.t tVar6 = this.N0;
        if (tVar6 == null) {
            jo.p.v("binding");
            tVar6 = null;
        }
        tVar6.S.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: hb.b1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                f1.X3(f1.this, m10);
            }
        });
        kb.t tVar7 = this.N0;
        if (tVar7 == null) {
            jo.p.v("binding");
            tVar7 = null;
        }
        tVar7.S.setOnClickListener(new View.OnClickListener() { // from class: hb.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f1.Y3(f1.this, view);
            }
        });
        kb.t tVar8 = this.N0;
        if (tVar8 == null) {
            jo.p.v("binding");
            tVar8 = null;
        }
        tVar8.T.setOnClickListener(new View.OnClickListener() { // from class: hb.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f1.Z3(f1.this, view);
            }
        });
        kb.t tVar9 = this.N0;
        if (tVar9 == null) {
            jo.p.v("binding");
            tVar9 = null;
        }
        tVar9.C.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: hb.c1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                boolean U3;
                U3 = f1.U3(f1.this, textView, i10, keyEvent);
                return U3;
            }
        });
        kb.t tVar10 = this.N0;
        if (tVar10 == null) {
            jo.p.v("binding");
            tVar10 = null;
        }
        tVar10.C.setOnKeyPreImeListener(new c());
        kb.t tVar11 = this.N0;
        if (tVar11 == null) {
            jo.p.v("binding");
            tVar11 = null;
        }
        tVar11.C.addTextChangedListener(new d());
        List<jf.q> list = this.T0;
        if (list == null || list.isEmpty()) {
            kb.t tVar12 = this.N0;
            if (tVar12 == null) {
                jo.p.v("binding");
                tVar12 = null;
            }
            tVar12.L.setVisibility(8);
            kb.t tVar13 = this.N0;
            if (tVar13 == null) {
                jo.p.v("binding");
                tVar13 = null;
            }
            tVar13.N.setVisibility(8);
            kb.t tVar14 = this.N0;
            if (tVar14 == null) {
                jo.p.v("binding");
                tVar14 = null;
            }
            tVar14.O.setVisibility(8);
            kb.t tVar15 = this.N0;
            if (tVar15 == null) {
                jo.p.v("binding");
                tVar15 = null;
            }
            tVar15.P.setVisibility(8);
            kb.t tVar16 = this.N0;
            if (tVar16 == null) {
                jo.p.v("binding");
            } else {
                tVar2 = tVar16;
            }
            tVar2.Q.setVisibility(8);
            return;
        }
        List<jf.q> list2 = this.T0;
        if (list2 != null) {
            e eVar = new e();
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: hb.y0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f1.V3(f1.this, view);
                }
            };
            int size = list2.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 == 0) {
                    kb.t tVar17 = this.N0;
                    if (tVar17 == null) {
                        jo.p.v("binding");
                        tVar17 = null;
                    }
                    AppCompatImageView appCompatImageView = tVar17.N;
                    GlideApp.with(appCompatImageView).load(list2.get(0).i()).into(appCompatImageView);
                    appCompatImageView.setOnClickListener(onClickListener);
                    kb.t tVar18 = this.N0;
                    if (tVar18 == null) {
                        jo.p.v("binding");
                        tVar18 = null;
                    }
                    FocusedGiftView focusedGiftView = tVar18.H;
                    focusedGiftView.setGiftCellClickedListener(this.R0);
                    focusedGiftView.setGift(list2.get(0));
                    focusedGiftView.setOnAnimationEnd(eVar);
                } else if (i10 == 1) {
                    kb.t tVar19 = this.N0;
                    if (tVar19 == null) {
                        jo.p.v("binding");
                        tVar19 = null;
                    }
                    AppCompatImageView appCompatImageView2 = tVar19.O;
                    GlideApp.with(appCompatImageView2).load(list2.get(1).i()).into(appCompatImageView2);
                    appCompatImageView2.setOnClickListener(onClickListener);
                    kb.t tVar20 = this.N0;
                    if (tVar20 == null) {
                        jo.p.v("binding");
                        tVar20 = null;
                    }
                    FocusedGiftView focusedGiftView2 = tVar20.I;
                    focusedGiftView2.setGiftCellClickedListener(this.R0);
                    focusedGiftView2.setGift(list2.get(1));
                    focusedGiftView2.setOnAnimationEnd(eVar);
                } else if (i10 == 2) {
                    kb.t tVar21 = this.N0;
                    if (tVar21 == null) {
                        jo.p.v("binding");
                        tVar21 = null;
                    }
                    AppCompatImageView appCompatImageView3 = tVar21.P;
                    GlideApp.with(appCompatImageView3).load(list2.get(2).i()).into(appCompatImageView3);
                    appCompatImageView3.setOnClickListener(onClickListener);
                    kb.t tVar22 = this.N0;
                    if (tVar22 == null) {
                        jo.p.v("binding");
                        tVar22 = null;
                    }
                    FocusedGiftView focusedGiftView3 = tVar22.J;
                    focusedGiftView3.setGiftCellClickedListener(this.R0);
                    focusedGiftView3.setGift(list2.get(2));
                    focusedGiftView3.setOnAnimationEnd(eVar);
                } else if (i10 != 3) {
                    return;
                } else {
                    kb.t tVar23 = this.N0;
                    if (tVar23 == null) {
                        jo.p.v("binding");
                        tVar23 = null;
                    }
                    AppCompatImageView appCompatImageView4 = tVar23.Q;
                    GlideApp.with(appCompatImageView4).load(list2.get(3).i()).into(appCompatImageView4);
                    appCompatImageView4.setOnClickListener(onClickListener);
                    kb.t tVar24 = this.N0;
                    if (tVar24 == null) {
                        jo.p.v("binding");
                        tVar24 = null;
                    }
                    FocusedGiftView focusedGiftView4 = tVar24.K;
                    focusedGiftView4.setGiftCellClickedListener(this.R0);
                    focusedGiftView4.setGift(list2.get(3));
                    focusedGiftView4.setOnAnimationEnd(eVar);
                }
            }
        }
        kb.t tVar25 = this.N0;
        if (tVar25 == null) {
            jo.p.v("binding");
        } else {
            tVar2 = tVar25;
        }
        tVar2.L.setOnClickListener(a1.f34704w);
    }

    @Override // androidx.fragment.app.Fragment
    public void Z1() {
        super.Z1();
        Dialog p32 = p3();
        kb.t tVar = null;
        Window window = p32 != null ? p32.getWindow() : null;
        jo.p.e(window);
        window.setSoftInputMode(5);
        kb.t tVar2 = this.N0;
        if (tVar2 == null) {
            jo.p.v("binding");
        } else {
            tVar = tVar2;
        }
        tVar.C.requestFocus();
    }

    public final void c4() {
        kb.t tVar = this.N0;
        if (tVar == null) {
            jo.p.v("binding");
            tVar = null;
        }
        String valueOf = String.valueOf(tVar.C.getText());
        if (TextUtils.isEmpty(valueOf)) {
            return;
        }
        M3();
        b bVar = this.S0;
        if (bVar != null) {
            bVar.c2(valueOf);
        }
        m3();
    }

    public final void d4(String str) {
        e4(!so.n.r(str));
        kb.t tVar = this.N0;
        if (tVar == null) {
            jo.p.v("binding");
            tVar = null;
        }
        tVar.C.setText(str);
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        String string = M2().getString("inputComment");
        jo.p.e(string);
        d4(string);
        this.U0 = M2().getString("liveId");
        this.V0 = M2().getString("referer");
        T3();
        p0().k().r(w1.f35000f0, PlayerCommentFragment.a.b(PlayerCommentFragment.D0, false, false, null, 6, null)).i();
        kb.t tVar = this.N0;
        if (tVar == null) {
            jo.p.v("binding");
            tVar = null;
        }
        o3.c0.F0(tVar.G, new o3.v() { // from class: hb.e1
            @Override // o3.v
            public final o3.p0 a(View view2, o3.p0 p0Var) {
                o3.p0 a42;
                a42 = f1.a4(f1.this, view2, p0Var);
                return a42;
            }
        });
        R3().h0().i(a1(), new androidx.lifecycle.f0() { // from class: hb.d1
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                f1.b4(f1.this, (jf.f) obj);
            }
        });
    }

    public final void e4(boolean z10) {
        kb.t tVar = this.N0;
        if (tVar == null) {
            return;
        }
        kb.t tVar2 = null;
        if (tVar == null) {
            jo.p.v("binding");
            tVar = null;
        }
        tVar.T.setAlpha(z10 ? 1.0f : 0.5f);
        kb.t tVar3 = this.N0;
        if (tVar3 == null) {
            jo.p.v("binding");
        } else {
            tVar2 = tVar3;
        }
        tVar2.T.setEnabled(z10);
    }

    public final void f4(boolean z10) {
        kb.t tVar = this.N0;
        kb.t tVar2 = null;
        if (tVar == null) {
            jo.p.v("binding");
            tVar = null;
        }
        tVar.H.setVisibility(8);
        kb.t tVar3 = this.N0;
        if (tVar3 == null) {
            jo.p.v("binding");
            tVar3 = null;
        }
        tVar3.I.setVisibility(8);
        kb.t tVar4 = this.N0;
        if (tVar4 == null) {
            jo.p.v("binding");
            tVar4 = null;
        }
        tVar4.J.setVisibility(8);
        kb.t tVar5 = this.N0;
        if (tVar5 == null) {
            jo.p.v("binding");
            tVar5 = null;
        }
        tVar5.K.setVisibility(8);
        if (z10) {
            kb.t tVar6 = this.N0;
            if (tVar6 == null) {
                jo.p.v("binding");
                tVar6 = null;
            }
            tVar6.L.setVisibility(0);
            kb.t tVar7 = this.N0;
            if (tVar7 == null) {
                jo.p.v("binding");
            } else {
                tVar2 = tVar7;
            }
            tVar2.M.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), 16973913);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void t1(Bundle bundle) {
        Window window;
        super.t1(bundle);
        Dialog p32 = p3();
        if (p32 != null) {
            p32.setCancelable(true);
        }
        Dialog p33 = p3();
        if (p33 != null) {
            p33.setCanceledOnTouchOutside(true);
        }
        Dialog p34 = p3();
        if (p34 == null || (window = p34.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.R0 = context instanceof lb.l ? (lb.l) context : null;
        this.S0 = context instanceof b ? (b) context : null;
    }
}
