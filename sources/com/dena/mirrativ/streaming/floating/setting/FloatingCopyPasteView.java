package com.dena.mirrativ.streaming.floating.setting;

import ac.r4;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.f;
import com.dena.mirrativ.streaming.floating.setting.FloatingCopyPasteView;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class FloatingCopyPasteView extends RelativeLayout {

    /* renamed from: w  reason: collision with root package name */
    public final r4 f23675w;

    /* renamed from: x  reason: collision with root package name */
    public a f23676x;

    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FloatingCopyPasteView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ FloatingCopyPasteView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final void c(FloatingCopyPasteView floatingCopyPasteView, View view) {
        p.h(floatingCopyPasteView, "this$0");
        floatingCopyPasteView.f();
    }

    public static final void d(FloatingCopyPasteView floatingCopyPasteView, View view) {
        p.h(floatingCopyPasteView, "this$0");
        floatingCopyPasteView.g();
    }

    public final void e(a aVar) {
        p.h(aVar, "callback");
        this.f23676x = aVar;
    }

    public final void f() {
        a aVar = this.f23676x;
        if (aVar != null) {
            aVar.b();
        }
    }

    public final void g() {
        a aVar = this.f23676x;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingCopyPasteView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        r4 r4Var = (r4) f.e(LayoutInflater.from(context), xb.p.view_copy_and_paste, this, true);
        this.f23675w = r4Var;
        r4Var.B.setOnClickListener(new View.OnClickListener() { // from class: gc.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FloatingCopyPasteView.c(FloatingCopyPasteView.this, view);
            }
        });
        r4Var.C.setOnClickListener(new View.OnClickListener() { // from class: gc.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FloatingCopyPasteView.d(FloatingCopyPasteView.this, view);
            }
        });
    }
}
