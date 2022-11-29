package v8;

import androidx.fragment.app.Fragment;
import t8.e0;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final String f56959a;

    /* renamed from: b  reason: collision with root package name */
    public final Fragment f56960b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f56961c;

    /* renamed from: d  reason: collision with root package name */
    public final e0 f56962d;

    /* renamed from: e  reason: collision with root package name */
    public final int f56963e;

    /* renamed from: f  reason: collision with root package name */
    public final int f56964f;

    public o(String str, Fragment fragment, boolean z10, e0 e0Var, int i10, int i11) {
        jo.p.h(str, "title");
        jo.p.h(fragment, "fragment");
        jo.p.h(e0Var, "tabBinding");
        this.f56959a = str;
        this.f56960b = fragment;
        this.f56961c = z10;
        this.f56962d = e0Var;
        this.f56963e = i10;
        this.f56964f = i11;
    }

    public final Fragment a() {
        return this.f56960b;
    }

    public final int b() {
        return this.f56963e;
    }

    public final e0 c() {
        return this.f56962d;
    }

    public final String d() {
        return this.f56959a;
    }

    public final int e() {
        return this.f56964f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return jo.p.c(this.f56959a, oVar.f56959a) && jo.p.c(this.f56960b, oVar.f56960b) && this.f56961c == oVar.f56961c && jo.p.c(this.f56962d, oVar.f56962d) && this.f56963e == oVar.f56963e && this.f56964f == oVar.f56964f;
        }
        return false;
    }

    public final boolean f() {
        return this.f56961c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f56959a.hashCode() * 31) + this.f56960b.hashCode()) * 31;
        boolean z10 = this.f56961c;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((((((hashCode + i10) * 31) + this.f56962d.hashCode()) * 31) + Integer.hashCode(this.f56963e)) * 31) + Integer.hashCode(this.f56964f);
    }

    public String toString() {
        return "GroupShotGalleryTabBindModel(title=" + this.f56959a + ", fragment=" + this.f56960b + ", isSelected=" + this.f56961c + ", tabBinding=" + this.f56962d + ", selectedDrawableRes=" + this.f56963e + ", unselectedDrawableRes=" + this.f56964f + ')';
    }
}
