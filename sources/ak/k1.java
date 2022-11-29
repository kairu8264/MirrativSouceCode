package ak;

import java.io.File;

/* loaded from: classes3.dex */
public final class k1 {

    /* renamed from: g  reason: collision with root package name */
    public static final dk.f f13495g = new dk.f("ExtractChunkTaskHandler");

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f13496a = new byte[8192];

    /* renamed from: b  reason: collision with root package name */
    public final o0 f13497b;

    /* renamed from: c  reason: collision with root package name */
    public final dk.b0<u4> f13498c;

    /* renamed from: d  reason: collision with root package name */
    public final dk.b0<i0> f13499d;

    /* renamed from: e  reason: collision with root package name */
    public final t1 f13500e;

    /* renamed from: f  reason: collision with root package name */
    public final i3 f13501f;

    public k1(o0 o0Var, dk.b0<u4> b0Var, dk.b0<i0> b0Var2, t1 t1Var, i3 i3Var) {
        this.f13497b = o0Var;
        this.f13498c = b0Var;
        this.f13499d = b0Var2;
        this.f13500e = t1Var;
        this.f13501f = i3Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:1|(1:3)|4|5|6|(1:8)(2:125|126)|9|10|11|(2:13|(12:15|(1:(1:(2:19|(1:21)(2:85|86))(2:87|88))(2:89|(10:91|(7:24|(4:25|(2:29|(1:38)(4:33|(1:35)|36|37))|39|(1:41)(1:65))|43|44|(1:46)|47|(2:49|(1:51)(2:52|(1:54)(3:55|(2:57|(1:59)(2:61|62))(1:64)|60))))|66|67|(2:79|80)|69|70|71|72|(2:74|75)(1:76))(2:92|93)))(2:94|(4:96|(4:97|(1:99)|100|(1:103)(1:111))|106|(3:108|109|110))(2:112|113))|22|(0)|66|67|(0)|69|70|71|72|(0)(0))(2:114|115))|116|(0)|66|67|(0)|69|70|71|72|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02fa, code lost:
        ak.k1.f13495g.e("Could not close file for chunk %s of slice %s of pack %s.", java.lang.Integer.valueOf(r23.f13482h), r23.f13480f, r23.f13533b);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x029e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0186 A[Catch: all -> 0x0292, TryCatch #2 {all -> 0x0292, blocks: (B:54:0x0186, B:55:0x018f, B:57:0x0199, B:59:0x019f, B:61:0x01a5, B:63:0x01ab, B:65:0x01cf, B:66:0x01db, B:67:0x01df, B:68:0x01e6, B:70:0x01ec, B:72:0x01f2, B:74:0x01f8, B:75:0x0208, B:77:0x020e, B:79:0x0214, B:80:0x0227, B:82:0x022d, B:83:0x023c, B:85:0x0242, B:91:0x0283, B:88:0x026a, B:89:0x0271, B:90:0x0272, B:47:0x0151, B:48:0x0156, B:49:0x0160, B:50:0x0161, B:51:0x0181), top: B:122:0x0043 }] */
    /* JADX WARN: Type inference failed for: r10v0, types: [ak.o0] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(ak.j1 r23) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ak.k1.a(ak.j1):void");
    }

    public final File b(j1 j1Var) {
        File D = this.f13497b.D(j1Var.f13533b, j1Var.f13477c, j1Var.f13478d, j1Var.f13480f);
        if (!D.exists()) {
            D.mkdirs();
        }
        return D;
    }
}
