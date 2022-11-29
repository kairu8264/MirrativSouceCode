package yg;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.webkit.WebSettings;

@TargetApi(17)
/* loaded from: classes3.dex */
public class f2 extends e {
    public f2() {
        super(null);
    }

    @Override // yg.e
    public final boolean a(Context context, WebSettings webSettings) {
        super.a(context, webSettings);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }

    @Override // yg.e
    public final String b(Context context) {
        String str;
        j1 a10 = j1.a();
        if (TextUtils.isEmpty(a10.f61906a)) {
            if (vh.e.a()) {
                str = (String) g1.a(context, new h1(a10, context));
            } else {
                str = (String) g1.a(context, new i1(a10, nh.g.c(context), context));
            }
            a10.f61906a = str;
        }
        return a10.f61906a;
    }

    @Override // yg.e
    public final void c(Context context) {
        j1 a10 = j1.a();
        p1.k("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(a10.f61906a)) {
            Context c10 = nh.g.c(context);
            if (!vh.e.a()) {
                if (c10 == null) {
                    c10 = null;
                }
                a10.f61906a = defaultUserAgent;
            }
            SharedPreferences.Editor putString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
            if (c10 == null) {
                putString.apply();
            } else {
                vh.q.a(context, putString, "admob_user_agent");
            }
            a10.f61906a = defaultUserAgent;
        }
        p1.k("User agent is updated.");
    }

    @Override // yg.e
    public final Drawable d(Context context, Bitmap bitmap, boolean z10, float f10) {
        if (z10 && f10 > 0.0f && f10 <= 25.0f) {
            try {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
                Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
                RenderScript create = RenderScript.create(context);
                ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
                Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
                create2.setRadius(f10);
                create2.setInput(createFromBitmap);
                create2.forEach(createFromBitmap2);
                createFromBitmap2.copyTo(createBitmap);
                return new BitmapDrawable(context.getResources(), createBitmap);
            } catch (RuntimeException unused) {
                return new BitmapDrawable(context.getResources(), bitmap);
            }
        }
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    @Override // yg.e
    public final int e(ContentResolver contentResolver) {
        return Settings.Global.getInt(contentResolver, "wifi_on", 0);
    }

    @Override // yg.e
    public final int f(ContentResolver contentResolver) {
        return Settings.Global.getInt(contentResolver, "airplane_mode_on", 0);
    }
}
