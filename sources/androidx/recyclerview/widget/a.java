package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements w.a {

    /* renamed from: a  reason: collision with root package name */
    public n3.e<b> f16037a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f16038b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<b> f16039c;

    /* renamed from: d  reason: collision with root package name */
    public final InterfaceC0071a f16040d;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f16041e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f16042f;

    /* renamed from: g  reason: collision with root package name */
    public final w f16043g;

    /* renamed from: h  reason: collision with root package name */
    public int f16044h;

    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0071a {
        void a(int i10, int i11);

        void b(b bVar);

        void c(b bVar);

        void d(int i10, int i11);

        void e(int i10, int i11, Object obj);

        RecyclerView.e0 f(int i10);

        void g(int i10, int i11);

        void h(int i10, int i11);
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f16045a;

        /* renamed from: b  reason: collision with root package name */
        public int f16046b;

        /* renamed from: c  reason: collision with root package name */
        public Object f16047c;

        /* renamed from: d  reason: collision with root package name */
        public int f16048d;

        public b(int i10, int i11, int i12, Object obj) {
            this.f16045a = i10;
            this.f16046b = i11;
            this.f16048d = i12;
            this.f16047c = obj;
        }

        public String a() {
            int i10 = this.f16045a;
            return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                int i10 = this.f16045a;
                if (i10 != bVar.f16045a) {
                    return false;
                }
                if (i10 == 8 && Math.abs(this.f16048d - this.f16046b) == 1 && this.f16048d == bVar.f16046b && this.f16046b == bVar.f16048d) {
                    return true;
                }
                if (this.f16048d == bVar.f16048d && this.f16046b == bVar.f16046b) {
                    Object obj2 = this.f16047c;
                    if (obj2 != null) {
                        if (!obj2.equals(bVar.f16047c)) {
                            return false;
                        }
                    } else if (bVar.f16047c != null) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f16045a * 31) + this.f16046b) * 31) + this.f16048d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f16046b + "c:" + this.f16048d + ",p:" + this.f16047c + "]";
        }
    }

    public a(InterfaceC0071a interfaceC0071a) {
        this(interfaceC0071a, false);
    }

    @Override // androidx.recyclerview.widget.w.a
    public b a(int i10, int i11, int i12, Object obj) {
        b acquire = this.f16037a.acquire();
        if (acquire == null) {
            return new b(i10, i11, i12, obj);
        }
        acquire.f16045a = i10;
        acquire.f16046b = i11;
        acquire.f16048d = i12;
        acquire.f16047c = obj;
        return acquire;
    }

    @Override // androidx.recyclerview.widget.w.a
    public void b(b bVar) {
        if (this.f16042f) {
            return;
        }
        bVar.f16047c = null;
        this.f16037a.a(bVar);
    }

    public final void c(b bVar) {
        v(bVar);
    }

    public final void d(b bVar) {
        v(bVar);
    }

    public int e(int i10) {
        int size = this.f16038b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f16038b.get(i11);
            int i12 = bVar.f16045a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f16046b;
                    if (i13 <= i10) {
                        int i14 = bVar.f16048d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f16046b;
                    if (i15 == i10) {
                        i10 = bVar.f16048d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f16048d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f16046b <= i10) {
                i10 += bVar.f16048d;
            }
        }
        return i10;
    }

    public final void f(b bVar) {
        boolean z10;
        char c10;
        int i10 = bVar.f16046b;
        int i11 = bVar.f16048d + i10;
        char c11 = 65535;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f16040d.f(i12) != null || h(i12)) {
                if (c11 == 0) {
                    k(a(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 1;
            } else {
                if (c11 == 1) {
                    v(a(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 0;
            }
            if (z10) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            c11 = c10;
        }
        if (i13 != bVar.f16048d) {
            b(bVar);
            bVar = a(2, i10, i13, null);
        }
        if (c11 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    public final void g(b bVar) {
        int i10 = bVar.f16046b;
        int i11 = bVar.f16048d + i10;
        int i12 = 0;
        boolean z10 = true;
        int i13 = i10;
        while (i10 < i11) {
            if (this.f16040d.f(i10) != null || h(i10)) {
                if (!z10) {
                    k(a(4, i13, i12, bVar.f16047c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = true;
            } else {
                if (z10) {
                    v(a(4, i13, i12, bVar.f16047c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = false;
            }
            i12++;
            i10++;
        }
        if (i12 != bVar.f16048d) {
            Object obj = bVar.f16047c;
            b(bVar);
            bVar = a(4, i13, i12, obj);
        }
        if (!z10) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    public final boolean h(int i10) {
        int size = this.f16039c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f16039c.get(i11);
            int i12 = bVar.f16045a;
            if (i12 == 8) {
                if (n(bVar.f16048d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f16046b;
                int i14 = bVar.f16048d + i13;
                while (i13 < i14) {
                    if (n(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public void i() {
        int size = this.f16039c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f16040d.c(this.f16039c.get(i10));
        }
        x(this.f16039c);
        this.f16044h = 0;
    }

    public void j() {
        i();
        int size = this.f16038b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f16038b.get(i10);
            int i11 = bVar.f16045a;
            if (i11 == 1) {
                this.f16040d.c(bVar);
                this.f16040d.g(bVar.f16046b, bVar.f16048d);
            } else if (i11 == 2) {
                this.f16040d.c(bVar);
                this.f16040d.h(bVar.f16046b, bVar.f16048d);
            } else if (i11 == 4) {
                this.f16040d.c(bVar);
                this.f16040d.e(bVar.f16046b, bVar.f16048d, bVar.f16047c);
            } else if (i11 == 8) {
                this.f16040d.c(bVar);
                this.f16040d.a(bVar.f16046b, bVar.f16048d);
            }
            Runnable runnable = this.f16041e;
            if (runnable != null) {
                runnable.run();
            }
        }
        x(this.f16038b);
        this.f16044h = 0;
    }

    public final void k(b bVar) {
        int i10;
        int i11 = bVar.f16045a;
        if (i11 != 1 && i11 != 8) {
            int z10 = z(bVar.f16046b, i11);
            int i12 = bVar.f16046b;
            int i13 = bVar.f16045a;
            if (i13 == 2) {
                i10 = 0;
            } else if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            } else {
                i10 = 1;
            }
            int i14 = 1;
            for (int i15 = 1; i15 < bVar.f16048d; i15++) {
                int z11 = z(bVar.f16046b + (i10 * i15), bVar.f16045a);
                int i16 = bVar.f16045a;
                if (i16 == 2 ? z11 == z10 : i16 == 4 && z11 == z10 + 1) {
                    i14++;
                } else {
                    b a10 = a(i16, z10, i14, bVar.f16047c);
                    l(a10, i12);
                    b(a10);
                    if (bVar.f16045a == 4) {
                        i12 += i14;
                    }
                    i14 = 1;
                    z10 = z11;
                }
            }
            Object obj = bVar.f16047c;
            b(bVar);
            if (i14 > 0) {
                b a11 = a(bVar.f16045a, z10, i14, obj);
                l(a11, i12);
                b(a11);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public void l(b bVar, int i10) {
        this.f16040d.b(bVar);
        int i11 = bVar.f16045a;
        if (i11 == 2) {
            this.f16040d.h(i10, bVar.f16048d);
        } else if (i11 == 4) {
            this.f16040d.e(i10, bVar.f16048d, bVar.f16047c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    public int m(int i10) {
        return n(i10, 0);
    }

    public int n(int i10, int i11) {
        int size = this.f16039c.size();
        while (i11 < size) {
            b bVar = this.f16039c.get(i11);
            int i12 = bVar.f16045a;
            if (i12 == 8) {
                int i13 = bVar.f16046b;
                if (i13 == i10) {
                    i10 = bVar.f16048d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f16048d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f16046b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f16048d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f16048d;
                }
            }
            i11++;
        }
        return i10;
    }

    public boolean o(int i10) {
        return (i10 & this.f16044h) != 0;
    }

    public boolean p() {
        return this.f16038b.size() > 0;
    }

    public boolean q() {
        return (this.f16039c.isEmpty() || this.f16038b.isEmpty()) ? false : true;
    }

    public boolean r(int i10, int i11, Object obj) {
        if (i11 < 1) {
            return false;
        }
        this.f16038b.add(a(4, i10, i11, obj));
        this.f16044h |= 4;
        return this.f16038b.size() == 1;
    }

    public boolean s(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f16038b.add(a(1, i10, i11, null));
        this.f16044h |= 1;
        return this.f16038b.size() == 1;
    }

    public boolean t(int i10, int i11, int i12) {
        if (i10 == i11) {
            return false;
        }
        if (i12 == 1) {
            this.f16038b.add(a(8, i10, i11, null));
            this.f16044h |= 8;
            return this.f16038b.size() == 1;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    public boolean u(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f16038b.add(a(2, i10, i11, null));
        this.f16044h |= 2;
        return this.f16038b.size() == 1;
    }

    public final void v(b bVar) {
        this.f16039c.add(bVar);
        int i10 = bVar.f16045a;
        if (i10 == 1) {
            this.f16040d.g(bVar.f16046b, bVar.f16048d);
        } else if (i10 == 2) {
            this.f16040d.d(bVar.f16046b, bVar.f16048d);
        } else if (i10 == 4) {
            this.f16040d.e(bVar.f16046b, bVar.f16048d, bVar.f16047c);
        } else if (i10 == 8) {
            this.f16040d.a(bVar.f16046b, bVar.f16048d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    public void w() {
        this.f16043g.b(this.f16038b);
        int size = this.f16038b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f16038b.get(i10);
            int i11 = bVar.f16045a;
            if (i11 == 1) {
                c(bVar);
            } else if (i11 == 2) {
                f(bVar);
            } else if (i11 == 4) {
                g(bVar);
            } else if (i11 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f16041e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f16038b.clear();
    }

    public void x(List<b> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            b(list.get(i10));
        }
        list.clear();
    }

    public void y() {
        x(this.f16038b);
        x(this.f16039c);
        this.f16044h = 0;
    }

    public final int z(int i10, int i11) {
        int i12;
        int i13;
        for (int size = this.f16039c.size() - 1; size >= 0; size--) {
            b bVar = this.f16039c.get(size);
            int i14 = bVar.f16045a;
            if (i14 == 8) {
                int i15 = bVar.f16046b;
                int i16 = bVar.f16048d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            bVar.f16046b = i15 + 1;
                            bVar.f16048d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f16046b = i15 - 1;
                            bVar.f16048d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        bVar.f16048d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f16048d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        bVar.f16046b = i15 + 1;
                    } else if (i11 == 2) {
                        bVar.f16046b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = bVar.f16046b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f16048d;
                    } else if (i14 == 2) {
                        i10 += bVar.f16048d;
                    }
                } else if (i11 == 1) {
                    bVar.f16046b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f16046b = i17 - 1;
                }
            }
        }
        for (int size2 = this.f16039c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f16039c.get(size2);
            if (bVar2.f16045a == 8) {
                int i18 = bVar2.f16048d;
                if (i18 == bVar2.f16046b || i18 < 0) {
                    this.f16039c.remove(size2);
                    b(bVar2);
                }
            } else if (bVar2.f16048d <= 0) {
                this.f16039c.remove(size2);
                b(bVar2);
            }
        }
        return i10;
    }

    public a(InterfaceC0071a interfaceC0071a, boolean z10) {
        this.f16037a = new n3.f(30);
        this.f16038b = new ArrayList<>();
        this.f16039c = new ArrayList<>();
        this.f16044h = 0;
        this.f16040d = interfaceC0071a;
        this.f16042f = z10;
        this.f16043g = new w(this);
    }
}
