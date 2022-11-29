package d7;

import e7.c;
import java.io.IOException;

/* loaded from: classes.dex */
public class k {

    /* renamed from: f  reason: collision with root package name */
    public static final c.a f29260f = c.a.a("ef");

    /* renamed from: g  reason: collision with root package name */
    public static final c.a f29261g = c.a.a("nm", "v");

    /* renamed from: a  reason: collision with root package name */
    public z6.a f29262a;

    /* renamed from: b  reason: collision with root package name */
    public z6.b f29263b;

    /* renamed from: c  reason: collision with root package name */
    public z6.b f29264c;

    /* renamed from: d  reason: collision with root package name */
    public z6.b f29265d;

    /* renamed from: e  reason: collision with root package name */
    public z6.b f29266e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
        if (r0.equals("Opacity") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(e7.c r6, s6.d r7) throws java.io.IOException {
        /*
            r5 = this;
            r6.d()
            java.lang.String r0 = ""
        L5:
            boolean r1 = r6.i()
            if (r1 == 0) goto L90
            e7.c$a r1 = d7.k.f29261g
            int r1 = r6.E(r1)
            if (r1 == 0) goto L8a
            r2 = 1
            if (r1 == r2) goto L1d
            r6.F()
            r6.G()
            goto L5
        L1d:
            r0.hashCode()
            r1 = -1
            int r3 = r0.hashCode()
            r4 = 0
            switch(r3) {
                case 353103893: goto L55;
                case 397447147: goto L4c;
                case 1041377119: goto L41;
                case 1379387491: goto L36;
                case 1383710113: goto L2b;
                default: goto L29;
            }
        L29:
            r2 = r1
            goto L5f
        L2b:
            java.lang.String r2 = "Softness"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L34
            goto L29
        L34:
            r2 = 4
            goto L5f
        L36:
            java.lang.String r2 = "Shadow Color"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L3f
            goto L29
        L3f:
            r2 = 3
            goto L5f
        L41:
            java.lang.String r2 = "Direction"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L4a
            goto L29
        L4a:
            r2 = 2
            goto L5f
        L4c:
            java.lang.String r3 = "Opacity"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L5f
            goto L29
        L55:
            java.lang.String r2 = "Distance"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L5e
            goto L29
        L5e:
            r2 = r4
        L5f:
            switch(r2) {
                case 0: goto L82;
                case 1: goto L7b;
                case 2: goto L74;
                case 3: goto L6d;
                case 4: goto L66;
                default: goto L62;
            }
        L62:
            r6.G()
            goto L5
        L66:
            z6.b r1 = d7.d.e(r6, r7)
            r5.f29266e = r1
            goto L5
        L6d:
            z6.a r1 = d7.d.c(r6, r7)
            r5.f29262a = r1
            goto L5
        L74:
            z6.b r1 = d7.d.f(r6, r7, r4)
            r5.f29264c = r1
            goto L5
        L7b:
            z6.b r1 = d7.d.f(r6, r7, r4)
            r5.f29263b = r1
            goto L5
        L82:
            z6.b r1 = d7.d.e(r6, r7)
            r5.f29265d = r1
            goto L5
        L8a:
            java.lang.String r0 = r6.q()
            goto L5
        L90:
            r6.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.k.a(e7.c, s6.d):void");
    }

    public j b(e7.c cVar, s6.d dVar) throws IOException {
        z6.b bVar;
        z6.b bVar2;
        z6.b bVar3;
        z6.b bVar4;
        while (cVar.i()) {
            if (cVar.E(f29260f) != 0) {
                cVar.F();
                cVar.G();
            } else {
                cVar.c();
                while (cVar.i()) {
                    a(cVar, dVar);
                }
                cVar.e();
            }
        }
        z6.a aVar = this.f29262a;
        if (aVar == null || (bVar = this.f29263b) == null || (bVar2 = this.f29264c) == null || (bVar3 = this.f29265d) == null || (bVar4 = this.f29266e) == null) {
            return null;
        }
        return new j(aVar, bVar, bVar2, bVar3, bVar4);
    }
}
