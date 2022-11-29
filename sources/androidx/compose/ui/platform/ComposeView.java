package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class ComposeView extends androidx.compose.ui.platform.a {
    public static final int F = 8;
    public final l0.s0<io.p<l0.i, Integer, wn.v>> D;
    public boolean E;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f14334x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10) {
            super(2);
            this.f14334x = i10;
        }

        public final void a(l0.i iVar, int i10) {
            ComposeView.this.a(iVar, this.f14334x | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        jo.p.h(context, "context");
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i10, int i11, jo.h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // androidx.compose.ui.platform.a
    public void a(l0.i iVar, int i10) {
        l0.i h10 = iVar.h(420213850);
        io.p<l0.i, Integer, wn.v> value = this.D.getValue();
        if (value != null) {
            value.invoke(h10, 0);
        }
        l0.l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new a(i10));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        String name = ComposeView.class.getName();
        jo.p.g(name, "javaClass.name");
        return name;
    }

    @Override // androidx.compose.ui.platform.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.E;
    }

    public final void setContent(io.p<? super l0.i, ? super Integer, wn.v> pVar) {
        jo.p.h(pVar, "content");
        this.E = true;
        this.D.setValue(pVar);
        if (isAttachedToWindow()) {
            d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        l0.s0<io.p<l0.i, Integer, wn.v>> e10;
        jo.p.h(context, "context");
        e10 = l0.z1.e(null, null, 2, null);
        this.D = e10;
    }
}
