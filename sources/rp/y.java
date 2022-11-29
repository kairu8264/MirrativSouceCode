package rp;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes4.dex */
public final class y implements Comparable<y> {

    /* renamed from: x  reason: collision with root package name */
    public static final a f51736x = new a(null);

    /* renamed from: y  reason: collision with root package name */
    public static final String f51737y;

    /* renamed from: w  reason: collision with root package name */
    public final f f51738w;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public static /* synthetic */ y d(a aVar, File file, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.a(file, z10);
        }

        public static /* synthetic */ y e(a aVar, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.b(str, z10);
        }

        public static /* synthetic */ y f(a aVar, Path path, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.c(path, z10);
        }

        public final y a(File file, boolean z10) {
            jo.p.h(file, "<this>");
            String file2 = file.toString();
            jo.p.g(file2, "toString()");
            return b(file2, z10);
        }

        public final y b(String str, boolean z10) {
            jo.p.h(str, "<this>");
            return sp.i.k(str, z10);
        }

        @IgnoreJRERequirement
        public final y c(Path path, boolean z10) {
            jo.p.h(path, "<this>");
            return b(path.toString(), z10);
        }
    }

    static {
        String str = File.separator;
        jo.p.g(str, "separator");
        f51737y = str;
    }

    public y(f fVar) {
        jo.p.h(fVar, "bytes");
        this.f51738w = fVar;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(y yVar) {
        jo.p.h(yVar, "other");
        return c().compareTo(yVar.c());
    }

    public final f c() {
        return this.f51738w;
    }

    public final y e() {
        int h10 = sp.i.h(this);
        if (h10 == -1) {
            return null;
        }
        return new y(c().I(0, h10));
    }

    public boolean equals(Object obj) {
        return (obj instanceof y) && jo.p.c(((y) obj).c(), c());
    }

    public final List<f> h() {
        ArrayList arrayList = new ArrayList();
        int h10 = sp.i.h(this);
        if (h10 == -1) {
            h10 = 0;
        } else if (h10 < c().G() && c().l(h10) == ((byte) 92)) {
            h10++;
        }
        int G = c().G();
        if (h10 < G) {
            int i10 = h10;
            while (true) {
                int i11 = h10 + 1;
                if (c().l(h10) == ((byte) 47) || c().l(h10) == ((byte) 92)) {
                    arrayList.add(c().I(i10, h10));
                    i10 = i11;
                }
                if (i11 >= G) {
                    break;
                }
                h10 = i11;
            }
            h10 = i10;
        }
        if (h10 < c().G()) {
            arrayList.add(c().I(h10, c().G()));
        }
        return arrayList;
    }

    public int hashCode() {
        return c().hashCode();
    }

    public final boolean i() {
        return sp.i.h(this) != -1;
    }

    public final String l() {
        return m().L();
    }

    public final f m() {
        int d10 = sp.i.d(this);
        if (d10 != -1) {
            return f.J(c(), d10 + 1, 0, 2, null);
        }
        return (t() == null || c().G() != 2) ? c() : f.A;
    }

    public final y n() {
        y yVar;
        if (jo.p.c(c(), sp.i.b()) || jo.p.c(c(), sp.i.e()) || jo.p.c(c(), sp.i.a()) || sp.i.g(this)) {
            return null;
        }
        int d10 = sp.i.d(this);
        if (d10 == 2 && t() != null) {
            if (c().G() == 3) {
                return null;
            }
            yVar = new y(f.J(c(), 0, 3, 1, null));
        } else if (d10 == 1 && c().H(sp.i.a())) {
            return null;
        } else {
            if (d10 != -1 || t() == null) {
                if (d10 == -1) {
                    return new y(sp.i.b());
                }
                if (d10 == 0) {
                    yVar = new y(f.J(c(), 0, 1, 1, null));
                } else {
                    return new y(f.J(c(), 0, d10, 1, null));
                }
            } else if (c().G() == 2) {
                return null;
            } else {
                yVar = new y(f.J(c(), 0, 2, 1, null));
            }
        }
        return yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6 A[LOOP:2: B:31:0x00a6->B:34:0x00b7, LOOP_START, PHI: r5 
      PHI: (r5v2 int) = (r5v1 int), (r5v5 int) binds: [B:30:0x00a4, B:34:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final rp.y o(rp.y r9) {
        /*
            r8 = this;
            java.lang.String r0 = "other"
            jo.p.h(r9, r0)
            rp.y r0 = r8.e()
            rp.y r1 = r9.e()
            boolean r0 = jo.p.c(r0, r1)
            java.lang.String r1 = " and "
            if (r0 == 0) goto Ldf
            java.util.List r0 = r8.h()
            java.util.List r2 = r9.h()
            int r3 = r0.size()
            int r4 = r2.size()
            int r3 = java.lang.Math.min(r3, r4)
            r4 = 0
            r5 = r4
        L2b:
            if (r5 >= r3) goto L3e
            java.lang.Object r6 = r0.get(r5)
            java.lang.Object r7 = r2.get(r5)
            boolean r6 = jo.p.c(r6, r7)
            if (r6 == 0) goto L3e
            int r5 = r5 + 1
            goto L2b
        L3e:
            r6 = 1
            if (r5 != r3) goto L5d
            rp.f r3 = r8.c()
            int r3 = r3.G()
            rp.f r7 = r9.c()
            int r7 = r7.G()
            if (r3 != r7) goto L5d
            rp.y$a r9 = rp.y.f51736x
            r0 = 0
            java.lang.String r1 = "."
            rp.y r9 = rp.y.a.e(r9, r1, r4, r6, r0)
            goto Lbd
        L5d:
            int r3 = r2.size()
            java.util.List r3 = r2.subList(r5, r3)
            rp.f r7 = sp.i.c()
            int r3 = r3.indexOf(r7)
            r7 = -1
            if (r3 != r7) goto L72
            r3 = r6
            goto L73
        L72:
            r3 = r4
        L73:
            if (r3 == 0) goto Lbe
            rp.c r1 = new rp.c
            r1.<init>()
            rp.f r9 = sp.i.f(r9)
            if (r9 != 0) goto L8c
            rp.f r9 = sp.i.f(r8)
            if (r9 != 0) goto L8c
            java.lang.String r9 = rp.y.f51737y
            rp.f r9 = sp.i.i(r9)
        L8c:
            int r2 = r2.size()
            if (r5 >= r2) goto La0
            r3 = r5
        L93:
            int r3 = r3 + r6
            rp.f r7 = sp.i.c()
            r1.o0(r7)
            r1.o0(r9)
            if (r3 < r2) goto L93
        La0:
            int r2 = r0.size()
            if (r5 >= r2) goto Lb9
        La6:
            int r3 = r5 + 1
            java.lang.Object r5 = r0.get(r5)
            rp.f r5 = (rp.f) r5
            r1.o0(r5)
            r1.o0(r9)
            if (r3 < r2) goto Lb7
            goto Lb9
        Lb7:
            r5 = r3
            goto La6
        Lb9:
            rp.y r9 = sp.i.q(r1, r4)
        Lbd:
            return r9
        Lbe:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Impossible relative path to resolve: "
            r0.append(r2)
            r0.append(r8)
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        Ldf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Paths of different roots cannot be relative to each other: "
            r0.append(r2)
            r0.append(r8)
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rp.y.o(rp.y):rp.y");
    }

    public final y p(String str) {
        jo.p.h(str, "child");
        return sp.i.j(this, sp.i.q(new c().a0(str), false), false);
    }

    public final y q(y yVar, boolean z10) {
        jo.p.h(yVar, "child");
        return sp.i.j(this, yVar, z10);
    }

    public final File r() {
        return new File(toString());
    }

    @IgnoreJRERequirement
    public final Path s() {
        Path path = Paths.get(toString(), new String[0]);
        jo.p.g(path, "get(toString())");
        return path;
    }

    public final Character t() {
        boolean z10 = false;
        if (f.t(c(), sp.i.e(), 0, 2, null) == -1 && c().G() >= 2 && c().l(1) == ((byte) 58)) {
            char l10 = (char) c().l(0);
            if (!('a' <= l10 && l10 <= 'z')) {
                if ('A' <= l10 && l10 <= 'Z') {
                    z10 = true;
                }
                if (!z10) {
                    return null;
                }
            }
            return Character.valueOf(l10);
        }
        return null;
    }

    public String toString() {
        return c().L();
    }
}
