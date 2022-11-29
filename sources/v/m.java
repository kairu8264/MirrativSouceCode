package v;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final long f56289a = ViewConfiguration.getTapTimeout();

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ View f56290w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(0);
            this.f56290w = view;
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(m.e(this.f56290w));
        }
    }

    public static final long b() {
        return f56289a;
    }

    public static final boolean c(KeyEvent keyEvent) {
        jo.p.h(keyEvent, "$this$isClick");
        if (l1.c.e(l1.d.b(keyEvent), l1.c.f39491a.b())) {
            int b10 = l1.g.b(l1.d.a(keyEvent));
            if (b10 == 23 || b10 == 66 || b10 == 160) {
                return true;
            }
        }
        return false;
    }

    public static final io.a<Boolean> d(l0.i iVar, int i10) {
        iVar.x(-1990508712);
        a aVar = new a((View) iVar.G(androidx.compose.ui.platform.z.k()));
        iVar.O();
        return aVar;
    }

    public static final boolean e(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }
}
