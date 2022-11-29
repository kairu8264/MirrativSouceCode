package ai;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class vr1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11165a;

    /* renamed from: b  reason: collision with root package name */
    public final ApplicationInfo f11166b;

    /* renamed from: e  reason: collision with root package name */
    public String f11169e = "";

    /* renamed from: c  reason: collision with root package name */
    public final int f11167c = ((Integer) ft.c().c(ox.C6)).intValue();

    /* renamed from: d  reason: collision with root package name */
    public final int f11168d = ((Integer) ft.c().c(ox.D6)).intValue();

    public vr1(Context context) {
        this.f11165a = context;
        this.f11166b = context.getApplicationInfo();
    }

    public final JSONObject a() throws JSONException {
        Drawable drawable;
        String encodeToString;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", xh.c.a(this.f11165a).d(this.f11166b.packageName));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.f11166b.packageName);
        wg.t.d();
        jSONObject.put("adMobAppId", yg.d2.c0(this.f11165a));
        if (this.f11169e.isEmpty()) {
            try {
                drawable = xh.c.a(this.f11165a).e(this.f11166b.packageName).f41560b;
            } catch (PackageManager.NameNotFoundException unused2) {
                drawable = null;
            }
            if (drawable == null) {
                encodeToString = "";
            } else {
                drawable.setBounds(0, 0, this.f11167c, this.f11168d);
                Bitmap createBitmap = Bitmap.createBitmap(this.f11167c, this.f11168d, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f11169e = encodeToString;
        }
        if (!this.f11169e.isEmpty()) {
            jSONObject.put("icon", this.f11169e);
            jSONObject.put("iconWidthPx", this.f11167c);
            jSONObject.put("iconHeightPx", this.f11168d);
        }
        return jSONObject;
    }
}
