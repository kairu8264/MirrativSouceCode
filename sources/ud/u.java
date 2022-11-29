package ud;

import android.graphics.Color;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarGradientColor;

/* loaded from: classes2.dex */
public final class u implements o {

    /* renamed from: h  reason: collision with root package name */
    public static final a f55546h = new a(null);

    /* renamed from: i  reason: collision with root package name */
    public static final int f55547i = 8;

    /* renamed from: a  reason: collision with root package name */
    public final int f55548a;

    /* renamed from: b  reason: collision with root package name */
    public final int f55549b;

    /* renamed from: c  reason: collision with root package name */
    public final int f55550c;

    /* renamed from: d  reason: collision with root package name */
    public final int f55551d;

    /* renamed from: e  reason: collision with root package name */
    public final float f55552e;

    /* renamed from: f  reason: collision with root package name */
    public final jf.k0 f55553f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f55554g;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public static /* synthetic */ u b(a aVar, ClosetAvatarGradientColor closetAvatarGradientColor, jf.k0 k0Var, boolean z10, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            return aVar.a(closetAvatarGradientColor, k0Var, z10);
        }

        public final u a(ClosetAvatarGradientColor closetAvatarGradientColor, jf.k0 k0Var, boolean z10) {
            jo.p.h(closetAvatarGradientColor, "closetAvatarGradientColor");
            jo.p.h(k0Var, "partsCategory");
            return new u(closetAvatarGradientColor.getId(), closetAvatarGradientColor.getStarColor(), closetAvatarGradientColor.getStart(), closetAvatarGradientColor.getEnd(), closetAvatarGradientColor.getPercentage(), k0Var, z10);
        }
    }

    public u(int i10, int i11, int i12, int i13, float f10, jf.k0 k0Var, boolean z10) {
        jo.p.h(k0Var, "partsCategory");
        this.f55548a = i10;
        this.f55549b = i11;
        this.f55550c = i12;
        this.f55551d = i13;
        this.f55552e = f10;
        this.f55553f = k0Var;
        this.f55554g = z10;
    }

    @Override // ud.o
    public void a(boolean z10) {
        this.f55554g = z10;
    }

    @Override // ud.o
    public int b() {
        return this.f55549b;
    }

    @Override // ud.o
    public boolean c() {
        return this.f55554g;
    }

    public final int d() {
        return (((int) (((Color.red(this.f55550c) - Color.red(this.f55551d)) * 0.5d) + Color.red(this.f55551d))) << 16) | (-16777216) | (((int) (((Color.green(this.f55550c) - Color.green(this.f55551d)) * 0.5d) + Color.green(this.f55551d))) << 8) | ((int) (((Color.blue(this.f55550c) - Color.blue(this.f55551d)) * 0.5d) + Color.blue(this.f55551d)));
    }

    public final int e() {
        return this.f55551d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            return getId() == uVar.getId() && b() == uVar.b() && this.f55550c == uVar.f55550c && this.f55551d == uVar.f55551d && jo.p.c(Float.valueOf(this.f55552e), Float.valueOf(uVar.f55552e)) && this.f55553f == uVar.f55553f && c() == uVar.c();
        }
        return false;
    }

    public final jf.k0 f() {
        return this.f55553f;
    }

    public final float g() {
        return this.f55552e;
    }

    @Override // ud.o
    public int getId() {
        return this.f55548a;
    }

    public final int h() {
        return this.f55550c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    public int hashCode() {
        int hashCode = ((((((((((Integer.hashCode(getId()) * 31) + Integer.hashCode(b())) * 31) + Integer.hashCode(this.f55550c)) * 31) + Integer.hashCode(this.f55551d)) * 31) + Float.hashCode(this.f55552e)) * 31) + this.f55553f.hashCode()) * 31;
        boolean c10 = c();
        ?? r12 = c10;
        if (c10) {
            r12 = 1;
        }
        return hashCode + r12;
    }

    public String toString() {
        return "ColorPaletteBindModel(id=" + getId() + ", color=" + b() + ", start=" + this.f55550c + ", end=" + this.f55551d + ", percentage=" + this.f55552e + ", partsCategory=" + this.f55553f + ", selected=" + c() + ')';
    }
}
