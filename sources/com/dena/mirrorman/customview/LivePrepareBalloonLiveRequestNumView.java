package com.dena.mirrorman.customview;

import ae.ok;
import android.content.Context;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.f;
import co.l;
import com.dena.mirrorman.net.api.response.ToolTipStartLiveButtonAttributedText;
import com.dena.mirrorman.net.api.response.ToolTipStartLiveButtonToolTip;
import com.dena.mirrorman.net.api.response.ToolTipStartLiveButtonType;
import com.dena.mirrorman.net.glide.GlideApp;
import de.n;
import java.util.List;
import jo.h;
import jo.p;
import nd.v0;
import nd.w0;
import nd.y0;
import rd.p0;
import uo.b0;
import uo.d2;
import uo.g1;
import uo.i2;
import uo.q0;
import uo.r0;
import wn.v;
import xn.a0;
import xn.r;
import xn.s;

/* loaded from: classes2.dex */
public final class LivePrepareBalloonLiveRequestNumView extends FrameLayout {

    /* renamed from: y  reason: collision with root package name */
    public static final a f25480y = new a(null);

    /* renamed from: z  reason: collision with root package name */
    public static final int f25481z = 8;

    /* renamed from: w  reason: collision with root package name */
    public Animation f25482w;

    /* renamed from: x  reason: collision with root package name */
    public b0 f25483x;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f25484a;

        static {
            int[] iArr = new int[ToolTipStartLiveButtonType.values().length];
            iArr[ToolTipStartLiveButtonType.REQUEST_NUM.ordinal()] = 1;
            f25484a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends RecyclerView.o {

        /* renamed from: a  reason: collision with root package name */
        public final int f25485a;

        public c(ok okVar) {
            View u10 = okVar.u();
            p.g(u10, "binding.root");
            this.f25485a = n.b(u10, 6);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            p.h(rect, "outRect");
            p.h(view, "view");
            p.h(recyclerView, "parent");
            p.h(b0Var, "state");
            super.g(rect, view, recyclerView, b0Var);
            int f02 = recyclerView.f0(view);
            RecyclerView.h adapter = recyclerView.getAdapter();
            if (adapter == null || f02 == adapter.getItemCount() - 1) {
                return;
            }
            rect.left = -this.f25485a;
        }
    }

    @f(c = "com.dena.mirrorman.customview.LivePrepareBalloonLiveRequestNumView$startBoundAnimationToView$1", f = "LivePrepareBalloonLiveRequestNumView.kt", l = {132}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends l implements io.p<q0, ao.d<? super v>, Object> {
        public int A;
        public final /* synthetic */ View B;
        public final /* synthetic */ LivePrepareBalloonLiveRequestNumView C;

        /* renamed from: w  reason: collision with root package name */
        public int f25486w;

        /* renamed from: x  reason: collision with root package name */
        public int f25487x;

        /* renamed from: y  reason: collision with root package name */
        public Object f25488y;

        /* renamed from: z  reason: collision with root package name */
        public Object f25489z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view, LivePrepareBalloonLiveRequestNumView livePrepareBalloonLiveRequestNumView, ao.d<? super d> dVar) {
            super(2, dVar);
            this.B = view;
            this.C = livePrepareBalloonLiveRequestNumView;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new d(this.B, this.C, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x004c -> B:13:0x004f). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.A
                r2 = 1
                if (r1 == 0) goto L24
                if (r1 != r2) goto L1c
                int r1 = r8.f25487x
                int r3 = r8.f25486w
                java.lang.Object r4 = r8.f25489z
                com.dena.mirrorman.customview.LivePrepareBalloonLiveRequestNumView r4 = (com.dena.mirrorman.customview.LivePrepareBalloonLiveRequestNumView) r4
                java.lang.Object r5 = r8.f25488y
                android.view.View r5 = (android.view.View) r5
                wn.m.b(r9)
                r9 = r8
                goto L4f
            L1c:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L24:
                wn.m.b(r9)
                r9 = 500(0x1f4, float:7.0E-43)
                android.view.View r1 = r8.B
                com.dena.mirrorman.customview.LivePrepareBalloonLiveRequestNumView r3 = r8.C
                r4 = 0
                r5 = r1
                r1 = r4
                r4 = r3
                r3 = r9
                r9 = r8
            L33:
                if (r1 >= r3) goto L51
                android.view.animation.Animation r6 = com.dena.mirrorman.customview.LivePrepareBalloonLiveRequestNumView.a(r4)
                r5.startAnimation(r6)
                r6 = 2000(0x7d0, double:9.88E-321)
                r9.f25488y = r5
                r9.f25489z = r4
                r9.f25486w = r3
                r9.f25487x = r1
                r9.A = r2
                java.lang.Object r6 = uo.b1.a(r6, r9)
                if (r6 != r0) goto L4f
                return r0
            L4f:
                int r1 = r1 + r2
                goto L33
            L51:
                wn.v r9 = wn.v.f59242a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.customview.LivePrepareBalloonLiveRequestNumView.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivePrepareBalloonLiveRequestNumView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b0 b10;
        p.h(context, "context");
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), v0.live_balloon_effect);
        p.g(loadAnimation, "loadAnimation(context, R.anim.live_balloon_effect)");
        this.f25482w = loadAnimation;
        b10 = i2.b(null, 1, null);
        this.f25483x = b10;
        if (isInEditMode()) {
            c(new ToolTipStartLiveButtonToolTip(ToolTipStartLiveButtonType.REQUEST_NUM, r.d(new ToolTipStartLiveButtonAttributedText("medium", "配信リクエストが999件届いているよ!", true, false)), s.k()));
        }
    }

