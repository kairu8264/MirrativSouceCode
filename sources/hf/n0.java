package hf;

import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes2.dex */
public final class n0 {
    @ym.c(TtmlNode.ATTR_ID)

    /* renamed from: a  reason: collision with root package name */
    private final int f35566a;
    @ym.c("s")

    /* renamed from: b  reason: collision with root package name */
    private int f35567b;
    @ym.c(TtmlNode.TAG_P)

    /* renamed from: c  reason: collision with root package name */
    private int f35568c;

    public n0(int i10, int i11, int i12) {
        this.f35566a = i10;
        this.f35567b = i11;
        this.f35568c = i12;
    }

    public final int a() {
        return this.f35566a;
    }

    public final int b() {
        return this.f35568c;
    }

    public final int c() {
        return this.f35567b;
    }

    public final void d(int i10) {
        this.f35568c = i10;
    }

    public final void e(int i10) {
        this.f35567b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n0) {
            n0 n0Var = (n0) obj;
            return this.f35566a == n0Var.f35566a && this.f35567b == n0Var.f35567b && this.f35568c == n0Var.f35568c;
        }
        return false;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f35566a) * 31) + Integer.hashCode(this.f35567b)) * 31) + Integer.hashCode(this.f35568c);
    }

    public String toString() {
        return "SongSetting(karaokeId=" + this.f35566a + ", speed=" + this.f35567b + ", pitch=" + this.f35568c + ')';
    }
}
