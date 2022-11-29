package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes.dex */
public class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final b f16093a;

    /* renamed from: b  reason: collision with root package name */
    public a f16094b = new a();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f16095a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f16096b;

        /* renamed from: c  reason: collision with root package name */
        public int f16097c;

        /* renamed from: d  reason: collision with root package name */
        public int f16098d;

        /* renamed from: e  reason: collision with root package name */
        public int f16099e;

        public void a(int i10) {
            this.f16095a = i10 | this.f16095a;
        }

        public boolean b() {
            int i10 = this.f16095a;
            if ((i10 & 7) == 0 || (i10 & (c(this.f16098d, this.f16096b) << 0)) != 0) {
                int i11 = this.f16095a;
                if ((i11 & 112) == 0 || (i11 & (c(this.f16098d, this.f16097c) << 4)) != 0) {
                    int i12 = this.f16095a;
                    if ((i12 & 1792) == 0 || (i12 & (c(this.f16099e, this.f16096b) << 8)) != 0) {
                        int i13 = this.f16095a;
                        return (i13 & 28672) == 0 || (i13 & (c(this.f16099e, this.f16097c) << 12)) != 0;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        public void d() {
            this.f16095a = 0;
        }

        public void e(int i10, int i11, int i12, int i13) {
            this.f16096b = i10;
            this.f16097c = i11;
            this.f16098d = i12;
            this.f16099e = i13;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        View a(int i10);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    public e0(b bVar) {
        this.f16093a = bVar;
    }

    public View a(int i10, int i11, int i12, int i13) {
        int c10 = this.f16093a.c();
        int d10 = this.f16093a.d();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View a10 = this.f16093a.a(i10);
            this.f16094b.e(c10, d10, this.f16093a.b(a10), this.f16093a.e(a10));
            if (i12 != 0) {
                this.f16094b.d();
                this.f16094b.a(i12);
                if (this.f16094b.b()) {
                    return a10;
                }
            }
            if (i13 != 0) {
                this.f16094b.d();
                this.f16094b.a(i13);
                if (this.f16094b.b()) {
                    view = a10;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public boolean b(View view, int i10) {
        this.f16094b.e(this.f16093a.c(), this.f16093a.d(), this.f16093a.b(view), this.f16093a.e(view));
        if (i10 != 0) {
            this.f16094b.d();
            this.f16094b.a(i10);
            return this.f16094b.b();
        }
        return false;
    }
}