    public final SpannableStringBuilder b(ToolTipStartLiveButtonToolTip toolTipStartLiveButtonToolTip) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (ToolTipStartLiveButtonAttributedText toolTipStartLiveButtonAttributedText : toolTipStartLiveButtonToolTip.getAttributedTexts()) {
            int length = spannableStringBuilder.length();
            int length2 = spannableStringBuilder.length() + toolTipStartLiveButtonAttributedText.getText().length();
            spannableStringBuilder.append((CharSequence) toolTipStartLiveButtonAttributedText.getText());
            if (toolTipStartLiveButtonAttributedText.isBold()) {
                spannableStringBuilder.setSpan(new StyleSpan(1), length, length2, 33);
            }
            if (toolTipStartLiveButtonAttributedText.isHighlighted()) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(c3.a.d(getContext(), w0.f42237m)), length, length2, 33);
            }
            String fontSize = toolTipStartLiveButtonAttributedText.getFontSize();
            int hashCode = fontSize.hashCode();
            int i10 = 11;
            if (hashCode == -1078030475) {
                fontSize.equals("medium");
            } else if (hashCode != 102742843) {
                if (hashCode == 109548807 && fontSize.equals("small")) {
                    i10 = 9;
                }
            } else if (fontSize.equals("large")) {
                i10 = 14;
            }
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(i10, true), length, length2, 33);
        }
        return spannableStringBuilder;
    }

    public final void c(ToolTipStartLiveButtonToolTip toolTipStartLiveButtonToolTip) {
        p.h(toolTipStartLiveButtonToolTip, "toolTipStartLiveButtonToolTip");
        removeAllViews();
        if (b.f25484a[toolTipStartLiveButtonToolTip.getType().ordinal()] == 1) {
            ok T = ok.T(LayoutInflater.from(getContext()), this, true);
            p.g(T, "inflate(LayoutInflater.from(context), this, true)");
            RecyclerView recyclerView = T.H;
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(T.u().getContext(), 0, true);
            linearLayoutManager.M2(true);
            recyclerView.setLayoutManager(linearLayoutManager);
            T.H.g(new c(T));
            List<String> smallIconImageUrls = toolTipStartLiveButtonToolTip.getSmallIconImageUrls();
            if (smallIconImageUrls != null) {
                RecyclerView recyclerView2 = T.H;
                p0 p0Var = new p0();
                p0Var.c(a0.r0(a0.w0(smallIconImageUrls, 8)));
                recyclerView2.setAdapter(p0Var);
                if (smallIconImageUrls.size() > 8) {
                    GlideApp.with(T.G).load(Integer.valueOf(y0.ic_more)).apply((e8.a<?>) e8.h.bitmapTransform(new xd.d(n.b(this, 24), n.b(this, 2), c3.a.d(getContext(), w0.U0)))).into(T.G);
                    T.G.setVisibility(0);
                }
            }
            T.I.setText(b(toolTipStartLiveButtonToolTip));
            View u10 = T.u();
            p.g(u10, "binding.root");
            d(u10);
        }
    }

    public final void d(View view) {
        b0 b10;
        d2.a.a(this.f25483x, null, 1, null);
        b10 = i2.b(null, 1, null);
        this.f25483x = b10;
        uo.l.d(r0.a(g1.c().plus(this.f25483x)), null, null, new d(view, this, null), 3, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f25482w.cancel();
        d2.a.a(this.f25483x, null, 1, null);
        super.onDetachedFromWindow();
    }
}
