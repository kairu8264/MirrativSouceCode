package p7;

/* loaded from: classes.dex */
public final class i implements a<int[]> {
    @Override // p7.a
    public int a() {
        return 4;
    }

    @Override // p7.a
    /* renamed from: c */
    public int b(int[] iArr) {
        return iArr.length;
    }

    @Override // p7.a
    /* renamed from: d */
    public int[] newArray(int i10) {
        return new int[i10];
    }

    @Override // p7.a
    public String getTag() {
        return "IntegerArrayPool";
    }
}
