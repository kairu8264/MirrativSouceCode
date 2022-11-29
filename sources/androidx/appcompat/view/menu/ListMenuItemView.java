package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.TintTypedArray;
import o3.c0;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements j.a, AbsListView.SelectionBoundsAdjuster {
    public CheckBox A;
    public TextView B;
    public ImageView C;
    public ImageView D;
    public LinearLayout E;
    public Drawable F;
    public int G;
    public Context H;
    public boolean I;
    public Drawable J;
    public boolean K;
    public LayoutInflater L;
    public boolean M;

    /* renamed from: w  reason: collision with root package name */
    public g f14190w;

    /* renamed from: x  reason: collision with root package name */
    public ImageView f14191x;

    /* renamed from: y  reason: collision with root package name */
    public RadioButton f14192y;

    /* renamed from: z  reason: collision with root package name */
    public TextView f14193z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.a.f28617c0);
    }

    private LayoutInflater getInflater() {
        if (this.L == null) {
            this.L = LayoutInflater.from(getContext());
        }
        return this.L;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.C;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void a(g gVar, int i10) {
        this.f14190w = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.D;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.D.getLayoutParams();
        rect.top += this.D.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean b() {
        return false;
    }

    public final void c(View view) {
        d(view, -1);
    }

    public final void d(View view, int i10) {
        LinearLayout linearLayout = this.E;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    public final void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(d.g.f28749j, (ViewGroup) this, false);
        this.A = checkBox;
        c(checkBox);
    }

    public final void f() {
        ImageView imageView = (ImageView) getInflater().inflate(d.g.f28750k, (ViewGroup) this, false);
        this.f14191x = imageView;
        d(imageView, 0);
    }

    public final void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(d.g.f28752m, (ViewGroup) this, false);
        this.f14192y = radioButton;
        c(radioButton);
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.f14190w;
    }

    public void h(boolean z10, char c10) {
        int i10 = (z10 && this.f14190w.A()) ? 0 : 8;
        if (i10 == 0) {
            this.B.setText(this.f14190w.h());
        }
        if (this.B.getVisibility() != i10) {
            this.B.setVisibility(i10);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        c0.v0(this, this.F);
        TextView textView = (TextView) findViewById(d.f.S);
        this.f14193z = textView;
        int i10 = this.G;
        if (i10 != -1) {
            textView.setTextAppearance(this.H, i10);
        }
        this.B = (TextView) findViewById(d.f.L);
        ImageView imageView = (ImageView) findViewById(d.f.O);
        this.C = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.J);
        }
        this.D = (ImageView) findViewById(d.f.f28734u);
        this.E = (LinearLayout) findViewById(d.f.f28726m);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f14191x != null && this.I) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f14191x.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z10 && this.f14192y == null && this.A == null) {
            return;
        }
        if (this.f14190w.m()) {
            if (this.f14192y == null) {
                g();
            }
            compoundButton = this.f14192y;
            compoundButton2 = this.A;
        } else {
            if (this.A == null) {
                e();
            }
            compoundButton = this.A;
            compoundButton2 = this.f14192y;
        }
        if (z10) {
            compoundButton.setChecked(this.f14190w.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.A;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f14192y;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f14190w.m()) {
            if (this.f14192y == null) {
                g();
            }
            compoundButton = this.f14192y;
        } else {
            if (this.A == null) {
                e();
            }
            compoundButton = this.A;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.M = z10;
        this.I = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.D;
        if (imageView != null) {
            imageView.setVisibility((this.K || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f14190w.z() || this.M;
        if (z10 || this.I) {
            ImageView imageView = this.f14191x;
            if (imageView == null && drawable == null && !this.I) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.I) {
                this.f14191x.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f14191x;
            if (!z10) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f14191x.getVisibility() != 0) {
                this.f14191x.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f14193z.setText(charSequence);
            if (this.f14193z.getVisibility() != 0) {
                this.f14193z.setVisibility(0);
            }
        } else if (this.f14193z.getVisibility() != 8) {
            this.f14193z.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(getContext(), attributeSet, d.j.V1, i10, 0);
        this.F = obtainStyledAttributes.getDrawable(d.j.X1);
        this.G = obtainStyledAttributes.getResourceId(d.j.W1, -1);
        this.I = obtainStyledAttributes.getBoolean(d.j.Y1, false);
        this.H = context;
        this.J = obtainStyledAttributes.getDrawable(d.j.Z1);
        TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, d.a.Y, 0);
        this.K = obtainStyledAttributes2.hasValue(0);
        obtainStyledAttributes.recycle();
        obtainStyledAttributes2.recycle();
    }
}
