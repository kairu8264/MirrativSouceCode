package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import l0.g1;

/* loaded from: classes.dex */
public abstract class a extends ViewGroup {
    public io.a<wn.v> A;
    public boolean B;
    public boolean C;

    /* renamed from: w  reason: collision with root package name */
    public WeakReference<l0.m> f14370w;

    /* renamed from: x  reason: collision with root package name */
    public IBinder f14371x;

    /* renamed from: y  reason: collision with root package name */
    public l0.l f14372y;

    /* renamed from: z  reason: collision with root package name */
    public l0.m f14373z;

    /* renamed from: androidx.compose.ui.platform.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0050a extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public C0050a() {
            super(2);
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                a.this.a(iVar, 8);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        jo.p.h(context, "context");
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i10, int i11, jo.h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(l0.m mVar) {
        if (this.f14373z != mVar) {
            this.f14373z = mVar;
            if (mVar != null) {
                this.f14370w = null;
            }
            l0.l lVar = this.f14372y;
            if (lVar != null) {
                lVar.dispose();
                this.f14372y = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f14371x != iBinder) {
            this.f14371x = iBinder;
            this.f14370w = null;
        }
    }

    public abstract void a(l0.i iVar, int i10);

    @Override // android.view.ViewGroup
    public void addView(View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i10, layoutParams);
    }

    public final l0.m b(l0.m mVar) {
        l0.m mVar2 = i(mVar) ? mVar : null;
        if (mVar2 != null) {
            this.f14370w = new WeakReference<>(mVar2);
        }
        return mVar;
    }

    public final void c() {
        if (this.C) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void d() {
        if (this.f14373z != null || isAttachedToWindow()) {
            f();
            return;
        }
        throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
    }

    public final void e() {
        l0.l lVar = this.f14372y;
        if (lVar != null) {
            lVar.dispose();
        }
        this.f14372y = null;
        requestLayout();
    }

    public final void f() {
        if (this.f14372y == null) {
            try {
                this.C = true;
                this.f14372y = u2.e(this, j(), s0.c.c(-656146368, true, new C0050a()));
            } finally {
                this.C = false;
            }
        }
    }

    public void g(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i12 - i10) - getPaddingRight(), (i13 - i11) - getPaddingBottom());
        }
    }

    public final boolean getHasComposition() {
        return this.f14372y != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.B;
    }

    public void h(int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i10, i11);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i10)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i11)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    public final boolean i(l0.m mVar) {
        return !(mVar instanceof l0.g1) || ((l0.g1) mVar).X().getValue().compareTo(g1.c.ShuttingDown) > 0;
    }

    public final l0.m j() {
        l0.m mVar;
        l0.m mVar2 = this.f14373z;
        if (mVar2 == null) {
            l0.m d10 = WindowRecomposer_androidKt.d(this);
            l0.m mVar3 = null;
            l0.m b10 = d10 != null ? b(d10) : null;
            if (b10 == null) {
                WeakReference<l0.m> weakReference = this.f14370w;
                if (weakReference != null && (mVar = weakReference.get()) != null && i(mVar)) {
                    mVar3 = mVar;
                }
                l0.m mVar4 = mVar3;
                return mVar4 == null ? b(WindowRecomposer_androidKt.h(this)) : mVar4;
            }
            return b10;
        }
        return mVar2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        g(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        f();
        h(i10, i11);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i10);
    }

    public final void setParentCompositionContext(l0.m mVar) {
        setParentContext(mVar);
    }

    public final void setShowLayoutBounds(boolean z10) {
        this.B = z10;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((s1.y) childAt).setShowLayoutBounds(z10);
        }
    }

    public final void setViewCompositionStrategy(d2 d2Var) {
        jo.p.h(d2Var, "strategy");
        io.a<wn.v> aVar = this.A;
        if (aVar != null) {
            aVar.invoke();
        }
        this.A = d2Var.a(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        jo.p.h(context, "context");
        setClipChildren(false);
        setClipToPadding(false);
        this.A = d2.f14411a.a().a(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        c();
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        c();
        return super.addViewInLayout(view, i10, layoutParams, z10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, int i11) {
        c();
        super.addView(view, i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i10, layoutParams);
    }
}
