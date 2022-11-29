package u1;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public enum b {
    Copy(0),
    Paste(1),
    Cut(2),
    SelectAll(3);
    

    /* renamed from: id  reason: collision with root package name */
    private final int f54267id;
    private final int order;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f54268a;

        static {
            int[] iArr = new int[b.values().length];
            iArr[b.Copy.ordinal()] = 1;
            iArr[b.Paste.ordinal()] = 2;
            iArr[b.Cut.ordinal()] = 3;
            iArr[b.SelectAll.ordinal()] = 4;
            f54268a = iArr;
        }
    }

    b(int i10) {
        this.f54267id = i10;
        this.order = i10;
    }

    public final int c() {
        return this.f54267id;
    }

    public final int e() {
        return this.order;
    }

    public final int h() {
        int i10 = a.f54268a[ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return 17039373;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return 17039363;
            }
            return 17039371;
        }
        return 17039361;
    }
}
