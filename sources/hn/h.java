package hn;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* loaded from: classes4.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public static int[] f36169a = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};

    public static int a(int i10) {
        return f36169a[i10];
    }

    public static void b(c cVar, int[] iArr, int[] iArr2, q qVar) throws n {
        int i10;
        int n10;
        int n11;
        int i11 = 0;
        while (i11 < iArr2.length) {
            int e10 = qVar.e(cVar, iArr);
            if (e10 >= 0 && e10 <= 15) {
                iArr2[i11] = e10;
            } else {
                switch (e10) {
                    case 16:
                        i10 = iArr2[i11 - 1];
                        n10 = cVar.n(iArr, 2) + 3;
                        break;
                    case 17:
                        n11 = cVar.n(iArr, 3) + 3;
                        n10 = n11;
                        i10 = 0;
                        break;
                    case 18:
                        n11 = cVar.n(iArr, 7) + 11;
                        n10 = n11;
                        i10 = 0;
                        break;
                    default:
                        throw new n(String.format("[%s] Bad code length '%d' at the bit index '%d'.", h.class.getSimpleName(), Integer.valueOf(e10), iArr));
                }
                for (int i12 = 0; i12 < n10; i12++) {
                    iArr2[i11 + i12] = i10;
                }
                i11 += n10 - 1;
            }
            i11++;
        }
    }

    public static int c(c cVar, int[] iArr, q qVar) throws n {
        int i10;
        int e10 = qVar.e(cVar, iArr);
        int i11 = 12;
        int i12 = 13;
        switch (e10) {
            case 0:
            case 1:
            case 2:
            case 3:
                return e10 + 1;
            case 4:
                i12 = 5;
                i11 = 1;
                break;
            case 5:
                i12 = 7;
                i11 = 1;
                break;
            case 6:
                i11 = 2;
                i12 = 9;
                break;
            case 7:
                i11 = 2;
                break;
            case 8:
                i12 = 17;
                i11 = 3;
                break;
            case 9:
                i12 = 25;
                i11 = 3;
                break;
            case 10:
                i12 = 33;
                i11 = 4;
                break;
            case 11:
                i12 = 49;
                i11 = 4;
                break;
            case 12:
                i12 = 65;
                i11 = 5;
                break;
            case 13:
                i12 = 97;
                i11 = 5;
                break;
            case 14:
                i12 = TsExtractor.TS_STREAM_TYPE_AC3;
                i11 = 6;
                break;
            case 15:
                i12 = 193;
                i11 = 6;
                break;
            case 16:
                i12 = TsExtractor.TS_STREAM_TYPE_AIT;
                i11 = 7;
                break;
            case 17:
                i12 = 385;
                i11 = 7;
                break;
            case 18:
                i12 = 513;
                i11 = 8;
                break;
            case 19:
                i12 = 769;
                i11 = 8;
                break;
            case 20:
                i12 = AnalyticsListener.EVENT_VIDEO_DISABLED;
                i11 = 9;
                break;
            case 21:
                i12 = 1537;
                i11 = 9;
                break;
            case 22:
                i12 = 2049;
                i11 = 10;
                break;
            case 23:
                i12 = 3073;
                i11 = 10;
                break;
            case 24:
                i12 = 4097;
                i11 = 11;
                break;
            case 25:
                i12 = 6145;
                i11 = 11;
                break;
            case 26:
                i12 = 8193;
                break;
            case 27:
                i12 = 12289;
                break;
            case 28:
                i10 = 16385;
                i11 = 13;
                i12 = i10;
                break;
            case 29:
                i10 = 24577;
                i11 = 13;
                i12 = i10;
                break;
            default:
                throw new n(String.format("[%s] Bad distance code '%d' at the bit index '%d'.", h.class.getSimpleName(), Integer.valueOf(e10), Integer.valueOf(iArr[0])));
        }
        return i12 + cVar.n(iArr, i11);
    }

    public static void d(c cVar, int[] iArr, q[] qVarArr) throws n {
        int n10 = cVar.n(iArr, 5) + TsExtractor.TS_STREAM_TYPE_AIT;
        int n11 = cVar.n(iArr, 5) + 1;
        int n12 = cVar.n(iArr, 4) + 4;
        int[] iArr2 = new int[19];
        for (int i10 = 0; i10 < n12; i10++) {
            iArr2[a(i10)] = (byte) cVar.n(iArr, 3);
        }
        q qVar = new q(iArr2);
        int[] iArr3 = new int[n10];
        b(cVar, iArr, iArr3, qVar);
        q qVar2 = new q(iArr3);
        int[] iArr4 = new int[n11];
        b(cVar, iArr, iArr4, qVar);
        q qVar3 = new q(iArr4);
        qVarArr[0] = qVar2;
        qVarArr[1] = qVar3;
    }

    public static int e(c cVar, int[] iArr, int i10) throws n {
        int i11;
        int i12 = 5;
        switch (i10) {
            case TsExtractor.TS_STREAM_TYPE_AIT /* 257 */:
            case 258:
            case 259:
            case 260:
            case 261:
            case 262:
            case 263:
            case 264:
                return i10 - 254;
            case 265:
                i11 = 11;
                i12 = 1;
                break;
            case 266:
                i11 = 13;
                i12 = 1;
                break;
            case 267:
                i11 = 15;
                i12 = 1;
                break;
            case 268:
                i11 = 17;
                i12 = 1;
                break;
            case 269:
                i11 = 19;
                i12 = 2;
                break;
            case 270:
                i11 = 23;
                i12 = 2;
                break;
            case 271:
                i11 = 27;
                i12 = 2;
                break;
            case 272:
                i11 = 31;
                i12 = 2;
                break;
            case 273:
                i11 = 35;
                i12 = 3;
                break;
            case 274:
                i11 = 43;
                i12 = 3;
                break;
            case 275:
                i11 = 51;
                i12 = 3;
                break;
            case 276:
                i11 = 59;
                i12 = 3;
                break;
            case 277:
                i11 = 67;
                i12 = 4;
                break;
            case 278:
                i11 = 83;
                i12 = 4;
                break;
            case 279:
                i11 = 99;
                i12 = 4;
                break;
            case 280:
                i11 = 115;
                i12 = 4;
                break;
            case 281:
                i11 = 131;
                break;
            case 282:
                i11 = 163;
                break;
            case 283:
                i11 = 195;
                break;
            case 284:
                i11 = 227;
                break;
            case 285:
                return 258;
            default:
                throw new n(String.format("[%s] Bad literal/length code '%d' at the bit index '%d'.", h.class.getSimpleName(), Integer.valueOf(i10), Integer.valueOf(iArr[0])));
        }
        return i11 + cVar.n(iArr, i12);
    }
}
