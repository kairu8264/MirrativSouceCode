package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final b f16100a;

    /* renamed from: b  reason: collision with root package name */
    public final a f16101b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final List<View> f16102c = new ArrayList();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f16103a = 0;

        /* renamed from: b  reason: collision with root package name */
        public a f16104b;

        public void a(int i10) {
            if (i10 >= 64) {
                a aVar = this.f16104b;
                if (aVar != null) {
                    aVar.a(i10 - 64);
                    return;
                }
                return;
            }
            this.f16103a &= ~(1 << i10);
        }

        public int b(int i10) {
            a aVar = this.f16104b;
            if (aVar == null) {
                if (i10 >= 64) {
                    return Long.bitCount(this.f16103a);
                }
                return Long.bitCount(this.f16103a & ((1 << i10) - 1));
            } else if (i10 < 64) {
                return Long.bitCount(this.f16103a & ((1 << i10) - 1));
            } else {
                return aVar.b(i10 - 64) + Long.bitCount(this.f16103a);
            }
        }

        public final void c() {
            if (this.f16104b == null) {
                this.f16104b = new a();
            }
        }

        public boolean d(int i10) {
            if (i10 < 64) {
                return (this.f16103a & (1 << i10)) != 0;
            }
            c();
            return this.f16104b.d(i10 - 64);
        }

        public void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.f16104b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f16103a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f16103a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f16104b != null) {
                c();
                this.f16104b.e(0, z11);
            }
        }

        public boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f16104b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f16103a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f16103a = j12;
            long j13 = j10 - 1;
            this.f16103a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f16104b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f16104b.f(0);
            }
            return z10;
        }

        public void g() {
            this.f16103a = 0L;
            a aVar = this.f16104b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public void h(int i10) {
            if (i10 >= 64) {
                c();
                this.f16104b.h(i10 - 64);
                return;
            }
            this.f16103a |= 1 << i10;
        }

        public String toString() {
            if (this.f16104b == null) {
                return Long.toBinaryString(this.f16103a);
            }
            return this.f16104b.toString() + "xx" + Long.toBinaryString(this.f16103a);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        View a(int i10);

        void b(View view);

        int c();

        RecyclerView.e0 d(View view);

        void e(int i10);

        void f(View view, int i10);

        void g();

        int h(View view);

        void i(View view);

        void j(int i10);

        void k(View view, int i10, ViewGroup.LayoutParams layoutParams);
    }

    public f(b bVar) {
        this.f16100a = bVar;
    }

    public void a(View view, int i10, boolean z10) {
        int h10;
        if (i10 < 0) {
            h10 = this.f16100a.c();
        } else {
            h10 = h(i10);
        }
        this.f16101b.e(h10, z10);
        if (z10) {
            l(view);
        }
        this.f16100a.f(view, h10);
    }

    public void b(View view, boolean z10) {
        a(view, -1, z10);
    }

    public void c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int h10;
        if (i10 < 0) {
            h10 = this.f16100a.c();
        } else {
            h10 = h(i10);
        }
        this.f16101b.e(h10, z10);
        if (z10) {
            l(view);
        }
        this.f16100a.k(view, h10, layoutParams);
    }

    public void d(int i10) {
        int h10 = h(i10);
        this.f16101b.f(h10);
        this.f16100a.e(h10);
    }

    public View e(int i10) {
        int size = this.f16102c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.f16102c.get(i11);
            RecyclerView.e0 d10 = this.f16100a.d(view);
            if (d10.getLayoutPosition() == i10 && !d10.isInvalid() && !d10.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    public View f(int i10) {
        return this.f16100a.a(h(i10));
    }

    public int g() {
        return this.f16100a.c() - this.f16102c.size();
    }

    public final int h(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int c10 = this.f16100a.c();
        int i11 = i10;
        while (i11 < c10) {
            int b10 = i10 - (i11 - this.f16101b.b(i11));
            if (b10 == 0) {
                while (this.f16101b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += b10;
        }
        return -1;
    }

    public View i(int i10) {
        return this.f16100a.a(i10);
    }

    public int j() {
        return this.f16100a.c();
    }

    public void k(View view) {
        int h10 = this.f16100a.h(view);
        if (h10 >= 0) {
            this.f16101b.h(h10);
            l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public final void l(View view) {
        this.f16102c.add(view);
        this.f16100a.b(view);
    }

    public int m(View view) {
        int h10 = this.f16100a.h(view);
        if (h10 == -1 || this.f16101b.d(h10)) {
            return -1;
        }
        return h10 - this.f16101b.b(h10);
    }

    public boolean n(View view) {
        return this.f16102c.contains(view);
    }

    public void o() {
        this.f16101b.g();
        for (int size = this.f16102c.size() - 1; size >= 0; size--) {
            this.f16100a.i(this.f16102c.get(size));
            this.f16102c.remove(size);
        }
        this.f16100a.g();
    }

    public void p(View view) {
        int h10 = this.f16100a.h(view);
        if (h10 < 0) {
            return;
        }
        if (this.f16101b.f(h10)) {
            t(view);
        }
        this.f16100a.j(h10);
    }

    public void q(int i10) {
        int h10 = h(i10);
        View a10 = this.f16100a.a(h10);
        if (a10 == null) {
            return;
        }
        if (this.f16101b.f(h10)) {
            t(a10);
        }
        this.f16100a.j(h10);
    }

    public boolean r(View view) {
        int h10 = this.f16100a.h(view);
        if (h10 == -1) {
            t(view);
            return true;
        } else if (this.f16101b.d(h10)) {
            this.f16101b.f(h10);
            t(view);
            this.f16100a.j(h10);
            return true;
        } else {
            return false;
        }
    }

    public void s(View view) {
        int h10 = this.f16100a.h(view);
        if (h10 >= 0) {
            if (this.f16101b.d(h10)) {
                this.f16101b.a(h10);
                t(view);
                return;
            }
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public final boolean t(View view) {
        if (this.f16102c.remove(view)) {
            this.f16100a.i(view);
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f16101b.toString() + ", hidden list:" + this.f16102c.size();
    }
}
