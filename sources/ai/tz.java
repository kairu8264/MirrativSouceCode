package ai;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class tz extends d00 {
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public final int A;
    public final int B;
    public final int C;
    public final int D;

    /* renamed from: w  reason: collision with root package name */
    public final String f10508w;

    /* renamed from: x  reason: collision with root package name */
    public final List<wz> f10509x = new ArrayList();

    /* renamed from: y  reason: collision with root package name */
    public final List<m00> f10510y = new ArrayList();

    /* renamed from: z  reason: collision with root package name */
    public final int f10511z;

    static {
        int rgb = Color.rgb(12, 174, 206);
        E = rgb;
        int rgb2 = Color.rgb(204, 204, 204);
        F = rgb2;
        G = rgb2;
        H = rgb;
    }

    public tz(String str, List<wz> list, Integer num, Integer num2, Integer num3, int i10, int i11, boolean z10) {
        int i12;
        int i13;
        this.f10508w = str;
        for (int i14 = 0; i14 < list.size(); i14++) {
            wz wzVar = list.get(i14);
            this.f10509x.add(wzVar);
            this.f10510y.add(wzVar);
        }
        if (num != null) {
            i12 = num.intValue();
        } else {
            i12 = G;
        }
        this.f10511z = i12;
        if (num2 != null) {
            i13 = num2.intValue();
        } else {
            i13 = H;
        }
        this.A = i13;
        this.B = num3 != null ? num3.intValue() : 12;
        this.C = i10;
        this.D = i11;
    }

    public final int S5() {
        return this.B;
    }

    public final int T5() {
        return this.C;
    }

    public final int a() {
        return this.A;
    }

    @Override // ai.e00
    public final List<m00> b() {
        return this.f10510y;
    }

    public final int c() {
        return this.f10511z;
    }

    public final List<wz> d() {
        return this.f10509x;
    }

    public final int h() {
        return this.D;
    }

    @Override // ai.e00
    public final String zzb() {
        return this.f10508w;
    }
}
