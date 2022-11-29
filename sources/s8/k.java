package s8;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.PaintDrawable;
import com.dena.mirrorman.net.api.response.live.CatalogRecommend;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jo.p;
import xn.a0;
import xn.t;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: e  reason: collision with root package name */
    public static final a f52420e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f52421f = 8;

    /* renamed from: a  reason: collision with root package name */
    public final String f52422a;

    /* renamed from: b  reason: collision with root package name */
    public final String f52423b;

    /* renamed from: c  reason: collision with root package name */
    public final int f52424c;

    /* renamed from: d  reason: collision with root package name */
    public final Drawable f52425d;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final k a(CatalogRecommend catalogRecommend) {
            Drawable paintDrawable;
            p.h(catalogRecommend, "recommend");
            String text = catalogRecommend.getText();
            String iconUrl = catalogRecommend.getIconUrl();
            int parseColor = Color.parseColor('#' + catalogRecommend.getTextColor());
            List<String> backgroundColor = catalogRecommend.getBackgroundColor();
            ArrayList arrayList = new ArrayList(t.u(backgroundColor, 10));
            Iterator<T> it = backgroundColor.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(Color.parseColor('#' + ((String) it.next()))));
            }
            if (arrayList.size() >= 2) {
                paintDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, a0.A0(arrayList));
            } else {
                paintDrawable = new PaintDrawable(((Number) a0.X(arrayList)).intValue());
            }
            return new k(text, iconUrl, parseColor, paintDrawable);
        }
    }

    public k(String str, String str2, int i10, Drawable drawable) {
        p.h(str, "text");
        p.h(str2, "iconUrl");
        p.h(drawable, "backgroundDrawable");
        this.f52422a = str;
        this.f52423b = str2;
        this.f52424c = i10;
        this.f52425d = drawable;
    }

    public final Drawable a() {
        return this.f52425d;
    }

    public final String b() {
        return this.f52423b;
    }

    public final String c() {
        return this.f52422a;
    }

    public final int d() {
        return this.f52424c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return p.c(this.f52422a, kVar.f52422a) && p.c(this.f52423b, kVar.f52423b) && this.f52424c == kVar.f52424c && p.c(this.f52425d, kVar.f52425d);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f52422a.hashCode() * 31) + this.f52423b.hashCode()) * 31) + Integer.hashCode(this.f52424c)) * 31) + this.f52425d.hashCode();
    }

    public String toString() {
        return "CatalogRecommendBindModel(text=" + this.f52422a + ", iconUrl=" + this.f52423b + ", textColor=" + this.f52424c + ", backgroundDrawable=" + this.f52425d + ')';
    }
}
