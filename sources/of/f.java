package of;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.widget.ImageView;
import java.io.File;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f45394a = new f();

    public final File a(Context context, Uri uri) {
        String str;
        Cursor query;
        jo.p.h(context, "context");
        if (uri == null) {
            return null;
        }
        String scheme = uri.getScheme();
        if (jo.p.c("file", scheme)) {
            str = uri.getPath();
        } else if (!jo.p.c("content", scheme) || (query = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null)) == null) {
            str = null;
        } else {
            query.moveToFirst();
            String string = query.getString(0);
            query.close();
            str = string;
        }
        if (str == null) {
            return null;
        }
        return new File(str);
    }

    public final Bitmap b(Bitmap bitmap, int i10, int i11) {
        jo.p.h(bitmap, "bitmap");
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int min = Math.min(i10, i11);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, min, min);
        RectF rectF = new RectF(rect);
        float f10 = min / 2;
        int min2 = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Rect rect2 = new Rect(0, 0, min2, min2);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawRoundRect(rectF, f10, f10, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect2, rect, paint);
        jo.p.g(createBitmap, "output");
        return createBitmap;
    }

    public final void c(Context context, String str, ImageView imageView) {
        jo.p.h(context, "context");
        if (vp.b.a(str)) {
            return;
        }
        jo.p.e(imageView);
        com.bumptech.glide.c.B(context.getApplicationContext()).m15load(str).diskCacheStrategy(o7.j.f44188d).into(imageView);
    }
}
