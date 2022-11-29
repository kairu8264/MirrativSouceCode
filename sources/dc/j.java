package dc;

import ac.f2;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import ec.z;
import ef.a;
import java.util.List;
import jo.f0;
import oq.a;
import uo.q0;
import uo.r0;
import yd.g1;

/* loaded from: classes2.dex */
public final class j extends sd.a implements oq.a, q0 {
    public final /* synthetic */ da.j G;
    public final wn.f H;
    public final wn.f I;
    public final wn.f J;
    public final f2 K;
    public final Point L;
    public final Rect M;
    public String N;

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f29408w = new a();

        public a() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            dq.c.c().l(new ce.s());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f29409a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29410b;

        public b(int i10, int i11) {
            this.f29409a = i10;
            this.f29410b = i11;
        }

        public final int a() {
            return this.f29409a;
        }

        public final int b() {
            return this.f29410b;
        }
    }

    /* loaded from: classes2.dex */
    public final class c implements View.OnTouchListener {
        public c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            jo.p.h(view, "v");
            jo.p.h(motionEvent, "event");
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                j.this.s((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
            } else if (actionMasked != 1) {
                if (actionMasked == 2) {
                    j.this.m((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                } else if (actionMasked == 3) {
                    j.this.setMoved(false);
                } else if (actionMasked != 4) {
                    return false;
                }
            } else if (!j.this.o()) {
                int id2 = view.getId();
                if (id2 == xb.o.mic_image_view) {
                    dq.c.c().l(new nd.h(false));
                } else if (id2 == xb.o.video_status_text_view) {
                    j.this.getCastServiceActionCreator().U(false);
                }
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements ViewTreeObserver.OnGlobalLayoutListener {
        public d() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            j.this.t();
            j.this.K.E.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<od.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f29414w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f29415x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f29416y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f29414w = aVar;
            this.f29415x = aVar2;
            this.f29416y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.b] */
        @Override // io.a
        public final od.b invoke() {
            xq.a b10;
            oq.a aVar = this.f29414w;
            vq.a aVar2 = this.f29415x;
            io.a<? extends uq.a> aVar3 = this.f29416y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(od.b.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<nf.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f29417w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f29418x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f29419y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f29417w = aVar;
            this.f29418x = aVar2;
            this.f29419y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.c] */
        @Override // io.a
        public final nf.c invoke() {
            xq.a b10;
            oq.a aVar = this.f29417w;
            vq.a aVar2 = this.f29418x;
            io.a<? extends uq.a> aVar3 = this.f29419y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(nf.c.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<ef.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f29420w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f29421x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f29422y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f29420w = aVar;
            this.f29421x = aVar2;
            this.f29422y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ef.a] */
        @Override // io.a
        public final ef.a invoke() {
            xq.a b10;
            oq.a aVar = this.f29420w;
            vq.a aVar2 = this.f29421x;
            io.a<? extends uq.a> aVar3 = this.f29422y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(ef.a.class), aVar2, aVar3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context) {
        super(context);
        jo.p.h(context, "context");
        this.G = new da.j();
        cr.a aVar = cr.a.f28611a;
        this.H = wn.g.b(aVar.b(), new e(this, null, null));
        this.I = wn.g.b(aVar.b(), new f(this, null, null));
        this.J = wn.g.b(aVar.b(), new g(this, null, null));
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(getContext()), xb.p.floating_status, this, true);
        jo.p.g(e10, "inflate(\n        LayoutI… this,\n        true\n    )");
        f2 f2Var = (f2) e10;
        this.K = f2Var;
        this.L = new Point();
        Rect rect = new Rect();
        this.M = rect;
        setMLayoutParams(D(context));
        ConstraintLayout constraintLayout = f2Var.C;
        jo.p.g(constraintLayout, "binding.collabStatusContainer");
        g1.a(constraintLayout, a.f29408w);
        rect.set(f2Var.I.getPaddingLeft(), f2Var.I.getPaddingTop(), f2Var.I.getPaddingRight(), f2Var.I.getPaddingBottom());
        setOnTouchListener(new c());
        f2Var.E.setOnTouchListener(new c());
        f2Var.J.setOnTouchListener(new c());
        G();
    }

    public static final void F(j jVar, List list) {
        jo.p.h(jVar, "this$0");
        if (list.isEmpty()) {
            jVar.K.C.setVisibility(8);
            return;
        }
        jVar.K.C.setVisibility(0);
        jVar.K.D.setText(String.valueOf(list.size()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final od.b getCastServiceActionCreator() {
        return (od.b) this.H.getValue();
    }

    private final nf.c getCastServiceStore() {
        return (nf.c) this.I.getValue();
    }

    private final ef.a getTutorialManager() {
        return (ef.a) this.J.getValue();
    }

    private final void setMarginLeftOfRoot(int i10) {
        ViewGroup.LayoutParams layoutParams = this.K.u().getLayoutParams();
        jo.p.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(i10, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        this.K.u().setLayoutParams(marginLayoutParams);
    }

    public final WindowManager.LayoutParams D(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, q(), 520, -3);
        layoutParams.gravity = 51;
        layoutParams.windowAnimations = 0;
        layoutParams.rotationAnimation = 0;
        layoutParams.layoutAnimationParameters = null;
        return layoutParams;
    }

    public final void E(int i10, int i11) {
        r(i10 + ((int) getResources().getDimension(xb.m.float_status_x_offset)), i11 + ((int) getResources().getDimension(xb.m.float_status_y_offset)));
    }

    public final void G() {
        this.K.E.getViewTreeObserver().addOnGlobalLayoutListener(new d());
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.G.getCoroutineContext();
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    public final String getLiveId() {
        return this.N;
    }

    @Override // sd.a
    public void l() {
        dq.c.c().r(this);
        super.l();
    }

    @Override // sd.a
    public void m(int i10, int i11) {
        super.m(i10, i11);
        dq.c.c().l(new b(getMLayoutParams().x, getMLayoutParams().y));
    }

    @Override // sd.a
    public void n(Rect rect) {
        jo.p.h(rect, "outMargins");
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(xb.m.float_comment_padding);
        rect.set(0, (int) getResources().getDimension(xb.m.float_status_y_offset), this.K.E.getWidth() + dimensionPixelOffset + de.n.b(this, 5), 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
        Context context = getContext();
        androidx.lifecycle.u uVar = context instanceof androidx.lifecycle.u ? (androidx.lifecycle.u) context : null;
        if (uVar != null) {
            getCastServiceStore().R().i(uVar, new androidx.lifecycle.f0() { // from class: dc.i
                @Override // androidx.lifecycle.f0
                public final void d(Object obj) {
                    j.F(j.this, (List) obj);
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Context context = getContext();
        androidx.lifecycle.u uVar = context instanceof androidx.lifecycle.u ? (androidx.lifecycle.u) context : null;
        if (uVar != null) {
            getCastServiceStore().R().o(uVar);
        }
        r0.d(this, null, 1, null);
        super.onDetachedFromWindow();
    }

    @dq.l
    public final void onEvent(z.d dVar) {
        jo.p.h(dVar, "event");
        E(dVar.a(), dVar.b());
    }

    @Override // sd.a
    public void r(int i10, int i11) {
        Point point = this.L;
        super.r(i10 + point.x, i11 + point.y);
    }

    public final void setAudioMute(boolean z10) {
        if (z10) {
            this.K.E.setVisibility(0);
        } else if (this.K.J.getVisibility() == 0) {
            this.K.E.setVisibility(4);
        } else {
            this.K.E.setVisibility(8);
        }
    }

    public final void setLiveId(String str) {
        this.N = str;
    }

    public final void setVideoMute(boolean z10) {
        if (z10) {
            if (this.K.E.getVisibility() == 8) {
                this.K.E.setVisibility(4);
            }
            this.K.J.setVisibility(0);
            a.b b10 = getTutorialManager().b(4);
            if (b10.b()) {
                this.K.G.setScaleX(1.0f);
                this.K.H.setVisibility(0);
                b10.a();
                return;
            }
            this.K.G.setScaleX(0.0f);
            this.K.H.setVisibility(8);
            return;
        }
        if (this.K.E.getVisibility() == 4) {
            this.K.E.setVisibility(8);
        }
        this.K.J.setVisibility(8);
        this.K.G.setScaleX(0.0f);
        this.K.H.setVisibility(8);
    }

    @Override // sd.a
    public void v() {
        super.v();
        if (getCastServiceStore().Q().isEmpty()) {
            this.K.C.setVisibility(8);
        } else {
            this.K.C.setVisibility(0);
            this.K.D.setText(String.valueOf(getCastServiceStore().Q().size()));
        }
        dq.c.c().p(this);
    }

    @dq.l
    public final void onEvent(z.c cVar) {
        setMarginLeftOfRoot(0);
    }
}
