package x6;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import f7.d;
import java.util.HashMap;
import java.util.Map;
import y6.i;

/* loaded from: classes.dex */
public class a {

    /* renamed from: d  reason: collision with root package name */
    public final AssetManager f59764d;

    /* renamed from: a  reason: collision with root package name */
    public final i<String> f59761a = new i<>();

    /* renamed from: b  reason: collision with root package name */
    public final Map<i<String>, Typeface> f59762b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Typeface> f59763c = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public String f59765e = ".ttf";

    public a(Drawable.Callback callback, s6.a aVar) {
        if (!(callback instanceof View)) {
            d.c("LottieDrawable must be inside of a view for images to work.");
            this.f59764d = null;
            return;
        }
        this.f59764d = ((View) callback).getContext().getAssets();
    }

    public final Typeface a(String str) {
        Typeface typeface = this.f59763c.get(str);
        if (typeface != null) {
            return typeface;
        }
        Typeface createFromAsset = Typeface.createFromAsset(this.f59764d, "fonts/" + str + this.f59765e);
        this.f59763c.put(str, createFromAsset);
        return createFromAsset;
    }

    public Typeface b(String str, String str2) {
        this.f59761a.b(str, str2);
        Typeface typeface = this.f59762b.get(this.f59761a);
        if (typeface != null) {
            return typeface;
        }
        Typeface d10 = d(a(str), str2);
        this.f59762b.put(this.f59761a, d10);
        return d10;
    }

    public void c(s6.a aVar) {
    }

    public final Typeface d(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i10 = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        return typeface.getStyle() == i10 ? typeface : Typeface.create(typeface, i10);
    }
}
