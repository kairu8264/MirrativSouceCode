package com.dena.mirrativ.catalog.home.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dena.mirrativ.catalog.home.app.AppsMyAppButton;
import com.dena.mirrorman.net.api.response.App;
import io.a;
import java.util.List;
import jo.h;
import jo.p;
import of.n;
import of.t;
import r8.b1;
import r8.d1;
import r8.e1;
import r8.f1;
import r8.g1;
import r8.h1;
import wn.v;

/* loaded from: classes.dex */
public final class AppsMyAppButton extends RelativeLayout {
    public final View A;
    public final View B;
    public final TextView C;
    public final TextView D;

    /* renamed from: w  reason: collision with root package name */
    public App.AdHeaderBannerParams f20659w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f20660x;

    /* renamed from: y  reason: collision with root package name */
    public a<v> f20661y;

    /* renamed from: z  reason: collision with root package name */
    public a<v> f20662z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppsMyAppButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ AppsMyAppButton(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final void c(AppsMyAppButton appsMyAppButton, View view) {
        p.h(appsMyAppButton, "this$0");
        a<v> aVar = appsMyAppButton.f20661y;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public static final void d(AppsMyAppButton appsMyAppButton, View view) {
        p.h(appsMyAppButton, "this$0");
        a<v> aVar = appsMyAppButton.f20662z;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final App.AdHeaderBannerParams getAdHeaderBanner() {
        return this.f20659w;
    }

    public final a<v> getOnClickMyAppListener() {
        return this.f20662z;
    }

    public final a<v> getOnClickPRListener() {
        return this.f20661y;
    }

    public final void setAdHeaderBanner(App.AdHeaderBannerParams adHeaderBannerParams) {
        App.AdBackground background;
        List<Integer> gradient;
        this.f20659w = adHeaderBannerParams;
        View view = this.B;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p.f(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        int i10 = adHeaderBannerParams == null ? 12 : 4;
        layoutParams2.setMargins(i10, layoutParams2.topMargin, (int) (i10 * getResources().getDisplayMetrics().density), layoutParams2.bottomMargin);
        view.setLayoutParams(layoutParams2);
        this.A.setVisibility(adHeaderBannerParams == null ? 8 : 0);
        App.AdHeaderBannerParams adHeaderBannerParams2 = this.f20659w;
        if (adHeaderBannerParams2 != null && (background = adHeaderBannerParams2.getBackground()) != null && (gradient = background.getGradient()) != null) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, n.f45411a.s(gradient));
            Context context = getContext();
            p.g(context, "context");
            gradientDrawable.setCornerRadius(t.b(context, 40));
            this.A.setBackground(gradientDrawable);
        }
        this.C.setText((adHeaderBannerParams == null || (r7 = adHeaderBannerParams.getTitle()) == null) ? "" : "");
    }

    public final void setMyApp(boolean z10) {
        this.f20660x = z10;
        if (z10) {
            this.B.setBackgroundResource(d1.f49846e);
            this.D.setText(h1.f49922o);
            this.D.setTextColor(getResources().getColor(b1.f49836f));
            TextView textView = this.D;
            Resources resources = getResources();
            p.g(resources, "resources");
            t.c(textView, resources, 8388611, g1.ic_check_white);
            return;
        }
        this.B.setBackgroundResource(d1.btn_stroke_corner20_tealish);
        this.D.setText(h1.f49921n);
        this.D.setTextColor(getResources().getColor(b1.f49834d));
        TextView textView2 = this.D;
        Resources resources2 = getResources();
        p.g(resources2, "resources");
        t.c(textView2, resources2, 8388611, g1.f49911c);
    }

    public final void setOnClickMyAppListener(a<v> aVar) {
        this.f20662z = aVar;
    }

    public final void setOnClickPRListener(a<v> aVar) {
        this.f20661y = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppsMyAppButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        View inflate = LayoutInflater.from(context).inflate(f1.view_apps_my_app_button, this);
        View findViewById = inflate.findViewById(e1.prButton);
        p.g(findViewById, "view.findViewById(R.id.prButton)");
        this.A = findViewById;
        View findViewById2 = inflate.findViewById(e1.prButtonTextView);
        p.f(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        this.C = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(e1.myAppButton);
        p.g(findViewById3, "view.findViewById(R.id.myAppButton)");
        this.B = findViewById3;
        View findViewById4 = inflate.findViewById(e1.myAppButtonTextView);
        p.f(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        this.D = (TextView) findViewById4;
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: y8.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppsMyAppButton.c(AppsMyAppButton.this, view);
            }
        });
        findViewById3.setOnClickListener(new View.OnClickListener() { // from class: y8.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppsMyAppButton.d(AppsMyAppButton.this, view);
            }
        });
        setAdHeaderBanner(null);
    }
}
