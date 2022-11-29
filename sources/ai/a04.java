package ai;

import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class a04 {

    /* renamed from: a  reason: collision with root package name */
    public final b04 f1661a = new b04();

    /* renamed from: b  reason: collision with root package name */
    public final hb f1662b = new hb(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);

    /* renamed from: c  reason: collision with root package name */
    public int f1663c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f1664d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1665e;

    public final void a() {
        this.f1661a.a();
        this.f1662b.i(0);
        this.f1663c = -1;
        this.f1665e = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(ai.nv3 r7) throws java.io.IOException {
        /*
            r6 = this;
            boolean r0 = r6.f1665e
            r1 = 0
            if (r0 != 0) goto L6
            goto Ld
        L6:
            r6.f1665e = r1
            ai.hb r0 = r6.f1662b
            r0.i(r1)
        Ld:
            boolean r0 = r6.f1665e
            r2 = 1
            if (r0 != 0) goto L9b
            int r0 = r6.f1663c
            if (r0 >= 0) goto L4e
            ai.b04 r0 = r6.f1661a
            r3 = -1
            boolean r0 = r0.b(r7, r3)
            if (r0 == 0) goto L4d
            ai.b04 r0 = r6.f1661a
            boolean r0 = r0.c(r7, r2)
            if (r0 != 0) goto L29
            goto L4d
        L29:
            ai.b04 r0 = r6.f1661a
            int r3 = r0.f2183d
            int r0 = r0.f2180a
            r0 = r0 & r2
            if (r0 != r2) goto L42
            ai.hb r0 = r6.f1662b
            int r0 = r0.m()
            if (r0 != 0) goto L42
            int r0 = r6.f(r1)
            int r3 = r3 + r0
            int r0 = r6.f1664d
            goto L43
        L42:
            r0 = r1
        L43:
            boolean r3 = ai.qv3.d(r7, r3)
            if (r3 != 0) goto L4a
            return r1
        L4a:
            r6.f1663c = r0
            goto L4e
        L4d:
            return r1
        L4e:
            int r0 = r6.f(r0)
            int r3 = r6.f1663c
            int r4 = r6.f1664d
            int r3 = r3 + r4
            if (r0 <= 0) goto L90
            ai.hb r4 = r6.f1662b
            int r5 = r4.m()
            int r5 = r5 + r0
            r4.k(r5)
            ai.hb r4 = r6.f1662b
            byte[] r4 = r4.q()
            ai.hb r5 = r6.f1662b
            int r5 = r5.m()
            boolean r4 = ai.qv3.c(r7, r4, r5, r0)
            if (r4 != 0) goto L76
            return r1
        L76:
            ai.hb r4 = r6.f1662b
            int r5 = r4.m()
            int r5 = r5 + r0
            r4.n(r5)
            ai.b04 r0 = r6.f1661a
            int[] r0 = r0.f2185f
            int r4 = r3 + (-1)
            r0 = r0[r4]
            r4 = 255(0xff, float:3.57E-43)
            if (r0 == r4) goto L8d
            goto L8e
        L8d:
            r2 = r1
        L8e:
            r6.f1665e = r2
        L90:
            ai.b04 r0 = r6.f1661a
            int r0 = r0.f2182c
            if (r3 != r0) goto L97
            r3 = -1
        L97:
            r6.f1663c = r3
            goto Ld
        L9b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.a04.b(ai.nv3):boolean");
    }

    public final b04 c() {
        return this.f1661a;
    }

    public final hb d() {
        return this.f1662b;
    }

    public final void e() {
        if (this.f1662b.q().length == 65025) {
            return;
        }
        hb hbVar = this.f1662b;
        hbVar.j(Arrays.copyOf(hbVar.q(), Math.max((int) OggPageHeader.MAX_PAGE_PAYLOAD, this.f1662b.m())), this.f1662b.m());
    }

    public final int f(int i10) {
        int i11;
        int i12 = 0;
        this.f1664d = 0;
        do {
            int i13 = this.f1664d;
            int i14 = i10 + i13;
            b04 b04Var = this.f1661a;
            if (i14 >= b04Var.f2182c) {
                break;
            }
            int[] iArr = b04Var.f2185f;
            this.f1664d = i13 + 1;
            i11 = iArr[i14];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }
}
