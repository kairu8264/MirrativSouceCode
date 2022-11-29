package lc;

import com.dena.mirrorman.net.api.response.ThumbnailFrame;

/* loaded from: classes2.dex */
public final class o0 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f39945d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final int f39946a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39947b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f39948c;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final o0 a(ThumbnailFrame thumbnailFrame, int i10) {
            jo.p.h(thumbnailFrame, "thumbnailFrame");
            return new o0(thumbnailFrame.getId(), thumbnailFrame.getIconUrl(), thumbnailFrame.getId() == i10);
        }
    }

    public o0(int i10, String str, boolean z10) {
        jo.p.h(str, "iconUrl");
        this.f39946a = i10;
        this.f39947b = str;
        this.f39948c = z10;
    }

    public final String a() {
        return this.f39947b;
    }

    public final int b() {
        return this.f39946a;
    }

    public final boolean c() {
        return this.f39948c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0) {
            o0 o0Var = (o0) obj;
            return this.f39946a == o0Var.f39946a && jo.p.c(this.f39947b, o0Var.f39947b) && this.f39948c == o0Var.f39948c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f39946a) * 31) + this.f39947b.hashCode()) * 31;
        boolean z10 = this.f39948c;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "ThumbnailFrameBindModel(id=" + this.f39946a + ", iconUrl=" + this.f39947b + ", isSelected=" + this.f39948c + ')';
    }
}
