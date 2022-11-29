package com.dena.mirrorman.customview;

import ae.uk;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import ao.d;
import co.f;
import co.l;
import io.p;
import jf.y;
import jo.h;
import nd.b1;
import nd.h1;
import of.c;
import uo.b0;
import uo.d2;
import uo.g1;
import uo.i2;
import uo.q0;
import uo.r0;
import wn.v;

/* loaded from: classes2.dex */
public final class LiveTimeView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final uk f25498w;

    /* renamed from: x  reason: collision with root package name */
    public d2 f25499x;

    /* renamed from: y  reason: collision with root package name */
    public int f25500y;

    /* renamed from: z  reason: collision with root package name */
    public static final a f25497z = new a(null);
    public static final int A = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    @f(c = "com.dena.mirrorman.customview.LiveTimeView$bind$1", f = "LiveTimeView.kt", l = {66}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends l implements p<q0, d<? super v>, Object> {
        public int A;
        public final /* synthetic */ y C;

        /* renamed from: w  reason: collision with root package name */
        public int f25501w;

        /* renamed from: x  reason: collision with root package name */
        public int f25502x;

        /* renamed from: y  reason: collision with root package name */
        public Object f25503y;

        /* renamed from: z  reason: collision with root package name */
        public Object f25504z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(y yVar, d<? super b> dVar) {
            super(2, dVar);
            this.C = yVar;
        }

        @Override // co.a
        public final d<v> create(Object obj, d<?> dVar) {
            return new b(this.C, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0046 -> B:13:0x0049). Please submit an issue!!! */
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
                int r1 = r8.f25502x
                int r3 = r8.f25501w
                java.lang.Object r4 = r8.f25504z
                jf.y r4 = (jf.y) r4
                java.lang.Object r5 = r8.f25503y
                com.dena.mirrorman.customview.LiveTimeView r5 = (com.dena.mirrorman.customview.LiveTimeView) r5
                wn.m.b(r9)
                r9 = r8
                goto L49
            L1c:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L24:
                wn.m.b(r9)
                r9 = 2147483647(0x7fffffff, float:NaN)
                com.dena.mirrorman.customview.LiveTimeView r1 = com.dena.mirrorman.customview.LiveTimeView.this
                jf.y r3 = r8.C
                r4 = 0
                r5 = r1
                r1 = r4
                r4 = r3
                r3 = r9
                r9 = r8
            L34:
                if (r1 >= r3) goto L4e
                r6 = 1000(0x3e8, double:4.94E-321)
                r9.f25503y = r5
                r9.f25504z = r4
                r9.f25501w = r3
                r9.f25502x = r1
                r9.A = r2
                java.lang.Object r6 = uo.b1.a(r6, r9)
                if (r6 != r0) goto L49
                return r0
            L49:
                com.dena.mirrorman.customview.LiveTimeView.a(r5, r4)
                int r1 = r1 + r2
                goto L34
            L4e:
                wn.v r9 = wn.v.f59242a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.customview.LiveTimeView.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LiveTimeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        jo.p.h(context, "context");
    }

    public /* synthetic */ LiveTimeView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void b(y yVar) {
        d2 d10;
        jo.p.h(yVar, "liveTime");
        d2.a.a(getJob(), null, 1, null);
        c(yVar);
        if (yVar.b()) {
            d10 = uo.l.d(r0.a(g1.c()), null, null, new b(yVar, null), 3, null);
            setJob(d10);
        }
    }

    public final void c(y yVar) {
        String c10;
        long a10 = yVar.a(System.currentTimeMillis());
        int i10 = this.f25500y;
        if (i10 != 0) {
            if (i10 != 1) {
                return;
            }
            this.f25498w.B.setText(c.f45387a.b(a10));
            return;
        }
        AppCompatTextView appCompatTextView = this.f25498w.B;
        if (a10 < 3600) {
            c10 = c.f45387a.d(a10);
        } else {
            c10 = c.f45387a.c(a10);
        }
        appCompatTextView.setText(c10);
    }

    public final d2 getJob() {
        d2 d2Var = this.f25499x;
        if (d2Var != null) {
            return d2Var;
        }
        jo.p.v("job");
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        d2.a.a(getJob(), null, 1, null);
        super.onDetachedFromWindow();
    }

    public final void setJob(d2 d2Var) {
        jo.p.h(d2Var, "<set-?>");
        this.f25499x = d2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveTimeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b0 b10;
        jo.p.h(context, "context");
        uk ukVar = (uk) androidx.databinding.f.e(LayoutInflater.from(context), b1.view_live_time, this, true);
        this.f25498w = ukVar;
        if (!isInEditMode()) {
            b10 = i2.b(null, 1, null);
            setJob(b10);
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h1.f42154x1, 0, 0);
            float dimension = obtainStyledAttributes.getDimension(h1.f42160y1, 0.0f);
            if (dimension > 0.0f) {
                ukVar.B.setTextSize(0, dimension);
            }
            this.f25500y = obtainStyledAttributes.getInt(h1.f42166z1, 0);
            obtainStyledAttributes.recycle();
        }
    }
}
