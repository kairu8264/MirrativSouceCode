package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView.p f16347a;

    /* renamed from: b  reason: collision with root package name */
    public int f16348b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f16349c;

    /* loaded from: classes.dex */
    public class a extends x {
        public a(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.x
        public int d(View view) {
            return this.f16347a.e0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.x
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f16347a.d0(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.x
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f16347a.c0(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.x
        public int g(View view) {
            return this.f16347a.b0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.x
        public int h() {
            return this.f16347a.v0();
        }

        @Override // androidx.recyclerview.widget.x
        public int i() {
            return this.f16347a.v0() - this.f16347a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.x
        public int j() {
            return this.f16347a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.x
        public int k() {
            return this.f16347a.w0();
        }

        @Override // androidx.recyclerview.widget.x
        public int l() {
            return this.f16347a.i0();
        }

        @Override // androidx.recyclerview.widget.x
        public int m() {
            return this.f16347a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.x
        public int n() {
            return (this.f16347a.v0() - this.f16347a.getPaddingLeft()) - this.f16347a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.x
        public int p(View view) {
            this.f16347a.u0(view, true, this.f16349c);
            return this.f16349c.right;
        }

        @Override // androidx.recyclerview.widget.x
        public int q(View view) {
            this.f16347a.u0(view, true, this.f16349c);
            return this.f16349c.left;
        }

        @Override // androidx.recyclerview.widget.x
        public void r(int i10) {
            this.f16347a.K0(i10);
        }
    }

    /* loaded from: classes.dex */
    public class b extends x {
        public b(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.x
        public int d(View view) {
            return this.f16347a.Z(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.x
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f16347a.c0(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.x
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f16347a.d0(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.x
        public int g(View view) {
            return this.f16347a.f0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.x
        public int h() {
            return this.f16347a.h0();
        }

        @Override // androidx.recyclerview.widget.x
        public int i() {
            return this.f16347a.h0() - this.f16347a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.x
        public int j() {
            return this.f16347a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.x
        public int k() {
            return this.f16347a.i0();
        }

        @Override // androidx.recyclerview.widget.x
        public int l() {
            return this.f16347a.w0();
        }

        @Override // androidx.recyclerview.widget.x
        public int m() {
            return this.f16347a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.x
        public int n() {
            return (this.f16347a.h0() - this.f16347a.getPaddingTop()) - this.f16347a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.x
        public int p(View view) {
            this.f16347a.u0(view, true, this.f16349c);
            return this.f16349c.bottom;
        }

        @Override // androidx.recyclerview.widget.x
        public int q(View view) {
            this.f16347a.u0(view, true, this.f16349c);
            return this.f16349c.top;
        }

        @Override // androidx.recyclerview.widget.x
        public void r(int i10) {
            this.f16347a.L0(i10);
        }
    }

    public /* synthetic */ x(RecyclerView.p pVar, a aVar) {
        this(pVar);
    }

    public static x a(RecyclerView.p pVar) {
        return new a(pVar);
    }

    public static x b(RecyclerView.p pVar, int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return c(pVar);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return a(pVar);
    }

    public static x c(RecyclerView.p pVar) {
        return new b(pVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f16348b) {
            return 0;
        }
        return n() - this.f16348b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i10);

    public void s() {
        this.f16348b = n();
    }

    public x(RecyclerView.p pVar) {
        this.f16348b = Integer.MIN_VALUE;
        this.f16349c = new Rect();
        this.f16347a = pVar;
    }
}
