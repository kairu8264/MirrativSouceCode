package ai;

/* loaded from: classes3.dex */
public final class w9 {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f11514a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f11515b = {"", "A", "B", "C"};

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f11516c = 0;

    public static String a(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static String b(ib ibVar) {
        ibVar.c(24);
        int e10 = ibVar.e(2);
        boolean d10 = ibVar.d();
        int e11 = ibVar.e(5);
        int i10 = 0;
        for (int i11 = 0; i11 < 32; i11++) {
            if (ibVar.d()) {
                i10 |= 1 << i11;
            }
        }
        int i12 = 6;
        int[] iArr = new int[6];
        for (int i13 = 0; i13 < 6; i13++) {
            iArr[i13] = ibVar.e(8);
        }
        int e12 = ibVar.e(8);
        Object[] objArr = new Object[5];
        objArr[0] = f11515b[e10];
        objArr[1] = Integer.valueOf(e11);
        objArr[2] = Integer.valueOf(i10);
        objArr[3] = Character.valueOf(true != d10 ? 'L' : 'H');
        objArr[4] = Integer.valueOf(e12);
        StringBuilder sb2 = new StringBuilder(sb.a0("hvc1.%s%d.%X.%c%d", objArr));
        while (i12 > 0) {
            int i14 = i12 - 1;
            if (iArr[i14] != 0) {
                break;
            }
            i12 = i14;
        }
        for (int i15 = 0; i15 < i12; i15++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i15])));
        }
        return sb2.toString();
    }

    public static byte[] c(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11 + 4];
        System.arraycopy(f11514a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i10, bArr2, 4, i11);
        return bArr2;
    }
}
