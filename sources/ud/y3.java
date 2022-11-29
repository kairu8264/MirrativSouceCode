package ud;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* loaded from: classes2.dex */
public final class y3 {

    /* renamed from: e  reason: collision with root package name */
    public static final a f55762e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f55763f = 8;

    /* renamed from: a  reason: collision with root package name */
    public final int f55764a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55765b;

    /* renamed from: c  reason: collision with root package name */
    public final Drawable f55766c;

    /* renamed from: d  reason: collision with root package name */
    public final Drawable f55767d;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final y3 a(Context context, int i10, int i11) {
            jo.p.h(context, "context");
            String string = context.getString(nd.f1.text_shooter_victory_count, String.valueOf(i11));
            jo.p.g(string, "context.getString(R.stri… victoryCount.toString())");
            return new y3(i10, string, c(context, i10), b(context, i10));
        }

        public final Drawable b(Context context, int i10) {
            GradientDrawable gradientDrawable;
            if (i10 == 1) {
                gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, xn.a0.A0(xn.s.m(Integer.valueOf(c3.a.d(context, nd.w0.shooter_victory_level_1_start)), Integer.valueOf(c3.a.d(context, nd.w0.shooter_victory_level_1_middle)), Integer.valueOf(c3.a.d(context, nd.w0.shooter_victory_level_1_end)))));
            } else if (i10 != 2) {
                gradientDrawable = i10 != 3 ? null : new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, xn.a0.A0(xn.s.m(Integer.valueOf(c3.a.d(context, nd.w0.shooter_victory_level_3_start)), Integer.valueOf(c3.a.d(context, nd.w0.shooter_victory_level_3_middle)), Integer.valueOf(c3.a.d(context, nd.w0.shooter_victory_level_3_end)))));
            } else {
                gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, xn.a0.A0(xn.s.m(Integer.valueOf(c3.a.d(context, nd.w0.shooter_victory_level_2_start)), Integer.valueOf(c3.a.d(context, nd.w0.shooter_victory_level_2_middle)), Integer.valueOf(c3.a.d(context, nd.w0.shooter_victory_level_2_end)))));
            }
            if (gradientDrawable != null) {
                gradientDrawable.setCornerRadius(context.getResources().getDimension(nd.x0.shooter_victory_count_radius));
            }
            return gradientDrawable;
        }

        public final Drawable c(Context context, int i10) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return c3.a.f(context, nd.y0.ic_shooter_victory_3);
                }
                return c3.a.f(context, nd.y0.ic_shooter_victory_2);
            }
            return c3.a.f(context, nd.y0.ic_shooter_victory_1);
        }
    }

    public y3(int i10, String str, Drawable drawable, Drawable drawable2) {
        jo.p.h(str, "victoryCountText");
        this.f55764a = i10;
        this.f55765b = str;
        this.f55766c = drawable;
        this.f55767d = drawable2;
    }

    public final Drawable a() {
        return this.f55767d;
    }

    public final String b() {
        return this.f55765b;
    }

    public final Drawable c() {
        return this.f55766c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y3) {
            y3 y3Var = (y3) obj;
            return this.f55764a == y3Var.f55764a && jo.p.c(this.f55765b, y3Var.f55765b) && jo.p.c(this.f55766c, y3Var.f55766c) && jo.p.c(this.f55767d, y3Var.f55767d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f55764a) * 31) + this.f55765b.hashCode()) * 31;
        Drawable drawable = this.f55766c;
        int hashCode2 = (hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.f55767d;
        return hashCode2 + (drawable2 != null ? drawable2.hashCode() : 0);
    }

    public String toString() {
        return "ShooterVictoryCountBindModel(victoryLevel=" + this.f55764a + ", victoryCountText=" + this.f55765b + ", victoryLevelIconDrawable=" + this.f55766c + ", victoryCountBackground=" + this.f55767d + ')';
    }
}
