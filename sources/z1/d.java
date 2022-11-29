package z1;

import android.text.Layout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Layout f62433a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Integer> f62434b;

    /* renamed from: c  reason: collision with root package name */
    public final List<Bidi> f62435c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean[] f62436d;

    /* renamed from: e  reason: collision with root package name */
    public char[] f62437e;

    /* renamed from: f  reason: collision with root package name */
    public final int f62438f;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f62439a;

        /* renamed from: b  reason: collision with root package name */
        public final int f62440b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f62441c;

        public a(int i10, int i11, boolean z10) {
            this.f62439a = i10;
            this.f62440b = i11;
            this.f62441c = z10;
        }

        public final int a() {
            return this.f62440b;
        }

        public final int b() {
            return this.f62439a;
        }

        public final boolean c() {
            return this.f62441c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f62439a == aVar.f62439a && this.f62440b == aVar.f62440b && this.f62441c == aVar.f62441c;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((Integer.hashCode(this.f62439a) * 31) + Integer.hashCode(this.f62440b)) * 31;
            boolean z10 = this.f62441c;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return hashCode + i10;
        }

        public String toString() {
            return "BidiRun(start=" + this.f62439a + ", end=" + this.f62440b + ", isRtl=" + this.f62441c + ')';
        }
    }

    public d(Layout layout) {
        jo.p.h(layout, TtmlNode.TAG_LAYOUT);
        this.f62433a = layout;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        do {
            CharSequence text = this.f62433a.getText();
            jo.p.g(text, "layout.text");
            int T = so.o.T(text, '\n', i10, false, 4, null);
            i10 = T < 0 ? this.f62433a.getText().length() : T + 1;
            arrayList.add(Integer.valueOf(i10));
        } while (i10 < this.f62433a.getText().length());
        this.f62434b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList2.add(null);
        }
        this.f62435c = arrayList2;
        this.f62436d = new boolean[this.f62434b.size()];
        this.f62438f = this.f62434b.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
        if (r0.getRunCount() == 1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.text.Bidi a(int r12) {
        /*
            r11 = this;
            boolean[] r0 = r11.f62436d
            boolean r0 = r0[r12]
            if (r0 == 0) goto Lf
            java.util.List<java.text.Bidi> r0 = r11.f62435c
            java.lang.Object r12 = r0.get(r12)
            java.text.Bidi r12 = (java.text.Bidi) r12
            return r12
        Lf:
            r0 = 0
            if (r12 != 0) goto L14
            r1 = r0
            goto L22
        L14:
            java.util.List<java.lang.Integer> r1 = r11.f62434b
            int r2 = r12 + (-1)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L22:
            java.util.List<java.lang.Integer> r2 = r11.f62434b
            java.lang.Object r2 = r2.get(r12)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r8 = r2 - r1
            char[] r3 = r11.f62437e
            if (r3 == 0) goto L37
            int r4 = r3.length
            if (r4 >= r8) goto L39
        L37:
            char[] r3 = new char[r8]
        L39:
            r10 = r3
            android.text.Layout r3 = r11.f62433a
            java.lang.CharSequence r3 = r3.getText()
            android.text.TextUtils.getChars(r3, r1, r2, r10, r0)
            boolean r0 = java.text.Bidi.requiresBidi(r10, r0, r8)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5f
            boolean r9 = r11.g(r12)
            java.text.Bidi r0 = new java.text.Bidi
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r0
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r3 = r0.getRunCount()
            if (r3 != r2) goto L60
        L5f:
            r0 = r1
        L60:
            java.util.List<java.text.Bidi> r3 = r11.f62435c
            r3.set(r12, r0)
            boolean[] r3 = r11.f62436d
            r3[r12] = r2
            if (r0 == 0) goto L72
            char[] r12 = r11.f62437e
            if (r10 != r12) goto L71
            r10 = r1
            goto L72
        L71:
            r10 = r12
        L72:
            r11.f62437e = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.d.a(int):java.text.Bidi");
    }

    public final float b(int i10, boolean z10) {
        if (z10) {
            return this.f62433a.getPrimaryHorizontal(i10);
        }
        return this.f62433a.getSecondaryHorizontal(i10);
    }

    public final float c(int i10, boolean z10, boolean z11) {
        if (!z11) {
            return b(i10, z10);
        }
        int a10 = c.a(this.f62433a, i10, z11);
        int lineStart = this.f62433a.getLineStart(a10);
        int lineEnd = this.f62433a.getLineEnd(a10);
        if (i10 != lineStart && i10 != lineEnd) {
            return b(i10, z10);
        }
        if (i10 != 0 && i10 != this.f62433a.getText().length()) {
            int d10 = d(i10, z11);
            boolean g10 = g(d10);
            int h10 = h(lineEnd);
            int e10 = e(d10);
            int i11 = lineStart - e10;
            int i12 = h10 - e10;
            Bidi a11 = a(d10);
            Bidi createLineBidi = a11 != null ? a11.createLineBidi(i11, i12) : null;
            boolean z12 = false;
            if (createLineBidi != null && createLineBidi.getRunCount() != 1) {
                int runCount = createLineBidi.getRunCount();
                a[] aVarArr = new a[runCount];
                for (int i13 = 0; i13 < runCount; i13++) {
                    aVarArr[i13] = new a(createLineBidi.getRunStart(i13) + lineStart, createLineBidi.getRunLimit(i13) + lineStart, createLineBidi.getRunLevel(i13) % 2 == 1);
                }
                int runCount2 = createLineBidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i14 = 0; i14 < runCount2; i14++) {
                    bArr[i14] = (byte) createLineBidi.getRunLevel(i14);
                }
                Bidi.reorderVisually(bArr, 0, aVarArr, 0, runCount);
                int i15 = -1;
                if (i10 == lineStart) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= runCount) {
                            break;
                        }
                        if (aVarArr[i16].b() == i10) {
                            i15 = i16;
                            break;
                        }
                        i16++;
                    }
                    a aVar = aVarArr[i15];
                    if (z10 || g10 == aVar.c()) {
                        g10 = !g10;
                    }
                    if (i15 == 0 && g10) {
                        return this.f62433a.getLineLeft(a10);
                    }
                    if (i15 != xn.o.L(aVarArr) || g10) {
                        if (g10) {
                            return this.f62433a.getPrimaryHorizontal(aVarArr[i15 - 1].b());
                        }
                        return this.f62433a.getPrimaryHorizontal(aVarArr[i15 + 1].b());
                    }
                    return this.f62433a.getLineRight(a10);
                }
                int i17 = 0;
                while (true) {
                    if (i17 >= runCount) {
                        break;
                    }
                    if (aVarArr[i17].a() == i10) {
                        i15 = i17;
                        break;
                    }
                    i17++;
                }
                a aVar2 = aVarArr[i15];
                if (!z10 && g10 != aVar2.c()) {
                    g10 = !g10;
                }
                if (i15 == 0 && g10) {
                    return this.f62433a.getLineLeft(a10);
                }
                if (i15 != xn.o.L(aVarArr) || g10) {
                    if (g10) {
                        return this.f62433a.getPrimaryHorizontal(aVarArr[i15 - 1].a());
                    }
                    return this.f62433a.getPrimaryHorizontal(aVarArr[i15 + 1].a());
                }
                return this.f62433a.getLineRight(a10);
            }
            boolean isRtlCharAt = this.f62433a.isRtlCharAt(lineStart);
            if (z10 || g10 == isRtlCharAt) {
                g10 = !g10;
            }
            if (i10 == lineStart) {
                z12 = g10;
            } else if (!g10) {
                z12 = true;
            }
            Layout layout = this.f62433a;
            return z12 ? layout.getLineLeft(a10) : layout.getLineRight(a10);
        }
        return b(i10, z10);
    }

    public final int d(int i10, boolean z10) {
        int j10 = xn.s.j(this.f62434b, Integer.valueOf(i10), 0, 0, 6, null);
        int i11 = j10 < 0 ? -(j10 + 1) : j10 + 1;
        if (z10 && i11 > 0) {
            int i12 = i11 - 1;
            if (i10 == this.f62434b.get(i12).intValue()) {
                return i12;
            }
        }
        return i11;
    }

    public final int e(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return this.f62434b.get(i10 - 1).intValue();
    }

    public final boolean f(char c10) {
        if (c10 == ' ' || c10 == '\n' || c10 == 5760) {
            return true;
        }
        return ((8192 <= c10 && c10 < 8203) && c10 != 8199) || c10 == 8287 || c10 == 12288;
    }

    public final boolean g(int i10) {
        return this.f62433a.getParagraphDirection(this.f62433a.getLineForOffset(e(i10))) == -1;
    }

    public final int h(int i10) {
        while (i10 > 0 && f(this.f62433a.getText().charAt(i10 - 1))) {
            i10--;
        }
        return i10;
    }
}
