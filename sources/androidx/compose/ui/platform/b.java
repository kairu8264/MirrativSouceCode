package androidx.compose.ui.platform;

/* loaded from: classes.dex */
public abstract class b implements g {

    /* renamed from: a  reason: collision with root package name */
    public String f14379a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f14380b = new int[2];

    public final int[] c(int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i10 == i11) {
            return null;
        }
        int[] iArr = this.f14380b;
        iArr[0] = i10;
        iArr[1] = i11;
        return iArr;
    }

    public final String d() {
        String str = this.f14379a;
        if (str != null) {
            return str;
        }
        jo.p.v("text");
        return null;
    }

    public void e(String str) {
        jo.p.h(str, "text");
        f(str);
    }

    public final void f(String str) {
        jo.p.h(str, "<set-?>");
        this.f14379a = str;
    }
}
