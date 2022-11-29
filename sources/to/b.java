package to;

import java.text.DecimalFormat;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f53891a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<DecimalFormat>[] f53892b;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i10 = 0; i10 < 4; i10++) {
            threadLocalArr[i10] = new ThreadLocal<>();
        }
        f53892b = threadLocalArr;
    }

    public static final boolean a() {
        return f53891a;
    }
}
