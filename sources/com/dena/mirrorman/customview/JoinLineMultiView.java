package com.dena.mirrorman.customview;

import ae.sj;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.f;
import com.dena.mirrorman.customview.JoinLineMultiView;
import jo.h;
import jo.p;
import nd.b1;
import wn.v;

/* loaded from: classes2.dex */
public final class JoinLineMultiView extends FrameLayout {

    /* renamed from: y  reason: collision with root package name */
    public static final a f25465y = new a(null);

    /* renamed from: z  reason: collision with root package name */
    public static final int f25466z = 8;

    /* renamed from: w  reason: collision with root package name */
    public final sj f25467w;

    /* renamed from: x  reason: collision with root package name */
    public io.a<v> f25468x;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final void a(JoinLineMultiView joinLineMultiView, String str) {
            p.h(joinLineMultiView, "<this>");
            joinLineMultiView.f25467w.B.setText(str);
            joinLineMultiView.f25467w.C.setText(str);
        }

        public final void b(JoinLineMultiView joinLineMultiView, String str) {
            p.h(joinLineMultiView, "<this>");
            joinLineMultiView.f25467w.D.setText(str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JoinLineMultiView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ JoinLineMultiView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final void c(JoinLineMultiView joinLineMultiView, View view) {
        p.h(joinLineMultiView, "this$0");
        io.a<v> aVar = joinLineMultiView.f25468x;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public static final void d(JoinLineMultiView joinLineMultiView, String str) {
        f25465y.a(joinLineMultiView, str);
    }

    public static final void e(JoinLineMultiView joinLineMultiView, String str) {
        f25465y.b(joinLineMultiView, str);
    }

    public final io.a<v> getClickedJoinMultiButtonListener() {
        return this.f25468x;
    }

    public final void setClickedJoinMultiButtonListener(io.a<v> aVar) {
        this.f25468x = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinLineMultiView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        sj sjVar = (sj) f.e(LayoutInflater.from(getContext()), b1.view_join_multi, this, true);
        sjVar.C.setOnClickListener(new View.OnClickListener() { // from class: yd.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JoinLineMultiView.c(JoinLineMultiView.this, view);
            }
        });
        this.f25467w = sjVar;
    }
}
