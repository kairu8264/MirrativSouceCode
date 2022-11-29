package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.ForwardingListener;
import androidx.appcompat.widget.TooltipCompat;

/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements j.a, View.OnClickListener, ActionMenuView.ActionMenuChildView {
    public ForwardingListener A;
    public b B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public int G;

    /* renamed from: w  reason: collision with root package name */
    public g f14182w;

    /* renamed from: x  reason: collision with root package name */
    public CharSequence f14183x;

    /* renamed from: y  reason: collision with root package name */
    public Drawable f14184y;

    /* renamed from: z  reason: collision with root package name */
    public e.b f14185z;

    /* loaded from: classes.dex */
    public class a extends ForwardingListener {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public k.f getPopup() {
            b bVar = ActionMenuItemView.this.B;
            if (bVar != null) {
                return bVar.getPopup();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public boolean onForwardingStarted() {
            k.f popup;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f14185z;
            return bVar != null && bVar.invokeItem(actionMenuItemView.f14182w) && (popup = getPopup()) != null && popup.isShowing();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract k.f getPopup();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void a(g gVar, int i10) {
        this.f14182w = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.A == null) {
            this.A = new a();
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean b() {
        return true;
    }

    public boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean d() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void f() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f14183x);
        if (this.f14184y != null && (!this.f14182w.B() || (!this.C && !this.D))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f14183x : null);
        CharSequence contentDescription = this.f14182w.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z12 ? null : this.f14182w.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f14182w.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            TooltipCompat.setTooltipText(this, z12 ? null : this.f14182w.getTitle());
        } else {
            TooltipCompat.setTooltipText(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.f14182w;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
    public boolean needsDividerAfter() {
        return c();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
    public boolean needsDividerBefore() {
        return c() && this.f14182w.getIcon() == null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f14185z;
        if (bVar != null) {
            bVar.invokeItem(this.f14182w);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.C = d();
        f();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        boolean c10 = c();
        if (c10 && (i13 = this.F) >= 0) {
            super.setPadding(i13, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i12 = Math.min(size, this.E);
        } else {
            i12 = this.E;
        }
        if (mode != 1073741824 && this.E > 0 && measuredWidth < i12) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
        }
        if (c10 || this.f14184y == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f14184y.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ForwardingListener forwardingListener;
        if (this.f14182w.hasSubMenu() && (forwardingListener = this.A) != null && forwardingListener.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.D != z10) {
            this.D = z10;
            g gVar = this.f14182w;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f14184y = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.G;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
    }

    public void setItemInvoker(e.b bVar) {
        this.f14185z = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.F = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.B = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f14183x = charSequence;
        f();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.C = d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.j.f28890v, i10, 0);
        this.E = obtainStyledAttributes.getDimensionPixelSize(d.j.f28895w, 0);
        obtainStyledAttributes.recycle();
        this.G = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.F = -1;
        setSaveEnabled(false);
    }
}
