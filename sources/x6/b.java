package x6;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import f7.d;
import f7.h;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import s6.g;

/* loaded from: classes.dex */
public class b {

    /* renamed from: e  reason: collision with root package name */
    public static final Object f59766e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Context f59767a;

    /* renamed from: b  reason: collision with root package name */
    public final String f59768b;

    /* renamed from: c  reason: collision with root package name */
    public s6.b f59769c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, g> f59770d;

    public b(Drawable.Callback callback, String str, s6.b bVar, Map<String, g> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.f59768b = str + '/';
        } else {
            this.f59768b = str;
        }
        if (!(callback instanceof View)) {
            d.c("LottieDrawable must be inside of a view for images to work.");
            this.f59770d = new HashMap();
            this.f59767a = null;
            return;
        }
        this.f59767a = ((View) callback).getContext();
        this.f59770d = map;
        d(bVar);
    }

    public Bitmap a(String str) {
        g gVar = this.f59770d.get(str);
        if (gVar == null) {
            return null;
        }
        Bitmap a10 = gVar.a();
        if (a10 != null) {
            return a10;
        }
        s6.b bVar = this.f59769c;
        if (bVar != null) {
            Bitmap a11 = bVar.a(gVar);
            if (a11 != null) {
                c(str, a11);
            }
            return a11;
        }
        String c10 = gVar.c();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (c10.startsWith("data:") && c10.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(c10.substring(c10.indexOf(44) + 1), 0);
                return c(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException e10) {
                d.d("data URL did not have correct base64 format.", e10);
                return null;
            }
        }
        try {
            if (!TextUtils.isEmpty(this.f59768b)) {
                AssetManager assets = this.f59767a.getAssets();
                try {
                    return c(str, h.l(BitmapFactory.decodeStream(assets.open(this.f59768b + c10), null, options), gVar.f(), gVar.d()));
                } catch (IllegalArgumentException e11) {
                    d.d("Unable to decode image.", e11);
                    return null;
                }
            }
            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
        } catch (IOException e12) {
            d.d("Unable to open asset.", e12);
            return null;
        }
    }

    public boolean b(Context context) {
        return (context == null && this.f59767a == null) || this.f59767a.equals(context);
    }

    public final Bitmap c(String str, Bitmap bitmap) {
        synchronized (f59766e) {
            this.f59770d.get(str).g(bitmap);
        }
        return bitmap;
    }

    public void d(s6.b bVar) {
        this.f59769c = bVar;
    }
}
