package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.TooltipCompat;
import e3.h;
import nj.d;
import o3.c0;
import p3.c;
import wi.e;
import wi.f;

/* loaded from: classes3.dex */
public class NavigationMenuItemView extends d implements j.a {
    public static final int[] M = {16842912};
    public int C;
    public boolean D;
    public boolean E;
    public final CheckedTextView F;
    public FrameLayout G;
    public g H;
    public ColorStateList I;
    public boolean J;
    public Drawable K;
    public final o3.a L;

    /* loaded from: classes3.dex */
    public class a extends o3.a {
        public a() {
        }

        @Override // o3.a
        public void g(View view, c cVar) {
            super.g(view, cVar);
            cVar.Z(NavigationMenuItemView.this.E);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.G == null) {
                this.G = (FrameLayout) ((ViewStub) findViewById(f.f58840f)).inflate();
            }
            this.G.removeAllViews();
            this.G.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void a(g gVar, int i10) {
        this.H = gVar;
        if (gVar.getItemId() > 0) {
            setId(gVar.getItemId());
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            c0.v0(this, d());
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.getTitle());
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.getContentDescription());
        TooltipCompat.setTooltipText(this, gVar.getTooltipText());
        c();
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean b() {
        return false;
    }

    public final void c() {
        if (e()) {
            this.F.setVisibility(8);
            FrameLayout frameLayout = this.G;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).width = -1;
                this.G.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.F.setVisibility(0);
        FrameLayout frameLayout2 = this.G;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams2).width = -2;
            this.G.setLayoutParams(layoutParams2);
        }
    }

    public final StateListDrawable d() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(d.a.K, typedValue, true)) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(M, new ColorDrawable(typedValue.data));
            stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            return stateListDrawable;
        }
        return null;
    }

    public final boolean e() {
        return this.H.getTitle() == null && this.H.getIcon() == null && this.H.getActionView() != null;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.H;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        g gVar = this.H;
        if (gVar != null && gVar.isCheckable() && this.H.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, M);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.E != z10) {
            this.E = z10;
            this.L.l(this.F, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        this.F.setChecked(z10);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, 0, i10, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.J) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = g3.a.r(drawable).mutate();
                g3.a.o(drawable, this.I);
            }
            int i10 = this.C;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.D) {
            if (this.K == null) {
                Drawable f10 = h.f(getResources(), e.f58834g, getContext().getTheme());
                this.K = f10;
                if (f10 != null) {
                    int i11 = this.C;
                    f10.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.K;
        }
        s3.j.l(this.F, drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.F.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.C = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.I = colorStateList;
        this.J = colorStateList != null;
        g gVar = this.H;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.F.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.D = z10;
    }

    public void setTextAppearance(int i10) {
        s3.j.q(this.F, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.F.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.F.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a aVar = new a();
        this.L = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(wi.h.f58866d, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(wi.d.f58806e));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(f.f58841g);
        this.F = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        c0.r0(checkedTextView, aVar);
    }
}
