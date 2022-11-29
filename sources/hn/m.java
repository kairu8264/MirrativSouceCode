package hn;

/* loaded from: classes4.dex */
public class m extends q {

    /* renamed from: e  reason: collision with root package name */
    public static final m f36205e = new m();

    public m() {
        super(f());
    }

    public static int[] f() {
        int[] iArr = new int[288];
        int i10 = 0;
        while (i10 < 144) {
            iArr[i10] = 8;
            i10++;
        }
        while (i10 < 256) {
            iArr[i10] = 9;
            i10++;
        }
        while (i10 < 280) {
            iArr[i10] = 7;
            i10++;
        }
        while (i10 < 288) {
            iArr[i10] = 8;
            i10++;
        }
        return iArr;
    }

    public static m g() {
        return f36205e;
    }
}
