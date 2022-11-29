package ai;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.gms.internal.ads.zzamy;
import com.google.android.gms.internal.ads.zzano;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class mc implements Handler.Callback, lh, oi, nh {
    public final Handler A;
    public final HandlerThread B;
    public final Handler C;
    public final ec D;
    public final wc E;
    public final vc F;
    public jc G;
    public qc H;
    public rc I;
    public jj J;
    public oh K;
    public rc[] L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int S;
    public int T;
    public long U;
    public int V;
    public kc W;
    public long X;
    public ic Y;
    public ic Z;

    /* renamed from: a0  reason: collision with root package name */
    public ic f6867a0;

    /* renamed from: b0  reason: collision with root package name */
    public xc f6868b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f6869c0;

    /* renamed from: d0  reason: collision with root package name */
    public volatile int f6870d0;

    /* renamed from: e0  reason: collision with root package name */
    public volatile int f6871e0;

    /* renamed from: f0  reason: collision with root package name */
    public final bn0 f6872f0;

    /* renamed from: w  reason: collision with root package name */
    public final rc[] f6873w;

    /* renamed from: y  reason: collision with root package name */
    public final pi f6875y;

    /* renamed from: z  reason: collision with root package name */
    public final rj f6876z;
    public int R = 0;
    public int Q = 1;

    /* renamed from: x  reason: collision with root package name */
    public final sc[] f6874x = new sc[2];

    public mc(rc[] rcVarArr, pi piVar, bn0 bn0Var, boolean z10, int i10, Handler handler, jc jcVar, ec ecVar, byte[] bArr) {
        this.f6873w = rcVarArr;
        this.f6875y = piVar;
        this.f6872f0 = bn0Var;
        this.N = z10;
        this.C = handler;
        this.G = jcVar;
        this.D = ecVar;
        for (int i11 = 0; i11 < 2; i11++) {
            rcVarArr[i11].F(i11);
            this.f6874x[i11] = rcVarArr[i11].zzb();
        }
        this.f6876z = new rj();
        this.L = new rc[0];
        this.E = new wc();
        this.F = new vc();
        piVar.c(this);
        this.H = qc.f8867d;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.B = handlerThread;
        handlerThread.start();
        this.A = new Handler(handlerThread.getLooper(), this);
    }

    public static final void p(rc rcVar) throws zzamy {
        if (rcVar.c() == 2) {
            rcVar.o();
        }
    }

    public static final void q(ic icVar) {
        while (icVar != null) {
            icVar.e();
            icVar = icVar.f5171l;
        }
    }

    public final void A(int i10) {
        this.f6871e0 = i10;
    }

    public final void B(int i10) {
        if (this.Q != i10) {
            this.Q = i10;
            this.C.obtainMessage(1, i10, 0).sendToTarget();
        }
    }

    public final void C(boolean z10) {
        if (this.P != z10) {
            this.P = z10;
            this.C.obtainMessage(2, z10 ? 1 : 0, 0).sendToTarget();
        }
    }

    public final void D() throws zzamy {
        this.O = false;
        this.f6876z.a();
        for (rc rcVar : this.L) {
            rcVar.f();
        }
    }

    public final void E() throws zzamy {
        this.f6876z.b();
        for (rc rcVar : this.L) {
            p(rcVar);
        }
    }

    public final void F() throws zzamy {
        ic icVar = this.f6867a0;
        if (icVar == null) {
            return;
        }
        long p10 = icVar.f5160a.p();
        if (p10 != C.TIME_UNSET) {
            I(p10);
        } else {
            rc rcVar = this.I;
            if (rcVar != null && !rcVar.D()) {
                long q10 = this.J.q();
                this.X = q10;
                this.f6876z.c(q10);
            } else {
                this.X = this.f6876z.q();
            }
            ic icVar2 = this.f6867a0;
            p10 = this.X - (icVar2.f5165f - icVar2.f5167h);
        }
        this.G.f5689c = p10;
        this.U = SystemClock.elapsedRealtime() * 1000;
        long l10 = this.L.length == 0 ? Long.MIN_VALUE : this.f6867a0.f5160a.l();
        jc jcVar = this.G;
        if (l10 == Long.MIN_VALUE) {
            l10 = this.f6868b0.d(this.f6867a0.f5166g, this.F, false).f11019c;
        }
        jcVar.f5690d = l10;
    }

    public final void G(long j10, long j11) {
        this.A.removeMessages(2);
        long elapsedRealtime = (j10 + j11) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.A.sendEmptyMessage(2);
        } else {
            this.A.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    public final long H(int i10, long j10) throws zzamy {
        ic icVar;
        E();
        this.O = false;
        B(2);
        ic icVar2 = this.f6867a0;
        if (icVar2 == null) {
            ic icVar3 = this.Y;
            if (icVar3 != null) {
                icVar3.e();
            }
            icVar = null;
        } else {
            icVar = null;
            while (icVar2 != null) {
                if (icVar2.f5166g == i10 && icVar2.f5169j) {
                    icVar = icVar2;
                } else {
                    icVar2.e();
                }
                icVar2 = icVar2.f5171l;
            }
        }
        ic icVar4 = this.f6867a0;
        if (icVar4 != icVar || icVar4 != this.Z) {
            for (rc rcVar : this.L) {
                rcVar.p();
            }
            this.L = new rc[0];
            this.J = null;
            this.I = null;
            this.f6867a0 = null;
        }
        if (icVar != null) {
            icVar.f5171l = null;
            this.Y = icVar;
            this.Z = icVar;
            n(icVar);
            ic icVar5 = this.f6867a0;
            if (icVar5.f5170k) {
                j10 = icVar5.f5160a.j(j10);
            }
            I(j10);
            m();
        } else {
            this.Y = null;
            this.Z = null;
            this.f6867a0 = null;
            I(j10);
        }
        this.A.sendEmptyMessage(2);
        return j10;
    }

    public final void I(long j10) throws zzamy {
        ic icVar = this.f6867a0;
        long j11 = icVar == null ? j10 + 60000000 : j10 + (icVar.f5165f - icVar.f5167h);
        this.X = j11;
        this.f6876z.c(j11);
        for (rc rcVar : this.L) {
            rcVar.O(this.X);
        }
    }

    public final void J() {
        K(true);
        this.f6872f0.c();
        B(1);
    }

    public final void K(boolean z10) {
        rc[] rcVarArr;
        this.A.removeMessages(2);
        this.O = false;
        this.f6876z.b();
        this.J = null;
        this.I = null;
        this.X = 60000000L;
        for (rc rcVar : this.L) {
            try {
                p(rcVar);
                rcVar.p();
            } catch (zzamy | RuntimeException e10) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e10);
            }
        }
        this.L = new rc[0];
        ic icVar = this.f6867a0;
        if (icVar == null) {
            icVar = this.Y;
        }
        q(icVar);
        this.Y = null;
        this.Z = null;
        this.f6867a0 = null;
        C(false);
        if (z10) {
            oh ohVar = this.K;
            if (ohVar != null) {
                ohVar.d();
                this.K = null;
            }
            this.f6868b0 = null;
        }
    }

    public final boolean L(long j10) {
        ic icVar;
        return j10 == C.TIME_UNSET || this.G.f5689c < j10 || ((icVar = this.f6867a0.f5171l) != null && icVar.f5169j);
    }

    public final void M() throws IOException {
        ic icVar = this.Y;
        if (icVar == null || icVar.f5169j) {
            return;
        }
        ic icVar2 = this.Z;
        if (icVar2 == null || icVar2.f5171l == icVar) {
            for (rc rcVar : this.L) {
                if (!rcVar.g()) {
                    return;
                }
            }
            this.Y.f5160a.k();
        }
    }

    @Override // ai.nh
    public final void a(xc xcVar, Object obj) {
        this.A.obtainMessage(7, Pair.create(xcVar, null)).sendToTarget();
    }

    @Override // ai.yh
    public final /* bridge */ /* synthetic */ void b(mh mhVar) {
        this.A.obtainMessage(9, mhVar).sendToTarget();
    }

    @Override // ai.lh
    public final void c(mh mhVar) {
        this.A.obtainMessage(8, mhVar).sendToTarget();
    }

    public final void d(Object obj, int i10) {
        this.G = new jc(0, 0L);
        e(obj, i10);
        this.G = new jc(0, C.TIME_UNSET);
        B(4);
        K(false);
    }

    public final void e(Object obj, int i10) {
        this.C.obtainMessage(6, new lc(this.f6868b0, obj, this.G, i10)).sendToTarget();
    }

    public final int f(int i10, xc xcVar, xc xcVar2) {
        int c10 = xcVar.c();
        int i11 = -1;
        for (int i12 = 0; i12 < c10 && i11 == -1; i12++) {
            i10 = xcVar.h(i10, this.F, this.E, this.R);
            i11 = xcVar2.e(xcVar.d(i10, this.F, true).f11018b);
        }
        return i11;
    }

    public final boolean g(int i10) {
        this.f6868b0.d(i10, this.F, false);
        this.f6868b0.g(0, this.E, false);
        return this.f6868b0.h(i10, this.F, this.E, this.R) == -1;
    }

    public final Pair<Integer, Long> h(kc kcVar) {
        xc xcVar = kcVar.f6161a;
        if (xcVar.f()) {
            xcVar = this.f6868b0;
        }
        try {
            Pair<Integer, Long> k10 = k(xcVar, 0, kcVar.f6163c);
            xc xcVar2 = this.f6868b0;
            if (xcVar2 == xcVar) {
                return k10;
            }
            if (xcVar2.e(xcVar.d(((Integer) k10.first).intValue(), this.F, true).f11018b) != -1) {
                return Pair.create(0, (Long) k10.second);
            }
            if (f(((Integer) k10.first).intValue(), xcVar, this.f6868b0) != -1) {
                this.f6868b0.d(0, this.F, false);
                return j(0, C.TIME_UNSET);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
            throw new zzano(this.f6868b0, 0, kcVar.f6163c);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:196:0x0330, code lost:
        if (r2 != false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0332, code lost:
        r2 = r33.f6867a0.f5166g;
        r33.G = new ai.jc(r2, H(r2, r33.G.f5689c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0346, code lost:
        r33.Y = r3;
        r3.f5171l = null;
        q(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006a, code lost:
        q(r12);
        r2.f5171l = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0798, code lost:
        if (L(r1) != false) goto L373;
     */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0268 A[Catch: IOException -> 0x080e, zzamy -> 0x0813, RuntimeException -> 0x0890, TryCatch #3 {RuntimeException -> 0x0890, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:121:0x019d, B:115:0x0178, B:117:0x017e, B:118:0x0184, B:120:0x018c, B:122:0x01a9, B:126:0x01b0, B:128:0x01b6, B:130:0x01be, B:132:0x01c2, B:134:0x01c6, B:136:0x01ce, B:139:0x01d3, B:141:0x01e4, B:142:0x01f2, B:144:0x01f6, B:146:0x0206, B:148:0x020a, B:150:0x0218, B:151:0x021d, B:159:0x0264, B:161:0x0268, B:163:0x026c, B:164:0x0271, B:166:0x027b, B:168:0x0285, B:169:0x028a, B:170:0x02b2, B:172:0x02b6, B:176:0x02c1, B:177:0x02c4, B:178:0x02d4, B:182:0x02e3, B:184:0x02e9, B:185:0x02fa, B:187:0x02fe, B:189:0x030c, B:191:0x031e, B:195:0x032d, B:197:0x0332, B:198:0x0346, B:199:0x034d, B:152:0x0235, B:154:0x023d, B:156:0x0243, B:157:0x0248, B:201:0x0351, B:202:0x035c, B:209:0x0367, B:210:0x0368, B:212:0x036c, B:214:0x0374, B:216:0x037e, B:215:0x0379, B:218:0x038a, B:220:0x0392, B:221:0x039b, B:223:0x03a1, B:224:0x03bf, B:228:0x03c8, B:234:0x03ea, B:235:0x03f7, B:243:0x0407, B:246:0x0417, B:247:0x0428, B:248:0x0429, B:250:0x0433, B:357:0x0677, B:359:0x067d, B:361:0x0686, B:363:0x06a1, B:365:0x06ac, B:369:0x06b5, B:371:0x06bb, B:377:0x06c7, B:382:0x06d1, B:384:0x06d8, B:385:0x06db, B:387:0x06df, B:389:0x06eb, B:390:0x06fe, B:394:0x0718, B:396:0x0720, B:398:0x0726, B:433:0x07c0, B:435:0x07c5, B:437:0x07cb, B:438:0x07d3, B:440:0x07d7, B:444:0x07e1, B:446:0x07e5, B:448:0x07eb, B:457:0x0808, B:442:0x07dc, B:449:0x07ef, B:451:0x07f4, B:453:0x07f8, B:455:0x07fe, B:456:0x0802, B:399:0x072f, B:401:0x0734, B:404:0x073b, B:406:0x0743, B:410:0x0752, B:422:0x079a, B:424:0x07a2, B:413:0x0759, B:414:0x0766, B:416:0x076a, B:417:0x0780, B:407:0x0746, B:420:0x0794, B:427:0x07a9, B:432:0x07b5, B:430:0x07af, B:251:0x043b, B:253:0x043f, B:265:0x0479, B:267:0x0481, B:292:0x0554, B:294:0x0558, B:297:0x055f, B:299:0x0563, B:301:0x0567, B:303:0x056e, B:305:0x0572, B:307:0x0578, B:309:0x0582, B:310:0x05a9, B:315:0x05b1, B:317:0x05bd, B:319:0x05c3, B:321:0x05c9, B:322:0x05cc, B:326:0x05d3, B:329:0x05e5, B:331:0x05eb, B:332:0x05ee, B:334:0x05f4, B:336:0x05f8, B:338:0x0608, B:356:0x066d, B:343:0x0622, B:344:0x0626, B:346:0x062c, B:348:0x063c, B:350:0x0642, B:352:0x064a, B:353:0x0653, B:354:0x0659, B:355:0x0666, B:302:0x056b, B:268:0x0488, B:270:0x048c, B:278:0x04e6, B:280:0x04ea, B:283:0x0504, B:287:0x0510, B:289:0x0546, B:290:0x0548, B:286:0x050b, B:282:0x04f1, B:272:0x0493, B:275:0x04a4, B:277:0x04d5, B:254:0x0444, B:256:0x044a, B:258:0x0450, B:260:0x045e, B:262:0x0462, B:264:0x046d, B:463:0x0818, B:467:0x081f, B:469:0x0826, B:471:0x082e, B:473:0x0833, B:476:0x0840, B:478:0x0847, B:480:0x0854, B:481:0x0857, B:483:0x085e, B:484:0x086a, B:486:0x086f), top: B:515:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x026c A[Catch: IOException -> 0x080e, zzamy -> 0x0813, RuntimeException -> 0x0890, TryCatch #3 {RuntimeException -> 0x0890, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:121:0x019d, B:115:0x0178, B:117:0x017e, B:118:0x0184, B:120:0x018c, B:122:0x01a9, B:126:0x01b0, B:128:0x01b6, B:130:0x01be, B:132:0x01c2, B:134:0x01c6, B:136:0x01ce, B:139:0x01d3, B:141:0x01e4, B:142:0x01f2, B:144:0x01f6, B:146:0x0206, B:148:0x020a, B:150:0x0218, B:151:0x021d, B:159:0x0264, B:161:0x0268, B:163:0x026c, B:164:0x0271, B:166:0x027b, B:168:0x0285, B:169:0x028a, B:170:0x02b2, B:172:0x02b6, B:176:0x02c1, B:177:0x02c4, B:178:0x02d4, B:182:0x02e3, B:184:0x02e9, B:185:0x02fa, B:187:0x02fe, B:189:0x030c, B:191:0x031e, B:195:0x032d, B:197:0x0332, B:198:0x0346, B:199:0x034d, B:152:0x0235, B:154:0x023d, B:156:0x0243, B:157:0x0248, B:201:0x0351, B:202:0x035c, B:209:0x0367, B:210:0x0368, B:212:0x036c, B:214:0x0374, B:216:0x037e, B:215:0x0379, B:218:0x038a, B:220:0x0392, B:221:0x039b, B:223:0x03a1, B:224:0x03bf, B:228:0x03c8, B:234:0x03ea, B:235:0x03f7, B:243:0x0407, B:246:0x0417, B:247:0x0428, B:248:0x0429, B:250:0x0433, B:357:0x0677, B:359:0x067d, B:361:0x0686, B:363:0x06a1, B:365:0x06ac, B:369:0x06b5, B:371:0x06bb, B:377:0x06c7, B:382:0x06d1, B:384:0x06d8, B:385:0x06db, B:387:0x06df, B:389:0x06eb, B:390:0x06fe, B:394:0x0718, B:396:0x0720, B:398:0x0726, B:433:0x07c0, B:435:0x07c5, B:437:0x07cb, B:438:0x07d3, B:440:0x07d7, B:444:0x07e1, B:446:0x07e5, B:448:0x07eb, B:457:0x0808, B:442:0x07dc, B:449:0x07ef, B:451:0x07f4, B:453:0x07f8, B:455:0x07fe, B:456:0x0802, B:399:0x072f, B:401:0x0734, B:404:0x073b, B:406:0x0743, B:410:0x0752, B:422:0x079a, B:424:0x07a2, B:413:0x0759, B:414:0x0766, B:416:0x076a, B:417:0x0780, B:407:0x0746, B:420:0x0794, B:427:0x07a9, B:432:0x07b5, B:430:0x07af, B:251:0x043b, B:253:0x043f, B:265:0x0479, B:267:0x0481, B:292:0x0554, B:294:0x0558, B:297:0x055f, B:299:0x0563, B:301:0x0567, B:303:0x056e, B:305:0x0572, B:307:0x0578, B:309:0x0582, B:310:0x05a9, B:315:0x05b1, B:317:0x05bd, B:319:0x05c3, B:321:0x05c9, B:322:0x05cc, B:326:0x05d3, B:329:0x05e5, B:331:0x05eb, B:332:0x05ee, B:334:0x05f4, B:336:0x05f8, B:338:0x0608, B:356:0x066d, B:343:0x0622, B:344:0x0626, B:346:0x062c, B:348:0x063c, B:350:0x0642, B:352:0x064a, B:353:0x0653, B:354:0x0659, B:355:0x0666, B:302:0x056b, B:268:0x0488, B:270:0x048c, B:278:0x04e6, B:280:0x04ea, B:283:0x0504, B:287:0x0510, B:289:0x0546, B:290:0x0548, B:286:0x050b, B:282:0x04f1, B:272:0x0493, B:275:0x04a4, B:277:0x04d5, B:254:0x0444, B:256:0x044a, B:258:0x0450, B:260:0x045e, B:262:0x0462, B:264:0x046d, B:463:0x0818, B:467:0x081f, B:469:0x0826, B:471:0x082e, B:473:0x0833, B:476:0x0840, B:478:0x0847, B:480:0x0854, B:481:0x0857, B:483:0x085e, B:484:0x086a, B:486:0x086f), top: B:515:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0271 A[Catch: IOException -> 0x080e, zzamy -> 0x0813, RuntimeException -> 0x0890, TryCatch #3 {RuntimeException -> 0x0890, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:121:0x019d, B:115:0x0178, B:117:0x017e, B:118:0x0184, B:120:0x018c, B:122:0x01a9, B:126:0x01b0, B:128:0x01b6, B:130:0x01be, B:132:0x01c2, B:134:0x01c6, B:136:0x01ce, B:139:0x01d3, B:141:0x01e4, B:142:0x01f2, B:144:0x01f6, B:146:0x0206, B:148:0x020a, B:150:0x0218, B:151:0x021d, B:159:0x0264, B:161:0x0268, B:163:0x026c, B:164:0x0271, B:166:0x027b, B:168:0x0285, B:169:0x028a, B:170:0x02b2, B:172:0x02b6, B:176:0x02c1, B:177:0x02c4, B:178:0x02d4, B:182:0x02e3, B:184:0x02e9, B:185:0x02fa, B:187:0x02fe, B:189:0x030c, B:191:0x031e, B:195:0x032d, B:197:0x0332, B:198:0x0346, B:199:0x034d, B:152:0x0235, B:154:0x023d, B:156:0x0243, B:157:0x0248, B:201:0x0351, B:202:0x035c, B:209:0x0367, B:210:0x0368, B:212:0x036c, B:214:0x0374, B:216:0x037e, B:215:0x0379, B:218:0x038a, B:220:0x0392, B:221:0x039b, B:223:0x03a1, B:224:0x03bf, B:228:0x03c8, B:234:0x03ea, B:235:0x03f7, B:243:0x0407, B:246:0x0417, B:247:0x0428, B:248:0x0429, B:250:0x0433, B:357:0x0677, B:359:0x067d, B:361:0x0686, B:363:0x06a1, B:365:0x06ac, B:369:0x06b5, B:371:0x06bb, B:377:0x06c7, B:382:0x06d1, B:384:0x06d8, B:385:0x06db, B:387:0x06df, B:389:0x06eb, B:390:0x06fe, B:394:0x0718, B:396:0x0720, B:398:0x0726, B:433:0x07c0, B:435:0x07c5, B:437:0x07cb, B:438:0x07d3, B:440:0x07d7, B:444:0x07e1, B:446:0x07e5, B:448:0x07eb, B:457:0x0808, B:442:0x07dc, B:449:0x07ef, B:451:0x07f4, B:453:0x07f8, B:455:0x07fe, B:456:0x0802, B:399:0x072f, B:401:0x0734, B:404:0x073b, B:406:0x0743, B:410:0x0752, B:422:0x079a, B:424:0x07a2, B:413:0x0759, B:414:0x0766, B:416:0x076a, B:417:0x0780, B:407:0x0746, B:420:0x0794, B:427:0x07a9, B:432:0x07b5, B:430:0x07af, B:251:0x043b, B:253:0x043f, B:265:0x0479, B:267:0x0481, B:292:0x0554, B:294:0x0558, B:297:0x055f, B:299:0x0563, B:301:0x0567, B:303:0x056e, B:305:0x0572, B:307:0x0578, B:309:0x0582, B:310:0x05a9, B:315:0x05b1, B:317:0x05bd, B:319:0x05c3, B:321:0x05c9, B:322:0x05cc, B:326:0x05d3, B:329:0x05e5, B:331:0x05eb, B:332:0x05ee, B:334:0x05f4, B:336:0x05f8, B:338:0x0608, B:356:0x066d, B:343:0x0622, B:344:0x0626, B:346:0x062c, B:348:0x063c, B:350:0x0642, B:352:0x064a, B:353:0x0653, B:354:0x0659, B:355:0x0666, B:302:0x056b, B:268:0x0488, B:270:0x048c, B:278:0x04e6, B:280:0x04ea, B:283:0x0504, B:287:0x0510, B:289:0x0546, B:290:0x0548, B:286:0x050b, B:282:0x04f1, B:272:0x0493, B:275:0x04a4, B:277:0x04d5, B:254:0x0444, B:256:0x044a, B:258:0x0450, B:260:0x045e, B:262:0x0462, B:264:0x046d, B:463:0x0818, B:467:0x081f, B:469:0x0826, B:471:0x082e, B:473:0x0833, B:476:0x0840, B:478:0x0847, B:480:0x0854, B:481:0x0857, B:483:0x085e, B:484:0x086a, B:486:0x086f), top: B:515:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x04ea A[Catch: IOException -> 0x080e, zzamy -> 0x0813, RuntimeException -> 0x0890, TryCatch #3 {RuntimeException -> 0x0890, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:121:0x019d, B:115:0x0178, B:117:0x017e, B:118:0x0184, B:120:0x018c, B:122:0x01a9, B:126:0x01b0, B:128:0x01b6, B:130:0x01be, B:132:0x01c2, B:134:0x01c6, B:136:0x01ce, B:139:0x01d3, B:141:0x01e4, B:142:0x01f2, B:144:0x01f6, B:146:0x0206, B:148:0x020a, B:150:0x0218, B:151:0x021d, B:159:0x0264, B:161:0x0268, B:163:0x026c, B:164:0x0271, B:166:0x027b, B:168:0x0285, B:169:0x028a, B:170:0x02b2, B:172:0x02b6, B:176:0x02c1, B:177:0x02c4, B:178:0x02d4, B:182:0x02e3, B:184:0x02e9, B:185:0x02fa, B:187:0x02fe, B:189:0x030c, B:191:0x031e, B:195:0x032d, B:197:0x0332, B:198:0x0346, B:199:0x034d, B:152:0x0235, B:154:0x023d, B:156:0x0243, B:157:0x0248, B:201:0x0351, B:202:0x035c, B:209:0x0367, B:210:0x0368, B:212:0x036c, B:214:0x0374, B:216:0x037e, B:215:0x0379, B:218:0x038a, B:220:0x0392, B:221:0x039b, B:223:0x03a1, B:224:0x03bf, B:228:0x03c8, B:234:0x03ea, B:235:0x03f7, B:243:0x0407, B:246:0x0417, B:247:0x0428, B:248:0x0429, B:250:0x0433, B:357:0x0677, B:359:0x067d, B:361:0x0686, B:363:0x06a1, B:365:0x06ac, B:369:0x06b5, B:371:0x06bb, B:377:0x06c7, B:382:0x06d1, B:384:0x06d8, B:385:0x06db, B:387:0x06df, B:389:0x06eb, B:390:0x06fe, B:394:0x0718, B:396:0x0720, B:398:0x0726, B:433:0x07c0, B:435:0x07c5, B:437:0x07cb, B:438:0x07d3, B:440:0x07d7, B:444:0x07e1, B:446:0x07e5, B:448:0x07eb, B:457:0x0808, B:442:0x07dc, B:449:0x07ef, B:451:0x07f4, B:453:0x07f8, B:455:0x07fe, B:456:0x0802, B:399:0x072f, B:401:0x0734, B:404:0x073b, B:406:0x0743, B:410:0x0752, B:422:0x079a, B:424:0x07a2, B:413:0x0759, B:414:0x0766, B:416:0x076a, B:417:0x0780, B:407:0x0746, B:420:0x0794, B:427:0x07a9, B:432:0x07b5, B:430:0x07af, B:251:0x043b, B:253:0x043f, B:265:0x0479, B:267:0x0481, B:292:0x0554, B:294:0x0558, B:297:0x055f, B:299:0x0563, B:301:0x0567, B:303:0x056e, B:305:0x0572, B:307:0x0578, B:309:0x0582, B:310:0x05a9, B:315:0x05b1, B:317:0x05bd, B:319:0x05c3, B:321:0x05c9, B:322:0x05cc, B:326:0x05d3, B:329:0x05e5, B:331:0x05eb, B:332:0x05ee, B:334:0x05f4, B:336:0x05f8, B:338:0x0608, B:356:0x066d, B:343:0x0622, B:344:0x0626, B:346:0x062c, B:348:0x063c, B:350:0x0642, B:352:0x064a, B:353:0x0653, B:354:0x0659, B:355:0x0666, B:302:0x056b, B:268:0x0488, B:270:0x048c, B:278:0x04e6, B:280:0x04ea, B:283:0x0504, B:287:0x0510, B:289:0x0546, B:290:0x0548, B:286:0x050b, B:282:0x04f1, B:272:0x0493, B:275:0x04a4, B:277:0x04d5, B:254:0x0444, B:256:0x044a, B:258:0x0450, B:260:0x045e, B:262:0x0462, B:264:0x046d, B:463:0x0818, B:467:0x081f, B:469:0x0826, B:471:0x082e, B:473:0x0833, B:476:0x0840, B:478:0x0847, B:480:0x0854, B:481:0x0857, B:483:0x085e, B:484:0x086a, B:486:0x086f), top: B:515:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04f1 A[Catch: IOException -> 0x080e, zzamy -> 0x0813, RuntimeException -> 0x0890, TryCatch #3 {RuntimeException -> 0x0890, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:121:0x019d, B:115:0x0178, B:117:0x017e, B:118:0x0184, B:120:0x018c, B:122:0x01a9, B:126:0x01b0, B:128:0x01b6, B:130:0x01be, B:132:0x01c2, B:134:0x01c6, B:136:0x01ce, B:139:0x01d3, B:141:0x01e4, B:142:0x01f2, B:144:0x01f6, B:146:0x0206, B:148:0x020a, B:150:0x0218, B:151:0x021d, B:159:0x0264, B:161:0x0268, B:163:0x026c, B:164:0x0271, B:166:0x027b, B:168:0x0285, B:169:0x028a, B:170:0x02b2, B:172:0x02b6, B:176:0x02c1, B:177:0x02c4, B:178:0x02d4, B:182:0x02e3, B:184:0x02e9, B:185:0x02fa, B:187:0x02fe, B:189:0x030c, B:191:0x031e, B:195:0x032d, B:197:0x0332, B:198:0x0346, B:199:0x034d, B:152:0x0235, B:154:0x023d, B:156:0x0243, B:157:0x0248, B:201:0x0351, B:202:0x035c, B:209:0x0367, B:210:0x0368, B:212:0x036c, B:214:0x0374, B:216:0x037e, B:215:0x0379, B:218:0x038a, B:220:0x0392, B:221:0x039b, B:223:0x03a1, B:224:0x03bf, B:228:0x03c8, B:234:0x03ea, B:235:0x03f7, B:243:0x0407, B:246:0x0417, B:247:0x0428, B:248:0x0429, B:250:0x0433, B:357:0x0677, B:359:0x067d, B:361:0x0686, B:363:0x06a1, B:365:0x06ac, B:369:0x06b5, B:371:0x06bb, B:377:0x06c7, B:382:0x06d1, B:384:0x06d8, B:385:0x06db, B:387:0x06df, B:389:0x06eb, B:390:0x06fe, B:394:0x0718, B:396:0x0720, B:398:0x0726, B:433:0x07c0, B:435:0x07c5, B:437:0x07cb, B:438:0x07d3, B:440:0x07d7, B:444:0x07e1, B:446:0x07e5, B:448:0x07eb, B:457:0x0808, B:442:0x07dc, B:449:0x07ef, B:451:0x07f4, B:453:0x07f8, B:455:0x07fe, B:456:0x0802, B:399:0x072f, B:401:0x0734, B:404:0x073b, B:406:0x0743, B:410:0x0752, B:422:0x079a, B:424:0x07a2, B:413:0x0759, B:414:0x0766, B:416:0x076a, B:417:0x0780, B:407:0x0746, B:420:0x0794, B:427:0x07a9, B:432:0x07b5, B:430:0x07af, B:251:0x043b, B:253:0x043f, B:265:0x0479, B:267:0x0481, B:292:0x0554, B:294:0x0558, B:297:0x055f, B:299:0x0563, B:301:0x0567, B:303:0x056e, B:305:0x0572, B:307:0x0578, B:309:0x0582, B:310:0x05a9, B:315:0x05b1, B:317:0x05bd, B:319:0x05c3, B:321:0x05c9, B:322:0x05cc, B:326:0x05d3, B:329:0x05e5, B:331:0x05eb, B:332:0x05ee, B:334:0x05f4, B:336:0x05f8, B:338:0x0608, B:356:0x066d, B:343:0x0622, B:344:0x0626, B:346:0x062c, B:348:0x063c, B:350:0x0642, B:352:0x064a, B:353:0x0653, B:354:0x0659, B:355:0x0666, B:302:0x056b, B:268:0x0488, B:270:0x048c, B:278:0x04e6, B:280:0x04ea, B:283:0x0504, B:287:0x0510, B:289:0x0546, B:290:0x0548, B:286:0x050b, B:282:0x04f1, B:272:0x0493, B:275:0x04a4, B:277:0x04d5, B:254:0x0444, B:256:0x044a, B:258:0x0450, B:260:0x045e, B:262:0x0462, B:264:0x046d, B:463:0x0818, B:467:0x081f, B:469:0x0826, B:471:0x082e, B:473:0x0833, B:476:0x0840, B:478:0x0847, B:480:0x0854, B:481:0x0857, B:483:0x085e, B:484:0x086a, B:486:0x086f), top: B:515:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x050b A[Catch: IOException -> 0x080e, zzamy -> 0x0813, RuntimeException -> 0x0890, TryCatch #3 {RuntimeException -> 0x0890, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:121:0x019d, B:115:0x0178, B:117:0x017e, B:118:0x0184, B:120:0x018c, B:122:0x01a9, B:126:0x01b0, B:128:0x01b6, B:130:0x01be, B:132:0x01c2, B:134:0x01c6, B:136:0x01ce, B:139:0x01d3, B:141:0x01e4, B:142:0x01f2, B:144:0x01f6, B:146:0x0206, B:148:0x020a, B:150:0x0218, B:151:0x021d, B:159:0x0264, B:161:0x0268, B:163:0x026c, B:164:0x0271, B:166:0x027b, B:168:0x0285, B:169:0x028a, B:170:0x02b2, B:172:0x02b6, B:176:0x02c1, B:177:0x02c4, B:178:0x02d4, B:182:0x02e3, B:184:0x02e9, B:185:0x02fa, B:187:0x02fe, B:189:0x030c, B:191:0x031e, B:195:0x032d, B:197:0x0332, B:198:0x0346, B:199:0x034d, B:152:0x0235, B:154:0x023d, B:156:0x0243, B:157:0x0248, B:201:0x0351, B:202:0x035c, B:209:0x0367, B:210:0x0368, B:212:0x036c, B:214:0x0374, B:216:0x037e, B:215:0x0379, B:218:0x038a, B:220:0x0392, B:221:0x039b, B:223:0x03a1, B:224:0x03bf, B:228:0x03c8, B:234:0x03ea, B:235:0x03f7, B:243:0x0407, B:246:0x0417, B:247:0x0428, B:248:0x0429, B:250:0x0433, B:357:0x0677, B:359:0x067d, B:361:0x0686, B:363:0x06a1, B:365:0x06ac, B:369:0x06b5, B:371:0x06bb, B:377:0x06c7, B:382:0x06d1, B:384:0x06d8, B:385:0x06db, B:387:0x06df, B:389:0x06eb, B:390:0x06fe, B:394:0x0718, B:396:0x0720, B:398:0x0726, B:433:0x07c0, B:435:0x07c5, B:437:0x07cb, B:438:0x07d3, B:440:0x07d7, B:444:0x07e1, B:446:0x07e5, B:448:0x07eb, B:457:0x0808, B:442:0x07dc, B:449:0x07ef, B:451:0x07f4, B:453:0x07f8, B:455:0x07fe, B:456:0x0802, B:399:0x072f, B:401:0x0734, B:404:0x073b, B:406:0x0743, B:410:0x0752, B:422:0x079a, B:424:0x07a2, B:413:0x0759, B:414:0x0766, B:416:0x076a, B:417:0x0780, B:407:0x0746, B:420:0x0794, B:427:0x07a9, B:432:0x07b5, B:430:0x07af, B:251:0x043b, B:253:0x043f, B:265:0x0479, B:267:0x0481, B:292:0x0554, B:294:0x0558, B:297:0x055f, B:299:0x0563, B:301:0x0567, B:303:0x056e, B:305:0x0572, B:307:0x0578, B:309:0x0582, B:310:0x05a9, B:315:0x05b1, B:317:0x05bd, B:319:0x05c3, B:321:0x05c9, B:322:0x05cc, B:326:0x05d3, B:329:0x05e5, B:331:0x05eb, B:332:0x05ee, B:334:0x05f4, B:336:0x05f8, B:338:0x0608, B:356:0x066d, B:343:0x0622, B:344:0x0626, B:346:0x062c, B:348:0x063c, B:350:0x0642, B:352:0x064a, B:353:0x0653, B:354:0x0659, B:355:0x0666, B:302:0x056b, B:268:0x0488, B:270:0x048c, B:278:0x04e6, B:280:0x04ea, B:283:0x0504, B:287:0x0510, B:289:0x0546, B:290:0x0548, B:286:0x050b, B:282:0x04f1, B:272:0x0493, B:275:0x04a4, B:277:0x04d5, B:254:0x0444, B:256:0x044a, B:258:0x0450, B:260:0x045e, B:262:0x0462, B:264:0x046d, B:463:0x0818, B:467:0x081f, B:469:0x0826, B:471:0x082e, B:473:0x0833, B:476:0x0840, B:478:0x0847, B:480:0x0854, B:481:0x0857, B:483:0x085e, B:484:0x086a, B:486:0x086f), top: B:515:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0546 A[Catch: IOException -> 0x080e, zzamy -> 0x0813, RuntimeException -> 0x0890, TryCatch #3 {RuntimeException -> 0x0890, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:121:0x019d, B:115:0x0178, B:117:0x017e, B:118:0x0184, B:120:0x018c, B:122:0x01a9, B:126:0x01b0, B:128:0x01b6, B:130:0x01be, B:132:0x01c2, B:134:0x01c6, B:136:0x01ce, B:139:0x01d3, B:141:0x01e4, B:142:0x01f2, B:144:0x01f6, B:146:0x0206, B:148:0x020a, B:150:0x0218, B:151:0x021d, B:159:0x0264, B:161:0x0268, B:163:0x026c, B:164:0x0271, B:166:0x027b, B:168:0x0285, B:169:0x028a, B:170:0x02b2, B:172:0x02b6, B:176:0x02c1, B:177:0x02c4, B:178:0x02d4, B:182:0x02e3, B:184:0x02e9, B:185:0x02fa, B:187:0x02fe, B:189:0x030c, B:191:0x031e, B:195:0x032d, B:197:0x0332, B:198:0x0346, B:199:0x034d, B:152:0x0235, B:154:0x023d, B:156:0x0243, B:157:0x0248, B:201:0x0351, B:202:0x035c, B:209:0x0367, B:210:0x0368, B:212:0x036c, B:214:0x0374, B:216:0x037e, B:215:0x0379, B:218:0x038a, B:220:0x0392, B:221:0x039b, B:223:0x03a1, B:224:0x03bf, B:228:0x03c8, B:234:0x03ea, B:235:0x03f7, B:243:0x0407, B:246:0x0417, B:247:0x0428, B:248:0x0429, B:250:0x0433, B:357:0x0677, B:359:0x067d, B:361:0x0686, B:363:0x06a1, B:365:0x06ac, B:369:0x06b5, B:371:0x06bb, B:377:0x06c7, B:382:0x06d1, B:384:0x06d8, B:385:0x06db, B:387:0x06df, B:389:0x06eb, B:390:0x06fe, B:394:0x0718, B:396:0x0720, B:398:0x0726, B:433:0x07c0, B:435:0x07c5, B:437:0x07cb, B:438:0x07d3, B:440:0x07d7, B:444:0x07e1, B:446:0x07e5, B:448:0x07eb, B:457:0x0808, B:442:0x07dc, B:449:0x07ef, B:451:0x07f4, B:453:0x07f8, B:455:0x07fe, B:456:0x0802, B:399:0x072f, B:401:0x0734, B:404:0x073b, B:406:0x0743, B:410:0x0752, B:422:0x079a, B:424:0x07a2, B:413:0x0759, B:414:0x0766, B:416:0x076a, B:417:0x0780, B:407:0x0746, B:420:0x0794, B:427:0x07a9, B:432:0x07b5, B:430:0x07af, B:251:0x043b, B:253:0x043f, B:265:0x0479, B:267:0x0481, B:292:0x0554, B:294:0x0558, B:297:0x055f, B:299:0x0563, B:301:0x0567, B:303:0x056e, B:305:0x0572, B:307:0x0578, B:309:0x0582, B:310:0x05a9, B:315:0x05b1, B:317:0x05bd, B:319:0x05c3, B:321:0x05c9, B:322:0x05cc, B:326:0x05d3, B:329:0x05e5, B:331:0x05eb, B:332:0x05ee, B:334:0x05f4, B:336:0x05f8, B:338:0x0608, B:356:0x066d, B:343:0x0622, B:344:0x0626, B:346:0x062c, B:348:0x063c, B:350:0x0642, B:352:0x064a, B:353:0x0653, B:354:0x0659, B:355:0x0666, B:302:0x056b, B:268:0x0488, B:270:0x048c, B:278:0x04e6, B:280:0x04ea, B:283:0x0504, B:287:0x0510, B:289:0x0546, B:290:0x0548, B:286:0x050b, B:282:0x04f1, B:272:0x0493, B:275:0x04a4, B:277:0x04d5, B:254:0x0444, B:256:0x044a, B:258:0x0450, B:260:0x045e, B:262:0x0462, B:264:0x046d, B:463:0x0818, B:467:0x081f, B:469:0x0826, B:471:0x082e, B:473:0x0833, B:476:0x0840, B:478:0x0847, B:480:0x0854, B:481:0x0857, B:483:0x085e, B:484:0x086a, B:486:0x086f), top: B:515:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0558 A[Catch: IOException -> 0x080e, zzamy -> 0x0813, RuntimeException -> 0x0890, TryCatch #3 {RuntimeException -> 0x0890, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:121:0x019d, B:115:0x0178, B:117:0x017e, B:118:0x0184, B:120:0x018c, B:122:0x01a9, B:126:0x01b0, B:128:0x01b6, B:130:0x01be, B:132:0x01c2, B:134:0x01c6, B:136:0x01ce, B:139:0x01d3, B:141:0x01e4, B:142:0x01f2, B:144:0x01f6, B:146:0x0206, B:148:0x020a, B:150:0x0218, B:151:0x021d, B:159:0x0264, B:161:0x0268, B:163:0x026c, B:164:0x0271, B:166:0x027b, B:168:0x0285, B:169:0x028a, B:170:0x02b2, B:172:0x02b6, B:176:0x02c1, B:177:0x02c4, B:178:0x02d4, B:182:0x02e3, B:184:0x02e9, B:185:0x02fa, B:187:0x02fe, B:189:0x030c, B:191:0x031e, B:195:0x032d, B:197:0x0332, B:198:0x0346, B:199:0x034d, B:152:0x0235, B:154:0x023d, B:156:0x0243, B:157:0x0248, B:201:0x0351, B:202:0x035c, B:209:0x0367, B:210:0x0368, B:212:0x036c, B:214:0x0374, B:216:0x037e, B:215:0x0379, B:218:0x038a, B:220:0x0392, B:221:0x039b, B:223:0x03a1, B:224:0x03bf, B:228:0x03c8, B:234:0x03ea, B:235:0x03f7, B:243:0x0407, B:246:0x0417, B:247:0x0428, B:248:0x0429, B:250:0x0433, B:357:0x0677, B:359:0x067d, B:361:0x0686, B:363:0x06a1, B:365:0x06ac, B:369:0x06b5, B:371:0x06bb, B:377:0x06c7, B:382:0x06d1, B:384:0x06d8, B:385:0x06db, B:387:0x06df, B:389:0x06eb, B:390:0x06fe, B:394:0x0718, B:396:0x0720, B:398:0x0726, B:433:0x07c0, B:435:0x07c5, B:437:0x07cb, B:438:0x07d3, B:440:0x07d7, B:444:0x07e1, B:446:0x07e5, B:448:0x07eb, B:457:0x0808, B:442:0x07dc, B:449:0x07ef, B:451:0x07f4, B:453:0x07f8, B:455:0x07fe, B:456:0x0802, B:399:0x072f, B:401:0x0734, B:404:0x073b, B:406:0x0743, B:410:0x0752, B:422:0x079a, B:424:0x07a2, B:413:0x0759, B:414:0x0766, B:416:0x076a, B:417:0x0780, B:407:0x0746, B:420:0x0794, B:427:0x07a9, B:432:0x07b5, B:430:0x07af, B:251:0x043b, B:253:0x043f, B:265:0x0479, B:267:0x0481, B:292:0x0554, B:294:0x0558, B:297:0x055f, B:299:0x0563, B:301:0x0567, B:303:0x056e, B:305:0x0572, B:307:0x0578, B:309:0x0582, B:310:0x05a9, B:315:0x05b1, B:317:0x05bd, B:319:0x05c3, B:321:0x05c9, B:322:0x05cc, B:326:0x05d3, B:329:0x05e5, B:331:0x05eb, B:332:0x05ee, B:334:0x05f4, B:336:0x05f8, B:338:0x0608, B:356:0x066d, B:343:0x0622, B:344:0x0626, B:346:0x062c, B:348:0x063c, B:350:0x0642, B:352:0x064a, B:353:0x0653, B:354:0x0659, B:355:0x0666, B:302:0x056b, B:268:0x0488, B:270:0x048c, B:278:0x04e6, B:280:0x04ea, B:283:0x0504, B:287:0x0510, B:289:0x0546, B:290:0x0548, B:286:0x050b, B:282:0x04f1, B:272:0x0493, B:275:0x04a4, B:277:0x04d5, B:254:0x0444, B:256:0x044a, B:258:0x0450, B:260:0x045e, B:262:0x0462, B:264:0x046d, B:463:0x0818, B:467:0x081f, B:469:0x0826, B:471:0x082e, B:473:0x0833, B:476:0x0840, B:478:0x0847, B:480:0x0854, B:481:0x0857, B:483:0x085e, B:484:0x086a, B:486:0x086f), top: B:515:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0572 A[Catch: IOException -> 0x080e, zzamy -> 0x0813, RuntimeException -> 0x0890, LOOP:9: B:305:0x0572->B:309:0x0582, LOOP_START, TryCatch #3 {RuntimeException -> 0x0890, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:121:0x019d, B:115:0x0178, B:117:0x017e, B:118:0x0184, B:120:0x018c, B:122:0x01a9, B:126:0x01b0, B:128:0x01b6, B:130:0x01be, B:132:0x01c2, B:134:0x01c6, B:136:0x01ce, B:139:0x01d3, B:141:0x01e4, B:142:0x01f2, B:144:0x01f6, B:146:0x0206, B:148:0x020a, B:150:0x0218, B:151:0x021d, B:159:0x0264, B:161:0x0268, B:163:0x026c, B:164:0x0271, B:166:0x027b, B:168:0x0285, B:169:0x028a, B:170:0x02b2, B:172:0x02b6, B:176:0x02c1, B:177:0x02c4, B:178:0x02d4, B:182:0x02e3, B:184:0x02e9, B:185:0x02fa, B:187:0x02fe, B:189:0x030c, B:191:0x031e, B:195:0x032d, B:197:0x0332, B:198:0x0346, B:199:0x034d, B:152:0x0235, B:154:0x023d, B:156:0x0243, B:157:0x0248, B:201:0x0351, B:202:0x035c, B:209:0x0367, B:210:0x0368, B:212:0x036c, B:214:0x0374, B:216:0x037e, B:215:0x0379, B:218:0x038a, B:220:0x0392, B:221:0x039b, B:223:0x03a1, B:224:0x03bf, B:228:0x03c8, B:234:0x03ea, B:235:0x03f7, B:243:0x0407, B:246:0x0417, B:247:0x0428, B:248:0x0429, B:250:0x0433, B:357:0x0677, B:359:0x067d, B:361:0x0686, B:363:0x06a1, B:365:0x06ac, B:369:0x06b5, B:371:0x06bb, B:377:0x06c7, B:382:0x06d1, B:384:0x06d8, B:385:0x06db, B:387:0x06df, B:389:0x06eb, B:390:0x06fe, B:394:0x0718, B:396:0x0720, B:398:0x0726, B:433:0x07c0, B:435:0x07c5, B:437:0x07cb, B:438:0x07d3, B:440:0x07d7, B:444:0x07e1, B:446:0x07e5, B:448:0x07eb, B:457:0x0808, B:442:0x07dc, B:449:0x07ef, B:451:0x07f4, B:453:0x07f8, B:455:0x07fe, B:456:0x0802, B:399:0x072f, B:401:0x0734, B:404:0x073b, B:406:0x0743, B:410:0x0752, B:422:0x079a, B:424:0x07a2, B:413:0x0759, B:414:0x0766, B:416:0x076a, B:417:0x0780, B:407:0x0746, B:420:0x0794, B:427:0x07a9, B:432:0x07b5, B:430:0x07af, B:251:0x043b, B:253:0x043f, B:265:0x0479, B:267:0x0481, B:292:0x0554, B:294:0x0558, B:297:0x055f, B:299:0x0563, B:301:0x0567, B:303:0x056e, B:305:0x0572, B:307:0x0578, B:309:0x0582, B:310:0x05a9, B:315:0x05b1, B:317:0x05bd, B:319:0x05c3, B:321:0x05c9, B:322:0x05cc, B:326:0x05d3, B:329:0x05e5, B:331:0x05eb, B:332:0x05ee, B:334:0x05f4, B:336:0x05f8, B:338:0x0608, B:356:0x066d, B:343:0x0622, B:344:0x0626, B:346:0x062c, B:348:0x063c, B:350:0x0642, B:352:0x064a, B:353:0x0653, B:354:0x0659, B:355:0x0666, B:302:0x056b, B:268:0x0488, B:270:0x048c, B:278:0x04e6, B:280:0x04ea, B:283:0x0504, B:287:0x0510, B:289:0x0546, B:290:0x0548, B:286:0x050b, B:282:0x04f1, B:272:0x0493, B:275:0x04a4, B:277:0x04d5, B:254:0x0444, B:256:0x044a, B:258:0x0450, B:260:0x045e, B:262:0x0462, B:264:0x046d, B:463:0x0818, B:467:0x081f, B:469:0x0826, B:471:0x082e, B:473:0x0833, B:476:0x0840, B:478:0x0847, B:480:0x0854, B:481:0x0857, B:483:0x085e, B:484:0x086a, B:486:0x086f), top: B:515:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x06c7 A[Catch: IOException -> 0x0884, zzamy -> 0x088a, RuntimeException -> 0x0890, TryCatch #3 {RuntimeException -> 0x0890, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:121:0x019d, B:115:0x0178, B:117:0x017e, B:118:0x0184, B:120:0x018c, B:122:0x01a9, B:126:0x01b0, B:128:0x01b6, B:130:0x01be, B:132:0x01c2, B:134:0x01c6, B:136:0x01ce, B:139:0x01d3, B:141:0x01e4, B:142:0x01f2, B:144:0x01f6, B:146:0x0206, B:148:0x020a, B:150:0x0218, B:151:0x021d, B:159:0x0264, B:161:0x0268, B:163:0x026c, B:164:0x0271, B:166:0x027b, B:168:0x0285, B:169:0x028a, B:170:0x02b2, B:172:0x02b6, B:176:0x02c1, B:177:0x02c4, B:178:0x02d4, B:182:0x02e3, B:184:0x02e9, B:185:0x02fa, B:187:0x02fe, B:189:0x030c, B:191:0x031e, B:195:0x032d, B:197:0x0332, B:198:0x0346, B:199:0x034d, B:152:0x0235, B:154:0x023d, B:156:0x0243, B:157:0x0248, B:201:0x0351, B:202:0x035c, B:209:0x0367, B:210:0x0368, B:212:0x036c, B:214:0x0374, B:216:0x037e, B:215:0x0379, B:218:0x038a, B:220:0x0392, B:221:0x039b, B:223:0x03a1, B:224:0x03bf, B:228:0x03c8, B:234:0x03ea, B:235:0x03f7, B:243:0x0407, B:246:0x0417, B:247:0x0428, B:248:0x0429, B:250:0x0433, B:357:0x0677, B:359:0x067d, B:361:0x0686, B:363:0x06a1, B:365:0x06ac, B:369:0x06b5, B:371:0x06bb, B:377:0x06c7, B:382:0x06d1, B:384:0x06d8, B:385:0x06db, B:387:0x06df, B:389:0x06eb, B:390:0x06fe, B:394:0x0718, B:396:0x0720, B:398:0x0726, B:433:0x07c0, B:435:0x07c5, B:437:0x07cb, B:438:0x07d3, B:440:0x07d7, B:444:0x07e1, B:446:0x07e5, B:448:0x07eb, B:457:0x0808, B:442:0x07dc, B:449:0x07ef, B:451:0x07f4, B:453:0x07f8, B:455:0x07fe, B:456:0x0802, B:399:0x072f, B:401:0x0734, B:404:0x073b, B:406:0x0743, B:410:0x0752, B:422:0x079a, B:424:0x07a2, B:413:0x0759, B:414:0x0766, B:416:0x076a, B:417:0x0780, B:407:0x0746, B:420:0x0794, B:427:0x07a9, B:432:0x07b5, B:430:0x07af, B:251:0x043b, B:253:0x043f, B:265:0x0479, B:267:0x0481, B:292:0x0554, B:294:0x0558, B:297:0x055f, B:299:0x0563, B:301:0x0567, B:303:0x056e, B:305:0x0572, B:307:0x0578, B:309:0x0582, B:310:0x05a9, B:315:0x05b1, B:317:0x05bd, B:319:0x05c3, B:321:0x05c9, B:322:0x05cc, B:326:0x05d3, B:329:0x05e5, B:331:0x05eb, B:332:0x05ee, B:334:0x05f4, B:336:0x05f8, B:338:0x0608, B:356:0x066d, B:343:0x0622, B:344:0x0626, B:346:0x062c, B:348:0x063c, B:350:0x0642, B:352:0x064a, B:353:0x0653, B:354:0x0659, B:355:0x0666, B:302:0x056b, B:268:0x0488, B:270:0x048c, B:278:0x04e6, B:280:0x04ea, B:283:0x0504, B:287:0x0510, B:289:0x0546, B:290:0x0548, B:286:0x050b, B:282:0x04f1, B:272:0x0493, B:275:0x04a4, B:277:0x04d5, B:254:0x0444, B:256:0x044a, B:258:0x0450, B:260:0x045e, B:262:0x0462, B:264:0x046d, B:463:0x0818, B:467:0x081f, B:469:0x0826, B:471:0x082e, B:473:0x0833, B:476:0x0840, B:478:0x0847, B:480:0x0854, B:481:0x0857, B:483:0x085e, B:484:0x086a, B:486:0x086f), top: B:515:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:424:0x07a2 A[Catch: IOException -> 0x0884, zzamy -> 0x088a, RuntimeException -> 0x0890, TryCatch #3 {RuntimeException -> 0x0890, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:121:0x019d, B:115:0x0178, B:117:0x017e, B:118:0x0184, B:120:0x018c, B:122:0x01a9, B:126:0x01b0, B:128:0x01b6, B:130:0x01be, B:132:0x01c2, B:134:0x01c6, B:136:0x01ce, B:139:0x01d3, B:141:0x01e4, B:142:0x01f2, B:144:0x01f6, B:146:0x0206, B:148:0x020a, B:150:0x0218, B:151:0x021d, B:159:0x0264, B:161:0x0268, B:163:0x026c, B:164:0x0271, B:166:0x027b, B:168:0x0285, B:169:0x028a, B:170:0x02b2, B:172:0x02b6, B:176:0x02c1, B:177:0x02c4, B:178:0x02d4, B:182:0x02e3, B:184:0x02e9, B:185:0x02fa, B:187:0x02fe, B:189:0x030c, B:191:0x031e, B:195:0x032d, B:197:0x0332, B:198:0x0346, B:199:0x034d, B:152:0x0235, B:154:0x023d, B:156:0x0243, B:157:0x0248, B:201:0x0351, B:202:0x035c, B:209:0x0367, B:210:0x0368, B:212:0x036c, B:214:0x0374, B:216:0x037e, B:215:0x0379, B:218:0x038a, B:220:0x0392, B:221:0x039b, B:223:0x03a1, B:224:0x03bf, B:228:0x03c8, B:234:0x03ea, B:235:0x03f7, B:243:0x0407, B:246:0x0417, B:247:0x0428, B:248:0x0429, B:250:0x0433, B:357:0x0677, B:359:0x067d, B:361:0x0686, B:363:0x06a1, B:365:0x06ac, B:369:0x06b5, B:371:0x06bb, B:377:0x06c7, B:382:0x06d1, B:384:0x06d8, B:385:0x06db, B:387:0x06df, B:389:0x06eb, B:390:0x06fe, B:394:0x0718, B:396:0x0720, B:398:0x0726, B:433:0x07c0, B:435:0x07c5, B:437:0x07cb, B:438:0x07d3, B:440:0x07d7, B:444:0x07e1, B:446:0x07e5, B:448:0x07eb, B:457:0x0808, B:442:0x07dc, B:449:0x07ef, B:451:0x07f4, B:453:0x07f8, B:455:0x07fe, B:456:0x0802, B:399:0x072f, B:401:0x0734, B:404:0x073b, B:406:0x0743, B:410:0x0752, B:422:0x079a, B:424:0x07a2, B:413:0x0759, B:414:0x0766, B:416:0x076a, B:417:0x0780, B:407:0x0746, B:420:0x0794, B:427:0x07a9, B:432:0x07b5, B:430:0x07af, B:251:0x043b, B:253:0x043f, B:265:0x0479, B:267:0x0481, B:292:0x0554, B:294:0x0558, B:297:0x055f, B:299:0x0563, B:301:0x0567, B:303:0x056e, B:305:0x0572, B:307:0x0578, B:309:0x0582, B:310:0x05a9, B:315:0x05b1, B:317:0x05bd, B:319:0x05c3, B:321:0x05c9, B:322:0x05cc, B:326:0x05d3, B:329:0x05e5, B:331:0x05eb, B:332:0x05ee, B:334:0x05f4, B:336:0x05f8, B:338:0x0608, B:356:0x066d, B:343:0x0622, B:344:0x0626, B:346:0x062c, B:348:0x063c, B:350:0x0642, B:352:0x064a, B:353:0x0653, B:354:0x0659, B:355:0x0666, B:302:0x056b, B:268:0x0488, B:270:0x048c, B:278:0x04e6, B:280:0x04ea, B:283:0x0504, B:287:0x0510, B:289:0x0546, B:290:0x0548, B:286:0x050b, B:282:0x04f1, B:272:0x0493, B:275:0x04a4, B:277:0x04d5, B:254:0x0444, B:256:0x044a, B:258:0x0450, B:260:0x045e, B:262:0x0462, B:264:0x046d, B:463:0x0818, B:467:0x081f, B:469:0x0826, B:471:0x082e, B:473:0x0833, B:476:0x0840, B:478:0x0847, B:480:0x0854, B:481:0x0857, B:483:0x085e, B:484:0x086a, B:486:0x086f), top: B:515:0x0005 }] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r34) {
        /*
            Method dump skipped, instructions count: 2306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.mc.handleMessage(android.os.Message):boolean");
    }

    @Override // ai.oi
    public final void i() {
        this.A.sendEmptyMessage(10);
    }

    public final Pair<Integer, Long> j(int i10, long j10) {
        return k(this.f6868b0, 0, C.TIME_UNSET);
    }

    public final Pair<Integer, Long> k(xc xcVar, int i10, long j10) {
        return l(xcVar, 0, j10, 0L);
    }

    public final Pair<Integer, Long> l(xc xcVar, int i10, long j10, long j11) {
        fj.c(0, 0, xcVar.a());
        xcVar.b(0, this.E, false, j11);
        if (j10 == C.TIME_UNSET) {
            j10 = 0;
        }
        long j12 = xcVar.d(0, this.F, false).f11019c;
        if (j12 != C.TIME_UNSET) {
            int i11 = (j10 > j12 ? 1 : (j10 == j12 ? 0 : -1));
        }
        return Pair.create(0, Long.valueOf(j10));
    }

    public final void m() {
        ic icVar = this.Y;
        long zza = !icVar.f5169j ? 0L : icVar.f5160a.zza();
        if (zza == Long.MIN_VALUE) {
            C(false);
            return;
        }
        ic icVar2 = this.Y;
        long j10 = this.X - (icVar2.f5165f - icVar2.f5167h);
        boolean f10 = this.f6872f0.f(zza - j10);
        C(f10);
        if (f10) {
            this.Y.f5160a.d(j10);
        }
    }

    public final void n(ic icVar) throws zzamy {
        if (this.f6867a0 == icVar) {
            return;
        }
        boolean[] zArr = new boolean[2];
        int i10 = 0;
        for (int i11 = 0; i11 < 2; i11++) {
            rc rcVar = this.f6873w[i11];
            zArr[i11] = rcVar.c() != 0;
            fi a10 = icVar.f5172m.f8963b.a(i11);
            if (a10 != null) {
                i10++;
            }
            if (zArr[i11] && (a10 == null || (rcVar.j() && rcVar.h() == this.f6867a0.f5163d[i11]))) {
                if (rcVar == this.I) {
                    this.f6876z.d(this.J);
                    this.J = null;
                    this.I = null;
                }
                p(rcVar);
                rcVar.p();
            }
        }
        this.f6867a0 = icVar;
        this.C.obtainMessage(3, icVar.f5172m).sendToTarget();
        o(zArr, i10);
    }

    public final void o(boolean[] zArr, int i10) throws zzamy {
        int i11;
        this.L = new rc[i10];
        int i12 = 0;
        int i13 = 0;
        while (i12 < 2) {
            rc rcVar = this.f6873w[i12];
            fi a10 = this.f6867a0.f5172m.f8963b.a(i12);
            if (a10 != null) {
                int i14 = i13 + 1;
                this.L[i13] = rcVar;
                if (rcVar.c() == 0) {
                    tc tcVar = this.f6867a0.f5172m.f8965d[i12];
                    boolean z10 = this.N && this.Q == 3;
                    boolean z11 = !zArr[i12] && z10;
                    a10.b();
                    oc[] ocVarArr = new oc[1];
                    for (int i15 = 0; i15 <= 0; i15++) {
                        ocVarArr[i15] = a10.c(i15);
                    }
                    ic icVar = this.f6867a0;
                    i11 = i12;
                    rcVar.P(tcVar, ocVarArr, icVar.f5163d[i12], this.X, z11, icVar.f5165f - icVar.f5167h);
                    jj d10 = rcVar.d();
                    if (d10 != null) {
                        if (this.J == null) {
                            this.J = d10;
                            this.I = rcVar;
                            d10.j0(this.H);
                        } else {
                            throw zzamy.c(new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                    }
                    if (z10) {
                        rcVar.f();
                    }
                } else {
                    i11 = i12;
                }
                i13 = i14;
            } else {
                i11 = i12;
            }
            i12 = i11 + 1;
        }
    }

    public final void r() {
        this.f6869c0 = true;
    }

    public final void s(oh ohVar, boolean z10) {
        this.A.obtainMessage(0, 1, 0, ohVar).sendToTarget();
    }

    public final void t(boolean z10) {
        this.A.obtainMessage(1, z10 ? 1 : 0, 0).sendToTarget();
    }

    public final void u(xc xcVar, int i10, long j10) {
        this.A.obtainMessage(3, new kc(xcVar, 0, j10)).sendToTarget();
    }

    public final void v() {
        this.A.sendEmptyMessage(5);
    }

    public final void w(dc... dcVarArr) {
        if (this.M) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        this.S++;
        this.A.obtainMessage(11, dcVarArr).sendToTarget();
    }

    public final synchronized void x(dc... dcVarArr) {
        if (this.M) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        int i10 = this.S;
        this.S = i10 + 1;
        this.A.obtainMessage(11, dcVarArr).sendToTarget();
        while (this.T <= i10) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final synchronized void y() {
        if (this.M) {
            return;
        }
        this.A.sendEmptyMessage(6);
        while (!this.M) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        this.B.quit();
    }

    public final void z(int i10) {
        this.f6870d0 = i10;
    }
}
