package ai;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class yi1 {

    /* renamed from: a  reason: collision with root package name */
    public final yg.s0 f12619a;

    /* renamed from: b  reason: collision with root package name */
    public final vh.f f12620b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f12621c;

    public yi1(yg.s0 s0Var, vh.f fVar, Executor executor) {
        this.f12619a = s0Var;
        this.f12620b = fVar;
        this.f12621c = executor;
    }

    public static /* synthetic */ Bitmap b(yi1 yi1Var, byte[] bArr, double d10, boolean z10) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d10 * 160.0d);
        if (!z10) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) ft.c().c(ox.f8105u4)).booleanValue()) {
            options.inJustDecodeBounds = true;
            yi1Var.c(bArr, options);
            options.inJustDecodeBounds = false;
            int i10 = options.outWidth * options.outHeight;
            if (i10 > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i10 - 1) / ((Integer) ft.c().c(ox.f8113v4)).intValue())) / 2);
            }
        }
        return yi1Var.c(bArr, options);
    }

    public final s43<Bitmap> a(String str, double d10, boolean z10) {
        return j43.j(this.f12619a.a(str), new xi1(this, d10, z10), this.f12621c);
    }

    public final Bitmap c(byte[] bArr, BitmapFactory.Options options) {
        long elapsedRealtime = this.f12620b.elapsedRealtime();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long elapsedRealtime2 = this.f12620b.elapsedRealtime();
        if (Build.VERSION.SDK_INT >= 19 && decodeByteArray != null) {
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            long j10 = elapsedRealtime2 - elapsedRealtime;
            boolean z10 = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb2 = new StringBuilder(108);
            sb2.append("Decoded image w: ");
            sb2.append(width);
            sb2.append(" h:");
            sb2.append(height);
            sb2.append(" bytes: ");
            sb2.append(allocationByteCount);
            sb2.append(" time: ");
            sb2.append(j10);
            sb2.append(" on ui thread: ");
            sb2.append(z10);
            yg.p1.k(sb2.toString());
        }
        return decodeByteArray;
    }
}
