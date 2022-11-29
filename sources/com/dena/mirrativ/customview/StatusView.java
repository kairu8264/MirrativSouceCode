package com.dena.mirrativ.customview;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.f;
import com.dena.mirrativ.customview.StatusView;
import h9.e;
import java.io.Serializable;
import jo.h;
import jo.p;
import kotlin.NoWhenBranchMatchedException;
import m9.c;
import m9.g;
import wn.v;

/* loaded from: classes.dex */
public final class StatusView extends FrameLayout {

    /* renamed from: x  reason: collision with root package name */
    public static final a f20785x = new a(null);

    /* renamed from: y  reason: collision with root package name */
    public static final int f20786y = 8;

    /* renamed from: w  reason: collision with root package name */
    public io.a<v> f20787w;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b implements Serializable {

        /* loaded from: classes.dex */
        public static final class a extends b {

            /* renamed from: w  reason: collision with root package name */
            public final String f20788w;

            /* renamed from: x  reason: collision with root package name */
            public final io.a<v> f20789x;

            public a() {
                this(null, null, 3, null);
            }

            public a(String str, io.a<v> aVar) {
                super(null);
                this.f20788w = str;
                this.f20789x = aVar;
            }

            public final String a() {
                return this.f20788w;
            }

            public final io.a<v> b() {
                return this.f20789x;
            }

            public /* synthetic */ a(String str, io.a aVar, int i10, h hVar) {
                this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : aVar);
            }
        }

        /* renamed from: com.dena.mirrativ.customview.StatusView$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0181b extends b {

            /* renamed from: w  reason: collision with root package name */
            public static final C0181b f20790w = new C0181b();

            public C0181b() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends b {

            /* renamed from: w  reason: collision with root package name */
            public static final c f20791w = new c();

            public c() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class d extends b {

            /* renamed from: w  reason: collision with root package name */
            public final String f20792w;

            /* renamed from: x  reason: collision with root package name */
            public final float f20793x;

            public d() {
                this(null, 0.0f, 3, null);
            }

            public d(String str, float f10) {
                super(null);
                this.f20792w = str;
                this.f20793x = f10;
            }

            public final String a() {
                return this.f20792w;
            }

            public final float b() {
                return this.f20793x;
            }

            public /* synthetic */ d(String str, float f10, int i10, h hVar) {
                this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? 16.0f : f10);
            }
        }

        public b() {
        }

        public /* synthetic */ b(h hVar) {
            this();
        }

        public boolean equals(Object obj) {
            if (this instanceof c) {
                return obj instanceof c;
            }
            if (this instanceof d) {
                return obj instanceof d;
            }
            if (this instanceof C0181b) {
                return obj instanceof C0181b;
            }
            if (this instanceof a) {
                return obj instanceof a;
            }
            throw new NoWhenBranchMatchedException();
        }

        public int hashCode() {
            return getClass().hashCode();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ StatusView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final void c(b bVar, StatusView statusView, View view) {
        p.h(bVar, "$status");
        p.h(statusView, "this$0");
        io.a<v> b10 = ((b.a) bVar).b();
        if (b10 == null && (b10 = statusView.f20787w) == null) {
            return;
        }
        b10.invoke();
    }

    public final void b(final b bVar) {
        p.h(bVar, "status");
        removeAllViews();
        if (bVar instanceof b.c) {
            setVisibility(8);
        } else if (bVar instanceof b.d) {
            setVisibility(0);
            g gVar = (g) f.e(LayoutInflater.from(getContext()), e.view_not_found, this, true);
            b.d dVar = (b.d) bVar;
            gVar.B.setTextSize(dVar.b());
            gVar.B.setText(dVar.a());
        } else if (bVar instanceof b.C0181b) {
            setVisibility(0);
            Drawable background = ((m9.e) f.e(LayoutInflater.from(getContext()), e.view_loading_mirrabit, this, true)).B.getBackground();
            p.f(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
            ((AnimationDrawable) background).start();
        } else if (bVar instanceof b.a) {
            setVisibility(0);
            c cVar = (c) f.e(LayoutInflater.from(getContext()), e.view_error, this, true);
            cVar.B.setText(((b.a) bVar).a());
            cVar.C.setOnClickListener(new View.OnClickListener() { // from class: h9.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StatusView.c(StatusView.b.this, this, view);
                }
            });
        }
    }

    public final io.a<v> getOnClickRetryDefaultListener() {
        return this.f20787w;
    }

    public final void setOnClickRetryDefaultListener(io.a<v> aVar) {
        this.f20787w = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
    }
}
