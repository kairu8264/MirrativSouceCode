package e;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import j.b;

/* loaded from: classes.dex */
public abstract class a {

    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z10);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public boolean a() {
        return false;
    }

    public abstract boolean b();

    public abstract void c(boolean z10);

    public abstract int d();

    public abstract Context e();

    public boolean f() {
        return false;
    }

    public void g(Configuration configuration) {
    }

    public void h() {
    }

    public abstract boolean i(int i10, KeyEvent keyEvent);

    public boolean j(KeyEvent keyEvent) {
        return false;
    }

    public boolean k() {
        return false;
    }

    public abstract void l(Drawable drawable);

    public abstract void m(boolean z10);

    public abstract void n(boolean z10);

    public abstract void o(boolean z10);

    public abstract void p(boolean z10);

    public abstract void q(int i10);

    public abstract void r(Drawable drawable);

    public abstract void s(boolean z10);

    public abstract void t(CharSequence charSequence);

    public abstract void u(CharSequence charSequence);

    public j.b v(b.a aVar) {
        return null;
    }

    /* renamed from: e.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0293a extends ViewGroup.MarginLayoutParams {
        public int gravity;

        public C0293a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gravity = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.j.f28880t);
            this.gravity = obtainStyledAttributes.getInt(d.j.f28885u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0293a(int i10, int i11) {
            super(i10, i11);
            this.gravity = 0;
            this.gravity = 8388627;
        }

        public C0293a(int i10, int i11, int i12) {
            super(i10, i11);
            this.gravity = 0;
            this.gravity = i12;
        }

        public C0293a(int i10) {
            this(-2, -1, i10);
        }

        public C0293a(C0293a c0293a) {
            super((ViewGroup.MarginLayoutParams) c0293a);
            this.gravity = 0;
            this.gravity = c0293a.gravity;
        }

        public C0293a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = 0;
        }
    }
}
