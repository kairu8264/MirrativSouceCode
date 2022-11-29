package ai;

import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.internal.ads.zzaha;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class yy3 {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f12771a = sb.X("OpusHead");

    /* JADX WARN: Removed duplicated region for block: B:358:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0b28  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0b40  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0c01  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0c4c  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0c4e  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0c63  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0ccd  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x0ccf  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0cd3  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0cd7  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x0cdb  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0cdf  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0ce4  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0ce6  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0cea  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0cee  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0cfb  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0da5  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x0cc4 A[EDGE_INSN: B:625:0x0cc4->B:573:0x0cc4 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<ai.rz3> a(ai.oy3 r49, ai.bw3 r50, long r51, ai.ru3 r53, boolean r54, boolean r55, ai.bx2<ai.oz3, ai.oz3> r56) throws com.google.android.gms.internal.ads.zzaha {
        /*
            Method dump skipped, instructions count: 3508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.yy3.a(ai.oy3, ai.bw3, long, ai.ru3, boolean, boolean, ai.bx2):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ae, code lost:
        if (r3 != 13) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<ai.v7, ai.v7> b(ai.py3 r11) {
        /*
            ai.hb r11 = r11.f8740b
            r0 = 8
            r11.p(r0)
            r1 = 0
            r2 = r1
            r3 = r2
        La:
            int r4 = r11.l()
            if (r4 < r0) goto Lda
            int r4 = r11.o()
            int r5 = r11.D()
            int r6 = r11.D()
            r7 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r6 != r7) goto L75
            r11.p(r4)
            int r2 = r4 + r5
            r11.s(r0)
            d(r11)
        L2c:
            int r6 = r11.o()
            if (r6 >= r2) goto L73
            int r6 = r11.o()
            int r7 = r11.D()
            int r8 = r11.D()
            r9 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r8 != r9) goto L6e
            r11.p(r6)
            int r6 = r6 + r7
            r11.s(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L4f:
            int r7 = r11.o()
            if (r7 >= r6) goto L5f
            ai.u7 r7 = ai.fz3.a(r11)
            if (r7 == 0) goto L4f
            r2.add(r7)
            goto L4f
        L5f:
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L66
            goto L73
        L66:
            ai.v7 r6 = new ai.v7
            r6.<init>(r2)
            r2 = r6
            goto Ld4
        L6e:
            int r6 = r6 + r7
            r11.p(r6)
            goto L2c
        L73:
            r2 = r1
            goto Ld4
        L75:
            r7 = 1936553057(0x736d7461, float:1.8813092E31)
            if (r6 != r7) goto Ld4
            r11.p(r4)
            int r3 = r4 + r5
            r6 = 12
            r11.s(r6)
        L84:
            int r7 = r11.o()
            if (r7 >= r3) goto Ld3
            int r7 = r11.o()
            int r8 = r11.D()
            int r9 = r11.D()
            r10 = 1935766900(0x73617574, float:1.7862687E31)
            if (r9 != r10) goto Lce
            r3 = 14
            if (r8 >= r3) goto La0
            goto Ld3
        La0:
            r3 = 5
            r11.s(r3)
            int r3 = r11.v()
            r7 = 1123024896(0x42f00000, float:120.0)
            if (r3 == r6) goto Lb1
            r6 = 13
            if (r3 == r6) goto Lb5
            goto Ld3
        Lb1:
            if (r3 != r6) goto Lb5
            r7 = 1131413504(0x43700000, float:240.0)
        Lb5:
            r3 = 1
            r11.s(r3)
            int r6 = r11.v()
            ai.v7 r8 = new ai.v7
            ai.u7[] r3 = new ai.u7[r3]
            ai.r9 r9 = new ai.r9
            r9.<init>(r7, r6)
            r6 = 0
            r3[r6] = r9
            r8.<init>(r3)
            r3 = r8
            goto Ld4
        Lce:
            int r7 = r7 + r8
            r11.p(r7)
            goto L84
        Ld3:
            r3 = r1
        Ld4:
            int r4 = r4 + r5
            r11.p(r4)
            goto La
        Lda:
            android.util.Pair r11 = android.util.Pair.create(r2, r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.yy3.b(ai.py3):android.util.Pair");
    }

    public static v7 c(oy3 oy3Var) {
        l9 l9Var;
        py3 e10 = oy3Var.e(Atom.TYPE_hdlr);
        py3 e11 = oy3Var.e(Atom.TYPE_keys);
        py3 e12 = oy3Var.e(Atom.TYPE_ilst);
        if (e10 == null || e11 == null || e12 == null || e(e10.f8740b) != 1835299937) {
            return null;
        }
        hb hbVar = e11.f8740b;
        hbVar.p(12);
        int D = hbVar.D();
        String[] strArr = new String[D];
        for (int i10 = 0; i10 < D; i10++) {
            int D2 = hbVar.D();
            hbVar.s(4);
            strArr[i10] = hbVar.e(D2 - 8, zw2.f13232c);
        }
        hb hbVar2 = e12.f8740b;
        hbVar2.p(8);
        ArrayList arrayList = new ArrayList();
        while (hbVar2.l() > 8) {
            int o10 = hbVar2.o();
            int D3 = hbVar2.D();
            int D4 = hbVar2.D() - 1;
            if (D4 >= 0 && D4 < D) {
                String str = strArr[D4];
                int i11 = o10 + D3;
                int i12 = fz3.f4264b;
                while (true) {
                    int o11 = hbVar2.o();
                    if (o11 >= i11) {
                        l9Var = null;
                        break;
                    }
                    int D5 = hbVar2.D();
                    if (hbVar2.D() == 1684108385) {
                        int D6 = hbVar2.D();
                        int D7 = hbVar2.D();
                        int i13 = D5 - 16;
                        byte[] bArr = new byte[i13];
                        hbVar2.u(bArr, 0, i13);
                        l9Var = new l9(str, bArr, D7, D6);
                        break;
                    }
                    hbVar2.p(o11 + D5);
                }
                if (l9Var != null) {
                    arrayList.add(l9Var);
                }
            } else {
                StringBuilder sb2 = new StringBuilder(52);
                sb2.append("Skipped metadata with unknown key index: ");
                sb2.append(D4);
                Log.w("AtomParsers", sb2.toString());
            }
            hbVar2.p(o10 + D3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new v7(arrayList);
    }

    public static void d(hb hbVar) {
        int o10 = hbVar.o();
        hbVar.s(4);
        if (hbVar.D() != 1751411826) {
            o10 += 4;
        }
        hbVar.p(o10);
    }

    public static int e(hb hbVar) {
        hbVar.p(16);
        return hbVar.D();
    }

    public static int f(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0152  */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(ai.hb r21, int r22, int r23, int r24, int r25, java.lang.String r26, boolean r27, ai.ru3 r28, ai.uy3 r29, int r30) throws com.google.android.gms.internal.ads.zzaha {
        /*
            Method dump skipped, instructions count: 880
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.yy3.g(ai.hb, int, int, int, int, java.lang.String, boolean, ai.ru3, ai.uy3, int):void");
    }

    public static Pair<String, byte[]> h(hb hbVar, int i10) {
        hbVar.p(i10 + 12);
        hbVar.s(1);
        j(hbVar);
        hbVar.s(2);
        int v10 = hbVar.v();
        if ((v10 & 128) != 0) {
            hbVar.s(2);
        }
        if ((v10 & 64) != 0) {
            hbVar.s(hbVar.w());
        }
        if ((v10 & 32) != 0) {
            hbVar.s(2);
        }
        hbVar.s(1);
        j(hbVar);
        String e10 = ua.e(hbVar.v());
        if (!MimeTypes.AUDIO_MPEG.equals(e10) && !MimeTypes.AUDIO_DTS.equals(e10) && !MimeTypes.AUDIO_DTS_HD.equals(e10)) {
            hbVar.s(12);
            hbVar.s(1);
            int j10 = j(hbVar);
            byte[] bArr = new byte[j10];
            hbVar.u(bArr, 0, j10);
            return Pair.create(e10, bArr);
        }
        return Pair.create(e10, null);
    }

    public static Pair<Integer, pz3> i(hb hbVar, int i10, int i11) throws zzaha {
        Integer num;
        pz3 pz3Var;
        Pair<Integer, pz3> create;
        int i12;
        int i13;
        byte[] bArr;
        int o10 = hbVar.o();
        while (o10 - i10 < i11) {
            hbVar.p(o10);
            int D = hbVar.D();
            qv3.a(D > 0, "childAtomSize must be positive");
            if (hbVar.D() == 1936289382) {
                int i14 = o10 + 8;
                int i15 = 0;
                int i16 = -1;
                String str = null;
                Integer num2 = null;
                while (i14 - o10 < D) {
                    hbVar.p(i14);
                    int D2 = hbVar.D();
                    int D3 = hbVar.D();
                    if (D3 == 1718775137) {
                        num2 = Integer.valueOf(hbVar.D());
                    } else if (D3 == 1935894637) {
                        hbVar.s(4);
                        str = hbVar.e(4, zw2.f13232c);
                    } else if (D3 == 1935894633) {
                        i16 = i14;
                        i15 = D2;
                    }
                    i14 += D2;
                }
                if (C.CENC_TYPE_cenc.equals(str) || C.CENC_TYPE_cbc1.equals(str) || C.CENC_TYPE_cens.equals(str) || C.CENC_TYPE_cbcs.equals(str)) {
                    qv3.a(num2 != null, "frma atom is mandatory");
                    qv3.a(i16 != -1, "schi atom is mandatory");
                    int i17 = i16 + 8;
                    while (true) {
                        if (i17 - i16 >= i15) {
                            num = num2;
                            pz3Var = null;
                            break;
                        }
                        hbVar.p(i17);
                        int D4 = hbVar.D();
                        if (hbVar.D() == 1952804451) {
                            int D5 = hbVar.D();
                            hbVar.s(1);
                            if (qy3.a(D5) == 0) {
                                hbVar.s(1);
                                i12 = 0;
                                i13 = 0;
                            } else {
                                int v10 = hbVar.v();
                                i12 = v10 & 15;
                                i13 = (v10 & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                            }
                            boolean z10 = hbVar.v() == 1;
                            int v11 = hbVar.v();
                            byte[] bArr2 = new byte[16];
                            hbVar.u(bArr2, 0, 16);
                            if (z10 && v11 == 0) {
                                int v12 = hbVar.v();
                                byte[] bArr3 = new byte[v12];
                                hbVar.u(bArr3, 0, v12);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            pz3Var = new pz3(z10, str, v11, bArr2, i13, i12, bArr);
                        } else {
                            i17 += D4;
                        }
                    }
                    qv3.a(pz3Var != null, "tenc atom is mandatory");
                    int i18 = sb.f9778a;
                    create = Pair.create(num, pz3Var);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            o10 += D;
        }
        return null;
    }

    public static int j(hb hbVar) {
        int v10 = hbVar.v();
        int i10 = v10 & 127;
        while ((v10 & 128) == 128) {
            v10 = hbVar.v();
            i10 = (i10 << 7) | (v10 & 127);
        }
        return i10;
    }
}
